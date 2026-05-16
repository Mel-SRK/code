package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yj {
    public static final yj d;
    public static final yj e;
    public static final yj f;
    public static final /* synthetic */ yj[] g;

    static {
        yj yjVar = new yj("COROUTINE_SUSPENDED", 0);
        d = yjVar;
        yj yjVar2 = new yj("UNDECIDED", 1);
        e = yjVar2;
        yj yjVar3 = new yj("RESUMED", 2);
        f = yjVar3;
        g = new yj[]{yjVar, yjVar2, yjVar3};
    }

    public static yj valueOf(String str) {
        return (yj) Enum.valueOf(yj.class, str);
    }

    public static yj[] values() {
        return (yj[]) g.clone();
    }
}
