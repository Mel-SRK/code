package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz extends rv implements gv {
    public static final bz l = new bz(2, i60.class, "min", "min(II)I", 1);

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
