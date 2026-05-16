package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements ViewTranslationCallback {
    public static final p1 a = new p1();

    public final boolean onClearTranslation(View view) {
        pu puVar;
        view.getClass();
        h2 contentCaptureManager$ui_release = ((b1) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = e2.d;
        nz nzVarG = contentCaptureManager$ui_release.g();
        Object[] objArr = nzVarG.c;
        long[] jArr = nzVarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        q80 q80Var = ((xo0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = q80Var.g(zo0.ab);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = q80Var.g(oo0.l);
                            ah ahVar = (ah) (objG2 != null ? objG2 : null);
                            if (ahVar != null && (puVar = (pu) ahVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        cv cvVar;
        view.getClass();
        h2 contentCaptureManager$ui_release = ((b1) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = e2.d;
        nz nzVarG = contentCaptureManager$ui_release.g();
        Object[] objArr = nzVarG.c;
        long[] jArr = nzVarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        q80 q80Var = ((xo0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = q80Var.g(zo0.ab);
                        if (objG == null) {
                            objG = null;
                        }
                        if (f00.h(objG, Boolean.TRUE)) {
                            Object objG2 = q80Var.g(oo0.k);
                            ah ahVar = (ah) (objG2 != null ? objG2 : null);
                            if (ahVar != null && (cvVar = (cv) ahVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        cv cvVar;
        view.getClass();
        h2 contentCaptureManager$ui_release = ((b1) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = e2.e;
        nz nzVarG = contentCaptureManager$ui_release.g();
        Object[] objArr = nzVarG.c;
        long[] jArr = nzVarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        q80 q80Var = ((xo0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = q80Var.g(zo0.ab);
                        if (objG == null) {
                            objG = null;
                        }
                        if (f00.h(objG, Boolean.FALSE)) {
                            Object objG2 = q80Var.g(oo0.k);
                            ah ahVar = (ah) (objG2 != null ? objG2 : null);
                            if (ahVar != null && (cvVar = (cv) ahVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
