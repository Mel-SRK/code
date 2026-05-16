package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hz {
    public static final hz d;
    public static final hz e;
    public static final hz f;
    public static final /* synthetic */ hz[] g;

    static {
        hz hzVar = new hz("Focused", 0);
        d = hzVar;
        hz hzVar2 = new hz("UnfocusedEmpty", 1);
        e = hzVar2;
        hz hzVar3 = new hz("UnfocusedNotEmpty", 2);
        f = hzVar3;
        g = new hz[]{hzVar, hzVar2, hzVar3};
    }

    public static hz valueOf(String str) {
        return (hz) Enum.valueOf(hz.class, str);
    }

    public static hz[] values() {
        return (hz[]) g.clone();
    }
}
