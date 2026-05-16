package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 {
    public static final ja0 d;
    public static final ja0 e;
    public static final /* synthetic */ ja0[] f;

    static {
        ja0 ja0Var = new ja0("Width", 0);
        d = ja0Var;
        ja0 ja0Var2 = new ja0("Height", 1);
        e = ja0Var2;
        f = new ja0[]{ja0Var, ja0Var2};
    }

    public static ja0 valueOf(String str) {
        return (ja0) Enum.valueOf(ja0.class, str);
    }

    public static ja0[] values() {
        return (ja0[]) f.clone();
    }
}
