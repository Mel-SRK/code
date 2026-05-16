package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wp implements Runnable {
    public final ArrayList d;
    public final int e;

    public wp(List list, int i, Throwable th) {
        e00.q(list, "initCallbacks cannot be null");
        this.d = new ArrayList(list);
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        if (this.e != 1) {
            while (i < size) {
                ((dl) arrayList.get(i)).b.e = e00.l;
                i++;
            }
            return;
        }
        while (i < size) {
            dl dlVar = (dl) arrayList.get(i);
            dlVar.a.setValue(Boolean.TRUE);
            dlVar.b.e = new fy(true);
            i++;
        }
    }
}
