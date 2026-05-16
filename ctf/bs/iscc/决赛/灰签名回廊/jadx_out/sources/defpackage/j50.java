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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bi(defpackage.s20 r32, defpackage.tx r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.bi(s20, tx):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bl(defpackage.q60 r15) {
        /*
            r14 = this;
            q80 r0 = r14.q
            boolean r1 = r14.n
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            cv r1 = r15.d()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            r80 r10 = (defpackage.r80) r10
            r14.bx(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            cv r0 = r14.j
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            g50 r1 = r14.bu()
            boolean r1 = r1.d
            if (r1 == 0) goto L9b
            d20 r0 = r14.bo()
            long r4 = r0.d(r4)
            long r4 = defpackage.t1.au(r4)
            long r0 = r0.al()
            g50 r6 = r14.bu()
            long r6 = r6.e
            boolean r6 = defpackage.pz.a(r4, r6)
            if (r6 == 0) goto L96
            g50 r6 = r14.bu()
            long r6 = r6.f
            boolean r6 = defpackage.wz.a(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            nf0 r0 = r14.k
            if (r0 == 0) goto Lad
            r0.d = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            nf0 r0 = new nf0
            r0.<init>(r15, r14)
            r14.k = r0
            goto Laa
        Lb5:
            r1.bk(r2, r3, r5)
            cv r15 = r15.d()
            r1.j = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.bl(q60):void");
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
