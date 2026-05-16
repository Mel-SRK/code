package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz0 {
    public f1 a;
    public f1 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lw0 lw0Var) {
        f1 f1Var;
        b6 b6Var = lw0Var.a;
        this.e = false;
        f1 f1Var2 = this.a;
        if (lw0Var.equals(f1Var2 != null ? (lw0) f1Var2.f : null)) {
            return;
        }
        String str = b6Var.e;
        f1 f1Var3 = this.a;
        boolean zH = f00.h(str, f1Var3 != null ? ((lw0) f1Var3.f).a.e : null);
        f1 f1Var4 = this.a;
        if (zH) {
            if (f1Var4 == null) {
                return;
            }
            f1Var4.f = lw0Var;
            return;
        }
        this.a = new f1(20, f1Var4, lw0Var);
        this.b = null;
        int length = b6Var.e.length() + this.c;
        this.c = length;
        if (length > 100000) {
            f1 f1Var5 = this.a;
            if ((f1Var5 != null ? (f1) f1Var5.e : null) == null) {
                return;
            }
            while (true) {
                if (f1Var5 == null) {
                    f1Var = null;
                } else {
                    f1 f1Var6 = (f1) f1Var5.e;
                    if (f1Var6 != null) {
                        f1Var = (f1) f1Var6.e;
                    }
                }
                if (f1Var == null) {
                    break;
                } else {
                    f1Var5 = (f1) f1Var5.e;
                }
            }
            if (f1Var5 == null) {
                return;
            }
            f1Var5.e = null;
        }
    }
}
