package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface h70 extends j70 {
    @Override // defpackage.j70
    default Object a(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.j70
    default boolean b(cv cvVar) {
        return ((Boolean) cvVar.g(this)).booleanValue();
    }
}
