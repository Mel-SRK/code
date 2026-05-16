package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 {
    public static final jq0 d;
    public static final jq0 e;
    public static final jq0 f;
    public static final /* synthetic */ jq0[] g;

    static {
        jq0 jq0Var = new jq0("START", 0);
        d = jq0Var;
        jq0 jq0Var2 = new jq0("STOP", 1);
        e = jq0Var2;
        jq0 jq0Var3 = new jq0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f = jq0Var3;
        g = new jq0[]{jq0Var, jq0Var2, jq0Var3};
    }

    public static jq0 valueOf(String str) {
        return (jq0) Enum.valueOf(jq0.class, str);
    }

    public static jq0[] values() {
        return (jq0[]) g.clone();
    }
}
