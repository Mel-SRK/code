package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface p60 {
    default int b(a00 a00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new el((k60) list.get(i2), b00.e, c00.e, 0));
        }
        return g(new l00(a00Var, a00Var.getLayoutDirection()), arrayList, eh.b(i, 0, 13)).c();
    }

    default int d(a00 a00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new el((k60) list.get(i2), b00.e, c00.d, 0));
        }
        return g(new l00(a00Var, a00Var.getLayoutDirection()), arrayList, eh.b(0, i, 7)).e();
    }

    q60 g(r60 r60Var, List list, long j);

    default int h(a00 a00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new el((k60) list.get(i2), b00.d, c00.e, 0));
        }
        return g(new l00(a00Var, a00Var.getLayoutDirection()), arrayList, eh.b(i, 0, 13)).c();
    }

    default int j(a00 a00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new el((k60) list.get(i2), b00.d, c00.d, 0));
        }
        return g(new l00(a00Var, a00Var.getLayoutDirection()), arrayList, eh.b(0, i, 7)).e();
    }
}
