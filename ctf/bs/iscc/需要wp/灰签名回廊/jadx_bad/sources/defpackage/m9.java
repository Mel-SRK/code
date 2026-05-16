package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m9 {
    public static final m9 d;
    public static final m9 e;
    public static final m9 f;
    public static final /* synthetic */ m9[] g;

    static {
        m9 m9Var = new m9("SUSPEND", 0);
        d = m9Var;
        m9 m9Var2 = new m9("DROP_OLDEST", 1);
        e = m9Var2;
        m9 m9Var3 = new m9("DROP_LATEST", 2);
        f = m9Var3;
        g = new m9[]{m9Var, m9Var2, m9Var3};
    }

    public static m9 valueOf(String str) {
        return (m9) Enum.valueOf(m9.class, str);
    }

    public static m9[] values() {
        return (m9[]) g.clone();
    }
}
