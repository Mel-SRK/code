package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dq0 {
    public final zk0 a;
    public final zk0 b;
    public final zk0 c;
    public final zk0 d;
    public final zk0 e;

    public dq0() {
        zk0 zk0Var = bq0.a;
        zk0 zk0Var2 = bq0.b;
        zk0 zk0Var3 = bq0.c;
        zk0 zk0Var4 = bq0.d;
        zk0 zk0Var5 = bq0.e;
        this.a = zk0Var;
        this.b = zk0Var2;
        this.c = zk0Var3;
        this.d = zk0Var4;
        this.e = zk0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        return f00.h(this.a, dq0Var.a) && f00.h(this.b, dq0Var.b) && f00.h(this.c, dq0Var.c) && f00.h(this.d, dq0Var.d) && f00.h(this.e, dq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
