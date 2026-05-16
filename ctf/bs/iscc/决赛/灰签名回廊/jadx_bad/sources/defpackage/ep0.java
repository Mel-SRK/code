package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 implements Comparator {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Comparator b;

    public ep0(ep0 ep0Var) {
        this.b = ep0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iCompare = this.b.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return s20.ar.compare(((uo0) obj).c, ((uo0) obj2).c);
            default:
                int iCompare2 = ((ep0) this.b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : az0.t(Integer.valueOf(((uo0) obj).g), Integer.valueOf(((uo0) obj2).g));
        }
    }

    public ep0(Comparator comparator) {
        this.b = comparator;
    }
}
