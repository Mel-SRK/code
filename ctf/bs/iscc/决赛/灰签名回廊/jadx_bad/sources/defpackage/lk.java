package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lk {
    public static final lk d;
    public static final lk e;
    public static final lk f;
    public static final /* synthetic */ lk[] g;

    static {
        lk lkVar = new lk("None", 0);
        d = lkVar;
        lk lkVar2 = new lk("Cancelled", 1);
        e = lkVar2;
        lk lkVar3 = new lk("Redirected", 2);
        f = lkVar3;
        g = new lk[]{lkVar, lkVar2, lkVar3, new lk("RedirectCancelled", 3)};
    }

    public static lk valueOf(String str) {
        return (lk) Enum.valueOf(lk.class, str);
    }

    public static lk[] values() {
        return (lk[]) g.clone();
    }
}
