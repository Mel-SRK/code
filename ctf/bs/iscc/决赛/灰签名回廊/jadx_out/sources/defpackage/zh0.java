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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lb8
        La:
            du0 r1 = r13.getOrInstallSystemBarStateMonitor()
            yh0 r2 = new yh0
            r2.<init>(r1, r0)
            r13.e = r2
            int r0 = r13.getChildCount()
            yh0 r1 = r13.e
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lb8
            yh0 r4 = r13.e
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            xc r4 = (defpackage.xc) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            xh0 r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L5e
            r8 = 2
            if (r4 == r8) goto L59
            if (r4 == r9) goto L52
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.b
            r8 = 80
            goto L62
        L4c:
            java.lang.String r0 = "Unexpected side: "
            defpackage.wc.h(r0, r4)
            return
        L52:
            int r4 = r7.a
            r8 = 5
        L55:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L62
        L59:
            int r4 = r7.b
            r8 = 48
            goto L62
        L5e:
            int r4 = r7.a
            r8 = 3
            goto L55
        L62:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            iz r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.zh0.f
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto L97
            r9 = r2
        L97:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            f1 r5 = new f1
            r8 = 15
            r5.<init>(r8, r11, r4)
            f1 r8 = r7.i
            if (r8 != 0) goto Lb3
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb3:
            java.lang.String r0 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            defpackage.wc.q(r0)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh0.a():void");
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
