package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface l01 {
    boolean a();

    w5 i(long j, w5 w5Var, w5 w5Var2, w5 w5Var3);

    w5 k(long j, w5 w5Var, w5 w5Var2, w5 w5Var3);

    default w5 l(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return i(n(w5Var, w5Var2, w5Var3), w5Var, w5Var2, w5Var3);
    }

    long n(w5 w5Var, w5 w5Var2, w5 w5Var3);
}
