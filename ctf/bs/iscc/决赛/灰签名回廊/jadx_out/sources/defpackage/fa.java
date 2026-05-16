package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa implements vs {
    public static final fa a = new fa();
    public static Boolean b;

    @Override // defpackage.vs
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw n5.f("canFocus is read before it is written");
    }

    @Override // defpackage.vs
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }
}
