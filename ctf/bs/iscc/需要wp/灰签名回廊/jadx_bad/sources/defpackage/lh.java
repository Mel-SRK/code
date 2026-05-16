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
    */
    public static final float bu(lh lhVar, c9 c9Var) {
        ri0 ri0Var;
        int iCompare;
        if (wz.a(lhVar.y, 0L)) {
            return 0.0f;
        }
        a90 a90Var = (a90) lhVar.u.e;
        int i = a90Var.f;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = a90Var.d;
            ri0Var = null;
            while (true) {
                ri0 ri0Var2 = (ri0) ((kh) objArr[i2]).a.a();
                if (ri0Var2 != null) {
                    long jB = ri0Var2.b();
                    long jAn = e00.an(lhVar.y);
                    int iOrdinal = lhVar.r.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(pq0.b(jB), pq0.b(jAn));
                    } else {
                        if (iOrdinal != 1) {
                            wc.l();
                            return 0.0f;
                        }
                        iCompare = Float.compare(pq0.d(jB), pq0.d(jAn));
                    }
                    if (iCompare <= 0) {
                        ri0Var = ri0Var2;
                        i2--;
                        if (i2 >= 0) {
                            break;
                        }
                    } else if (ri0Var == null) {
                        ri0Var = ri0Var2;
                    }
                } else {
                    i2--;
                    if (i2 >= 0) {
                    }
                }
            }
        } else {
            ri0Var = null;
        }
        if (ri0Var == null) {
            ri0 ri0VarBv = lhVar.x ? lhVar.bv() : null;
            if (ri0VarBv == null) {
                return 0.0f;
            }
            ri0Var = ri0VarBv;
        }
        long jAn2 = e00.an(lhVar.y);
        int iOrdinal2 = lhVar.r.ordinal();
        if (iOrdinal2 == 0) {
            float f = ri0Var.b;
            return c9Var.a(f, ri0Var.d - f, pq0.b(jAn2));
        }
        if (iOrdinal2 == 1) {
            float f2 = ri0Var.a;
            return c9Var.a(f2, ri0Var.c - f2, pq0.d(jAn2));
        }
        wc.l();
        return 0.0f;
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
