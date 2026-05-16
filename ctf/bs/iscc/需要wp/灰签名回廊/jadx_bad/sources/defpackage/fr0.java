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
    */
    public static final Object f(cv cvVar) {
        r80 r80Var;
        Object objV;
        dw dwVar = j;
        synchronized (c) {
            try {
                r80Var = dwVar.h;
                if (r80Var != null) {
                    k.addAndGet(1);
                }
                objV = v(dwVar, cvVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r80Var != null) {
            try {
                ?? r4 = h;
                int size = r4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gv) r4.get(i2)).f(new om0(r80Var), dwVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            g();
            if (r80Var != null) {
                Object[] objArr = r80Var.b;
                long[] jArr = r80Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((ts0) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objV;
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
    */
    public static final vs0 m(vs0 vs0Var, ts0 ts0Var) {
        vs0 vs0VarA = ts0Var.a();
        long j2 = e;
        ar0 ar0Var = f;
        if (ar0Var.a > 0) {
            j2 = ar0Var.b[0];
        }
        long j3 = j2 - ((long) 1);
        vs0 vs0Var2 = null;
        vs0 vs0Var3 = null;
        while (true) {
            if (vs0VarA == null) {
                break;
            }
            long j4 = vs0VarA.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && f00.n(j4, j3) <= 0 && !cr0.h.c(j4)) {
                if (vs0Var3 == null) {
                    vs0Var3 = vs0VarA;
                } else {
                    if (f00.n(vs0VarA.a, vs0Var3.a) < 0) {
                        break;
                    }
                    vs0Var2 = vs0Var3;
                }
            }
            vs0VarA = vs0VarA.b;
        }
        if (vs0Var2 != null) {
            vs0Var2.a = Long.MAX_VALUE;
            return vs0Var2;
        }
        vs0 vs0VarB = vs0Var.b(Long.MAX_VALUE);
        vs0VarB.b = ts0Var.a();
        ts0Var.c(vs0VarB);
        return vs0VarB;
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
