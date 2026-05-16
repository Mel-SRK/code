package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class et {
    public static final et d;
    public static final et e;
    public static final et f;
    public static final et g;
    public static final /* synthetic */ et[] h;

    static {
        et etVar = new et("Active", 0);
        d = etVar;
        et etVar2 = new et("ActiveParent", 1);
        e = etVar2;
        et etVar3 = new et("Captured", 2);
        f = etVar3;
        et etVar4 = new et("Inactive", 3);
        g = etVar4;
        h = new et[]{etVar, etVar2, etVar3, etVar4};
    }

    public static et valueOf(String str) {
        return (et) Enum.valueOf(et.class, str);
    }

    public static et[] values() {
        return (et[]) h.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                wc.l();
                return false;
            }
        }
        return true;
    }
}
