package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d7 implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean f;
    public final /* synthetic */ f7 g;

    public d7(f7 f7Var) {
        this.g = f7Var;
        this.d = f7Var.f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f) {
            wc.q("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.e;
        f7 f7Var = this.g;
        return f00.h(key, f7Var.e(i)) && f00.h(entry.getValue(), f7Var.h(this.e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f) {
            return this.g.e(this.e);
        }
        wc.q("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f) {
            return this.g.h(this.e);
        }
        wc.q("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f) {
            wc.q("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.e;
        f7 f7Var = this.g;
        Object objE = f7Var.e(i);
        Object objH = f7Var.h(this.e);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wc.p();
            return null;
        }
        this.e++;
        this.f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException();
        }
        this.g.f(this.e);
        this.e--;
        this.d--;
        this.f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f) {
            return this.g.g(this.e, obj);
        }
        wc.q("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
