package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qr0 {
    public final cv a;
    public Object b;
    public l80 c;
    public int j;
    public int d = -1;
    public final q80 e = i60.x();
    public final q80 f = new q80();
    public final r80 g = new r80();
    public final a90 h = new a90(new km[16]);
    public final tf i = new tf(1, this);
    public final q80 k = i60.x();
    public final HashMap l = new HashMap();

    public qr0(cv cvVar) {
        this.a = cvVar;
    }

    public final void a(Object obj, h hVar, pu puVar) {
        Object obj2;
        int i;
        boolean z;
        Object obj3;
        int i2;
        int i3;
        int i4;
        Object obj4 = this.b;
        l80 l80Var = this.c;
        int i5 = this.d;
        this.b = obj;
        this.c = (l80) this.f.g(obj);
        if (this.d == -1) {
            this.d = Long.hashCode(fr0.k().g());
        }
        tf tfVar = this.i;
        a90 a90VarE = bo0.e();
        boolean z2 = true;
        try {
            a90VarE.b(tfVar);
            q6.o(hVar, puVar);
            a90VarE.j(a90VarE.f - 1);
            Object obj5 = this.b;
            obj5.getClass();
            int i6 = this.d;
            l80 l80Var2 = this.c;
            if (l80Var2 != null) {
                long[] jArr = l80Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            z = z2;
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    i4 = i8;
                                    Object obj6 = l80Var2.b[i11];
                                    i3 = i10;
                                    boolean z3 = l80Var2.c[i11] != i6 ? z : false;
                                    if (z3) {
                                        i2 = i6;
                                        q80 q80Var = this.e;
                                        i60.av(q80Var, obj6, obj5);
                                        obj3 = obj5;
                                        if ((obj6 instanceof km) && !q80Var.c(obj6)) {
                                            i60.aw(this.k, obj6);
                                            this.l.remove(obj6);
                                        }
                                    } else {
                                        obj3 = obj5;
                                        i2 = i6;
                                    }
                                    if (z3) {
                                        l80Var2.g(i11);
                                    }
                                } else {
                                    obj3 = obj5;
                                    i2 = i6;
                                    i3 = i10;
                                    i4 = i8;
                                }
                                j >>= i4;
                                i10 = i3 + 1;
                                i8 = i4;
                                i6 = i2;
                                obj5 = obj3;
                            }
                            obj2 = obj5;
                            i = i6;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            obj2 = obj5;
                            i = i6;
                            z = z2;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        z2 = z;
                        i6 = i;
                        obj5 = obj2;
                    }
                }
            }
            this.b = obj4;
            this.c = l80Var;
            this.d = i5;
        } catch (Throwable th) {
            a90VarE.j(a90VarE.f - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r45) {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr0.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.l80 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof defpackage.km
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            km r2 = (defpackage.km) r2
            jm r2 = r2.h()
            java.util.HashMap r3 = r0.l
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            l80 r2 = r2.e
            q80 r3 = r0.k
            defpackage.i60.aw(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            ts0 r9 = (defpackage.ts0) r9
            boolean r5 = r9 instanceof defpackage.us0
            if (r5 == 0) goto L82
            r5 = r9
            us0 r5 = (defpackage.us0) r5
            r5.f(r4)
        L82:
            defpackage.i60.l(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof defpackage.us0
            if (r2 == 0) goto L9d
            r2 = r1
            us0 r2 = (defpackage.us0) r2
            r2.f(r4)
        L9d:
            q80 r2 = r0.e
            r3 = r23
            defpackage.i60.l(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr0.c(java.lang.Object, int, java.lang.Object, l80):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr0.d():void");
    }
}
