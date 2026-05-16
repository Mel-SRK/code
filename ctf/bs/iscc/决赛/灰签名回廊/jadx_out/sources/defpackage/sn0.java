package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 {
    public static final sn0 d;
    public static final sn0 e;
    public static final sn0 f;
    public static final /* synthetic */ sn0[] g;

    static {
        sn0 sn0Var = new sn0("VALID_URI", 0);
        d = sn0Var;
        sn0 sn0Var2 = new sn0("INVALID_URI", 1);
        e = sn0Var2;
        sn0 sn0Var3 = new sn0("DIRECT_LAUNCH", 2);
        f = sn0Var3;
        g = new sn0[]{sn0Var, sn0Var2, sn0Var3};
    }

    public static sn0 valueOf(String str) {
        return (sn0) Enum.valueOf(sn0.class, str);
    }

    public static sn0[] values() {
        return (sn0[]) g.clone();
    }
}
