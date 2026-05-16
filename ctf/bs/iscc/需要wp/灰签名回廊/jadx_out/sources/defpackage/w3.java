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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.i30 r5, defpackage.ki r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.v3
            if (r0 == 0) goto L13
            r0 = r6
            v3 r0 = (defpackage.v3) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            v3 r0 = new v3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r5)
            return
        L27:
            defpackage.i60.az(r6)
            goto L4d
        L2b:
            defpackage.i60.az(r6)
            a2 r6 = new a2
            r1 = 2
            r6.<init>(r1, r5, r4)
            c r5 = new c
            r1 = 5
            r3 = 0
            r5.<init>(r4, r3, r1)
            r0.i = r2
            j3 r1 = new j3
            java.util.concurrent.atomic.AtomicReference r2 = r4.g
            r1.<init>(r6, r2, r5, r3)
            java.lang.Object r5 = defpackage.i60.y(r1, r0)
            yj r6 = defpackage.yj.d
            if (r5 != r6) goto L4d
            return
        L4d:
            xd r5 = new xd
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.a(i30, ki):void");
    }

    @Override // defpackage.xj
    public final pj f() {
        return this.f.f();
    }
}
