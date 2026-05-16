package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ka0 {
    public final a90 a = new a90(new aa0[16]);
    public final m80 b = new m80(10);

    public boolean a(e50 e50Var, d20 d20Var, f1 f1Var, boolean z) {
        a90 a90Var = this.a;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((aa0) objArr[i2]).a(e50Var, d20Var, f1Var, z) || z2;
        }
        return z2;
    }

    public void b(f1 f1Var) {
        a90 a90Var = this.a;
        int i = a90Var.f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((aa0) a90Var.d[i]).d.b == 0) {
                a90Var.j(i);
            }
        }
    }
}
