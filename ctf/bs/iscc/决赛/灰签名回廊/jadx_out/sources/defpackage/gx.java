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
        To view partially-correct add '--show-bad-code' argument
    */
    private final int k(defpackage.h30 r7, android.view.inputmethod.InsertGesture r8, defpackage.i11 r9, defpackage.cv r10) {
        /*
            r6 = this;
            if (r9 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r7 = defpackage.ex.l(r8)
            int r7 = r6.b(r7, r10)
            return r7
        Lb:
            android.graphics.PointF r0 = defpackage.ex.g(r8)
            float r1 = r0.x
            float r0 = r0.y
            long r0 = defpackage.d41.h(r1, r0)
            ax0 r2 = r7.d()
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L49
            zw0 r2 = r2.a
            y70 r2 = r2.b
            d20 r5 = r7.c()
            if (r5 == 0) goto L49
            long r0 = r5.ad(r0)
            int r9 = defpackage.t1.y(r2, r0, r9)
            if (r9 != r3) goto L34
            goto L49
        L34:
            float r5 = r2.d(r9)
            float r9 = r2.b(r9)
            float r9 = r9 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r5
            long r0 = defpackage.xa0.a(r0, r9, r4)
            int r9 = r2.e(r0)
            goto L4a
        L49:
            r9 = r3
        L4a:
            if (r9 == r3) goto L63
            ax0 r7 = r7.d()
            if (r7 == 0) goto L5b
            zw0 r7 = r7.a
            boolean r7 = defpackage.t1.e(r7, r9)
            if (r7 != r4) goto L5b
            goto L63
        L5b:
            java.lang.String r7 = defpackage.ex.q(r8)
            r6.m(r9, r7, r10)
            return r4
        L63:
            android.view.inputmethod.HandwritingGesture r7 = defpackage.ex.l(r8)
            int r7 = r6.b(r7, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.k(h30, android.view.inputmethod.InsertGesture, i11, cv):int");
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
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(defpackage.h30 r11, android.view.inputmethod.JoinOrSplitGesture r12, defpackage.b6 r13, defpackage.i11 r14, defpackage.cv r15) {
        /*
            r10 = this;
            if (r14 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r1 = defpackage.ex.l(r12)
            int r1 = r10.b(r1, r15)
            return r1
        Lb:
            android.graphics.PointF r2 = defpackage.ex.h(r12)
            float r4 = r2.x
            float r2 = r2.y
            long r6 = defpackage.d41.h(r4, r2)
            ax0 r2 = r11.d()
            r4 = -1
            r8 = 1
            if (r2 == 0) goto L49
            zw0 r2 = r2.a
            y70 r2 = r2.b
            d20 r9 = r11.c()
            if (r9 == 0) goto L49
            long r6 = r9.ad(r6)
            int r1 = defpackage.t1.y(r2, r6, r14)
            if (r1 != r4) goto L34
            goto L49
        L34:
            float r9 = r2.d(r1)
            float r1 = r2.b(r1)
            float r1 = r1 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r9
            long r6 = defpackage.xa0.a(r6, r1, r8)
            int r1 = r2.e(r6)
            goto L4a
        L49:
            r1 = r4
        L4a:
            if (r1 == r4) goto La4
            ax0 r2 = r11.d()
            if (r2 == 0) goto L5b
            zw0 r2 = r2.a
            boolean r2 = defpackage.t1.e(r2, r1)
            if (r2 != r8) goto L5b
            goto La4
        L5b:
            r2 = r1
        L5c:
            if (r2 <= 0) goto L6f
            int r4 = java.lang.Character.codePointBefore(r13, r2)
            boolean r6 = defpackage.t1.ak(r4)
            if (r6 != 0) goto L69
            goto L6f
        L69:
            int r4 = java.lang.Character.charCount(r4)
            int r2 = r2 - r4
            goto L5c
        L6f:
            java.lang.String r4 = r13.e
            int r4 = r4.length()
            if (r1 >= r4) goto L88
            int r4 = java.lang.Character.codePointAt(r13, r1)
            boolean r6 = defpackage.t1.ak(r4)
            if (r6 != 0) goto L82
            goto L88
        L82:
            int r4 = java.lang.Character.charCount(r4)
            int r1 = r1 + r4
            goto L6f
        L88:
            long r1 = defpackage.wo0.b(r2, r1)
            boolean r4 = defpackage.hx0.b(r1)
            if (r4 == 0) goto L9c
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            java.lang.String r2 = " "
            r10.m(r1, r2, r15)
            return r8
        L9c:
            r4 = 0
            r0 = r10
            r3 = r13
            r5 = r15
            r0.h(r1, r3, r4, r5)
            return r8
        La4:
            android.view.inputmethod.HandwritingGesture r1 = defpackage.ex.l(r12)
            int r1 = r10.b(r1, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.n(h30, android.view.inputmethod.JoinOrSplitGesture, b6, i11, cv):int");
    }

    private final int o(ky0 ky0Var, JoinOrSplitGesture joinOrSplitGesture, bx0 bx0Var, i11 i11Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int p(defpackage.h30 r18, android.view.inputmethod.RemoveSpaceGesture r19, defpackage.b6 r20, defpackage.i11 r21, defpackage.cv r22) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.p(h30, android.view.inputmethod.RemoveSpaceGesture, b6, i11, cv):int");
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
