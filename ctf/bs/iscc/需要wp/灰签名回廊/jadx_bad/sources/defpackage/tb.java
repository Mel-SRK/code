package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public tb(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            n30 n30Var = (n30) entry.getValue();
            List arrayList = (List) this.a.get(n30Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(n30Var, arrayList);
            }
            arrayList.add((ub) entry.getKey());
        }
    }

    public static void a(List list, u30 u30Var, n30 n30Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ub ubVar = (ub) list.get(size);
                Method method = ubVar.b;
                try {
                    int i = ubVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, u30Var);
                    } else if (i == 2) {
                        method.invoke(obj, u30Var, n30Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
