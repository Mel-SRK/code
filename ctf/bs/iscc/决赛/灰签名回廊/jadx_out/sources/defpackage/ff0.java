package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ff0 extends w {
    public final Object[] d;
    public final Object[] e;
    public final int f;
    public final int g;

    public ff0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i;
        this.g = i2;
        if (!(a() > 32)) {
            dh0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, m7 m7Var) {
        int iK = lI.k(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iK == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            h7.au(objArr, objArrCopyOf, iK + 1, iK, 31);
            m7Var.a = objArr[31];
            objArrCopyOf[iK] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iK];
        obj2.getClass();
        objArrCopyOf2[iK] = i((Object[]) obj2, i3, i2, obj, m7Var);
        while (true) {
            iK++;
            if (iK >= 32 || objArrCopyOf2[iK] == null) {
                break;
            }
            Object obj3 = objArr[iK];
            obj3.getClass();
            objArrCopyOf2[iK] = i((Object[]) obj3, i3, 0, m7Var.a, m7Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, m7 m7Var) {
        Object[] objArrK;
        int iK = lI.k(i2, i);
        if (i == 5) {
            m7Var.a = objArr[iK];
            objArrK = null;
        } else {
            Object obj = objArr[iK];
            obj.getClass();
            objArrK = k((Object[]) obj, i - 5, i2, m7Var);
        }
        if (objArrK == null && iK == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iK] = objArrK;
        return objArrCopyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int iK = lI.k(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iK] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iK];
        obj2.getClass();
        objArrCopyOf[iK] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // defpackage.w
    public final w b(int i, Object obj) {
        int i2 = this.f;
        d41.o(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.d;
        if (i >= iP) {
            return j(objArr, i - iP, obj);
        }
        m7 m7Var = new m7(null);
        return j(i(objArr, this.g, i, obj, m7Var), 0, m7Var.a);
    }

    @Override // defpackage.w
    public final w c(Object obj) {
        int iP = p();
        int i = this.f;
        int i2 = i - iP;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new ff0(objArr, objArrCopyOf, i + 1, this.g);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.w
    public final gf0 e() {
        return new gf0(this, this.d, this.e, this.g);
    }

    @Override // defpackage.w
    public final w f(v vVar) {
        gf0 gf0Var = new gf0(this, this.d, this.e, this.g);
        gf0Var.y(vVar);
        return gf0Var.c();
    }

    @Override // defpackage.w
    public final w g(int i) {
        d41.n(i, a());
        int iP = p();
        int i2 = this.g;
        Object[] objArr = this.d;
        return i >= iP ? o(objArr, iP, i2, i - iP) : o(n(objArr, i2, i, new m7(this.e[0])), iP, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        d41.n(i, a());
        if (p() <= i) {
            objArr = this.e;
        } else {
            objArr = this.d;
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object obj = objArr[lI.k(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w
    public final w h(int i, Object obj) {
        int i2 = this.f;
        d41.n(i, i2);
        int iP = p();
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i3 = this.g;
        if (iP > i) {
            return new ff0(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new ff0(objArr, objArrCopyOf, i2, i3);
    }

    public final ff0 j(Object[] objArr, int i, Object obj) {
        int iP = p();
        int i2 = this.f;
        int i3 = i2 - iP;
        Object[] objArr2 = this.e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            h7.au(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new ff0(objArr, objArrCopyOf, i2 + 1, this.g);
        }
        Object obj2 = objArr2[31];
        h7.au(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    public final ff0 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 <= (1 << i3)) {
            return new ff0(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ff0(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        d41.o(i, this.f);
        return new hf0(this.d, this.e, i, this.f, (this.g / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int iK = lI.k(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iK] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iK] = m(i - 5, (Object[]) objArrCopyOf[iK], objArr2);
        return objArrCopyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, m7 m7Var) {
        int iK = lI.k(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iK == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            h7.au(objArr, objArrCopyOf, iK, iK + 1, 32);
            objArrCopyOf[31] = m7Var.a;
            m7Var.a = objArr[iK];
            return objArrCopyOf;
        }
        int iK2 = objArr[31] == null ? lI.k(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iK + 1;
        if (i4 <= iK2) {
            while (true) {
                Object obj = objArrCopyOf2[iK2];
                obj.getClass();
                objArrCopyOf2[iK2] = n((Object[]) obj, i3, 0, m7Var);
                if (iK2 == i4) {
                    break;
                }
                iK2--;
            }
        }
        Object obj2 = objArrCopyOf2[iK];
        obj2.getClass();
        objArrCopyOf2[iK] = n((Object[]) obj2, i3, i2, m7Var);
        return objArrCopyOf2;
    }

    public final w o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        if (i4 != 1) {
            Object[] objArr2 = this.e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                h7.au(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new ff0(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new wq0(objArr);
        }
        m7 m7Var = new m7(null);
        Object[] objArrK = k(objArr, i2, i - 1, m7Var);
        objArrK.getClass();
        Object obj = m7Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new ff0(objArrK, objArr3, i, i2);
        }
        Object obj2 = objArrK[0];
        obj2.getClass();
        return new ff0((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.f - 1) & (-32);
    }
}
