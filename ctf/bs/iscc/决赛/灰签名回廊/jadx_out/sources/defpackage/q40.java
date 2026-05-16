package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q40 {
    public static final ai0 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof defpackage.ai0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (defpackage.ai0) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<u30> r1 = defpackage.u30.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            boolean r5 = r5 instanceof defpackage.hm     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L3c
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            r1 = move-exception
            goto L36
        L2b:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof defpackage.ai0     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            ai0 r1 = (defpackage.ai0) r1     // Catch: java.lang.Throwable -> L29
            goto L3c
        L36:
            sj0 r2 = new sj0
            r2.<init>(r1)
            r1 = r2
        L3c:
            boolean r2 = r1 instanceof defpackage.sj0
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            ai0 r0 = (defpackage.ai0) r0
            if (r0 != 0) goto L53
            hg r0 = new hg
            r1 = 3
            r0.<init>(r1)
            xs0 r1 = new xs0
            r1.<init>(r0)
            r0 = r1
        L53:
            defpackage.q40.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.<clinit>():void");
    }
}
