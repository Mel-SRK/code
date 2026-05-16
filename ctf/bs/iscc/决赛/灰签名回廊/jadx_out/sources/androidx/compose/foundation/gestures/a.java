package androidx.compose.foundation.gestures;

import defpackage.an0;
import defpackage.bn0;
import defpackage.g80;
import defpackage.j70;
import defpackage.jn0;
import defpackage.qd0;
import defpackage.rm;
import defpackage.wc0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final an0 a = new an0();
    public static final rm b = new rm(1);
    public static final bn0 c = new bn0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.rn0 r10, long r11, defpackage.ki r13) {
        /*
            boolean r0 = r13 instanceof defpackage.cn0
            if (r0 == 0) goto L13
            r0 = r13
            cn0 r0 = (defpackage.cn0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            cn0 r0 = new cn0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ui0 r10 = r0.h
            rn0 r11 = r0.g
            defpackage.i60.az(r13)
            r7 = r10
            r10 = r11
            goto L53
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r10)
            r10 = 0
            return r10
        L32:
            defpackage.i60.az(r13)
            ui0 r7 = new ui0
            r7.<init>()
            d r3 = new d
            r8 = 0
            r9 = 1
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.g = r4
            r0.h = r7
            r0.j = r2
            java.lang.Object r10 = r4.e(r2, r3, r0)
            yj r11 = defpackage.yj.d
            if (r10 != r11) goto L52
            return r11
        L52:
            r10 = r4
        L53:
            float r11 = r7.d
            long r10 = r10.g(r11)
            xa0 r12 = new xa0
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(rn0, long, ki):java.lang.Object");
    }

    public static final j70 b(j70 j70Var, jn0 jn0Var, wc0 wc0Var, qd0 qd0Var, boolean z, boolean z2, g80 g80Var) {
        return j70Var.c(new ScrollableElement(g80Var, wc0Var, qd0Var, jn0Var, z, z2));
    }
}
