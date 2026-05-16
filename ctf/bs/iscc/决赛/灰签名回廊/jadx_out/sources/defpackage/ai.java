package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ai extends ClickableSpan {
    public final int d;
    public final ba e;
    public final int f;

    public ai(int i, ba baVar, int i2) {
        this.d = i;
        this.e = baVar;
        this.f = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.f, bundle);
    }
}
