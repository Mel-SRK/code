package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class px0 {
    public static final px0 d;
    public static final px0 e;
    public static final /* synthetic */ px0[] f;

    static {
        px0 px0Var = new px0("Shown", 0);
        d = px0Var;
        px0 px0Var2 = new px0("Hidden", 1);
        e = px0Var2;
        f = new px0[]{px0Var, px0Var2};
    }

    public static px0 valueOf(String str) {
        return (px0) Enum.valueOf(px0.class, str);
    }

    public static px0[] values() {
        return (px0[]) f.clone();
    }
}
