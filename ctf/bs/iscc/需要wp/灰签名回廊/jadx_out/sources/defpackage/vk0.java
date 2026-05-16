package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vk0 implements p60 {
    public static final vk0 b = new vk0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ vk0(int i) {
        this.a = i;
    }

    @Override // defpackage.p60
    public final int b(a00 a00Var, List list, int i) {
        throw new IllegalStateException("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.p60
    public final int d(a00 a00Var, List list, int i) {
        throw new IllegalStateException("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                sq sqVar = sq.d;
                if (size == 0) {
                    return r60Var.av(dh.j(j), dh.i(j), sqVar, f50.u);
                }
                if (size == 1) {
                    lf0 lf0VarE = ((k60) list.get(0)).e(j);
                    return r60Var.av(eh.g(j, lf0VarE.d), eh.f(j, lf0VarE.e), sqVar, new d4(lf0VarE, 3));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    lf0 lf0VarE2 = ((k60) list.get(i)).e(j);
                    iMax = Math.max(lf0VarE2.d, iMax);
                    iMax2 = Math.max(lf0VarE2.e, iMax2);
                    arrayList.add(lf0VarE2);
                }
                return r60Var.av(eh.g(j, iMax), eh.f(j, iMax2), sqVar, new e4(1, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    @Override // defpackage.p60
    public final int h(a00 a00Var, List list, int i) {
        throw new IllegalStateException("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.p60
    public final int j(a00 a00Var, List list, int i) {
        throw new IllegalStateException("Undefined intrinsics block and it is required");
    }
}
