package androidx.compose.foundation.gestures;

import defpackage.an0;
import defpackage.bn0;
import defpackage.cn0;
import defpackage.d;
import defpackage.g80;
import defpackage.i60;
import defpackage.j70;
import defpackage.jn0;
import defpackage.ki;
import defpackage.qd0;
import defpackage.rm;
import defpackage.rn0;
import defpackage.ui0;
import defpackage.wc;
import defpackage.wc0;
import defpackage.xa0;
import defpackage.yj;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final an0 a = new an0();
    public static final rm b = new rm(1);
    public static final bn0 c = new bn0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rn0 rn0Var, long j, ki kiVar) {
        cn0 cn0Var;
        ui0 ui0Var;
        rn0 rn0Var2;
        if (kiVar instanceof cn0) {
            cn0Var = (cn0) kiVar;
            int i = cn0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn0Var.j = i - Integer.MIN_VALUE;
            } else {
                cn0Var = new cn0(kiVar);
            }
        }
        Object obj = cn0Var.i;
        int i2 = cn0Var.j;
        if (i2 == 0) {
            i60.az(obj);
            ui0Var = new ui0();
            d dVar = new d(rn0Var, j, ui0Var, null, 1);
            cn0Var.g = rn0Var;
            cn0Var.h = ui0Var;
            cn0Var.j = 1;
            Object objE = rn0Var.e(1, dVar, cn0Var);
            yj yjVar = yj.d;
            if (objE == yjVar) {
                return yjVar;
            }
            rn0Var2 = rn0Var;
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ui0 ui0Var2 = cn0Var.h;
            rn0 rn0Var3 = cn0Var.g;
            i60.az(obj);
            ui0Var = ui0Var2;
            rn0Var2 = rn0Var3;
        }
        return new xa0(rn0Var2.g(ui0Var.d));
    }

    public static final j70 b(j70 j70Var, jn0 jn0Var, wc0 wc0Var, qd0 qd0Var, boolean z, boolean z2, g80 g80Var) {
        return j70Var.c(new ScrollableElement(g80Var, wc0Var, qd0Var, jn0Var, z, z2));
    }
}
