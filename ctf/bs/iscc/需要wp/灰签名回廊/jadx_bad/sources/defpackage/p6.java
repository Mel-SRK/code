package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface p6 {
    void b(int i, Object obj);

    void c(Object obj);

    void d();

    void e(int i, Object obj);

    void f(int i, int i2, int i3);

    Object g();

    void h(int i, int i2);

    default void j(gv gvVar, Object obj) {
        gvVar.f(g(), obj);
    }

    void m();
}
