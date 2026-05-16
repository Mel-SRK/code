package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ok0 extends i70 implements kg, wo, b20 {
    public final g80 r;
    public final boolean s;
    public final float t;
    public final tl u;
    public final ul v;
    public b3 w;
    public float x;
    public boolean z;
    public long y = 0;
    public final m80 aa = new m80();

    public ok0(g80 g80Var, boolean z, float f, tl tlVar, ul ulVar) {
        this.r = g80Var;
        this.s = z;
        this.t = f;
        this.u = tlVar;
        this.v = ulVar;
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.i70
    public final void bm() {
        i60.an(bi(), null, new c(this, null, 16), 3);
    }

    public abstract void bu(jh0 jh0Var, long j, float f);

    public abstract void bv(u20 u20Var);

    public final void bw(lh0 lh0Var) {
        if (lh0Var instanceof jh0) {
            bu((jh0) lh0Var, this.y, this.x);
        } else if (lh0Var instanceof kh0) {
            bx(((kh0) lh0Var).a);
        } else if (lh0Var instanceof ih0) {
            bx(((ih0) lh0Var).a);
        }
    }

    public abstract void bx(jh0 jh0Var);

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        u20Var.a();
        b3 b3Var = this.w;
        if (b3Var != null) {
            b3Var.c(u20Var, this.x, this.u.a());
        }
        bv(u20Var);
    }

    @Override // defpackage.b20
    public final void s(long j) {
        this.z = true;
        em emVar = pk.ay(this).z;
        this.y = e00.an(j);
        float f = this.t;
        this.x = Float.isNaN(f) ? hk0.a(emVar, this.s, this.y) : emVar.x(f);
        m80 m80Var = this.aa;
        Object[] objArr = m80Var.a;
        int i = m80Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            bw((lh0) objArr[i2]);
        }
        m80Var.c();
    }
}
