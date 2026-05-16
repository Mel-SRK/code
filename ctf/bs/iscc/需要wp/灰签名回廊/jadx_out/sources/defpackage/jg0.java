package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 {
    public static final jg0 d;
    public static final jg0 e;
    public static final jg0 f;
    public static final /* synthetic */ jg0[] g;

    static {
        jg0 jg0Var = new jg0("Initial", 0);
        d = jg0Var;
        jg0 jg0Var2 = new jg0("Main", 1);
        e = jg0Var2;
        jg0 jg0Var3 = new jg0("Final", 2);
        f = jg0Var3;
        g = new jg0[]{jg0Var, jg0Var2, jg0Var3};
    }

    public static jg0 valueOf(String str) {
        return (jg0) Enum.valueOf(jg0.class, str);
    }

    public static jg0[] values() {
        return (jg0[]) g.clone();
    }
}
