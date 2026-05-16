package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r50 {
    public final int a;
    public final bu b;
    public final n31 c;
    public int d;
    public int e;
    public int f;

    public r50(int i) {
        this.a = i;
        if (i <= 0) {
            wc.n("maxSize <= 0");
            throw null;
        }
        this.b = new bu(11);
        this.c = new n31(22);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            bu buVar = this.b;
            buVar.getClass();
            Object obj2 = ((LinkedHashMap) buVar.e).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            n31 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L22
            int r1 = r1 + 1
            r4.d = r1     // Catch: java.lang.Throwable -> L22
            bu r1 = r4.b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L22
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L25
            int r6 = r4.d     // Catch: java.lang.Throwable -> L22
            int r6 = r6 + (-1)
            r4.d = r6     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r5 = move-exception
            goto Lbb
        L25:
            monitor-exit(r0)
            int r6 = r4.a
        L28:
            n31 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L40
            if (r1 < 0) goto Lb1
            bu r1 = r4.b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L43
            int r1 = r4.d     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto Lb1
            goto L43
        L40:
            r5 = move-exception
            goto Lb9
        L43:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L40
            if (r1 <= r6) goto Laf
            bu r1 = r4.b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L54
            goto Laf
        L54:
            bu r1 = r4.b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L40
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L40
            r3 = 0
            if (r2 == 0) goto L77
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L40
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L71
            goto L86
        L71:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L40
            goto L86
        L77:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L82
            goto L86
        L82:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L40
        L86:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L8c
            monitor-exit(r0)
            return r5
        L8c:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L40
            bu r3 = r4.b     // Catch: java.lang.Throwable -> L40
            r3.getClass()     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.e     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L40
            r3.remove(r1)     // Catch: java.lang.Throwable -> L40
            int r1 = r4.d     // Catch: java.lang.Throwable -> L40
            r2.getClass()     // Catch: java.lang.Throwable -> L40
            int r1 = r1 + (-1)
            r4.d = r1     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            goto L28
        Laf:
            monitor-exit(r0)
            return r5
        Lb1:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L40
            throw r6     // Catch: java.lang.Throwable -> L40
        Lb9:
            monitor-exit(r0)
            throw r5
        Lbb:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r50.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
