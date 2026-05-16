package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ah0 extends yf0 {
    @Override // defpackage.yf0
    public final void i(zg0 zg0Var, int i, int i2) {
        zg0Var.setSystemGestureExclusionRects(new ArrayList(new y6(new Rect[]{new Rect(0, 0, i, i2)}, true)));
    }
}
