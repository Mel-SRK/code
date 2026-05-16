package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p01 {
    public static final p01 d;
    public static final /* synthetic */ p01[] e;

    static {
        p01 p01Var = new p01("Lsq2", 0);
        d = p01Var;
        e = new p01[]{p01Var, new p01("Impulse", 1)};
    }

    public static p01 valueOf(String str) {
        return (p01) Enum.valueOf(p01.class, str);
    }

    public static p01[] values() {
        return (p01[]) e.clone();
    }
}
