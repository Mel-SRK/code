package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 {
    public static final rw0 d;
    public static final rw0 e;
    public static final rw0 f;
    public static final rw0 g;
    public static final /* synthetic */ rw0[] h;

    static {
        rw0 rw0Var = new rw0("StartInput", 0);
        d = rw0Var;
        rw0 rw0Var2 = new rw0("StopInput", 1);
        e = rw0Var2;
        rw0 rw0Var3 = new rw0("ShowKeyboard", 2);
        f = rw0Var3;
        rw0 rw0Var4 = new rw0("HideKeyboard", 3);
        g = rw0Var4;
        h = new rw0[]{rw0Var, rw0Var2, rw0Var3, rw0Var4};
    }

    public static rw0 valueOf(String str) {
        return (rw0) Enum.valueOf(rw0.class, str);
    }

    public static rw0[] values() {
        return (rw0[]) h.clone();
    }
}
