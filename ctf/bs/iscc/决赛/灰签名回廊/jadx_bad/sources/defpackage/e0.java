package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements oa {
    public Canvas a = f0.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.oa
    public final void a(c3 c3Var, l3 l3Var) {
        this.a.drawBitmap(c3Var.a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), l3Var.a);
    }

    @Override // defpackage.oa
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.oa
    public final void c(float f, long j, l3 l3Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, l3Var.a);
    }

    @Override // defpackage.oa
    public final void d(c3 c3Var, long j, long j2, l3 l3Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (c3Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c3Var.a;
        Rect rect = this.b;
        rect.getClass();
        int i = (int) 0;
        rect.left = i;
        int i2 = (int) 0;
        rect.top = i2;
        rect.right = ((int) (j >> 32)) + i;
        rect.bottom = ((int) (j & 4294967295L)) + i2;
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = i;
        rect2.top = i2;
        rect2.right = i + ((int) (j2 >> 32));
        rect2.bottom = i2 + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, l3Var.a);
    }

    @Override // defpackage.oa
    public final void e(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.oa
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.oa
    public final void g(t3 t3Var, l3 l3Var) {
        Canvas canvas = this.a;
        if (!(t3Var instanceof t3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(t3Var.a, l3Var.a);
    }

    @Override // defpackage.oa
    public final void h() {
        this.a.rotate(45.0f);
    }

    @Override // defpackage.oa
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.oa
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, l3 l3Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, l3Var.a);
    }

    @Override // defpackage.oa
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.oa
    public final void m(long j, long j2, l3 l3Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), l3Var.a);
    }

    @Override // defpackage.oa
    public final void n() {
        pk.w(this.a, false);
    }

    @Override // defpackage.oa
    public final void o(float f, float f2, float f3, float f4, l3 l3Var) {
        this.a.drawRect(f, f2, f3, f4, l3Var.a);
    }

    @Override // defpackage.oa
    public final void p() {
        pk.w(this.a, true);
    }

    @Override // defpackage.oa
    public final void q(t3 t3Var) {
        Canvas canvas = this.a;
        if (!(t3Var instanceof t3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(t3Var.a, Region.Op.INTERSECT);
    }
}
