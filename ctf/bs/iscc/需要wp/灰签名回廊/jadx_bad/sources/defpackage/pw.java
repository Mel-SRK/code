package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class pw implements kw {
    public final sa b;
    public final ra c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;

    public pw() {
        sa saVar = new sa();
        ra raVar = new ra();
        this.b = saVar;
        this.c = raVar;
        RenderNode renderNodeC = ow.c();
        this.d = renderNodeC;
        this.e = 0L;
        renderNodeC.setClipToBounds(false);
        ao(renderNodeC, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = qc.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.t = 0;
    }

    @Override // defpackage.kw
    public final float a() {
        return this.i;
    }

    @Override // defpackage.kw
    public final void aa(long j) {
        this.o = j;
        this.d.setSpotShadowColor(m10.av(j));
    }

    @Override // defpackage.kw
    public final void ab(float f) {
        this.l = f;
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
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = e00.an(j);
    }

    @Override // defpackage.kw
    public final float ae() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void af(float f) {
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.kw
    public final float ag() {
        return this.m;
    }

    @Override // defpackage.kw
    public final boolean ah() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.kw
    public final float ai() {
        return this.l;
    }

    @Override // defpackage.kw
    public final float aj() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final int ak() {
        return this.j;
    }

    @Override // defpackage.kw
    public final void al(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.kw
    public final long am() {
        return this.n;
    }

    public final void an() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.r) {
            this.r = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.s) {
            this.s = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void ao(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void ap() {
        int i = this.t;
        if (i != 1 && this.j == 3) {
            ao(this.d, i);
        } else {
            ao(this.d, 1);
        }
    }

    @Override // defpackage.kw
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.kw
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.kw
    public final float d() {
        return this.k;
    }

    @Override // defpackage.kw
    public final void e(float f) {
        this.m = f;
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
        return this.o;
    }

    @Override // defpackage.kw
    public final void j(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(m10.av(j));
    }

    @Override // defpackage.kw
    public final void k(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        an();
    }

    @Override // defpackage.kw
    public final void l() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        ap();
    }

    @Override // defpackage.kw
    public final void m(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.kw
    public final void n(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(az0.ai(i));
        ap();
    }

    @Override // defpackage.kw
    public final float o() {
        return this.p;
    }

    @Override // defpackage.kw
    public final void p() {
        this.d.discardDisplayList();
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
        ((e0) oaVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.kw
    public final void t(boolean z) {
        this.q = z;
        an();
    }

    @Override // defpackage.kw
    public final int u() {
        return this.t;
    }

    @Override // defpackage.kw
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.kw
    public final void w(em emVar, e20 e20Var, jw jwVar, l1 l1Var) {
        ra raVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            sa saVar = this.b;
            e0 e0Var = saVar.a;
            Canvas canvas = e0Var.a;
            e0Var.a = recordingCanvasBeginRecording;
            o6 o6Var = raVar.e;
            o6Var.z(emVar);
            o6Var.aa(e20Var);
            o6Var.b = jwVar;
            o6Var.ab(this.e);
            o6Var.y(e0Var);
            l1Var.g(raVar);
            saVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.kw
    public final c8 x() {
        return null;
    }

    @Override // defpackage.kw
    public final void y(int i) {
        this.t = i;
        ap();
    }

    @Override // defpackage.kw
    public final void z() {
        this.d.setRotationZ(0.0f);
    }
}
