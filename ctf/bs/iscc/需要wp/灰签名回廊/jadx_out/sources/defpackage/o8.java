package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends x10 implements cv {
    public final /* synthetic */ lf0[] e;
    public final /* synthetic */ List f;
    public final /* synthetic */ r60 g;
    public final /* synthetic */ vi0 h;
    public final /* synthetic */ vi0 i;
    public final /* synthetic */ p8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(lf0[] lf0VarArr, List list, r60 r60Var, vi0 vi0Var, vi0 vi0Var2, p8 p8Var) {
        super(1);
        this.e = lf0VarArr;
        this.f = list;
        this.g = r60Var;
        this.h = vi0Var;
        this.i = vi0Var2;
        this.j = p8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        kf0 kf0Var = (kf0) obj;
        lf0[] lf0VarArr = this.e;
        int length = lf0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            lf0 lf0Var = lf0VarArr[i];
            int i3 = i2 + 1;
            lf0Var.getClass();
            k60 k60Var = (k60) this.f.get(i2);
            e20 layoutDirection = this.g.getLayoutDirection();
            int i4 = this.h.d;
            int i5 = this.i.d;
            b8 b8Var = this.j.a;
            HashMap map = m8.a;
            k60Var.j();
            kf0.i(kf0Var, lf0Var, b8Var.a(e00.f(lf0Var.d, lf0Var.e), e00.f(i4, i5), layoutDirection));
            i++;
            i2 = i3;
        }
        return wz0.a;
    }
}
