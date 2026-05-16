package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wq0 extends w {
    public static final wq0 e = new wq0(new Object[0]);
    public final Object[] d;

    public wq0(Object[] objArr) {
        this.d = objArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.w
    public final w b(int i, Object obj) {
        Object[] objArr = this.d;
        d41.o(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            h7.aw(objArr, objArr2, 0, i, 6);
            h7.au(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new wq0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        h7.au(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ff0(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.w
    public final w c(Object obj) {
        Object[] objArr = this.d;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new wq0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ff0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.w
    public final w d(Collection collection) {
        Object[] objArr = this.d;
        if (collection.size() + objArr.length > 32) {
            gf0 gf0VarE = e();
            gf0VarE.addAll(collection);
            return gf0VarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new wq0(objArrCopyOf);
    }

    @Override // defpackage.w
    public final gf0 e() {
        return new gf0(this, null, this.d, 0);
    }

    @Override // defpackage.w
    public final w f(v vVar) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) vVar.g(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? e : new wq0(h7.ax(objArrCopyOf, 0, length));
    }

    @Override // defpackage.w
    public final w g(int i) {
        Object[] objArr = this.d;
        d41.n(i, objArr.length);
        if (objArr.length == 1) {
            return e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        h7.au(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new wq0(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.d;
        d41.n(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.w
    public final w h(int i, Object obj) {
        Object[] objArr = this.d;
        d41.n(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new wq0(objArrCopyOf);
    }

    @Override // defpackage.r, java.util.List
    public final int indexOf(Object obj) {
        return h7.bb(this.d, obj);
    }

    @Override // defpackage.r, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.d;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.d;
        d41.o(i, objArr.length);
        return new l9(objArr, i, objArr.length);
    }
}
