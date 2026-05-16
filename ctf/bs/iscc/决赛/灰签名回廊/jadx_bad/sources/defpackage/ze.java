package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ze extends ClickableSpan {
    public final k40 d;

    public ze(k40 k40Var) {
        this.d = k40Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.d.getClass();
    }
}
