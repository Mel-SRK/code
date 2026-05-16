package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class di0 {
    public final ArrayList a = new ArrayList();

    public di0(Object obj) {
    }

    public final boolean a(uw uwVar, Object obj) {
        ArrayList arrayList = uwVar.a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof Il) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof uw)) {
                    wc.f(obj2, "Unexpected child source info ");
                    return false;
                }
                if (a((uw) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(uw uwVar, Object obj) {
    }
}
