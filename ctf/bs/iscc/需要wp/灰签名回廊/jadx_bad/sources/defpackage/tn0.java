package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 {
    public static final tn0 d;
    public static final tn0 e;
    public static final /* synthetic */ tn0[] f;

    static {
        tn0 tn0Var = new tn0("Inherit", 0);
        d = tn0Var;
        tn0 tn0Var2 = new tn0("SecureOn", 1);
        e = tn0Var2;
        f = new tn0[]{tn0Var, tn0Var2, new tn0("SecureOff", 2)};
    }

    public static tn0 valueOf(String str) {
        return (tn0) Enum.valueOf(tn0.class, str);
    }

    public static tn0[] values() {
        return (tn0[]) f.clone();
    }
}
