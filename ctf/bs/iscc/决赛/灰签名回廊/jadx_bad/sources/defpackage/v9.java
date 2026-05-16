package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public v9(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return mn.a(this.a, v9Var.a) && mn.a(this.b, v9Var.b) && mn.a(this.c, v9Var.c) && mn.a(this.d, v9Var.d) && mn.a(this.e, v9Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + n5.b(this.d, n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
