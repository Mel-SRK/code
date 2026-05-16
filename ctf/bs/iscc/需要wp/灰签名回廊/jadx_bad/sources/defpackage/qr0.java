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
    */
    public final void c(Object obj, int i, Object obj2, l80 l80Var) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int iC = l80Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = l80Var.c[iC];
        }
        l80Var.b[iC] = obj;
        l80Var.c[iC] = i;
        if ((obj instanceof km) && i2 != i) {
            jm jmVarH = ((km) obj).h();
            this.l.put(obj, jmVarH.f);
            l80 l80Var2 = jmVarH.e;
            q80 q80Var = this.k;
            i60.aw(q80Var, obj);
            Object[] objArr = l80Var2.b;
            long[] jArr = l80Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ts0 ts0Var = (ts0) objArr[(i3 << 3) + i5];
                                if (ts0Var instanceof us0) {
                                    ((us0) ts0Var).f(2);
                                }
                                i60.l(q80Var, ts0Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof us0) {
                ((us0) obj).f(2);
            }
            i60.l(this.e, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        Object obj;
        long j3;
        Object obj2;
        q80 q80Var = this.f;
        long[] jArr3 = q80Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj3 = q80Var.b[i6];
                        j2 = j5;
                        l80 l80Var = (l80) q80Var.c[i6];
                        obj3.getClass();
                        boolean zY = ((sd0) obj3).y();
                        if (!zY) {
                            Object[] objArr = l80Var.b;
                            int[] iArr = l80Var.c;
                            long[] jArr4 = l80Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zY;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj4 = objArr[i11];
                                                int i12 = iArr[i11];
                                                q80 q80Var2 = this.e;
                                                i60.av(q80Var2, obj4, obj3);
                                                obj2 = obj3;
                                                if ((obj4 instanceof km) && !q80Var2.c(obj4)) {
                                                    i60.aw(this.k, obj4);
                                                    this.l.remove(obj4);
                                                }
                                            } else {
                                                j3 = j6;
                                                obj2 = obj3;
                                            }
                                            j6 = j3 >> i7;
                                            i10++;
                                            obj3 = obj2;
                                        }
                                        obj = obj3;
                                        if (i9 != i7) {
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    zY = z;
                                    jArr4 = jArr5;
                                    obj3 = obj;
                                    i7 = 8;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                                z = zY;
                            }
                            if (!z) {
                                q80Var.k(i6);
                            }
                            i = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
