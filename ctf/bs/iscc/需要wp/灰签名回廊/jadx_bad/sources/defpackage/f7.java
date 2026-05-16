package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends lq0 implements Map {
    public a7 g;
    public c7 h;
    public e7 i;

    @Override // java.util.Map
    public final Set entrySet() {
        a7 a7Var = this.g;
        if (a7Var != null) {
            return a7Var;
        }
        a7 a7Var2 = new a7(this);
        this.g = a7Var2;
        return a7Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c7 c7Var = this.h;
        if (c7Var != null) {
            return c7Var;
        }
        c7 c7Var2 = new c7(this);
        this.h = c7Var2;
        return c7Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        if (iArr.length < size) {
            this.d = Arrays.copyOf(iArr, size);
            this.e = Arrays.copyOf(this.e, size * 2);
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e7 e7Var = this.i;
        if (e7Var != null) {
            return e7Var;
        }
        e7 e7Var2 = new e7(this);
        this.i = e7Var2;
        return e7Var2;
    }
}
