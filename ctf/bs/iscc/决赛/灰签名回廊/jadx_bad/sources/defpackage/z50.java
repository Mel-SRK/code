package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z50 implements Map.Entry, d10 {
    public final b60 d;
    public final int e;
    public final int f;

    public z50(b60 b60Var, int i) {
        b60Var.getClass();
        this.d = b60Var;
        this.e = i;
        this.f = b60Var.k;
    }

    public final void a() {
        if (this.d.k != this.f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return f00.h(entry.getKey(), getKey()) && f00.h(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.d.d[this.e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.d.e;
        objArr.getClass();
        return objArr[this.e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        b60 b60Var = this.d;
        b60Var.b();
        Object[] objArr = b60Var.e;
        if (objArr == null) {
            int length = b60Var.d.length;
            if (length < 0) {
                wc.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            b60Var.e = objArr;
        }
        int i = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
