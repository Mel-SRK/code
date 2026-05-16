package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class m21 {
    public l21 a;

    public m21(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new k21(at.i(i, interpolator, j));
        } else {
            this.a = new i21(i, interpolator, j);
        }
    }
}
