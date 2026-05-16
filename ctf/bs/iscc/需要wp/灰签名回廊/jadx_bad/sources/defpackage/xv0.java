package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 implements jn0 {
    public final /* synthetic */ jn0 a;
    public final km b;
    public final km c;

    public xv0(jn0 jn0Var, zv0 zv0Var) {
        this.a = jn0Var;
        this.b = bo0.f(new wv0(zv0Var, 1));
        this.c = bo0.f(new wv0(zv0Var, 0));
    }

    @Override // defpackage.jn0
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.jn0
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.jn0
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.jn0
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // defpackage.jn0
    public final Object e(int i, w8 w8Var, ki kiVar) {
        return this.a.e(i, w8Var, kiVar);
    }
}
