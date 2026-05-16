package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 {
    public static final ia0 d;
    public static final ia0 e;
    public static final /* synthetic */ ia0[] f;

    static {
        ia0 ia0Var = new ia0("Min", 0);
        d = ia0Var;
        ia0 ia0Var2 = new ia0("Max", 1);
        e = ia0Var2;
        f = new ia0[]{ia0Var, ia0Var2};
    }

    public static ia0 valueOf(String str) {
        return (ia0) Enum.valueOf(ia0.class, str);
    }

    public static ia0[] values() {
        return (ia0[]) f.clone();
    }
}
