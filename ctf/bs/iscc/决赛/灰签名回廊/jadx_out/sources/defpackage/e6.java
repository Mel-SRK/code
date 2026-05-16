package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e6 {
    public static final e6 d;
    public static final e6 e;
    public static final e6 f;
    public static final e6 g;
    public static final e6 h;
    public static final e6 i;
    public static final e6 j;
    public static final /* synthetic */ e6[] k;

    static {
        e6 e6Var = new e6("Paragraph", 0);
        d = e6Var;
        e6 e6Var2 = new e6("Span", 1);
        e = e6Var2;
        e6 e6Var3 = new e6("VerbatimTts", 2);
        f = e6Var3;
        e6 e6Var4 = new e6("Url", 3);
        g = e6Var4;
        e6 e6Var5 = new e6("Link", 4);
        h = e6Var5;
        e6 e6Var6 = new e6("Clickable", 5);
        i = e6Var6;
        e6 e6Var7 = new e6("String", 6);
        j = e6Var7;
        k = new e6[]{e6Var, e6Var2, e6Var3, e6Var4, e6Var5, e6Var6, e6Var7};
    }

    public static e6 valueOf(String str) {
        return (e6) Enum.valueOf(e6.class, str);
    }

    public static e6[] values() {
        return (e6[]) k.clone();
    }
}
