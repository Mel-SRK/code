package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ z4 d;

    public y4(z4 z4Var) {
        this.d = z4Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.g.removeCallbacks(this);
        z4.h(this.d);
        z4 z4Var = this.d;
        synchronized (z4Var.h) {
            if (z4Var.m) {
                z4Var.m = false;
                ArrayList arrayList = z4Var.j;
                z4Var.j = z4Var.k;
                z4Var.k = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        z4.h(this.d);
        z4 z4Var = this.d;
        synchronized (z4Var.h) {
            if (z4Var.j.isEmpty()) {
                z4Var.f.removeFrameCallback(this);
                z4Var.m = false;
            }
        }
    }
}
