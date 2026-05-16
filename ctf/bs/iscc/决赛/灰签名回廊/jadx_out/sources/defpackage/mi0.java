package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mi0 extends cg {
    public static final ps0 x = i60.e(ef0.g);
    public static final AtomicReference y = new AtomicReference(Boolean.FALSE);
    public final h9 a;
    public final Object b;
    public t00 c;
    public Throwable d;
    public final ArrayList e;
    public Object f;
    public r80 g;
    public final a90 h;
    public final ArrayList i;
    public final ArrayList j;
    public final q80 k;
    public final f1 l;
    public final q80 m;
    public final q80 n;
    public ArrayList o;
    public LinkedHashSet p;
    public la q;
    public bu r;
    public boolean s;
    public final ps0 t;
    public final v00 u;
    public final pj v;
    public final yf0 w;

    public mi0(pj pjVar) {
        h9 h9Var = new h9(new t4(2, this));
        this.a = h9Var;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new r80();
        this.h = new a90(new jg[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new q80();
        this.l = new f1(11);
        this.m = new q80();
        this.n = new q80();
        this.t = i60.e(ii0.f);
        new AtomicReference(f00.j);
        v00 v00Var = new v00((t00) pjVar.k(bw.ae));
        v00Var.t(new h(7, this));
        this.u = v00Var;
        this.v = pjVar.j(h9Var).j(v00Var);
        this.w = new yf0(9);
    }

    public static final jg r(mi0 mi0Var, jg jgVar, r80 r80Var) {
        LinkedHashSet linkedHashSet;
        v80 v80VarAc;
        if (!jgVar.w.ae && jgVar.x != 3 && ((linkedHashSet = mi0Var.p) == null || !linkedHashSet.contains(jgVar))) {
            h hVar = new h(6, jgVar);
            yw ywVar = new yw(1, jgVar, r80Var);
            xq0 xq0VarK = fr0.k();
            v80 v80Var = xq0VarK instanceof v80 ? (v80) xq0VarK : null;
            if (v80Var == null || (v80VarAc = v80Var.ac(hVar, ywVar)) == null) {
                wc.q("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                xq0 xq0VarJ = v80VarAc.j();
                if (r80Var != null) {
                    try {
                        if (r80Var.h()) {
                            fg fgVar = new fg(1, r80Var, jgVar);
                            vf vfVar = jgVar.w;
                            if (vfVar.ae) {
                                xf.c("Preparing a composition while composing is not supported");
                            }
                            vfVar.ae = true;
                            try {
                                fgVar.a();
                                vfVar.ae = false;
                            } catch (Throwable th) {
                                vfVar.ae = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        xq0.q(xq0VarJ);
                        throw th2;
                    }
                }
                boolean zS = jgVar.s();
                xq0.q(xq0VarJ);
                if (zS) {
                    return jgVar;
                }
            } finally {
                t(v80VarAc);
            }
        }
        return null;
    }

    public static final boolean s(mi0 mi0Var) {
        synchronized (mi0Var.b) {
            boolean z = true;
            if (mi0Var.g.g()) {
                if (mi0Var.h.f == 0 && !mi0Var.w() && mi0Var.k.e == 0) {
                    z = false;
                }
                return z;
            }
            List listY = mi0Var.y();
            om0 om0Var = new om0(mi0Var.g);
            mi0Var.g = new r80();
            try {
                int size = listY.size();
                for (int i = 0; i < size; i++) {
                    ((jg) listY.get(i)).t(om0Var);
                    if (((ii0) mi0Var.t.getValue()).compareTo(ii0.e) <= 0) {
                        break;
                    }
                }
                synchronized (mi0Var.b) {
                    if (mi0Var.v() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (mi0Var.h.f == 0 && !mi0Var.w() && mi0Var.k.e == 0) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (mi0Var.b) {
                    r80 r80Var = mi0Var.g;
                    r80Var.getClass();
                    Iterator<E> it = om0Var.iterator();
                    while (it.hasNext()) {
                        r80Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public static void t(v80 v80Var) {
        try {
            if (v80Var.w() instanceof yq0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            v80Var.c();
        }
    }

    public static final void z(ArrayList arrayList, mi0 mi0Var, jg jgVar) {
        arrayList.clear();
        synchronized (mi0Var.b) {
            Iterator it = mi0Var.j.iterator();
            if (it.hasNext()) {
                ((v70) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.cg
    public final void a(jg jgVar, te teVar) throws Throwable {
        ii0 ii0Var;
        boolean zContains;
        v80 v80VarAc;
        boolean z = jgVar.w.ae;
        synchronized (this.b) {
            ii0 ii0Var2 = (ii0) this.t.getValue();
            ii0Var = ii0.e;
            zContains = ii0Var2.compareTo(ii0Var) > 0 ? true ^ y().contains(jgVar) : true;
        }
        try {
            h hVar = new h(6, jgVar);
            yw ywVar = new yw(1, jgVar, null);
            xq0 xq0VarK = fr0.k();
            v80 v80Var = xq0VarK instanceof v80 ? (v80) xq0VarK : null;
            if (v80Var == null || (v80VarAc = v80Var.ac(hVar, ywVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                xq0 xq0VarJ = v80VarAc.j();
                try {
                    jgVar.i(teVar);
                    synchronized (this.b) {
                        if (((ii0) this.t.getValue()).compareTo(ii0Var) > 0 && !y().contains(jgVar)) {
                            this.e.add(jgVar);
                            this.f = null;
                        }
                    }
                    if (!z) {
                        fr0.k().m();
                    }
                    try {
                        synchronized (this.b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((v70) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            jgVar.d();
                            jgVar.f();
                            if (z) {
                                return;
                            }
                            fr0.k().m();
                        } catch (Throwable th) {
                            ab(th, null);
                        }
                    } catch (Throwable th2) {
                        ab(th2, jgVar);
                    }
                } finally {
                    xq0.q(xq0VarJ);
                }
            } finally {
                t(v80VarAc);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.b) {
                }
            }
            ab(th3, jgVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (((defpackage.ae0) r10.get(r4)).e == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        r11 = (defpackage.ae0) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        if (r11.e != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
    
        r11 = (defpackage.v70) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r4 = r17.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        defpackage.pc.ap(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (((defpackage.ae0) r11).e == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List aa(java.util.List r18, defpackage.r80 r19) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi0.aa(java.util.List, r80):java.util.List");
    }

    public final void ab(Throwable th, jg jgVar) throws Throwable {
        if (!((Boolean) y.get()).booleanValue() || (th instanceof cf)) {
            synchronized (this.b) {
                bu buVar = this.r;
                if (buVar != null) {
                    throw ((Throwable) buVar.e);
                }
                this.r = new bu(17, th);
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new r80();
                this.j.clear();
                this.k.a();
                this.m.a();
                this.r = new bu(17, th);
                if (jgVar != null) {
                    ac(jgVar);
                }
                v();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void ac(jg jgVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(jgVar)) {
            arrayList.add(jgVar);
        }
        if (this.e.remove(jgVar)) {
            this.f = null;
        }
    }

    @Override // defpackage.cg
    public final boolean c() {
        return ((Boolean) y.get()).booleanValue();
    }

    @Override // defpackage.cg
    public final boolean d() {
        return false;
    }

    @Override // defpackage.cg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.cg
    public final long f() {
        return 1000;
    }

    @Override // defpackage.cg
    public final zf g() {
        return null;
    }

    @Override // defpackage.cg
    public final pj i() {
        return this.v;
    }

    @Override // defpackage.cg
    public final void j(jg jgVar) {
        ja jaVarV;
        synchronized (this.b) {
            if (this.h.h(jgVar)) {
                jaVarV = null;
            } else {
                this.h.b(jgVar);
                jaVarV = v();
            }
        }
        if (jaVarV != null) {
            ((la) jaVarV).h(wz0.a);
        }
    }

    @Override // defpackage.cg
    public final u70 k(v70 v70Var) {
        u70 u70Var;
        synchronized (this.b) {
            u70Var = (u70) this.m.j(v70Var);
        }
        return u70Var;
    }

    @Override // defpackage.cg
    public final void n(jg jgVar) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(jgVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cg
    public final void q(jg jgVar) {
        synchronized (this.b) {
            if (this.e.remove(jgVar)) {
                this.f = null;
            }
            this.h.i(jgVar);
            this.i.remove(jgVar);
        }
    }

    public final void u() {
        synchronized (this.b) {
            if (((ii0) this.t.getValue()).compareTo(ii0.h) >= 0) {
                ps0 ps0Var = this.t;
                ii0 ii0Var = ii0.e;
                ps0Var.getClass();
                ps0Var.h(null, ii0Var);
            }
        }
        this.u.a(null);
    }

    public final ja v() {
        ps0 ps0Var = this.t;
        int iCompareTo = ((ii0) ps0Var.getValue()).compareTo(ii0.e);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        a90 a90Var = this.h;
        if (iCompareTo <= 0) {
            for (jg jgVar : y()) {
            }
            this.e.clear();
            this.f = rq.d;
            this.g = new r80();
            a90Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            la laVar = this.q;
            if (laVar != null) {
                laVar.n(null);
            }
            this.q = null;
            this.r = null;
            return null;
        }
        bu buVar = this.r;
        ii0 ii0Var = ii0.i;
        ii0 ii0Var2 = ii0.f;
        if (buVar == null) {
            if (this.c == null) {
                this.g = new r80();
                a90Var.g();
                if (w()) {
                    ii0Var2 = ii0.g;
                }
            } else {
                ii0Var2 = (a90Var.f == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !w() && this.k.e == 0) ? ii0.h : ii0Var;
            }
        }
        ps0Var.h(null, ii0Var2);
        if (ii0Var2 != ii0Var) {
            return null;
        }
        la laVar2 = this.q;
        this.q = null;
        return laVar2;
    }

    public final boolean w() {
        return !this.s && (this.a.g.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            r80 r1 = r2.g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            a90 r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.w()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi0.x():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List y() {
        ?? r0 = this.f;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.e;
        List arrayList2 = arrayList.isEmpty() ? rq.d : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    @Override // defpackage.cg
    public final void l(Set set) {
    }
}
