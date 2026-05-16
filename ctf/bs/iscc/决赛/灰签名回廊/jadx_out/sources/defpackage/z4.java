package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends a {
    public static final au0 p = new au0(u1.m);
    public static final x4 q = new x4(0);
    public final Choreographer f;
    public final Handler g;
    public boolean l;
    public boolean m;
    public final b5 o;
    public final Object h = new Object();
    public final z6 i = new z6();
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public final y4 n = new y4(this);

    public z4(Choreographer choreographer, Handler handler) {
        this.f = choreographer;
        this.g = handler;
        this.o = new b5(choreographer, this);
    }

    public static final void h(z4 z4Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (z4Var.h) {
                z6 z6Var = z4Var.i;
                runnable = (Runnable) (z6Var.isEmpty() ? null : z6Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (z4Var.h) {
                    z6 z6Var2 = z4Var.i;
                    runnable = (Runnable) (z6Var2.isEmpty() ? null : z6Var2.removeFirst());
                }
            }
            synchronized (z4Var.h) {
                if (z4Var.i.isEmpty()) {
                    z = false;
                    z4Var.l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        synchronized (this.h) {
            this.i.addLast(runnable);
            if (!this.l) {
                this.l = true;
                this.g.post(this.n);
                if (!this.m) {
                    this.m = true;
                    this.f.postFrameCallback(this.n);
                }
            }
        }
    }
}
