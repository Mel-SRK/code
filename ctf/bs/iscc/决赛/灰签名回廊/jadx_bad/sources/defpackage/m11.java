package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m11 extends View {
    public static final xg0 n = new xg0(1);
    public final to d;
    public final sa e;
    public final ra f;
    public boolean g;
    public Outline h;
    public boolean i;
    public em j;
    public e20 k;
    public cv l;
    public jw m;

    public m11(to toVar, sa saVar, ra raVar) {
        super(toVar.getContext());
        this.d = toVar;
        this.e = saVar;
        this.f = raVar;
        setOutlineProvider(n);
        this.i = true;
        this.j = t1.d;
        this.k = e20.d;
        kw.a.getClass();
        this.l = q0.af;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.e;
        e0 e0Var = saVar.a;
        Canvas canvas2 = e0Var.a;
        e0Var.a = canvas;
        em emVar = this.j;
        e20 e20Var = this.k;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        jw jwVar = this.m;
        cv cvVar = this.l;
        ra raVar = this.f;
        o6 o6Var = raVar.e;
        qa qaVar = ((ra) o6Var.c).d;
        em emVar2 = qaVar.a;
        e20 e20Var2 = qaVar.b;
        oa oaVarO = o6Var.o();
        o6 o6Var2 = raVar.e;
        long jR = o6Var2.r();
        jw jwVar2 = (jw) o6Var2.b;
        o6Var2.z(emVar);
        o6Var2.aa(e20Var);
        o6Var2.y(e0Var);
        o6Var2.ab(jFloatToRawIntBits);
        o6Var2.b = jwVar;
        e0Var.l();
        try {
            cvVar.g(raVar);
            e0Var.i();
            o6Var2.z(emVar2);
            o6Var2.aa(e20Var2);
            o6Var2.y(oaVarO);
            o6Var2.ab(jR);
            o6Var2.b = jwVar2;
            saVar.a.a = canvas2;
            this.g = false;
        } catch (Throwable th) {
            e0Var.i();
            o6Var2.z(emVar2);
            o6Var2.aa(e20Var2);
            o6Var2.y(oaVarO);
            o6Var2.ab(jR);
            o6Var2.b = jwVar2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.i;
    }

    public final sa getCanvasHolder() {
        return this.e;
    }

    public final View getOwnerView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.g) {
            return;
        }
        this.g = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
