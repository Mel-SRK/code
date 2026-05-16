package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v21 extends u21 {
    public v21(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var, windowInsets);
    }

    @Override // defpackage.b31
    public e31 a() {
        return e31.b(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.b31
    public ym e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ym(displayCutout);
    }

    @Override // defpackage.t21, defpackage.b31
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v21)) {
            return false;
        }
        v21 v21Var = (v21) obj;
        return Objects.equals(this.c, v21Var.c) && Objects.equals(this.g, v21Var.g) && t21.aa(this.h, v21Var.h);
    }

    @Override // defpackage.b31
    public int hashCode() {
        return this.c.hashCode();
    }
}
