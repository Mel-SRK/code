package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x b;
    public static final x c;
    public final Throwable a;

    static {
        if (ad.g) {
            c = null;
            b = null;
        } else {
            c = new x(null, false);
            b = new x(null, true);
        }
    }

    public x(Throwable th, boolean z) {
        this.a = th;
    }
}
