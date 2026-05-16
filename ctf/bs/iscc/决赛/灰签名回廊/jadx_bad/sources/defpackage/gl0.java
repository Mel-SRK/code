package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends i70 implements l20, sy0 {
    public jz r;
    public final a2 s;

    public gl0(jz jzVar) {
        this.r = jzVar;
        this.s = new a2(16, this, jzVar);
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        lf0 lf0VarE = k60Var.e(j);
        return r60Var.m(lf0VarE.d, lf0VarE.e, sq.d, this.s, new d4(lf0VarE, 4));
    }

    @Override // defpackage.sy0
    public final Object p() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
