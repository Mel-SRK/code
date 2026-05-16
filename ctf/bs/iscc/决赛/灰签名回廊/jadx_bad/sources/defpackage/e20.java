package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e20 {
    public static final e20 d;
    public static final e20 e;
    public static final /* synthetic */ e20[] f;

    static {
        e20 e20Var = new e20("Ltr", 0);
        d = e20Var;
        e20 e20Var2 = new e20("Rtl", 1);
        e = e20Var2;
        f = new e20[]{e20Var, e20Var2};
    }

    public static e20 valueOf(String str) {
        return (e20) Enum.valueOf(e20.class, str);
    }

    public static e20[] values() {
        return (e20[]) f.clone();
    }
}
