package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public wd0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            wc.n("Start padding must be non-negative");
            throw null;
        }
        if (f2 < 0.0f) {
            wc.n("Top padding must be non-negative");
            throw null;
        }
        if (f3 < 0.0f) {
            wc.n("End padding must be non-negative");
            throw null;
        }
        if (f4 >= 0.0f) {
            return;
        }
        wc.n("Bottom padding must be non-negative");
        throw null;
    }

    public final float a(e20 e20Var) {
        return e20Var == e20.d ? this.a : this.c;
    }

    public final float b(e20 e20Var) {
        return e20Var == e20.d ? this.c : this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return mn.a(this.a, wd0Var.a) && mn.a(this.b, wd0Var.b) && mn.a(this.c, wd0Var.c) && mn.a(this.d, wd0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) mn.b(this.a)) + ", top=" + ((Object) mn.b(this.b)) + ", end=" + ((Object) mn.b(this.c)) + ", bottom=" + ((Object) mn.b(this.d)) + ')';
    }
}
