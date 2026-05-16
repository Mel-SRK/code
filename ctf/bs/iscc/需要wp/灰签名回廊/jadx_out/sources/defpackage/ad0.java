package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends bd0 {
    public final yk0 a;
    public final t3 b;

    public ad0(yk0 yk0Var) {
        t3 t3VarA;
        this.a = yk0Var;
        if (d41.ac(yk0Var)) {
            t3VarA = null;
        } else {
            t3VarA = u3.a();
            t3.a(t3VarA, yk0Var);
        }
        this.b = t3VarA;
    }

    @Override // defpackage.bd0
    public final ri0 a() {
        yk0 yk0Var = this.a;
        return new ri0(yk0Var.a, yk0Var.b, yk0Var.c, yk0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad0) {
            return this.a.equals(((ad0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
