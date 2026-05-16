package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt implements qt {
    public final n31 a;
    public final z2 b;
    public final f1 c;
    public final vt d;
    public final bu e;

    public rt(n31 n31Var, z2 z2Var) {
        f1 f1Var = st.a;
        f1 f1Var2 = st.a;
        vt vtVar = new vt();
        ut utVar = vt.a;
        cx cxVar = vm.a;
        utVar.getClass();
        i60.c(pk.an(utVar, cxVar).j(pq.d).j(new lt0(null)));
        bu buVar = new bu(13);
        this.a = n31Var;
        this.b = z2Var;
        this.c = f1Var;
        this.d = vtVar;
        this.e = buVar;
        new h(3, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: Exception -> 0x00a8, TRY_ENTER, TryCatch #1 {Exception -> 0x00a8, blocks: (B:25:0x0042, B:27:0x0055, B:30:0x005a, B:32:0x005e, B:38:0x0077, B:55:0x00a0, B:56:0x00a7, B:34:0x0067, B:35:0x0069, B:36:0x006c, B:37:0x0072), top: B:64:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nz0 a(defpackage.mz0 r7) {
        /*
            r6 = this;
            f1 r0 = r6.c
            java.lang.Object r1 = r0.e
            yf0 r1 = (defpackage.yf0) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f     // Catch: java.lang.Throwable -> L3c
            r50 r2 = (defpackage.r50) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L3c
            nz0 r2 = (defpackage.nz0) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L41
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f     // Catch: java.lang.Throwable -> L3c
            r50 r2 = (defpackage.r50) r2     // Catch: java.lang.Throwable -> L3c
            n31 r3 = r2.c     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            bu r4 = r2.b     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            int r5 = r2.d     // Catch: java.lang.Throwable -> L36
            int r5 = r5 + (-1)
            r2.d = r5     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r7 = move-exception
            goto L3f
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            nz0 r4 = (defpackage.nz0) r4     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r7 = move-exception
            goto Lb1
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r7     // Catch: java.lang.Throwable -> L3c
        L41:
            monitor-exit(r1)
            vt r1 = r6.d     // Catch: java.lang.Exception -> La8
            r1.getClass()     // Catch: java.lang.Exception -> La8
            fu0 r1 = r7.a     // Catch: java.lang.Exception -> La8
            bu r2 = r6.e     // Catch: java.lang.Exception -> La8
            java.lang.Object r2 = r2.e     // Catch: java.lang.Exception -> La8
            yf0 r2 = (defpackage.yf0) r2     // Catch: java.lang.Exception -> La8
            int r3 = r7.c     // Catch: java.lang.Exception -> La8
            iu r4 = r7.b     // Catch: java.lang.Exception -> La8
            if (r1 == 0) goto L67
            boolean r5 = r1 instanceof defpackage.yk     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L5a
            goto L67
        L5a:
            boolean r5 = r1 instanceof defpackage.wv     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L65
            wv r1 = (defpackage.wv) r1     // Catch: java.lang.Exception -> La8
            android.graphics.Typeface r1 = r2.f(r1, r4, r3)     // Catch: java.lang.Exception -> La8
            goto L77
        L65:
            r1 = 0
            goto L7d
        L67:
            int r1 = r2.d     // Catch: java.lang.Exception -> La8
            switch(r1) {
                case 1: goto L72;
                default: goto L6c;
            }     // Catch: java.lang.Exception -> La8
        L6c:
            r1 = 0
            android.graphics.Typeface r1 = defpackage.yf0.e(r1, r4, r3)     // Catch: java.lang.Exception -> La8
            goto L77
        L72:
            r1 = 0
            android.graphics.Typeface r1 = defpackage.yf0.c(r1, r4, r3)     // Catch: java.lang.Exception -> La8
        L77:
            nz0 r2 = new nz0     // Catch: java.lang.Exception -> La8
            r2.<init>(r1)     // Catch: java.lang.Exception -> La8
            r1 = r2
        L7d:
            if (r1 == 0) goto La0
            java.lang.Object r2 = r0.e
            yf0 r2 = (defpackage.yf0) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f     // Catch: java.lang.Throwable -> L9a
            r50 r3 = (defpackage.r50) r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r3.a(r7)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L9c
            boolean r3 = r1.e     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L9c
            java.lang.Object r0 = r0.f     // Catch: java.lang.Throwable -> L9a
            r50 r0 = (defpackage.r50) r0     // Catch: java.lang.Throwable -> L9a
            r0.b(r7, r1)     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L9a:
            r7 = move-exception
            goto L9e
        L9c:
            monitor-exit(r2)
            return r1
        L9e:
            monitor-exit(r2)
            throw r7
        La0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> La8
            throw r7     // Catch: java.lang.Exception -> La8
        La8:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        Lb1:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt.a(mz0):nz0");
    }

    public final nz0 b(fu0 fu0Var, iu iuVar, int i, int i2) {
        z2 z2Var = this.b;
        z2Var.getClass();
        int i3 = z2Var.d;
        iu iuVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? iuVar : new iu(i60.t(iuVar.d + i3, 1, 1000));
        this.a.getClass();
        return a(new mz0(fu0Var, iuVar2, i, i2, null));
    }
}
