package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends w5 {
    public float a;

    public s5(float f) {
        this.a = f;
    }

    @Override // defpackage.w5
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.w5
    public final int b() {
        return 1;
    }

    @Override // defpackage.w5
    public final w5 c() {
        return new s5(0.0f);
    }

    @Override // defpackage.w5
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.w5
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s5) && ((s5) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
