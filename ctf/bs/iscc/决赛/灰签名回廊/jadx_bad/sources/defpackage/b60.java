package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b60 implements Map, Serializable, f10 {
    public static final b60 q;
    public Object[] d;
    public Object[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public c60 m;
    public d60 n;
    public c60 o;
    public boolean p;

    static {
        b60 b60Var = new b60(0);
        b60Var.p = true;
        q = b60Var;
    }

    public b60(int i) {
        if (i < 0) {
            wc.n("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.f = iArr;
        this.g = new int[iHighestOneBit];
        this.h = 2;
        this.i = 0;
        this.j = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iH = h(obj);
            int i = this.h * 2;
            int length = this.g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[iH];
                if (i3 <= 0) {
                    int i4 = this.i;
                    Object[] objArr = this.d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.i = i5;
                        objArr[i4] = obj;
                        this.f[i4] = iH;
                        iArr[iH] = i5;
                        this.l++;
                        this.k++;
                        if (i2 > this.h) {
                            this.h = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (f00.h(this.d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.g.length * 2);
                        break;
                    }
                    iH = iH == 0 ? this.g.length - 1 : iH - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.g[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        az0.ac(this.d, i3, i);
        if (objArr != null) {
            az0.ac(objArr, i3, this.i);
        }
        this.i = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.i - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.g[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        az0.ac(this.d, 0, this.i);
        Object[] objArr = this.e;
        if (objArr != null) {
            az0.ac(objArr, 0, this.i);
        }
        this.l = 0;
        this.i = 0;
        this.k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean zH;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zH = false;
                    } else {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        zH = f00.h(objArr[iF], entry.getValue());
                    }
                    if (!zH) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.i;
        int i3 = length - i2;
        int i4 = i2 - this.l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.d = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.e;
            this.e = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f = Arrays.copyOf(this.f, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.g.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c60 c60Var = this.o;
        if (c60Var != null) {
            return c60Var;
        }
        c60 c60Var2 = new c60(this, 0);
        this.o = c60Var2;
        return c60Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.l == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.h;
        while (true) {
            int i2 = this.g[iH];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (f00.h(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.g.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f[i] >= 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                if (f00.h(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.j;
    }

    @Override // java.util.Map
    public final int hashCode() {
        y50 y50Var = new y50(this, 0);
        int i = 0;
        while (y50Var.hasNext()) {
            int i2 = y50Var.d;
            b60 b60Var = (b60) y50Var.g;
            if (i2 >= b60Var.i) {
                wc.p();
                return 0;
            }
            y50Var.d = i2 + 1;
            y50Var.e = i2;
            Object obj = b60Var.d[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = b60Var.e;
            objArr.getClass();
            Object obj2 = objArr[y50Var.e];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            y50Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.k++;
        int i2 = 0;
        if (this.i > this.l) {
            c(false);
        }
        this.g = new int[i];
        this.j = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.i) {
            int i3 = i2 + 1;
            int iH = h(this.d[i2]);
            int i4 = this.h;
            while (true) {
                int[] iArr = this.g;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    wc.q("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.l == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0022->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        Object[] objArr = this.d;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f[i];
        int i2 = this.h * 2;
        int length2 = this.g.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        while (true) {
            length = length == 0 ? this.g.length - 1 : length - 1;
            i4++;
            int i6 = this.h;
            int[] iArr = this.g;
            if (i4 > i6) {
                iArr[i5] = 0;
                break;
            }
            int i7 = iArr[length];
            if (i7 == 0) {
                iArr[i5] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i5] = -1;
            } else {
                int i8 = i7 - 1;
                int iH = h(this.d[i8]) - length;
                int[] iArr2 = this.g;
                if ((iH & (iArr2.length - 1)) >= i4) {
                    iArr2[i5] = i7;
                    this.f[i8] = i5;
                }
                i3--;
                if (i3 >= 0) {
                    this.g[i5] = -1;
                    break;
                }
            }
            i5 = length;
            i4 = 0;
            i3--;
            if (i3 >= 0) {
            }
        }
        this.f[i] = -1;
        this.l--;
        this.k++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c60 c60Var = this.m;
        if (c60Var != null) {
            return c60Var;
        }
        c60 c60Var2 = new c60(this, 1);
        this.m = c60Var2;
        return c60Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                wc.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.e = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    wc.n("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.e = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!f00.h(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.l * 3) + 2);
        sb.append("{");
        int i = 0;
        y50 y50Var = new y50(this, 0);
        while (y50Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = y50Var.d;
            b60 b60Var = (b60) y50Var.g;
            if (i2 >= b60Var.i) {
                wc.p();
                return null;
            }
            y50Var.d = i2 + 1;
            y50Var.e = i2;
            Object obj = b60Var.d[i2];
            if (obj == b60Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = b60Var.e;
            objArr.getClass();
            Object obj2 = objArr[y50Var.e];
            if (obj2 == b60Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            y50Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        d60 d60Var = this.n;
        if (d60Var != null) {
            return d60Var;
        }
        d60 d60Var2 = new d60(0, this);
        this.n = d60Var2;
        return d60Var2;
    }
}
