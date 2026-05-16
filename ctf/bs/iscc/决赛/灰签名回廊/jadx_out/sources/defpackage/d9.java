package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements c9 {
    public final yy0 b = f00.ak(125, 2, new gk(0.25f, 0.1f, 0.25f));

    @Override // defpackage.c9
    public final float a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }

    @Override // defpackage.c9
    public final q5 b() {
        return this.b;
    }
}
