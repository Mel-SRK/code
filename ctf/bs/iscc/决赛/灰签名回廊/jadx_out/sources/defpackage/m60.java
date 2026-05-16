package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m60 {
    public final s20 a;
    public boolean c;
    public boolean d;
    public dh i;
    public final o6 b = new o6(3);
    public final f1 e = new f1(12);
    public final a90 f = new a90(new s20[16]);
    public final long g = 1;
    public final a90 h = new a90(new l60[16]);

    public m60(s20 s20Var) {
        this.a = s20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.s20 r5, defpackage.dh r6) {
        /*
            s20 r0 = r5.j
            v20 r1 = r5.ah
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            q50 r0 = r1.p
            r0.getClass()
            long r3 = r6.a
            boolean r6 = r0.bo(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            q50 r6 = r1.p
            if (r6 == 0) goto L21
            dh r1 = r6.p
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.a
            boolean r6 = r6.bo(r0)
        L2f:
            s20 r0 = r5.q()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            s20 r1 = r0.j
            r3 = 3
            if (r1 != 0) goto L40
            defpackage.s20.ap(r0, r2, r3)
            return r6
        L40:
            q20 r1 = r5.o()
            q20 r4 = defpackage.q20.d
            if (r1 != r4) goto L4c
            defpackage.s20.an(r0, r2, r3)
            return r6
        L4c:
            q20 r5 = r5.o()
            q20 r1 = defpackage.q20.e
            if (r5 != r1) goto L57
            r0.am(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.b(s20, dh):boolean");
    }

    public static boolean c(s20 s20Var, dh dhVar) {
        boolean zAl;
        if (dhVar != null) {
            if (s20Var.ad == q20.f) {
                s20Var.c();
            }
            zAl = s20Var.ah.o.bp(dhVar.a);
        } else {
            zAl = s20.al(s20Var);
        }
        s20 s20VarQ = s20Var.q();
        if (zAl && s20VarQ != null) {
            if (s20Var.n() == q20.d) {
                s20.ap(s20VarQ, false, 3);
                return zAl;
            }
            if (s20Var.n() == q20.e) {
                s20VarQ.ao(false);
            }
        }
        return zAl;
    }

    public static boolean f(s20 s20Var) {
        q50 q50Var;
        t20 t20Var;
        if (s20Var.ah.d) {
            return (s20Var.o() == q20.f && ((q50Var = s20Var.ah.p) == null || (t20Var = q50Var.t) == null || !t20Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean g(s20 s20Var) {
        if (!s20Var.m()) {
            return false;
        }
        do {
            if (s20Var.n() == q20.f && !s20Var.ah.o.z.e()) {
                s20 s20VarQ = s20Var.q();
                if ((s20VarQ != null ? s20VarQ.ah.c : null) != p20.d) {
                    return false;
                }
            }
            s20Var = s20Var.q();
            if (s20Var == null) {
                return false;
            }
        } while (!s20Var.af());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            f1 r1 = r7.e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.e
            a90 r8 = (defpackage.a90) r8
            s20 r2 = r7.a
            int r3 = r2.an
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.am = r0
        L17:
            java.lang.Object r8 = r1.e
            a90 r8 = (defpackage.a90) r8
            int r2 = r8.f
            if (r2 == 0) goto L62
            ht r3 = defpackage.ht.d
            java.lang.Object[] r4 = r8.d
            r5 = 0
            java.util.Arrays.sort(r4, r5, r2, r3)
            int r2 = r8.f
            java.lang.Object r3 = r1.f
            s20[] r3 = (defpackage.s20[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            s20[] r3 = new defpackage.s20[r3]
        L3a:
            r4 = 0
            r1.f = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.d
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            r8.getClass()
            boolean r0 = r8.am
            if (r0 == 0) goto L5b
            defpackage.f1.p(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.a(boolean):void");
    }

    public final void d(s20 s20Var, boolean z) {
        if (!this.c) {
            sy.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? s20Var.ah.d : s20Var.m()) {
            sy.a("node not yet measured");
        }
        e(s20Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.s20 r11, boolean r12) {
        /*
            r10 = this;
            a90 r0 = r11.u()
            java.lang.Object[] r1 = r0.d
            int r0 = r0.f
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto La5
            r4 = r1[r3]
            s20 r4 = (defpackage.s20) r4
            q20 r5 = defpackage.q20.d
            r6 = 1
            if (r12 != 0) goto L28
            q20 r7 = r4.n()
            if (r7 == r5) goto L40
            v20 r7 = r4.ah
            o60 r7 = r7.o
            t20 r7 = r7.z
            boolean r7 = r7.e()
            if (r7 == 0) goto L28
            goto L40
        L28:
            if (r12 == 0) goto La1
            q20 r7 = r4.o()
            if (r7 == r5) goto L40
            v20 r5 = r4.ah
            q50 r5 = r5.p
            if (r5 == 0) goto La1
            t20 r5 = r5.t
            if (r5 == 0) goto La1
            boolean r5 = r5.e()
            if (r5 != r6) goto La1
        L40:
            boolean r5 = defpackage.t1.ai(r4)
            v20 r7 = r4.ah
            if (r5 == 0) goto L85
            if (r12 != 0) goto L85
            boolean r5 = r7.d
            if (r5 == 0) goto L82
            o6 r5 = r10.b
            r5.getClass()
            s20 r8 = r4.j
            if (r8 != 0) goto L59
            r8 = r6
            goto L5a
        L59:
            r8 = r2
        L5a:
            java.lang.Object r9 = r5.a
            bu r9 = (defpackage.bu) r9
            java.lang.Object r9 = r9.e
            wr0 r9 = (defpackage.wr0) r9
            boolean r9 = r9.contains(r4)
            if (r9 != 0) goto L79
            java.lang.Object r5 = r5.b
            bu r5 = (defpackage.bu) r5
            java.lang.Object r5 = r5.e
            wr0 r5 = (defpackage.wr0) r5
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L77
            goto L79
        L77:
            r5 = r2
            goto L7a
        L79:
            r5 = r6
        L7a:
            if (r8 != 0) goto L82
            if (r5 == 0) goto L82
            r10.j(r4, r6, r2)
            goto L85
        L82:
            r10.d(r4, r6)
        L85:
            if (r12 == 0) goto L8a
            boolean r5 = r7.d
            goto L8e
        L8a:
            boolean r5 = r4.m()
        L8e:
            if (r5 == 0) goto L93
            r10.j(r4, r12, r2)
        L93:
            if (r12 == 0) goto L98
            boolean r5 = r7.d
            goto L9c
        L98:
            boolean r5 = r4.m()
        L9c:
            if (r5 != 0) goto La1
            r10.e(r4, r12)
        La1:
            int r3 = r3 + 1
            goto La
        La5:
            if (r12 == 0) goto Lac
            v20 r0 = r11.ah
            boolean r0 = r0.d
            goto Lb0
        Lac:
            boolean r0 = r11.m()
        Lb0:
            if (r0 == 0) goto Lb5
            r10.j(r11, r12, r2)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.e(s20, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [i70] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [i70] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [a90] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean h(y0 y0Var) {
        boolean z;
        i70 i70Var;
        ?? M;
        boolean z2;
        s20 s20Var;
        boolean z3;
        o6 o6Var = this.b;
        s20 s20Var2 = this.a;
        if (!s20Var2.ae()) {
            sy.a("performMeasureAndLayout called with unattached root");
        }
        if (!s20Var2.af()) {
            sy.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            sy.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zT = o6Var.t();
                bu buVar = (bu) o6Var.a;
                if (zT) {
                    z = false;
                    while (true) {
                        bu buVar2 = (bu) o6Var.c;
                        bu buVar3 = (bu) o6Var.b;
                        if (!((wr0) buVar.e).isEmpty()) {
                            s20Var = (s20) ((wr0) buVar.e).first();
                            buVar.m(s20Var);
                            z3 = s20Var.j != null;
                            z2 = false;
                        } else if (!((wr0) buVar3.e).isEmpty()) {
                            s20Var = (s20) ((wr0) buVar3.e).first();
                            buVar3.m(s20Var);
                            z3 = s20Var.j != null;
                            z2 = true;
                        } else {
                            if (((wr0) buVar2.e).isEmpty()) {
                                break;
                            }
                            s20 s20Var3 = (s20) ((wr0) buVar2.e).first();
                            buVar2.m(s20Var3);
                            z2 = true;
                            s20Var = s20Var3;
                            z3 = false;
                        }
                        boolean zJ = j(s20Var, z3, z2);
                        if (!z2) {
                            if (s20Var.ah.e) {
                                o6Var.a(s20Var, n00.e);
                            }
                            if (s20Var.l()) {
                                o6Var.a(s20Var, n00.g);
                            }
                        }
                        if (s20Var == s20Var2 && zJ) {
                            z = true;
                        }
                    }
                    if (y0Var != null) {
                        y0Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        a90 a90Var = this.f;
        Object[] objArr = a90Var.d;
        int i2 = a90Var.f;
        int i3 = 0;
        while (i3 < i2) {
            da0 da0Var = ((s20) objArr[i3]).ag;
            yy yyVar = (yy) da0Var.g;
            boolean zG = ga0.g(128);
            if (zG) {
                i70Var = yyVar.ar;
            } else {
                i70Var = yyVar.ar.h;
                if (i70Var == null) {
                }
                i3++;
                i = 0;
            }
            uj0 uj0Var = fa0.am;
            i70 i70VarF = yyVar.F(zG);
            while (i70VarF != null && (i70VarF.g & 128) != 0) {
                if ((i70VarF.f & 128) != 0) {
                    ?? r13 = i70VarF;
                    ?? a90Var2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof b20) {
                            ((b20) r13).o((yy) da0Var.g);
                        } else {
                            if ((r13.f & 128) != 0 && (r13 instanceof rl)) {
                                i70 i70Var2 = ((rl) r13).s;
                                M = r13;
                                a90Var2 = a90Var2;
                                while (i70Var2 != null) {
                                    if ((i70Var2.f & 128) != 0) {
                                        i++;
                                        a90Var2 = a90Var2;
                                        if (i == 1) {
                                            M = i70Var2;
                                        } else {
                                            if (a90Var2 == 0) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var2.b(M);
                                                M = 0;
                                            }
                                            a90Var2.b(i70Var2);
                                        }
                                    }
                                    i70Var2 = i70Var2.i;
                                    M = M;
                                    a90Var2 = a90Var2;
                                }
                                if (i == 1) {
                                }
                            }
                            i = 0;
                            r13 = M;
                            a90Var2 = a90Var2;
                        }
                        M = pk.m(a90Var2);
                        i = 0;
                        r13 = M;
                        a90Var2 = a90Var2;
                    }
                }
                if (i70VarF != i70Var) {
                    i70VarF = i70VarF.i;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        a90Var.g();
        return z;
    }

    public final void i() {
        o6 o6Var = this.b;
        if (o6Var.t()) {
            s20 s20Var = this.a;
            if (!s20Var.ae()) {
                sy.a("performMeasureAndLayout called with unattached root");
            }
            if (!s20Var.af()) {
                sy.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                sy.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((wr0) ((bu) o6Var.c).e).isEmpty() && !((wr0) ((bu) o6Var.a).e).isEmpty()) {
                        if (s20Var.j != null) {
                            l(s20Var, true);
                        } else {
                            k(s20Var);
                        }
                    }
                    l(s20Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(s20 s20Var, boolean z, boolean z2) {
        dh dhVar;
        boolean zC;
        s20 s20VarQ;
        kf0 placementScope;
        yy yyVar;
        s20 s20VarQ2;
        s20 s20VarQ3;
        q50 q50Var;
        t20 t20Var;
        boolean z3 = s20Var.ao;
        v20 v20Var = s20Var.ah;
        boolean z4 = false;
        Object[] objArr = 0;
        if (z3 || (!s20Var.af() && !v20Var.o.v && !g(s20Var) && !f00.h(s20Var.ag(), Boolean.TRUE) && !f(s20Var) && !v20Var.o.z.e() && ((q50Var = v20Var.p) == null || (t20Var = q50Var.t) == null || !t20Var.e()))) {
            return false;
        }
        s20 s20Var2 = this.a;
        if (s20Var == s20Var2) {
            dhVar = this.i;
            dhVar.getClass();
        } else {
            dhVar = null;
        }
        q20 q20Var = q20.f;
        if (z) {
            zC = v20Var.d ? b(s20Var, dhVar) : false;
            if (z2 && ((zC || v20Var.e) && f00.h(s20Var.ag(), Boolean.TRUE))) {
                if (s20Var.ad == q20Var) {
                    s20Var.d();
                }
                q50 q50Var2 = v20Var.p;
                q50Var2.getClass();
                try {
                    q50Var2.j = true;
                    if (!q50Var2.n) {
                        sy.b("replace() called on item that was not placed");
                    }
                    q50Var2.z = false;
                    boolean zT = q50Var2.t();
                    q50Var2.bn(q50Var2.q, q50Var2.r);
                    if (zT && !q50Var2.z && (s20VarQ3 = q50Var2.i.a.q()) != null) {
                        s20VarQ3.am(false);
                    }
                    q50Var2.j = false;
                } catch (Throwable th) {
                    q50Var2.j = false;
                    throw th;
                }
            }
        } else {
            zC = s20Var.m() ? c(s20Var, dhVar) : false;
            if (z2 && s20Var.l() && (s20Var == s20Var2 || ((s20VarQ2 = s20Var.q()) != null && s20VarQ2.af() && v20Var.o.v))) {
                q20 q20Var2 = s20Var.ad;
                if (s20Var == s20Var2) {
                    if (q20Var2 == q20Var) {
                        s20Var.d();
                    }
                    s20 s20VarQ4 = s20Var.q();
                    if (s20VarQ4 == null || (yyVar = (yy) s20VarQ4.ag.g) == null || (placementScope = yyVar.o) == null) {
                        placementScope = t1.as(s20Var).getPlacementScope();
                    }
                    kf0.j(placementScope, v20Var.o, 0, 0);
                } else {
                    if (q20Var2 == q20Var) {
                        s20Var.d();
                    }
                    o60 o60Var = v20Var.o;
                    v20 v20Var2 = o60Var.i;
                    try {
                        o60Var.j = true;
                        if (!o60Var.n) {
                            sy.b("replace called on unplaced item");
                        }
                        boolean z5 = o60Var.u;
                        o60Var.bo(o60Var.p, o60Var.r, o60Var.q);
                        if (z5 && !o60Var.ah && (s20VarQ = v20Var2.a.q()) != null) {
                            s20VarQ.ao(false);
                        }
                    } finally {
                    }
                }
                f1 f1Var = this.e;
                f1Var.getClass();
                if (s20Var.an > 0) {
                    ((a90) f1Var.e).b(s20Var);
                    s20Var.am = true;
                }
                t1.as(s20Var).getRectManager().e(s20Var);
            }
        }
        a90 a90Var = this.h;
        int i = a90Var.f;
        if (i != 0) {
            Object[] objArr2 = a90Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                l60 l60Var = (l60) objArr2[i2];
                if (l60Var.a.ae()) {
                    boolean z6 = l60Var.b;
                    s20 s20Var3 = l60Var.a;
                    boolean z7 = l60Var.c;
                    if (z6) {
                        s20.an(s20Var3, z7, 2);
                    } else {
                        s20.ap(s20Var3, z7, 2);
                    }
                }
            }
            a90Var.g();
        }
        return zC;
    }

    public final void k(s20 s20Var) {
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            if (s20Var2.n() == q20.d || s20Var2.ah.o.z.e()) {
                if (t1.ai(s20Var2)) {
                    l(s20Var2, true);
                } else {
                    k(s20Var2);
                }
            }
        }
    }

    public final void l(s20 s20Var, boolean z) {
        dh dhVar;
        if (s20Var.ao) {
            return;
        }
        if (s20Var == this.a) {
            dhVar = this.i;
            dhVar.getClass();
        } else {
            dhVar = null;
        }
        if (z) {
            b(s20Var, dhVar);
        } else {
            c(s20Var, dhVar);
        }
    }

    public final boolean m(s20 s20Var, boolean z) {
        int iOrdinal = s20Var.ah.c.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new l60(s20Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    wc.l();
                    return false;
                }
                if (!s20Var.m() || z) {
                    s20Var.ah.o.w = true;
                    if (!s20Var.ao && (s20Var.af() || g(s20Var))) {
                        s20 s20VarQ = s20Var.q();
                        if (s20VarQ == null || !s20VarQ.m()) {
                            this.b.a(s20Var, n00.f);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void n(long j) {
        dh dhVar = this.i;
        if (dhVar == null ? false : dh.b(dhVar.a, j)) {
            return;
        }
        if (this.c) {
            sy.a("updateRootConstraints called while measuring");
        }
        this.i = new dh(j);
        s20 s20Var = this.a;
        s20 s20Var2 = s20Var.j;
        v20 v20Var = s20Var.ah;
        if (s20Var2 != null) {
            v20Var.d = true;
        }
        v20Var.o.w = true;
        this.b.a(s20Var, s20Var2 != null ? n00.d : n00.f);
    }
}
