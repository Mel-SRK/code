package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl implements jn0 {
    public final x10 a;
    public final ml b = new ml(this);
    public final f90 c = new f90();
    public final me0 d;
    public final me0 e;
    public final me0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public nl(cv cvVar) {
        this.a = (x10) cvVar;
        Boolean bool = Boolean.FALSE;
        this.d = bo0.m(bool);
        this.e = bo0.m(bool);
        this.f = bo0.m(bool);
    }

    @Override // defpackage.jn0
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cv, x10] */
    @Override // defpackage.jn0
    public final float d(float f) {
        return ((Number) this.a.g(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.jn0
    public final Object e(int i, w8 w8Var, ki kiVar) {
        Object objY = i60.y(new ll(this, i, w8Var, null), kiVar);
        return objY == yj.d ? objY : wz0.a;
    }
}
