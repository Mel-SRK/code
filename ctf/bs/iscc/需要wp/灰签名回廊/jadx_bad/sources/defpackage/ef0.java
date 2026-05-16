package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ef0 extends ae implements Set, Collection, d10 {
    public static final ef0 g;
    public final Object d;
    public final Object e;
    public final ve0 f;

    static {
        bw bwVar = bw.ab;
        g = new ef0(bwVar, bwVar, ve0.f);
    }

    public ef0(Object obj, Object obj2, ve0 ve0Var) {
        this.d = obj;
        this.e = obj2;
        this.f = ve0Var;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f.e;
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vv(this.d, this.f);
    }
}
