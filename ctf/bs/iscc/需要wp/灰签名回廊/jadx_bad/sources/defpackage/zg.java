package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zg {
    public static final e80 a;

    static {
        bk0 bk0Var = gd.e;
        int i = bk0Var.c;
        wg wgVar = new wg(bk0Var, bk0Var, 1);
        int i2 = bk0Var.c;
        cb0 cb0Var = gd.x;
        int i3 = (cb0Var.c << 6) | i2;
        yg ygVar = new yg(bk0Var, cb0Var, 0);
        int i4 = (i2 << 6) | cb0Var.c;
        yg ygVar2 = new yg(cb0Var, bk0Var, 0);
        e80 e80Var = oz.a;
        e80 e80Var2 = new e80();
        e80Var2.g(i | (i << 6), wgVar);
        e80Var2.g(i3, ygVar);
        e80Var2.g(i4, ygVar2);
        a = e80Var2;
    }
}
