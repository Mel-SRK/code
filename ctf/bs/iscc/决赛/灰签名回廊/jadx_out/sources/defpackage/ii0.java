package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 {
    public static final ii0 d;
    public static final ii0 e;
    public static final ii0 f;
    public static final ii0 g;
    public static final ii0 h;
    public static final ii0 i;
    public static final /* synthetic */ ii0[] j;

    static {
        ii0 ii0Var = new ii0("ShutDown", 0);
        d = ii0Var;
        ii0 ii0Var2 = new ii0("ShuttingDown", 1);
        e = ii0Var2;
        ii0 ii0Var3 = new ii0("Inactive", 2);
        f = ii0Var3;
        ii0 ii0Var4 = new ii0("InactivePendingWork", 3);
        g = ii0Var4;
        ii0 ii0Var5 = new ii0("Idle", 4);
        h = ii0Var5;
        ii0 ii0Var6 = new ii0("PendingWork", 5);
        i = ii0Var6;
        j = new ii0[]{ii0Var, ii0Var2, ii0Var3, ii0Var4, ii0Var5, ii0Var6};
    }

    public static ii0 valueOf(String str) {
        return (ii0) Enum.valueOf(ii0.class, str);
    }

    public static ii0[] values() {
        return (ii0[]) j.clone();
    }
}
