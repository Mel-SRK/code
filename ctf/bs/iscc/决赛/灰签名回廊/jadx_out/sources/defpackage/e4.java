package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(int i, ArrayList arrayList) {
        super(1);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                kf0 kf0Var = (kf0) obj;
                ArrayList arrayList = this.f;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        kf0.j(kf0Var, (lf0) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                break;
            case 1:
                kf0 kf0Var2 = (kf0) obj;
                ArrayList arrayList2 = this.f;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    kf0.l(kf0Var2, (lf0) arrayList2.get(i2), 0, 0);
                }
                break;
            default:
                kf0 kf0Var3 = (kf0) obj;
                ArrayList arrayList3 = this.f;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    kf0.h(kf0Var3, (lf0) arrayList3.get(i3), 0, 0);
                }
                break;
        }
        return wz0.a;
    }
}
