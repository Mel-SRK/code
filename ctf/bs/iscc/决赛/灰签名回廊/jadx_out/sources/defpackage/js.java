package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class js extends tt0 implements gv {
    public /* synthetic */ int h;

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((js) k((ji) obj2, Integer.valueOf(((Number) obj).intValue()))).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        js jsVar = new js(2, jiVar);
        jsVar.h = ((Number) obj).intValue();
        return jsVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        i60.az(obj);
        return Boolean.valueOf(this.h > 0);
    }
}
