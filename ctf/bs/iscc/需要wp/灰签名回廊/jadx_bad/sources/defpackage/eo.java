package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class eo extends rj0 implements gv {
    public Object f;
    public Serializable g;
    public yt0 h;
    public wi0 i;
    public ey0 j;
    public pg0 k;
    public boolean l;
    public float m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ x10 p;
    public final /* synthetic */ wc0 q;
    public final /* synthetic */ x10 r;
    public final /* synthetic */ x10 s;
    public final /* synthetic */ x10 t;
    public final /* synthetic */ x10 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eo(pu puVar, wc0 wc0Var, gv gvVar, gv gvVar2, pu puVar2, cv cvVar, ji jiVar) {
        super(jiVar);
        this.p = (x10) puVar;
        this.q = wc0Var;
        this.r = (x10) gvVar;
        this.s = (x10) gvVar2;
        this.t = (x10) puVar2;
        this.u = (x10) cvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((eo) k((ji) obj2, (yt0) obj)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        eo eoVar = new eo(this.p, this.q, this.r, this.s, this.t, this.u, jiVar);
        eoVar.o = obj;
        return eoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e8, code lost:
    
        if (defpackage.go.d(r5.i.w, r2) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        if (r8 != r13) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x038d, code lost:
    
        if ((r2 != null ? r2 == defpackage.wc0.d ? defpackage.xa0.e(r8) : defpackage.xa0.d(r8) : defpackage.xa0.c(r8)) == 0.0f) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r6 == r13) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:137:0x034c, B:148:0x0371], limit reached: 170 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[PHI: r1 r2 r3 r4 r5 r6 r8 r9 r10 r12 r15
      0x013e: PHI (r1v20 float) = (r1v21 float), (r1v38 float) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r2v7 jg0) = (r2v34 jg0), (r2v0 jg0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r3v5 wc0) = (r3v37 wc0), (r3v0 wc0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r4v20 wi0) = (r4v30 wi0), (r4v50 wi0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r5v8 yt0) = (r5v11 yt0), (r5v31 yt0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r6v10 yt0) = (r6v13 yt0), (r6v22 yt0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r8v10 pg0) = (r8v13 pg0), (r8v29 pg0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r9v4 wi0) = (r9v5 wi0), (r9v15 wi0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r10v4 int) = (r10v22 int), (r10v0 int) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r12v2 ey0) = (r12v3 ey0), (r12v12 ey0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r15v0 java.lang.Object) = (r15v3 java.lang.Object), (r15v6 java.lang.Object) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Type inference failed for: r1v12, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28, types: [cv, x10] */
    /* JADX WARN: Type inference failed for: r1v29, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [gv] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0299 -> B:107:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0312 -> B:125:0x0315). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f6 -> B:31:0x00fa). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        yt0 yt0Var;
        Object objB;
        yt0 yt0Var2;
        pg0 pg0Var;
        boolean zBooleanValue;
        Object objB2;
        pg0 pg0Var2;
        wi0 wi0Var;
        jg0 jg0Var;
        wc0 wc0Var;
        wi0 wi0Var2;
        long j;
        long j2;
        long j3;
        float fD;
        wi0 wi0Var3;
        ey0 ey0Var;
        wi0 wi0Var4;
        pg0 pg0Var3;
        yt0 yt0Var3;
        Object objA;
        int size;
        Object obj2;
        pg0 pg0Var4;
        float fAbs;
        xa0 xa0Var;
        long jH;
        Object obj3;
        int i;
        pg0 pg0Var5;
        ?? r6;
        ?? r1;
        Object obj4;
        Object obj5;
        int i2 = this.n;
        jg0 jg0Var2 = jg0.e;
        wc0 wc0Var2 = this.q;
        int i3 = 2;
        int i4 = 0;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(obj);
            yt0Var = (yt0) this.o;
            this.o = yt0Var;
            this.n = 1;
            objB = su0.b(yt0Var, false, jg0.d, this);
            if (objB != yjVar) {
            }
            return yjVar;
        }
        if (i2 == 1) {
            yt0Var = (yt0) this.o;
            i60.az(obj);
            objB = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    fD = this.m;
                    ey0 ey0Var2 = this.j;
                    wi0 wi0Var5 = this.i;
                    yt0 yt0Var4 = this.h;
                    wi0 wi0Var6 = (wi0) this.g;
                    pg0 pg0Var6 = (pg0) this.f;
                    yt0 yt0Var5 = (yt0) this.o;
                    i60.az(obj);
                    ey0Var = ey0Var2;
                    wi0Var3 = wi0Var5;
                    yt0Var2 = yt0Var4;
                    yt0Var3 = yt0Var5;
                    wi0Var4 = wi0Var6;
                    pg0Var3 = pg0Var6;
                    objA = obj;
                    ig0 ig0Var = (ig0) objA;
                    ?? r7 = ig0Var.a;
                    size = r7.size();
                    while (true) {
                        if (i4 < size) {
                        }
                        i4 = i + 1;
                        wc0Var2 = wc0Var;
                        jg0Var2 = jg0Var;
                    }
                    pg0Var4 = (pg0) obj2;
                    if (pg0Var4 != null) {
                        if (d41.m(pg0Var4)) {
                        }
                        wc0Var2 = wc0Var;
                        jg0Var2 = jg0Var;
                        i4 = 0;
                        this.o = yt0Var3;
                        this.f = pg0Var3;
                        this.g = wi0Var4;
                        this.h = yt0Var2;
                        this.i = wi0Var3;
                        this.j = ey0Var;
                        this.k = null;
                        this.m = fD;
                        this.n = 3;
                        objA = yt0Var2.a(jg0Var2, this);
                        if (objA != yjVar) {
                        }
                        return yjVar;
                    }
                    yt0Var2 = yt0Var3;
                    pg0Var2 = pg0Var3;
                    wi0Var = wi0Var4;
                    pg0Var = null;
                    if (pg0Var != null) {
                    }
                    wi0Var2 = wi0Var;
                    j = wi0Var.d;
                    if (pg0Var != null) {
                    }
                    return wz0.a;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wi0 wi0Var7 = this.i;
                    yt0 yt0Var6 = this.h;
                    wc0 wc0Var3 = (wc0) this.g;
                    gv gvVar = (gv) this.f;
                    yt0 yt0Var7 = (yt0) this.o;
                    i60.az(obj);
                    jg0 jg0Var3 = jg0Var2;
                    wc0 wc0Var4 = wc0Var3;
                    Object objA2 = obj;
                    ?? r62 = gvVar;
                    ig0 ig0Var2 = (ig0) objA2;
                    ?? r9 = ig0Var2.a;
                    int size2 = r9.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            jg0Var = jg0Var3;
                            obj4 = null;
                            break;
                        }
                        Object obj6 = r9.get(i5);
                        jg0Var = jg0Var3;
                        if (og0.a(((pg0) obj6).a, wi0Var7.d)) {
                            obj4 = obj6;
                            break;
                        }
                        i5++;
                        jg0Var3 = jg0Var;
                    }
                    pg0 pg0Var7 = (pg0) obj4;
                    if (pg0Var7 == null) {
                        pg0Var7 = null;
                    } else if (d41.m(pg0Var7)) {
                        ?? r4 = ig0Var2.a;
                        int size3 = r4.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = r4.get(i6);
                            if (((pg0) obj5).d) {
                                break;
                            }
                            i6++;
                        }
                        pg0 pg0Var8 = (pg0) obj5;
                        if (pg0Var8 != null) {
                            wi0Var7.d = pg0Var8.a;
                            r6 = r62;
                            this.o = yt0Var7;
                            this.f = r6;
                            this.g = wc0Var4;
                            this.h = yt0Var6;
                            this.i = wi0Var7;
                            this.j = null;
                            this.k = null;
                            this.n = 5;
                            jg0Var3 = jg0Var;
                            objA2 = yt0Var6.a(jg0Var3, this);
                            r62 = r6;
                        }
                    } else {
                        long jAi = d41.ai(pg0Var7, true);
                        r6 = r62;
                    }
                    if (pg0Var7 == null || pg0Var7.b()) {
                        pg0Var5 = null;
                    } else if (d41.m(pg0Var7)) {
                        pg0Var5 = pg0Var7;
                    } else {
                        r62.f(pg0Var7, new xa0(d41.ai(pg0Var7, false)));
                        pg0Var7.a();
                        wc0Var = wc0Var4;
                        r1 = r62;
                        yt0Var2 = yt0Var7;
                        j2 = pg0Var7.a;
                        wi0 wi0Var8 = new wi0();
                        wi0Var8.d = j2;
                        r6 = r1;
                        wi0Var7 = wi0Var8;
                        yt0Var6 = yt0Var2;
                        yt0Var7 = yt0Var6;
                        wc0Var4 = wc0Var;
                        this.o = yt0Var7;
                        this.f = r6;
                        this.g = wc0Var4;
                        this.h = yt0Var6;
                        this.i = wi0Var7;
                        this.j = null;
                        this.k = null;
                        this.n = 5;
                        jg0Var3 = jg0Var;
                        objA2 = yt0Var6.a(jg0Var3, this);
                        r62 = r6;
                    }
                    if (pg0Var5 == null) {
                        this.t.a();
                    } else {
                        this.u.g(pg0Var5);
                    }
                    return wz0.a;
                }
                fD = this.m;
                pg0Var4 = this.k;
                ey0 ey0Var3 = this.j;
                wi0Var3 = this.i;
                yt0Var2 = this.h;
                wi0 wi0Var9 = (wi0) this.g;
                pg0 pg0Var9 = (pg0) this.f;
                yt0 yt0Var8 = (yt0) this.o;
                i60.az(obj);
                jg0Var = jg0Var2;
                wc0Var = wc0Var2;
                wi0Var4 = wi0Var9;
                yt0Var3 = yt0Var8;
                pg0Var3 = pg0Var9;
                ey0Var = ey0Var3;
                if (pg0Var4.b()) {
                    yt0Var2 = yt0Var3;
                    pg0Var2 = pg0Var3;
                    wi0Var = wi0Var4;
                    pg0Var = null;
                    if (pg0Var != null || pg0Var.b()) {
                        wi0Var2 = wi0Var;
                        j = wi0Var.d;
                        if (pg0Var != null) {
                            this.r.f(pg0Var, new xa0(j));
                            xa0 xa0Var2 = new xa0(wi0Var2.d);
                            ?? r12 = this.s;
                            r12.f(pg0Var, xa0Var2);
                            j2 = pg0Var.a;
                            r1 = r12;
                        }
                        return wz0.a;
                    }
                    wc0Var2 = wc0Var;
                    jg0Var2 = jg0Var;
                    i3 = 2;
                    i4 = 0;
                    j3 = pg0Var2.a;
                    int i7 = pg0Var2.i;
                    if (!go.d(yt0Var2.i.w, j3)) {
                        jg0Var = jg0Var2;
                        wc0Var = wc0Var2;
                        pg0Var = null;
                        if (pg0Var != null) {
                        }
                        wi0Var2 = wi0Var;
                        j = wi0Var.d;
                        if (pg0Var != null) {
                        }
                        return wz0.a;
                    }
                    i11 i11VarF = yt0Var2.f();
                    if (i7 == i3) {
                        fD = i11VarF.d() * go.a;
                        wi0Var3 = new wi0();
                        wi0Var3.d = j3;
                        ey0Var = new ey0(wc0Var2);
                        wi0Var4 = wi0Var;
                        pg0Var3 = pg0Var2;
                        yt0Var3 = yt0Var2;
                    } else {
                        fD = i11VarF.d();
                        wi0Var3 = new wi0();
                        wi0Var3.d = j3;
                        ey0Var = new ey0(wc0Var2);
                        wi0Var4 = wi0Var;
                        pg0Var3 = pg0Var2;
                        yt0Var3 = yt0Var2;
                    }
                    this.o = yt0Var3;
                    this.f = pg0Var3;
                    this.g = wi0Var4;
                    this.h = yt0Var2;
                    this.i = wi0Var3;
                    this.j = ey0Var;
                    this.k = null;
                    this.m = fD;
                    this.n = 3;
                    objA = yt0Var2.a(jg0Var2, this);
                    if (objA != yjVar) {
                        ig0 ig0Var3 = (ig0) objA;
                        ?? r72 = ig0Var3.a;
                        size = r72.size();
                        while (true) {
                            if (i4 < size) {
                                jg0Var = jg0Var2;
                                wc0Var = wc0Var2;
                                obj2 = null;
                                break;
                            }
                            Object obj7 = r72.get(i4);
                            i = i4;
                            jg0Var = jg0Var2;
                            wc0Var = wc0Var2;
                            if (og0.a(((pg0) obj7).a, wi0Var3.d)) {
                                obj2 = obj7;
                                break;
                            }
                            i4 = i + 1;
                            wc0Var2 = wc0Var;
                            jg0Var2 = jg0Var;
                        }
                        pg0Var4 = (pg0) obj2;
                        if (pg0Var4 != null && !pg0Var4.b()) {
                            if (d41.m(pg0Var4)) {
                                ey0Var.getClass();
                                wc0 wc0Var5 = ey0Var.a;
                                wi0 wi0Var10 = wi0Var3;
                                long jG = xa0.g(ey0Var.b, xa0.f(pg0Var4.c, pg0Var4.g));
                                ey0Var.b = jG;
                                wc0 wc0Var6 = wc0.e;
                                if (wc0Var5 != null) {
                                    fAbs = Math.abs(wc0Var5 == wc0Var6 ? xa0.d(jG) : xa0.e(jG));
                                } else {
                                    fAbs = xa0.c(jG);
                                }
                                if (fAbs >= fD) {
                                    long j4 = ey0Var.b;
                                    if (wc0Var5 != null) {
                                        float fD2 = wc0Var5 == wc0Var6 ? xa0.d(j4) : xa0.e(j4);
                                        long j5 = ey0Var.b;
                                        float fSignum = fD2 - (Math.signum(wc0Var5 == wc0Var6 ? xa0.d(j5) : xa0.e(j5)) * fD);
                                        long j6 = ey0Var.b;
                                        float fE = wc0Var5 == wc0Var6 ? xa0.e(j6) : xa0.d(j6);
                                        jH = wc0Var5 == wc0Var6 ? d41.h(fSignum, fE) : d41.h(fE, fSignum);
                                    } else {
                                        float fC = xa0.c(j4);
                                        jH = xa0.f(ey0Var.b, xa0.h((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) / fC)) << 32), fD));
                                    }
                                    xa0Var = new xa0(jH);
                                } else {
                                    xa0Var = null;
                                }
                                if (xa0Var != null) {
                                    long j7 = xa0Var.a;
                                    pg0Var4.a();
                                    wi0Var4.d = j7;
                                    if (pg0Var4.b()) {
                                        yt0Var2 = yt0Var3;
                                        pg0Var2 = pg0Var3;
                                        wi0Var = wi0Var4;
                                        pg0Var = pg0Var4;
                                        if (pg0Var != null) {
                                        }
                                        wi0Var2 = wi0Var;
                                        j = wi0Var.d;
                                        if (pg0Var != null) {
                                        }
                                        return wz0.a;
                                    }
                                    ey0Var.b = 0L;
                                    wi0Var3 = wi0Var10;
                                } else {
                                    this.o = yt0Var3;
                                    this.f = pg0Var3;
                                    this.g = wi0Var4;
                                    this.h = yt0Var2;
                                    this.i = wi0Var10;
                                    this.j = ey0Var;
                                    this.k = pg0Var4;
                                    this.m = fD;
                                    this.n = 4;
                                    if (yt0Var2.a(jg0.f, this) != yjVar) {
                                        wi0Var3 = wi0Var10;
                                        if (pg0Var4.b()) {
                                        }
                                    }
                                }
                            } else {
                                ?? r2 = ig0Var3.a;
                                int size4 = r2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = r2.get(i8);
                                    if (((pg0) obj3).d) {
                                        break;
                                    }
                                    i8++;
                                }
                                pg0 pg0Var10 = (pg0) obj3;
                                if (pg0Var10 != null) {
                                    wi0Var3.d = pg0Var10.a;
                                    wi0Var3 = wi0Var3;
                                }
                            }
                        }
                        yt0Var2 = yt0Var3;
                        pg0Var2 = pg0Var3;
                        wi0Var = wi0Var4;
                        pg0Var = null;
                        if (pg0Var != null) {
                        }
                        wi0Var2 = wi0Var;
                        j = wi0Var.d;
                        if (pg0Var != null) {
                        }
                        return wz0.a;
                    }
                    return yjVar;
                }
                wc0Var2 = wc0Var;
                jg0Var2 = jg0Var;
                i4 = 0;
                this.o = yt0Var3;
                this.f = pg0Var3;
                this.g = wi0Var4;
                this.h = yt0Var2;
                this.i = wi0Var3;
                this.j = ey0Var;
                this.k = null;
                this.m = fD;
                this.n = 3;
                objA = yt0Var2.a(jg0Var2, this);
                if (objA != yjVar) {
                }
                return yjVar;
            }
            zBooleanValue = this.l;
            pg0Var = (pg0) this.f;
            yt0Var2 = (yt0) this.o;
            i60.az(obj);
            objB2 = obj;
            pg0Var2 = (pg0) objB2;
            wi0Var = new wi0();
            wi0Var.d = 0L;
            if (!zBooleanValue) {
                jg0Var = jg0Var2;
                wc0Var = wc0Var2;
                wi0Var2 = wi0Var;
                j = 0;
                if (pg0Var != null) {
                }
                return wz0.a;
            }
            j3 = pg0Var2.a;
            int i72 = pg0Var2.i;
            if (!go.d(yt0Var2.i.w, j3)) {
            }
        }
        yt0Var2 = yt0Var;
        pg0Var = (pg0) objB;
        zBooleanValue = ((Boolean) this.p.a()).booleanValue();
        if (!zBooleanValue) {
            pg0Var.a();
        }
        this.o = yt0Var2;
        this.f = pg0Var;
        this.l = zBooleanValue;
        this.n = 2;
        objB2 = su0.b(yt0Var2, (2 & 1) != 0, jg0.e, this);
    }
}
