package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xw {
    public static final xw d;
    public static final xw e;
    public static final xw f;
    public static final /* synthetic */ xw[] g;

    static {
        xw xwVar = new xw("None", 0);
        d = xwVar;
        xw xwVar2 = new xw("Selection", 1);
        e = xwVar2;
        xw xwVar3 = new xw("Cursor", 2);
        f = xwVar3;
        g = new xw[]{xwVar, xwVar2, xwVar3};
    }

    public static xw valueOf(String str) {
        return (xw) Enum.valueOf(xw.class, str);
    }

    public static xw[] values() {
        return (xw[]) g.clone();
    }
}
