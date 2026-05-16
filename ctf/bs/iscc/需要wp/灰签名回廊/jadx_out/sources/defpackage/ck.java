package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ck {
    public static final ck d;
    public static final ck e;
    public static final ck f;
    public static final ck g;
    public static final /* synthetic */ ck[] h;

    static {
        ck ckVar = new ck("DEFAULT", 0);
        d = ckVar;
        ck ckVar2 = new ck("LAZY", 1);
        e = ckVar2;
        ck ckVar3 = new ck("ATOMIC", 2);
        f = ckVar3;
        ck ckVar4 = new ck("UNDISPATCHED", 3);
        g = ckVar4;
        h = new ck[]{ckVar, ckVar2, ckVar3, ckVar4};
    }

    public static ck valueOf(String str) {
        return (ck) Enum.valueOf(ck.class, str);
    }

    public static ck[] values() {
        return (ck[]) h.clone();
    }
}
