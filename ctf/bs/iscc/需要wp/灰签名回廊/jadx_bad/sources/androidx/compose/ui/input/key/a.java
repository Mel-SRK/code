package androidx.compose.ui.input.key;

import defpackage.cv;
import defpackage.j70;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final j70 a(cv cvVar) {
        return new KeyInputElement(cvVar, null);
    }

    public static final j70 b(j70 j70Var, cv cvVar) {
        return j70Var.c(new KeyInputElement(null, cvVar));
    }
}
