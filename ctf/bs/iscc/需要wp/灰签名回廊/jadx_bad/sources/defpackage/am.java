package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class am extends al {
    public static am e;
    public static am f;
    public static am g;
    public static final oj0 h = oj0.e;
    public static final oj0 i = oj0.d;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ am(int i2) {
        this.c = i2;
    }

    @Override // defpackage.al
    public final int[] a(int i2) {
        int iE;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            f00.ag("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    f00.ag("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !g(iFollowing2)) {
                    return null;
                }
                return b(i2, iFollowing2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                zw0 zw0Var = (zw0) this.d;
                oj0 oj0Var = h;
                if (i2 < 0) {
                    if (zw0Var == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    iE = zw0Var.e(0);
                } else {
                    if (zw0Var == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    int iE2 = zw0Var.e(i2);
                    iE = e(iE2, oj0Var) == i2 ? iE2 : iE2 + 1;
                }
                zw0 zw0Var2 = (zw0) this.d;
                if (zw0Var2 == null) {
                    f00.ag("layoutResult");
                    throw null;
                }
                if (iE >= zw0Var2.b.f) {
                    return null;
                }
                return b(e(iE, oj0Var), e(iE, i) + 1);
        }
    }

    @Override // defpackage.al
    public final int[] d(int i2) {
        int iE;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            f00.ag("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        f00.ag("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    f00.ag("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !h(iPreceding2 - 1)) {
                    return b(iPreceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                zw0 zw0Var = (zw0) this.d;
                oj0 oj0Var = i;
                if (i2 > length3) {
                    if (zw0Var == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    iE = zw0Var.e(c().length());
                } else {
                    if (zw0Var == null) {
                        f00.ag("layoutResult");
                        throw null;
                    }
                    int iE2 = zw0Var.e(i2);
                    iE = e(iE2, oj0Var) + 1 == i2 ? iE2 : iE2 - 1;
                }
                if (iE < 0) {
                    return null;
                }
                return b(e(iE, h), e(iE, oj0Var) + 1);
        }
    }

    public int e(int i2, oj0 oj0Var) {
        zw0 zw0Var = (zw0) this.d;
        if (zw0Var == null) {
            f00.ag("layoutResult");
            throw null;
        }
        int iH = zw0Var.h(i2);
        zw0 zw0Var2 = (zw0) this.d;
        if (zw0Var2 == null) {
            f00.ag("layoutResult");
            throw null;
        }
        oj0 oj0VarI = zw0Var2.i(iH);
        zw0 zw0Var3 = (zw0) this.d;
        if (oj0Var != oj0VarI) {
            if (zw0Var3 != null) {
                return zw0Var3.h(i2);
            }
            f00.ag("layoutResult");
            throw null;
        }
        if (zw0Var3 != null) {
            return zw0Var3.d(i2, false) - 1;
        }
        f00.ag("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    f00.ag("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    f00.ag("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 <= 0 || !h(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !h(i2);
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
