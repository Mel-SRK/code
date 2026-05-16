package defpackage;

import android.os.Trace;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vf {
    public final o6 a;
    public int aa;
    public boolean ab;
    public final tf ac;
    public final ArrayList ad;
    public boolean ae;
    public rq0 af;
    public sq0 ag;
    public vq0 ah;
    public boolean ai;
    public a aj;
    public wa ak;
    public final of al;
    public Il am;
    public pr an;
    public final gg ao;
    public final pj ap;
    public boolean aq;
    public long ar;
    public eg as;
    public final cg b;
    public final sq0 c;
    public final t80 d;
    public final wa e;
    public final wa f;
    public final jg g;
    public se0 i;
    public int j;
    public int k;
    public int l;
    public int[] n;
    public c80 o;
    public boolean p;
    public boolean q;
    public e80 u;
    public boolean v;
    public boolean x;
    public int z;
    public final ArrayList h = new ArrayList();
    public final xz m = new xz();
    public final ArrayList r = new ArrayList();
    public final xz s = new xz();
    public a t = a.g;
    public final xz w = new xz();
    public int y = -1;

    public vf(o6 o6Var, cg cgVar, sq0 sq0Var, t80 t80Var, wa waVar, wa waVar2, n31 n31Var, jg jgVar) {
        this.a = o6Var;
        this.b = cgVar;
        this.c = sq0Var;
        this.d = t80Var;
        this.e = waVar;
        this.f = waVar2;
        this.g = jgVar;
        this.ab = cgVar.e() || cgVar.c();
        this.ac = new tf(0, this);
        this.ad = new ArrayList();
        rq0 rq0VarC = sq0Var.c();
        rq0VarC.c();
        this.af = rq0VarC;
        sq0 sq0Var2 = new sq0();
        if (cgVar.e()) {
            sq0Var2.b();
        }
        if (cgVar.c()) {
            sq0Var2.n = new e80();
        }
        this.ag = sq0Var2;
        vq0 vq0VarD = sq0Var2.d();
        vq0VarD.e(true);
        this.ah = vq0VarD;
        this.al = new of(this, waVar);
        rq0 rq0VarC2 = this.ag.c();
        try {
            Il ilA = rq0VarC2.a(0);
            rq0VarC2.c();
            this.am = ilA;
            this.an = new pr();
            this.ao = new gg(this);
            pj pjVarI = cgVar.i();
            pj pjVarY = y();
            this.ap = pjVarI.j(pjVarY == null ? pq.d : pjVarY);
        } catch (Throwable th) {
            rq0VarC2.c();
            throw th;
        }
    }

    public static final int am(vf vfVar, int i, boolean z, int i2) {
        rq0 rq0Var = vfVar.af;
        if (rq0Var.j(i)) {
            int i3 = rq0Var.i(i);
            Object objP = rq0Var.p(rq0Var.b, i);
            if (i3 == 206 && f00.h(objP, xf.e)) {
                Object objH = rq0Var.h(i, 0);
                rf rfVar = objH instanceof rf ? (rf) objH : null;
                if (rfVar != null) {
                    for (vf vfVar2 : rfVar.d.e) {
                        sq0 sq0Var = vfVar2.c;
                        if (sq0Var.e > 0 && (sq0Var.d[1] & 67108864) != 0) {
                            jg jgVar = vfVar2.g;
                            synchronized (jgVar.g) {
                                jgVar.l();
                                q80 q80Var = jgVar.q;
                                jgVar.q = i60.x();
                                try {
                                    jgVar.w.ba(q80Var);
                                } finally {
                                }
                            }
                            wa waVar = new wa();
                            vfVar2.ak = waVar;
                            rq0 rq0VarC = vfVar2.c.c();
                            try {
                                vfVar2.af = rq0VarC;
                                of ofVar = vfVar2.al;
                                wa waVar2 = ofVar.b;
                                try {
                                    ofVar.b = waVar;
                                    vfVar2.al(0);
                                    of ofVar2 = vfVar2.al;
                                    ofVar2.b();
                                    if (ofVar2.c) {
                                        ofVar2.b.k.ar(mc0.c);
                                        if (ofVar2.c) {
                                            ofVar2.d(false);
                                            ofVar2.d(false);
                                            ofVar2.b.k.ar(xb0.c);
                                            ofVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                rq0VarC.c();
                            }
                        }
                        vfVar.b.n(vfVar2.g);
                    }
                }
                return rq0Var.o(i);
            }
            if (!rq0Var.l(i)) {
                return rq0Var.o(i);
            }
        } else if (rq0Var.d(i)) {
            int i4 = rq0Var.b[(i * 5) + 3] + i;
            int iAm = 0;
            for (int i5 = i + 1; i5 < i4; i5 += rq0Var.b[(i5 * 5) + 3]) {
                boolean zL = rq0Var.l(i5);
                if (zL) {
                    vfVar.al.c();
                    of ofVar3 = vfVar.al;
                    Object objN = rq0Var.n(i5);
                    ofVar3.c();
                    ofVar3.h.add(objN);
                }
                iAm += am(vfVar, i5, zL || z, zL ? 0 : i2 + iAm);
                if (zL) {
                    vfVar.al.c();
                    vfVar.al.a();
                }
            }
            if (!rq0Var.l(i)) {
                return iAm;
            }
        } else if (!rq0Var.l(i)) {
            return rq0Var.o(i);
        }
        return 1;
    }

    public final void a() {
        i();
        this.h.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        pr prVar = this.an;
        prVar.l.an();
        prVar.k.an();
        this.ar = 0;
        this.z = 0;
        this.q = false;
        this.aq = false;
        this.x = false;
        this.ae = false;
        this.y = -1;
        rq0 rq0Var = this.af;
        if (!rq0Var.f) {
            rq0Var.c();
        }
        if (this.ah.w) {
            return;
        }
        v();
    }

    public final void aa(ArrayList arrayList) {
        wa waVar = this.f;
        of ofVar = this.al;
        wa waVar2 = ofVar.b;
        try {
            ofVar.b = waVar;
            waVar.k.ar(kc0.c);
            if (arrayList.size() <= 0) {
                ofVar.b.k.ar(yb0.c);
                ofVar.f = 0;
            } else {
                ae0 ae0Var = (ae0) arrayList.get(0);
                v70 v70Var = (v70) ae0Var.d;
                v70Var.getClass();
                throw null;
            }
        } finally {
            ofVar.b = waVar2;
        }
    }

    public final void ab(a aVar, Object obj) {
        ar(126665345, null, 0, null);
        ac();
        bf(obj);
        long j = this.ar;
        try {
            this.ar = 126665345;
            if (this.aq) {
                vq0.x(this.ah);
            }
            boolean z = (this.aq || f00.h(this.af.f(), aVar)) ? false : true;
            if (z) {
                ai(aVar);
            }
            ar(202, xf.c, 0, aVar);
            this.aj = null;
            boolean z2 = this.v;
            this.v = z;
            pk.ak(this, new te(316014703, true, new uf(obj)));
            this.v = z2;
        } finally {
        }
    }

    public final Object ac() {
        boolean z = this.aq;
        n31 n31Var = nf.a;
        if (!z) {
            Object objM = this.af.m();
            if (!this.x || (objM instanceof rf)) {
                return objM;
            }
        } else if (this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected");
            return n31Var;
        }
        return n31Var;
    }

    public final List ad() {
        cg cgVar = this.b;
        zf zfVarG = cgVar.g();
        jg jgVar = zfVarG != null ? (jg) zfVarG : null;
        if (jgVar != null) {
            sq0 sq0Var = jgVar.i;
            rq0 rq0VarC = sq0Var.c();
            try {
                Integer numX = e00.x(rq0VarC, cgVar, 0, rq0VarC.c);
                if (numX != null) {
                    try {
                        return e00.ao(sq0Var.c(), numX.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return rq.d;
    }

    public final int ae(int i) {
        int iQ = this.af.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.af.k(iQ)) {
                i2++;
            }
            iQ += this.af.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object af(defpackage.jg r9, defpackage.jg r10, java.lang.Integer r11, java.util.List r12, defpackage.pu r13) {
        /*
            r8 = this;
            boolean r0 = r8.ae
            int r1 = r8.j
            r2 = 1
            r8.ae = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.j = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            ae0 r6 = (defpackage.ae0) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.d     // Catch: java.lang.Throwable -> L24
            hi0 r7 = (defpackage.hi0) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.e     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.az(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.az(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.s = r10     // Catch: java.lang.Throwable -> L24
            r9.t = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4d
            r9.s = r5     // Catch: java.lang.Throwable -> L24
            r9.t = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.s = r5     // Catch: java.lang.Throwable -> L24
            r9.t = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.ae = r0
            r8.j = r1
            return r10
        L62:
            r8.ae = r0
            r8.j = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.af(jg, jg, java.lang.Integer, java.util.List, pu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag() {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.ag():void");
    }

    public final void ah() {
        int i;
        al(this.af.g);
        of ofVar = this.al;
        ofVar.d(false);
        xz xzVar = ofVar.d;
        vf vfVar = ofVar.a;
        rq0 rq0Var = vfVar.af;
        if (rq0Var.c > 0 && xzVar.a(-2) != (i = rq0Var.i)) {
            if (!ofVar.c && ofVar.e) {
                ofVar.d(false);
                ofVar.b.k.ar(bc0.c);
                ofVar.c = true;
            }
            if (i > 0) {
                Il ilA = rq0Var.a(i);
                xzVar.c(i);
                ofVar.d(false);
                vc0 vc0Var = ofVar.b.k;
                vc0Var.ar(ac0.c);
                e00.aj(vc0Var, 0, ilA);
                ofVar.c = true;
            }
        }
        ofVar.b.k.ar(ic0.c);
        int i2 = ofVar.f;
        rq0 rq0Var2 = vfVar.af;
        ofVar.f = rq0Var2.b[(rq0Var2.g * 5) + 3] + i2;
    }

    public final void ai(a aVar) {
        e80 e80Var = this.u;
        if (e80Var == null) {
            e80Var = new e80();
            this.u = e80Var;
        }
        e80Var.g(this.af.g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aj(int r7, int r8, int r9) {
        /*
            r6 = this;
            rq0 r0 = r6.af
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            of r1 = r6.al
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.aj(int, int, int):void");
    }

    public final Object ak() {
        boolean z = this.aq;
        n31 n31Var = nf.a;
        if (!z) {
            Object objM = this.af.m();
            if (!this.x || (objM instanceof rf)) {
                return objM instanceof cj0 ? ((cj0) objM).a : objM;
            }
        } else if (this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected");
            return n31Var;
        }
        return n31Var;
    }

    public final void al(int i) {
        boolean zL = this.af.l(i);
        of ofVar = this.al;
        if (zL) {
            ofVar.c();
            Object objN = this.af.n(i);
            ofVar.c();
            ofVar.h.add(objN);
        }
        am(this, i, zL, 0);
        ofVar.c();
        if (zL) {
            ofVar.a();
        }
    }

    public final boolean an(int i, boolean z) {
        return ((i & 1) == 0 && (this.aq || this.x)) || z || !z();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ao() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.ao():void");
    }

    public final void ap() {
        rq0 rq0Var = this.af;
        int i = rq0Var.i;
        this.k = i >= 0 ? rq0Var.b[(i * 5) + 1] & 67108863 : 0;
        rq0Var.t();
    }

    public final void aq() {
        if (this.k != 0) {
            xf.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.aq) {
            return;
        }
        hi0 hi0VarW = w();
        if (hi0VarW != null) {
            int i = hi0VarW.b;
            if ((i & 128) == 0) {
                hi0VarW.b = i | 16;
            }
        }
        if (this.r.isEmpty()) {
            ap();
        } else {
            ag();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ar(int r27, defpackage.ob0 r28, int r29, androidx.compose.runtime.internal.a r30) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.ar(int, ob0, int, androidx.compose.runtime.internal.a):void");
    }

    public final void as() {
        ar(-127, null, 0, null);
    }

    public final void at(int i, ob0 ob0Var) {
        ar(i, ob0Var, 0, null);
    }

    public final void au(Object obj, boolean z) {
        if (z) {
            rq0 rq0Var = this.af;
            if (rq0Var.k <= 0) {
                if ((rq0Var.b[(rq0Var.g * 5) + 1] & 1073741824) == 0) {
                    dh0.a("Expected a node group");
                }
                rq0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.af.f() != obj) {
            of ofVar = this.al;
            ofVar.getClass();
            ofVar.d(false);
            vc0 vc0Var = ofVar.b.k;
            vc0Var.ar(pc0.c);
            e00.aj(vc0Var, 0, obj);
        }
        this.af.u();
    }

    public final void av(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            ar(i, null, 0, null);
            return;
        }
        if (this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.ar = Long.rotateLeft(Long.rotateLeft(this.ar, 3) ^ ((long) i), 3) ^ ((long) this.l);
        this.l++;
        rq0 rq0Var = this.af;
        boolean z = this.aq;
        n31 n31Var = nf.a;
        if (z) {
            rq0Var.k++;
            this.ah.ao(i, n31Var, false, n31Var);
            u(false, null);
            return;
        }
        if (rq0Var.g() == i && ((i3 = rq0Var.g) >= rq0Var.h || (rq0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            rq0Var.u();
            u(false, null);
            return;
        }
        if (rq0Var.k <= 0 && (i2 = rq0Var.g) != rq0Var.h) {
            int i4 = this.j;
            ah();
            this.al.e(i4, rq0Var.s());
            xf.a(this.r, i2, rq0Var.g);
        }
        rq0Var.k++;
        this.aq = true;
        this.aj = null;
        if (this.ah.w) {
            vq0 vq0VarD = this.ag.d();
            this.ah = vq0VarD;
            vq0VarD.ak();
            this.ai = false;
            this.aj = null;
        }
        vq0 vq0Var = this.ah;
        vq0Var.d();
        int i5 = vq0Var.t;
        vq0Var.ao(i, n31Var, false, n31Var);
        this.am = vq0Var.b(i5);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vf aw(int r6) {
        /*
            r5 = this;
            r5.av(r6)
            boolean r6 = r5.aq
            java.util.ArrayList r0 = r5.ad
            jg r1 = r5.g
            if (r6 == 0) goto L21
            hi0 r6 = new hi0
            r6.<init>(r1)
            r0.add(r6)
            r5.bf(r6)
            int r0 = r5.aa
            r6.e = r0
            int r0 = r6.b
            r0 = r0 & (-17)
            r6.b = r0
            return r5
        L21:
            rq0 r6 = r5.af
            int r6 = r6.i
            java.util.ArrayList r2 = r5.r
            int r6 = defpackage.xf.e(r6, r2)
            if (r6 < 0) goto L34
            java.lang.Object r6 = r2.remove(r6)
            o00 r6 = (defpackage.o00) r6
            goto L35
        L34:
            r6 = 0
        L35:
            rq0 r2 = r5.af
            java.lang.Object r2 = r2.m()
            n31 r3 = defpackage.nf.a
            boolean r3 = defpackage.f00.h(r2, r3)
            if (r3 == 0) goto L4c
            hi0 r2 = new hi0
            r2.<init>(r1)
            r5.bf(r2)
            goto L51
        L4c:
            r2.getClass()
            hi0 r2 = (defpackage.hi0) r2
        L51:
            r1 = 0
            r3 = 1
            if (r6 != 0) goto L69
            int r6 = r2.b
            r4 = r6 & 64
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 == 0) goto L64
            r6 = r6 & (-65)
            r2.b = r6
        L64:
            if (r4 == 0) goto L67
            goto L69
        L67:
            r6 = r1
            goto L6a
        L69:
            r6 = r3
        L6a:
            int r4 = r2.b
            if (r6 == 0) goto L71
            r6 = r4 | 8
            goto L73
        L71:
            r6 = r4 & (-9)
        L73:
            r2.b = r6
            r0.add(r2)
            int r6 = r5.aa
            r2.e = r6
            int r6 = r2.b
            r0 = r6 & (-17)
            r2.b = r0
            r0 = r6 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Laa
            r6 = r6 & (-273(0xfffffffffffffeef, float:NaN))
            r6 = r6 | 512(0x200, float:7.17E-43)
            r2.b = r6
            of r6 = r5.al
            wa r6 = r6.b
            vc0 r6 = r6.k
            nc0 r0 = defpackage.nc0.c
            r6.ar(r0)
            defpackage.e00.aj(r6, r1, r2)
            boolean r6 = r5.x
            if (r6 != 0) goto Laa
            int r6 = r2.b
            r0 = r6 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Laa
            r5.x = r3
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r2.b = r6
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.aw(int):vf");
    }

    public final void ax() {
        ar(125, null, 2, null);
        this.q = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ay() {
        this.l = 0;
        this.af = this.c.c();
        ar(100, null, 0, null);
        cg cgVar = this.b;
        cgVar.o();
        a aVarH = cgVar.h();
        this.w.c(this.v ? 1 : 0);
        this.v = f(aVarH);
        this.aj = null;
        if (!this.p) {
            this.p = cgVar.d();
        }
        if (!this.ab) {
            this.ab = cgVar.e();
        }
        if (this.ab) {
            xs0 xs0Var = ig.a;
            xs0Var.getClass();
            aVarH = aVarH.b(xs0Var, new ys0(y()));
        }
        this.t = aVarH;
        Set set = (Set) d41.aj(aVarH, kz.a);
        if (set != null) {
            eg egVar = this.as;
            if (egVar == null) {
                egVar = new eg(this.g);
                this.as = egVar;
            }
            set.add(egVar);
            cgVar.l(set);
        }
        ar(Long.hashCode(cgVar.f()), null, 0, null);
    }

    public final boolean az(hi0 hi0Var, Object obj) {
        Il il = hi0Var.c;
        if (il == null) {
            return false;
        }
        int iA = this.af.a.a(il);
        if (!this.ae || iA < this.af.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int iE = xf.e(iA, arrayList);
        if (iE < 0) {
            int i = -(iE + 1);
            if (!(obj instanceof km)) {
                obj = null;
            }
            arrayList.add(i, new o00(hi0Var, iA, obj));
            return true;
        }
        o00 o00Var = (o00) arrayList.get(iE);
        if (!(obj instanceof km)) {
            o00Var.c = null;
            return true;
        }
        Object obj2 = o00Var.c;
        if (obj2 == null) {
            o00Var.c = obj;
            return true;
        }
        if (obj2 instanceof r80) {
            ((r80) obj2).a(obj);
            return true;
        }
        int i2 = nm0.a;
        r80 r80Var = new r80(2);
        r80Var.j(obj2);
        r80Var.j(obj);
        o00Var.c = r80Var;
        return true;
    }

    public final void b(gv gvVar, Object obj) {
        if (this.aq) {
            vc0 vc0Var = this.an.k;
            vc0Var.ar(qc0.c);
            e00.aj(vc0Var, 0, obj);
            gvVar.getClass();
            az0.p(2, gvVar);
            e00.aj(vc0Var, 1, gvVar);
            return;
        }
        of ofVar = this.al;
        ofVar.b();
        vc0 vc0Var2 = ofVar.b.k;
        vc0Var2.ar(qc0.c);
        gvVar.getClass();
        az0.p(2, gvVar);
        e00.ak(vc0Var2, 0, obj, 1, gvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ba(defpackage.q80 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.r
            int r3 = defpackage.f00.v(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            o00 r4 = (defpackage.o00) r4
            hi0 r5 = r4.a
            Il r5 = r5.c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.b
            int r5 = r5.a
            if (r6 == r5) goto L2b
            r4.b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L89
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L84
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L82
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L7e
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r14.getClass()
            hi0 r14 = (defpackage.hi0) r14
            Il r15 = r14.c
            if (r15 == 0) goto L7e
            int r15 = r15.a
            bw r6 = defpackage.bw.an
            if (r13 != r6) goto L76
            r13 = 0
        L76:
            o00 r6 = new o00
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L7e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L82:
            if (r10 != r11) goto L89
        L84:
            if (r7 == r5) goto L89
            int r7 = r7 + 1
            goto L3a
        L89:
            wf r1 = defpackage.xf.f
            defpackage.oc.ao(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.ba(q80):void");
    }

    public final void bb(int i, int i2) {
        if (bg(i) != i2) {
            if (i < 0) {
                c80 c80Var = this.o;
                if (c80Var == null) {
                    c80Var = new c80();
                    this.o = c80Var;
                }
                c80Var.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.af.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void bc(int i, int i2) {
        int iBg = bg(i);
        if (iBg != i2) {
            int i3 = i2 - iBg;
            ArrayList arrayList = this.h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iBg2 = bg(i) + i3;
                bb(i, iBg2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        se0 se0Var = (se0) arrayList.get(i4);
                        if (se0Var != null && se0Var.a(i, iBg2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                rq0 rq0Var = this.af;
                if (i < 0) {
                    i = rq0Var.i;
                } else if (rq0Var.l(i)) {
                    return;
                } else {
                    i = this.af.q(i);
                }
            }
        }
    }

    public final a bd(a aVar, a aVar2) {
        aVar.getClass();
        ue0 ue0Var = new ue0(aVar);
        ue0Var.putAll(aVar2);
        a aVarA = ue0Var.a();
        at(204, xf.d);
        ac();
        bf(aVarA);
        ac();
        bf(aVar2);
        q(false);
        return aVarA;
    }

    public final void be(Object obj) {
        int i;
        rq0 rq0Var;
        int i2;
        vq0 vq0Var;
        if (obj instanceof bj0) {
            bj0 bj0Var = (bj0) obj;
            Il ilA = null;
            if (this.aq) {
                vq0 vq0Var2 = this.ah;
                int i3 = vq0Var2.t;
                if (i3 > vq0Var2.v + 1) {
                    int i4 = i3 - 1;
                    int iAc = vq0Var2.ac(vq0Var2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = iAc;
                        vq0Var = this.ah;
                        if (i4 == vq0Var.v || i4 < 0) {
                            break;
                        } else {
                            iAc = vq0Var.ac(vq0Var.b, i4);
                        }
                    }
                    ilA = vq0Var.b(i2);
                }
            } else {
                rq0 rq0Var2 = this.af;
                int i5 = rq0Var2.g;
                if (i5 > rq0Var2.i + 1) {
                    int i6 = i5 - 1;
                    int iQ = rq0Var2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = iQ;
                        rq0Var = this.af;
                        if (i6 == rq0Var.i || i6 < 0) {
                            break;
                        } else {
                            iQ = rq0Var.q(i6);
                        }
                    }
                    ilA = rq0Var.a(i);
                }
            }
            cj0 cj0Var = new cj0(bj0Var, ilA);
            if (this.aq) {
                vc0 vc0Var = this.al.b.k;
                vc0Var.ar(hc0.c);
                e00.aj(vc0Var, 0, cj0Var);
            }
            this.d.add(obj);
            obj = cj0Var;
        }
        bf(obj);
    }

    public final void bf(Object obj) {
        if (this.aq) {
            vq0 vq0Var = this.ah;
            if (vq0Var.n <= 0 || vq0Var.i == vq0Var.k) {
                vq0Var.ad(obj);
                return;
            }
            e80 e80Var = vq0Var.s;
            if (e80Var == null) {
                e80Var = new e80();
            }
            vq0Var.s = e80Var;
            int i = vq0Var.v;
            Object objB = e80Var.b(i);
            if (objB == null) {
                objB = new m80();
                e80Var.g(i, objB);
            }
            ((m80) objB).a(obj);
            return;
        }
        rq0 rq0Var = this.af;
        boolean z = rq0Var.n;
        of ofVar = this.al;
        if (!z) {
            Il ilA = rq0Var.a(rq0Var.i);
            vc0 vc0Var = ofVar.b.k;
            vc0Var.ar(qb0.c);
            e00.ak(vc0Var, 0, ilA, 1, obj);
            return;
        }
        int iB = (rq0Var.l - uq0.b(rq0Var.b, rq0Var.i)) - 1;
        if (ofVar.a.af.i - ofVar.f >= 0) {
            ofVar.d(true);
            vc0 vc0Var2 = ofVar.b.k;
            vc0Var2.ar(cc0.g);
            e00.aj(vc0Var2, 0, obj);
            vc0Var2.m[vc0Var2.n - vc0Var2.k[vc0Var2.l - 1].a] = iB;
            return;
        }
        rq0 rq0Var2 = this.af;
        Il ilA2 = rq0Var2.a(rq0Var2.i);
        vc0 vc0Var3 = ofVar.b.k;
        vc0Var3.ar(cc0.f);
        e00.ak(vc0Var3, 0, obj, 1, ilA2);
        vc0Var3.m[vc0Var3.n - vc0Var3.k[vc0Var3.l - 1].a] = iB;
    }

    public final int bg(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.af.o(i) : i2;
        }
        c80 c80Var = this.o;
        if (c80Var == null || c80Var.c(i) < 0) {
            return 0;
        }
        int iC = c80Var.c(i);
        if (iC >= 0) {
            return c80Var.c[iC];
        }
        throw new NoSuchElementException("Cannot find value for key " + i);
    }

    public final void bh() {
        if (!this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (this.aq) {
            xf.c("useNode() called while inserting");
        }
        rq0 rq0Var = this.af;
        Object objN = rq0Var.n(rq0Var.i);
        of ofVar = this.al;
        ofVar.c();
        ofVar.h.add(objN);
        if (this.x && (objN instanceof s20)) {
            ofVar.b();
            ofVar.b.k.ar(sc0.c);
        }
    }

    public final boolean c(float f) {
        Object objAc = ac();
        if ((objAc instanceof Float) && f == ((Number) objAc).floatValue()) {
            return false;
        }
        bf(Float.valueOf(f));
        return true;
    }

    public final boolean d(int i) {
        Object objAc = ac();
        if ((objAc instanceof Integer) && i == ((Number) objAc).intValue()) {
            return false;
        }
        bf(Integer.valueOf(i));
        return true;
    }

    public final boolean e(long j) {
        Object objAc = ac();
        if ((objAc instanceof Long) && j == ((Number) objAc).longValue()) {
            return false;
        }
        bf(Long.valueOf(j));
        return true;
    }

    public final boolean f(Object obj) {
        if (f00.h(ac(), obj)) {
            return false;
        }
        bf(obj);
        return true;
    }

    public final boolean g(boolean z) {
        Object objAc = ac();
        if ((objAc instanceof Boolean) && z == ((Boolean) objAc).booleanValue()) {
            return false;
        }
        bf(Boolean.valueOf(z));
        return true;
    }

    public final boolean h(Object obj) {
        if (ac() == obj) {
            return false;
        }
        bf(obj);
        return true;
    }

    public final void i() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.ar = 0L;
        this.q = false;
        of ofVar = this.al;
        ofVar.c = false;
        ofVar.d.b = 0;
        ofVar.f = 0;
        ofVar.e = true;
        ofVar.g = 0;
        ofVar.h.clear();
        ofVar.i = -1;
        ofVar.j = -1;
        ofVar.k = -1;
        ofVar.l = 0;
        this.ad.clear();
        this.n = null;
        this.o = null;
    }

    public final Object j(ai0 ai0Var) {
        return d41.aj(l(), ai0Var);
    }

    public final void k(pu puVar) {
        if (!this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (!this.aq) {
            xf.c("createNode() can only be called when inserting");
        }
        xz xzVar = this.m;
        int i = xzVar.a[xzVar.b - 1];
        vq0 vq0Var = this.ah;
        Il ilB = vq0Var.b(vq0Var.v);
        this.k++;
        pr prVar = this.an;
        vc0 vc0Var = prVar.k;
        vc0Var.ar(cc0.d);
        e00.aj(vc0Var, 0, puVar);
        vc0Var.m[vc0Var.n - vc0Var.k[vc0Var.l - 1].a] = i;
        e00.aj(vc0Var, 1, ilB);
        vc0 vc0Var2 = prVar.l;
        vc0Var2.ar(cc0.e);
        vc0Var2.m[vc0Var2.n - vc0Var2.k[vc0Var2.l - 1].a] = i;
        e00.aj(vc0Var2, 0, ilB);
    }

    public final a l() {
        a aVar;
        a aVar2 = this.aj;
        if (aVar2 != null) {
            return aVar2;
        }
        int iQ = this.af.i;
        boolean z = this.aq;
        ob0 ob0Var = xf.c;
        if (z && this.ai) {
            int iAc = this.ah.v;
            while (iAc > 0) {
                vq0 vq0Var = this.ah;
                if (vq0Var.b[vq0Var.q(iAc) * 5] == 202 && f00.h(this.ah.r(iAc), ob0Var)) {
                    Object objP = this.ah.p(iAc);
                    objP.getClass();
                    a aVar3 = (a) objP;
                    this.aj = aVar3;
                    return aVar3;
                }
                vq0 vq0Var2 = this.ah;
                iAc = vq0Var2.ac(vq0Var2.b, iAc);
            }
        }
        if (this.af.c > 0) {
            while (iQ > 0) {
                if (this.af.i(iQ) == 202) {
                    rq0 rq0Var = this.af;
                    if (f00.h(rq0Var.p(rq0Var.b, iQ), ob0Var)) {
                        e80 e80Var = this.u;
                        if (e80Var == null || (aVar = (a) e80Var.b(iQ)) == null) {
                            rq0 rq0Var2 = this.af;
                            Object objB = rq0Var2.b(rq0Var2.b, iQ);
                            objB.getClass();
                            aVar = (a) objB;
                        }
                        this.aj = aVar;
                        return aVar;
                    }
                }
                iQ = this.af.q(iQ);
            }
        }
        a aVar4 = this.t;
        this.aj = aVar4;
        return aVar4;
    }

    public final List m() {
        boolean z = this.ab;
        List list = rq.d;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        vq0 vq0Var = this.ah;
        arrayList.addAll(e00.o(vq0Var, null, vq0Var.t, null));
        rq0 rq0Var = this.af;
        if (!rq0Var.f && rq0Var.c != 0) {
            di0 di0Var = new di0(rq0Var);
            int iQ = rq0Var.i;
            Object objValueOf = Integer.valueOf(rq0Var.l - uq0.b(rq0Var.b, iQ));
            while (iQ >= 0) {
                di0Var.b(rq0Var.a.f(iQ), objValueOf);
                objValueOf = rq0Var.a(iQ);
                iQ = rq0Var.q(iQ);
            }
            list = di0Var.a;
        }
        arrayList.addAll(list);
        arrayList.addAll(ad());
        return arrayList;
    }

    public final void n() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.p(this);
            this.ad.clear();
            this.r.clear();
            this.e.k.an();
            this.u = null;
            this.a.i();
        } finally {
            Trace.endSection();
        }
    }

    public final void o(q80 q80Var, te teVar) {
        ArrayList arrayList = this.r;
        if (this.ae) {
            xf.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.aa = Long.hashCode(fr0.k().g());
            this.u = null;
            ba(q80Var);
            this.j = 0;
            this.ae = true;
            try {
                ay();
                Object objAc = ac();
                if (objAc != teVar && teVar != null) {
                    bf(teVar);
                }
                tf tfVar = this.ac;
                a90 a90VarE = bo0.e();
                try {
                    a90VarE.b(tfVar);
                    ob0 ob0Var = xf.a;
                    if (teVar != null) {
                        at(200, ob0Var);
                        pk.ak(this, teVar);
                        q(false);
                    } else if (!this.v || objAc == null || objAc.equals(nf.a)) {
                        ao();
                    } else {
                        at(200, ob0Var);
                        az0.p(2, objAc);
                        pk.ak(this, (gv) objAc);
                        q(false);
                    }
                    a90VarE.j(a90VarE.f - 1);
                    t();
                    this.ae = false;
                    arrayList.clear();
                    if (!this.ah.w) {
                        xf.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    a90VarE.j(a90VarE.f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.af.q(i), i2);
        if (this.af.l(i)) {
            Object objN = this.af.n(i);
            of ofVar = this.al;
            ofVar.c();
            ofVar.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.q(boolean):void");
    }

    public final void r() {
        q(false);
        hi0 hi0VarW = w();
        if (hi0VarW != null) {
            int i = hi0VarW.b;
            if ((i & 1) != 0) {
                hi0VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[EDGE_INSN: B:59:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078], EDGE_INSN: B:60:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hi0 s() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.s():hi0");
    }

    public final void t() {
        q(false);
        this.b.b();
        q(false);
        of ofVar = this.al;
        if (ofVar.c) {
            ofVar.d(false);
            ofVar.d(false);
            ofVar.b.k.ar(xb0.c);
            ofVar.c = false;
        }
        ofVar.b();
        if (ofVar.d.b != 0) {
            xf.c("Missed recording an endGroup()");
        }
        if (!this.h.isEmpty()) {
            xf.c("Start/end imbalance");
        }
        i();
        this.af.c();
        this.v = this.w.b() != 0;
    }

    public final void u(boolean z, se0 se0Var) {
        this.h.add(this.i);
        this.i = se0Var;
        int i = this.k;
        xz xzVar = this.m;
        xzVar.c(i);
        xzVar.c(this.l);
        xzVar.c(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final void v() {
        sq0 sq0Var = new sq0();
        if (this.ab) {
            sq0Var.b();
        }
        if (this.b.c()) {
            sq0Var.n = new e80();
        }
        this.ag = sq0Var;
        vq0 vq0VarD = sq0Var.d();
        vq0VarD.e(true);
        this.ah = vq0VarD;
    }

    public final hi0 w() {
        if (this.z != 0) {
            return null;
        }
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (hi0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.v) {
            return true;
        }
        hi0 hi0VarW = w();
        return (hi0VarW == null || (hi0VarW.b & 4) == 0) ? false : true;
    }

    public final gg y() {
        if (this.ab) {
            return this.ao;
        }
        return null;
    }

    public final boolean z() {
        hi0 hi0VarW;
        return (this.aq || this.x || this.v || (hi0VarW = w()) == null || (hi0VarW.b & 8) != 0) ? false : true;
    }
}
