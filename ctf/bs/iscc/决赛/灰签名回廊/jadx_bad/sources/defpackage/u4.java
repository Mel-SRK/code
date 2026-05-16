package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends TextPaint {
    public l3 a;
    public bv0 b;
    public int c;
    public yp0 d;
    public qc e;
    public i9 f;
    public km g;
    public pq0 h;
    public yo i;

    public final l3 a() {
        l3 l3Var = this.a;
        if (l3Var != null) {
            return l3Var;
        }
        l3 l3Var2 = new l3(this);
        this.a = l3Var2;
        return l3Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i9 i9Var, long j, float f) {
        if (i9Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (i9Var instanceof vr0) {
            d(wn0.j(((vr0) i9Var).a, f));
            return;
        }
        if (!(i9Var instanceof j9)) {
            wc.l();
            return;
        }
        if (f00.h(this.f, i9Var)) {
            pq0 pq0Var = this.h;
            if (!(pq0Var == null ? false : pq0.a(pq0Var.a, j))) {
            }
        } else {
            if (j != 9205357640488583168L) {
                this.f = i9Var;
                this.h = new pq0(j);
                this.g = bo0.f(new t4(i9Var, j));
            }
        }
        l3 l3VarA = a();
        km kmVar = this.g;
        Shader shader = kmVar != null ? (Shader) kmVar.getValue() : null;
        l3VarA.c = shader;
        l3VarA.a.setShader(shader);
        this.e = null;
        e00.ah(this, f);
    }

    public final void d(long j) {
        qc qcVar = this.e;
        if (qcVar == null ? false : qc.c(qcVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new qc(j);
            setColor(m10.av(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(yo yoVar) {
        if (yoVar == null || f00.h(this.i, yoVar)) {
            return;
        }
        this.i = yoVar;
        if (yoVar.equals(ir.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(yoVar instanceof gt0)) {
            wc.l();
            return;
        }
        a().i(1);
        l3 l3VarA = a();
        l3VarA.a.setStrokeWidth(((gt0) yoVar).a);
        a().a.setStrokeMiter(4.0f);
        a().h();
        a().g();
        a().a.setPathEffect(null);
    }

    public final void f(yp0 yp0Var) {
        if (yp0Var == null || f00.h(this.d, yp0Var)) {
            return;
        }
        this.d = yp0Var;
        if (yp0Var.equals(yp0.d)) {
            clearShadowLayer();
            return;
        }
        yp0 yp0Var2 = this.d;
        float f = yp0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (yp0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), m10.av(this.d.a));
    }

    public final void g(bv0 bv0Var) {
        if (bv0Var == null || f00.h(this.b, bv0Var)) {
            return;
        }
        this.b = bv0Var;
        int i = bv0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
