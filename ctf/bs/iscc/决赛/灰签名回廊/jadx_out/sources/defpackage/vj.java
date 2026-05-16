package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vj {
    public static final vj d;
    public static final vj e;
    public static final vj f;
    public static final vj g;
    public static final vj h;
    public static final /* synthetic */ vj[] i;

    static {
        vj vjVar = new vj("CPU_ACQUIRED", 0);
        d = vjVar;
        vj vjVar2 = new vj("BLOCKING", 1);
        e = vjVar2;
        vj vjVar3 = new vj("PARKING", 2);
        f = vjVar3;
        vj vjVar4 = new vj("DORMANT", 3);
        g = vjVar4;
        vj vjVar5 = new vj("TERMINATED", 4);
        h = vjVar5;
        i = new vj[]{vjVar, vjVar2, vjVar3, vjVar4, vjVar5};
    }

    public static vj valueOf(String str) {
        return (vj) Enum.valueOf(vj.class, str);
    }

    public static vj[] values() {
        return (vj[]) i.clone();
    }
}
