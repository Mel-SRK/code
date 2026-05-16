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
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(defpackage.hq0 r8, defpackage.zr r9, defpackage.ji r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.gq0
            if (r0 == 0) goto L13
            r0 = r10
            gq0 r0 = (defpackage.gq0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            gq0 r0 = new gq0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            int r1 = r0.m
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            t00 r8 = r0.j
            iq0 r9 = r0.i
            zr r1 = r0.h
            hq0 r4 = r0.g
            defpackage.i60.az(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L73
        L36:
            r8 = move-exception
            goto Lb3
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r8)
            return
        L3f:
            t00 r8 = r0.j
            iq0 r9 = r0.i
            zr r1 = r0.h
            hq0 r4 = r0.g
            defpackage.i60.az(r10)     // Catch: java.lang.Throwable -> L36
            goto L76
        L4b:
            iq0 r9 = r0.i
            zr r8 = r0.h
            hq0 r1 = r0.g
            defpackage.i60.az(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb3
        L5a:
            defpackage.i60.az(r10)
            ag r10 = r8.a()
            iq0 r10 = (defpackage.iq0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            pj r1 = r0.e     // Catch: java.lang.Throwable -> Lb0
            r1.getClass()     // Catch: java.lang.Throwable -> Lb0
            bw r4 = defpackage.bw.ae     // Catch: java.lang.Throwable -> Lb0
            nj r1 = r1.k(r4)     // Catch: java.lang.Throwable -> Lb0
            t00 r1 = (defpackage.t00) r1     // Catch: java.lang.Throwable -> Lb0
        L73:
            r4 = r8
            r8 = r1
            r1 = r10
        L76:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            jq r5 = defpackage.pk.g     // Catch: java.lang.Throwable -> L36
            yj r6 = defpackage.yj.d
            if (r10 != r5) goto L91
            r0.g = r4     // Catch: java.lang.Throwable -> L36
            r0.h = r1     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.j = r8     // Catch: java.lang.Throwable -> L36
            r0.m = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L76
            goto Laf
        L91:
            if (r8 == 0) goto L9f
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9a
            goto L9f
        L9a:
            java.util.concurrent.CancellationException r8 = r8.q()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9f:
            r0.g = r4     // Catch: java.lang.Throwable -> L36
            r0.h = r1     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.j = r8     // Catch: java.lang.Throwable -> L36
            r0.m = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Laf:
            return
        Lb0:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb3:
            r4.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq0.k(hq0, zr, ji):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.e
            int r2 = r12.h
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.m(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.n
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.m = r1
            return r9
        L23:
            int r1 = r12.n
            int r3 = r12.i
            if (r1 < r3) goto L46
            long r4 = r12.m
            long r6 = r12.l
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            m9 r1 = r12.j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7e
        L3f:
            defpackage.wc.l()
            r1 = 0
            return r1
        L44:
            r1 = 0
            return r1
        L46:
            r12.m(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r3) goto L53
            r12.l()
        L53:
            long r3 = r12.o()
            int r1 = r12.n
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.l
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.m
            long r5 = r12.o()
            int r7 = r12.n
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.n
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.o
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq0.r(java.lang.Object):boolean");
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
