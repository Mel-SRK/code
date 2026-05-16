package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {
    public static final r1 a = new r1();

    public final void a(View view, mg0 mg0Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = mg0Var instanceof x3 ? PointerIcon.getSystemIcon(context, ((x3) mg0Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (f00.h(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
