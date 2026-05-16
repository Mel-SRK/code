package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.example.gnd.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f11 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, d21 d21Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(d21Var != null ? new j21(d21Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = i21.e;
        View.OnApplyWindowInsetsListener h21Var = d21Var != null ? new h21(view, d21Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, h21Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(h21Var);
        }
    }
}
