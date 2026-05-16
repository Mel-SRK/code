package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {
    public static final n50 d;
    public static final n50 e;
    public static final n50 f;
    public static final /* synthetic */ n50[] g;

    static {
        n50 n50Var = new n50("IsPlacedInLookahead", 0);
        d = n50Var;
        n50 n50Var2 = new n50("IsPlacedInApproach", 1);
        e = n50Var2;
        n50 n50Var3 = new n50("IsNotPlaced", 2);
        f = n50Var3;
        g = new n50[]{n50Var, n50Var2, n50Var3};
    }

    public static n50 valueOf(String str) {
        return (n50) Enum.valueOf(n50.class, str);
    }

    public static n50[] values() {
        return (n50[]) g.clone();
    }
}
