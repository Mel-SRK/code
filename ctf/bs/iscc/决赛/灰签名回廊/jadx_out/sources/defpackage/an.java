package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an extends al {
    public static an e;
    public static final oj0 f = oj0.e;
    public static final oj0 g = oj0.d;
    public zw0 c;
    public uo0 d;

    @Override // defpackage.al
    public final int[] a(int i) {
        int iC;
        if (c().length() > 0 && i < c().length()) {
            try {
                uo0 uo0Var = this.d;
                if (uo0Var == null) {
                    f00.ag("node");
                    throw null;
                }
                ri0 ri0VarG = uo0Var.g();
                int iRound = Math.round(ri0VarG.d - ri0VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                zw0 zw0Var = this.c;
                if (zw0Var == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                int iE = zw0Var.e(i);
                zw0 zw0Var2 = this.c;
                if (zw0Var2 == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                float fD = zw0Var2.b.d(iE) + iRound;
                zw0 zw0Var3 = this.c;
                if (zw0Var3 == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                float fD2 = zw0Var3.b.d(r0.f - 1);
                zw0 zw0Var4 = this.c;
                if (fD < fD2) {
                    if (zw0Var4 == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    iC = zw0Var4.b.c(fD);
                } else {
                    if (zw0Var4 == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    iC = zw0Var4.b.f;
                }
                return b(i, e(iC - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.al
    public final int[] d(int i) {
        int iC;
        if (c().length() > 0 && i > 0) {
            try {
                uo0 uo0Var = this.d;
                if (uo0Var == null) {
                    f00.ag("node");
                    throw null;
                }
                ri0 ri0VarG = uo0Var.g();
                int iRound = Math.round(ri0VarG.d - ri0VarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                zw0 zw0Var = this.c;
                if (zw0Var == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                int iE = zw0Var.e(i);
                zw0 zw0Var2 = this.c;
                if (zw0Var2 == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                float fD = zw0Var2.b.d(iE) - iRound;
                if (fD > 0.0f) {
                    zw0 zw0Var3 = this.c;
                    if (zw0Var3 == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    iC = zw0Var3.b.c(fD);
                } else {
                    iC = 0;
                }
                if (i == c().length() && iC < iE) {
                    iC++;
                }
                return b(e(iC, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int e(int i, oj0 oj0Var) {
        zw0 zw0Var = this.c;
        if (zw0Var == null) {
            f00.ag("layoutResult");
            throw null;
        }
        int iH = zw0Var.h(i);
        zw0 zw0Var2 = this.c;
        if (zw0Var2 == null) {
            f00.ag("layoutResult");
            throw null;
        }
        oj0 oj0VarI = zw0Var2.i(iH);
        zw0 zw0Var3 = this.c;
        if (oj0Var != oj0VarI) {
            if (zw0Var3 != null) {
                return zw0Var3.h(i);
            }
            f00.ag("layoutResult");
            throw null;
        }
        if (zw0Var3 != null) {
            return zw0Var3.d(i, false) - 1;
        }
        f00.ag("layoutResult");
        throw null;
    }
}
