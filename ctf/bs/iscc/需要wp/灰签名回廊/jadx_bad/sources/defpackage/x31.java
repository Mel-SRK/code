package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x31 extends i70 implements l20 {
    public int r;
    public x10 s;

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        lf0 lf0VarE = k60Var.e(eh.a(this.r != 1 ? 0 : dh.j(j), dh.h(j), this.r == 2 ? dh.i(j) : 0, dh.g(j)));
        int iT = i60.t(lf0VarE.d, dh.j(j), dh.h(j));
        int iT2 = i60.t(lf0VarE.e, dh.i(j), dh.g(j));
        return r60Var.av(iT, iT2, sq.d, new w31(this, iT, lf0VarE, iT2, r60Var));
    }
}
