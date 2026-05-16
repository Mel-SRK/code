package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t5 extends w5 {
    public float a;
    public float b;

    public t5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.w5
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.w5
    public final int b() {
        return 2;
    }

    @Override // defpackage.w5
    public final w5 c() {
        return new t5(0.0f, 0.0f);
    }

    @Override // defpackage.w5
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.w5
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return t5Var.a == this.a && t5Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
