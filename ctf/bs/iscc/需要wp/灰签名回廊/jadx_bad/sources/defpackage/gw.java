package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class gw extends i60 {
    public final CharSequence q;
    public final TextPaint r;

    public gw(CharSequence charSequence, TextPaint textPaint) {
        this.q = charSequence;
        this.r = textPaint;
    }

    @Override // defpackage.i60
    public final int aq(int i) {
        CharSequence charSequence = this.q;
        return this.r.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.i60
    public final int au(int i) {
        CharSequence charSequence = this.q;
        return this.r.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
