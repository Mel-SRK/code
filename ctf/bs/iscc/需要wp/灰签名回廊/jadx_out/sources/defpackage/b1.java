package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.example.gnd.R;
import defpackage.i70;
import defpackage.q8;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends ViewGroup implements uk0, gl, xc0 {
    public static Method A;
    public static Method B;
    public static final m80 C = new m80();
    public static n0 D;
    public static Class Oo;
    public boolean I1;
    public final bu Il;
    public boolean O0;
    public final y0 O1;
    public final ArrayList aa;
    public ArrayList ab;
    public boolean ac;
    public final r70 ad;
    public final b3 ae;
    public cv af;
    public final a0 ag;
    public final c0 ah;
    public boolean ai;
    public final h0 aj;
    public final g0 ak;
    public final td0 al;
    public boolean am;
    public f5 an;
    public dh ao;
    public boolean ap;
    public final m60 aq;
    public long ar;
    public final int[] as;
    public final float[] at;
    public final float[] au;
    public final float[] av;
    public long aw;
    public boolean ax;
    public long ay;
    public final me0 az;
    public final km ba;
    public cv bb;
    public final j0 bc;
    public final k0 bd;
    public final l0 be;
    public final sw0 bf;
    public final qw0 bg;
    public final AtomicReference bh;
    public final sl bi;
    public final n31 bj;
    public final me0 bk;
    public int bl;
    public final me0 bm;
    public final cl bn;
    public final gz bo;
    public final k70 bp;
    public final v4 bq;
    public MotionEvent br;
    public long bs;
    public final f1 bt;
    public final m80 bu;
    public float bv;
    public float bw;
    public final z0 bx;
    public final m0 bz;
    public long d;
    public final boolean e;
    public final u20 f;
    public final me0 g;
    public final View h;
    public final boolean i;
    public final us j;
    public pj k;
    public final s2 l;
    public final z9 l1;
    public View lI;
    public final b30 m;
    public final sa n;
    public final d5 o;
    public final w0 oO;
    public final jz p;
    public final s20 q;
    public final e80 r;
    public final si0 s;
    public final b1 t;
    public final yo0 u;
    public final k1 v;
    public h2 w;
    public final oO x;
    public final b3 y;
    public final o7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v37, types: [j0] */
    /* JADX WARN: Type inference failed for: r1v38, types: [k0] */
    /* JADX WARN: Type inference failed for: r1v39, types: [l0] */
    public b1(Context context, pj pjVar) {
        a0 a0Var;
        c0 c0Var;
        super(context);
        final b1 b1Var = this;
        b1Var.d = 9205357640488583168L;
        int i = 1;
        b1Var.e = true;
        b1Var.f = new u20();
        gm gmVarB = f00.b(context);
        bw bwVar = bw.am;
        b1Var.g = new me0(gmVarB, bwVar);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        b1Var.i = z;
        tq tqVar = new tq();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(tqVar);
        n70 n70Var = new n70() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.n70
            public final i70 f() {
                return new q8();
            }

            @Override // defpackage.n70
            public final void g(i70 i70Var) {
                ((q8) i70Var).getClass();
            }

            public final int hashCode() {
                return this.a.hashCode();
            }
        };
        b1Var.j = new us(b1Var, b1Var);
        b1Var.k = pjVar;
        b1Var.l = new s2();
        b1Var.m = new b30();
        j70 j70VarA = a.a(new v0(b1Var, i3));
        j70 j70VarA2 = androidx.compose.ui.input.rotary.a.a();
        b1Var.n = new sa();
        b1Var.o = new d5(ViewConfiguration.get(context));
        jz jzVar = new jz();
        b1Var.p = jzVar;
        s20 s20Var = new s20(3);
        p60 p60Var = s20Var.x;
        vk0 vk0Var = vk0.b;
        if (!f00.h(p60Var, vk0Var)) {
            s20Var.x = vk0Var;
            f1 f1Var = s20Var.y;
            if (f1Var != null) {
                ((me0) f1Var.f).setValue(vk0Var);
            }
            s20Var.aa();
        }
        s20Var.at(b1Var.getDensity());
        s20Var.ax(b1Var.getViewConfiguration());
        s20Var.aw(b.b(jzVar).c(emptySemanticsElement).c(j70VarA2).c(j70VarA).c(((us) b1Var.getFocusOwner()).e).c(b1Var.getDragAndDropManager().c).c(n70Var));
        b1Var.q = s20Var;
        e80 e80Var = oz.a;
        b1Var.r = new e80();
        b1Var.m4getLayoutNodes();
        b1Var.s = new si0();
        b1Var.t = b1Var;
        b1Var.u = new yo0(b1Var.getRoot(), tqVar, b1Var.m4getLayoutNodes());
        k1 k1Var = new k1(b1Var);
        b1Var.v = k1Var;
        b1Var.w = new h2(b1Var, new r0(0, b1Var, t1.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 0));
        oO oOVar = new oO();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        b1Var.x = oOVar;
        b3 b3Var = new b3();
        b3Var.b = b1Var;
        b3Var.c = new Object();
        a3 a3Var = new a3();
        b3Var.e = a3Var;
        if (b1Var.isAttachedToWindow()) {
            Context context2 = b1Var.getContext();
            if (!b3Var.a) {
                context2.getApplicationContext().registerComponentCallbacks(a3Var);
                b3Var.a = true;
            }
        }
        b1Var.addOnAttachStateChangeListener(new e1(i, b3Var));
        b1Var.y = b3Var;
        b1Var.z = new o7();
        b1Var.aa = new ArrayList();
        b1Var.ad = new r70();
        s20 root = b1Var.getRoot();
        b3 b3Var2 = new b3();
        b3Var2.b = root;
        b3Var2.c = new mx((yy) root.ag.g);
        b3Var2.d = new bu(14);
        b3Var2.e = new px();
        b1Var.ae = b3Var2;
        b1Var.af = q0.f;
        if (g()) {
            o7 autofillTree = b1Var.getAutofillTree();
            a0Var = new a0();
            a0Var.a = b1Var;
            a0Var.b = autofillTree;
            AutofillManager autofillManagerG = ar.g(b1Var.getContext().getSystemService(ar.k()));
            if (autofillManagerG == null) {
                wc.q("Autofill service could not be located.");
                throw null;
            }
            a0Var.c = autofillManagerG;
            b1Var.setImportantForAutofill(1);
            m7 m7VarD = wn0.d(b1Var);
            AutofillId autofillIdE = m7VarD != null ? ar.e(m7VarD.a) : null;
            if (autofillIdE == null) {
                throw n5.f("Required value was null.");
            }
            a0Var.d = autofillIdE;
        } else {
            a0Var = null;
        }
        b1Var.ag = a0Var;
        if (g()) {
            AutofillManager autofillManagerG2 = ar.g(context.getSystemService(ar.k()));
            if (autofillManagerG2 == null) {
                throw n5.f("Autofill service could not be located.");
            }
            b1Var = this;
            c0Var = new c0(new bu(12, autofillManagerG2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            c0Var = null;
        }
        b1Var.ah = c0Var;
        b1Var.aj = new h0(context);
        b1Var.getClipboardManager();
        b1Var.ak = new g0();
        b1Var.al = new td0(new v0(b1Var, i));
        b1Var.aq = new m60(b1Var.getRoot());
        long j = Integer.MAX_VALUE;
        b1Var.ar = (j & 4294967295L) | (j << 32);
        b1Var.as = new int[]{0, 0};
        float[] fArrA = j60.a();
        b1Var.at = fArrA;
        b1Var.au = j60.a();
        b1Var.av = j60.a();
        b1Var.aw = -1L;
        b1Var.ay = 9187343241974906880L;
        b1Var.az = bo0.m(null);
        b1Var.ba = bo0.f(new y0(b1Var, i));
        b1Var.bc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: j0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.ah();
            }
        };
        b1Var.bd = new ViewTreeObserver.OnScrollChangedListener() { // from class: k0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.ah();
            }
        };
        b1Var.be = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: l0
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                this.a.bo.a.setValue(new ez(z2 ? 1 : 2));
            }
        };
        sw0 sw0Var = new sw0(b1Var.getView(), b1Var);
        b1Var.bf = sw0Var;
        b1Var.bg = new qw0(sw0Var);
        b1Var.bh = new AtomicReference(null);
        b1Var.bi = new sl(b1Var.getTextInputService());
        b1Var.bj = new n31(3);
        b1Var.bk = new me0(pk.s(context), bwVar);
        b1Var.bl = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        e20 e20Var = e20.d;
        e20 e20Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : e20.e : e20Var;
        b1Var.bm = bo0.m(e20Var2 != null ? e20Var2 : e20Var);
        b1Var.bn = new cl(b1Var, 1);
        b1Var.bo = new gz(b1Var.isInTouchMode() ? 1 : 2);
        k70 k70Var = new k70();
        new a90(new r7[16]);
        new a90(new t1[16]);
        new a90(new s20[16]);
        new a90(new t1[16]);
        b1Var.bp = k70Var;
        b1Var.bq = new v4(b1Var);
        b1Var.bt = new f1(21);
        b1Var.bu = new m80();
        b1Var.bx = new z0(b1Var);
        int i4 = 0;
        b1Var.bz = new m0(i4, b1Var);
        b1Var.O1 = new y0(b1Var, i4);
        b1Var.l1 = i2 < 29 ? new f1(fArrA) : new ca();
        b1Var.addOnAttachStateChangeListener(b1Var.w);
        b1Var.setWillNotDraw(false);
        b1Var.setFocusable(true);
        if (i2 >= 26) {
            s1.a.a(b1Var, 1, false);
        }
        b1Var.setFocusableInTouchMode(true);
        b1Var.setClipChildren(false);
        int i5 = f11.a;
        if (b1Var.getImportantForAccessibility() == 0) {
            b1Var.setImportantForAccessibility(1);
        }
        b1Var.setAccessibilityDelegate(k1Var.b);
        b1Var.setOnDragListener(b1Var.getDragAndDropManager());
        b1Var.getRoot().b(b1Var);
        if (i2 >= 29) {
            n1.a.a(b1Var);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            b1Var.h = view;
            b1Var.addView(view, -1);
        }
        b1Var.Il = i2 >= 31 ? new bu(19) : null;
        b1Var.oO = new w0(b1Var);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 get_viewTreeOwners() {
        return (p0) this.az.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof b1) {
                ((b1) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View j(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (f00.h(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewJ = j(viewGroup.getChildAt(i2), i);
                    if (viewJ != null) {
                        return viewJ;
                    }
                }
            }
        }
        return null;
    }

    public static void m(s20 s20Var) {
        s20Var.z();
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            m((s20) objArr[i2]);
        }
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !s70.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(em emVar) {
        this.g.setValue(emVar);
    }

    private void setFontFamilyResolver(qt qtVar) {
        this.bk.setValue(qtVar);
    }

    private void setLayoutDirection(e20 e20Var) {
        this.bm.setValue(e20Var);
    }

    private final void set_viewTreeOwners(p0 p0Var) {
        this.az.setValue(p0Var);
    }

    public final void aa(MotionEvent motionEvent) {
        this.aw = AnimationUtils.currentAnimationTimeMillis();
        z9 z9Var = this.l1;
        float[] fArr = this.au;
        z9Var.d(this, fArr);
        m10.af(fArr, this.av);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = j60.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.ay = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean ab() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void ac(s20 s20Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (s20Var != null) {
            while (s20Var != null && s20Var.n() == q20.d) {
                if (!this.ap) {
                    s20 s20VarQ = s20Var.q();
                    if (s20VarQ == null) {
                        break;
                    }
                    long j = ((yy) s20VarQ.ag.g).g;
                    if (dh.f(j) && dh.e(j)) {
                        break;
                    }
                }
                s20Var = s20Var.q();
            }
            if (s20Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long ad(long j) {
        z();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.ay >> 32));
        return j60.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.ay & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.av);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public final int ae(MotionEvent motionEvent) {
        Object obj;
        if (this.I1) {
            this.I1 = false;
            int metaState = motionEvent.getMetaState();
            this.m.getClass();
            c21.a.setValue(new ug0(metaState));
        }
        r70 r70Var = this.ad;
        f1 f1VarA = r70Var.a(motionEvent, this);
        b3 b3Var = this.ae;
        if (f1VarA == null) {
            if (!b3Var.a) {
                e50 e50Var = (e50) ((bu) b3Var.d).e;
                int i = e50Var.g;
                Object[] objArr = e50Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                e50Var.g = 0;
                e50Var.d = false;
                ((mx) b3Var.c).c();
            }
            return 0;
        }
        List list = (List) f1VarA.e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((rg0) obj).e) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
            obj = null;
        } else {
            obj = null;
        }
        rg0 rg0Var = (rg0) obj;
        if (rg0Var != null) {
            this.d = rg0Var.d;
        }
        int iF = b3Var.f(f1VarA, this, p(motionEvent));
        f1VarA.f = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        r70Var.c.delete(pointerId);
        r70Var.b.delete(pointerId);
        return iF;
    }

    public final void af(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jS = s((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jS >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jS & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        f1 f1VarA = this.ad.a(motionEventObtain, this);
        f1VarA.getClass();
        this.ae.f(f1VarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag(defpackage.gv r5, defpackage.ki r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.a1
            if (r0 == 0) goto L13
            r0 = r6
            a1 r0 = (defpackage.a1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a1 r0 = new a1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r5)
            return
        L27:
            defpackage.i60.az(r6)
            goto L47
        L2b:
            defpackage.i60.az(r6)
            v0 r6 = new v0
            r1 = 2
            r6.<init>(r4, r1)
            r0.i = r2
            j3 r1 = new j3
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r4.bh
            r1.<init>(r6, r3, r5, r2)
            java.lang.Object r5 = defpackage.i60.y(r1, r0)
            yj r6 = defpackage.yj.d
            if (r5 != r6) goto L47
            return
        L47:
            xd r5 = new xd
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.ag(gv, ki):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ah() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.as
            r0.getLocationOnScreen(r1)
            long r2 = r0.ar
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.aw
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.ar = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L44
            if (r2 == r1) goto L44
            s20 r1 = r0.getRoot()
            v20 r1 = r1.ah
            o60 r1 = r1.o
            r1.bk()
            r1 = r9
            goto L45
        L44:
            r1 = r3
        L45:
            r0.z()
            android.view.View r2 = r0.lI
            if (r2 != 0) goto L52
            android.view.View r2 = r0.getRootView()
            r0.lI = r2
        L52:
            si0 r5 = r0.getRectManager()
            long r10 = r0.ar
            long r12 = r0.ay
            long r12 = defpackage.t1.au(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.au
            int r15 = defpackage.f00.d(r14)
            zx0 r3 = r5.b
            r15 = r15 & 2
            if (r15 != 0) goto L78
        L75:
            r16 = r6
            goto L7a
        L78:
            r14 = 0
            goto L75
        L7a:
            long r6 = r3.c
            boolean r6 = defpackage.pz.a(r12, r6)
            if (r6 != 0) goto L86
            r3.c = r12
            r6 = r9
            goto L87
        L86:
            r6 = 0
        L87:
            long r12 = r3.d
            boolean r7 = defpackage.pz.a(r10, r12)
            if (r7 != 0) goto L92
            r3.d = r10
            r6 = r9
        L92:
            if (r14 == 0) goto L95
            r6 = r9
        L95:
            long r7 = (long) r8
            long r7 = r7 << r4
            long r10 = (long) r2
            long r10 = r10 & r16
            long r7 = r7 | r10
            long r10 = r3.e
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto La4
            r3.e = r7
            r6 = r9
        La4:
            if (r6 != 0) goto Lad
            boolean r2 = r5.e
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r3 = 0
            goto Lae
        Lad:
            r3 = r9
        Lae:
            r5.e = r3
            m60 r2 = r0.aq
            r2.a(r1)
            si0 r1 = r0.getRectManager()
            r1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.ah():void");
    }

    public final void ai(float f) {
        if (this.i) {
            if (f > 0.0f) {
                if (Float.isNaN(this.bv) || f > this.bv) {
                    this.bv = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.bw) || f < this.bw) {
                    this.bw = f;
                }
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        po0 po0VarS;
        cv cvVar;
        if (g()) {
            c0 c0Var = this.ah;
            if (c0Var != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueH = ar.h(sparseArray.get(iKeyAt));
                    if (autofillValueH.isText()) {
                        s20 s20Var = (s20) c0Var.b.c.b(iKeyAt);
                        if (s20Var != null && (po0VarS = s20Var.s()) != null) {
                            Object objG = po0VarS.d.g(oo0.f);
                            if (objG == null) {
                                objG = null;
                            }
                            ah ahVar = (ah) objG;
                            if (ahVar != null && (cvVar = (cv) ahVar.b) != null) {
                            }
                        }
                    } else if (autofillValueH.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueH.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueH.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            a0 a0Var = this.ag;
            if (a0Var != null) {
                o7 o7Var = (o7) a0Var.b;
                if (o7Var.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueH2 = ar.h(sparseArray.get(iKeyAt2));
                    if (autofillValueH2.isText()) {
                        autofillValueH2.getTextValue().toString();
                        if (o7Var.a.get(Integer.valueOf(iKeyAt2)) != null) {
                            wc.c();
                            return;
                        }
                    } else {
                        if (autofillValueH2.isDate()) {
                            throw new dk("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueH2.isList()) {
                            throw new dk("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueH2.isToggle()) {
                            throw new dk("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.gl
    public final void c(u30 u30Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(d41.x());
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.v.e(false, i, this.d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.v.e(true, i, this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        t(true);
        fr0.k().m();
        this.ac = true;
        sa saVar = this.n;
        e0 e0Var = saVar.a;
        Canvas canvas2 = e0Var.a;
        e0Var.a = canvas;
        getRoot().g(e0Var, null);
        saVar.a.a = canvas2;
        ArrayList arrayList = this.aa;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lw) ((rd0) arrayList.get(i))).g();
            }
        }
        int i2 = l11.d;
        arrayList.clear();
        this.ac = false;
        ArrayList arrayList2 = this.ab;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.i) {
            n6.a(this, this.bv);
            View view = this.h;
            if (view == null) {
                f00.ag("frameRateCategoryView");
                throw null;
            }
            n6.a(view, this.bw);
            if (!Float.isNaN(this.bw)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.bv = Float.NaN;
            this.bw = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        da0 da0Var;
        wk0 wk0Var;
        int size;
        da0 da0Var2;
        i70 i70VarM;
        da0 da0Var3;
        if (this.O0) {
            m0 m0Var = this.bz;
            removeCallbacks(m0Var);
            if (motionEvent.getActionMasked() == 8) {
                this.O0 = false;
            } else {
                m0Var.run();
            }
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Float.floatToRawIntBits(x);
                Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                us usVar = (us) getFocusOwner();
                if (usVar.d.e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    gt gtVarO = t1.o(usVar.c);
                    if (gtVarO != null) {
                        if (!gtVarO.d.q) {
                            sy.b("visitAncestors called on an unattached node");
                        }
                        i70 i70Var = gtVarO.d;
                        s20 s20VarAy = pk.ay(gtVarO);
                        while (s20VarAy != null) {
                            if ((((i70) s20VarAy.ag.j).g & 2097152) != 0) {
                                while (i70Var != null) {
                                    if ((i70Var.f & 2097152) != 0) {
                                        i70 i70VarM2 = i70Var;
                                        a90 a90Var = null;
                                        while (i70VarM2 != null) {
                                            if ((i70VarM2.f & 2097152) != 0 && (i70VarM2 instanceof rl)) {
                                                int i = 0;
                                                for (i70 i70Var2 = ((rl) i70VarM2).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                                    if ((i70Var2.f & 2097152) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            i70VarM2 = i70Var2;
                                                        } else {
                                                            if (a90Var == null) {
                                                                a90Var = new a90(new i70[16]);
                                                            }
                                                            if (i70VarM2 != null) {
                                                                a90Var.b(i70VarM2);
                                                                i70VarM2 = null;
                                                            }
                                                            a90Var.b(i70Var2);
                                                        }
                                                    }
                                                }
                                                if (i == 1) {
                                                }
                                            }
                                            i70VarM2 = pk.m(a90Var);
                                        }
                                    }
                                    i70Var = i70Var.h;
                                }
                            }
                            s20VarAy = s20VarAy.q();
                            i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = j11.a;
            fd.d(viewConfiguration);
        } else {
            j11.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i2 >= 26) {
            fd.c(viewConfiguration);
        } else {
            j11.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        us usVar2 = (us) getFocusOwner();
        if (usVar2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        gt gtVarO2 = t1.o(usVar2.c);
        if (gtVarO2 != null) {
            if (!gtVarO2.d.q) {
                sy.b("visitAncestors called on an unattached node");
            }
            i70 i70Var3 = gtVarO2.d;
            s20 s20VarAy2 = pk.ay(gtVarO2);
            loop0: while (true) {
                if (s20VarAy2 == null) {
                    i70VarM = null;
                    break;
                }
                if ((((i70) s20VarAy2.ag.j).g & 16384) != 0) {
                    while (i70Var3 != null) {
                        if ((i70Var3.f & 16384) != 0) {
                            i70VarM = i70Var3;
                            a90 a90Var2 = null;
                            while (i70VarM != null) {
                                if (i70VarM instanceof wk0) {
                                    break loop0;
                                }
                                if ((i70VarM.f & 16384) != 0 && (i70VarM instanceof rl)) {
                                    int i3 = 0;
                                    for (i70 i70Var4 = ((rl) i70VarM).s; i70Var4 != null; i70Var4 = i70Var4.i) {
                                        if ((i70Var4.f & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                i70VarM = i70Var4;
                                            } else {
                                                if (a90Var2 == null) {
                                                    a90Var2 = new a90(new i70[16]);
                                                }
                                                if (i70VarM != null) {
                                                    a90Var2.b(i70VarM);
                                                    i70VarM = null;
                                                }
                                                a90Var2.b(i70Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                i70VarM = pk.m(a90Var2);
                            }
                        }
                        i70Var3 = i70Var3.h;
                    }
                }
                s20VarAy2 = s20VarAy2.q();
                i70Var3 = (s20VarAy2 == null || (da0Var3 = s20VarAy2.ag) == null) ? null : (hu0) da0Var3.i;
            }
            wk0Var = (wk0) i70VarM;
        } else {
            wk0Var = null;
        }
        if (wk0Var != null) {
            if (!wk0Var.d.q) {
                sy.b("visitAncestors called on an unattached node");
            }
            i70 i70Var5 = wk0Var.d.h;
            s20 s20VarAy3 = pk.ay(wk0Var);
            ArrayList arrayList = null;
            while (s20VarAy3 != null) {
                if ((((i70) s20VarAy3.ag.j).g & 16384) != 0) {
                    while (i70Var5 != null) {
                        if ((i70Var5.f & 16384) != 0) {
                            i70 i70VarM3 = i70Var5;
                            a90 a90Var3 = null;
                            while (i70VarM3 != null) {
                                if (i70VarM3 instanceof wk0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(i70VarM3);
                                } else if ((i70VarM3.f & 16384) != 0 && (i70VarM3 instanceof rl)) {
                                    int i4 = 0;
                                    for (i70 i70Var6 = ((rl) i70VarM3).s; i70Var6 != null; i70Var6 = i70Var6.i) {
                                        if ((i70Var6.f & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                i70VarM3 = i70Var6;
                                            } else {
                                                if (a90Var3 == null) {
                                                    a90Var3 = new a90(new i70[16]);
                                                }
                                                if (i70VarM3 != null) {
                                                    a90Var3.b(i70VarM3);
                                                    i70VarM3 = null;
                                                }
                                                a90Var3.b(i70Var6);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                i70VarM3 = pk.m(a90Var3);
                            }
                        }
                        i70Var5 = i70Var5.h;
                    }
                }
                s20VarAy3 = s20VarAy3.q();
                i70Var5 = (s20VarAy3 == null || (da0Var2 = s20VarAy3.ag) == null) ? null : (hu0) da0Var2.i;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((wk0) arrayList.get(size)).getClass();
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            i70 i70VarM4 = wk0Var.d;
            a90 a90Var4 = null;
            while (i70VarM4 != null) {
                if (i70VarM4 instanceof wk0) {
                } else if ((i70VarM4.f & 16384) != 0 && (i70VarM4 instanceof rl)) {
                    int i6 = 0;
                    for (i70 i70Var7 = ((rl) i70VarM4).s; i70Var7 != null; i70Var7 = i70Var7.i) {
                        if ((i70Var7.f & 16384) != 0) {
                            i6++;
                            if (i6 == 1) {
                                i70VarM4 = i70Var7;
                            } else {
                                if (a90Var4 == null) {
                                    a90Var4 = new a90(new i70[16]);
                                }
                                if (i70VarM4 != null) {
                                    a90Var4.b(i70VarM4);
                                    i70VarM4 = null;
                                }
                                a90Var4.b(i70Var7);
                            }
                        }
                    }
                    if (i6 == 1) {
                    }
                }
                i70VarM4 = pk.m(a90Var4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                i70 i70VarM5 = wk0Var.d;
                a90 a90Var5 = null;
                while (i70VarM5 != null) {
                    if (i70VarM5 instanceof wk0) {
                    } else if ((i70VarM5.f & 16384) != 0 && (i70VarM5 instanceof rl)) {
                        int i7 = 0;
                        for (i70 i70Var8 = ((rl) i70VarM5).s; i70Var8 != null; i70Var8 = i70Var8.i) {
                            if ((i70Var8.f & 16384) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    i70VarM5 = i70Var8;
                                } else {
                                    if (a90Var5 == null) {
                                        a90Var5 = new a90(new i70[16]);
                                    }
                                    if (i70VarM5 != null) {
                                        a90Var5.b(i70VarM5);
                                        i70VarM5 = null;
                                    }
                                    a90Var5.b(i70Var8);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    i70VarM5 = pk.m(a90Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        q0 q0Var = ((wk0) arrayList.get(i8)).r;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        r5.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(r24);
        r5 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (r5 != r14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r2.e = r14;
        defpackage.k1.w(r2, r14, 128, null, 12);
        defpackage.k1.w(r2, r5, 256, null, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((us) getFocusOwner()).d(keyEvent, new s0(0, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.m.getClass();
        c21.a.setValue(new ug0(metaState));
        return ((us) getFocusOwner()).d(keyEvent, ng.k) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        da0 da0Var;
        if (isFocused()) {
            us usVar = (us) getFocusOwner();
            if (usVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                gt gtVarO = t1.o(usVar.c);
                if (gtVarO != null) {
                    if (!gtVarO.d.q) {
                        sy.b("visitAncestors called on an unattached node");
                    }
                    i70 i70Var = gtVarO.d;
                    s20 s20VarAy = pk.ay(gtVarO);
                    while (s20VarAy != null) {
                        if ((((i70) s20VarAy.ag.j).g & 131072) != 0) {
                            while (i70Var != null) {
                                if ((i70Var.f & 131072) != 0) {
                                    i70 i70VarM = i70Var;
                                    a90 a90Var = null;
                                    while (i70VarM != null) {
                                        if ((i70VarM.f & 131072) != 0 && (i70VarM instanceof rl)) {
                                            int i = 0;
                                            for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                                if ((i70Var2.f & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        i70VarM = i70Var2;
                                                    } else {
                                                        if (a90Var == null) {
                                                            a90Var = new a90(new i70[16]);
                                                        }
                                                        if (i70VarM != null) {
                                                            a90Var.b(i70VarM);
                                                            i70VarM = null;
                                                        }
                                                        a90Var.b(i70Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        i70VarM = pk.m(a90Var);
                                    }
                                }
                                i70Var = i70Var.h;
                            }
                        }
                        s20VarAy = s20VarAy.q();
                        i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            m1.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.O0) {
            m0 m0Var = this.bz;
            removeCallbacks(m0Var);
            MotionEvent motionEvent2 = this.br;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.O0 = false;
            } else {
                m0Var.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int iL = l(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return j(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        ri0 ri0VarR;
        if (view == null || this.aq.c) {
            return super.focusSearch(view, i);
        }
        Object obj = os.f.get();
        obj.getClass();
        View viewB = ((os) obj).b(this, view, i);
        if (view == this) {
            gt gtVarO = t1.o(((us) getFocusOwner()).c);
            ri0VarR = gtVarO != null ? t1.r(gtVarO) : null;
            if (ri0VarR == null) {
                ri0VarR = az0.r(view, this);
            }
        } else {
            ri0VarR = az0.r(view, this);
        }
        ls lsVarAn = az0.an(i);
        int i2 = lsVarAn != null ? lsVarAn.a : 6;
        xi0 xi0Var = new xi0();
        if (((us) getFocusOwner()).e(i2, ri0VarR, new t0(xi0Var, 0)) != null) {
            Object obj2 = xi0Var.d;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (q6.k(t1.r((gt) obj2), az0.r(viewB, this), ri0VarR, i2)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    public final f5 getAndroidViewsHandler$ui_release() {
        if (this.an == null) {
            f5 f5Var = new f5(getContext());
            this.an = f5Var;
            addView(f5Var, -1);
            requestLayout();
        }
        f5 f5Var2 = this.an;
        f5Var2.getClass();
        return f5Var2;
    }

    public j7 getAutofill() {
        return this.ag;
    }

    public n7 getAutofillManager() {
        return this.ah;
    }

    public o7 getAutofillTree() {
        return this.z;
    }

    public final cv getConfigurationChangeObserver() {
        return this.af;
    }

    public final h2 getContentCaptureManager$ui_release() {
        return this.w;
    }

    public pj getCoroutineContext() {
        return this.k;
    }

    public em getDensity() {
        return (em) this.g.getValue();
    }

    public ri0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            gt gtVarO = t1.o(((us) getFocusOwner()).c);
            if (gtVarO != null) {
                return t1.r(gtVarO);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return az0.r(viewFindFocus, this);
        }
        return null;
    }

    public ss getFocusOwner() {
        return this.j;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        ri0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (f00.h(((us) getFocusOwner()).e(6, null, q0.g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public qt getFontFamilyResolver() {
        return (qt) this.bk.getValue();
    }

    public pt getFontLoader() {
        return this.bj;
    }

    public iw getGraphicsContext() {
        return this.y;
    }

    public ix getHapticFeedBack() {
        return this.bn;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.aq.b.t();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public fz getInputModeManager() {
        return this.bo;
    }

    public final jz getInsetsListener() {
        return this.p;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.aw;
    }

    @Override // android.view.View, android.view.ViewParent
    public e20 getLayoutDirection() {
        return (e20) this.bm.getValue();
    }

    public long getMeasureIteration() {
        m60 m60Var = this.aq;
        if (!m60Var.c) {
            sy.a("measureIteration should be only used during the measure/layout pass");
        }
        return m60Var.g;
    }

    public k70 getModifierLocalManager() {
        return this.bp;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public b1 m5getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public kf0 getPlacementScope() {
        int i = mf0.b;
        return new k50(1, this);
    }

    public ng0 getPointerIconService() {
        return this.oO;
    }

    public si0 getRectManager() {
        return this.s;
    }

    public s20 getRoot() {
        return this.q;
    }

    public uk0 getRootForTest() {
        return this.t;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        bu buVar;
        if (Build.VERSION.SDK_INT < 31 || (buVar = this.Il) == null) {
            return false;
        }
        return ((Boolean) ((me0) buVar.e).getValue()).booleanValue();
    }

    public yo0 getSemanticsOwner() {
        return this.u;
    }

    public u20 getSharedDrawScope() {
        return this.f;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? g6.a.a(this) : this.am;
    }

    public td0 getSnapshotObserver() {
        return this.al;
    }

    public sr0 getSoftwareKeyboardController() {
        return this.bi;
    }

    public qw0 getTextInputService() {
        return this.bg;
    }

    public ox0 getTextToolbar() {
        return this.bq;
    }

    public final tk0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public i11 getViewConfiguration() {
        return this.o;
    }

    public final p0 getViewTreeOwners() {
        return (p0) this.ba.getValue();
    }

    public b21 getWindowInfo() {
        return this.m;
    }

    public final c0 get_autofillManager$ui_release() {
        return this.ah;
    }

    public final void k(s20 s20Var, boolean z) {
        this.aq.d(s20Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.l(android.view.MotionEvent):int");
    }

    public final void n(s20 s20Var) {
        this.aq.m(s20Var, false);
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            n((s20) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p30 lifecycle;
        u30 u30Var;
        a0 a0Var;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(d41.x());
        }
        this.p.onViewAttachedToWindow(this);
        if (i > 28) {
            if (D == null) {
                n0 n0Var = new n0();
                D = n0Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (Oo == null) {
                        Oo = Class.forName("android.os.SystemProperties");
                    }
                    if (B == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = Oo;
                        B = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = B;
                    if (method != null) {
                        method.invoke(null, n0Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            m80 m80Var = C;
            synchronized (m80Var) {
                m80Var.a(this);
            }
        }
        this.m.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.m.getClass();
        this.m.getClass();
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().a.d();
        if (g() && (a0Var = this.ag) != null) {
            l7 l7Var = l7.a;
            l7Var.getClass();
            ((AutofillManager) a0Var.c).registerCallback(ar.f(l7Var));
        }
        u30 u30VarE = jo0.e(this);
        em0 em0VarH = lI.h(this);
        p0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (u30VarE != null && em0VarH != null && (u30VarE != (u30Var = viewTreeOwners.a) || em0VarH != u30Var))) {
            if (u30VarE == null) {
                wc.q("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (em0VarH == null) {
                wc.q("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            u30VarE.getLifecycle().a(this);
            p0 p0Var = new p0(u30VarE, em0VarH);
            set_viewTreeOwners(p0Var);
            cv cvVar = this.bb;
            if (cvVar != null) {
                cvVar.g(p0Var);
            }
            this.bb = null;
        }
        this.bo.a.setValue(new ez(isInTouchMode() ? 1 : 2));
        p0 viewTreeOwners2 = getViewTreeOwners();
        p30 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw n5.f("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.w);
        getViewTreeObserver().addOnGlobalLayoutListener(this.bc);
        getViewTreeObserver().addOnScrollChangedListener(this.bd);
        getViewTreeObserver().addOnTouchModeChangeListener(this.be);
        if (Build.VERSION.SDK_INT >= 31) {
            q1.a.b(this);
        }
        c0 c0Var = this.ah;
        if (c0Var != null) {
            ((us) getFocusOwner()).g.a(c0Var);
            getSemanticsOwner().d.a(c0Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        tp0 tp0Var = (tp0) this.bh.get();
        w3 w3Var = (w3) (tp0Var != null ? tp0Var.b : null);
        if (w3Var == null) {
            return this.bf.d;
        }
        tp0 tp0Var2 = (tp0) w3Var.g.get();
        dz dzVar = (dz) (tp0Var2 != null ? tp0Var2.b : null);
        return dzVar != null && (dzVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(f00.b(getContext()));
        this.m.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.bl) {
            this.bl = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(pk.s(getContext()));
        }
        this.af.g(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        tp0 tp0Var = (tp0) this.bh.get();
        w3 w3Var = (w3) (tp0Var != null ? tp0Var.b : null);
        if (w3Var != null) {
            tp0 tp0Var2 = (tp0) w3Var.g.get();
            dz dzVar = (dz) (tp0Var2 != null ? tp0Var2.b : null);
            if (dzVar == null) {
                return null;
            }
            synchronized (dzVar.c) {
                if (dzVar.e) {
                    return null;
                }
                oi0 oi0VarA = dzVar.a.a(editorInfo);
                l1 l1Var = new l1(16, dzVar);
                int i2 = Build.VERSION.SDK_INT;
                InputConnection ra0Var = i2 >= 34 ? new ra0(oi0VarA, l1Var) : i2 >= 25 ? new qa0(oi0VarA, l1Var) : new pa0(oi0VarA, l1Var);
                dzVar.d.b(new y11(ra0Var));
                return ra0Var;
            }
        }
        sw0 sw0Var = this.bf;
        if (!sw0Var.d) {
            return null;
        }
        ey eyVar = sw0Var.h;
        lw0 lw0Var = sw0Var.g;
        int i3 = eyVar.e;
        boolean z = eyVar.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                wc.q("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i4 = eyVar.d;
        if (i4 == 1) {
            editorInfo.inputType = 1;
        } else if (i4 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i4 == 3) {
            editorInfo.inputType = 2;
        } else if (i4 == 4) {
            editorInfo.inputType = 3;
        } else if (i4 == 5) {
            editorInfo.inputType = 17;
        } else if (i4 == 6) {
            editorInfo.inputType = 33;
        } else if (i4 == 7) {
            editorInfo.inputType = 129;
        } else if (i4 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i4 != 9) {
                wc.q("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 8194;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 1) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i3 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = eyVar.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (eyVar.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = lw0Var.b;
        int i8 = hx0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        m10.ar(editorInfo, lw0Var.a.e);
        editorInfo.imeOptions |= 33554432;
        if (yp.d()) {
            yp.a().g(editorInfo);
        }
        ni0 ni0Var = new ni0(sw0Var.g, new bu(26, sw0Var), sw0Var.h.c);
        sw0Var.i.add(new WeakReference(ni0Var));
        return ni0Var;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        uo0 uo0Var;
        h2 h2Var = this.w;
        h2Var.getClass();
        for (long j : jArr) {
            xo0 xo0Var = (xo0) h2Var.g().b((int) j);
            if (xo0Var != null && (uo0Var = xo0Var.a) != null) {
                i0.n();
                ViewTranslationRequest.Builder builderJ = i0.j(h2Var.d.getAutofillId(), uo0Var.g);
                Object objG = uo0Var.d.d.g(zo0.z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderJ.setValue("android:text", TranslationRequestValue.forText(new b6(p40.a(list, "\n", null, 62))));
                    consumer.accept(builderJ.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a0 a0Var;
        super.onDetachedFromWindow();
        this.p.onViewDetachedFromWindow(this);
        if (this.i) {
            View view = this.h;
            if (view == null) {
                f00.ag("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            m80 m80Var = C;
            synchronized (m80Var) {
                m80Var.i(this);
            }
        }
        rr0 rr0Var = getSnapshotObserver().a;
        gb0 gb0Var = rr0Var.h;
        if (gb0Var != null) {
            gb0Var.b();
        }
        rr0Var.a();
        this.m.getClass();
        p0 viewTreeOwners = getViewTreeOwners();
        p30 lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw n5.f("No lifecycle owner exists");
        }
        lifecycle.b(this.w);
        lifecycle.b(this);
        if (g() && (a0Var = this.ag) != null) {
            l7 l7Var = l7.a;
            l7Var.getClass();
            ((AutofillManager) a0Var.c).unregisterCallback(ar.f(l7Var));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.bc);
        getViewTreeObserver().removeOnScrollChangedListener(this.bd);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.be);
        if (i >= 31) {
            q1.a.a(this);
        }
        c0 c0Var = this.ah;
        if (c0Var != null) {
            getSemanticsOwner().d.i(c0Var);
            ((us) getFocusOwner()).g.i(c0Var);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        d41.q(((us) getFocusOwner()).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.aw = 0L;
        this.aq.h(this.O1);
        this.ao = null;
        ah();
        if (this.an != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m60 m60Var = this.aq;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long jI = i(i);
            long jI2 = i(i2);
            long jP = t1.p((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            dh dhVar = this.ao;
            if (dhVar == null) {
                this.ao = new dh(jP);
                this.ap = false;
            } else if (!dh.b(dhVar.a, jP)) {
                this.ap = true;
            }
            m60Var.n(jP);
            m60Var.i();
            setMeasuredDimension(getRoot().ah.o.d, getRoot().ah.o.e);
            if (this.an != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().ah.o.d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().ah.o.e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.e) {
            e20 e20Var = e20.d;
            e20 e20Var2 = i != 0 ? i != 1 ? null : e20.e : e20Var;
            if (e20Var2 != null) {
                e20Var = e20Var2;
            }
            setLayoutDirection(e20Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        bu buVar;
        if (Build.VERSION.SDK_INT >= 31 && (buVar = this.Il) != null) {
            yo0 semanticsOwner = getSemanticsOwner();
            pj coroutineContext = getCoroutineContext();
            a90 a90Var = new a90(new sm0[16]);
            az0.aq(semanticsOwner.a(), 0, new rm0(1, a90.class, a90Var, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(a90Var.d, 0, a90Var.f, new rd(0, new cv[]{f50.v, f50.w}));
            int i = a90Var.f;
            sm0 sm0Var = (sm0) (i == 0 ? null : a90Var.d[i - 1]);
            if (sm0Var != null) {
                tz tzVar = sm0Var.c;
                ff ffVar = new ff(sm0Var.a, tzVar, i60.c(coroutineContext), buVar, this);
                fa0 fa0Var = sm0Var.d;
                ri0 ri0VarAk = i60.ad(fa0Var).ak(fa0Var, true);
                long j = (((long) tzVar.a) << 32) | (((long) tzVar.b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetF = i0.f(this, pk.bd(pk.ba(ri0VarAk)), new Point((int) (j >> 32), (int) (j & 4294967295L)), ffVar);
                scrollCaptureTargetF.setScrollBounds(pk.bd(tzVar));
                consumer.accept(scrollCaptureTargetF);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        h2 h2Var = this.w;
        h2Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (f00.h(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            e00.s(h2Var, longSparseArray);
        } else {
            h2Var.d.post(new f2(0, h2Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zX;
        this.m.a.setValue(Boolean.valueOf(z));
        this.I1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zX = d41.x())) {
            return;
        }
        setShowLayoutBounds(zX);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.br) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void r(float[] fArr) {
        z();
        j60.e(fArr, this.au);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.ay >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.ay & 4294967295L));
        float[] fArr2 = this.at;
        j60.d(fArr2);
        j60.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        t1.ap(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((us) getFocusOwner()).c.bx().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (iOrdinal != 3) {
            wc.l();
            return false;
        }
        ls lsVarAn = az0.an(i);
        int i2 = lsVarAn != null ? lsVarAn.a : 7;
        return f00.h(((us) getFocusOwner()).e(i2, rect != null ? pk.bg(rect) : null, new x0(i2, 0)), Boolean.TRUE);
    }

    public final long s(long j) {
        z();
        long jB = j60.b(j, this.au);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.ay >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.ay & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.v.h = j;
    }

    public final void setConfigurationChangeObserver(cv cvVar) {
        this.af = cvVar;
    }

    public final void setContentCaptureManager$ui_release(h2 h2Var) {
        this.w = h2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(pj pjVar) {
        this.k = pjVar;
        i70 i70Var = (i70) getRoot().ag.j;
        if (i70Var instanceof zt0) {
            ((zt0) i70Var).bw();
        }
        if (!i70Var.d.q) {
            sy.b("visitSubtreeIf called on an unattached node");
        }
        a90 a90Var = new a90(new i70[16]);
        i70 i70Var2 = i70Var.d;
        i70 i70Var3 = i70Var2.i;
        if (i70Var3 == null) {
            pk.j(a90Var, i70Var2);
        } else {
            a90Var.b(i70Var3);
        }
        while (true) {
            int i = a90Var.f;
            if (i == 0) {
                return;
            }
            i70 i70Var4 = (i70) a90Var.j(i - 1);
            if ((i70Var4.g & 16) != 0) {
                for (i70 i70Var5 = i70Var4; i70Var5 != null; i70Var5 = i70Var5.i) {
                    if ((i70Var5.f & 16) != 0) {
                        ?? M = i70Var5;
                        ?? a90Var2 = 0;
                        while (M != 0) {
                            if (M instanceof sg0) {
                                sg0 sg0Var = (sg0) M;
                                if (sg0Var instanceof zt0) {
                                    ((zt0) sg0Var).bw();
                                }
                            } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                                i70 i70Var6 = ((rl) M).s;
                                int i2 = 0;
                                M = M;
                                a90Var2 = a90Var2;
                                while (i70Var6 != null) {
                                    if ((i70Var6.f & 16) != 0) {
                                        i2++;
                                        a90Var2 = a90Var2;
                                        if (i2 == 1) {
                                            M = i70Var6;
                                        } else {
                                            if (a90Var2 == 0) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var2.b(M);
                                                M = 0;
                                            }
                                            a90Var2.b(i70Var6);
                                        }
                                    }
                                    i70Var6 = i70Var6.i;
                                    M = M;
                                    a90Var2 = a90Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = pk.m(a90Var2);
                        }
                    }
                }
            }
            pk.j(a90Var, i70Var4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.aw = j;
    }

    public final void setOnViewTreeOwnersAvailable(cv cvVar) {
        p0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cvVar.g(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.bb = cvVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.am = z;
    }

    public void setUncaughtExceptionHandler(tk0 tk0Var) {
        this.aq.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        y0 y0Var;
        m60 m60Var = this.aq;
        if (m60Var.b.t() || ((a90) m60Var.e.e).f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    y0Var = this.O1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                y0Var = null;
            }
            if (m60Var.h(y0Var)) {
                requestLayout();
            }
            m60Var.a(false);
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        r4.k(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r11 = this;
            boolean r0 = r11.ai
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4c
            td0 r0 = r11.getSnapshotObserver()
            rr0 r0 = r0.a
            java.lang.Object r4 = r0.g
            monitor-enter(r4)
            a90 r0 = r0.f     // Catch: java.lang.Throwable -> L3a
            int r5 = r0.f     // Catch: java.lang.Throwable -> L3a
            r6 = r3
            r7 = r6
        L16:
            java.lang.Object[] r8 = r0.d
            if (r6 >= r5) goto L3f
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L3a
            qr0 r8 = (defpackage.qr0) r8     // Catch: java.lang.Throwable -> L3a
            r8.d()     // Catch: java.lang.Throwable -> L3a
            q80 r8 = r8.f     // Catch: java.lang.Throwable -> L3a
            int r8 = r8.e     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L29
            r8 = r2
            goto L2a
        L29:
            r8 = r3
        L2a:
            if (r8 != 0) goto L2f
            int r7 = r7 + 1
            goto L3c
        L2f:
            if (r7 <= 0) goto L3c
            java.lang.Object[] r8 = r0.d     // Catch: java.lang.Throwable -> L3a
            int r9 = r6 - r7
            r10 = r8[r6]     // Catch: java.lang.Throwable -> L3a
            r8[r9] = r10     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r0 = move-exception
            goto L4a
        L3c:
            int r6 = r6 + 1
            goto L16
        L3f:
            int r6 = r5 - r7
            java.util.Arrays.fill(r8, r6, r5, r1)     // Catch: java.lang.Throwable -> L3a
            r0.f = r6     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)
            r11.ai = r3
            goto L4c
        L4a:
            monitor-exit(r4)
            throw r0
        L4c:
            f5 r0 = r11.an
            if (r0 == 0) goto L53
            h(r0)
        L53:
            boolean r0 = g()
            if (r0 == 0) goto L78
            c0 r0 = r11.ah
            if (r0 == 0) goto L78
            f80 r4 = r0.g
            int r5 = r4.d
            if (r5 != 0) goto L72
            boolean r5 = r0.h
            if (r5 == 0) goto L72
            bu r5 = r0.a
            java.lang.Object r5 = r5.e
            android.view.autofill.AutofillManager r5 = (android.view.autofill.AutofillManager) r5
            defpackage.pa.c(r5)
            r0.h = r3
        L72:
            int r4 = r4.d
            if (r4 == 0) goto L78
            r0.h = r2
        L78:
            m80 r0 = r11.bu
            boolean r0 = r0.h()
            if (r0 == 0) goto Lb5
            m80 r0 = r11.bu
            java.lang.Object r0 = r0.e(r3)
            if (r0 == 0) goto Lb5
            m80 r0 = r11.bu
            int r0 = r0.b
            r2 = r3
        L8d:
            m80 r4 = r11.bu
            if (r2 >= r0) goto Lb1
            java.lang.Object r4 = r4.e(r2)
            pu r4 = (defpackage.pu) r4
            m80 r5 = r11.bu
            if (r2 < 0) goto Lad
            int r6 = r5.b
            if (r2 >= r6) goto Lad
            java.lang.Object[] r5 = r5.a
            r6 = r5[r2]
            r5[r2] = r1
            if (r4 == 0) goto Laa
            r4.a()
        Laa:
            int r2 = r2 + 1
            goto L8d
        Lad:
            r5.m(r2)
            throw r1
        Lb1:
            r4.k(r3, r0)
            goto L78
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.u():void");
    }

    public final void v(s20 s20Var) {
        k1 k1Var = this.v;
        k1Var.aa = true;
        if (k1Var.n()) {
            k1Var.o(s20Var);
        }
        h2 h2Var = this.w;
        h2Var.j = true;
        if (h2Var.h()) {
            h2Var.k.u(wz0.a);
        }
    }

    public final void w(s20 s20Var, boolean z, boolean z2) {
        s20 s20VarQ;
        s20 s20VarQ2;
        m60 m60Var = this.aq;
        if (!z) {
            if (m60Var.m(s20Var, z2)) {
                ac(s20Var);
                return;
            }
            return;
        }
        o6 o6Var = m60Var.b;
        s20 s20Var2 = s20Var.j;
        v20 v20Var = s20Var.ah;
        if (s20Var2 == null) {
            sy.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = v20Var.c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    wc.l();
                    return;
                }
                if (!v20Var.d || z2) {
                    v20Var.d = true;
                    v20Var.o.w = true;
                    if (s20Var.ao) {
                        return;
                    }
                    if ((f00.h(s20Var.ag(), Boolean.TRUE) || m60.f(s20Var)) && ((s20VarQ = s20Var.q()) == null || !s20VarQ.ah.d)) {
                        o6Var.a(s20Var, n00.d);
                    } else if ((s20Var.af() || m60.g(s20Var)) && ((s20VarQ2 = s20Var.q()) == null || !s20VarQ2.m())) {
                        o6Var.a(s20Var, n00.f);
                    }
                    if (m60Var.d) {
                        return;
                    }
                    ac(s20Var);
                    return;
                }
                return;
            }
        }
        m60Var.h.b(new l60(s20Var, true, z2));
    }

    public final void x(s20 s20Var, boolean z, boolean z2) {
        v20 v20Var = s20Var.ah;
        n00 n00Var = n00.g;
        m60 m60Var = this.aq;
        if (!z) {
            m60Var.getClass();
            int iOrdinal = v20Var.c.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                wc.l();
                return;
            }
            s20 s20VarQ = s20Var.q();
            boolean z3 = s20VarQ == null || s20VarQ.af();
            if (!z2) {
                if (s20Var.m()) {
                    return;
                }
                if (s20Var.l() && s20Var.af() == z3 && s20Var.af() == v20Var.o.v) {
                    return;
                }
            }
            o60 o60Var = v20Var.o;
            o60Var.x = true;
            o60Var.y = true;
            if (!s20Var.ao && o60Var.v && z3) {
                if ((s20VarQ == null || !s20VarQ.l()) && (s20VarQ == null || !s20VarQ.m())) {
                    m60Var.b.a(s20Var, n00Var);
                }
                if (m60Var.d) {
                    return;
                }
                ac(null);
                return;
            }
            return;
        }
        o6 o6Var = m60Var.b;
        int iOrdinal2 = v20Var.c.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    wc.l();
                    return;
                }
            }
        }
        if ((v20Var.d || v20Var.e) && !z2) {
            return;
        }
        v20Var.e = true;
        v20Var.f = true;
        o60 o60Var2 = v20Var.o;
        o60Var2.x = true;
        o60Var2.y = true;
        if (s20Var.ao) {
            return;
        }
        s20 s20VarQ2 = s20Var.q();
        if (f00.h(s20Var.ag(), Boolean.TRUE) && ((s20VarQ2 == null || !s20VarQ2.ah.d) && (s20VarQ2 == null || !s20VarQ2.ah.e))) {
            o6Var.a(s20Var, n00.e);
        } else if (s20Var.af() && ((s20VarQ2 == null || !s20VarQ2.l()) && (s20VarQ2 == null || !s20VarQ2.m()))) {
            o6Var.a(s20Var, n00Var);
        }
        if (m60Var.d) {
            return;
        }
        ac(null);
    }

    public final void y() {
        k1 k1Var = this.v;
        k1Var.aa = true;
        if (k1Var.n() && !k1Var.al) {
            k1Var.al = true;
            k1Var.l.post(k1Var.an);
        }
        h2 h2Var = this.w;
        h2Var.j = true;
        if (!h2Var.h() || h2Var.q) {
            return;
        }
        h2Var.q = true;
        h2Var.l.post(h2Var.r);
    }

    public final void z() {
        if (this.ax) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.aw) {
            this.aw = jCurrentAnimationTimeMillis;
            z9 z9Var = this.l1;
            float[] fArr = this.au;
            z9Var.d(this, fArr);
            m10.af(fArr, this.av);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.as;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.ay = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public oO getAccessibilityManager() {
        return this.x;
    }

    public g0 getClipboard() {
        return this.ak;
    }

    public h0 getClipboardManager() {
        return this.aj;
    }

    public s2 getDragAndDropManager() {
        return this.l;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public e80 m4getLayoutNodes() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @hm
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @hm
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(tk0 tk0Var) {
    }
}
