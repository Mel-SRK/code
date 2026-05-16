package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sf extends cg {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final me0 f = new me0(a.g, bw.am);
    public final /* synthetic */ vf g;

    public sf(vf vfVar, long j, boolean z, boolean z2, n31 n31Var) {
        this.g = vfVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.cg
    public final void a(jg jgVar, te teVar) {
        this.g.b.a(jgVar, teVar);
    }

    @Override // defpackage.cg
    public final void b() {
        vf vfVar = this.g;
        vfVar.z--;
    }

    @Override // defpackage.cg
    public final boolean c() {
        return this.g.b.c();
    }

    @Override // defpackage.cg
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.cg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.cg
    public final long f() {
        return this.a;
    }

    @Override // defpackage.cg
    public final zf g() {
        return this.g.g;
    }

    @Override // defpackage.cg
    public final a h() {
        return (a) this.f.getValue();
    }

    @Override // defpackage.cg
    public final pj i() {
        return this.g.b.i();
    }

    @Override // defpackage.cg
    public final void j(jg jgVar) {
        vf vfVar = this.g;
        vfVar.b.j(vfVar.g);
        vfVar.b.j(jgVar);
    }

    @Override // defpackage.cg
    public final u70 k(v70 v70Var) {
        return this.g.b.k(v70Var);
    }

    @Override // defpackage.cg
    public final void l(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.cg
    public final void m(vf vfVar) {
        this.e.add(vfVar);
    }

    @Override // defpackage.cg
    public final void n(jg jgVar) {
        this.g.b.n(jgVar);
    }

    @Override // defpackage.cg
    public final void o() {
        this.g.z++;
    }

    @Override // defpackage.cg
    public final void p(vf vfVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(vfVar.c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if (!(linkedHashSet instanceof d10) || (linkedHashSet instanceof e10)) {
            linkedHashSet.remove(vfVar);
        } else {
            az0.ah(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // defpackage.cg
    public final void q(jg jgVar) {
        this.g.b.q(jgVar);
    }

    public final void r() {
        LinkedHashSet<vf> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (vf vfVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(vfVar.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
