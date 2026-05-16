package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es0 implements nr {
    public final float a;
    public final float b;
    public final Object c;

    public es0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.q5
    public final l01 a(zy0 zy0Var) {
        Object obj = this.c;
        return new n01(this.a, this.b, obj == null ? null : (w5) zy0Var.a.g(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof es0) {
            es0 es0Var = (es0) obj;
            if (es0Var.a == this.a && es0Var.b == this.b && f00.h(es0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + n5.b(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ es0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
