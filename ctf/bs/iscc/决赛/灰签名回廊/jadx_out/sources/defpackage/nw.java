package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nw implements kw {
    public static final AtomicBoolean w = new AtomicBoolean(true);
    public final sa b;
    public final ra c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;

    public nw(b1 b1Var, sa saVar, ra raVar) {
        this.b = saVar;
        this.c = raVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", b1Var);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (w.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                ij0.c(renderNodeCreate, ij0.a(renderNodeCreate));
                ij0.d(renderNodeCreate, ij0.b(renderNodeCreate));
            }
            hj0.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        ao(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = qc.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
    }

    @Override // defpackage.kw
    public final float a() {
        return this.l;
    }

    @Override // defpackage.kw
    public final void aa(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            ij0.d(this.d, m10.av(j));
        }
    }

    @Override // defpackage.kw
    public final void ab(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.kw
    public final Matrix ac() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.kw
    public final void ad(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (wz.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.kw
    public final float ae() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void af(float f) {
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.kw
    public final float ag() {
        return this.p;
    }

    @Override // defpackage.kw
    public final boolean ah() {
        return this.d.isValid();
    }

    @Override // defpackage.kw
    public final float ai() {
        return this.o;
    }

    @Override // defpackage.kw
    public final float aj() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final int ak() {
        return this.k;
    }

    @Override // defpackage.kw
    public final void al(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.kw
    public final long am() {
        return this.q;
    }

    public final void an() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void ao(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void ap() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            ao(i);
        } else {
            ao(1);
        }
    }

    @Override // defpackage.kw
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.kw
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.kw
    public final float d() {
        return this.n;
    }

    @Override // defpackage.kw
    public final void e(float f) {
        this.p = f;
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
        return this.r;
    }

    @Override // defpackage.kw
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            ij0.c(this.d, m10.av(j));
        }
    }

    @Override // defpackage.kw
    public final void k(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        an();
    }

    @Override // defpackage.kw
    public final void l() {
        ap();
    }

    @Override // defpackage.kw
    public final void m(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.kw
    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(az0.ao(i)));
        ap();
    }

    @Override // defpackage.kw
    public final float o() {
        return this.s;
    }

    @Override // defpackage.kw
    public final void p() {
        hj0.a(this.d);
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
        Canvas canvas = f0.a;
        DisplayListCanvas displayListCanvas = ((e0) oaVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.kw
    public final void t(boolean z) {
        this.t = z;
        an();
    }

    @Override // defpackage.kw
    public final int u() {
        return this.j;
    }

    @Override // defpackage.kw
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void w(em emVar, e20 e20Var, jw jwVar, l1 l1Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            e0 e0Var = this.b.a;
            Canvas canvas = e0Var.a;
            e0Var.a = canvasStart;
            ra raVar = this.c;
            o6 o6Var = raVar.e;
            long jAn = e00.an(this.e);
            qa qaVar = ((ra) o6Var.c).d;
            em emVar2 = qaVar.a;
            e20 e20Var2 = qaVar.b;
            oa oaVarO = o6Var.o();
            long jR = o6Var.r();
            jw jwVar2 = (jw) o6Var.b;
            o6Var.z(emVar);
            o6Var.aa(e20Var);
            o6Var.y(e0Var);
            o6Var.ab(jAn);
            o6Var.b = jwVar;
            e0Var.l();
            try {
                l1Var.g(raVar);
                e0Var.i();
                o6Var.z(emVar2);
                o6Var.aa(e20Var2);
                o6Var.y(oaVarO);
                o6Var.ab(jR);
                o6Var.b = jwVar2;
                e0Var.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                e0Var.i();
                o6 o6Var2 = raVar.e;
                o6Var2.z(emVar2);
                o6Var2.aa(e20Var2);
                o6Var2.y(oaVarO);
                o6Var2.ab(jR);
                o6Var2.b = jwVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // defpackage.kw
    public final c8 x() {
        return null;
    }

    @Override // defpackage.kw
    public final void y(int i) {
        this.j = i;
        ap();
    }

    @Override // defpackage.kw
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
