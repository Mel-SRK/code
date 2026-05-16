package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zr0 {
    public static final long a = bo0.j(14);
    public static final long b = bo0.j(0);
    public static final long c = qc.f;
    public static final nw0 d;

    static {
        long j = qc.b;
        d = j != 16 ? new hd(j) : mw0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yr0 a(yr0 yr0Var, long j, i9 i9Var, float f, long j2, iu iuVar, gu guVar, hu huVar, fu0 fu0Var, String str, long j3, t7 t7Var, ow0 ow0Var, t40 t40Var, long j4, bv0 bv0Var, yp0 yp0Var, cg0 cg0Var, yo yoVar) {
        t7 t7Var2;
        yp0 yp0Var2;
        cg0 cg0Var2;
        yo yoVar2;
        nw0 hdVar;
        nw0 nw0Var;
        boolean z;
        t40 t40Var2;
        long j5;
        cg0 cg0Var3;
        hu huVar2 = huVar;
        fu0 fu0Var2 = fu0Var;
        String str2 = str;
        long j6 = j3;
        rx0[] rx0VarArr = qx0.b;
        long j7 = j2 & 1095216660480L;
        if ((j7 == 0 || qx0.a(j2, yr0Var.b)) && ((i9Var != null || j == 16 || qc.c(j, yr0Var.a.b())) && ((guVar == null || guVar.equals(yr0Var.d)) && ((iuVar == null || iuVar.equals(yr0Var.c)) && ((fu0Var2 == null || fu0Var2 == yr0Var.f) && (((j6 & 1095216660480L) == 0 || qx0.a(j6, yr0Var.h)) && ((bv0Var == null || bv0Var.equals(yr0Var.m)) && f00.h(i9Var, yr0Var.a.c()) && ((i9Var == null || f == yr0Var.a.a()) && ((huVar2 == null || huVar2.equals(yr0Var.e)) && (str2 == null || str2.equals(yr0Var.g))))))))))) {
            if (t7Var != null) {
                t7Var2 = t7Var;
                if (t7Var2.equals(yr0Var.i)) {
                }
                mw0 mw0Var = mw0.a;
                if (i9Var != null) {
                    if (i9Var instanceof vr0) {
                        long j8 = wn0.j(((vr0) i9Var).a, f);
                        hdVar = j8 != 16 ? new hd(j8) : mw0Var;
                    } else {
                        if (!(i9Var instanceof j9)) {
                            wc.l();
                            return null;
                        }
                        hdVar = new k9((j9) i9Var, f);
                    }
                } else if (j != 16) {
                    hdVar = new hd(j);
                }
                nw0Var = yr0Var.a;
                nw0Var.getClass();
                z = hdVar instanceof k9;
                if (z && (nw0Var instanceof k9)) {
                    float f2 = ((k9) hdVar).a;
                    if (Float.isNaN(f2)) {
                        f2 = ((k9) nw0Var).a;
                    }
                    hdVar = new k9(null, f2);
                } else if ((z || (nw0Var instanceof k9)) && ((!z && (nw0Var instanceof k9)) || hdVar.equals(mw0Var))) {
                }
                if (fu0Var2 == null) {
                    fu0Var2 = yr0Var.f;
                }
                long j9 = j7 == 0 ? yr0Var.b : j2;
                iu iuVar2 = iuVar == null ? yr0Var.c : iuVar;
                gu guVar2 = guVar == null ? yr0Var.d : guVar;
                if (huVar2 == null) {
                    huVar2 = yr0Var.e;
                }
                if (str2 == null) {
                    str2 = yr0Var.g;
                }
                if ((j6 & 1095216660480L) == 0) {
                    j6 = yr0Var.h;
                }
                if (t7Var2 == null) {
                    t7Var2 = yr0Var.i;
                }
                ow0 ow0Var2 = ow0Var == null ? yr0Var.j : ow0Var;
                long j10 = j9;
                t40 t40Var3 = t40Var == null ? yr0Var.k : t40Var;
                if (j4 != 16) {
                    t40Var2 = t40Var3;
                    j5 = j4;
                } else {
                    t40Var2 = t40Var3;
                    j5 = yr0Var.l;
                }
                long j11 = j5;
                bv0 bv0Var2 = bv0Var == null ? yr0Var.m : bv0Var;
                yp0 yp0Var3 = yp0Var2 == null ? yr0Var.n : yp0Var2;
                cg0Var3 = yr0Var.o;
                if (cg0Var3 == null) {
                    cg0Var3 = cg0Var2;
                }
                if (yoVar2 == null) {
                    yoVar2 = yr0Var.p;
                }
                return new yr0(hdVar, j10, iuVar2, guVar2, huVar2, fu0Var2, str2, j6, t7Var2, ow0Var2, t40Var2, j11, bv0Var2, yp0Var3, cg0Var3, yoVar2);
            }
            t7Var2 = t7Var;
            if (ow0Var == null || ow0Var.equals(yr0Var.j)) {
                if (t40Var == null || t40Var.equals(yr0Var.k)) {
                    if (j4 == 16 || qc.c(j4, yr0Var.l)) {
                        yp0Var2 = yp0Var;
                        if (yp0Var2 == null || yp0Var2.equals(yr0Var.n)) {
                            cg0Var2 = cg0Var;
                            if (cg0Var2 == null || cg0Var2.equals(yr0Var.o)) {
                                yoVar2 = yoVar;
                                if (yoVar2 == null || yoVar2.equals(yr0Var.p)) {
                                    return yr0Var;
                                }
                            }
                        }
                        yoVar2 = yoVar;
                    }
                    cg0Var2 = cg0Var;
                    yoVar2 = yoVar;
                }
            }
            mw0 mw0Var2 = mw0.a;
            if (i9Var != null) {
            }
            nw0Var = yr0Var.a;
            nw0Var.getClass();
            z = hdVar instanceof k9;
            if (z) {
                hdVar = z ? nw0Var : nw0Var;
            }
            if (fu0Var2 == null) {
            }
            if (j7 == 0) {
            }
            if (iuVar == null) {
            }
            if (guVar == null) {
            }
            if (huVar2 == null) {
            }
            if (str2 == null) {
            }
            if ((j6 & 1095216660480L) == 0) {
            }
            if (t7Var2 == null) {
            }
            if (ow0Var == null) {
            }
            long j102 = j9;
            if (t40Var == null) {
            }
            if (j4 != 16) {
            }
            long j112 = j5;
            if (bv0Var == null) {
            }
            if (yp0Var2 == null) {
            }
            cg0Var3 = yr0Var.o;
            if (cg0Var3 == null) {
            }
            if (yoVar2 == null) {
            }
            return new yr0(hdVar, j102, iuVar2, guVar2, huVar2, fu0Var2, str2, j6, t7Var2, ow0Var2, t40Var2, j112, bv0Var2, yp0Var3, cg0Var3, yoVar2);
        }
        t7Var2 = t7Var;
        yp0Var2 = yp0Var;
        cg0Var2 = cg0Var;
        yoVar2 = yoVar;
        mw0 mw0Var22 = mw0.a;
        if (i9Var != null) {
        }
        nw0Var = yr0Var.a;
        nw0Var.getClass();
        z = hdVar instanceof k9;
        if (z) {
        }
        if (fu0Var2 == null) {
        }
        if (j7 == 0) {
        }
        if (iuVar == null) {
        }
        if (guVar == null) {
        }
        if (huVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j6 & 1095216660480L) == 0) {
        }
        if (t7Var2 == null) {
        }
        if (ow0Var == null) {
        }
        long j1022 = j9;
        if (t40Var == null) {
        }
        if (j4 != 16) {
        }
        long j1122 = j5;
        if (bv0Var == null) {
        }
        if (yp0Var2 == null) {
        }
        cg0Var3 = yr0Var.o;
        if (cg0Var3 == null) {
        }
        if (yoVar2 == null) {
        }
        return new yr0(hdVar, j1022, iuVar2, guVar2, huVar2, fu0Var2, str2, j6, t7Var2, ow0Var2, t40Var2, j1122, bv0Var2, yp0Var3, cg0Var3, yoVar2);
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(float f, long j, long j2) {
        rx0[] rx0VarArr = qx0.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    uy.a("Cannot perform operation for Unspecified type.");
                }
                if (!rx0.a(qx0.b(j), qx0.b(j2))) {
                    uy.a("Cannot perform operation for " + ((Object) rx0.b(qx0.b(j))) + " and " + ((Object) rx0.b(qx0.b(j2))));
                }
                return bo0.o(j3, m10.ai(qx0.c(j), qx0.c(j2), f));
            }
        }
        return ((qx0) b(new qx0(j), new qx0(j2), f)).a;
    }
}
