package defpackage;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class n01 implements m01 {
    public final Object a;

    public n01(float f, float f2, w5 w5Var) {
        this.a = new a0(w5Var != null ? new bu(f, f2, w5Var) : new bu(f, f2));
    }

    @Override // defpackage.m01, defpackage.l01
    public boolean a() {
        ((a0) this.a).getClass();
        return false;
    }

    @Override // defpackage.l01
    public w5 i(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.a).i(j, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.l01
    public w5 k(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.a).k(j, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.l01
    public w5 l(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.a).l(w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.l01
    public long n(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.a).n(w5Var, w5Var2, w5Var3);
    }

    public n01(ViewStructure viewStructure) {
        this.a = viewStructure;
    }
}
