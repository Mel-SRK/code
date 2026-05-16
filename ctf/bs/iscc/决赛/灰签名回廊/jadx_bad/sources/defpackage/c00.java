package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c00 {
    public static final c00 d;
    public static final c00 e;
    public static final /* synthetic */ c00[] f;

    static {
        c00 c00Var = new c00("Width", 0);
        d = c00Var;
        c00 c00Var2 = new c00("Height", 1);
        e = c00Var2;
        f = new c00[]{c00Var, c00Var2};
    }

    public static c00 valueOf(String str) {
        return (c00) Enum.valueOf(c00.class, str);
    }

    public static c00[] values() {
        return (c00[]) f.clone();
    }
}
