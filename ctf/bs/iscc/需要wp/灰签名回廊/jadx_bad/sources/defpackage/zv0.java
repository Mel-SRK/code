package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv0 {
    public static final f1 f;
    public final ie0 a;
    public final ie0 b = new ie0(0.0f);
    public ri0 c = ri0.e;
    public long d = hx0.b;
    public final me0 e;

    static {
        yv0 yv0Var = yv0.f;
        md mdVar = new md(9, (byte) 0);
        az0.p(1, yv0Var);
        f = new f1(17, mdVar, yv0Var);
    }

    public zv0(wc0 wc0Var, float f2) {
        this.a = new ie0(f2);
        this.e = new me0(wc0Var, bw.au);
    }

    public final void a(wc0 wc0Var, ri0 ri0Var, int i, int i2) {
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = ri0Var.a;
        float f4 = ri0Var.b;
        ri0 ri0Var2 = this.c;
        float f5 = ri0Var2.a;
        ie0 ie0Var = this.a;
        if (f3 != f5 || f4 != ri0Var2.b) {
            boolean z = wc0Var == wc0.d;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? ri0Var.d : ri0Var.c;
            float fG = ie0Var.g();
            float f7 = i;
            float f8 = fG + f7;
            ie0Var.h(ie0Var.g() + ((f6 <= f8 && (f3 >= fG || f6 - f3 <= f7)) ? (f3 >= fG || f6 - f3 > f7) ? 0.0f : f3 - fG : f6 - f8));
            this.c = ri0Var;
        }
        ie0Var.h(i60.s(ie0Var.g(), 0.0f, f2));
    }
}
