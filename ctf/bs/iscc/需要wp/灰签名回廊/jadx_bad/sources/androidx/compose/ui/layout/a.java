package androidx.compose.ui.layout;

import defpackage.cv;
import defpackage.h20;
import defpackage.hv;
import defpackage.j70;
import defpackage.k60;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(k60 k60Var) {
        Object objJ = k60Var.j();
        h20 h20Var = objJ instanceof h20 ? (h20) objJ : null;
        if (h20Var != null) {
            return h20Var.r;
        }
        return null;
    }

    public static final j70 b(hv hvVar) {
        return new LayoutElement(hvVar);
    }

    public static final j70 c(j70 j70Var, String str) {
        return j70Var.c(new LayoutIdElement(str));
    }

    public static final j70 d(j70 j70Var, cv cvVar) {
        return j70Var.c(new OnGloballyPositionedElement(cvVar));
    }

    public static final j70 e(j70 j70Var, cv cvVar) {
        return j70Var.c(new OnSizeChangedModifier(cvVar));
    }
}
