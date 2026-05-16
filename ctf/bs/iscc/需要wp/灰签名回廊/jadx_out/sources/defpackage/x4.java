package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ x4(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    z4 z4Var = new z4(choreographer, d41.t(looperMyLooper));
                    return pk.an(z4Var, z4Var.o);
                }
                wc.q("no Looper on this thread");
                return null;
            default:
                return new os();
        }
    }
}
