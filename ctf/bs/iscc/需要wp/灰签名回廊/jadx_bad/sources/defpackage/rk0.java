package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class rk0 {
    public static final boolean a = f00.h(Build.DEVICE, "layoutlib");

    public static final jk0 a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof jk0) {
                return (jk0) childAt;
            }
        }
        jk0 jk0Var = new jk0(viewGroup.getContext());
        viewGroup.addView(jk0Var);
        return jk0Var;
    }

    public static final ViewGroup b(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                wc.j("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
