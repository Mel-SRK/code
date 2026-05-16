package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jm extends vs0 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public l80 e;
    public Object f;
    public int g;

    public jm(long j) {
        super(j);
        l80 l80Var = sa0.a;
        l80Var.getClass();
        this.e = l80Var;
        this.f = h;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        vs0Var.getClass();
        jm jmVar = (jm) vs0Var;
        this.e = jmVar.e;
        this.f = jmVar.f;
        this.g = jmVar.g;
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new jm(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.km r7, defpackage.xq0 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.fr0.c
            monitor-enter(r0)
            long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = defpackage.jm.h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm.c(km, xq0):boolean");
    }

    public final int d(km kmVar, xq0 xq0Var) throws Throwable {
        l80 l80Var;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        vs0 vs0VarG;
        synchronized (fr0.c) {
            l80Var = this.e;
        }
        int i4 = 7;
        if (l80Var.e == 0) {
            return 7;
        }
        a90 a90VarE = bo0.e();
        Object[] objArr = a90VarE.d;
        int i5 = a90VarE.f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((tf) objArr[i6]).b();
        }
        try {
            Object[] objArr2 = l80Var.b;
            int[] iArr = l80Var.c;
            long[] jArr3 = l80Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i7 = 0;
                while (true) {
                    long j = jArr3[i7];
                    if ((((~j) << i4) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j & 255) < 128) {
                                int i11 = (i7 << 3) + i10;
                                Object obj = objArr2[i11];
                                i2 = i4;
                                int i12 = iArr[i11];
                                i3 = i8;
                                ts0 ts0Var = (ts0) obj;
                                if (i12 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (ts0Var instanceof km) {
                                        try {
                                            km kmVar2 = (km) ts0Var;
                                            vs0VarG = kmVar2.g((jm) fr0.j(kmVar2.g, xq0Var), xq0Var, false, kmVar2.e);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = a90VarE.d;
                                            int i13 = a90VarE.f;
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                ((tf) objArr3[i14]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        vs0VarG = fr0.j(ts0Var.a(), xq0Var);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(vs0VarG)) * 31) + Long.hashCode(vs0VarG.a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                                i3 = i8;
                            }
                            j >>= i3;
                            i10++;
                            i4 = i2;
                            jArr3 = jArr2;
                            i8 = i3;
                        }
                        jArr = jArr3;
                        i = i4;
                        if (i9 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i4;
                    }
                    if (i7 == length) {
                        i4 = iIdentityHashCode;
                        break;
                    }
                    i7++;
                    i4 = i;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i4;
            Object[] objArr4 = a90VarE.d;
            int i15 = a90VarE.f;
            for (int i16 = 0; i16 < i15; i16++) {
                ((tf) objArr4[i16]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
