package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements nr {
    public final int a;
    public final int b;
    public final ep c;

    public yy0(int i, int i2, ep epVar) {
        this.a = i;
        this.b = i2;
        this.c = epVar;
    }

    @Override // defpackage.q5
    public final l01 a(zy0 zy0Var) {
        return new ya0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return yy0Var.a == this.a && yy0Var.b == this.b && f00.h(yy0Var.c, this.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}
