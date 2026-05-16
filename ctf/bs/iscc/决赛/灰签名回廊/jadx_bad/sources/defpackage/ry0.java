package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 {
    public static final ry0 d;
    public static final ry0 e;
    public static final ry0 f;
    public static final /* synthetic */ ry0[] g;

    static {
        ry0 ry0Var = new ry0("ContinueTraversal", 0);
        d = ry0Var;
        ry0 ry0Var2 = new ry0("SkipSubtreeAndContinueTraversal", 1);
        e = ry0Var2;
        ry0 ry0Var3 = new ry0("CancelTraversal", 2);
        f = ry0Var3;
        g = new ry0[]{ry0Var, ry0Var2, ry0Var3};
    }

    public static ry0 valueOf(String str) {
        return (ry0) Enum.valueOf(ry0.class, str);
    }

    public static ry0[] values() {
        return (ry0[]) g.clone();
    }
}
