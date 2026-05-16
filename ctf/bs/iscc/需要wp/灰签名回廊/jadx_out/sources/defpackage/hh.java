package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hh {
    public static final hh d;
    public static final hh e;
    public static final /* synthetic */ hh[] f;

    static {
        hh hhVar = new hh("VIEW_APPEAR", 0);
        d = hhVar;
        hh hhVar2 = new hh("VIEW_DISAPPEAR", 1);
        e = hhVar2;
        f = new hh[]{hhVar, hhVar2};
    }

    public static hh valueOf(String str) {
        return (hh) Enum.valueOf(hh.class, str);
    }

    public static hh[] values() {
        return (hh[]) f.clone();
    }
}
