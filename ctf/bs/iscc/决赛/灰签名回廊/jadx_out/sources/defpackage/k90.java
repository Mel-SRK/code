package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class k90 {
    public final gb0 a;
    public final n90 b = new n90();
    public final LinkedHashSet c;

    public k90(gb0 gb0Var) {
        this.a = gb0Var;
        new LinkedHashSet();
        new LinkedHashSet();
        this.c = new LinkedHashSet();
    }

    public final void a(eb0 eb0Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(("Unsupported priority value: " + i).toString());
        }
        if (this.c.add(eb0Var)) {
            this.b.a(this, eb0Var, i);
        }
    }

    public final void b(m90 m90Var, j90 j90Var) {
        n90 n90Var = this.b;
        n90Var.getClass();
        if (n90Var.e != 0) {
            return;
        }
        n90Var.b();
        n90Var.e = -1;
        n90Var.f = m90Var;
        if (j90Var != null) {
            ps0 ps0Var = n90Var.a;
            p90 p90Var = new p90(j90Var);
            ps0Var.getClass();
            ps0Var.h(null, p90Var);
        }
    }
}
