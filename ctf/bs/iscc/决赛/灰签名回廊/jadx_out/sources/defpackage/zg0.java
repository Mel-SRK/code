package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.example.gnd.R;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends k {
    public i6 aa;
    public final me0 ab;
    public boolean ac;
    public final int[] ad;
    public pu l;
    public ch0 m;
    public String n;
    public final View o;
    public final yf0 p;
    public final WindowManager q;
    public final WindowManager.LayoutParams r;
    public bh0 s;
    public e20 t;
    public final me0 u;
    public final me0 v;
    public tz w;
    public final km x;
    public final Rect y;
    public final rr0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(pu puVar, ch0 ch0Var, String str, View view, em emVar, bh0 bh0Var, UUID uuid) {
        super(view.getContext());
        yf0 ah0Var = Build.VERSION.SDK_INT >= 29 ? new ah0(3) : new yf0(3);
        this.l = puVar;
        this.m = ch0Var;
        this.n = str;
        this.o = view;
        this.p = ah0Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ch0 ch0Var2 = this.m;
        boolean zB = g4.b(view);
        boolean z = ch0Var2.b;
        int i = ch0Var2.a;
        if (z && zB) {
            i |= 8192;
        } else if (z && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.r = layoutParams;
        this.s = bh0Var;
        this.t = e20.d;
        this.u = bo0.m(null);
        this.v = bo0.m(null);
        this.x = bo0.f(new b(17, this));
        this.y = new Rect();
        this.z = new rr0(new a4(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, jo0.e(view));
        setTag(R.id.view_tree_view_model_store_owner, qo0.f(view));
        setTag(R.id.view_tree_saved_state_registry_owner, lI.h(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(emVar.x((float) 8));
        setOutlineProvider(new xg0(0));
        this.ab = bo0.m(ue.a);
        this.ad = new int[2];
    }

    private final gv getContent() {
        return (gv) this.ab.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d20 getParentLayoutCoordinates() {
        return (d20) this.v.getValue();
    }

    private final tz getVisibleDisplayBounds() {
        this.p.getClass();
        View view = this.o;
        Rect rect = this.y;
        view.getWindowVisibleDisplayFrame(rect);
        return new tz(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(gv gvVar) {
        this.ab.setValue(gvVar);
    }

    private final void setParentLayoutCoordinates(d20 d20Var) {
        this.v.setValue(d20Var);
    }

    @Override // defpackage.k
    public final void a(int i, vf vfVar) {
        vfVar.aw(-857613600);
        int i2 = (vfVar.h(this) ? 4 : 2) | i;
        if (vfVar.an(i2 & 1, (i2 & 3) != 2)) {
            getContent().f(vfVar, 0);
        } else {
            vfVar.aq();
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j(i, 10, this);
        }
    }

    @Override // defpackage.k
    public final void d(boolean z, int i, int i2, int i3, int i4) {
        super.d(z, i, i2, i3, i4);
        this.m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.p.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.m.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                pu puVar = this.l;
                if (puVar != null) {
                    puVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.k
    public final void e(int i, int i2) {
        this.m.getClass();
        tz visibleDisplayBounds = getVisibleDisplayBounds();
        super.e(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d - visibleDisplayBounds.b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.r;
    }

    public final e20 getParentLayoutDirection() {
        return this.t;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final wz m6getPopupContentSizebOM6tXw() {
        return (wz) this.u.getValue();
    }

    public final bh0 getPositionProvider() {
        return this.s;
    }

    @Override // defpackage.k
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.ac;
    }

    public final String getTestTag() {
        return this.n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(sf sfVar, te teVar) {
        setParentCompositionContext(sfVar);
        setContent(teVar);
        this.ac = true;
    }

    public final void i(pu puVar, ch0 ch0Var, String str, e20 e20Var) {
        int i;
        this.l = puVar;
        this.n = str;
        if (!f00.h(this.m, ch0Var)) {
            ch0Var.getClass();
            this.m = ch0Var;
            boolean zB = g4.b(this.o);
            boolean z = ch0Var.b;
            int i2 = ch0Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            layoutParams.flags = i2;
            this.p.getClass();
            this.q.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = e20Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                wc.l();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void j() {
        d20 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.af()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jAl = parentLayoutCoordinates.al();
            long jI = parentLayoutCoordinates.i(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jI >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jI & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            tz tzVar = new tz(i, i2, ((int) (jAl >> 32)) + i, ((int) (jAl & 4294967295L)) + i2);
            if (tzVar.equals(this.w)) {
                return;
            }
            this.w = tzVar;
            l();
        }
    }

    public final void k(d20 d20Var) {
        setParentLayoutCoordinates(d20Var);
        j();
    }

    public final void l() {
        wz wzVarM6getPopupContentSizebOM6tXw;
        tz tzVar = this.w;
        if (tzVar == null || (wzVarM6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = wzVarM6getPopupContentSizebOM6tXw.a;
        tz visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = (((long) (visibleDisplayBounds.d - visibleDisplayBounds.b)) & 4294967295L) | (((long) (visibleDisplayBounds.c - visibleDisplayBounds.a)) << 32);
        wi0 wi0Var = new wi0();
        wi0Var.d = 0L;
        this.z.c(this, f50.t, new yg0(wi0Var, this, tzVar, j2, j));
        long j3 = wi0Var.d;
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.m.e;
        yf0 yf0Var = this.p;
        if (z) {
            yf0Var.i(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        yf0Var.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z.d();
        if (!this.m.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.aa == null) {
            this.aa = new i6(0, this.l);
        }
        ay.d(this, this.aa);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rr0 rr0Var = this.z;
        gb0 gb0Var = rr0Var.h;
        if (gb0Var != null) {
            gb0Var.b();
        }
        rr0Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            ay.e(this, this.aa);
        }
        this.aa = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            pu puVar = this.l;
            if (puVar != null) {
                puVar.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            pu puVar2 = this.l;
            if (puVar2 != null) {
                puVar2.a();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(e20 e20Var) {
        this.t = e20Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(wz wzVar) {
        this.u.setValue(wzVar);
    }

    public final void setPositionProvider(bh0 bh0Var) {
        this.s = bh0Var;
    }

    public final void setTestTag(String str) {
        this.n = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public k getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
