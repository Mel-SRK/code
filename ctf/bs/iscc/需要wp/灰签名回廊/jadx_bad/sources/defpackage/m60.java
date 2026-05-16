package defpackage;

import java.util.Arrays;

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
    */
    public static boolean b(s20 s20Var, dh dhVar) {
        boolean zBo;
        s20 s20Var2 = s20Var.j;
        v20 v20Var = s20Var.ah;
        if (s20Var2 == null) {
            return false;
        }
        if (dhVar == null) {
            q50 q50Var = v20Var.p;
            dh dhVar2 = q50Var != null ? q50Var.p : null;
            if (dhVar2 != null && s20Var2 != null) {
                q50Var.getClass();
                zBo = q50Var.bo(dhVar2.a);
            }
        } else if (s20Var2 != null) {
            q50 q50Var2 = v20Var.p;
            q50Var2.getClass();
            zBo = q50Var2.bo(dhVar.a);
        } else {
            zBo = false;
        }
        s20 s20VarQ = s20Var.q();
        if (zBo && s20VarQ != null) {
            if (s20VarQ.j == null) {
                s20.ap(s20VarQ, false, 3);
                return zBo;
            }
            if (s20Var.o() == q20.d) {
                s20.an(s20VarQ, false, 3);
                return zBo;
            }
            if (s20Var.o() == q20.e) {
                s20VarQ.am(false);
            }
        }
        return zBo;
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
    */
    public final void a(boolean z) {
        Object[] objArr;
        f1 f1Var = this.e;
        if (z) {
            a90 a90Var = (a90) f1Var.e;
            s20 s20Var = this.a;
            if (s20Var.an > 0) {
                a90Var.g();
                a90Var.b(s20Var);
                s20Var.am = true;
            }
        }
        a90 a90Var2 = (a90) f1Var.e;
        int i = a90Var2.f;
        if (i != 0) {
            Arrays.sort(a90Var2.d, 0, i, ht.d);
            int i2 = a90Var2.f;
            s20[] s20VarArr = (s20[]) f1Var.f;
            if (s20VarArr != null) {
                int length = s20VarArr.length;
                objArr = s20VarArr;
                if (length < i2) {
                    objArr = new s20[Math.max(16, i2)];
                }
            }
            f1Var.f = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = a90Var2.d[i3];
            }
            a90Var2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                s20 s20Var2 = objArr[i4];
                s20Var2.getClass();
                if (s20Var2.am) {
                    f1.p(s20Var2);
                }
                objArr[i4] = 0;
            }
            f1Var.f = objArr;
        }
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
    */
    public final void e(s20 s20Var, boolean z) {
        q50 q50Var;
        t20 t20Var;
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            q20 q20Var = q20.d;
            if ((!z && (s20Var2.n() == q20Var || s20Var2.ah.o.z.e())) || (z && (s20Var2.o() == q20Var || ((q50Var = s20Var2.ah.p) != null && (t20Var = q50Var.t) != null && t20Var.e())))) {
                boolean zAi = t1.ai(s20Var2);
                v20 v20Var = s20Var2.ah;
                if (zAi && !z) {
                    if (v20Var.d) {
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        boolean z2 = s20Var2.j == null;
                        boolean z3 = ((wr0) ((bu) o6Var.a).e).contains(s20Var2) || ((wr0) ((bu) o6Var.b).e).contains(s20Var2);
                        if (z2 || !z3) {
                            d(s20Var2, true);
                        } else {
                            j(s20Var2, true, false);
                        }
                    }
                }
                if (z ? v20Var.d : s20Var2.m()) {
                    j(s20Var2, z, false);
                }
                if (!(z ? v20Var.d : s20Var2.m())) {
                    e(s20Var2, z);
                }
            }
        }
        if (z ? s20Var.ah.d : s20Var.m()) {
            j(s20Var, z, false);
        }
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
