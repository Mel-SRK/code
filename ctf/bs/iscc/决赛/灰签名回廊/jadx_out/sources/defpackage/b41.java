package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class b41 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.a41 a(defpackage.k r6, defpackage.cg r7, defpackage.te r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.ew.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            o9 r0 = defpackage.i60.a(r2, r0, r3)
            au0 r2 = defpackage.z4.p
            java.lang.Object r2 = r2.getValue()
            pj r2 = (defpackage.pj) r2
            ii r2 = defpackage.i60.c(r2)
            w8 r4 = new w8
            r4.<init>(r0, r3)
            r5 = 3
            defpackage.i60.an(r2, r3, r4, r5)
            l1 r2 = new l1
            r4 = 13
            r2.<init>(r4, r0)
            java.lang.Object r0 = defpackage.fr0.c
            monitor-enter(r0)
            java.lang.Object r4 = defpackage.fr0.i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = defpackage.kc.ay(r4, r2)     // Catch: java.lang.Throwable -> L3c
            defpackage.fr0.i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            defpackage.fr0.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.b1
            if (r1 == 0) goto L50
            b1 r0 = (defpackage.b1) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            b1 r0 = new b1
            android.content.Context r1 = r6.getContext()
            pj r2 = r7.i()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = defpackage.b41.a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2131034203(0x7f05005b, float:1.7678917E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof defpackage.a41
            if (r2 == 0) goto L80
            r3 = r6
            a41 r3 = (defpackage.a41) r3
        L80:
            if (r3 != 0) goto La7
            a41 r3 = new a41
            o6 r6 = new o6
            s20 r2 = r0.getRoot()
            r6.<init>()
            r6.a = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.b = r4
            r6.c = r2
            jg r2 = new jg
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        La7:
            r3.f(r8)
            pj r6 = r0.getCoroutineContext()
            pj r8 = r7.i()
            boolean r6 = defpackage.f00.h(r6, r8)
            if (r6 != 0) goto Lbf
            pj r6 = r7.i()
            r0.setCoroutineContext(r6)
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.a(k, cg, te):a41");
    }
}
