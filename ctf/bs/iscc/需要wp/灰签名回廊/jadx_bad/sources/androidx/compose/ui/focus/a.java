package androidx.compose.ui.focus;

import defpackage.cv;
import defpackage.j70;
import defpackage.ys;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final j70 a(ys ysVar) {
        return new FocusRequesterElement(ysVar);
    }

    public static final j70 b(j70 j70Var, cv cvVar) {
        return j70Var.c(new FocusChangedElement(cvVar));
    }
}
