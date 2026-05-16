package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.example.gnd.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i21 extends l21 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final gr f = new gr();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(m21 m21Var, View view) {
        d21 d21VarJ = j(view);
        if (d21VarJ != null) {
            d21VarJ.b(m21Var);
            if (d21VarJ.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(m21Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, m21 m21Var, e31 e31Var, boolean z) {
        d21 d21VarJ = j(view);
        if (d21VarJ != null) {
            d21VarJ.d = e31Var;
            if (!z) {
                d21VarJ.c(m21Var);
                z = d21VarJ.e == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), m21Var, e31Var, z);
            }
        }
    }

    public static void h(View view, e31 e31Var, List list) {
        d21 d21VarJ = j(view);
        if (d21VarJ != null) {
            e31Var = d21VarJ.d(e31Var, list);
            if (d21VarJ.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), e31Var, list);
            }
        }
    }

    public static void i(View view, m21 m21Var, f1 f1Var) {
        d21 d21VarJ = j(view);
        if (d21VarJ != null) {
            d21VarJ.e(m21Var, f1Var);
            if (d21VarJ.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), m21Var, f1Var);
            }
        }
    }

    public static d21 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof h21) {
            return ((h21) tag).a;
        }
        return null;
    }
}
