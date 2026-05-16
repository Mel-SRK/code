package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 {
    public i70 a;
    public int b;
    public a90 c;
    public a90 d;
    public boolean e;
    public final /* synthetic */ da0 f;

    public ba0(da0 da0Var, i70 i70Var, int i, a90 a90Var, a90 a90Var2, boolean z) {
        this.f = da0Var;
        this.a = i70Var;
        this.b = i;
        this.c = a90Var;
        this.d = a90Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        a90 a90Var = this.c;
        int i3 = this.b;
        h70 h70Var = (h70) a90Var.d[i + i3];
        h70 h70Var2 = (h70) this.d.d[i3 + i2];
        return f00.h(h70Var, h70Var2) || h70Var.getClass() == h70Var2.getClass();
    }
}
