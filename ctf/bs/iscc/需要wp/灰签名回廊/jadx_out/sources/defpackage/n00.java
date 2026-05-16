package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n00 {
    public static final n00 d;
    public static final n00 e;
    public static final n00 f;
    public static final n00 g;
    public static final /* synthetic */ n00[] h;

    static {
        n00 n00Var = new n00("LookaheadMeasurement", 0);
        d = n00Var;
        n00 n00Var2 = new n00("LookaheadPlacement", 1);
        e = n00Var2;
        n00 n00Var3 = new n00("Measurement", 2);
        f = n00Var3;
        n00 n00Var4 = new n00("Placement", 3);
        g = n00Var4;
        h = new n00[]{n00Var, n00Var2, n00Var3, n00Var4};
    }

    public static n00 valueOf(String str) {
        return (n00) Enum.valueOf(n00.class, str);
    }

    public static n00[] values() {
        return (n00[]) h.clone();
    }
}
