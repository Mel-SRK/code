package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class rw implements kw {
    public static final qw w = new qw();
    public final to b;
    public final sa c;
    public final m11 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;

    public rw(to toVar) {
        sa saVar = new sa();
        ra raVar = new ra();
        this.b = toVar;
        this.c = saVar;
        m11 m11Var = new m11(toVar, saVar, raVar);
        this.d = m11Var;
        this.e = toVar.getResources();
        this.f = new Rect();
        toVar.addView(m11Var);
        m11Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = qc.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.kw
    public final float a() {
        return this.p;
    }

    @Override // defpackage.kw
    public final void aa(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(m10.av(j));
        }
    }

    @Override // defpackage.kw
    public final void ab(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.kw
    public final Matrix ac() {
        return this.d.getMatrix();
    }

    @Override // defpackage.kw
    public final void ad(int i, int i2, long j) {
        boolean zA = wz.a(this.j, j);
        m11 m11Var = this.d;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                m11Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                m11Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || m11Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            m11Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                m11Var.setPivotX(i5 / 2.0f);
                m11Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.kw
    public final float ae() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void af(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.kw
    public final float ag() {
        return this.t;
    }

    @Override // defpackage.kw
    public final float ai() {
        return this.s;
    }

    @Override // defpackage.kw
    public final float aj() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final int ak() {
        return this.n;
    }

    @Override // defpackage.kw
    public final void al(long j) {
        long j2 = 9223372034707292159L & j;
        m11 m11Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            m11Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            m11Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                m11Var.resetPivot();
                return;
            }
            this.q = true;
            m11Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            m11Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.kw
    public final long am() {
        return this.u;
    }

    public final void an(int i) {
        m11 m11Var = this.d;
        boolean z = true;
        if (i == 1) {
            m11Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                m11Var.setLayerType(0, paint);
                z = false;
            } else {
                m11Var.setLayerType(0, paint);
            }
        }
        m11Var.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    public final void ao() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            an(i);
        } else {
            an(1);
        }
    }

    @Override // defpackage.kw
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.kw
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.kw
    public final float d() {
        return this.r;
    }

    @Override // defpackage.kw
    public final void e(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.kw
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void g() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.kw
    public final void h() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.kw
    public final long i() {
        return this.v;
    }

    @Override // defpackage.kw
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(m10.av(j));
        }
    }

    @Override // defpackage.kw
    public final void k(Outline outline, long j) {
        m11 m11Var = this.d;
        m11Var.h = outline;
        m11Var.invalidateOutline();
        if ((this.m || m11Var.getClipToOutline()) && outline != null) {
            m11Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.kw
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        ao();
    }

    @Override // defpackage.kw
    public final void m(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.kw
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(az0.ao(i)));
        ao();
    }

    @Override // defpackage.kw
    public final float o() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.kw
    public final void p() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.kw
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void r() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.kw
    public final void s(oa oaVar) {
        Rect rect;
        boolean z = this.k;
        m11 m11Var = this.d;
        if (z) {
            if ((this.m || m11Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = m11Var.getWidth();
                rect.bottom = m11Var.getHeight();
            } else {
                rect = null;
            }
            m11Var.setClipBounds(rect);
        }
        Canvas canvas = f0.a;
        if (((e0) oaVar).a.isHardwareAccelerated()) {
            this.b.a(oaVar, m11Var, m11Var.getDrawingTime());
        }
    }

    @Override // defpackage.kw
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.kw
    public final int u() {
        return this.o;
    }

    @Override // defpackage.kw
    public final float v() {
        return 0.0f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.kw
    public final void w(em emVar, e20 e20Var, jw jwVar, l1 l1Var) {
        m11 m11Var = this.d;
        ViewParent parent = m11Var.getParent();
        to toVar = this.b;
        if (parent == null) {
            toVar.addView(m11Var);
        }
        m11Var.j = emVar;
        m11Var.k = e20Var;
        m11Var.l = l1Var;
        m11Var.m = jwVar;
        if (m11Var.isAttachedToWindow()) {
            m11Var.setVisibility(4);
            m11Var.setVisibility(0);
            try {
                sa saVar = this.c;
                qw qwVar = w;
                e0 e0Var = saVar.a;
                Canvas canvas = e0Var.a;
                e0Var.a = qwVar;
                toVar.a(e0Var, m11Var, m11Var.getDrawingTime());
                saVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.kw
    public final c8 x() {
        return null;
    }

    @Override // defpackage.kw
    public final void y(int i) {
        this.o = i;
        ao();
    }

    @Override // defpackage.kw
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
