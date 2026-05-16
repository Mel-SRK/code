package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 implements jn0 {
    public static final f1 i = new f1(17, w6.r, f50.x);
    public final je0 a;
    public float e;
    public final je0 b = new je0(0);
    public final g80 c = new g80();
    public final je0 d = new je0(Integer.MAX_VALUE);
    public final nl f = new nl(new l1(19, this));
    public final km g = bo0.f(new xm0(this, 1));
    public final km h = bo0.f(new xm0(this, 0));

    public ym0(int i2) {
        this.a = new je0(i2);
    }

    @Override // defpackage.jn0
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.jn0
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.jn0
    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.jn0
    public final float d(float f) {
        return this.f.d(f);
    }

    @Override // defpackage.jn0
    public final Object e(int i2, w8 w8Var, ki kiVar) {
        Object objE = this.f.e(i2, w8Var, kiVar);
        return objE == yj.d ? objE : wz0.a;
    }
}
