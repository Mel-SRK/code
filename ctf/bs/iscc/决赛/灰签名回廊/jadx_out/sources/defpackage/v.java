package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements cv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ v(int i, Collection collection) {
        this.d = i;
        this.e = collection;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        boolean zContains;
        switch (this.d) {
            case 0:
                zContains = this.e.contains(obj);
                break;
            case 1:
                zContains = this.e.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.e);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
