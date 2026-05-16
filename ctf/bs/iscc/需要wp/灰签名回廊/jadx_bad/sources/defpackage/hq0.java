package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class hq0 extends af implements u80, yr, sv {
    public final int h;
    public final int i;
    public final m9 j;
    public Object[] k;
    public long l;
    public long m;
    public int n;
    public int o;

    public hq0(int i, int i2, m9 m9Var) {
        this.h = i;
        this.i = i2;
        this.j = m9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zr] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [af] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hq0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [zr] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ag] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [iq0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [iq0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(hq0 hq0Var, zr zrVar, ji jiVar) throws Throwable {
        gq0 gq0Var;
        ?? r4;
        ?? r10;
        hq0 hq0Var2;
        t00 t00Var;
        t00 t00Var2;
        ?? r1;
        Object objT;
        jq jqVar;
        yj yjVar;
        ?? r102;
        ?? r9;
        ?? r8;
        if (jiVar instanceof gq0) {
            gq0Var = (gq0) jiVar;
            int i = gq0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq0Var.m = i - Integer.MIN_VALUE;
            } else {
                gq0Var = new gq0(hq0Var, jiVar);
            }
        }
        Object obj = gq0Var.k;
        int i2 = gq0Var.m;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            i60.az(obj);
            r10 = zrVar;
            zrVar = (iq0) hq0Var.a();
            hq0Var2 = hq0Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    t00Var2 = gq0Var.j;
                    iq0 iq0Var = gq0Var.i;
                    zr zrVar2 = gq0Var.h;
                    hq0 hq0Var3 = gq0Var.g;
                    i60.az(obj);
                    r1 = zrVar2;
                    r4 = hq0Var3;
                    zrVar = iq0Var;
                    do {
                        objT = r4.t(zrVar);
                        jqVar = pk.g;
                        yjVar = yj.d;
                        if (objT == jqVar) {
                        }
                        r4.f(zrVar);
                        throw th;
                    } while (r4.h(zrVar, gq0Var) != yjVar);
                }
                if (i2 != 3) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                t00Var2 = gq0Var.j;
                iq0 iq0Var2 = gq0Var.i;
                zr zrVar3 = gq0Var.h;
                hq0 hq0Var4 = gq0Var.g;
                i60.az(obj);
                ?? r12 = zrVar3;
                ?? r42 = hq0Var4;
                ?? r92 = iq0Var2;
                r102 = r12;
                t00Var = t00Var2;
                r8 = r42;
                r9 = r92;
                r4 = r8;
                t00Var2 = t00Var;
                r1 = r102;
                zrVar = r9;
                do {
                    objT = r4.t(zrVar);
                    jqVar = pk.g;
                    yjVar = yj.d;
                    if (objT == jqVar) {
                        if (t00Var2 != null && !t00Var2.b()) {
                            throw t00Var2.q();
                        }
                        gq0Var.g = r4;
                        gq0Var.h = r1;
                        gq0Var.i = zrVar;
                        gq0Var.j = t00Var2;
                        gq0Var.m = 3;
                        Object objI = r1.i(objT, gq0Var);
                        r12 = r1;
                        r42 = r4;
                        r92 = zrVar;
                        if (objI == yjVar) {
                            return;
                        }
                        r102 = r12;
                        t00Var = t00Var2;
                        r8 = r42;
                        r9 = r92;
                        r4 = r8;
                        t00Var2 = t00Var;
                        r1 = r102;
                        zrVar = r9;
                        objT = r4.t(zrVar);
                        jqVar = pk.g;
                        yjVar = yj.d;
                        if (objT == jqVar) {
                            gq0Var.g = r4;
                            gq0Var.h = r1;
                            gq0Var.i = zrVar;
                            gq0Var.j = t00Var2;
                            gq0Var.m = 2;
                        }
                    }
                    r4.f(zrVar);
                    throw th;
                } while (r4.h(zrVar, gq0Var) != yjVar);
            }
            zrVar = gq0Var.i;
            zr zrVar4 = gq0Var.h;
            hq0 hq0Var5 = gq0Var.g;
            try {
                i60.az(obj);
                r10 = zrVar4;
                hq0Var2 = hq0Var5;
                zrVar = zrVar;
            } catch (Throwable th2) {
                th = th2;
                r4 = hq0Var5;
            }
        }
        pj pjVar = gq0Var.e;
        pjVar.getClass();
        t00Var = (t00) pjVar.k(bw.ae);
        r8 = hq0Var2;
        r9 = zrVar;
        r102 = r10;
        r4 = r8;
        t00Var2 = t00Var;
        r1 = r102;
        zrVar = r9;
        do {
            objT = r4.t(zrVar);
            jqVar = pk.g;
            yjVar = yj.d;
            if (objT == jqVar) {
            }
            r4.f(zrVar);
            throw th;
        } while (r4.h(zrVar, gq0Var) != yjVar);
    }

    @Override // defpackage.yr
    public final Object b(zr zrVar, ji jiVar) throws Throwable {
        k(this, zrVar, jiVar);
        return yj.d;
    }

    @Override // defpackage.sv
    public final yr c(pj pjVar, int i, m9 m9Var) {
        return ((i == 0 || i == -3) && m9Var == m9.d) ? this : new db(this, pjVar, i, m9Var);
    }

    @Override // defpackage.af
    public final ag d() {
        iq0 iq0Var = new iq0();
        iq0Var.a = -1L;
        return iq0Var;
    }

    @Override // defpackage.af
    public final ag[] e() {
        return new iq0[2];
    }

    public final Object h(iq0 iq0Var, gq0 gq0Var) {
        la laVar = new la(1, f00.x(gq0Var));
        laVar.t();
        synchronized (this) {
            try {
                if (s(iq0Var) < 0) {
                    iq0Var.b = laVar;
                } else {
                    laVar.h(wz0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objS = laVar.s();
        return objS == yj.d ? objS : wz0.a;
    }

    @Override // defpackage.zr
    public final Object i(Object obj, ji jiVar) throws Throwable {
        Throwable th;
        ji[] jiVarArrN;
        fq0 fq0Var;
        if (q(obj)) {
            return wz0.a;
        }
        la laVar = new la(1, f00.x(jiVar));
        laVar.t();
        ji[] jiVarArrN2 = pk.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        laVar.h(wz0.a);
                        jiVarArrN = n(jiVarArrN2);
                        fq0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        fq0 fq0Var2 = new fq0(this, o() + ((long) (this.n + this.o)), obj, laVar);
                        m(fq0Var2);
                        this.o++;
                        if (this.i == 0) {
                            jiVarArrN2 = n(jiVarArrN2);
                        }
                        jiVarArrN = jiVarArrN2;
                        fq0Var = fq0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (fq0Var != null) {
                    laVar.w(new ga(1, fq0Var));
                }
                for (ji jiVar2 : jiVarArrN) {
                    if (jiVar2 != null) {
                        jiVar2.h(wz0.a);
                    }
                }
                Object objS = laVar.s();
                yj yjVar = yj.d;
                if (objS != yjVar) {
                    objS = wz0.a;
                }
                return objS == yjVar ? objS : wz0.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void j() {
        if (this.i != 0 || this.o > 1) {
            Object[] objArr = this.k;
            objArr.getClass();
            while (this.o > 0) {
                long jO = o();
                int i = this.n;
                int i2 = this.o;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != pk.g) {
                    return;
                }
                this.o = i2 - 1;
                pk.n(objArr, o() + ((long) (this.n + this.o)), null);
            }
        }
    }

    public final void l() {
        ag[] agVarArr;
        Object[] objArr = this.k;
        objArr.getClass();
        pk.n(objArr, o(), null);
        this.n--;
        long jO = o() + 1;
        if (this.l < jO) {
            this.l = jO;
        }
        if (this.m < jO) {
            if (this.e != 0 && (agVarArr = this.d) != null) {
                for (ag agVar : agVarArr) {
                    if (agVar != null) {
                        iq0 iq0Var = (iq0) agVar;
                        long j = iq0Var.a;
                        if (j >= 0 && j < jO) {
                            iq0Var.a = jO;
                        }
                    }
                }
            }
            this.m = jO;
        }
    }

    public final void m(Object obj) {
        int i = this.n + this.o;
        Object[] objArrP = this.k;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        pk.n(objArrP, o() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ji[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final ji[] n(ji[] jiVarArr) {
        ag[] agVarArr;
        iq0 iq0Var;
        la laVar;
        int length = jiVarArr.length;
        if (this.e != 0 && (agVarArr = this.d) != null) {
            int length2 = agVarArr.length;
            int i = 0;
            jiVarArr = jiVarArr;
            while (i < length2) {
                ag agVar = agVarArr[i];
                if (agVar != null && (laVar = (iq0Var = (iq0) agVar).b) != null && s(iq0Var) >= 0) {
                    int length3 = jiVarArr.length;
                    jiVarArr = jiVarArr;
                    if (length >= length3) {
                        jiVarArr = Arrays.copyOf((Object[]) jiVarArr, Math.max(2, jiVarArr.length * 2));
                    }
                    ((ji[]) jiVarArr)[length] = laVar;
                    iq0Var.b = null;
                    length++;
                }
                i++;
                jiVarArr = jiVarArr;
            }
        }
        return (ji[]) jiVarArr;
    }

    public final long o() {
        return Math.min(this.m, this.l);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            wc.q("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.k = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                pk.n(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        ji[] jiVarArrN = pk.a;
        synchronized (this) {
            if (r(obj)) {
                jiVarArrN = n(jiVarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (ji jiVar : jiVarArrN) {
            if (jiVar != null) {
                jiVar.h(wz0.a);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Object obj) {
        int i = this.e;
        int i2 = this.h;
        if (i != 0) {
            int i3 = this.n;
            int i4 = this.i;
            if (i3 < i4 || this.m > this.l) {
                m(obj);
                int i5 = this.n + 1;
                this.n = i5;
                if (i5 > i4) {
                    l();
                }
                long jO = o() + ((long) this.n);
                long j = this.l;
                if (((int) (jO - j)) > i2) {
                    u(1 + j, this.m, o() + ((long) this.n), o() + ((long) this.n) + ((long) this.o));
                }
            } else {
                int iOrdinal = this.j.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wc.l();
                        return false;
                    }
                }
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.n + 1;
            this.n = i6;
            if (i6 > i2) {
                l();
            }
            this.m = o() + ((long) this.n);
            return true;
        }
        return true;
    }

    public final long s(iq0 iq0Var) {
        long j = iq0Var.a;
        if (j < o() + ((long) this.n)) {
            return j;
        }
        if (this.i <= 0 && j <= o() && this.o != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(iq0 iq0Var) {
        Object obj;
        ji[] jiVarArrV = pk.a;
        synchronized (this) {
            try {
                long jS = s(iq0Var);
                if (jS < 0) {
                    obj = pk.g;
                } else {
                    long j = iq0Var.a;
                    Object[] objArr = this.k;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof fq0) {
                        obj2 = ((fq0) obj2).f;
                    }
                    iq0Var.a = jS + 1;
                    Object obj3 = obj2;
                    jiVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ji jiVar : jiVarArrV) {
            if (jiVar != null) {
                jiVar.h(wz0.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.k;
            objArr.getClass();
            pk.n(objArr, jO, null);
        }
        this.l = j;
        this.m = j2;
        this.n = (int) (j3 - jMin);
        this.o = (int) (j4 - j3);
    }

    public final ji[] v(long j) {
        long j2;
        long j3;
        long j4;
        ji[] jiVarArr;
        ji[] jiVarArr2;
        ag[] agVarArr;
        jq jqVar = pk.g;
        ji[] jiVarArr3 = pk.a;
        if (j <= this.m) {
            long jO = o();
            long j5 = ((long) this.n) + jO;
            int i = this.i;
            if (i == 0 && this.o > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (agVarArr = this.d) != null) {
                for (ag agVar : agVarArr) {
                    if (agVar != null) {
                        long j6 = ((iq0) agVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.m) {
                long jO2 = o() + ((long) this.n);
                int i3 = this.e;
                int iMin = this.o;
                if (i3 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i - ((int) (jO2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.o) + jO2;
                if (iMin > 0) {
                    Object[] objArr = this.k;
                    objArr.getClass();
                    j3 = jO;
                    ji[] jiVarArr4 = new ji[iMin];
                    long j8 = jO2;
                    while (true) {
                        if (jO2 >= j7) {
                            jiVarArr2 = jiVarArr4;
                            j4 = j5;
                            break;
                        }
                        jiVarArr2 = jiVarArr4;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != jqVar) {
                            obj.getClass();
                            fq0 fq0Var = (fq0) obj;
                            j4 = j5;
                            int i4 = i2 + 1;
                            jiVarArr2[i2] = fq0Var.g;
                            pk.n(objArr, jO2, jqVar);
                            pk.n(objArr, j8, fq0Var.f);
                            j8 += j2;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j4 = j5;
                        }
                        jO2 += j2;
                        jiVarArr4 = jiVarArr2;
                        j5 = j4;
                    }
                    jO2 = j8;
                    jiVarArr = jiVarArr2;
                } else {
                    j3 = jO;
                    j4 = j5;
                    jiVarArr = jiVarArr3;
                }
                int i5 = (int) (jO2 - j3);
                long j9 = this.e == 0 ? jO2 : j4;
                long jMax = Math.max(this.l, jO2 - ((long) Math.min(this.h, i5)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.k;
                    objArr2.getClass();
                    if (f00.h(objArr2[((int) jMax) & (objArr2.length - 1)], jqVar)) {
                        jO2 += j2;
                        jMax += j2;
                    }
                }
                u(jMax, j9, jO2, j7);
                j();
                return jiVarArr.length == 0 ? jiVarArr : n(jiVarArr);
            }
        }
        return jiVarArr3;
    }
}
