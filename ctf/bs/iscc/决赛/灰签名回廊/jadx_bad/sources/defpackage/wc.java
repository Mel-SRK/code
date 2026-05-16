package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements kn, ep {
    public final /* synthetic */ int a;

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void e(int i, int i2, String str) {
        throw new IndexOutOfBoundsException(str + i + ((Object) ") offset is outside of text region ") + i2);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void h(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l() {
        throw new xd();
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void o(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.ep
    public float a(float f) {
        return f;
    }

    @Override // defpackage.kn
    public double b(double d) {
        switch (this.a) {
            case 1:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 2:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 3:
                float[] fArr = gd.a;
                return gd.b(gd.c, d);
            case 4:
                float[] fArr2 = gd.a;
                return gd.a(gd.c, d);
            case 5:
                float[] fArr3 = gd.a;
                return gd.d(gd.d, d);
            case 6:
                float[] fArr4 = gd.a;
                return gd.c(gd.d, d);
            default:
                return d;
        }
    }
}
