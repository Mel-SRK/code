package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.example.gnd.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.d) {
            case 0:
                k1 k1Var = (k1) this.e;
                AccessibilityManager accessibilityManager = k1Var.g;
                k1Var.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(k1Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(k1Var.j);
                break;
            case 1:
                b3 b3Var = (b3) this.e;
                Context context = view.getContext();
                if (!b3Var.a) {
                    context.getApplicationContext().registerComponentCallbacks((a3) b3Var.e);
                    b3Var.a = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.d;
        boolean z = false;
        Object obj = this.e;
        switch (i) {
            case 0:
                k1 k1Var = (k1) obj;
                k1Var.l.removeCallbacks(k1Var.an);
                AccessibilityManager accessibilityManager = k1Var.g;
                accessibilityManager.removeAccessibilityStateChangeListener(k1Var.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(k1Var.j);
                break;
            case 1:
                b3 b3Var = (b3) obj;
                Context context = view.getContext();
                if (b3Var.a) {
                    context.getApplicationContext().unregisterComponentCallbacks((a3) b3Var.e);
                    b3Var.a = false;
                }
                break;
            case 2:
                k kVar = (k) obj;
                ViewParent parent = kVar.getParent();
                Iterator it = (parent == null ? uq.a : new cm(new t4(4, parent), k11.l, 1)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    a41 a41Var = kVar.f;
                    if (a41Var != null) {
                        a41Var.e();
                    }
                    kVar.f = null;
                    kVar.requestLayout();
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((hs0) obj).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
