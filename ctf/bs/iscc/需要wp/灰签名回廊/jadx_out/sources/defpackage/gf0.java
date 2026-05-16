package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends t implements Collection, e10 {
    public w d;
    public Object[] e;
    public Object[] f;
    public int g;
    public n31 h = new n31(25);
    public Object[] i;
    public Object[] j;
    public int k;

    public gf0(w wVar, Object[] objArr, Object[] objArr2, int i) {
        this.d = wVar;
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.i = objArr;
        this.j = objArr2;
        this.k = wVar.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // defpackage.t
    public final int a() {
        return this.k;
    }

    public final Object aa(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.k - i;
        Object[] objArr2 = this.j;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrK = k(objArr2);
        h7.au(objArr2, objArrK, i3, i3 + 1, i4);
        objArrK[i4 - 1] = null;
        this.i = objArr;
        this.j = objArrK;
        this.k = (i + i4) - 1;
        this.g = i2;
        return obj2;
    }

    public final int ab() {
        int i = this.k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] ac(Object[] objArr, int i, int i2, Object obj, m7 m7Var) {
        int iK = lI.k(i2, i);
        Object[] objArrK = k(objArr);
        if (i != 0) {
            Object obj2 = objArrK[iK];
            obj2.getClass();
            objArrK[iK] = ac((Object[]) obj2, i - 5, i2, obj, m7Var);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        m7Var.a = objArrK[iK];
        objArrK[iK] = obj;
        return objArrK;
    }

    public final void ad(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM;
        if (i3 < 1) {
            dh0.a("requires at least one nullBuffer");
        }
        Object[] objArrK = k(objArr);
        objArr2[0] = objArrK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            h7.au(objArrK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = m();
                i3--;
                objArr2[i3] = objArrM;
            }
            int i7 = i2 - i6;
            h7.au(objArrK, objArr3, 0, i7, i2);
            h7.au(objArrK, objArrM, size + 1, i4, i7);
            objArr3 = objArrM;
        }
        Iterator it = collection.iterator();
        d(objArrK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM2 = m();
            d(objArrM2, 0, it);
            objArr2[i8] = objArrM2;
        }
        d(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d41.o(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iAb = ab();
        if (i >= iAb) {
            h(this.i, i - iAb, obj);
            return;
        }
        m7 m7Var = new m7(null);
        Object[] objArr = this.i;
        objArr.getClass();
        h(g(objArr, this.g, i, obj, m7Var), 0, m7Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        gf0 gf0Var;
        Object[] objArrM;
        d41.o(i, this.k);
        if (i == this.k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.k - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.j;
            Object[] objArrK = k(objArr);
            h7.au(objArr, objArrK, size2 + 1, i3, ae());
            d(objArrK, i3, collection.iterator());
            this.j = objArrK;
            this.k = collection.size() + this.k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iAe = ae();
        int size3 = collection.size() + this.k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= ab()) {
            objArrM = m();
            collection2 = collection;
            ad(collection2, i, this.j, iAe, objArr2, size, objArrM);
            gf0Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gf0Var = this;
            Object[] objArr3 = gf0Var.j;
            if (size3 > iAe) {
                int i4 = size3 - iAe;
                Object[] objArrL = l(i4, objArr3);
                gf0Var.f(collection2, i, i4, objArr2, size, objArrL);
                objArr2 = objArr2;
                objArrM = objArrL;
            } else {
                objArrM = m();
                int i5 = iAe - size3;
                h7.au(objArr3, objArrM, 0, i5, iAe);
                int i6 = 32 - i5;
                Object[] objArrL2 = l(i6, gf0Var.j);
                int i7 = size - 1;
                objArr2[i7] = objArrL2;
                gf0Var.f(collection2, i, i6, objArr2, i7, objArrL2);
                collection2 = collection2;
            }
        }
        gf0Var.i = s(gf0Var.i, i2, objArr2);
        gf0Var.j = objArrM;
        gf0Var.k = collection2.size() + gf0Var.k;
        return true;
    }

    public final int ae() {
        int i = this.k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.t
    public final Object b(int i) {
        d41.n(i, a());
        ((AbstractList) this).modCount++;
        int iAb = ab();
        if (i >= iAb) {
            return aa(this.i, iAb, this.g, i - iAb);
        }
        m7 m7Var = new m7(this.j[0]);
        Object[] objArr = this.i;
        objArr.getClass();
        aa(z(objArr, this.g, i, m7Var), iAb, this.g, 0);
        return m7Var.a;
    }

    public final w c() {
        w wq0Var;
        Object[] objArr = this.i;
        if (objArr == this.e && this.j == this.f) {
            wq0Var = this.d;
        } else {
            this.h = new n31(25);
            this.e = objArr;
            Object[] objArr2 = this.j;
            this.f = objArr2;
            wq0Var = objArr == null ? objArr2.length == 0 ? wq0.e : new wq0(Arrays.copyOf(objArr2, this.k)) : new ff0(objArr, objArr2, this.k, this.g);
        }
        this.d = wq0Var;
        return wq0Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.i == null) {
            wc.q("root is null");
            return;
        }
        int i4 = i >> 5;
        s sVarJ = j(ab() >> 5);
        int i5 = i3;
        Object[] objArrL = objArr2;
        while (sVarJ.d - 1 != i4) {
            Object[] objArr3 = (Object[]) sVarJ.previous();
            h7.au(objArr3, objArrL, 0, 32 - i2, 32);
            objArrL = l(i2, objArr3);
            i5--;
            objArr[i5] = objArrL;
        }
        Object[] objArr4 = (Object[]) sVarJ.previous();
        int iAb = i3 - (((ab() >> 5) - 1) - i4);
        if (iAb < i3) {
            objArr2 = objArr[iAb];
            objArr2.getClass();
        }
        ad(collection, i, objArr4, 32, objArr, iAb, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, m7 m7Var) {
        Object obj2;
        int iK = lI.k(i2, i);
        if (i == 0) {
            m7Var.a = objArr[31];
            Object[] objArrK = k(objArr);
            h7.au(objArr, objArrK, iK + 1, iK, 31);
            objArrK[iK] = obj;
            return objArrK;
        }
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrK2[iK];
        obj3.getClass();
        objArrK2[iK] = g((Object[]) obj3, i3, i2, obj, m7Var);
        while (true) {
            iK++;
            if (iK >= 32 || (obj2 = objArrK2[iK]) == null) {
                break;
            }
            objArrK2[iK] = g((Object[]) obj2, i3, 0, m7Var.a, m7Var);
        }
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        d41.n(i, a());
        if (ab() <= i) {
            objArr = this.j;
        } else {
            objArr = this.i;
            objArr.getClass();
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object obj = objArr[lI.k(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int iAe = ae();
        Object[] objArrK = k(this.j);
        Object[] objArr2 = this.j;
        if (iAe >= 32) {
            Object obj2 = objArr2[31];
            h7.au(objArr2, objArrK, i + 1, i, 31);
            objArrK[i] = obj;
            t(objArr, objArrK, n(obj2));
            return;
        }
        h7.au(objArr2, objArrK, i + 1, i, iAe);
        objArrK[i] = obj;
        this.i = objArr;
        this.j = objArrK;
        this.k++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final s j(int i) {
        Object[] objArr = this.i;
        if (objArr == null) {
            wc.q("Invalid root");
            return null;
        }
        int iAb = ab() >> 5;
        d41.o(i, iAb);
        int i2 = this.g;
        return i2 == 0 ? new l9(i, objArr) : new ty0(objArr, i, iAb, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrM = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        h7.aw(objArr, objArrM, 0, length, 6);
        return objArrM;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            h7.au(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM = m();
        h7.au(objArr, objArrM, i, 0, 32 - i);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        d41.o(i, this.k);
        return new if0(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            dh0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iK = lI.k(i, i2);
        Object obj = objArr[iK];
        obj.getClass();
        Object objO = o((Object[]) obj, i, i2 - 5);
        if (iK < 31) {
            int i3 = iK + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM = m();
                h7.au(objArr, objArrM, 0, 0, i3);
                objArr = objArrM;
            }
        }
        if (objO == objArr[iK]) {
            return objArr;
        }
        Object[] objArrK = k(objArr);
        objArrK[iK] = objO;
        return objArrK;
    }

    public final Object[] p(Object[] objArr, int i, int i2, m7 m7Var) {
        Object[] objArrP;
        int iK = lI.k(i2 - 1, i);
        if (i == 5) {
            m7Var.a = objArr[iK];
            objArrP = null;
        } else {
            Object obj = objArr[iK];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, m7Var);
        }
        if (objArrP == null && iK == 0) {
            return null;
        }
        Object[] objArrK = k(objArr);
        objArrK[iK] = objArrP;
        return objArrK;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.j = objArr;
            this.k = i;
            this.g = i2;
            return;
        }
        m7 m7Var = new m7(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, m7Var);
        objArrP.getClass();
        Object obj = m7Var.a;
        obj.getClass();
        this.j = (Object[]) obj;
        this.k = i;
        if (objArrP[1] == null) {
            this.i = (Object[]) objArrP[0];
            this.g = i2 - 5;
        } else {
            this.i = objArrP;
            this.g = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            dh0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            dh0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrK = k(objArr);
        int iK = lI.k(i, i2);
        int i3 = i2 - 5;
        objArrK[iK] = r((Object[]) objArrK[iK], i, i3, it);
        while (true) {
            iK++;
            if (iK >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[iK] = r((Object[]) objArrK[iK], 0, i3, it);
        }
        return objArrK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new v(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        o oVar = new o(objArr2);
        int i2 = i >> 5;
        int i3 = this.g;
        Object[] objArrR = i2 < (1 << i3) ? r(objArr, i, i3, oVar) : k(objArr);
        while (oVar.hasNext()) {
            this.g += 5;
            objArrR = n(objArrR);
            int i4 = this.g;
            r(objArrR, 1 << i4, i4, oVar);
        }
        return objArrR;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d41.n(i, a());
        if (ab() > i) {
            m7 m7Var = new m7(null);
            Object[] objArr = this.i;
            objArr.getClass();
            this.i = ac(objArr, this.g, i, obj, m7Var);
            return m7Var.a;
        }
        Object[] objArrK = k(this.j);
        if (objArrK != this.j) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrK[i2];
        objArrK[i2] = obj;
        this.j = objArrK;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.k;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 > (1 << i3)) {
            this.i = u(this.g + 5, n(objArr), objArr2);
            this.j = objArr3;
            this.g += 5;
            this.k++;
            return;
        }
        if (objArr == null) {
            this.i = objArr2;
            this.j = objArr3;
            this.k = i + 1;
        } else {
            this.i = u(i3, objArr, objArr2);
            this.j = objArr3;
            this.k++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int iK = lI.k(a() - 1, i);
        Object[] objArrK = k(objArr);
        if (i == 5) {
            objArrK[iK] = objArr2;
            return objArrK;
        }
        objArrK[iK] = u(i - 5, (Object[]) objArrK[iK], objArr2);
        return objArrK;
    }

    public final int v(cv cvVar, Object[] objArr, int i, int i2, m7 m7Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = m7Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) cvVar.g(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArrM[i2] = obj2;
                i2++;
            }
        }
        m7Var.a = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(cv cvVar, Object[] objArr, int i, m7 m7Var) {
        Object[] objArrK = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) cvVar.g(obj)).booleanValue()) {
                if (!z) {
                    objArrK = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrK[i2] = obj;
                i2++;
            }
        }
        m7Var.a = objArrK;
        return i2;
    }

    public final int x(cv cvVar, int i, m7 m7Var) {
        int iW = w(cvVar, this.j, i, m7Var);
        Object obj = m7Var.a;
        if (iW == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i, (Object) null);
        this.j = objArr;
        this.k -= i - iW;
        return iW;
    }

    public final boolean y(cv cvVar) {
        int i;
        cv cvVar2 = cvVar;
        int iAe = ae();
        Object[] objArrO = null;
        m7 m7Var = new m7(null);
        boolean z = false;
        if (this.i != null) {
            s sVarJ = j(0);
            int iW = 32;
            while (iW == 32 && sVarJ.hasNext()) {
                iW = w(cvVar2, (Object[]) sVarJ.next(), 32, m7Var);
            }
            if (iW == 32) {
                int iX = x(cvVar2, iAe, m7Var);
                if (iX == 0) {
                    q(this.i, this.k, this.g);
                }
                if (iX != iAe) {
                }
            } else {
                int i2 = (sVarJ.d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iV = iW;
                while (sVarJ.hasNext()) {
                    iV = v(cvVar2, (Object[]) sVarJ.next(), 32, iV, m7Var, arrayList2, arrayList);
                    cvVar2 = cvVar;
                }
                int iV2 = v(cvVar, this.j, iAe, iV, m7Var, arrayList2, arrayList);
                Object obj = m7Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iV2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrR = this.i;
                if (zIsEmpty) {
                    objArrR.getClass();
                } else {
                    objArrR = r(objArrR, i2, this.g, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    dh0.a("invalid size");
                }
                if (size == 0) {
                    this.g = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.g;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.g = i - 5;
                        Object[] objArr2 = objArrR[0];
                        objArr2.getClass();
                        objArrR = objArr2;
                    }
                    objArrO = o(objArrR, i3, i);
                }
                this.i = objArrO;
                this.j = objArr;
                this.k = size + iV2;
            }
            z = true;
        } else if (x(cvVar2, iAe, m7Var) != iAe) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, m7 m7Var) {
        int iK = lI.k(i2, i);
        if (i == 0) {
            Object obj = objArr[iK];
            Object[] objArrK = k(objArr);
            h7.au(objArr, objArrK, iK, iK + 1, 32);
            objArrK[31] = m7Var.a;
            m7Var.a = obj;
            return objArrK;
        }
        int iK2 = objArr[31] == null ? lI.k(ab() - 1, i) : 31;
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        int i4 = iK + 1;
        if (i4 <= iK2) {
            while (true) {
                Object obj2 = objArrK2[iK2];
                obj2.getClass();
                objArrK2[iK2] = z((Object[]) obj2, i3, 0, m7Var);
                if (iK2 == i4) {
                    break;
                }
                iK2--;
            }
        }
        Object obj3 = objArrK2[iK];
        obj3.getClass();
        objArrK2[iK] = z((Object[]) obj3, i3, i2, m7Var);
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iAe = ae();
        if (iAe < 32) {
            Object[] objArrK = k(this.j);
            objArrK[iAe] = obj;
            this.j = objArrK;
            this.k = a() + 1;
        } else {
            t(this.i, this.j, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iAe = ae();
        Iterator it = collection.iterator();
        if (32 - iAe >= collection.size()) {
            Object[] objArrK = k(this.j);
            d(objArrK, iAe, it);
            this.j = objArrK;
            this.k = collection.size() + this.k;
            return true;
        }
        int size = ((collection.size() + iAe) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrK2 = k(this.j);
        d(objArrK2, iAe, it);
        objArr[0] = objArrK2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM = m();
            d(objArrM, 0, it);
            objArr[i] = objArrM;
        }
        this.i = s(this.i, ab(), objArr);
        Object[] objArrM2 = m();
        d(objArrM2, 0, it);
        this.j = objArrM2;
        this.k = collection.size() + this.k;
        return true;
    }
}
