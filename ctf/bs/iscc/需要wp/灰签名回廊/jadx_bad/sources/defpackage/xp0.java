package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends CharacterStyle implements UpdateAppearance {
    public final float d;
    public final me0 e = bo0.m(new pq0(9205357640488583168L));
    public final km f = bo0.f(new t4(5, this));

    public xp0(j9 j9Var, float f) {
        this.d = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        e00.ah(textPaint, this.d);
        textPaint.setShader((Shader) this.f.getValue());
    }
}
