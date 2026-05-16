package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends i70 implements b20, kg {
    public wc0 r;
    public final rn0 s;
    public boolean t;
    public d20 v;
    public ri0 w;
    public boolean x;
    public boolean z;
    public final bu u = new bu(1);
    public long y = 0;

    public lh(wc0 wc0Var, rn0 rn0Var, boolean z) {
        this.r = wc0Var;
        this.s = rn0Var;
        this.t = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[EDGE_INSN: B:43:0x006a->B:25:0x006a BREAK  A[LOOP:0: B:8:0x001c->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:8:0x001c->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float bu(defpackage.lh r11, defpackage.c9 r12) {
        /*
            long r0 = r11.y
            r2 = 0
            boolean r0 = defpackage.wz.a(r0, r2)
            if (r0 == 0) goto Lc
            goto L76
        Lc:
            bu r0 = r11.u
            java.lang.Object r0 = r0.e
            a90 r0 = (defpackage.a90) r0
            int r1 = r0.f
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L69
            int r1 = r1 - r3
            java.lang.Object[] r0 = r0.d
            r4 = r2
        L1c:
            r5 = r0[r1]
            kh r5 = (defpackage.kh) r5
            v8 r5 = r5.a
            java.lang.Object r5 = r5.a()
            ri0 r5 = (defpackage.ri0) r5
            if (r5 == 0) goto L64
            long r6 = r5.b()
            long r8 = r11.y
            long r8 = defpackage.e00.an(r8)
            wc0 r10 = r11.r
            int r10 = r10.ordinal()
            if (r10 == 0) goto L50
            if (r10 != r3) goto L4b
            float r6 = defpackage.pq0.d(r6)
            float r7 = defpackage.pq0.d(r8)
            int r6 = java.lang.Float.compare(r6, r7)
            goto L5c
        L4b:
            defpackage.wc.l()
            r11 = 0
            return r11
        L50:
            float r6 = defpackage.pq0.b(r6)
            float r7 = defpackage.pq0.b(r8)
            int r6 = java.lang.Float.compare(r6, r7)
        L5c:
            if (r6 > 0) goto L60
            r4 = r5
            goto L64
        L60:
            if (r4 != 0) goto L6a
            r4 = r5
            goto L6a
        L64:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1c
            goto L6a
        L69:
            r4 = r2
        L6a:
            if (r4 != 0) goto L79
            boolean r0 = r11.x
            if (r0 == 0) goto L74
            ri0 r2 = r11.bv()
        L74:
            if (r2 != 0) goto L78
        L76:
            r11 = 0
            return r11
        L78:
            r4 = r2
        L79:
            long r0 = r11.y
            long r0 = defpackage.e00.an(r0)
            wc0 r11 = r11.r
            int r11 = r11.ordinal()
            if (r11 == 0) goto L9c
            if (r11 != r3) goto L97
            float r11 = r4.a
            float r2 = r4.c
            float r2 = r2 - r11
            float r0 = defpackage.pq0.d(r0)
            float r11 = r12.a(r11, r2, r0)
            return r11
        L97:
            defpackage.wc.l()
            r11 = 0
            return r11
        L9c:
            float r11 = r4.b
            float r2 = r4.d
            float r2 = r2 - r11
            float r0 = defpackage.pq0.b(r0)
            float r11 = r12.a(r11, r2, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh.bu(lh, c9):float");
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    public final ri0 bv() {
        if (this.q) {
            fa0 fa0VarAx = pk.ax(this);
            d20 d20Var = this.v;
            if (d20Var != null) {
                if (!d20Var.af()) {
                    d20Var = null;
                }
                if (d20Var != null) {
                    return fa0VarAx.ak(d20Var, false);
                }
            }
        }
        return null;
    }

    public final boolean bw(ri0 ri0Var, long j) {
        long jBz = bz(ri0Var, j);
        return Math.abs(xa0.d(jBz)) <= 0.5f && Math.abs(xa0.e(jBz)) <= 0.5f;
    }

    public final void bx() {
        c9 c9Var = (c9) i60.ab(this, e9.a);
        if (this.z) {
            wc.q("launchAnimation called when previous animation was running");
            return;
        }
        i60.an(bi(), null, new j3(this, new f01(c9Var.b()), c9Var, null, 3), 1);
    }

    public final long bz(ri0 ri0Var, long j) {
        long jAn = e00.an(j);
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            c9 c9Var = (c9) i60.ab(this, e9.a);
            float f = ri0Var.b;
            return d41.h(0.0f, c9Var.a(f, ri0Var.d - f, pq0.b(jAn)));
        }
        if (iOrdinal != 1) {
            wc.l();
            return 0L;
        }
        c9 c9Var2 = (c9) i60.ab(this, e9.a);
        float f2 = ri0Var.a;
        return d41.h(c9Var2.a(f2, ri0Var.c - f2, pq0.d(jAn)), 0.0f);
    }

    @Override // defpackage.b20
    public final void s(long j) {
        int iM;
        ri0 ri0VarBv;
        long j2 = this.y;
        this.y = j;
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            iM = f00.m((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                wc.l();
                return;
            }
            iM = f00.m((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iM < 0 && (ri0VarBv = bv()) != null) {
            ri0 ri0Var = this.w;
            if (ri0Var == null) {
                ri0Var = ri0VarBv;
            }
            if (!this.z && !this.x && bw(ri0Var, j2) && !bw(ri0VarBv, j)) {
                this.x = true;
                bx();
            }
            this.w = ri0VarBv;
        }
    }
}
