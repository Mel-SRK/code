package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n30 {
    private static final /* synthetic */ yq $ENTRIES;
    private static final /* synthetic */ n30[] $VALUES;
    public static final l30 Companion;
    public static final n30 ON_ANY;
    public static final n30 ON_CREATE;
    public static final n30 ON_DESTROY;
    public static final n30 ON_PAUSE;
    public static final n30 ON_RESUME;
    public static final n30 ON_START;
    public static final n30 ON_STOP;

    static {
        n30 n30Var = new n30("ON_CREATE", 0);
        ON_CREATE = n30Var;
        n30 n30Var2 = new n30("ON_START", 1);
        ON_START = n30Var2;
        n30 n30Var3 = new n30("ON_RESUME", 2);
        ON_RESUME = n30Var3;
        n30 n30Var4 = new n30("ON_PAUSE", 3);
        ON_PAUSE = n30Var4;
        n30 n30Var5 = new n30("ON_STOP", 4);
        ON_STOP = n30Var5;
        n30 n30Var6 = new n30("ON_DESTROY", 5);
        ON_DESTROY = n30Var6;
        n30 n30Var7 = new n30("ON_ANY", 6);
        ON_ANY = n30Var7;
        n30[] n30VarArr = {n30Var, n30Var2, n30Var3, n30Var4, n30Var5, n30Var6, n30Var7};
        $VALUES = n30VarArr;
        $ENTRIES = new zq(n30VarArr);
        Companion = new l30();
    }

    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    public static n30[] values() {
        return (n30[]) $VALUES.clone();
    }

    public final o30 a() {
        switch (m30.a[ordinal()]) {
            case 1:
            case 2:
                return o30.f;
            case 3:
            case 4:
                return o30.g;
            case 5:
                return o30.h;
            case 6:
                return o30.d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                wc.l();
                return null;
        }
    }
}
