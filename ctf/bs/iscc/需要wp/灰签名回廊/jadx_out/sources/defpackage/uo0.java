package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uo0 {
    public final i70 a;
    public final boolean b;
    public final s20 c;
    public final po0 d;
    public boolean e;
    public uo0 f;
    public final int g;

    public uo0(i70 i70Var, boolean z, s20 s20Var, po0 po0Var) {
        this.a = i70Var;
        this.b = z;
        this.c = s20Var;
        this.d = po0Var;
        this.g = s20Var.e;
    }

    public static /* synthetic */ List j(int i, uo0 uo0Var) {
        return uo0Var.i((i & 1) != 0 ? !uo0Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [i70] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [i70] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final ri0 a(fa0 fa0Var) {
        ?? M;
        uo0 uo0VarL = l();
        if (uo0VarL == null) {
            return ri0.e;
        }
        i70 i70Var = (i70) uo0VarL.c.ag.j;
        if ((i70Var.g & 8) != 0) {
            loop0: while (i70Var != null) {
                if ((i70Var.f & 8) != 0) {
                    M = i70Var;
                    ?? a90Var = 0;
                    while (M != 0) {
                        if (M instanceof so0) {
                            if (((so0) M).h()) {
                                break loop0;
                            }
                        } else if ((M.f & 8) != 0 && (M instanceof rl)) {
                            i70 i70Var2 = ((rl) M).s;
                            int i = 0;
                            M = M;
                            a90Var = a90Var;
                            while (i70Var2 != null) {
                                if ((i70Var2.f & 8) != 0) {
                                    i++;
                                    a90Var = a90Var;
                                    if (i == 1) {
                                        M = i70Var2;
                                    } else {
                                        if (a90Var == 0) {
                                            a90Var = new a90(new i70[16]);
                                        }
                                        if (M != 0) {
                                            a90Var.b(M);
                                            M = 0;
                                        }
                                        a90Var.b(i70Var2);
                                    }
                                }
                                i70Var2 = i70Var2.i;
                                M = M;
                                a90Var = a90Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M = pk.m(a90Var);
                    }
                }
                if ((i70Var.g & 8) == 0) {
                    break;
                }
                i70Var = i70Var.i;
            }
            M = 0;
        } else {
            M = 0;
        }
        so0 so0Var = (so0) M;
        fa0 fa0VarAw = so0Var != null ? pk.aw(so0Var, 8) : null;
        return fa0VarAw == null ? uo0VarL.a(fa0Var) : fa0VarAw.ak(fa0Var, true);
    }

    public final uo0 b(sk0 sk0Var, cv cvVar) {
        po0 po0Var = new po0();
        po0Var.f = false;
        po0Var.g = false;
        cvVar.g(po0Var);
        uo0 uo0Var = new uo0(new to0(cvVar), false, new s20(this.g + (sk0Var != null ? 1000000000 : 2000000000), true), po0Var);
        uo0Var.e = true;
        uo0Var.f = this;
        return uo0Var;
    }

    public final void c(s20 s20Var, ArrayList arrayList) {
        a90 a90VarT = s20Var.t();
        Object[] objArr = a90VarT.d;
        int i = a90VarT.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            if (s20Var2.ae() && !s20Var2.ao) {
                if (s20Var2.ag.h(8)) {
                    arrayList.add(wo0.a(s20Var2, this.b));
                } else {
                    c(s20Var2, arrayList);
                }
            }
        }
    }

    public final fa0 d() {
        if (!this.e) {
            so0 so0VarF = f();
            return so0VarF != null ? pk.aw(so0VarF, 8) : (yy) this.c.ag.g;
        }
        uo0 uo0VarL = l();
        if (uo0VarL != null) {
            return uo0VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            uo0 uo0Var = (uo0) arrayList.get(size2);
            if (uo0Var.m()) {
                arrayList2.add(uo0Var);
            } else if (!uo0Var.d.g) {
                uo0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final so0 f() {
        ?? M;
        boolean z = this.d.f;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        s20 s20Var = this.c;
        if (z) {
            i70 i70Var = (i70) s20Var.ag.j;
            if ((i70Var.g & 8) != 0) {
                M = 0;
                while (i70Var != null) {
                    if ((i70Var.f & 8) != 0) {
                        ?? M2 = i70Var;
                        ?? a90Var = 0;
                        while (M2 != 0) {
                            if (M2 instanceof so0) {
                                so0 so0Var = (so0) M2;
                                if (so0Var.h()) {
                                    if (so0Var.az()) {
                                        return so0Var;
                                    }
                                    if (M == 0) {
                                        M = so0Var;
                                    }
                                }
                            } else if ((M2.f & 8) != 0 && (M2 instanceof rl)) {
                                i70 i70Var2 = ((rl) M2).s;
                                int i = 0;
                                M2 = M2;
                                a90Var = a90Var;
                                while (i70Var2 != null) {
                                    if ((i70Var2.f & 8) != 0) {
                                        i++;
                                        a90Var = a90Var;
                                        if (i == 1) {
                                            M2 = i70Var2;
                                        } else {
                                            if (a90Var == 0) {
                                                a90Var = new a90(new i70[16]);
                                            }
                                            if (M2 != 0) {
                                                a90Var.b(M2);
                                                M2 = 0;
                                            }
                                            a90Var.b(i70Var2);
                                        }
                                    }
                                    i70Var2 = i70Var2.i;
                                    M2 = M2;
                                    a90Var = a90Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M2 = pk.m(a90Var);
                        }
                    }
                    if ((i70Var.g & 8) == 0) {
                        break;
                    }
                    i70Var = i70Var.i;
                    M = M;
                }
                r4 = M;
            }
        } else {
            i70 i70Var3 = (i70) s20Var.ag.j;
            if ((i70Var3.g & 8) != 0) {
                loop3: while (i70Var3 != null) {
                    if ((i70Var3.f & 8) != 0) {
                        M = i70Var3;
                        ?? a90Var2 = 0;
                        while (M != 0) {
                            if (M instanceof so0) {
                                if (((so0) M).h()) {
                                    r4 = M;
                                }
                            } else if ((M.f & 8) != 0 && (M instanceof rl)) {
                                i70 i70Var4 = ((rl) M).s;
                                int i2 = 0;
                                M = M;
                                a90Var2 = a90Var2;
                                while (i70Var4 != null) {
                                    if ((i70Var4.f & 8) != 0) {
                                        i2++;
                                        a90Var2 = a90Var2;
                                        if (i2 == 1) {
                                            M = i70Var4;
                                        } else {
                                            if (a90Var2 == 0) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var2.b(M);
                                                M = 0;
                                            }
                                            a90Var2.b(i70Var4);
                                        }
                                    }
                                    i70Var4 = i70Var4.i;
                                    M = M;
                                    a90Var2 = a90Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = pk.m(a90Var2);
                        }
                    }
                    if ((i70Var3.g & 8) == 0) {
                        break;
                    }
                    i70Var3 = i70Var3.i;
                }
            }
        }
        return (so0) r4;
    }

    public final ri0 g() {
        fa0 fa0VarD = d();
        if (fa0VarD != null) {
            if (!fa0VarD.D().q) {
                fa0VarD = null;
            }
            if (fa0VarD != null) {
                return i60.ad(fa0VarD).ak(fa0VarD, true);
            }
        }
        return ri0.e;
    }

    public final ri0 h() {
        fa0 fa0VarD = d();
        if (fa0VarD != null) {
            if (!fa0VarD.D().q) {
                fa0VarD = null;
            }
            if (fa0VarD != null) {
                return i60.n(fa0VarD);
            }
        }
        return ri0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.g) {
            return rq.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            return o(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final po0 k() {
        boolean zM = m();
        po0 po0Var = this.d;
        if (!zM) {
            return po0Var;
        }
        po0 po0VarA = po0Var.a();
        n(new ArrayList(), po0VarA);
        return po0VarA;
    }

    public final uo0 l() {
        s20 s20VarQ;
        uo0 uo0Var = this.f;
        if (uo0Var != null) {
            return uo0Var;
        }
        s20 s20Var = this.c;
        boolean z = this.b;
        if (z) {
            s20VarQ = s20Var.q();
            while (s20VarQ != null) {
                po0 po0VarS = s20VarQ.s();
                if (po0VarS != null && po0VarS.f) {
                    break;
                }
                s20VarQ = s20VarQ.q();
            }
            s20VarQ = null;
        } else {
            s20VarQ = null;
        }
        if (s20VarQ == null) {
            s20 s20VarQ2 = s20Var.q();
            while (true) {
                if (s20VarQ2 == null) {
                    s20VarQ = null;
                    break;
                }
                if (s20VarQ2.ag.h(8)) {
                    s20VarQ = s20VarQ2;
                    break;
                }
                s20VarQ2 = s20VarQ2.q();
            }
        }
        if (s20VarQ == null) {
            return null;
        }
        return wo0.a(s20VarQ, z);
    }

    public final boolean m() {
        return this.b && this.d.f;
    }

    public final void n(ArrayList arrayList, po0 po0Var) {
        if (this.d.g) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            uo0 uo0Var = (uo0) arrayList.get(size2);
            if (!uo0Var.m()) {
                po0Var.c(uo0Var.d);
                uo0Var.n(arrayList, po0Var);
            }
        }
    }

    public final List o(ArrayList arrayList, boolean z) {
        if (this.e) {
            return rq.d;
        }
        c(this.c, arrayList);
        if (z) {
            po0 po0Var = this.d;
            q80 q80Var = po0Var.d;
            Object objG = q80Var.g(zo0.w);
            if (objG == null) {
                objG = null;
            }
            sk0 sk0Var = (sk0) objG;
            if (sk0Var != null && po0Var.f && !arrayList.isEmpty()) {
                arrayList.add(b(sk0Var, new yv0(27, sk0Var)));
            }
            cp0 cp0Var = zo0.a;
            if (q80Var.c(cp0Var) && !arrayList.isEmpty() && po0Var.f) {
                Object objG2 = q80Var.g(cp0Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) kc.as(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new l1(22, str)));
                }
            }
        }
        return arrayList;
    }
}
