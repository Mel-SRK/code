package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.example.gnd.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends ViewGroup {
    public WeakReference d;
    public IBinder e;
    public a41 f;
    public cg g;
    public p7 h;
    public boolean i;
    public boolean j;
    public boolean k;

    public k(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        e1 e1Var = new e1(2, this);
        addOnAttachStateChangeListener(e1Var);
        g11 g11Var = new g11();
        t1.aa(this).a.add(g11Var);
        this.h = new p7(this, e1Var, g11Var, 3);
    }

    private final void setParentContext(cg cgVar) {
        if (this.g != cgVar) {
            this.g = cgVar;
            if (cgVar != null) {
                this.d = null;
            }
            a41 a41Var = this.f;
            if (a41Var != null) {
                a41Var.e();
                this.f = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.e != iBinder) {
            this.e = iBinder;
            this.d = null;
        }
    }

    public abstract void a(int i, vf vfVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f == null) {
            try {
                this.j = true;
                this.f = b41.a(this, f(), new te(-656146368, true, new j(0, this)));
            } finally {
                this.j = false;
            }
        }
    }

    public void d(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void e(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final cg f() {
        mi0 mi0Var;
        pj pjVar;
        b5 b5Var;
        cg cgVarB = this.g;
        if (cgVarB == null) {
            cgVarB = t31.b(this);
            if (cgVarB == null) {
                Object parent = getParent();
                while (cgVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    cgVarB = t31.b(view);
                    parent = view.getParent();
                }
            }
            boolean z = false;
            if (cgVarB != null) {
                cg cgVar = (!(cgVarB instanceof mi0) || ((ii0) ((mi0) cgVarB).t.getValue()).compareTo(ii0.e) > 0) ? cgVarB : null;
                if (cgVar != null) {
                    this.d = new WeakReference(cgVar);
                }
            } else {
                cgVarB = null;
            }
            if (cgVarB == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (cgVarB = (cg) weakReference.get()) == null || ((cgVarB instanceof mi0) && ((ii0) ((mi0) cgVarB).t.getValue()).compareTo(ii0.e) <= 0)) {
                    cgVarB = null;
                }
                if (cgVarB == null) {
                    if (!isAttachedToWindow()) {
                        sy.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    cg cgVarB2 = t31.b(view2);
                    if (cgVarB2 == null) {
                        ((m31) o31.a.get()).getClass();
                        pj pjVar2 = pq.d;
                        au0 au0Var = z4.p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            pjVar = (pj) z4.p.getValue();
                        } else {
                            pjVar = (pj) z4.q.get();
                            if (pjVar == null) {
                                wc.q("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        pj pjVarJ = pjVar.j(pjVar2);
                        o70 o70Var = (o70) pjVarJ.k(bw.af);
                        if (o70Var != null) {
                            b5Var = new b5(o70Var);
                            y10 y10Var = (y10) b5Var.f;
                            synchronized (y10Var.a) {
                                y10Var.d = false;
                            }
                        } else {
                            b5Var = null;
                        }
                        xi0 xi0Var = new xi0();
                        pj q70Var = (p70) pjVarJ.k(bw.ag);
                        if (q70Var == null) {
                            q70Var = new q70();
                            xi0Var.d = q70Var;
                        }
                        if (b5Var != null) {
                            pjVar2 = b5Var;
                        }
                        pj pjVarJ2 = pjVarJ.j(pjVar2).j(q70Var);
                        mi0Var = new mi0(pjVarJ2);
                        synchronized (mi0Var.b) {
                            mi0Var.s = true;
                        }
                        ii iiVarC = i60.c(pjVarJ2);
                        u30 u30VarE = jo0.e(view2);
                        p30 lifecycle = u30VarE != null ? u30VarE.getLifecycle() : null;
                        if (lifecycle == null) {
                            sy.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new xd();
                        }
                        view2.addOnAttachStateChangeListener(new p31(view2, mi0Var));
                        lifecycle.a(new r31(iiVarC, b5Var, mi0Var, xi0Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, mi0Var);
                        Handler handler = view2.getHandler();
                        int i = dx.a;
                        pj pjVar3 = new cx(handler, "windowRecomposer cleanup", false).i;
                        c cVar = new c(mi0Var, view2, z ? 1 : 0, 22);
                        ck ckVar = ck.g;
                        if ((2 & 1) != 0) {
                            pjVar3 = pq.d;
                        }
                        if ((2 & 2) != 0) {
                            ckVar = ck.d;
                        }
                        pj pjVarZ = e00.z(pq.d, pjVar3, true);
                        kl klVar = wm.a;
                        if (pjVarZ != klVar && pjVarZ.k(bw.u) == null) {
                            pjVarZ = pjVarZ.j(klVar);
                        }
                        l y20Var = ckVar == ck.e ? new y20(pjVarZ, cVar) : new hs0(pjVarZ, true);
                        y20Var.bg(ckVar, y20Var, cVar);
                        view2.addOnAttachStateChangeListener(new e1(3, y20Var));
                    } else {
                        if (!(cgVarB2 instanceof mi0)) {
                            wc.q("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        mi0Var = (mi0) cgVarB2;
                    }
                    mi0 mi0Var2 = ((ii0) mi0Var.t.getValue()).compareTo(ii0.e) > 0 ? mi0Var : null;
                    if (mi0Var2 != null) {
                        this.d = new WeakReference(mi0Var2);
                    }
                    return mi0Var;
                }
            }
        }
        return cgVarB;
    }

    public final boolean getHasComposition() {
        return this.f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        e(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(cg cgVar) {
        setParentContext(cgVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.i = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((b1) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.k = true;
    }

    public final void setViewCompositionStrategy(h11 h11Var) {
        p7 p7Var = this.h;
        if (p7Var != null) {
            p7Var.a();
        }
        ((bo0) h11Var).getClass();
        e1 e1Var = new e1(2, this);
        addOnAttachStateChangeListener(e1Var);
        g11 g11Var = new g11();
        t1.aa(this).a.add(g11Var);
        this.h = new p7(this, e1Var, g11Var, 3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
