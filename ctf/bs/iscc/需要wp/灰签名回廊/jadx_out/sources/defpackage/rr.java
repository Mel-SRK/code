package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rr {
    public final float a;
    public final float b;

    public rr(float f, em emVar) {
        this.a = f;
        float fB = emVar.b();
        float f2 = sr.a;
        this.b = fB * 386.0878f * 160.0f * 0.84f;
    }

    public final qr a(float f) {
        double dB = b(f);
        double d = sr.a;
        double d2 = d - 1.0d;
        return new qr(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = y2.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
