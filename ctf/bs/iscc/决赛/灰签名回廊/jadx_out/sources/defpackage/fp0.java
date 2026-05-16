package defpackage;

import java.util.ArrayList;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.uo0 r17, defpackage.l1 r18, defpackage.l1 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp0.b(uo0, l1, l1, java.util.List):java.util.ArrayList");
    }
}
