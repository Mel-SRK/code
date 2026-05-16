package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends AbstractMap implements Map, f10 {
    public n31 d = new n31(25);
    public uy0 e;
    public Object f;
    public int g;
    public int h;
    public a i;

    public ue0(a aVar) {
        this.e = aVar.d;
        this.h = aVar.e;
        this.i = aVar;
    }

    public final a a() {
        uy0 uy0Var = this.e;
        a aVar = this.i;
        if (uy0Var != aVar.d) {
            this.d = new n31(25);
            aVar = new a(this.e, this.h);
        }
        this.i = aVar;
        return aVar;
    }

    public final boolean b(Object obj) {
        return this.e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = uy0.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ai0) {
            return b((ai0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i01) {
            return super.containsValue((i01) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f = null;
        uy0 uy0VarN = this.e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (uy0VarN == null) {
            uy0VarN = uy0.e;
        }
        this.e = uy0VarN;
        return this.f;
    }

    public final void e(int i) {
        this.h = i;
        this.g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ye0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ai0) {
            return (i01) c((ai0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ai0) ? obj2 : (i01) super.getOrDefault((ai0) obj, (i01) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new ye0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f = null;
        this.e = this.e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        ve0 ve0VarA = null;
        ve0 ve0Var = map instanceof ve0 ? (ve0) map : null;
        if (ve0Var == null) {
            ue0 ue0Var = map instanceof ue0 ? (ue0) map : null;
            if (ue0Var != null) {
                ve0VarA = ue0Var.a();
            }
        } else {
            ve0VarA = ve0Var;
        }
        if (ve0VarA == null) {
            super.putAll(map);
            return;
        }
        dm dmVar = new dm();
        dmVar.a = 0;
        int i = this.h;
        uy0 uy0Var = this.e;
        uy0 uy0Var2 = ve0VarA.d;
        uy0Var2.getClass();
        this.e = uy0Var.m(uy0Var2, 0, dmVar, this);
        int i2 = (ve0VarA.e + i) - dmVar.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.h;
        uy0 uy0VarO = this.e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (uy0VarO == null) {
            uy0VarO = uy0.e;
        }
        this.e = uy0VarO;
        return i != this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new d60(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof ai0) {
            return (i01) d((ai0) obj);
        }
        return null;
    }
}
