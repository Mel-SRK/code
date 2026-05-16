package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p00 {
    public static final p00 d;
    public static final p00 e;
    public static final p00 f;
    public static final p00 g;
    public static final /* synthetic */ p00[] h;

    static {
        p00 p00Var = new p00("IGNORED", 0);
        d = p00Var;
        p00 p00Var2 = new p00("SCHEDULED", 1);
        e = p00Var2;
        p00 p00Var3 = new p00("DEFERRED", 2);
        f = p00Var3;
        p00 p00Var4 = new p00("IMMINENT", 3);
        g = p00Var4;
        h = new p00[]{p00Var, p00Var2, p00Var3, p00Var4};
    }

    public static p00 valueOf(String str) {
        return (p00) Enum.valueOf(p00.class, str);
    }

    public static p00[] values() {
        return (p00[]) h.clone();
    }
}
