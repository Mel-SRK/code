package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f70 extends i70 implements kg, l20 {
    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        float f = ((mn) i60.ab(this, zz.a)).d;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        lf0 lf0VarE = k60Var.e(j);
        boolean z = this.q && !Float.isNaN(f) && Float.compare(f, f2) > 0;
        int iAi = Float.isNaN(f) ? 0 : r60Var.ai(f);
        int iMax = lf0VarE.d;
        if (z) {
            iMax = Math.max(iMax, iAi);
        }
        int iMax2 = lf0VarE.e;
        if (z) {
            iMax2 = Math.max(iMax2, iAi);
        }
        return r60Var.av(iMax, iMax2, sq.d, new e70(iMax, lf0VarE, iMax2));
    }
}
