package defpackage;

import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cr extends a {
    public static final /* synthetic */ int i = 0;
    public long f;
    public boolean g;
    public z6 h;

    public final void h(boolean z) {
        long j = this.f - (z ? 4294967296L : 1L);
        this.f = j;
        if (j <= 0 && this.g) {
            shutdown();
        }
    }

    public final void l(um umVar) {
        z6 z6Var = this.h;
        if (z6Var == null) {
            z6Var = new z6();
            this.h = z6Var;
        }
        z6Var.addLast(umVar);
    }

    public final void n(boolean z) {
        this.f = (z ? 4294967296L : 1L) + this.f;
        if (z) {
            return;
        }
        this.g = true;
    }

    public abstract long o();

    public final boolean s() {
        z6 z6Var = this.h;
        if (z6Var == null) {
            return false;
        }
        um umVar = (um) (z6Var.isEmpty() ? null : z6Var.removeFirst());
        if (umVar == null) {
            return false;
        }
        umVar.run();
        return true;
    }

    public abstract void shutdown();
}
