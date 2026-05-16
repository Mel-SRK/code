package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d60 extends AbstractCollection implements Collection, e10 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ d60(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.d) {
            case 0:
                ((b60) this.e).clear();
                break;
            default:
                ((ue0) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                return ((b60) this.e).containsValue(obj);
            default:
                return ((ue0) this.e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case 0:
                return ((b60) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                b60 b60Var = (b60) this.e;
                b60Var.getClass();
                return new y50(b60Var, 2);
            default:
                ue0 ue0Var = (ue0) this.e;
                vy0[] vy0VarArr = new vy0[8];
                for (int i = 0; i < 8; i++) {
                    vy0VarArr[i] = new wy0(2);
                }
                return new af0(ue0Var, vy0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                b60 b60Var = (b60) this.e;
                b60Var.b();
                int iG = b60Var.g(obj);
                if (iG < 0) {
                    return false;
                }
                b60Var.j(iG);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                ((b60) this.e).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                ((b60) this.e).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.d) {
            case 0:
                return ((b60) this.e).l;
            default:
                return ((ue0) this.e).h;
        }
    }
}
