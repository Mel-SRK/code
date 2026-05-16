package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class gt extends i70 implements kg, va0, l70 {
    public final cv r;
    public boolean s;
    public boolean t;
    public final int u;

    public gt(ft ftVar, int i) {
        int i2 = (i & 1) != 0 ? 1 : 2;
        this.r = (i & 4) != 0 ? null : ftVar;
        this.u = i2;
    }

    public final boolean O0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zAh = false;
            if (!bv().a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = d41.ag(this).ordinal();
            if (iOrdinal == 0) {
                zAh = d41.ah(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zAh = true;
                } else if (iOrdinal != 3) {
                    throw new xd();
                }
            }
            return zAh;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.va0
    public final void af() {
        bz();
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.i70
    public final void bn() {
        int iOrdinal = bx().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                wc.l();
                return;
            }
        }
        us usVar = (us) pk.az(this).getFocusOwner();
        usVar.b(8, true, false);
        usVar.d.a();
    }

    @Override // defpackage.i70
    public final void bo() {
        if (bx().a()) {
            ((us) pk.az(this).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void bu(et etVar, et etVar2) {
        da0 da0Var;
        us usVar = (us) pk.az(this).getFocusOwner();
        gt gtVar = usVar.h;
        etVar.equals(etVar2);
        i70 i70Var = this.d;
        if (!i70Var.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = this.d;
        s20 s20VarAy = pk.ay(this);
        loop0: while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 5120) != 0) {
                while (i70Var2 != null) {
                    int i = i70Var2.f;
                    if ((i & 5120) != 0) {
                        if (i70Var2 != i70Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 4096) != 0) {
                            ?? M = i70Var2;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof ms) {
                                    ms msVar = (ms) M;
                                    if (gtVar == usVar.h) {
                                        msVar.am(etVar2);
                                    }
                                } else if ((M.f & 4096) != 0 && (M instanceof rl)) {
                                    i70 i70Var3 = ((rl) M).s;
                                    int i2 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var3 != null) {
                                        if ((i70Var3.f & 4096) != 0) {
                                            i2++;
                                            a90Var = a90Var;
                                            if (i2 == 1) {
                                                M = i70Var3;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var3);
                                            }
                                        }
                                        i70Var3 = i70Var3.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
        cv cvVar = this.r;
        if (cvVar != null) {
            cvVar.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final ws bv() {
        boolean z;
        da0 da0Var;
        ws wsVar = new ws();
        wsVar.a = true;
        ys ysVar = ys.b;
        wsVar.b = ysVar;
        wsVar.c = ysVar;
        wsVar.d = ysVar;
        wsVar.e = ysVar;
        wsVar.f = ysVar;
        wsVar.g = ysVar;
        wsVar.h = ysVar;
        wsVar.i = ysVar;
        wsVar.j = q0.ab;
        wsVar.k = q0.ac;
        int i = this.u;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((ez) ((gz) ((fz) i60.ab(this, og.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                wc.q("Unknown Focusability");
                return null;
            }
            z = false;
        }
        wsVar.a = z;
        i70 i70Var = this.d;
        if (!i70Var.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = this.d;
        s20 s20VarAy = pk.ay(this);
        loop0: while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 3072) != 0) {
                while (i70Var2 != null) {
                    int i2 = i70Var2.f;
                    if ((i2 & 3072) != 0) {
                        if (i70Var2 != i70Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? M = i70Var2;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof xs) {
                                    ((xs) M).ak(wsVar);
                                } else if ((M.f & 2048) != 0 && (M instanceof rl)) {
                                    i70 i70Var3 = ((rl) M).s;
                                    int i3 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var3 != null) {
                                        if ((i70Var3.f & 2048) != 0) {
                                            i3++;
                                            a90Var = a90Var;
                                            if (i3 == 1) {
                                                M = i70Var3;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var3);
                                            }
                                        }
                                        i70Var3 = i70Var3.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
        return wsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [i70] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void bw() {
        da0 da0Var;
        if (!this.d.q) {
            sy.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.d.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var = this.d.h;
        s20 s20VarAy = pk.ay(this);
        while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 32) != 0) {
                while (i70Var != null) {
                    if ((i70Var.f & 32) != 0) {
                        ?? M = i70Var;
                        ?? a90Var = 0;
                        while (M != 0) {
                            if (M instanceof l70) {
                                ((l70) M).i().getClass();
                            } else if ((M.f & 32) != 0 && (M instanceof rl)) {
                                i70 i70Var2 = ((rl) M).s;
                                int i = 0;
                                M = M;
                                a90Var = a90Var;
                                while (i70Var2 != null) {
                                    if ((i70Var2.f & 32) != 0) {
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
                    i70Var = i70Var.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
    }

    public final et bx() {
        us usVar;
        gt gtVar;
        da0 da0Var;
        boolean z = this.q;
        et etVar = et.g;
        if (!z || (gtVar = (usVar = (us) pk.az(this).getFocusOwner()).h) == null) {
            return etVar;
        }
        if (this == gtVar) {
            usVar.getClass();
            return et.d;
        }
        if (gtVar.q) {
            if (!gtVar.d.q) {
                sy.b("visitAncestors called on an unattached node");
            }
            i70 i70Var = gtVar.d.h;
            s20 s20VarAy = pk.ay(gtVar);
            while (s20VarAy != null) {
                if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                    while (i70Var != null) {
                        if ((i70Var.f & 1024) != 0) {
                            i70 i70VarM = i70Var;
                            a90 a90Var = null;
                            while (i70VarM != null) {
                                if (i70VarM instanceof gt) {
                                    if (this == ((gt) i70VarM)) {
                                        return et.e;
                                    }
                                } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                    int i = 0;
                                    for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                        if ((i70Var2.f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i70VarM = i70Var2;
                                            } else {
                                                if (a90Var == null) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (i70VarM != null) {
                                                    a90Var.b(i70VarM);
                                                    i70VarM = null;
                                                }
                                                a90Var.b(i70Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i70VarM = pk.m(a90Var);
                            }
                        }
                        i70Var = i70Var.h;
                    }
                }
                s20VarAy = s20VarAy.q();
                i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
            }
        }
        return etVar;
    }

    public final void bz() {
        int iOrdinal = bx().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                wc.l();
                return;
            }
        }
        xi0 xi0Var = new xi0();
        az0.z(this, new s0(7, xi0Var, this));
        Object obj = xi0Var.d;
        if (obj == null) {
            f00.ag("focusProperties");
            throw null;
        }
        if (((vs) obj).a()) {
            return;
        }
        ((us) pk.az(this).getFocusOwner()).b(8, true, true);
    }
}
