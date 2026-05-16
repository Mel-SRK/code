package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements p6, m01 {
    public final int a;
    public int b;
    public final Object c;

    public ya0(int i, int i2, ep epVar) {
        this.a = i;
        this.b = i2;
        this.c = new a0((ur) new wr(i, i2, epVar));
    }

    @Override // defpackage.p6
    public void b(int i, Object obj) {
        ((p6) this.c).b(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.p6
    public void c(Object obj) {
        this.b++;
        ((p6) this.c).c(obj);
    }

    @Override // defpackage.p6
    public void d() {
        ((p6) this.c).d();
    }

    @Override // defpackage.p6
    public void e(int i, Object obj) {
        ((p6) this.c).e(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.p6
    public void f(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((p6) this.c).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.p6
    public Object g() {
        return ((p6) this.c).g();
    }

    @Override // defpackage.p6
    public void h(int i, int i2) {
        ((p6) this.c).h(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.l01
    public w5 i(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.c).i(j, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.p6
    public void j(gv gvVar, Object obj) {
        ((p6) this.c).j(gvVar, obj);
    }

    @Override // defpackage.l01
    public w5 k(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((a0) this.c).k(j, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.p6
    public void m() {
        if (this.b <= 0) {
            xf.c("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((p6) this.c).m();
    }

    @Override // defpackage.l01
    public long n(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return ((long) (this.a + this.b)) * 1000000;
    }

    public ya0(p6 p6Var, int i) {
        this.c = p6Var;
        this.a = i;
    }
}
