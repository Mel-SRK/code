package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zw0 {
    public final yw0 a;
    public final y70 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public zw0(yw0 yw0Var, y70 y70Var, long j) {
        this.a = yw0Var;
        this.b = y70Var;
        this.c = j;
        ArrayList arrayList = y70Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((ce0) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            ce0 ce0Var = (ce0) kc.aw(arrayList);
            fD = ce0Var.a.d.d(r4.g - 1) + ce0Var.f;
        }
        this.e = fD;
        this.f = y70Var.g;
    }

    public final oj0 a(int i) {
        y70 y70Var = this.b;
        y70Var.i(i);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(i == length ? f00.v(arrayList) : e00.t(i, arrayList));
        return ce0Var.a.d.f.isRtlCharAt(ce0Var.d(i)) ? oj0.e : oj0.d;
    }

    public final ri0 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        y70 y70Var = this.b;
        y70Var.h(i);
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.t(i, arrayList));
        o3 o3Var = ce0Var.a;
        int iD = ce0Var.d(i);
        CharSequence charSequence = o3Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            ty.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ')');
        }
        xw0 xw0Var = o3Var.d;
        Layout layout = xw0Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = xw0Var.g(lineForOffset);
        float fE = xw0Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = xw0Var.i(iD, false);
                fH2 = xw0Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = xw0Var.h(iD, false);
                fH2 = xw0Var.h(iD + 1, true);
            } else {
                fI = xw0Var.i(iD, false);
                fI2 = xw0Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = xw0Var.h(iD, false);
            fI2 = xw0Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return ce0Var.a(new ri0(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final ri0 c(int i) {
        y70 y70Var = this.b;
        y70Var.i(i);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(i == length ? f00.v(arrayList) : e00.t(i, arrayList));
        o3 o3Var = ce0Var.a;
        int iD = ce0Var.d(i);
        CharSequence charSequence = o3Var.e;
        xw0 xw0Var = o3Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            ty.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ']');
        }
        float fH = xw0Var.h(iD, false);
        int lineForOffset = xw0Var.f.getLineForOffset(iD);
        return ce0Var.a(new ri0(fH, xw0Var.g(lineForOffset), fH, xw0Var.e(lineForOffset)));
    }

    public final int d(int i, boolean z) {
        int iF;
        y70 y70Var = this.b;
        y70Var.j(i);
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        int i2 = i - ce0Var.d;
        xw0 xw0Var = o3Var.d;
        if (z) {
            Layout layout = xw0Var.f;
            av0 av0Var = cx0.a;
            if (layout.getEllipsisCount(i2) <= 0 || xw0Var.b != TextUtils.TruncateAt.END) {
                g20 g20VarC = xw0Var.c();
                Layout layout2 = (Layout) g20VarC.b;
                iF = g20VarC.i(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = xw0Var.f(i2);
        }
        return iF + ce0Var.b;
    }

    public final int e(int i) {
        y70 y70Var = this.b;
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(i >= ((b6) y70Var.a.b).e.length() ? f00.v(arrayList) : i < 0 ? 0 : e00.t(i, arrayList));
        return ce0Var.a.d.f.getLineForOffset(ce0Var.d(i)) + ce0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw0)) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return f00.h(this.a, zw0Var.a) && this.b.equals(zw0Var.b) && wz.a(this.c, zw0Var.c) && this.d == zw0Var.d && this.e == zw0Var.e && f00.h(this.f, zw0Var.f);
    }

    public final float f(int i) {
        y70 y70Var = this.b;
        y70Var.j(i);
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        int i2 = i - ce0Var.d;
        xw0 xw0Var = o3Var.d;
        return xw0Var.f.getLineLeft(i2) + (i2 == xw0Var.g + (-1) ? xw0Var.j : 0.0f);
    }

    public final float g(int i) {
        y70 y70Var = this.b;
        y70Var.j(i);
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        int i2 = i - ce0Var.d;
        xw0 xw0Var = o3Var.d;
        return xw0Var.f.getLineRight(i2) + (i2 == xw0Var.g + (-1) ? xw0Var.k : 0.0f);
    }

    public final int h(int i) {
        y70 y70Var = this.b;
        y70Var.j(i);
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        return o3Var.d.f.getLineStart(i - ce0Var.d) + ce0Var.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + n5.b(this.e, n5.b(this.d, n5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final oj0 i(int i) {
        y70 y70Var = this.b;
        y70Var.i(i);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(i == length ? f00.v(arrayList) : e00.t(i, arrayList));
        o3 o3Var = ce0Var.a;
        int iD = ce0Var.d(i);
        xw0 xw0Var = o3Var.d;
        return xw0Var.f.getParagraphDirection(xw0Var.f.getLineForOffset(iD)) == 1 ? oj0.d : oj0.e;
    }

    public final t3 j(final int i, final int i2) {
        y70 y70Var = this.b;
        b6 b6Var = (b6) y70Var.a.b;
        if (i < 0 || i > i2 || i2 > b6Var.e.length()) {
            ty.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + b6Var.e.length() + "), or start > end!");
        }
        if (i == i2) {
            return u3.a();
        }
        final t3 t3VarA = u3.a();
        e00.w(y70Var.h, wo0.b(i, i2), new cv() { // from class: x70
            @Override // defpackage.cv
            public final Object g(Object obj) {
                ce0 ce0Var = (ce0) obj;
                o3 o3Var = ce0Var.a;
                int iD = ce0Var.d(i);
                int iD2 = ce0Var.d(i2);
                CharSequence charSequence = o3Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    ty.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                xw0 xw0Var = o3Var.d;
                xw0Var.f.getSelectionPath(iD, iD2, path);
                int i3 = xw0Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ce0Var.f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i4 = (int) 0;
                t3VarA.a.addPath(path, Float.intBitsToFloat(i4), Float.intBitsToFloat(i4));
                return wz0.a;
            }
        });
        return t3VarA;
    }

    public final long k(int i) {
        int iJ;
        int i2;
        int i3;
        y70 y70Var = this.b;
        y70Var.i(i);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(i == length ? f00.v(arrayList) : e00.t(i, arrayList));
        o3 o3Var = ce0Var.a;
        int iD = ce0Var.d(i);
        oe0 oe0VarJ = o3Var.d.j();
        if (oe0VarJ.h(oe0VarJ.j(iD))) {
            oe0VarJ.a(iD);
            iJ = iD;
            while (iJ != -1 && (!oe0VarJ.h(iJ) || oe0VarJ.d(iJ))) {
                iJ = oe0VarJ.j(iJ);
            }
        } else {
            oe0VarJ.a(iD);
            iJ = oe0VarJ.g(iD) ? (!oe0VarJ.e(iD) || oe0VarJ.c(iD)) ? oe0VarJ.j(iD) : iD : oe0VarJ.c(iD) ? oe0VarJ.j(iD) : -1;
        }
        if (iJ == -1) {
            iJ = iD;
        }
        if (oe0VarJ.d(oe0VarJ.i(iD))) {
            oe0VarJ.a(iD);
            i2 = iD;
            while (i2 != -1 && (oe0VarJ.h(i2) || !oe0VarJ.d(i2))) {
                i2 = oe0VarJ.i(i2);
            }
        } else {
            oe0VarJ.a(iD);
            if (oe0VarJ.c(iD)) {
                if (!oe0VarJ.e(iD) || oe0VarJ.g(iD)) {
                    i3 = oe0VarJ.i(iD);
                    i2 = i3;
                } else {
                    i2 = iD;
                }
            } else if (oe0VarJ.g(iD)) {
                i3 = oe0VarJ.i(iD);
                i2 = i3;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            iD = i2;
        }
        return ce0Var.b(wo0.b(iJ, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) wz.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
