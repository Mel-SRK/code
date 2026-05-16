package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class v80 extends xq0 {
    public static final int[] n = new int[0];
    public final cv e;
    public final cv f;
    public int g;
    public r80 h;
    public ArrayList i;
    public cr0 j;
    public int[] k;
    public int l;
    public boolean m;

    public v80(long j, cr0 cr0Var, cv cvVar, cv cvVar2) {
        super(j, cr0Var);
        this.e = cvVar;
        this.f = cvVar2;
        this.j = cr0.h;
        this.k = n;
        this.l = 1;
    }

    public final void aa(long j) {
        synchronized (fr0.c) {
            this.j = this.j.e(j);
        }
    }

    public void ab(r80 r80Var) {
        this.h = r80Var;
    }

    public v80 ac(cv cvVar, cv cvVar2) throws Throwable {
        if (this.c) {
            dh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        aa(g());
        Object obj = fr0.c;
        synchronized (obj) {
            try {
                long j = fr0.e;
                long j2 = 1;
                fr0.e = j + j2;
                fr0.d = fr0.d.e(j);
                cr0 cr0VarD = d();
                r(cr0VarD.e(j));
                try {
                    s90 s90Var = new s90(j, fr0.e(cr0VarD, g() + j2, j), fr0.l(cvVar, e(), true), fr0.b(cvVar2, i()), this);
                    if (this.m || this.c) {
                        return s90Var;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j3 = fr0.e;
                        fr0.e = j3 + j2;
                        s(j3);
                        fr0.d = fr0.d.e(g());
                    }
                    r(fr0.e(d(), jG + j2, g()));
                    return s90Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.xq0
    public final void b() {
        fr0.d = fr0.d.b(g()).a(this.j);
    }

    @Override // defpackage.xq0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (fr0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.xq0
    public boolean f() {
        return false;
    }

    @Override // defpackage.xq0
    public int h() {
        return this.g;
    }

    @Override // defpackage.xq0
    public cv i() {
        return this.f;
    }

    @Override // defpackage.xq0
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.xq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.dh0.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            r80 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.dh0.b(r2)
        L27:
            r2 = 0
            r0.ab(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            ts0 r13 = (defpackage.ts0) r13
            vs0 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            cr0 r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.kc.aq(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            dr0 r6 = defpackage.fr0.a
            r14 = 0
            r13.a = r14
        L83:
            vs0 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v80.l():void");
    }

    @Override // defpackage.xq0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.xq0
    public void n(ts0 ts0Var) {
        r80 r80VarX = x();
        if (r80VarX == null) {
            int i = nm0.a;
            r80VarX = new r80();
            ab(r80VarX);
        }
        r80VarX.a(ts0Var);
    }

    @Override // defpackage.xq0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            fr0.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.xq0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.xq0
    public xq0 u(cv cvVar) throws Throwable {
        if (this.c) {
            dh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        aa(g());
        Object obj = fr0.c;
        synchronized (obj) {
            try {
                long j = fr0.e;
                long j2 = 1;
                fr0.e = j + j2;
                fr0.d = fr0.d.e(j);
                try {
                    t90 t90Var = new t90(j, fr0.e(d(), jG + j2, j), fr0.l(cvVar, e(), true), this);
                    if (this.m || this.c) {
                        return t90Var;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j3 = fr0.e;
                        fr0.e = j3 + j2;
                        s(j3);
                        fr0.d = fr0.d.e(g());
                    }
                    r(fr0.e(d(), jG2 + j2, g()));
                    return t90Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        aa(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (fr0.c) {
            long j2 = fr0.e;
            j = 1;
            fr0.e = j2 + j;
            s(j2);
            fr0.d = fr0.d.e(g());
        }
        r(fr0.e(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.wo0 w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v80.w():wo0");
    }

    public r80 x() {
        return this.h;
    }

    @Override // defpackage.xq0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public cv e() {
        return this.e;
    }

    public final wo0 z(long j, r80 r80Var, HashMap map, cr0 cr0Var) {
        ArrayList arrayList;
        ArrayList arrayListAz;
        ArrayList arrayList2;
        cr0 cr0Var2;
        Object[] objArr;
        long[] jArr;
        cr0 cr0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        vs0 vs0VarB;
        cr0 cr0VarD = d().e(g()).d(this.j);
        Object[] objArr3 = r80Var.b;
        long[] jArr3 = r80Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListAz = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ts0 ts0Var = (ts0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            vs0 vs0VarA = ts0Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            vs0 vs0VarS = fr0.s(vs0VarA, j, cr0Var);
                            if (vs0VarS == null) {
                                cr0Var3 = cr0VarD;
                                arrayList3 = arrayListAz;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListAz;
                                j2 = j3;
                                vs0 vs0VarS2 = fr0.s(vs0VarA, g(), cr0VarD);
                                if (vs0VarS2 == null) {
                                    cr0Var3 = cr0VarD;
                                } else {
                                    cr0Var3 = cr0VarD;
                                    if (vs0VarS2.a != 1 && !vs0VarS.equals(vs0VarS2)) {
                                        vs0 vs0VarS3 = fr0.s(vs0VarA, g(), d());
                                        if (vs0VarS3 == null) {
                                            fr0.r();
                                            throw null;
                                        }
                                        if (map == null || (vs0VarB = (vs0) map.get(vs0VarS)) == null) {
                                            vs0VarB = ts0Var.b(vs0VarS2, vs0VarS, vs0VarS3);
                                        }
                                        if (vs0VarB == null) {
                                            return new yq0();
                                        }
                                        if (!vs0VarB.equals(vs0VarS3)) {
                                            if (vs0VarB.equals(vs0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new ae0(ts0Var, vs0VarS.b(g())));
                                                arrayListAz = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListAz.add(ts0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!vs0VarB.equals(vs0VarS2) ? new ae0(ts0Var, vs0VarB) : new ae0(ts0Var, vs0VarS2.b(g())));
                                            }
                                        }
                                        arrayListAz = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListAz = arrayList3;
                        } else {
                            cr0Var3 = cr0VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        cr0VarD = cr0Var3;
                    }
                    cr0Var2 = cr0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    cr0Var2 = cr0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                cr0VarD = cr0Var2;
            }
        } else {
            arrayList = null;
            arrayListAz = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ae0 ae0Var = (ae0) arrayList2.get(i5);
                ts0 ts0Var2 = (ts0) ae0Var.d;
                vs0 vs0Var = (vs0) ae0Var.e;
                vs0Var.a = j;
                synchronized (fr0.c) {
                    vs0Var.b = ts0Var2.a();
                    ts0Var2.c(vs0Var);
                }
            }
        }
        if (arrayListAz != null) {
            int size2 = arrayListAz.size();
            for (int i6 = 0; i6 < size2; i6++) {
                r80Var.k((ts0) arrayListAz.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListAz = kc.az(arrayList6, arrayListAz);
            }
            this.i = arrayListAz;
        }
        return zq0.a;
    }
}
