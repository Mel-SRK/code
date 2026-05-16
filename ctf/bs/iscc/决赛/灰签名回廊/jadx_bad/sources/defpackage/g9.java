package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g9 implements cv {
    public final /* synthetic */ f9 d;
    public final /* synthetic */ h9 e;
    public final /* synthetic */ vi0 f;

    public g9(f9 f9Var, h9 h9Var, vi0 vi0Var) {
        this.d = f9Var;
        this.e = h9Var;
        this.f = vi0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        int i;
        f9 f9Var = this.d;
        f9Var.a = null;
        f9Var.b = null;
        i7 i7Var = this.e.g;
        int i2 = this.f.d;
        do {
            i = i7Var.get();
        } while (!i7Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return wz0.a;
    }
}
