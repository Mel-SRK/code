package androidx.compose.ui.graphics;

import defpackage.aq0;
import defpackage.f00;
import defpackage.iy0;
import defpackage.j70;
import defpackage.mw;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static j70 a(j70 j70Var, float f, aq0 aq0Var, int i) {
        if ((i & 32) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        long j = iy0.a;
        if ((i & 2048) != 0) {
            aq0Var = f00.i;
        }
        long j2 = mw.a;
        return j70Var.c(new GraphicsLayerElement(1.0f, f2, j, aq0Var, false, j2, j2));
    }

    public static j70 b(j70 j70Var, float f, aq0 aq0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        long j = iy0.a;
        if ((i & 2048) != 0) {
            aq0Var = f00.i;
        }
        long j2 = mw.a;
        return j70Var.c(new GraphicsLayerElement(f2, 0.0f, j, aq0Var, true, j2, j2));
    }
}
