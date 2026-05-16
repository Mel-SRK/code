package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {
    public static final ai0 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ai0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = (defpackage.ai0) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<em0> r1 = defpackage.em0.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2c
            r2.getClass()     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L1f:
            if (r4 >= r3) goto L2e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5 instanceof defpackage.hm     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L29
        L27:
            r1 = r0
            goto L3f
        L29:
            int r4 = r4 + 1
            goto L1f
        L2c:
            r1 = move-exception
            goto L39
        L2e:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r1 instanceof defpackage.ai0     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            ai0 r1 = (defpackage.ai0) r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L39:
            sj0 r2 = new sj0
            r2.<init>(r1)
            r1 = r2
        L3f:
            boolean r2 = r1 instanceof defpackage.sj0
            if (r2 == 0) goto L45
            goto L46
        L45:
            r0 = r1
        L46:
            ai0 r0 = (defpackage.ai0) r0
            if (r0 != 0) goto L56
            hg r0 = new hg
            r1 = 4
            r0.<init>(r1)
            xs0 r1 = new xs0
            r1.<init>(r0)
            r0 = r1
        L56:
            defpackage.r40.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r40.<clinit>():void");
    }
}
