package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 {
    public static final kw0 d;
    public static final /* synthetic */ kw0[] e;

    /* JADX INFO: Fake field, exist only in values array */
    kw0 EF0;

    static {
        kw0 kw0Var = new kw0("Filled", 0);
        kw0 kw0Var2 = new kw0("Outlined", 1);
        d = kw0Var2;
        e = new kw0[]{kw0Var, kw0Var2};
    }

    public static kw0 valueOf(String str) {
        return (kw0) Enum.valueOf(kw0.class, str);
    }

    public static kw0[] values() {
        return (kw0[]) e.clone();
    }
}
