package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.example.gnd.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b41 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a41 a(k kVar, cg cgVar, te teVar) {
        b1 b1Var;
        a41 a41Var;
        if (ew.a.compareAndSet(false, true)) {
            o9 o9VarA = i60.a(1, 6, null);
            i60.an(i60.c((pj) z4.p.getValue()), null, new w8(o9VarA, null), 3);
            l1 l1Var = new l1(13, o9VarA);
            synchronized (fr0.c) {
                fr0.i = kc.ay(fr0.i, l1Var);
            }
            fr0.a();
        }
        if (kVar.getChildCount() > 0) {
            View childAt = kVar.getChildAt(0);
            if (childAt instanceof b1) {
                b1Var = (b1) childAt;
            }
            if (b1Var == null) {
                b1Var = new b1(kVar.getContext(), cgVar.i());
                kVar.addView(b1Var.getView(), a);
            }
            Object tag = b1Var.getView().getTag(R.id.wrapped_composition_tag);
            a41Var = tag instanceof a41 ? (a41) tag : null;
            if (a41Var == null) {
                s20 root = b1Var.getRoot();
                o6 o6Var = new o6();
                o6Var.a = root;
                o6Var.b = new ArrayList();
                o6Var.c = root;
                a41Var = new a41(b1Var, new jg(cgVar, o6Var));
                b1Var.getView().setTag(R.id.wrapped_composition_tag, a41Var);
            }
            a41Var.f(teVar);
            if (!f00.h(b1Var.getCoroutineContext(), cgVar.i())) {
                b1Var.setCoroutineContext(cgVar.i());
            }
            return a41Var;
        }
        kVar.removeAllViews();
        b1Var = null;
        if (b1Var == null) {
        }
        Object tag2 = b1Var.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof a41) {
        }
        if (a41Var == null) {
        }
        a41Var.f(teVar);
        if (!f00.h(b1Var.getCoroutineContext(), cgVar.i())) {
        }
        return a41Var;
    }
}
