package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j50 extends lf0 implements r60, t70 {
    public g50 i;
    public cv j;
    public nf0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final k50 o = new k50(0, this);
    public hl0 p;
    public q80 q;

    public static void bv(fa0 fa0Var) {
        t20 t20Var;
        fa0 fa0Var2 = fa0Var.s;
        s20 s20Var = fa0Var.r;
        if (!f00.h(fa0Var2 != null ? fa0Var2.r : null, s20Var)) {
            s20Var.ah.o.z.f();
            return;
        }
        I1 i1R = s20Var.ah.o.r();
        if (i1R == null || (t20Var = ((o60) i1R).z) == null) {
            return;
        }
        t20Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bi(s20 s20Var, tx txVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        q80 q80Var = this.q;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (q80Var != null) {
            Object[] objArr = q80Var.c;
            long[] jArr3 = q80Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                r80 r80Var = (r80) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = r80Var.b;
                                long[] jArr4 = r80Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    s20 s20Var2 = (s20) ((y11) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (s20Var2 != null) {
                                                        boolean zAe = s20Var2.ae();
                                                        i4 = i8;
                                                        if (zAe) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    r80Var.l(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        }
        q80 q80Var2 = this.q;
        if (q80Var2 != null) {
            long[] jArr5 = q80Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((r80) q80Var2.c[i18]).g()) {
                                    q80Var2.k(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        q80 q80Var3 = this.q;
        if (q80Var3 == null) {
            q80Var3 = new q80();
            this.q = q80Var3;
        }
        Object objG = q80Var3.g(txVar);
        if (objG == null) {
            objG = new r80();
            q80Var3.l(txVar, objG);
        }
        ((r80) objG).j(new y11(s20Var));
    }

    public abstract int bj(qx qxVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void bk(nf0 nf0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        s20 s20Var;
        int i;
        char c2;
        long j6;
        j50 j50VarBs;
        td0 snapshotObserver;
        q80 q80Var = this.q;
        hl0 hl0Var = this.p;
        if (hl0Var == null) {
            hl0Var = new hl0();
            this.p = hl0Var;
        }
        hl0 hl0Var2 = hl0Var;
        b1 b1Var = bq().p;
        if (b1Var != null && (snapshotObserver = b1Var.getSnapshotObserver()) != null) {
            snapshotObserver.a(nf0Var, f50.f, new h50(this, j, j2, nf0Var));
        }
        boolean zBw = bw();
        r80 r80Var = hl0Var2.e;
        r80 r80Var2 = hl0Var2.f;
        int i2 = hl0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = hl0Var2.d[i3];
            if (b == 3) {
                tx txVar = hl0Var2.b[i3];
                txVar.getClass();
                r80Var2.j(txVar);
            } else if (b != 0 && q80Var != null) {
                tx txVar2 = hl0Var2.b[i3];
                txVar2.getClass();
                r80 r80Var3 = (r80) q80Var.j(txVar2);
                if (r80Var3 != null) {
                    r80Var.i(r80Var3);
                }
            }
        }
        int i4 = hl0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = hl0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                tx[] txVarArr = hl0Var2.b;
                txVarArr[i6 - i5] = txVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = hl0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            hl0Var2.b[i8] = null;
        }
        hl0Var2.a -= i5;
        j50 j50VarBs2 = bs();
        Object[] objArr = r80Var2.b;
        long[] jArr = r80Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            tx txVar3 = (tx) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            j50 j50Var = j50VarBs2 == null ? this : j50VarBs2;
                            i = i9;
                            j50 j50Var2 = j50Var;
                            while (true) {
                                hl0 hl0Var3 = j50Var2.p;
                                if ((hl0Var3 != null && h7.bb(hl0Var3.b, txVar3) >= 0) || (j50VarBs = j50Var2.bs()) == null) {
                                    break;
                                } else {
                                    j50Var2 = j50VarBs;
                                }
                            }
                            q80 q80Var2 = j50Var2.q;
                            r80 r80Var4 = q80Var2 != null ? (r80) q80Var2.j(txVar3) : null;
                            if (r80Var4 != null) {
                                j50Var.bx(r80Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        r80Var2.b();
        Object[] objArr2 = r80Var.b;
        long[] jArr2 = r80Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (s20Var = (s20) ((y11) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zBw) {
                                s20Var.am(false);
                            } else {
                                s20Var.ao(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        r80Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bl(q60 q60Var) {
        long j;
        long j2;
        q80 q80Var = this.q;
        if (!this.n) {
            cv cvVarD = q60Var.d();
            if (cvVarD != null) {
                boolean z = this.j != cvVarD;
                if (z || !bu().d) {
                    j = 0;
                    j2 = 9223372034707292159L;
                } else {
                    d20 d20VarBo = bo();
                    long jAu = t1.au(d20VarBo.d(0L));
                    long jAl = d20VarBo.al();
                    j2 = jAu;
                    j = jAl;
                    z = (pz.a(jAu, bu().e) && wz.a(jAl, bu().f)) ? false : true;
                }
                if (z) {
                    nf0 nf0Var = this.k;
                    if (nf0Var != null) {
                        nf0Var.d = q60Var;
                    } else {
                        nf0Var = new nf0(q60Var, this);
                        this.k = nf0Var;
                    }
                    bk(nf0Var, j2, j);
                    this.j = q60Var.d();
                }
            } else if (q80Var != null) {
                Object[] objArr = q80Var.c;
                long[] jArr = q80Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    bx((r80) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                q80Var.a();
            }
        }
    }

    public final int bm(qx qxVar) {
        int iBj;
        if (bp() && (iBj = bj(qxVar)) != Integer.MIN_VALUE) {
            return iBj + ((int) (this.h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract j50 bn();

    public abstract d20 bo();

    public abstract boolean bp();

    public abstract s20 bq();

    public abstract q60 br();

    public abstract j50 bs();

    public abstract long bt();

    public final g50 bu() {
        g50 g50Var = this.i;
        if (g50Var != null) {
            return g50Var;
        }
        g50 g50Var2 = new g50(this);
        this.i = g50Var2;
        return g50Var2;
    }

    public boolean bw() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bx(r80 r80Var) {
        s20 s20Var;
        Object[] objArr = r80Var.b;
        long[] jArr = r80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (s20Var = (s20) ((y11) objArr[(i << 3) + i3]).get()) != null) {
                        if (bw()) {
                            s20Var.am(false);
                        } else {
                            s20Var.ao(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void bz();

    @Override // defpackage.r60
    public final q60 m(int i, int i2, Map map, a2 a2Var, cv cvVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            sy.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new i50(i, i2, map, a2Var, cvVar, this);
    }

    @Override // defpackage.t70
    public final void o(boolean z) {
        j50 j50VarBs = bs();
        s20 s20VarBq = j50VarBs != null ? j50VarBs.bq() : null;
        if (f00.h(s20VarBq, bq())) {
            this.l = z;
            return;
        }
        if ((s20VarBq != null ? s20VarBq.ah.c : null) != p20.f) {
            if ((s20VarBq != null ? s20VarBq.ah.c : null) != p20.g) {
                return;
            }
        }
        this.l = z;
    }
}
