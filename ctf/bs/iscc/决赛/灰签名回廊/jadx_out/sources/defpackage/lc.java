package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc extends f00 {
    public static int an(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
