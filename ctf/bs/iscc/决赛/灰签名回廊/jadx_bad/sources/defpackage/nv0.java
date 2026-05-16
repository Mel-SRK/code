package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends x10 implements gv {
    public final /* synthetic */ nx0 e;
    public final /* synthetic */ nx0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ ms0 h;
    public final /* synthetic */ gv i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ms0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(nx0 nx0Var, nx0 nx0Var2, float f, my0 my0Var, gv gvVar, boolean z, my0 my0Var2) {
        super(2);
        this.e = nx0Var;
        this.f = nx0Var2;
        this.g = f;
        this.h = my0Var;
        this.i = gvVar;
        this.j = z;
        this.k = my0Var2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        cg0 cg0Var;
        xf0 xf0Var;
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            nx0 nx0Var = this.e;
            yr0 yr0Var = nx0Var.a;
            nx0 nx0Var2 = this.f;
            yr0 yr0Var2 = nx0Var2.a;
            nw0 nw0Var = zr0.d;
            nw0 nw0Var2 = yr0Var.a;
            nw0 nw0Var3 = yr0Var2.a;
            boolean z = nw0Var2 instanceof k9;
            nw0 k9Var = mw0.a;
            float f = this.g;
            if (!z && !(nw0Var3 instanceof k9)) {
                long jAk = m10.ak(f, nw0Var2.b(), nw0Var3.b());
                if (jAk != 16) {
                    k9Var = new hd(jAk);
                }
            } else if (z && (nw0Var3 instanceof k9)) {
                i9 i9Var = (i9) zr0.b(null, null, f);
                float fAi = m10.ai(((k9) nw0Var2).a, ((k9) nw0Var3).a, f);
                if (i9Var != null) {
                    if (i9Var instanceof vr0) {
                        long j = wn0.j(((vr0) i9Var).a, fAi);
                        if (j != 16) {
                            k9Var = new hd(j);
                        }
                    } else {
                        if (!(i9Var instanceof j9)) {
                            wc.l();
                            return null;
                        }
                        k9Var = new k9((j9) i9Var, fAi);
                    }
                }
            } else {
                k9Var = (nw0) zr0.b(nw0Var2, nw0Var3, f);
            }
            nw0 nw0Var4 = k9Var;
            fu0 fu0Var = (fu0) zr0.b(yr0Var.f, yr0Var2.f, f);
            long jC = zr0.c(f, yr0Var.b, yr0Var2.b);
            iu iuVar = yr0Var.c;
            if (iuVar == null) {
                iuVar = iu.f;
            }
            iu iuVar2 = yr0Var2.c;
            if (iuVar2 == null) {
                iuVar2 = iu.f;
            }
            iu iuVar3 = new iu(i60.t(m10.aj(f, iuVar.d, iuVar2.d), 1, 1000));
            gu guVar = (gu) zr0.b(yr0Var.d, yr0Var2.d, f);
            hu huVar = (hu) zr0.b(yr0Var.e, yr0Var2.e, f);
            String str = (String) zr0.b(yr0Var.g, yr0Var2.g, f);
            long jC2 = zr0.c(f, yr0Var.h, yr0Var2.h);
            t7 t7Var = yr0Var.i;
            float f2 = t7Var != null ? t7Var.a : 0.0f;
            t7 t7Var2 = yr0Var2.i;
            float fAi2 = m10.ai(f2, t7Var2 != null ? t7Var2.a : 0.0f, f);
            ow0 ow0Var = yr0Var.j;
            ow0 ow0Var2 = ow0.c;
            if (ow0Var == null) {
                ow0Var = ow0Var2;
            }
            ow0 ow0Var3 = yr0Var2.j;
            if (ow0Var3 != null) {
                ow0Var2 = ow0Var3;
            }
            ow0 ow0Var4 = new ow0(m10.ai(ow0Var.a, ow0Var2.a, f), m10.ai(ow0Var.b, ow0Var2.b, f));
            t40 t40Var = (t40) zr0.b(yr0Var.k, yr0Var2.k, f);
            long jAk2 = m10.ak(f, yr0Var.l, yr0Var2.l);
            bv0 bv0Var = (bv0) zr0.b(yr0Var.m, yr0Var2.m, f);
            yp0 yp0Var = yr0Var.n;
            if (yp0Var == null) {
                yp0Var = new yp0();
            }
            yp0 yp0Var2 = yr0Var2.n;
            if (yp0Var2 == null) {
                yp0Var2 = new yp0();
            }
            long jAk3 = m10.ak(f, yp0Var.a, yp0Var2.a);
            long j2 = yp0Var.b;
            long j3 = yp0Var2.b;
            yp0 yp0Var3 = new yp0(m10.ai(yp0Var.c, yp0Var2.c, f), jAk3, (((long) Float.floatToRawIntBits(m10.ai(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f))) << 32) | (((long) Float.floatToRawIntBits(m10.ai(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f))) & 4294967295L));
            cg0 cg0Var2 = yr0Var.o;
            cg0 cg0Var3 = yr0Var2.o;
            if (cg0Var2 == null && cg0Var3 == null) {
                cg0Var = null;
            } else {
                if (cg0Var2 == null) {
                    cg0Var2 = cg0.a;
                }
                cg0Var = cg0Var2;
            }
            yr0 yr0Var3 = new yr0(nw0Var4, jC, iuVar3, guVar, huVar, fu0Var, str, jC2, new t7(fAi2), ow0Var4, t40Var, jAk2, bv0Var, yp0Var3, cg0Var, (yo) zr0.b(yr0Var.p, yr0Var2.p, f));
            ge0 ge0Var = nx0Var.b;
            ge0 ge0Var2 = nx0Var2.b;
            int i = he0.b;
            int i2 = ((yu0) zr0.b(new yu0(ge0Var.a), new yu0(ge0Var2.a), f)).a;
            int i3 = ((ev0) zr0.b(new ev0(ge0Var.b), new ev0(ge0Var2.b), f)).a;
            long jC3 = zr0.c(f, ge0Var.c, ge0Var2.c);
            pw0 pw0Var = ge0Var.d;
            if (pw0Var == null) {
                pw0Var = pw0.c;
            }
            pw0 pw0Var2 = ge0Var2.d;
            if (pw0Var2 == null) {
                pw0Var2 = pw0.c;
            }
            pw0 pw0Var3 = new pw0(zr0.c(f, pw0Var.a, pw0Var2.a), zr0.c(f, pw0Var.b, pw0Var2.b));
            xf0 xf0Var2 = ge0Var.e;
            xf0 xf0Var3 = ge0Var2.e;
            if (xf0Var2 == null && xf0Var3 == null) {
                xf0Var = null;
            } else {
                xf0 xf0Var4 = xf0.b;
                xf0 xf0Var5 = xf0Var2 == null ? xf0Var4 : xf0Var2;
                boolean z2 = xf0Var5.a;
                if (xf0Var3 == null) {
                    xf0Var3 = xf0Var4;
                }
                boolean z3 = xf0Var3.a;
                if (z2 != z3) {
                    ((lq) zr0.b(new lq(), new lq(), f)).getClass();
                    xf0Var5 = new xf0(((Boolean) zr0.b(Boolean.valueOf(z2), Boolean.valueOf(z3), f)).booleanValue());
                }
                xf0Var = xf0Var5;
            }
            nx0 nx0Var3 = new nx0(yr0Var3, new ge0(i2, i3, jC3, pw0Var3, xf0Var, (e40) zr0.b(ge0Var.f, ge0Var2.f, f), ((z30) zr0.b(new z30(ge0Var.g), new z30(ge0Var2.g), f)).a, ((yx) zr0.b(new yx(ge0Var.h), new yx(ge0Var2.h), f)).a, (fx0) zr0.b(ge0Var.i, ge0Var2.i, f)));
            if (this.j) {
                nx0Var3 = nx0.a(nx0Var3, ((qc) this.k.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            qv0.b(((qc) this.h.getValue()).a, nx0Var3, this.i, vfVar, 0);
        }
        return wz0.a;
    }
}
