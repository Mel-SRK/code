package defpackage;

import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gx {
    public static final gx a = new gx();

    private final int a(ky0 ky0Var, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final void ac(h30 h30Var, SelectGesture selectGesture, cw0 cw0Var) {
        if (cw0Var != null) {
            long jAb = t1.ab(h30Var, pk.bh(selectGesture.getSelectionArea()), ag(selectGesture.getGranularity()));
            h30 h30Var2 = cw0Var.d;
            if (h30Var2 != null) {
                h30Var2.f(jAb);
            }
            h30 h30Var3 = cw0Var.d;
            if (h30Var3 != null) {
                h30Var3.e(hx0.b);
            }
            if (hx0.b(jAb)) {
                return;
            }
            cw0Var.p(false);
            cw0Var.n(xw.d);
        }
    }

    private final void ad(ky0 ky0Var, SelectGesture selectGesture, bx0 bx0Var) {
        pk.bh(selectGesture.getSelectionArea());
        ag(selectGesture.getGranularity());
        throw null;
    }

    private final void ae(h30 h30Var, SelectRangeGesture selectRangeGesture, cw0 cw0Var) {
        if (cw0Var != null) {
            long jD = t1.d(h30Var, pk.bh(selectRangeGesture.getSelectionStartArea()), pk.bh(selectRangeGesture.getSelectionEndArea()), ag(selectRangeGesture.getGranularity()));
            h30 h30Var2 = cw0Var.d;
            if (h30Var2 != null) {
                h30Var2.f(jD);
            }
            h30 h30Var3 = cw0Var.d;
            if (h30Var3 != null) {
                h30Var3.e(hx0.b);
            }
            if (hx0.b(jD)) {
                return;
            }
            cw0Var.p(false);
            cw0Var.n(xw.d);
        }
    }

    private final void af(ky0 ky0Var, SelectRangeGesture selectRangeGesture, bx0 bx0Var) {
        pk.bh(selectRangeGesture.getSelectionStartArea());
        pk.bh(selectRangeGesture.getSelectionEndArea());
        ag(selectRangeGesture.getGranularity());
        throw null;
    }

    private final int ag(int i) {
        return i != 1 ? 0 : 1;
    }

    private final int b(HandwritingGesture handwritingGesture, cv cvVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cvVar.g(new pd(fallbackText, 1));
        return 5;
    }

    private final int c(h30 h30Var, DeleteGesture deleteGesture, b6 b6Var, cv cvVar) {
        int iAg = ag(deleteGesture.getGranularity());
        long jAb = t1.ab(h30Var, pk.bh(deleteGesture.getDeletionArea()), iAg);
        if (hx0.b(jAb)) {
            return a.b(ex.l(deleteGesture), cvVar);
        }
        h(jAb, b6Var, iAg == 1, cvVar);
        return 1;
    }

    private final int d(ky0 ky0Var, DeleteGesture deleteGesture, bx0 bx0Var) {
        ag(deleteGesture.getGranularity());
        pk.bh(deleteGesture.getDeletionArea());
        throw null;
    }

    private final int e(h30 h30Var, DeleteRangeGesture deleteRangeGesture, b6 b6Var, cv cvVar) {
        int iAg = ag(deleteRangeGesture.getGranularity());
        long jD = t1.d(h30Var, pk.bh(deleteRangeGesture.getDeletionStartArea()), pk.bh(deleteRangeGesture.getDeletionEndArea()), iAg);
        if (hx0.b(jD)) {
            return a.b(ex.l(deleteRangeGesture), cvVar);
        }
        h(jD, b6Var, iAg == 1, cvVar);
        return 1;
    }

    private final int f(ky0 ky0Var, DeleteRangeGesture deleteRangeGesture, bx0 bx0Var) {
        ag(deleteRangeGesture.getGranularity());
        pk.bh(deleteRangeGesture.getDeletionStartArea());
        pk.bh(deleteRangeGesture.getDeletionEndArea());
        throw null;
    }

    private final void g(ky0 ky0Var, long j, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    private final void h(long j, b6 b6Var, boolean z, cv cvVar) {
        if (z) {
            int i = hx0.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(b6Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < b6Var.e.length() ? Character.codePointAt(b6Var, iCharCount2) : 10;
            if (t1.al(iCodePointBefore) && (t1.ak(iCodePointAt) || t1.aj(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(b6Var, iCharCount);
                    }
                } while (t1.al(iCodePointBefore));
                j = wo0.b(iCharCount, iCharCount2);
            } else if (t1.al(iCodePointAt) && (t1.ak(iCodePointBefore) || t1.aj(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == b6Var.e.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(b6Var, iCharCount2);
                    }
                } while (t1.al(iCodePointAt));
                j = wo0.b(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        cvVar.g(new hx(new op[]{new wp0(i2, i2), new xl(hx0.c(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int k(h30 h30Var, InsertGesture insertGesture, i11 i11Var, cv cvVar) {
        int iE;
        ax0 ax0VarD;
        long jAd;
        int iY;
        if (i11Var == null) {
            return b(ex.l(insertGesture), cvVar);
        }
        PointF insertionPoint = insertGesture.getInsertionPoint();
        long jH = d41.h(insertionPoint.x, insertionPoint.y);
        ax0 ax0VarD2 = h30Var.d();
        if (ax0VarD2 != null) {
            y70 y70Var = ax0VarD2.a.b;
            d20 d20VarC = h30Var.c();
            iE = (d20VarC == null || (iY = t1.y(y70Var, (jAd = d20VarC.ad(jH)), i11Var)) == -1) ? -1 : y70Var.e(xa0.a(jAd, (y70Var.b(iY) + y70Var.d(iY)) / 2.0f, 1));
        }
        if (iE == -1 || ((ax0VarD = h30Var.d()) != null && t1.e(ax0VarD.a, iE))) {
            return b(ex.l(insertGesture), cvVar);
        }
        m(iE, insertGesture.getTextToInsert(), cvVar);
        return 1;
    }

    private final int l(ky0 ky0Var, InsertGesture insertGesture, bx0 bx0Var, i11 i11Var) {
        PointF insertionPoint = insertGesture.getInsertionPoint();
        d41.h(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i, String str, cv cvVar) {
        cvVar.g(new hx(new op[]{new wp0(i, i), new pd(str, 1)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int n(h30 h30Var, JoinOrSplitGesture joinOrSplitGesture, b6 b6Var, i11 i11Var, cv cvVar) {
        int iE;
        ax0 ax0VarD;
        long jAd;
        int iY;
        if (i11Var == null) {
            return b(ex.l(joinOrSplitGesture), cvVar);
        }
        PointF joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long jH = d41.h(joinOrSplitPoint.x, joinOrSplitPoint.y);
        ax0 ax0VarD2 = h30Var.d();
        if (ax0VarD2 != null) {
            y70 y70Var = ax0VarD2.a.b;
            d20 d20VarC = h30Var.c();
            iE = (d20VarC == null || (iY = t1.y(y70Var, (jAd = d20VarC.ad(jH)), i11Var)) == -1) ? -1 : y70Var.e(xa0.a(jAd, (y70Var.b(iY) + y70Var.d(iY)) / 2.0f, 1));
        }
        if (iE == -1 || ((ax0VarD = h30Var.d()) != null && t1.e(ax0VarD.a, iE))) {
            return b(ex.l(joinOrSplitGesture), cvVar);
        }
        int iCharCount = iE;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(b6Var, iCharCount);
            if (!t1.ak(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (iE < b6Var.e.length()) {
            int iCodePointAt = Character.codePointAt(b6Var, iE);
            if (!t1.ak(iCodePointAt)) {
                break;
            }
            iE += Character.charCount(iCodePointAt);
        }
        long jB = wo0.b(iCharCount, iE);
        if (hx0.b(jB)) {
            m((int) (jB >> 32), " ", cvVar);
            return 1;
        }
        h(jB, b6Var, false, cvVar);
        return 1;
    }

    private final int o(ky0 ky0Var, JoinOrSplitGesture joinOrSplitGesture, bx0 bx0Var, i11 i11Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int p(h30 h30Var, RemoveSpaceGesture removeSpaceGesture, b6 b6Var, i11 i11Var, cv cvVar) {
        long jF;
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        ax0 ax0VarD = h30Var.d();
        zw0 zw0Var = ax0VarD != null ? ax0VarD.a : null;
        PointF startPoint = removeSpaceGesture.getStartPoint();
        long jH = d41.h(startPoint.x, startPoint.y);
        PointF endPoint = removeSpaceGesture.getEndPoint();
        long jH2 = d41.h(endPoint.x, endPoint.y);
        d20 d20VarC = h30Var.c();
        int i5 = 0;
        if (zw0Var != null) {
            y70 y70Var = zw0Var.b;
            if (d20VarC == null) {
                jF = hx0.b;
            } else {
                long jAd = d20VarC.ad(jH);
                long jAd2 = d20VarC.ad(jH2);
                int iY = t1.y(y70Var, jAd, i11Var);
                int iY2 = t1.y(y70Var, jAd2, i11Var);
                if (iY != -1) {
                    if (iY2 != -1) {
                        iY = Math.min(iY, iY2);
                    }
                    iY2 = iY;
                } else if (iY2 == -1) {
                    jF = hx0.b;
                }
                float fB = (y70Var.b(iY2) + y70Var.d(iY2)) / 2;
                jF = y70Var.f(new ri0(Math.min(xa0.d(jAd), xa0.d(jAd2)), fB - 0.1f, Math.max(xa0.d(jAd), xa0.d(jAd2)), fB + 0.1f), 0, bw.av);
            }
        }
        if (hx0.b(jF)) {
            return a.b(ex.l(removeSpaceGesture), cvVar);
        }
        String str = b6Var.subSequence(hx0.e(jF), hx0.d(jF)).e;
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        str.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        f1 f1Var = !matcher.find(0) ? null : new f1(matcher, str);
        if (f1Var == null) {
            string = str.toString();
            i4 = 0;
            i2 = -1;
            i = -1;
        } else {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            int i6 = 0;
            i = -1;
            while (true) {
                sb.append((CharSequence) str, i6, f1Var.r().d);
                if (i == -1) {
                    i = f1Var.r().d;
                }
                i2 = f1Var.r().e + 1;
                sb.append((CharSequence) "");
                i3 = f1Var.r().e + 1;
                CharSequence charSequence = (CharSequence) f1Var.f;
                Matcher matcher2 = (Matcher) f1Var.e;
                i4 = i5;
                int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : i4);
                if (iEnd <= charSequence.length()) {
                    Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                    matcher3.getClass();
                    f1Var = !matcher3.find(iEnd) ? null : new f1(matcher3, charSequence);
                } else {
                    f1Var = null;
                }
                if (i3 >= length || f1Var == null) {
                    break;
                }
                i5 = i4;
                i6 = i3;
            }
            if (i3 < length) {
                sb.append((CharSequence) str, i3, length);
            }
            string = sb.toString();
        }
        if (i == -1 || i2 == -1) {
            return b(ex.l(removeSpaceGesture), cvVar);
        }
        int i7 = (int) (jF >> 32);
        String strSubstring = string.substring(i, string.length() - (hx0.c(jF) - i2));
        wp0 wp0Var = new wp0(i7 + i, i7 + i2);
        pd pdVar = new pd(strSubstring, 1);
        op[] opVarArr = new op[2];
        opVarArr[i4] = wp0Var;
        opVarArr[1] = pdVar;
        cvVar.g(new hx(opVarArr));
        return 1;
    }

    private final int q(ky0 ky0Var, RemoveSpaceGesture removeSpaceGesture, bx0 bx0Var, i11 i11Var) {
        throw null;
    }

    private final int r(h30 h30Var, SelectGesture selectGesture, cw0 cw0Var, cv cvVar) {
        long jAb = t1.ab(h30Var, pk.bh(selectGesture.getSelectionArea()), ag(selectGesture.getGranularity()));
        if (hx0.b(jAb)) {
            return a.b(ex.l(selectGesture), cvVar);
        }
        v(jAb, cw0Var, cvVar);
        return 1;
    }

    private final int s(ky0 ky0Var, SelectGesture selectGesture, bx0 bx0Var) {
        pk.bh(selectGesture.getSelectionArea());
        ag(selectGesture.getGranularity());
        throw null;
    }

    private final int t(h30 h30Var, SelectRangeGesture selectRangeGesture, cw0 cw0Var, cv cvVar) {
        long jD = t1.d(h30Var, pk.bh(selectRangeGesture.getSelectionStartArea()), pk.bh(selectRangeGesture.getSelectionEndArea()), ag(selectRangeGesture.getGranularity()));
        if (hx0.b(jD)) {
            return a.b(ex.l(selectRangeGesture), cvVar);
        }
        v(jD, cw0Var, cvVar);
        return 1;
    }

    private final int u(ky0 ky0Var, SelectRangeGesture selectRangeGesture, bx0 bx0Var) {
        pk.bh(selectRangeGesture.getSelectionStartArea());
        pk.bh(selectRangeGesture.getSelectionEndArea());
        ag(selectRangeGesture.getGranularity());
        throw null;
    }

    private final void v(long j, cw0 cw0Var, cv cvVar) {
        int i = hx0.c;
        cvVar.g(new wp0((int) (j >> 32), (int) (j & 4294967295L)));
        if (cw0Var != null) {
            cw0Var.f(true);
        }
    }

    private final void w(h30 h30Var, DeleteGesture deleteGesture, cw0 cw0Var) {
        if (cw0Var != null) {
            long jAb = t1.ab(h30Var, pk.bh(deleteGesture.getDeletionArea()), ag(deleteGesture.getGranularity()));
            h30 h30Var2 = cw0Var.d;
            if (h30Var2 != null) {
                h30Var2.e(jAb);
            }
            h30 h30Var3 = cw0Var.d;
            if (h30Var3 != null) {
                h30Var3.f(hx0.b);
            }
            if (hx0.b(jAb)) {
                return;
            }
            cw0Var.p(false);
            cw0Var.n(xw.d);
        }
    }

    private final void x(ky0 ky0Var, DeleteGesture deleteGesture, bx0 bx0Var) {
        pk.bh(deleteGesture.getDeletionArea());
        ag(deleteGesture.getGranularity());
        throw null;
    }

    private final void y(h30 h30Var, DeleteRangeGesture deleteRangeGesture, cw0 cw0Var) {
        if (cw0Var != null) {
            long jD = t1.d(h30Var, pk.bh(deleteRangeGesture.getDeletionStartArea()), pk.bh(deleteRangeGesture.getDeletionEndArea()), ag(deleteRangeGesture.getGranularity()));
            h30 h30Var2 = cw0Var.d;
            if (h30Var2 != null) {
                h30Var2.e(jD);
            }
            h30 h30Var3 = cw0Var.d;
            if (h30Var3 != null) {
                h30Var3.f(hx0.b);
            }
            if (hx0.b(jD)) {
                return;
            }
            cw0Var.p(false);
            cw0Var.n(xw.d);
        }
    }

    private final void z(ky0 ky0Var, DeleteRangeGesture deleteRangeGesture, bx0 bx0Var) {
        pk.bh(deleteRangeGesture.getDeletionStartArea());
        pk.bh(deleteRangeGesture.getDeletionEndArea());
        ag(deleteRangeGesture.getGranularity());
        throw null;
    }

    public final boolean aa(h30 h30Var, PreviewableHandwritingGesture previewableHandwritingGesture, cw0 cw0Var, CancellationSignal cancellationSignal) {
        yw0 yw0Var;
        b6 b6Var = h30Var.j;
        if (b6Var == null) {
            return false;
        }
        ax0 ax0VarD = h30Var.d();
        if (!b6Var.equals((ax0VarD == null || (yw0Var = ax0VarD.a.a) == null) ? null : yw0Var.a)) {
            return false;
        }
        if (ex.x(previewableHandwritingGesture)) {
            ac(h30Var, ex.o(previewableHandwritingGesture), cw0Var);
        } else if (d3.q(previewableHandwritingGesture)) {
            w(h30Var, d3.h(previewableHandwritingGesture), cw0Var);
        } else if (d3.w(previewableHandwritingGesture)) {
            ae(h30Var, d3.k(previewableHandwritingGesture), cw0Var);
        } else {
            if (!d3.y(previewableHandwritingGesture)) {
                return false;
            }
            y(h30Var, d3.i(previewableHandwritingGesture), cw0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new gf(1, cw0Var));
        return true;
    }

    public final boolean ab(ky0 ky0Var, PreviewableHandwritingGesture previewableHandwritingGesture, bx0 bx0Var, CancellationSignal cancellationSignal) {
        if (ex.x(previewableHandwritingGesture)) {
            ad(ky0Var, ex.o(previewableHandwritingGesture), bx0Var);
        } else if (d3.q(previewableHandwritingGesture)) {
            x(ky0Var, d3.h(previewableHandwritingGesture), bx0Var);
        } else if (d3.w(previewableHandwritingGesture)) {
            af(ky0Var, d3.k(previewableHandwritingGesture), bx0Var);
        } else {
            if (!d3.y(previewableHandwritingGesture)) {
                return false;
            }
            z(ky0Var, d3.i(previewableHandwritingGesture), bx0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new fx());
        return true;
    }

    public final int i(h30 h30Var, HandwritingGesture handwritingGesture, cw0 cw0Var, i11 i11Var, cv cvVar) {
        yw0 yw0Var;
        b6 b6Var = h30Var.j;
        if (b6Var == null) {
            return 3;
        }
        ax0 ax0VarD = h30Var.d();
        if (!b6Var.equals((ax0VarD == null || (yw0Var = ax0VarD.a.a) == null) ? null : yw0Var.a)) {
            return 3;
        }
        if (ex.x(handwritingGesture)) {
            return r(h30Var, ex.o(handwritingGesture), cw0Var, cvVar);
        }
        if (d3.q(handwritingGesture)) {
            return c(h30Var, d3.h(handwritingGesture), b6Var, cvVar);
        }
        if (d3.w(handwritingGesture)) {
            return t(h30Var, d3.k(handwritingGesture), cw0Var, cvVar);
        }
        if (d3.y(handwritingGesture)) {
            return e(h30Var, d3.i(handwritingGesture), b6Var, cvVar);
        }
        if (ex.v(handwritingGesture)) {
            return n(h30Var, ex.m(handwritingGesture), b6Var, i11Var, cvVar);
        }
        if (d3.aa(handwritingGesture)) {
            return k(h30Var, d3.j(handwritingGesture), i11Var, cvVar);
        }
        if (ex.r(handwritingGesture)) {
            return p(h30Var, ex.n(handwritingGesture), b6Var, i11Var, cvVar);
        }
        return 2;
    }

    public final int j(ky0 ky0Var, HandwritingGesture handwritingGesture, bx0 bx0Var, i11 i11Var) {
        if (ex.x(handwritingGesture)) {
            return s(ky0Var, ex.o(handwritingGesture), bx0Var);
        }
        if (d3.q(handwritingGesture)) {
            return d(ky0Var, d3.h(handwritingGesture), bx0Var);
        }
        if (d3.w(handwritingGesture)) {
            return u(ky0Var, d3.k(handwritingGesture), bx0Var);
        }
        if (d3.y(handwritingGesture)) {
            return f(ky0Var, d3.i(handwritingGesture), bx0Var);
        }
        if (ex.v(handwritingGesture)) {
            return o(ky0Var, ex.m(handwritingGesture), bx0Var, i11Var);
        }
        if (d3.aa(handwritingGesture)) {
            return l(ky0Var, d3.j(handwritingGesture), bx0Var, i11Var);
        }
        if (ex.r(handwritingGesture)) {
            return q(ky0Var, ex.n(handwritingGesture), bx0Var, i11Var);
        }
        return 2;
    }
}
