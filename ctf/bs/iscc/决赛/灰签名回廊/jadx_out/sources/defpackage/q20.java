package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q20 {
    public static final q20 d;
    public static final q20 e;
    public static final q20 f;
    public static final /* synthetic */ q20[] g;

    static {
        q20 q20Var = new q20("InMeasureBlock", 0);
        d = q20Var;
        q20 q20Var2 = new q20("InLayoutBlock", 1);
        e = q20Var2;
        q20 q20Var3 = new q20("NotUsed", 2);
        f = q20Var3;
        g = new q20[]{q20Var, q20Var2, q20Var3};
    }

    public static q20 valueOf(String str) {
        return (q20) Enum.valueOf(q20.class, str);
    }

    public static q20[] values() {
        return (q20[]) g.clone();
    }
}
