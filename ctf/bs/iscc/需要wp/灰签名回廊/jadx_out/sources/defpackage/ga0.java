package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga0 {
    public static final l80 a;

    static {
        l80 l80Var = sa0.a;
        a = new l80();
    }

    public static final void a(i70 i70Var, int i, int i2) {
        if (!(i70Var instanceof rl)) {
            b(i70Var, i & i70Var.f, i2);
            return;
        }
        rl rlVar = (rl) i70Var;
        int i3 = rlVar.r;
        b(i70Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (i70 i70Var2 = rlVar.s; i70Var2 != null; i70Var2 = i70Var2.i) {
            a(i70Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i70 i70Var, int i, int i2) {
        if (i2 != 0 || i70Var.bj()) {
            if ((i & 2) != 0 && (i70Var instanceof l20)) {
                d41.aa((l20) i70Var);
                if (i2 == 2) {
                    pk.aw(i70Var, 2).Q();
                }
            }
            if ((i & 128) != 0 && (i70Var instanceof b20) && i2 != 2) {
                pk.ay(i70Var).aa();
            }
            if ((i & 256) != 0 && (i70Var instanceof xv)) {
                if (i2 == 1) {
                    s20 s20VarAy = pk.ay(i70Var);
                    s20VarAy.au(s20VarAy.an + 1);
                } else if (i2 == 2) {
                    pk.ay(i70Var).au(r0.an - 1);
                }
                if (i2 != 2) {
                    s20 s20VarAy2 = pk.ay(i70Var);
                    if (s20VarAy2.an != 0 && !s20VarAy2.l() && !s20VarAy2.m() && !s20VarAy2.am) {
                        b1 b1VarAs = t1.as(s20VarAy2);
                        f1 f1Var = b1VarAs.aq.e;
                        f1Var.getClass();
                        if (s20VarAy2.an > 0) {
                            ((a90) f1Var.e).b(s20VarAy2);
                            s20VarAy2.am = true;
                        }
                        b1VarAs.ac(null);
                    }
                }
            }
            if ((i & 4) != 0 && (i70Var instanceof wo)) {
                t1.ae((wo) i70Var);
            }
            if ((i & 8) != 0 && (i70Var instanceof so0)) {
                pk.ay(i70Var).s = true;
            }
            if ((i & 64) != 0 && (i70Var instanceof ne0)) {
                v20 v20Var = pk.ay((ne0) i70Var).ah;
                v20Var.o.s = true;
                q50 q50Var = v20Var.p;
                if (q50Var != null) {
                    q50Var.x = true;
                }
            }
            if ((i & 2048) != 0 && (i70Var instanceof xs)) {
                xs xsVar = (xs) i70Var;
                fa.b = null;
                xsVar.ak(fa.a);
                if (fa.b != null) {
                    i70 i70Var2 = (i70) xsVar;
                    if (!i70Var2.d.q) {
                        sy.b("visitChildren called on an unattached node");
                    }
                    a90 a90Var = new a90(new i70[16]);
                    i70 i70Var3 = i70Var2.d;
                    i70 i70Var4 = i70Var3.i;
                    if (i70Var4 == null) {
                        pk.j(a90Var, i70Var3);
                    } else {
                        a90Var.b(i70Var4);
                    }
                    while (true) {
                        int i3 = a90Var.f;
                        if (i3 == 0) {
                            break;
                        }
                        i70 i70VarM = (i70) a90Var.j(i3 - 1);
                        if ((i70VarM.g & 1024) == 0) {
                            pk.j(a90Var, i70VarM);
                        } else {
                            while (true) {
                                if (i70VarM == null) {
                                    break;
                                }
                                if ((i70VarM.f & 1024) != 0) {
                                    a90 a90Var2 = null;
                                    while (i70VarM != null) {
                                        if (i70VarM instanceof gt) {
                                            gt gtVar = (gt) i70VarM;
                                            rs rsVar = ((us) pk.az(gtVar).getFocusOwner()).d;
                                            if (rsVar.c.a(gtVar)) {
                                                rsVar.a();
                                            }
                                        } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                            int i4 = 0;
                                            for (i70 i70Var5 = ((rl) i70VarM).s; i70Var5 != null; i70Var5 = i70Var5.i) {
                                                if ((i70Var5.f & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        i70VarM = i70Var5;
                                                    } else {
                                                        if (a90Var2 == null) {
                                                            a90Var2 = new a90(new i70[16]);
                                                        }
                                                        if (i70VarM != null) {
                                                            a90Var2.b(i70VarM);
                                                            i70VarM = null;
                                                        }
                                                        a90Var2.b(i70Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        i70VarM = pk.m(a90Var2);
                                    }
                                } else {
                                    i70VarM = i70VarM.i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(i70Var instanceof ms)) {
                return;
            }
            ms msVar = (ms) i70Var;
            rs rsVar2 = ((us) pk.az(msVar).getFocusOwner()).d;
            if (rsVar2.d.a(msVar)) {
                rsVar2.a();
            }
        }
    }

    public static final void c(i70 i70Var) {
        if (!i70Var.q) {
            sy.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(i70Var, -1, 0);
    }

    public static final int d(h70 h70Var) {
        int i = h70Var instanceof j20 ? 3 : 1;
        if (h70Var instanceof vo) {
            i |= 4;
        }
        if (h70Var instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        return h70Var instanceof q8 ? 524288 | i : i;
    }

    public static final int e(i70 i70Var) {
        int i = i70Var.f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = i70Var.getClass();
        l80 l80Var = a;
        int iD = l80Var.d(cls);
        if (iD >= 0) {
            return l80Var.c[iD];
        }
        int i2 = i70Var instanceof l20 ? 3 : 1;
        if (i70Var instanceof wo) {
            i2 |= 4;
        }
        if (i70Var instanceof so0) {
            i2 |= 8;
        }
        if (i70Var instanceof sg0) {
            i2 |= 16;
        }
        if (i70Var instanceof l70) {
            i2 |= 32;
        }
        if (i70Var instanceof ne0) {
            i2 |= 64;
        }
        if (i70Var instanceof b20) {
            i2 |= 128;
        }
        if (i70Var instanceof xv) {
            i2 |= 256;
        }
        if (i70Var instanceof gt) {
            i2 |= 1024;
        }
        if (i70Var instanceof xs) {
            i2 |= 2048;
        }
        if (i70Var instanceof ms) {
            i2 |= 4096;
        }
        if (i70Var instanceof o10) {
            i2 |= 8192;
        }
        if (i70Var instanceof wk0) {
            i2 |= 16384;
        }
        if (i70Var instanceof kg) {
            i2 |= 32768;
        }
        if (i70Var instanceof sy0) {
            i2 |= 262144;
        }
        if (i70Var instanceof q8) {
            i2 |= 524288;
        }
        l80Var.h(i2, cls);
        return i2;
    }

    public static final int f(i70 i70Var) {
        if (!(i70Var instanceof rl)) {
            return e(i70Var);
        }
        rl rlVar = (rl) i70Var;
        int iF = rlVar.r;
        for (i70 i70Var2 = rlVar.s; i70Var2 != null; i70Var2 = i70Var2.i) {
            iF |= f(i70Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
