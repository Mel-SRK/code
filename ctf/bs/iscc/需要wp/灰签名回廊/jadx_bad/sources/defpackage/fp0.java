package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fp0 {
    public static final Comparator[] a;
    public static final dp0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new ep0(new ep0(i == 0 ? ht.e : ht.c));
            i++;
        }
        a = comparatorArr;
        b = dp0.f;
    }

    public static final void a(uo0 uo0Var, ArrayList arrayList, l1 l1Var, l1 l1Var2, e80 e80Var) {
        po0 po0Var = uo0Var.d;
        Object objG = po0Var.d.g(zo0.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) l1Var2.g(uo0Var)).booleanValue()) && ((Boolean) l1Var.g(uo0Var)).booleanValue()) {
            arrayList.add(uo0Var);
        }
        if (zBooleanValue) {
            e80Var.g(uo0Var.g, b(uo0Var, l1Var, l1Var2, uo0.j(7, uo0Var)));
            return;
        }
        List listJ = uo0.j(7, uo0Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((uo0) listJ.get(i), arrayList, l1Var, l1Var2, e80Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[EDGE_INSN: B:53:0x00d2->B:32:0x00d2 BREAK  A[LOOP:2: B:21:0x0069->B:31:0x00ce]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[LOOP:1: B:12:0x0046->B:34:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[EDGE_INSN: B:51:0x00f4->B:35:0x00f4 BREAK  A[LOOP:1: B:12:0x0046->B:34:0x00ef], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(uo0 uo0Var, l1 l1Var, l1 l1Var2, List list) {
        e80 e80Var = oz.a;
        e80 e80Var2 = new e80();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((uo0) list.get(i), arrayList, l1Var, l1Var2, e80Var2);
        }
        int i2 = 1;
        char c = uo0Var.c.aa == e20.e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                uo0 uo0Var2 = (uo0) arrayList.get(i3);
                if (i3 != 0) {
                    float f = uo0Var2.h().b;
                    float f2 = uo0Var2.h().d;
                    int i4 = f >= f2 ? i2 : 0;
                    int size3 = arrayList2.size() - i2;
                    if (size3 >= 0) {
                        int i5 = 0;
                        while (true) {
                            ri0 ri0Var = (ri0) ((ae0) arrayList2.get(i5)).d;
                            float f3 = ri0Var.b;
                            float f4 = ri0Var.d;
                            boolean z = f3 >= f4;
                            if (i4 == 0 && !z && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i5, new ae0(new ri0(Math.max(ri0Var.a, 0.0f), Math.max(ri0Var.b, f), Math.min(ri0Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((ae0) arrayList2.get(i5)).e));
                                ((List) ((ae0) arrayList2.get(i5)).e).add(uo0Var2);
                                break;
                            }
                            if (i5 == size3) {
                                break;
                            }
                            i5++;
                        }
                        arrayList2.add(new ae0(uo0Var2.h(), new ArrayList(new y6(new uo0[]{uo0Var2}, true))));
                        if (i3 != size2) {
                            break;
                        }
                        i3++;
                        i2 = 1;
                    } else {
                        arrayList2.add(new ae0(uo0Var2.h(), new ArrayList(new y6(new uo0[]{uo0Var2}, true))));
                        if (i3 != size2) {
                        }
                    }
                }
            }
        }
        oc.ao(arrayList2, ht.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            ae0 ae0Var = (ae0) arrayList2.get(i6);
            oc.ao((List) ae0Var.e, comparator);
            arrayList3.addAll((Collection) ae0Var.e);
        }
        oc.ao(arrayList3, new rd(1, b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) e80Var2.b(((uo0) arrayList3.get(size5)).g);
            if (list2 != null) {
                if (((Boolean) l1Var2.g(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
