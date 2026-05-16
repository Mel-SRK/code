package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class e21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ m21 a;
    public final /* synthetic */ e31 b;
    public final /* synthetic */ e31 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public e21(m21 m21Var, e31 e31Var, e31 e31Var2, int i, View view) {
        this.a = m21Var;
        this.b = e31Var;
        this.c = e31Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        m21 m21Var;
        e31 e31Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m21 m21Var2 = this.a;
        l21 l21Var = m21Var2.a;
        l21Var.e(animatedFraction);
        float fC = l21Var.c();
        PathInterpolator pathInterpolator = i21.e;
        int i = Build.VERSION.SDK_INT;
        e31 e31Var2 = this.b;
        s21 r21Var = i >= 34 ? new r21(e31Var2) : i >= 31 ? new q21(e31Var2) : i >= 30 ? new p21(e31Var2) : i >= 29 ? new o21(e31Var2) : new n21(e31Var2);
        int i2 = 1;
        while (i2 <= 512) {
            int i3 = this.d & i2;
            b31 b31Var = e31Var2.a;
            if (i3 == 0) {
                r21Var.c(i2, b31Var.f(i2));
                f = fC;
                m21Var = m21Var2;
                e31Var = e31Var2;
            } else {
                iz izVarF = b31Var.f(i2);
                iz izVarF2 = this.c.a.f(i2);
                int i4 = izVarF.a;
                int i5 = izVarF.d;
                int i6 = izVarF.c;
                int i7 = izVarF.b;
                float f2 = 1.0f - fC;
                int i8 = (int) (((double) ((i4 - izVarF2.a) * f2)) + 0.5d);
                int i9 = (int) (((double) ((i7 - izVarF2.b) * f2)) + 0.5d);
                f = fC;
                m21Var = m21Var2;
                int i10 = (int) (((double) ((i6 - izVarF2.c) * f2)) + 0.5d);
                float f3 = (i5 - izVarF2.d) * f2;
                e31Var = e31Var2;
                int i11 = (int) (((double) f3) + 0.5d);
                int iMax = Math.max(0, i4 - i8);
                int iMax2 = Math.max(0, i7 - i9);
                int iMax3 = Math.max(0, i6 - i10);
                int iMax4 = Math.max(0, i5 - i11);
                r21Var.c(i2, (iMax == i8 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? izVarF : iz.c(iMax, iMax2, iMax3, iMax4));
            }
            i2 <<= 1;
            m21Var2 = m21Var;
            e31Var2 = e31Var;
            fC = f;
        }
        i21.h(this.e, r21Var.b(), Collections.singletonList(m21Var2));
    }
}
