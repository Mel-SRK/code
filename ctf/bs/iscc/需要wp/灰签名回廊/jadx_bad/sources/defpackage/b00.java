package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b00 {
    public static final b00 d;
    public static final b00 e;
    public static final /* synthetic */ b00[] f;

    static {
        b00 b00Var = new b00("Min", 0);
        d = b00Var;
        b00 b00Var2 = new b00("Max", 1);
        e = b00Var2;
        f = new b00[]{b00Var, b00Var2};
    }

    public static b00 valueOf(String str) {
        return (b00) Enum.valueOf(b00.class, str);
    }

    public static b00[] values() {
        return (b00[]) f.clone();
    }
}
