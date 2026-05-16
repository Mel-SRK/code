package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jg implements zf {
    public final cg d;
    public final o6 e;
    public final AtomicReference f = new AtomicReference(null);
    public final Object g = new Object();
    public final t80 h;
    public final sq0 i;
    public final q80 j;
    public final r80 k;
    public final r80 l;
    public final q80 m;
    public final wa n;
    public final wa o;
    public final q80 p;
    public q80 q;
    public boolean r;
    public jg s;
    public int t;
    public final n31 u;
    public final da0 v;
    public final vf w;
    public int x;

    public jg(cg cgVar, o6 o6Var) {
        this.d = cgVar;
        this.e = o6Var;
        t80 t80Var = new t80(new r80());
        this.h = t80Var;
        sq0 sq0Var = new sq0();
        if (cgVar.c()) {
            sq0Var.n = new e80();
        }
        if (cgVar.e()) {
            sq0Var.b();
        }
        this.i = sq0Var;
        this.j = i60.x();
        this.k = new r80();
        this.l = new r80();
        this.m = i60.x();
        wa waVar = new wa();
        this.n = waVar;
        wa waVar2 = new wa();
        this.o = waVar2;
        this.p = i60.x();
        this.q = i60.x();
        n31 n31Var = new n31(cgVar);
        this.u = n31Var;
        this.v = new da0();
        vf vfVar = new vf(o6Var, cgVar, sq0Var, t80Var, waVar, waVar2, n31Var, this);
        cgVar.m(vfVar);
        this.w = vfVar;
        te teVar = we.a;
    }

    public final void a() {
        this.f.set(null);
        this.n.k.an();
        this.o.k.an();
        t80 t80Var = this.h;
        if (t80Var.d.g()) {
            return;
        }
        da0 da0Var = this.v;
        try {
            da0Var.i(t80Var, this.w.y());
            da0Var.e();
        } finally {
            da0Var.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            q80 r2 = r0.j
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9c
            boolean r3 = r2 instanceof defpackage.r80
            p00 r4 = defpackage.p00.d
            r80 r5 = r0.k
            r80 r6 = r0.l
            q80 r7 = r0.p
            if (r3 == 0) goto L81
            r80 r2 = (defpackage.r80) r2
            java.lang.Object[] r3 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            hi0 r9 = (defpackage.hi0) r9
            boolean r16 = defpackage.i60.av(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = r14
            p00 r14 = r9.b(r1)
            if (r14 == r4) goto L72
            q80 r14 = r9.g
            if (r14 == 0) goto L6c
            if (r22 != 0) goto L6c
            r6.a(r9)
            goto L72
        L6c:
            r5.a(r9)
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L3e
        L79:
            r9 = r14
            if (r13 != r9) goto L9c
        L7c:
            if (r10 == r8) goto L9c
            int r10 = r10 + 1
            goto L24
        L81:
            hi0 r2 = (defpackage.hi0) r2
            boolean r3 = defpackage.i60.av(r7, r1, r2)
            if (r3 != 0) goto L9c
            p00 r1 = r2.b(r1)
            if (r1 == r4) goto L9c
            q80 r1 = r2.g
            if (r1 == 0) goto L99
            if (r22 != 0) goto L99
            r6.a(r2)
            return
        L99:
            r5.a(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.g) {
            try {
                e(this.n);
                k();
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th2) {
                            da0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #4 {all -> 0x01d5, blocks: (B:115:0x01c9, B:117:0x01d1), top: B:133:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.wa r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.e(wa):void");
    }

    public final void f() {
        synchronized (this.g) {
            try {
                if (this.o.k.aq()) {
                    e(this.o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th2) {
                            da0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        da0 da0Var;
        synchronized (this.g) {
            try {
                this.w.u = null;
                if (!this.h.d.g()) {
                    da0Var = this.v;
                    try {
                        da0Var.i(this.h, this.w.y());
                        da0Var.e();
                        da0Var.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.h():void");
    }

    public final void i(te teVar) {
        try {
            synchronized (this.g) {
                j();
                q80 q80Var = this.q;
                this.q = i60.x();
                try {
                    vf vfVar = this.w;
                    if (!vfVar.e.k.ap()) {
                        xf.c("Expected applyChanges() to have been called");
                    }
                    vfVar.o(q80Var, teVar);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.h.d.g()) {
                    da0 da0Var = this.v;
                    try {
                        da0Var.i(this.h, this.w.y());
                        da0Var.e();
                        da0Var.b();
                    } catch (Throwable th2) {
                        da0Var.b();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final void j() {
        Object obj = t1.c;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                xf.d("pending composition has not been applied");
                throw new xd();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                xf.d("corrupt pendingModifications drain: " + atomicReference);
                throw new xd();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(null);
        if (f00.h(andSet, t1.c)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            xf.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new xd();
        }
        xf.d("corrupt pendingModifications drain: " + atomicReference);
        throw new xd();
    }

    public final void l() {
        vq vqVar = vq.d;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(vqVar);
        if (f00.h(andSet, t1.c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            xf.d("corrupt pendingModifications drain: " + atomicReference);
            throw new xd();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void m(ArrayList arrayList) {
        t80 t80Var = this.h;
        vf vfVar = this.w;
        if (arrayList.size() > 0) {
            ((v70) ((ae0) arrayList.get(0)).d).getClass();
            throw null;
        }
        try {
            vfVar.getClass();
            try {
                vfVar.aa(arrayList);
                vfVar.i();
            } catch (Throwable th) {
                vfVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!t80Var.d.g()) {
                    da0 da0Var = this.v;
                    try {
                        da0Var.i(t80Var, vfVar.y());
                        da0Var.e();
                        da0Var.b();
                    } catch (Throwable th3) {
                        da0Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final p00 n(hi0 hi0Var, Object obj) {
        jg jgVar;
        int i = hi0Var.b;
        if ((i & 2) != 0) {
            hi0Var.b = i | 4;
        }
        Il il = hi0Var.c;
        if (il == null || !il.a()) {
            return p00.d;
        }
        if (this.i.e(il)) {
            if (hi0Var.d == null) {
                return p00.d;
            }
            p00 p00VarP = p(hi0Var, il, obj);
            if (p00VarP != p00.d) {
                this.u.getClass();
            }
            return p00VarP;
        }
        synchronized (this.g) {
            jgVar = this.s;
        }
        if (jgVar != null) {
            vf vfVar = jgVar.w;
            if (vfVar.ae && vfVar.az(hi0Var, obj)) {
                return p00.g;
            }
        }
        return p00.d;
    }

    public final void o() {
        jg jgVar;
        synchronized (this.g) {
            try {
                for (Object obj : this.i.f) {
                    hi0 hi0Var = obj instanceof hi0 ? (hi0) obj : null;
                    if (hi0Var != null && (jgVar = hi0Var.a) != null) {
                        jgVar.n(hi0Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], EDGE_INSN: B:82:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p00 p(defpackage.hi0 r21, defpackage.Il r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.p(hi0, Il, java.lang.Object):p00");
    }

    public final void q(Object obj) {
        Object objG = this.j.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof r80;
        q80 q80Var = this.p;
        if (!z) {
            hi0 hi0Var = (hi0) objG;
            if (hi0Var.b(obj) == p00.g) {
                i60.l(q80Var, obj, hi0Var);
                return;
            }
            return;
        }
        r80 r80Var = (r80) objG;
        Object[] objArr = r80Var.b;
        long[] jArr = r80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        hi0 hi0Var2 = (hi0) objArr[(i << 3) + i3];
                        if (hi0Var2.b(obj) == p00.g) {
                            i60.l(q80Var, obj, hi0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof defpackage.om0
            q80 r3 = r0.m
            q80 r4 = r0.j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            om0 r1 = (defpackage.om0) r1
            r80 r1 = r1.d
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.r(java.util.Set):boolean");
    }

    public final boolean s() {
        boolean zAq;
        synchronized (this.g) {
            j();
            try {
                q80 q80Var = this.q;
                this.q = i60.x();
                try {
                    vf vfVar = this.w;
                    wa waVar = vfVar.e;
                    if (!waVar.k.ap()) {
                        xf.c("Expected applyChanges() to have been called");
                    }
                    if (q80Var.e > 0 || !vfVar.r.isEmpty()) {
                        vfVar.o(q80Var, null);
                        zAq = waVar.k.aq();
                    } else {
                        zAq = false;
                    }
                    if (!zAq) {
                        k();
                    }
                } catch (Throwable th) {
                    this.q = q80Var;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th3) {
                            da0Var.b();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
        return zAq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(om0 om0Var) {
        Object obj;
        while (true) {
            Object obj2 = this.f.get();
            if (obj2 == null || obj2.equals(t1.c)) {
                obj = om0Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, om0Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = om0Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.g) {
                    k();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.u(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.g
            monitor-enter(r0)
            r14.q(r15)     // Catch: java.lang.Throwable -> L4f
            q80 r1 = r14.m     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.r80     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            r80 r15 = (defpackage.r80) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            km r10 = (defpackage.km) r10     // Catch: java.lang.Throwable -> L4f
            r14.q(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            km r15 = (defpackage.km) r15     // Catch: java.lang.Throwable -> L4f
            r14.q(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.v(java.lang.Object):void");
    }
}
