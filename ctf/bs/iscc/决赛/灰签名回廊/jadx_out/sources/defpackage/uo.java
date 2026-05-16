package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class uo extends d41 implements vo {
    public final /* synthetic */ int m = 1;
    public final v2 n;
    public final gp o;
    public Object p;

    public uo(v2 v2Var, gp gpVar, od0 od0Var) {
        this.n = v2Var;
        this.o = gpVar;
        this.p = od0Var;
    }

    public static boolean av(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean aw(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(xa0.d(j), xa0.e(j));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode ax() {
        RenderNode renderNode = (RenderNode) this.p;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = d0.f();
        this.p = renderNodeF;
        return renderNodeF;
    }

    @Override // defpackage.vo
    public final void d(u20 u20Var) {
        float f;
        boolean zAv;
        float f2;
        float f3;
        float f4;
        switch (this.m) {
            case 0:
                wd0 wd0Var = ((od0) this.p).b;
                ra raVar = u20Var.d;
                long jC = raVar.c();
                v2 v2Var = this.n;
                v2Var.l(jC);
                if (pq0.e(raVar.c())) {
                    u20Var.a();
                    return;
                }
                u20Var.a();
                v2Var.f.getValue();
                Canvas canvasA = f0.a(raVar.e.o());
                gp gpVar = this.o;
                boolean zAw = gp.f(gpVar.f) ? aw(270.0f, d41.h(-pq0.b(raVar.c()), u20Var.x(wd0Var.a(u20Var.getLayoutDirection()))), gpVar.c(), canvasA) : false;
                if (gp.f(gpVar.d)) {
                    zAw = aw(0.0f, d41.h(0.0f, u20Var.x(wd0Var.b)), gpVar.e(), canvasA) || zAw;
                }
                if (gp.f(gpVar.g)) {
                    zAw = aw(90.0f, d41.h(0.0f, u20Var.x(wd0Var.b(u20Var.getLayoutDirection())) + (-((float) i60.ax(pq0.d(raVar.c()))))), gpVar.d(), canvasA) || zAw;
                }
                if (gp.f(gpVar.e)) {
                    zAw = aw(180.0f, d41.h(-pq0.d(raVar.c()), (-pq0.b(raVar.c())) + u20Var.x(wd0Var.d)), gpVar.b(), canvasA) || zAw;
                }
                if (zAw) {
                    v2Var.c();
                    return;
                }
                return;
            default:
                ra raVar2 = u20Var.d;
                long jC2 = raVar2.c();
                v2 v2Var2 = this.n;
                v2Var2.l(jC2);
                if (pq0.e(raVar2.c())) {
                    u20Var.a();
                    return;
                }
                v2Var2.f.getValue();
                float fX = u20Var.x(ec.a);
                Canvas canvasA2 = f0.a(raVar2.e.o());
                gp gpVar2 = this.o;
                boolean z = gp.f(gpVar2.d) || gp.g(gpVar2.h) || gp.f(gpVar2.e) || gp.g(gpVar2.i);
                boolean z2 = gp.f(gpVar2.f) || gp.g(gpVar2.j) || gp.f(gpVar2.g) || gp.g(gpVar2.k);
                if (z && z2) {
                    ax().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z) {
                    ax().setPosition(0, 0, (i60.ax(fX) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z2) {
                        u20Var.a();
                        return;
                    }
                    ax().setPosition(0, 0, canvasA2.getWidth(), (i60.ax(fX) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = ax().beginRecording();
                if (gp.g(gpVar2.j)) {
                    EdgeEffect edgeEffectA = gpVar2.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = gpVar2.a();
                        gpVar2.j = edgeEffectA;
                    }
                    av(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                boolean zF = gp.f(gpVar2.f);
                h6 h6Var = h6.a;
                if (zF) {
                    EdgeEffect edgeEffectC = gpVar2.c();
                    zAv = av(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (gp.g(gpVar2.f)) {
                        float fE = xa0.e(v2Var2.b());
                        EdgeEffect edgeEffectA2 = gpVar2.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = gpVar2.a();
                            gpVar2.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fB = i >= 31 ? h6Var.b(edgeEffectC) : 0.0f;
                        f = fX;
                        float f5 = 1 - fE;
                        if (i >= 31) {
                            h6Var.c(edgeEffectA2, fB, f5);
                        } else {
                            edgeEffectA2.onPull(fB, f5);
                        }
                    } else {
                        f = fX;
                    }
                } else {
                    f = fX;
                    zAv = false;
                }
                if (gp.g(gpVar2.h)) {
                    EdgeEffect edgeEffectA3 = gpVar2.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = gpVar2.a();
                        gpVar2.h = edgeEffectA3;
                    }
                    av(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (gp.f(gpVar2.d)) {
                    EdgeEffect edgeEffectE = gpVar2.e();
                    boolean z3 = av(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zAv;
                    if (gp.g(gpVar2.d)) {
                        float fD = xa0.d(v2Var2.b());
                        EdgeEffect edgeEffectA4 = gpVar2.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = gpVar2.a();
                            gpVar2.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fB2 = i2 >= 31 ? h6Var.b(edgeEffectE) : 0.0f;
                        if (i2 >= 31) {
                            h6Var.c(edgeEffectA4, fB2, fD);
                        } else {
                            edgeEffectA4.onPull(fB2, fD);
                        }
                    }
                    zAv = z3;
                }
                if (gp.g(gpVar2.k)) {
                    EdgeEffect edgeEffectA5 = gpVar2.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = gpVar2.a();
                        gpVar2.k = edgeEffectA5;
                    }
                    av(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (gp.f(gpVar2.g)) {
                    EdgeEffect edgeEffectD = gpVar2.d();
                    boolean z4 = av(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zAv;
                    if (gp.g(gpVar2.g)) {
                        float fE2 = xa0.e(v2Var2.b());
                        EdgeEffect edgeEffectA6 = gpVar2.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = gpVar2.a();
                            gpVar2.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB3 = i3 >= 31 ? h6Var.b(edgeEffectD) : 0.0f;
                        if (i3 >= 31) {
                            h6Var.c(edgeEffectA6, fB3, fE2);
                        } else {
                            edgeEffectA6.onPull(fB3, fE2);
                        }
                    }
                    zAv = z4;
                }
                if (gp.g(gpVar2.i)) {
                    EdgeEffect edgeEffectA7 = gpVar2.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = gpVar2.a();
                        gpVar2.i = edgeEffectA7;
                    }
                    f2 = 0.0f;
                    av(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                } else {
                    f2 = 0.0f;
                }
                if (gp.f(gpVar2.e)) {
                    EdgeEffect edgeEffectB = gpVar2.b();
                    boolean z5 = av(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zAv;
                    if (gp.g(gpVar2.e)) {
                        float fD2 = xa0.d(v2Var2.b());
                        EdgeEffect edgeEffectA8 = gpVar2.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = gpVar2.a();
                            gpVar2.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fB4 = i4 >= 31 ? h6Var.b(edgeEffectB) : f2;
                        float f6 = 1 - fD2;
                        if (i4 >= 31) {
                            h6Var.c(edgeEffectA8, fB4, f6);
                        } else {
                            edgeEffectA8.onPull(fB4, f6);
                        }
                    }
                    zAv = z5;
                }
                if (zAv) {
                    v2Var2.c();
                }
                float f7 = z2 ? f2 : f;
                if (!z) {
                    f2 = f;
                }
                e20 layoutDirection = u20Var.getLayoutDirection();
                e0 e0Var = new e0();
                e0Var.a = recordingCanvasBeginRecording;
                long jC3 = raVar2.c();
                o6 o6Var = raVar2.e;
                qa qaVar = ((ra) o6Var.c).d;
                em emVar = qaVar.a;
                e20 e20Var = qaVar.b;
                oa oaVarO = o6Var.o();
                long jR = raVar2.e.r();
                o6 o6Var2 = raVar2.e;
                jw jwVar = (jw) o6Var2.b;
                o6Var2.z(u20Var);
                o6Var2.aa(layoutDirection);
                o6Var2.y(e0Var);
                o6Var2.ab(jC3);
                o6Var2.b = null;
                e0Var.l();
                try {
                    ((bu) raVar2.e.a).q(f7, f2);
                    try {
                        u20Var.a();
                        e0Var.i();
                        o6 o6Var3 = raVar2.e;
                        o6Var3.z(emVar);
                        o6Var3.aa(e20Var);
                        o6Var3.y(oaVarO);
                        o6Var3.ab(jR);
                        o6Var3.b = jwVar;
                        ax().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f3, f4);
                        canvasA2.drawRenderNode(ax());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((bu) raVar2.e.a).q(-f7, -f2);
                    }
                } catch (Throwable th) {
                    e0Var.i();
                    o6 o6Var4 = raVar2.e;
                    o6Var4.z(emVar);
                    o6Var4.aa(e20Var);
                    o6Var4.y(oaVarO);
                    o6Var4.ab(jR);
                    o6Var4.b = jwVar;
                    throw th;
                }
        }
    }

    public uo(v2 v2Var, gp gpVar) {
        this.n = v2Var;
        this.o = gpVar;
    }
}
