package androidx.compose.ui.draw;

import defpackage.cv;
import defpackage.j70;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final j70 a(cv cvVar) {
        return new DrawBehindElement(cvVar);
    }

    public static final j70 b(j70 j70Var, cv cvVar) {
        return j70Var.c(new DrawWithCacheElement(cvVar));
    }

    public static final j70 c(j70 j70Var, cv cvVar) {
        return j70Var.c(new DrawWithContentElement(cvVar));
    }
}
