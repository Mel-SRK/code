package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class us0 implements ts0 {
    public final i7 d = new i7(0);

    public final boolean e(int i) {
        return (i & this.d.get()) != 0;
    }

    public final void f(int i) {
        i7 i7Var;
        int i2;
        do {
            i7Var = this.d;
            i2 = i7Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!i7Var.compareAndSet(i2, i2 | i));
    }
}
