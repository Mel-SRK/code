package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    public final s3 a;
    public final int b;
    public final long c;
    public final xw0 d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o3(s3 s3Var, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int i7;
        yr0 yr0Var;
        int i8;
        int i9;
        int i10;
        char c;
        yr0 yr0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        xw0 xw0VarA;
        int i11;
        o3 o3Var;
        int i12;
        int i13;
        int i14;
        Layout layout;
        xp0[] xp0VarArr;
        CharSequence charSequence2;
        Object obj;
        ri0 ri0Var;
        float fH;
        this.a = s3Var;
        this.b = i;
        this.c = j;
        if (dh.i(j) != 0 || dh.j(j) != 0) {
            ty.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            ty.a("maxLines should be greater than 0");
        }
        nx0 nx0Var = s3Var.b;
        CharSequence charSequence3 = s3Var.h;
        if (i2 == 2) {
            i3 = 0;
            charSequence = charSequence3;
            if (!qx0.a(nx0Var.a.h, bo0.j(0))) {
                charSequence = charSequence3;
                if (!qx0.a(nx0Var.a.h, qx0.c)) {
                    int i15 = nx0Var.b.a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i15 != Integer.MIN_VALUE && i15 != 5 && i15 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean zI = wo0.i(spannableString, ky.class);
                            charSequence = spannableString;
                            if (!zI) {
                                spannableString.setSpan(new ky(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i3 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.e = charSequence4;
        ge0 ge0Var = nx0Var.b;
        yr0 yr0Var3 = nx0Var.a;
        int i16 = ge0Var.a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = ge0Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = ge0Var.g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                i4 = i21;
                i5 = i19;
                i6 = 1;
            } else if (i22 == 3) {
                i4 = i21;
                i5 = i19;
                i6 = 2;
            } else {
                i4 = i21;
                i5 = i19;
                i6 = i3;
            }
        }
        int i23 = (i4 >> 8) & 255;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & 255;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                yr0Var = yr0Var3;
                i8 = i18;
                i9 = 1;
            }
            if (i2 != i7) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i2 != 4) {
                    i10 = i20;
                    c = ' ';
                    yr0Var2 = yr0Var;
                    truncateAt = null;
                    xw0VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence4);
                    Layout layout2 = xw0VarA.f;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || s3Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        o3Var = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence charSequenceConcat = TextUtils.concat(charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length()));
                        o3 o3Var2 = this;
                        i12 = i;
                        i13 = i11;
                        xw0VarA = o3Var2.a(i13, i5, truncateAt, i12, i10, i6, i17, i9, charSequenceConcat);
                        o3Var = o3Var2;
                    }
                    int i25 = xw0VarA.g;
                    if (i2 != i14 || xw0VarA.a() <= dh.g(j) || i12 <= 1) {
                        o3Var.d = xw0VarA;
                    } else {
                        int iG = dh.g(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                break;
                            }
                            if (xw0VarA.e(i26) > iG) {
                                i25 = i26;
                                break;
                            }
                            i26++;
                        }
                        if (i25 >= 0 && i25 != o3Var.b) {
                            xw0VarA = o3Var.a(i13, i5, truncateAt, i25 < 1 ? 1 : i25, i10, i6, i17, i9, o3Var.e);
                        }
                        o3Var.d = xw0VarA;
                    }
                    o3Var.a.g.c(yr0Var2.a.c(), (((long) Float.floatToRawIntBits(o3Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(o3Var.d())) << c), yr0Var2.a.a());
                    layout = o3Var.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), xp0.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            xp0VarArr = (xp0[]) ((Spanned) text2).getSpans(0, layout.getText().length(), xp0.class);
                        }
                    } else {
                        xp0VarArr = null;
                    }
                    if (xp0VarArr != null) {
                        int i27 = 0;
                        while (i27 < xp0VarArr.length) {
                            int i28 = i27 + 1;
                            try {
                                xp0VarArr[i27].e.setValue(new pq0((((long) Float.floatToRawIntBits(o3Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(o3Var.d())) << c)));
                                i27 = i28;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    }
                    charSequence2 = o3Var.e;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), of0.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            of0 of0Var = (of0) obj2;
                            int spanStart = spanned2.getSpanStart(of0Var);
                            int spanEnd = spanned2.getSpanEnd(of0Var);
                            int lineForOffset = o3Var.d.f.getLineForOffset(spanStart);
                            boolean z = lineForOffset >= o3Var.b;
                            boolean z2 = o3Var.d.f.getEllipsisCount(lineForOffset) > 0 && spanEnd > o3Var.d.f.getEllipsisStart(lineForOffset);
                            boolean z3 = spanEnd > o3Var.d.f(lineForOffset);
                            if (z2 || z3 || z) {
                                ri0Var = null;
                            } else {
                                int iOrdinal = (o3Var.d.f.isRtlCharAt(spanStart) ? oj0.e : oj0.d).ordinal();
                                if (iOrdinal == 0) {
                                    fH = o3Var.d.h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        wc.l();
                                        throw null;
                                    }
                                    float fH2 = o3Var.d.h(spanStart, false);
                                    if (!of0Var.g) {
                                        ty.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - of0Var.e;
                                }
                                if (!of0Var.g) {
                                    ty.b("PlaceholderSpan is not laid out yet.");
                                }
                                float fD = o3Var.d.d(lineForOffset) - of0Var.b();
                                ri0Var = new ri0(fH, fD, of0Var.e + fH, of0Var.b() + fD);
                            }
                            arrayList.add(ri0Var);
                        }
                        obj = arrayList;
                    } else {
                        obj = rq.d;
                    }
                    o3Var.f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            yr0Var2 = yr0Var;
            truncateAt = truncateAt2;
            xw0VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence4);
            Layout layout22 = xw0VarA.f;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                o3Var = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = xw0VarA.g;
            if (i2 != i14) {
                o3Var.d = xw0VarA;
            }
            o3Var.a.g.c(yr0Var2.a.c(), (((long) Float.floatToRawIntBits(o3Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(o3Var.d())) << c), yr0Var2.a.a());
            layout = o3Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            if (xp0VarArr != null) {
            }
            charSequence2 = o3Var.e;
            if (charSequence2 instanceof Spanned) {
            }
            o3Var.f = obj;
        }
        i7 = 2;
        yr0Var = yr0Var3;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        yr0Var2 = yr0Var;
        truncateAt = truncateAt2;
        xw0VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence4);
        Layout layout222 = xw0VarA.f;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = xw0VarA.g;
        if (i2 != i14) {
        }
        o3Var.a.g.c(yr0Var2.a.c(), (((long) Float.floatToRawIntBits(o3Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(o3Var.d())) << c), yr0Var2.a.a());
        layout = o3Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        if (xp0VarArr != null) {
        }
        charSequence2 = o3Var.e;
        if (charSequence2 instanceof Spanned) {
        }
        o3Var.f = obj;
    }

    public final xw0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        xf0 xf0Var;
        float fD = d();
        s3 s3Var = this.a;
        u4 u4Var = s3Var.g;
        int i8 = s3Var.l;
        i20 i20Var = s3Var.i;
        nx0 nx0Var = s3Var.b;
        p3 p3Var = q3.a;
        hg0 hg0Var = nx0Var.c;
        return new xw0(charSequence, fD, u4Var, i, truncateAt, i8, (hg0Var == null || (xf0Var = hg0Var.b) == null) ? false : xf0Var.a, i3, i5, i6, i7, i4, i2, i20Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Type inference failed for: r13v26, types: [e3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(ri0 ri0Var, int i, wc wcVar) {
        vn0 gwVar;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderG;
        RectF rectFBf = pk.bf(ri0Var);
        boolean z = i != 0 && i == 1;
        final n3 n3Var = new n3(0, wcVar);
        xw0 xw0Var = this.d;
        TextPaint textPaint = xw0Var.a;
        Layout layout = xw0Var.f;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (z) {
                segmentFinderG = new l6(new f1(23, layout.getText(), xw0Var.j()));
            } else {
                d3.m();
                segmentFinderG = d3.g(d3.f(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFBf, segmentFinderG, new Layout.TextInclusionStrategy() { // from class: e3
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) n3Var.f(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            g20 g20VarC = xw0Var.c();
            if (z) {
                gwVar = new f1(23, layout.getText(), xw0Var.j());
            } else {
                CharSequence text = layout.getText();
                gwVar = i3 >= 29 ? new gw(text, textPaint) : new hw(text);
            }
            vn0 vn0Var = gwVar;
            int lineForVertical = layout.getLineForVertical((int) rectFBf.top);
            if (rectFBf.top <= xw0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < xw0Var.g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFBf.bottom);
                if (lineForVertical2 != 0 || rectFBf.bottom >= xw0Var.g(0)) {
                    int i5 = q6.i(xw0Var, layout, g20VarC, i4, rectFBf, vn0Var, n3Var, true);
                    while (true) {
                        i2 = i4;
                        if (i5 != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        i5 = q6.i(xw0Var, layout, g20VarC, i4, rectFBf, vn0Var, n3Var, true);
                    }
                    if (i5 == -1) {
                        rangeForRect = null;
                    } else {
                        int i6 = lineForVertical2;
                        int i7 = q6.i(xw0Var, layout, g20VarC, i6, rectFBf, vn0Var, n3Var, false);
                        while (i7 == -1 && i2 < i6) {
                            i6--;
                            i7 = q6.i(xw0Var, layout, g20VarC, i6, rectFBf, vn0Var, n3Var, false);
                        }
                        if (i7 != -1) {
                            rangeForRect = new int[]{vn0Var.f(i5 + 1), vn0Var.g(i7 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? hx0.b : wo0.b(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return dh.h(this.c);
    }

    public final void e(oa oaVar) {
        Canvas canvasA = f0.a(oaVar);
        xw0 xw0Var = this.d;
        if (xw0Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = xw0Var.h;
        if (canvasA.getClipBounds(xw0Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            av0 av0Var = cx0.a;
            av0Var.a = canvasA;
            xw0Var.f.draw(av0Var);
            if (i != 0) {
                canvasA.translate(0.0f, (-1) * i);
            }
        }
        if (xw0Var.d) {
            canvasA.restore();
        }
    }

    public final void f(oa oaVar, long j, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        u4 u4Var = this.a.g;
        int i = u4Var.c;
        u4Var.d(j);
        u4Var.f(yp0Var);
        u4Var.g(bv0Var);
        u4Var.e(yoVar);
        u4Var.b(3);
        e(oaVar);
        u4Var.b(i);
    }

    public final void g(oa oaVar, i9 i9Var, float f, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        u4 u4Var = this.a.g;
        int i = u4Var.c;
        float fD = d();
        u4Var.c(i9Var, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        u4Var.f(yp0Var);
        u4Var.g(bv0Var);
        u4Var.e(yoVar);
        u4Var.b(3);
        e(oaVar);
        u4Var.b(i);
    }
}
