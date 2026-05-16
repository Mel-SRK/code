package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends t {
    public static final Object[] g = new Object[0];
    public int d;
    public Object[] e = g;
    public int f;

    @Override // defpackage.t
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f;
        if (i < 0 || i > i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f + 1);
        int iH = h(this.d + i);
        int i3 = this.f;
        if (i < ((i3 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iH - 1;
            }
            int length2 = this.d;
            if (length2 == 0) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.d;
            Object[] objArr3 = this.e;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                h7.au(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                h7.au(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.e;
                objArr4[objArr4.length - 1] = objArr4[0];
                h7.au(objArr4, objArr4, 0, 1, length + 1);
            }
            this.e[length] = obj;
            this.d = i4;
        } else {
            int iH2 = h(i3 + this.d);
            Object[] objArr5 = this.e;
            if (iH < iH2) {
                h7.au(objArr5, objArr5, iH + 1, iH, iH2);
            } else {
                h7.au(objArr5, objArr5, 1, 0, iH2);
                Object[] objArr6 = this.e;
                objArr6[0] = objArr6[objArr6.length - 1];
                h7.au(objArr6, objArr6, iH + 1, iH, objArr6.length - 1);
            }
            this.e[iH] = obj;
        }
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f);
        int iH = h(this.f + this.d);
        int iH2 = h(this.d + i);
        int size = collection.size();
        if (i >= ((this.f + 1) >> 1)) {
            int i3 = iH2 + size;
            Object[] objArr = this.e;
            if (iH2 < iH) {
                int i4 = size + iH;
                if (i4 <= objArr.length) {
                    h7.au(objArr, objArr, i3, iH2, iH);
                } else if (i3 >= objArr.length) {
                    h7.au(objArr, objArr, i3 - objArr.length, iH2, iH);
                } else {
                    int length = iH - (i4 - objArr.length);
                    h7.au(objArr, objArr, 0, length, iH);
                    Object[] objArr2 = this.e;
                    h7.au(objArr2, objArr2, i3, iH2, length);
                }
            } else {
                h7.au(objArr, objArr, size, 0, iH);
                Object[] objArr3 = this.e;
                if (i3 >= objArr3.length) {
                    h7.au(objArr3, objArr3, i3 - objArr3.length, iH2, objArr3.length);
                } else {
                    h7.au(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.e;
                    h7.au(objArr4, objArr4, i3, iH2, objArr4.length - size);
                }
            }
            c(iH2, collection);
            return true;
        }
        int i5 = this.d;
        int length2 = i5 - size;
        Object[] objArr5 = this.e;
        if (iH2 < i5) {
            h7.au(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.e;
            if (size >= iH2) {
                h7.au(objArr6, objArr6, objArr6.length - size, 0, iH2);
            } else {
                h7.au(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.e;
                h7.au(objArr7, objArr7, 0, size, iH2);
            }
        } else if (length2 >= 0) {
            h7.au(objArr5, objArr5, length2, i5, iH2);
        } else {
            length2 += objArr5.length;
            int i6 = iH2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                h7.au(objArr5, objArr5, length2, i5, iH2);
            } else {
                h7.au(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.e;
                h7.au(objArr8, objArr8, 0, this.d + length3, iH2);
            }
        }
        this.d = length2;
        c(f(iH2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f + 1);
        int length = this.d;
        if (length == 0) {
            Object[] objArr = this.e;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.d = i;
        this.e[i] = obj;
        this.f++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.e[h(a() + this.d)] = obj;
        this.f = a() + 1;
    }

    @Override // defpackage.t
    public final Object b(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int iH = h(this.d + i);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        int i3 = this.f >> 1;
        int i4 = this.d;
        if (i < i3) {
            if (iH >= i4) {
                h7.au(objArr, objArr, i4 + 1, i4, iH);
            } else {
                h7.au(objArr, objArr, 1, 0, iH);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.d;
                h7.au(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i6 = this.d;
            objArr3[i6] = null;
            this.d = e(i6);
        } else {
            int iH2 = h((a() - 1) + i4);
            Object[] objArr4 = this.e;
            if (iH <= iH2) {
                h7.au(objArr4, objArr4, iH, iH + 1, iH2 + 1);
            } else {
                h7.au(objArr4, objArr4, iH, iH + 1, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                h7.au(objArr5, objArr5, 0, 1, iH2 + 1);
            }
            this.e[iH2] = null;
        }
        this.f--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.f = collection.size() + this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.d, h(a() + this.d));
        }
        this.d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            wc.q("Deque is too big.");
            return;
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == g) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        h7.au(objArr, objArr2, 0, this.d, objArr.length);
        Object[] objArr3 = this.e;
        int length2 = objArr3.length;
        int i3 = this.d;
        h7.au(objArr3, objArr2, length2 - i3, 0, i3);
        this.d = 0;
        this.e = objArr2;
    }

    public final int e(int i) {
        this.e.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    public final void g(int i, int i2) {
        Object[] objArr = this.e;
        if (i < i2) {
            h7.ay(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            h7.ay(this.e, 0, i2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return this.e[h(this.d + i)];
        }
        wc.g(n5.g("index: ", i, ", size: ", iA));
        return null;
    }

    public final int h(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iH = h(a() + this.d);
        int length = this.d;
        if (length < iH) {
            while (length < iH) {
                if (f00.h(obj, this.e[length])) {
                    i = this.d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.e.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iH; i2++) {
                    if (f00.h(obj, this.e[i2])) {
                        length = i2 + this.e.length;
                        i = this.d;
                    }
                }
                return -1;
            }
            if (f00.h(obj, this.e[length])) {
                i = this.d;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[h((size() - 1) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iH = h(this.f + this.d);
        int i2 = this.d;
        if (i2 < iH) {
            length = iH - 1;
            if (i2 <= length) {
                while (!f00.h(obj, this.e[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
            return -1;
        }
        if (i2 > iH) {
            while (true) {
                iH--;
                Object[] objArr = this.e;
                if (-1 >= iH) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.d;
                    if (i3 <= length) {
                        while (!f00.h(obj, this.e[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.d;
                    }
                } else if (f00.h(obj, objArr[iH])) {
                    length = iH + this.e.length;
                    i = this.d;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f + this.d);
            int i = this.d;
            if (i < iH2) {
                iH = i;
                while (true) {
                    objArr = this.e;
                    if (i >= iH2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.e[iH] = obj;
                        iH++;
                    }
                    i++;
                }
                h7.ay(objArr, iH, iH2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(iH - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = e(i);
        this.f = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h((size() - 1) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        f00.l(i, i2, this.f);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        i();
        int i4 = this.f - i2;
        int i5 = this.d;
        if (i < i4) {
            int iH = h((i - 1) + i5);
            int iH2 = h(this.d + (i2 - 1));
            while (i > 0) {
                int i6 = iH + 1;
                int iMin = Math.min(i, Math.min(i6, iH2 + 1));
                Object[] objArr = this.e;
                int i7 = iH2 - iMin;
                int i8 = iH - iMin;
                h7.au(objArr, objArr, i7 + 1, i8 + 1, i6);
                iH = f(i8);
                iH2 = f(i7);
                i -= iMin;
            }
            int iH3 = h(this.d + i3);
            g(this.d, iH3);
            this.d = iH3;
        } else {
            int iH4 = h(i5 + i2);
            int iH5 = h(this.d + i);
            int i9 = this.f;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(i9, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.e;
                int i10 = iH4 + i2;
                h7.au(objArr3, objArr3, iH5, iH4, i10);
                iH4 = h(i10);
                iH5 = h(iH5 + i2);
            }
            int iH6 = h(this.f + this.d);
            g(f(iH6 - i3), iH6);
        }
        this.f -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f + this.d);
            int i = this.d;
            if (i < iH2) {
                iH = i;
                while (true) {
                    objArr = this.e;
                    if (i >= iH2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.e[iH] = obj;
                        iH++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                h7.ay(objArr, iH, iH2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(iH - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            wc.g(n5.g("index: ", i, ", size: ", iA));
            return null;
        }
        int iH = h(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iH = h(this.f + this.d);
        int i2 = this.d;
        if (i2 < iH) {
            h7.aw(this.e, objArr, i2, iH, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            h7.au(objArr2, objArr, 0, this.d, objArr2.length);
            Object[] objArr3 = this.e;
            h7.au(objArr3, objArr, objArr3.length - this.d, 0, iH);
        }
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.d), collection);
        return true;
    }
}
