package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public static final wc0 d;
    public static final wc0 e;
    public static final /* synthetic */ wc0[] f;

    static {
        wc0 wc0Var = new wc0("Vertical", 0);
        d = wc0Var;
        wc0 wc0Var2 = new wc0("Horizontal", 1);
        e = wc0Var2;
        f = new wc0[]{wc0Var, wc0Var2};
    }

    public static wc0 valueOf(String str) {
        return (wc0) Enum.valueOf(wc0.class, str);
    }

    public static wc0[] values() {
        return (wc0[]) f.clone();
    }
}
