package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t60 {
    public static final t60 d;
    public static final t60 e;
    public static final /* synthetic */ t60[] f;

    static {
        t60 t60Var = new t60("Width", 0);
        d = t60Var;
        t60 t60Var2 = new t60("Height", 1);
        e = t60Var2;
        f = new t60[]{t60Var, t60Var2};
    }

    public static t60 valueOf(String str) {
        return (t60) Enum.valueOf(t60.class, str);
    }

    public static t60[] values() {
        return (t60[]) f.clone();
    }
}
