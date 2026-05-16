package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.example.gnd.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h21 implements View.OnApplyWindowInsetsListener {
    public final d21 a;
    public e31 b;

    public h21(View view, d21 d21Var) {
        e31 e31VarB;
        this.a = d21Var;
        int i = f11.a;
        e31 e31VarA = b11.a(view);
        if (e31VarA != null) {
            int i2 = Build.VERSION.SDK_INT;
            e31VarB = (i2 >= 34 ? new r21(e31VarA) : i2 >= 31 ? new q21(e31VarA) : i2 >= 30 ? new p21(e31VarA) : i2 >= 29 ? new o21(e31VarA) : new n21(e31VarA)).b();
        } else {
            e31VarB = null;
        }
        this.b = e31VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = e31.b(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        e31 e31VarB = e31.b(windowInsets, view);
        b31 b31Var = e31VarB.a;
        if (this.b == null) {
            int i = f11.a;
            this.b = b11.a(view);
        }
        if (this.b == null) {
            this.b = e31VarB;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            d21 d21VarJ = i21.j(view);
            if (d21VarJ == null || !Objects.equals(d21VarJ.d, e31VarB)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                e31 e31Var = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    iz izVarF = b31Var.f(i2);
                    iz izVarF2 = e31Var.a.f(i2);
                    int i3 = izVarF.a;
                    int i4 = izVarF.d;
                    int i5 = izVarF.c;
                    int i6 = izVarF.b;
                    int i7 = izVarF2.a;
                    int i8 = izVarF2.d;
                    int[] iArr4 = iArr2;
                    int i9 = izVarF2.c;
                    int i10 = izVarF2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = e31VarB;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    e31 e31Var2 = this.b;
                    m21 m21Var = new m21(i13, (i11 & 8) != 0 ? i21.e : (i12 & 8) != 0 ? i21.f : (i11 & 519) != 0 ? i21.g : (i12 & 519) != 0 ? i21.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    m21Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(m21Var.a.b());
                    iz izVarF3 = b31Var.f(i13);
                    iz izVarF4 = e31Var2.a.f(i13);
                    int iMin = Math.min(izVarF3.a, izVarF4.a);
                    int i14 = izVarF3.b;
                    int i15 = izVarF4.b;
                    int iMin2 = Math.min(i14, i15);
                    int i16 = izVarF3.c;
                    int i17 = izVarF4.c;
                    int iMin3 = Math.min(i16, i17);
                    int i18 = izVarF3.d;
                    int i19 = izVarF4.d;
                    f1 f1Var = new f1(22, iz.c(iMin, iMin2, iMin3, Math.min(i18, i19)), iz.c(Math.max(izVarF3.a, izVarF4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    i21.g(view, m21Var, e31VarB, false);
                    duration.addUpdateListener(new e21(m21Var, e31VarB, e31Var2, i13, view));
                    duration.addListener(new f21(m21Var, view));
                    nb0 nb0Var = new nb0(view, new g21(view, m21Var, f1Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(nb0Var);
                    view.addOnAttachStateChangeListener(nb0Var);
                    this.b = e31VarB;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
