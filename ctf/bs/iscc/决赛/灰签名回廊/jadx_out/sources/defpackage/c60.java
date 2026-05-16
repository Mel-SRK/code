package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c60 extends u {
    public final /* synthetic */ int d;
    public final b60 e;

    public /* synthetic */ c60(b60 b60Var, int i) {
        this.d = i;
        this.e = b60Var;
    }

    @Override // defpackage.u
    public final int a() {
        switch (this.d) {
        }
        return this.e.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case 0:
                this.e.clear();
                break;
            default:
                this.e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                b60 b60Var = this.e;
                b60Var.getClass();
                int iF = b60Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                Object[] objArr = b60Var.e;
                objArr.getClass();
                return f00.h(objArr[iF], entry.getValue());
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                return this.e.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.d) {
        }
        return this.e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                b60 b60Var = this.e;
                b60Var.getClass();
                return new y50(b60Var, 0);
            default:
                b60 b60Var2 = this.e;
                b60Var2.getClass();
                return new y50(b60Var2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    b60 b60Var = this.e;
                    b60Var.getClass();
                    b60Var.b();
                    int iF = b60Var.f(entry.getKey());
                    if (iF >= 0) {
                        Object[] objArr = b60Var.e;
                        objArr.getClass();
                        if (f00.h(objArr[iF], entry.getValue())) {
                            b60Var.j(iF);
                            break;
                        }
                    }
                }
                break;
            default:
                b60 b60Var2 = this.e;
                b60Var2.b();
                int iF2 = b60Var2.f(obj);
                if (iF2 >= 0) {
                    b60Var2.j(iF2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                this.e.b();
                break;
            default:
                this.e.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                this.e.b();
                break;
            default:
                this.e.b();
                break;
        }
        return super.retainAll(collection);
    }
}
