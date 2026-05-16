package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d6 {
    public static final b6 a = new b6("");

    public static final List a(b6 b6Var, int i, int i2, c6 c6Var) {
        List list;
        if (i == i2 || (list = b6Var.d) == null) {
            return null;
        }
        if (i != 0 || i2 < b6Var.e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a6 a6Var = (a6) list.get(i3);
                if ((c6Var != null ? ((Boolean) c6Var.g(a6Var.a)).booleanValue() : true) && b(i, i2, a6Var.b, a6Var.c)) {
                    arrayList.add(new a6(i60.t(a6Var.b, i, i2) - i, i60.t(a6Var.c, i, i2) - i, (x5) a6Var.a, a6Var.d));
                }
            }
            return arrayList;
        }
        if (c6Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) c6Var.g(((a6) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
