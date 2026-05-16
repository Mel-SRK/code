package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements rl0 {
    public final q80 a;
    public q80 b;

    public sl0(LinkedHashMap linkedHashMap) {
        q80 q80Var;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            q80Var = null;
        } else {
            q80Var = new q80(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                q80Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.a = q80Var;
    }

    @Override // defpackage.rl0
    public final boolean a(Object obj) {
        return d41.j(obj);
    }

    @Override // defpackage.rl0
    public final Object b(String str) {
        q80 q80Var = this.a;
        List list = q80Var != null ? (List) q80Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && q80Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = q80Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = q80Var.c;
            Object obj = objArr[iF];
            q80Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // defpackage.rl0
    public final o6 c(String str, t4 t4Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!az0.x(str.charAt(i))) {
                q80 q80Var = this.b;
                if (q80Var == null) {
                    long[] jArr = mm0.a;
                    q80Var = new q80();
                    this.b = q80Var;
                }
                Object objG = q80Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    q80Var.l(str, objG);
                }
                ((List) objG).add(t4Var);
                return new o6(q80Var, str, t4Var);
            }
        }
        wc.n("Registered key is empty or blank");
        return null;
    }
}
