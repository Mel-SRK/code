package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pp0 extends qp0 {
    public static List r(np0 np0Var) {
        Iterator it = np0Var.iterator();
        if (!it.hasNext()) {
            return rq.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return f00.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
