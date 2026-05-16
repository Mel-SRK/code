package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 extends tc0 {
    public static final sb0 c = new sb0(0, 2, 1);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        int i = ((uz) tvVar.d(0)).a;
        List list = (List) tvVar.d(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            p6Var.b(i3, obj);
            p6Var.e(i3, obj);
        }
    }
}
