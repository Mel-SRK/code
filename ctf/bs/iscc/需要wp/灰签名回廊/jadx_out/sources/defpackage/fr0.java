package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class fr0 {
    public static final dr0 a = new dr0(0);
    public static final o6 b = new o6(9);
    public static final Object c = new Object();
    public static cr0 d;
    public static long e;
    public static final ar0 f;
    public static final cc g;
    public static Object h;
    public static Object i;
    public static final dw j;
    public static final i7 k;

    static {
        cr0 cr0Var = cr0.h;
        d = cr0Var;
        long j2 = 1;
        e = j2 + j2;
        ar0 ar0Var = new ar0();
        ar0Var.b = new long[16];
        ar0Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        ar0Var.d = iArr;
        f = ar0Var;
        cc ccVar = new cc();
        ccVar.b = new int[16];
        ccVar.c = new z11[16];
        g = ccVar;
        rq rqVar = rq.d;
        h = rqVar;
        i = rqVar;
        long j3 = e;
        e = j2 + j3;
        dw dwVar = new dw(j3, cr0Var, null, new c6(2));
        d = d.e(dwVar.b);
        j = dwVar;
        k = new i7(0);
    }

    public static final void a() {
        f(a);
    }

    public static final cv b(cv cvVar, cv cvVar2) {
        return (cvVar == null || cvVar2 == null || cvVar == cvVar2) ? cvVar == null ? cvVar2 : cvVar : new er0(cvVar, cvVar2, 1);
    }

    public static final HashMap c(long j2, v80 v80Var, cr0 cr0Var) {
        long[] jArr;
        cr0 cr0Var2;
        long[] jArr2;
        cr0 cr0Var3;
        int i2;
        vs0 vs0VarS;
        long j3 = j2;
        r80 r80VarX = v80Var.x();
        if (r80VarX != null) {
            cr0 cr0VarD = v80Var.d().e(v80Var.g()).d(v80Var.j);
            Object[] objArr = r80VarX.b;
            long[] jArr3 = r80VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                ts0 ts0Var = (ts0) objArr[(i3 << 3) + i6];
                                vs0 vs0VarA = ts0Var.a();
                                jArr2 = jArr3;
                                i2 = i4;
                                vs0 vs0VarS2 = s(vs0VarA, j3, cr0Var);
                                if (vs0VarS2 == null || (vs0VarS = s(vs0VarA, j3, cr0VarD)) == null || vs0VarS2.equals(vs0VarS)) {
                                    cr0Var3 = cr0VarD;
                                } else {
                                    cr0Var3 = cr0VarD;
                                    vs0 vs0VarS3 = s(vs0VarA, v80Var.g(), v80Var.d());
                                    if (vs0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    vs0 vs0VarB = ts0Var.b(vs0VarS, vs0VarS2, vs0VarS3);
                                    if (vs0VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(vs0VarS2, vs0VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                cr0Var3 = cr0VarD;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            cr0VarD = cr0Var3;
                        }
                        jArr = jArr3;
                        cr0Var2 = cr0VarD;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        cr0Var2 = cr0VarD;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    cr0VarD = cr0Var2;
                }
            }
        }
        return null;
    }

    public static final void d(xq0 xq0Var) {
        long j2;
        if (d.c(xq0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(xq0Var.g());
        sb.append(", disposed=");
        sb.append(xq0Var.c);
        sb.append(", applied=");
        v80 v80Var = xq0Var instanceof v80 ? (v80) xq0Var : null;
        sb.append(v80Var != null ? Boolean.valueOf(v80Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            ar0 ar0Var = f;
            j2 = ar0Var.a > 0 ? ar0Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final cr0 e(cr0 cr0Var, long j2, long j3) {
        while (f00.n(j2, j3) < 0) {
            cr0Var = cr0Var.e(j2);
            j2 += (long) 1;
        }
        return cr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.cv r15) {
        /*
            dw r0 = defpackage.fr0.j
            java.lang.Object r1 = defpackage.fr0.c
            monitor-enter(r1)
            r80 r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            i7 r3 = defpackage.fr0.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = defpackage.fr0.h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            gv r7 = (defpackage.gv) r7     // Catch: java.lang.Throwable -> L36
            om0 r8 = new om0     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.f(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            i7 r0 = defpackage.fr0.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            i7 r0 = defpackage.fr0.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = defpackage.fr0.c
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            ts0 r11 = (defpackage.ts0) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.f(cv):java.lang.Object");
    }

    public static final void g() {
        cc ccVar = g;
        int i2 = ccVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            z11 z11Var = ((z11[]) ccVar.c)[i3];
            Object obj = z11Var != null ? z11Var.get() : null;
            if (obj != null && p((ts0) obj)) {
                if (i4 != i3) {
                    ((z11[]) ccVar.c)[i4] = z11Var;
                    int[] iArr = (int[]) ccVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((z11[]) ccVar.c)[i5] = null;
            ((int[]) ccVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            ccVar.a = i4;
        }
    }

    public static final xq0 h(xq0 xq0Var, cv cvVar, boolean z) {
        boolean z2 = xq0Var instanceof v80;
        if (z2 || xq0Var == null) {
            return new py0(z2 ? (v80) xq0Var : null, cvVar, null, false, z);
        }
        return new qy0(xq0Var, cvVar, false, z);
    }

    public static final vs0 i(vs0 vs0Var) {
        vs0 vs0VarS;
        xq0 xq0VarK = k();
        vs0 vs0VarS2 = s(vs0Var, xq0VarK.g(), xq0VarK.d());
        if (vs0VarS2 != null) {
            return vs0VarS2;
        }
        synchronized (c) {
            xq0 xq0VarK2 = k();
            vs0VarS = s(vs0Var, xq0VarK2.g(), xq0VarK2.d());
        }
        if (vs0VarS != null) {
            return vs0VarS;
        }
        r();
        throw null;
    }

    public static final vs0 j(vs0 vs0Var, xq0 xq0Var) {
        vs0 vs0VarS;
        vs0 vs0VarS2 = s(vs0Var, xq0Var.g(), xq0Var.d());
        if (vs0VarS2 != null) {
            return vs0VarS2;
        }
        synchronized (c) {
            vs0VarS = s(vs0Var, xq0Var.g(), xq0Var.d());
        }
        if (vs0VarS != null) {
            return vs0VarS;
        }
        r();
        throw null;
    }

    public static final xq0 k() {
        xq0 xq0Var = (xq0) b.n();
        return xq0Var == null ? j : xq0Var;
    }

    public static final cv l(cv cvVar, cv cvVar2, boolean z) {
        if (!z) {
            cvVar2 = null;
        }
        return (cvVar == null || cvVar2 == null || cvVar == cvVar2) ? cvVar == null ? cvVar2 : cvVar : new er0(cvVar, cvVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vs0 m(defpackage.vs0 r10, defpackage.ts0 r11) {
        /*
            vs0 r0 = r11.a()
            long r1 = defpackage.fr0.e
            ar0 r3 = defpackage.fr0.f
            int r4 = r3.a
            if (r4 <= 0) goto L12
            long[] r1 = r3.b
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L12:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L17:
            if (r0 == 0) goto L49
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L22
            goto L42
        L22:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = defpackage.f00.n(r5, r1)
            if (r7 > 0) goto L46
            cr0 r7 = defpackage.cr0.h
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L46
            if (r4 != 0) goto L38
            r4 = r0
            goto L46
        L38:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.f00.n(r1, r5)
            if (r1 >= 0) goto L44
        L42:
            r3 = r0
            goto L49
        L44:
            r3 = r4
            goto L49
        L46:
            vs0 r0 = r0.b
            goto L17
        L49:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L53
            r3.a = r0
            return r3
        L53:
            vs0 r10 = r10.b(r0)
            vs0 r0 = r11.a()
            r10.b = r0
            r11.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.m(vs0, ts0):vs0");
    }

    public static final void n(xq0 xq0Var, ts0 ts0Var) {
        xq0Var.t(xq0Var.h() + 1);
        cv cvVarI = xq0Var.i();
        if (cvVarI != null) {
            cvVarI.g(ts0Var);
        }
    }

    public static final vs0 o(vs0 vs0Var, us0 us0Var, xq0 xq0Var, vs0 vs0Var2) {
        vs0 vs0VarM;
        if (xq0Var.f()) {
            xq0Var.n(us0Var);
        }
        long jG = xq0Var.g();
        if (vs0Var2.a == jG) {
            return vs0Var2;
        }
        synchronized (c) {
            vs0VarM = m(vs0Var, us0Var);
        }
        vs0VarM.a = jG;
        if (vs0Var2.a != 1) {
            xq0Var.n(us0Var);
        }
        return vs0VarM;
    }

    public static final boolean p(ts0 ts0Var) {
        vs0 vs0Var;
        long j2 = e;
        ar0 ar0Var = f;
        if (ar0Var.a > 0) {
            j2 = ar0Var.b[0];
        }
        vs0 vs0Var2 = null;
        vs0 vs0VarA = null;
        int i2 = 0;
        for (vs0 vs0VarA2 = ts0Var.a(); vs0VarA2 != null; vs0VarA2 = vs0VarA2.b) {
            long j3 = vs0VarA2.a;
            if (j3 != 0) {
                if (f00.n(j3, j2) >= 0) {
                    i2++;
                } else if (vs0Var2 == null) {
                    i2++;
                    vs0Var2 = vs0VarA2;
                } else {
                    if (f00.n(vs0VarA2.a, vs0Var2.a) < 0) {
                        vs0Var = vs0Var2;
                        vs0Var2 = vs0VarA2;
                    } else {
                        vs0Var = vs0VarA2;
                    }
                    if (vs0VarA == null) {
                        vs0VarA = ts0Var.a();
                        vs0 vs0Var3 = vs0VarA;
                        while (true) {
                            if (vs0VarA == null) {
                                vs0VarA = vs0Var3;
                                break;
                            }
                            if (f00.n(vs0VarA.a, j2) >= 0) {
                                break;
                            }
                            if (f00.n(vs0Var3.a, vs0VarA.a) < 0) {
                                vs0Var3 = vs0VarA;
                            }
                            vs0VarA = vs0VarA.b;
                        }
                    }
                    vs0Var2.a = 0L;
                    vs0Var2.a(vs0VarA);
                    vs0Var2 = vs0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(ts0 ts0Var) {
        if (p(ts0Var)) {
            cc ccVar = g;
            int i2 = ccVar.a;
            int iIdentityHashCode = System.identityHashCode(ts0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = ccVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) ccVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        z11 z11Var = ((z11[]) ccVar.c)[i6];
                        if (ts0Var == (z11Var != null ? z11Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) ccVar.b)[i8] == iIdentityHashCode; i8--) {
                                z11 z11Var2 = ((z11[]) ccVar.c)[i8];
                                if ((z11Var2 != null ? z11Var2.get() : null) == ts0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = ccVar.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(ccVar.a + 1);
                                    break;
                                } else {
                                    if (((int[]) ccVar.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    z11 z11Var3 = ((z11[]) ccVar.c)[i6];
                                    if ((z11Var3 != null ? z11Var3.get() : null) == ts0Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            z11[] z11VarArr = (z11[]) ccVar.c;
            int length = z11VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                z11[] z11VarArr2 = new z11[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(z11VarArr, i10, z11VarArr2, i12, i2 - i10);
                System.arraycopy((z11[]) ccVar.c, 0, z11VarArr2, 0, i10);
                h7.as((int[]) ccVar.b, iArr, i12, i10, i2);
                h7.av((int[]) ccVar.b, iArr, 0, i10, 6);
                ccVar.c = z11VarArr2;
                ccVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(z11VarArr, i10, z11VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) ccVar.b;
                h7.as(iArr2, iArr2, i13, i10, i2);
            }
            ((z11[]) ccVar.c)[i10] = new z11(ts0Var);
            ((int[]) ccVar.b)[i10] = iIdentityHashCode;
            ccVar.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final vs0 s(vs0 vs0Var, long j2, cr0 cr0Var) {
        vs0 vs0Var2 = null;
        while (vs0Var != null) {
            long j3 = vs0Var.a;
            if (j3 != 0 && f00.n(j3, j2) <= 0 && !cr0Var.c(j3) && (vs0Var2 == null || f00.n(vs0Var2.a, vs0Var.a) < 0)) {
                vs0Var2 = vs0Var;
            }
            vs0Var = vs0Var.b;
        }
        if (vs0Var2 != null) {
            return vs0Var2;
        }
        return null;
    }

    public static final vs0 t(vs0 vs0Var, ts0 ts0Var) {
        vs0 vs0VarS;
        xq0 xq0VarK = k();
        cv cvVarE = xq0VarK.e();
        if (cvVarE != null) {
            cvVarE.g(ts0Var);
        }
        vs0 vs0VarS2 = s(vs0Var, xq0VarK.g(), xq0VarK.d());
        if (vs0VarS2 != null) {
            return vs0VarS2;
        }
        synchronized (c) {
            xq0 xq0VarK2 = k();
            vs0 vs0VarA = ts0Var.a();
            vs0VarA.getClass();
            vs0VarS = s(vs0VarA, xq0VarK2.g(), xq0VarK2.d());
            if (vs0VarS == null) {
                r();
                throw null;
            }
        }
        return vs0VarS;
    }

    public static final void u(int i2) {
        ar0 ar0Var = f;
        int i3 = ar0Var.d[i2];
        ar0Var.b(i3, ar0Var.a - 1);
        ar0Var.a--;
        long[] jArr = ar0Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (f00.n(jArr[i5], j2) <= 0) {
                break;
            }
            ar0Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = ar0Var.b;
        int i6 = ar0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < ar0Var.a && f00.n(jArr2[i7], jArr2[i8]) < 0) {
                if (f00.n(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                ar0Var.b(i7, i3);
                i3 = i7;
            } else {
                if (f00.n(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                ar0Var.b(i8, i3);
                i3 = i8;
            }
        }
        ar0Var.d[i2] = ar0Var.e;
        ar0Var.e = i2;
    }

    public static final Object v(dw dwVar, cv cvVar) {
        long j2 = dwVar.b;
        Object objG = cvVar.g(d.b(j2));
        long j3 = e;
        e = ((long) 1) + j3;
        cr0 cr0VarB = d.b(j2);
        d = cr0VarB;
        dwVar.b = j3;
        dwVar.a = cr0VarB;
        dwVar.g = 0;
        dwVar.h = null;
        dwVar.o();
        d = d.e(j3);
        return objG;
    }

    public static final vs0 w(vs0 vs0Var, ts0 ts0Var, xq0 xq0Var) {
        vs0 vs0VarS;
        if (xq0Var.f()) {
            xq0Var.n(ts0Var);
        }
        long jG = xq0Var.g();
        vs0 vs0VarS2 = s(vs0Var, jG, xq0Var.d());
        if (vs0VarS2 == null) {
            r();
            throw null;
        }
        if (vs0VarS2.a == xq0Var.g()) {
            return vs0VarS2;
        }
        synchronized (c) {
            vs0VarS = s(ts0Var.a(), jG, xq0Var.d());
            if (vs0VarS == null) {
                r();
                throw null;
            }
            if (vs0VarS.a != jG) {
                vs0 vs0VarM = m(vs0VarS, ts0Var);
                vs0VarM.a(vs0VarS);
                vs0VarM.a = xq0Var.g();
                vs0VarS = vs0VarM;
            }
        }
        if (vs0VarS2.a != 1) {
            xq0Var.n(ts0Var);
        }
        return vs0VarS;
    }
}
