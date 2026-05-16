package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class by0 {
    public static final by0 d;
    public static final by0 e;
    public static final /* synthetic */ by0[] f;

    static {
        by0 by0Var = new by0("On", 0);
        d = by0Var;
        by0 by0Var2 = new by0("Off", 1);
        e = by0Var2;
        f = new by0[]{by0Var, by0Var2, new by0("Indeterminate", 2)};
    }

    public static by0 valueOf(String str) {
        return (by0) Enum.valueOf(by0.class, str);
    }

    public static by0[] values() {
        return (by0[]) f.clone();
    }
}
