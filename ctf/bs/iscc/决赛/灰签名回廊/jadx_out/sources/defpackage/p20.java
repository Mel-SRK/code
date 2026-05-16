package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p20 {
    public static final p20 d;
    public static final p20 e;
    public static final p20 f;
    public static final p20 g;
    public static final p20 h;
    public static final /* synthetic */ p20[] i;

    static {
        p20 p20Var = new p20("Measuring", 0);
        d = p20Var;
        p20 p20Var2 = new p20("LookaheadMeasuring", 1);
        e = p20Var2;
        p20 p20Var3 = new p20("LayingOut", 2);
        f = p20Var3;
        p20 p20Var4 = new p20("LookaheadLayingOut", 3);
        g = p20Var4;
        p20 p20Var5 = new p20("Idle", 4);
        h = p20Var5;
        i = new p20[]{p20Var, p20Var2, p20Var3, p20Var4, p20Var5};
    }

    public static p20 valueOf(String str) {
        return (p20) Enum.valueOf(p20.class, str);
    }

    public static p20[] values() {
        return (p20[]) i.clone();
    }
}
