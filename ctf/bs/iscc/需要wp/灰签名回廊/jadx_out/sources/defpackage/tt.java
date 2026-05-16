package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class tt extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ tt(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }
}
