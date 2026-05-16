package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s21 {
    public final e31 a;
    public iz[] b;

    public s21() {
        this(new e31());
    }

    public final void a() {
        iz[] izVarArr = this.b;
        if (izVarArr != null) {
            iz izVarF = izVarArr[0];
            iz izVarF2 = izVarArr[1];
            e31 e31Var = this.a;
            if (izVarF2 == null) {
                izVarF2 = e31Var.a.f(2);
            }
            if (izVarF == null) {
                izVarF = e31Var.a.f(1);
            }
            f(iz.a(izVarF, izVarF2));
            iz izVar = this.b[wo0.j(16)];
            if (izVar != null) {
                e(izVar);
            }
            iz izVar2 = this.b[wo0.j(32)];
            if (izVar2 != null) {
                d(izVar2);
            }
            iz izVar3 = this.b[wo0.j(64)];
            if (izVar3 != null) {
                g(izVar3);
            }
        }
    }

    public abstract e31 b();

    public void c(int i, iz izVar) {
        if (this.b == null) {
            this.b = new iz[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[wo0.j(i2)] = izVar;
            }
        }
    }

    public abstract void f(iz izVar);

    public s21(e31 e31Var) {
        this.a = e31Var;
    }

    public void d(iz izVar) {
    }

    public void e(iz izVar) {
    }

    public void g(iz izVar) {
    }
}
