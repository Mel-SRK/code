package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vw {
    public static final vw d;
    public static final vw e;
    public static final vw f;
    public static final /* synthetic */ vw[] g;

    static {
        vw vwVar = new vw("Cursor", 0);
        d = vwVar;
        vw vwVar2 = new vw("SelectionStart", 1);
        e = vwVar2;
        vw vwVar3 = new vw("SelectionEnd", 2);
        f = vwVar3;
        g = new vw[]{vwVar, vwVar2, vwVar3};
    }

    public static vw valueOf(String str) {
        return (vw) Enum.valueOf(vw.class, str);
    }

    public static vw[] values() {
        return (vw[]) g.clone();
    }
}
