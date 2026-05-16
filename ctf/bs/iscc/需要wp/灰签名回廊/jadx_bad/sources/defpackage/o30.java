package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o30 {
    public static final o30 d;
    public static final o30 e;
    public static final o30 f;
    public static final o30 g;
    public static final o30 h;
    public static final /* synthetic */ o30[] i;

    static {
        o30 o30Var = new o30("DESTROYED", 0);
        d = o30Var;
        o30 o30Var2 = new o30("INITIALIZED", 1);
        e = o30Var2;
        o30 o30Var3 = new o30("CREATED", 2);
        f = o30Var3;
        o30 o30Var4 = new o30("STARTED", 3);
        g = o30Var4;
        o30 o30Var5 = new o30("RESUMED", 4);
        h = o30Var5;
        i = new o30[]{o30Var, o30Var2, o30Var3, o30Var4, o30Var5};
    }

    public static o30 valueOf(String str) {
        return (o30) Enum.valueOf(o30.class, str);
    }

    public static o30[] values() {
        return (o30[]) i.clone();
    }
}
