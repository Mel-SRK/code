package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class xw0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public oe0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final f40[] o;
    public final Rect p = new Rect();
    public g20 q;

    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xw0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, i20 i20Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        int i10;
        Layout layoutC;
        long j;
        f40[] f40VarArr;
        char c;
        int i11;
        boolean zIsFallbackLineSpacingEnabled;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = cx0.a(i2);
        Layout.Alignment alignment = zu0.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : zu0.b : zu0.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, u7.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = i20Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || i20Var.c() > f || z2) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
                i10 = 33;
                layoutC = wn0.c(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    ty.a("negative width");
                }
                if (iCeil < 0) {
                    ty.a("negative ellipsized width");
                }
                layoutC = Build.VERSION.SDK_INT >= 33 ? av.e(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
                i10 = 33;
            }
            this.f = layoutC;
            Trace.endSection();
            int iMin = Math.min(layoutC.getLineCount(), i9);
            this.g = iMin;
            int i12 = iMin - 1;
            this.d = iMin >= i9 && (layoutC.getEllipsisCount(i12) > 0 || layoutC.getLineEnd(i12) != charSequence.length());
            long j2 = cx0.b;
            char c2 = ' ';
            if (z) {
                j = j2;
            } else if (this.l) {
                zIsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= i10 ? ((BoringLayout) layoutC).isFallbackLineSpacingEnabled() : false;
                if (!zIsFallbackLineSpacingEnabled) {
                    TextPaint paint = layoutC.getPaint();
                    CharSequence text = layoutC.getText();
                    Rect rectAe = i60.ae(paint, text, layoutC.getLineStart(0), layoutC.getLineEnd(0));
                    int lineAscent = layoutC.getLineAscent(0);
                    int i13 = rectAe.top;
                    int topPadding = i13 < lineAscent ? lineAscent - i13 : layoutC.getTopPadding();
                    rectAe = iMin != 1 ? i60.ae(paint, text, layoutC.getLineStart(i12), layoutC.getLineEnd(i12)) : rectAe;
                    int lineDescent = layoutC.getLineDescent(i12);
                    int i14 = rectAe.bottom;
                    int bottomPadding = i14 > lineDescent ? i14 - lineDescent : layoutC.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                }
            } else {
                StaticLayout staticLayout = (StaticLayout) layoutC;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= i10) {
                    zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                } else if (i15 >= 28) {
                    zIsFallbackLineSpacingEnabled = true;
                }
                if (!zIsFallbackLineSpacingEnabled) {
                }
            }
            Paint.FontMetricsInt fontMetricsInt = null;
            if (layoutC.getText() instanceof Spanned) {
                CharSequence text2 = layoutC.getText();
                text2.getClass();
                if (wo0.i((Spanned) text2, f40.class) || layoutC.getText().length() <= 0) {
                    CharSequence text3 = layoutC.getText();
                    text3.getClass();
                    f40VarArr = (f40[]) ((Spanned) text3).getSpans(0, layoutC.getText().length(), f40.class);
                }
            } else {
                f40VarArr = null;
            }
            this.o = f40VarArr;
            if (f40VarArr != null) {
                int length2 = f40VarArr.length;
                int iMax = 0;
                int iMax2 = 0;
                int i16 = 0;
                while (i16 < length2) {
                    f40 f40Var = f40VarArr[i16];
                    char c3 = c2;
                    int i17 = f40Var.n;
                    iMax = i17 < 0 ? Math.max(iMax, Math.abs(i17)) : iMax;
                    int i18 = f40Var.o;
                    if (i18 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i18));
                    }
                    i16++;
                    c2 = c3;
                }
                c = c2;
                j2 = (iMax == 0 && iMax2 == 0) ? cx0.b : (((long) iMax) << c) | (((long) iMax2) & 4294967295L);
            } else {
                c = ' ';
            }
            this.h = Math.max((int) (j >> c), (int) (j2 >> c));
            this.i = Math.max((int) (j & 4294967295L), (int) (j2 & 4294967295L));
            TextPaint textPaint2 = this.a;
            f40[] f40VarArr2 = this.o;
            int i19 = this.g - 1;
            Layout layout = this.f;
            if (layout.getLineStart(i19) != layout.getLineEnd(i19) || f40VarArr2 == null || f40VarArr2.length == 0) {
                i11 = 0;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                if (f40VarArr2.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                f40 f40Var2 = f40VarArr2[0];
                spannableString.setSpan(new f40(f40Var2.d, spannableString.length(), (i19 == 0 || !f40Var2.g) ? f40Var2.g : false, f40Var2.g, f40Var2.h, f40Var2.i), 0, spannableString.length(), i10);
                StaticLayout staticLayoutC = wn0.c(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, c20.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                i11 = 0;
                fontMetricsInt.ascent = staticLayoutC.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutC.getLineDescent(0);
                fontMetricsInt.top = staticLayoutC.getLineTop(0);
                fontMetricsInt.bottom = staticLayoutC.getLineBottom(0);
            }
            this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i12) - g(i12))) : i11;
            this.m = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = m10.y(layout2, i12, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = m10.z(layout3, i12, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final g20 c() {
        g20 g20Var = this.q;
        if (g20Var != null) {
            return g20Var;
        }
        g20 g20Var2 = new g20(this.f);
        this.q = g20Var2;
        return g20Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        av0 av0Var = cx0.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, false, z);
    }

    public final oe0 j() {
        oe0 oe0Var = this.e;
        if (oe0Var != null) {
            return oe0Var;
        }
        Layout layout = this.f;
        oe0 oe0Var2 = new oe0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = oe0Var2;
        return oe0Var2;
    }
}
