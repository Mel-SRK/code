package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public static final uy0 e = new uy0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final n31 c;
    public Object[] d;

    public uy0(int i, int i2, Object[] objArr, n31 n31Var) {
        this.a = i;
        this.b = i2;
        this.c = n31Var;
        this.d = objArr;
    }

    public static uy0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, n31 n31Var) {
        if (i3 > 30) {
            return new uy0(0, 0, new Object[]{obj, obj2, obj3, obj4}, n31Var);
        }
        int iK = qo0.k(i, i3);
        int iK2 = qo0.k(i2, i3);
        if (iK != iK2) {
            return new uy0((1 << iK) | (1 << iK2), 0, iK < iK2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, n31Var);
        }
        return new uy0(0, 1 << iK, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, n31Var)}, n31Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, n31 n31Var) {
        Object obj3 = this.d[i];
        uy0 uy0VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, n31Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        h7.aw(objArr, objArr2, 0, i, 6);
        h7.au(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = uy0VarJ;
        h7.au(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        qz qzVarAy = i60.ay(i60.bb(0, this.d.length));
        int i = qzVarAy.d;
        int i2 = qzVarAy.e;
        int i3 = qzVarAy.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!f00.h(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iK = 1 << qo0.k(i, i2);
        if (h(iK)) {
            return f00.h(obj, this.d[f(iK)]);
        }
        if (!i(iK)) {
            return false;
        }
        uy0 uy0VarS = s(t(iK));
        return i2 == 30 ? uy0VarS.c(obj) : uy0VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(uy0 uy0Var) {
        if (this == uy0Var) {
            return true;
        }
        if (this.b == uy0Var.b && this.a == uy0Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == uy0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iK = 1 << qo0.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (f00.h(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iK)) {
            return null;
        }
        uy0 uy0VarS = s(t(iK));
        if (i2 != 30) {
            return uy0VarS.g(i, i2 + 5, obj);
        }
        qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
        int i3 = qzVarAy.d;
        int i4 = qzVarAy.e;
        int i5 = qzVarAy.f;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!f00.h(obj, uy0VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return uy0VarS.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final uy0 k(int i, ue0 ue0Var) {
        ue0Var.e(ue0Var.h - 1);
        ue0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ue0Var.d) {
            return new uy0(0, 0, qo0.c(i, objArr), ue0Var.d);
        }
        this.d = qo0.c(i, objArr);
        return this;
    }

    public final uy0 l(int i, Object obj, Object obj2, int i2, ue0 ue0Var) {
        ue0 ue0Var2;
        uy0 uy0VarL;
        int iK = 1 << qo0.k(i, i2);
        boolean zH = h(iK);
        n31 n31Var = this.c;
        if (zH) {
            int iF = f(iK);
            if (!f00.h(obj, this.d[iF])) {
                ue0Var.e(ue0Var.h + 1);
                n31 n31Var2 = ue0Var.d;
                if (n31Var != n31Var2) {
                    return new uy0(this.a ^ iK, this.b | iK, a(iF, iK, i, obj, obj2, i2, n31Var2), n31Var2);
                }
                this.d = a(iF, iK, i, obj, obj2, i2, n31Var2);
                this.a ^= iK;
                this.b |= iK;
                return this;
            }
            ue0Var.f = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (n31Var == ue0Var.d) {
                this.d[iF + 1] = obj2;
                return this;
            }
            ue0Var.g++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new uy0(this.a, this.b, objArrCopyOf, ue0Var.d);
        }
        if (!i(iK)) {
            ue0Var.e(ue0Var.h + 1);
            n31 n31Var3 = ue0Var.d;
            int iF2 = f(iK);
            Object[] objArr2 = this.d;
            if (n31Var != n31Var3) {
                return new uy0(this.a | iK, this.b, qo0.b(objArr2, iF2, obj, obj2), n31Var3);
            }
            this.d = qo0.b(objArr2, iF2, obj, obj2);
            this.a |= iK;
            return this;
        }
        int iT = t(iK);
        uy0 uy0VarS = s(iT);
        if (i2 == 30) {
            qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
            int i3 = qzVarAy.d;
            int i4 = qzVarAy.e;
            int i5 = qzVarAy.f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                ue0Var.e(ue0Var.h + 1);
                uy0VarL = new uy0(0, 0, qo0.b(uy0VarS.d, 0, obj, obj2), ue0Var.d);
                ue0Var2 = ue0Var;
            } else {
                while (!f00.h(obj, uy0VarS.d[i3])) {
                    if (i3 == i4) {
                        ue0Var.e(ue0Var.h + 1);
                        uy0VarL = new uy0(0, 0, qo0.b(uy0VarS.d, 0, obj, obj2), ue0Var.d);
                        break;
                    }
                    i3 += i5;
                }
                ue0Var.f = uy0VarS.x(i3);
                if (uy0VarS.c == ue0Var.d) {
                    uy0VarS.d[i3 + 1] = obj2;
                    uy0VarL = uy0VarS;
                } else {
                    ue0Var.g++;
                    Object[] objArr3 = uy0VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    uy0VarL = new uy0(0, 0, objArrCopyOf2, ue0Var.d);
                }
                ue0Var2 = ue0Var;
            }
        } else {
            ue0Var2 = ue0Var;
            uy0VarL = uy0VarS.l(i, obj, obj2, i2 + 5, ue0Var2);
        }
        return uy0VarS == uy0VarL ? this : r(iT, uy0VarL, ue0Var2.d);
    }

    public final uy0 m(uy0 uy0Var, int i, dm dmVar, ue0 ue0Var) {
        Object[] objArr;
        uy0 uy0VarJ;
        if (this == uy0Var) {
            dmVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            n31 n31Var = ue0Var.d;
            int i3 = uy0Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + uy0Var.d.length);
            int length = this.d.length;
            qz qzVarAy = i60.ay(i60.bb(0, uy0Var.d.length));
            int i4 = qzVarAy.d;
            int i5 = qzVarAy.e;
            int i6 = qzVarAy.f;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(uy0Var.d[i4])) {
                        dmVar.a++;
                    } else {
                        Object[] objArr3 = uy0Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == uy0Var.d.length ? uy0Var : length == objArrCopyOf.length ? new uy0(0, 0, objArrCopyOf, n31Var) : new uy0(0, 0, Arrays.copyOf(objArrCopyOf, length), n31Var);
            }
        } else {
            int i7 = this.b | uy0Var.b;
            int i8 = this.a;
            int i9 = uy0Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (f00.h(this.d[f(iLowestOneBit)], uy0Var.d[uy0Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                dh0.b("Check failed.");
            }
            uy0 uy0Var2 = (f00.h(this.c, ue0Var.d) && this.a == i12 && this.b == i7) ? this : new uy0(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = uy0Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    uy0VarJ = s(t(iLowestOneBit2));
                    if (uy0Var.i(iLowestOneBit2)) {
                        uy0VarJ = uy0VarJ.m(uy0Var.s(uy0Var.t(iLowestOneBit2)), i + 5, dmVar, ue0Var);
                        objArr = objArr4;
                    } else if (uy0Var.h(iLowestOneBit2)) {
                        int iF = uy0Var.f(iLowestOneBit2);
                        Object obj = uy0Var.d[iF];
                        Object objX = uy0Var.x(iF);
                        int i15 = ue0Var.h;
                        objArr = objArr4;
                        uy0VarJ = uy0VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, ue0Var);
                        if (ue0Var.h == i15) {
                            dmVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (uy0Var.i(iLowestOneBit2)) {
                        uy0 uy0VarS = uy0Var.s(uy0Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (uy0VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                dmVar.a++;
                                uy0VarJ = uy0VarS;
                            } else {
                                uy0VarJ = uy0VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, ue0Var);
                            }
                        } else {
                            uy0VarJ = uy0VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = uy0Var.f(iLowestOneBit2);
                        Object obj4 = uy0Var.d[iF4];
                        uy0VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, uy0Var.x(iF4), i + 5, ue0Var.d);
                    }
                }
                objArr[length2] = uy0VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (uy0Var.h(iLowestOneBit3)) {
                    int iF5 = uy0Var.f(iLowestOneBit3);
                    Object[] objArr5 = uy0Var2.d;
                    objArr5[i18] = uy0Var.d[iF5];
                    objArr5[i18 + 1] = uy0Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        dmVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = uy0Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(uy0Var2)) {
                return uy0Var.e(uy0Var2) ? uy0Var : uy0Var2;
            }
        }
        return this;
    }

    public final uy0 n(int i, Object obj, int i2, ue0 ue0Var) {
        uy0 uy0VarN;
        int iK = 1 << qo0.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (f00.h(obj, this.d[iF])) {
                return p(iF, iK, ue0Var);
            }
        } else if (i(iK)) {
            int iT = t(iK);
            uy0 uy0VarS = s(iT);
            if (i2 == 30) {
                qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
                int i3 = qzVarAy.d;
                int i4 = qzVarAy.e;
                int i5 = qzVarAy.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    uy0VarN = uy0VarS;
                    break;
                }
                while (!f00.h(obj, uy0VarS.d[i3])) {
                    if (i3 == i4) {
                        uy0VarN = uy0VarS;
                        break;
                    }
                    i3 += i5;
                }
                uy0VarN = uy0VarS.k(i3, ue0Var);
            } else {
                uy0VarN = uy0VarS.n(i, obj, i2 + 5, ue0Var);
            }
            return q(uy0VarS, uy0VarN, iT, iK, ue0Var.d);
        }
        return this;
    }

    public final uy0 o(int i, Object obj, Object obj2, int i2, ue0 ue0Var) {
        uy0 uy0Var;
        uy0 uy0VarO;
        int iK = 1 << qo0.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (f00.h(obj, this.d[iF]) && f00.h(obj2, x(iF))) {
                return p(iF, iK, ue0Var);
            }
        } else if (i(iK)) {
            int iT = t(iK);
            uy0 uy0VarS = s(iT);
            if (i2 == 30) {
                qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
                int i3 = qzVarAy.d;
                int i4 = qzVarAy.e;
                int i5 = qzVarAy.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    uy0VarO = uy0VarS;
                    uy0Var = uy0VarS;
                } else {
                    while (true) {
                        if (!f00.h(obj, uy0VarS.d[i3]) || !f00.h(obj2, uy0VarS.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            uy0VarO = uy0VarS.k(i3, ue0Var);
                            break;
                        }
                    }
                    uy0VarO = uy0VarS;
                    uy0Var = uy0VarS;
                }
            } else {
                uy0Var = uy0VarS;
                uy0VarO = uy0Var.o(i, obj, obj2, i2 + 5, ue0Var);
            }
            return q(uy0Var, uy0VarO, iT, iK, ue0Var.d);
        }
        return this;
    }

    public final uy0 p(int i, int i2, ue0 ue0Var) {
        ue0Var.e(ue0Var.h - 1);
        ue0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ue0Var.d) {
            return new uy0(i2 ^ this.a, this.b, qo0.c(i, objArr), ue0Var.d);
        }
        this.d = qo0.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final uy0 q(uy0 uy0Var, uy0 uy0Var2, int i, int i2, n31 n31Var) {
        n31 n31Var2 = this.c;
        if (uy0Var2 != null) {
            return (n31Var2 == n31Var || uy0Var != uy0Var2) ? r(i, uy0Var2, n31Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (n31Var2 != n31Var) {
            return new uy0(this.a, i2 ^ this.b, qo0.d(i, objArr), n31Var);
        }
        this.d = qo0.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final uy0 r(int i, uy0 uy0Var, n31 n31Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && uy0Var.d.length == 2 && uy0Var.b == 0) {
            uy0Var.a = this.b;
            return uy0Var;
        }
        if (this.c == n31Var) {
            objArr[i] = uy0Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = uy0Var;
        return new uy0(this.a, this.b, objArrCopyOf, n31Var);
    }

    public final uy0 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (uy0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r14.c = w(r12, r4, (defpackage.uy0) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o5 u(int i, int i2, Object obj, Object obj2) {
        o5 o5VarU;
        int i3 = 1;
        int iK = 1 << qo0.k(i, i2);
        int i4 = 0;
        if (h(iK)) {
            int iF = f(iK);
            if (!f00.h(obj, this.d[iF])) {
                return new o5(i3, 3, new uy0(this.a ^ iK, this.b | iK, a(iF, iK, i, obj, obj2, i2, null), null));
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new o5(i4, 3, new uy0(this.a, this.b, objArrCopyOf, null));
            }
        } else {
            if (!i(iK)) {
                return new o5(i3, 3, new uy0(this.a | iK, this.b, qo0.b(this.d, f(iK), obj, obj2), null));
            }
            int iT = t(iK);
            uy0 uy0VarS = s(iT);
            if (i2 == 30) {
                qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
                int i5 = qzVarAy.d;
                int i6 = qzVarAy.e;
                int i7 = qzVarAy.f;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!f00.h(obj, uy0VarS.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == uy0VarS.x(i5)) {
                        o5VarU = null;
                    } else {
                        Object[] objArr2 = uy0VarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i5 + 1] = obj2;
                        o5VarU = new o5(i4, 3, new uy0(0, 0, objArrCopyOf2, null));
                    }
                }
                o5VarU = new o5(i3, 3, new uy0(0, 0, qo0.b(uy0VarS.d, 0, obj, obj2), null));
                break;
            }
            o5VarU = uy0VarS.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final uy0 v(int i, int i2, Object obj) {
        uy0 uy0VarV;
        int iK = 1 << qo0.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (f00.h(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new uy0(this.a ^ iK, this.b, qo0.c(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iK)) {
            int iT = t(iK);
            uy0 uy0VarS = s(iT);
            if (i2 == 30) {
                qz qzVarAy = i60.ay(i60.bb(0, uy0VarS.d.length));
                int i3 = qzVarAy.d;
                int i4 = qzVarAy.e;
                int i5 = qzVarAy.f;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!f00.h(obj, uy0VarS.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = uy0VarS.d;
                    uy0VarV = objArr2.length == 2 ? null : new uy0(0, 0, qo0.c(i3, objArr2), null);
                }
                uy0VarV = uy0VarS;
                break;
            }
            uy0VarV = uy0VarS.v(i, i2 + 5, obj);
            if (uy0VarV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new uy0(this.a, iK ^ this.b, qo0.d(iT, objArr3), null);
                }
                return null;
            }
            if (uy0VarS != uy0VarV) {
                return w(iT, iK, uy0VarV);
            }
        }
        return this;
    }

    public final uy0 w(int i, int i2, uy0 uy0Var) {
        Object[] objArr = uy0Var.d;
        if (objArr.length != 2 || uy0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = uy0Var;
            return new uy0(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            uy0Var.a = this.b;
            return uy0Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        h7.au(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        h7.au(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new uy0(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
