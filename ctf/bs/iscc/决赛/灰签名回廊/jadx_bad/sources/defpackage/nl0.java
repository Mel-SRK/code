package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements Map.Entry {
    public final Object d;
    public final v30 e;
    public nl0 f;
    public nl0 g;

    public nl0(t30 t30Var, v30 v30Var) {
        this.d = t30Var;
        this.e = v30Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nl0)) {
            return false;
        }
        nl0 nl0Var = (nl0) obj;
        return this.d.equals(nl0Var.d) && this.e.equals(nl0Var.e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.d.hashCode() ^ this.e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
