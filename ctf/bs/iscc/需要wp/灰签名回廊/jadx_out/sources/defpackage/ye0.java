package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ye0 extends u {
    public final /* synthetic */ int d;
    public final ue0 e;

    public /* synthetic */ ye0(int i, ue0 ue0Var) {
        this.d = i;
        this.e = ue0Var;
    }

    @Override // defpackage.u
    public final int a() {
        switch (this.d) {
        }
        return this.e.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
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
                Object key = entry.getKey();
                ue0 ue0Var = this.e;
                Object obj2 = ue0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && ue0Var.containsKey(entry.getKey());
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                return new ze0(this.e);
            default:
                vy0[] vy0VarArr = new vy0[8];
                for (int i = 0; i < 8; i++) {
                    vy0VarArr[i] = new wy0(1);
                }
                return new af0(this.e, vy0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.e.remove(entry.getKey(), entry.getValue());
            default:
                ue0 ue0Var = this.e;
                if (!ue0Var.containsKey(obj)) {
                    return false;
                }
                ue0Var.remove(obj);
                return true;
        }
    }
}
