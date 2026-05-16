package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z20 {
    public static final /* synthetic */ z20[] d = {new z20("SYNCHRONIZED", 0), new z20("PUBLICATION", 1), new z20("NONE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    z20 EF5;

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) d.clone();
    }
}
