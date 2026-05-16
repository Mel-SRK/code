package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface j70 {
    Object a(gv gvVar, Object obj);

    boolean b(cv cvVar);

    default j70 c(j70 j70Var) {
        return j70Var == g70.a ? this : new od(this, j70Var);
    }
}
