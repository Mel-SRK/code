package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class u7 extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final float e;

    public /* synthetic */ u7(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }
}
