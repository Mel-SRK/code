package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s60 {
    public static final s60 d;
    public static final s60 e;
    public static final /* synthetic */ s60[] f;

    static {
        s60 s60Var = new s60("Min", 0);
        d = s60Var;
        s60 s60Var2 = new s60("Max", 1);
        e = s60Var2;
        f = new s60[]{s60Var, s60Var2};
    }

    public static s60 valueOf(String str) {
        return (s60) Enum.valueOf(s60.class, str);
    }

    public static s60[] values() {
        return (s60[]) f.clone();
    }
}
