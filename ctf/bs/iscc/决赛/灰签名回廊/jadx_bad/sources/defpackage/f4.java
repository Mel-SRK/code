package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f4 implements p60 {
    public static final f4 b = new f4(0);
    public static final f4 c = new f4(1);
    public static final f4 d = new f4(2);
    public static final f4 e = new f4(3);
    public static final f4 f = new f4(4);
    public final /* synthetic */ int a;

    public /* synthetic */ f4(int i) {
        this.a = i;
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                sq sqVar = sq.d;
                if (size == 0) {
                    return r60Var.av(0, 0, sqVar, q0.n);
                }
                if (size == 1) {
                    lf0 lf0VarE = ((k60) list.get(0)).e(j);
                    return r60Var.av(lf0VarE.d, lf0VarE.e, sqVar, new d4(lf0VarE, 0));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    lf0 lf0VarE2 = ((k60) list.get(i)).e(j);
                    iMax = Math.max(iMax, lf0VarE2.d);
                    iMax2 = Math.max(iMax2, lf0VarE2.e);
                    arrayList.add(lf0VarE2);
                }
                return r60Var.av(iMax, iMax2, sqVar, new e4(0, arrayList));
            case 1:
                return r60Var.av(dh.j(j), dh.i(j), sq.d, q0.q);
            case 2:
                return r60Var.av(dh.h(j), dh.g(j), sq.d, q0.aa);
            case 3:
                ArrayList arrayList2 = new ArrayList(list.size());
                Integer numValueOf = 0;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    arrayList2.add(((k60) list.get(i2)).e(j));
                }
                int size4 = arrayList2.size();
                Integer numValueOf2 = numValueOf;
                for (int i3 = 0; i3 < size4; i3++) {
                    numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((lf0) arrayList2.get(i3)).d));
                }
                int iIntValue = numValueOf2.intValue();
                int size5 = arrayList2.size();
                for (int i4 = 0; i4 < size5; i4++) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((lf0) arrayList2.get(i4)).e));
                }
                return r60Var.av(iIntValue, numValueOf.intValue(), sq.d, new e4(2, arrayList2));
            default:
                return r60Var.av(dh.f(j) ? dh.h(j) : 0, dh.e(j) ? dh.g(j) : 0, sq.d, f50.ab);
        }
    }
}
