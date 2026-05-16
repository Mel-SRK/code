package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public static final e2 d;
    public static final e2 e;
    public static final /* synthetic */ e2[] f;

    static {
        e2 e2Var = new e2("SHOW_ORIGINAL", 0);
        d = e2Var;
        e2 e2Var2 = new e2("SHOW_TRANSLATED", 1);
        e = e2Var2;
        f = new e2[]{e2Var, e2Var2};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) f.clone();
    }
}
