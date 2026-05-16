package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w3 implements xj {
    public final View d;
    public final qw0 e;
    public final xj f;
    public final AtomicReference g = new AtomicReference(null);

    public w3(View view, qw0 qw0Var, xj xjVar) {
        this.d = view;
        this.e = qw0Var;
        this.f = xjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i30 i30Var, ki kiVar) {
        v3 v3Var;
        if (kiVar instanceof v3) {
            v3Var = (v3) kiVar;
            int i = v3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3Var.i = i - Integer.MIN_VALUE;
            } else {
                v3Var = new v3(this, kiVar);
            }
        }
        Object obj = v3Var.g;
        int i2 = v3Var.i;
        if (i2 == 0) {
            i60.az(obj);
            a2 a2Var = new a2(2, i30Var, this);
            c cVar = new c(this, null, 5);
            v3Var.i = 1;
            if (i60.y(new j3(a2Var, this.g, cVar, null), v3Var) == yj.d) {
                return;
            }
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            i60.az(obj);
        }
        throw new xd();
    }

    @Override // defpackage.xj
    public final pj f() {
        return this.f.f();
    }
}
