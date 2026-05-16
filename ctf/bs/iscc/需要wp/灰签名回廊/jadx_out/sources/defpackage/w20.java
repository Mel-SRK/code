package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w20 extends i70 implements ne0 {
    public float r;
    public boolean s;

    @Override // defpackage.ne0
    public final Object bb(Object obj) {
        cl0 cl0Var = obj instanceof cl0 ? (cl0) obj : null;
        if (cl0Var == null) {
            cl0Var = new cl0();
            cl0Var.a = 0.0f;
            cl0Var.b = true;
        }
        cl0Var.a = this.r;
        cl0Var.b = this.s;
        return cl0Var;
    }
}
