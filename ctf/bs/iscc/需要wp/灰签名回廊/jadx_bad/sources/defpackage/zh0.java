package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zh0 extends FrameLayout {
    public static final Object f = new Object();
    public final ArrayList d;
    public yh0 e;

    public zh0(Context context, List list) {
        super(context);
        this.d = new ArrayList();
        setProtections(list);
    }

    private du0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof du0) {
            return (du0) tag;
        }
        du0 du0Var = new du0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, du0Var);
        return du0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[LOOP:0: B:6:0x0023->B:26:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.e = new yh0(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.e.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            xc xcVar = (xc) this.e.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            xh0 xh0Var = xcVar.b;
            int i6 = xcVar.a;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = xh0Var.b;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = xh0Var.a;
                    i2 = 5;
                } else if (i6 != 8) {
                    wc.h("Unexpected side: ", i6);
                    return;
                } else {
                    i3 = xh0Var.b;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                iz izVar = xh0Var.c;
                layoutParams.leftMargin = izVar.a;
                layoutParams.topMargin = izVar.b;
                layoutParams.rightMargin = izVar.c;
                layoutParams.bottomMargin = izVar.d;
                View view = new View(context);
                view.setTag(f);
                view.setTranslationX(xh0Var.f);
                view.setTranslationY(xh0Var.g);
                view.setAlpha(xh0Var.h);
                view.setVisibility(xh0Var.d ? 0 : 4);
                view.setBackground(xh0Var.e);
                f1 f1Var = new f1(15, layoutParams, view);
                if (xh0Var.i == null) {
                    wc.q("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    xh0Var.i = f1Var;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = xh0Var.a;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            iz izVar2 = xh0Var.c;
            layoutParams2.leftMargin = izVar2.a;
            layoutParams2.topMargin = izVar2.b;
            layoutParams2.rightMargin = izVar2.c;
            layoutParams2.bottomMargin = izVar2.d;
            View view2 = new View(context);
            view2.setTag(f);
            view2.setTranslationX(xh0Var.f);
            view2.setTranslationY(xh0Var.g);
            view2.setAlpha(xh0Var.h);
            view2.setVisibility(xh0Var.d ? 0 : 4);
            view2.setBackground(xh0Var.e);
            f1 f1Var2 = new f1(15, layoutParams2, view2);
            if (xh0Var.i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f) {
            yh0 yh0Var = this.e;
            int childCount = getChildCount() - (yh0Var != null ? yh0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        yh0 yh0Var;
        if (this.e != null) {
            removeViews(getChildCount() - this.e.a.size(), this.e.a.size());
            int size = this.e.a.size();
            int i = 0;
            while (true) {
                yh0Var = this.e;
                if (i >= size) {
                    break;
                }
                ((xc) yh0Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = yh0Var.a;
            if (!yh0Var.f) {
                yh0Var.f = true;
                yh0Var.b.b.remove(yh0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((xc) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof du0) {
            du0 du0Var = (du0) tag;
            if (du0Var.b.isEmpty()) {
                du0Var.a.post(new m0(8, du0Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<xc> list) {
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
