package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                for (cv cvVar : (cv[]) this.b) {
                    int iT = az0.t((Comparable) cvVar.g(obj), (Comparable) cvVar.g(obj2));
                    if (iT != 0) {
                        return iT;
                    }
                }
                return 0;
            default:
                return ((Number) ((gv) this.b).f(obj, obj2)).intValue();
        }
    }
}
