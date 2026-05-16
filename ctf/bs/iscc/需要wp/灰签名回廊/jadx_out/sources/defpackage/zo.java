package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class zo extends CharacterStyle implements UpdateAppearance {
    public final yo d;

    public zo(yo yoVar) {
        this.d = yoVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ir irVar = ir.a;
            yo yoVar = this.d;
            if (f00.h(yoVar, irVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(yoVar instanceof gt0)) {
                wc.l();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((gt0) yoVar).a);
            textPaint.setStrokeMiter(4.0f);
            textPaint.setStrokeJoin(Paint.Join.MITER);
            textPaint.setStrokeCap(Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
