package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class ra implements xo {
    public final qa d;
    public final o6 e;
    public l3 f;
    public l3 g;

    public ra() {
        fm fmVar = t1.d;
        qa qaVar = new qa();
        qaVar.a = fmVar;
        qaVar.b = e20.d;
        qaVar.c = oq.a;
        qaVar.d = 0L;
        this.d = qaVar;
        o6 o6Var = new o6();
        o6Var.c = this;
        o6Var.a = new bu(2, o6Var);
        this.e = o6Var;
    }

    public static l3 a(ra raVar, long j, yo yoVar, int i) {
        l3 l3VarF = raVar.f(yoVar);
        Paint paint = l3VarF.a;
        if (!qc.c(m10.b(paint.getColor()), j)) {
            l3VarF.e(j);
        }
        if (l3VarF.c != null) {
            l3VarF.c = null;
            paint.setShader(null);
        }
        if (!f00.h(l3VarF.d, null)) {
            l3VarF.f(null);
        }
        if (l3VarF.b != i) {
            l3VarF.d(i);
        }
        if (paint.isFilterBitmap()) {
            return l3VarF;
        }
        paint.setFilterBitmap(true);
        return l3VarF;
    }

    @Override // defpackage.xo
    public final o6 aa() {
        return this.e;
    }

    @Override // defpackage.xo
    public final void ah(long j, long j2, long j3, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, ir.a, i));
    }

    @Override // defpackage.xo
    public final void ao(t3 t3Var, long j, yo yoVar) {
        this.d.c.g(t3Var, a(this, j, yoVar, 3));
    }

    @Override // defpackage.em
    public final float b() {
        return this.d.a.b();
    }

    public final l3 d(i9 i9Var, yo yoVar, float f, c8 c8Var, int i) {
        l3 l3VarF = f(yoVar);
        Paint paint = l3VarF.a;
        if (i9Var != null) {
            i9Var.a(f, c(), l3VarF);
        } else {
            if (l3VarF.c != null) {
                l3VarF.c = null;
                paint.setShader(null);
            }
            long jB = m10.b(paint.getColor());
            long j = qc.b;
            if (!qc.c(jB, j)) {
                l3VarF.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                l3VarF.c(f);
            }
        }
        if (!f00.h(l3VarF.d, c8Var)) {
            l3VarF.f(c8Var);
        }
        if (l3VarF.b != i) {
            l3VarF.d(i);
        }
        if (paint.isFilterBitmap()) {
            return l3VarF;
        }
        paint.setFilterBitmap(true);
        return l3VarF;
    }

    public final void e(c3 c3Var, c8 c8Var) {
        this.d.c.a(c3Var, d(null, ir.a, 1.0f, c8Var, 3));
    }

    public final l3 f(yo yoVar) {
        if (f00.h(yoVar, ir.a)) {
            l3 l3Var = this.f;
            if (l3Var != null) {
                return l3Var;
            }
            l3 l3VarC = t1.c();
            l3VarC.i(0);
            this.f = l3VarC;
            return l3VarC;
        }
        if (!(yoVar instanceof gt0)) {
            wc.l();
            return null;
        }
        l3 l3VarC2 = this.g;
        if (l3VarC2 == null) {
            l3VarC2 = t1.c();
            l3VarC2.i(1);
            this.g = l3VarC2;
        }
        Paint paint = l3VarC2.a;
        float strokeWidth = paint.getStrokeWidth();
        float f = ((gt0) yoVar).a;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        if (l3VarC2.a() != 0) {
            l3VarC2.g();
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (l3VarC2.b() == 0) {
            return l3VarC2;
        }
        l3VarC2.h();
        return l3VarC2;
    }

    @Override // defpackage.xo
    public final void g(t3 t3Var, i9 i9Var, float f, yo yoVar, int i) {
        this.d.c.g(t3Var, d(i9Var, yoVar, f, null, i));
    }

    @Override // defpackage.em
    public final float k() {
        return this.d.a.k();
    }

    @Override // defpackage.xo
    public final void q(float f, long j, long j2) {
        this.d.c.c(f, j2, a(this, j, ir.a, 3));
    }

    @Override // defpackage.xo
    public final void u(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, ir.a, 3));
    }
}
