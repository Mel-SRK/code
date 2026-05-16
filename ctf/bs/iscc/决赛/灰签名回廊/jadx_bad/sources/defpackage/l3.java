package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public c8 d;

    public l3(Paint paint) {
        this.a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : m3.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : m3.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            paint.setBlendMode(az0.ai(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(az0.ao(i)));
        }
    }

    public final void e(long j) {
        this.a.setColor(m10.av(j));
    }

    public final void f(c8 c8Var) {
        this.d = c8Var;
        this.a.setColorFilter(c8Var != null ? c8Var.a : null);
    }

    public final void g() {
        this.a.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void h() {
        this.a.setStrokeJoin(Paint.Join.MITER);
    }

    public final void i(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
