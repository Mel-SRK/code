package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 {
    public static final oj0 d;
    public static final oj0 e;
    public static final /* synthetic */ oj0[] f;

    static {
        oj0 oj0Var = new oj0("Ltr", 0);
        d = oj0Var;
        oj0 oj0Var2 = new oj0("Rtl", 1);
        e = oj0Var2;
        f = new oj0[]{oj0Var, oj0Var2};
    }

    public static oj0 valueOf(String str) {
        return (oj0) Enum.valueOf(oj0.class, str);
    }

    public static oj0[] values() {
        return (oj0[]) f.clone();
    }
}
