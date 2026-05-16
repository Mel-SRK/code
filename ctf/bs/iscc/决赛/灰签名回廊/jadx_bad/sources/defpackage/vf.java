package defpackage;

import android.os.Trace;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
    */
    public final Object af(jg jgVar, jg jgVar2, Integer num, List list, pu puVar) {
        Object objA;
        boolean z = this.ae;
        int i = this.j;
        try {
            this.ae = true;
            this.j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ae0 ae0Var = (ae0) list.get(i2);
                hi0 hi0Var = (hi0) ae0Var.d;
                Object obj = ae0Var.e;
                if (obj != null) {
                    az(hi0Var, obj);
                } else {
                    az(hi0Var, null);
                }
            }
            if (jgVar == null) {
                objA = puVar.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (jgVar2 == null || jgVar2.equals(jgVar) || iIntValue < 0) {
                    objA = puVar.a();
                } else {
                    jgVar.s = jgVar2;
                    jgVar.t = iIntValue;
                    try {
                        objA = puVar.a();
                        jgVar.s = null;
                        jgVar.t = 0;
                    } catch (Throwable th) {
                        jgVar.s = null;
                        jgVar.t = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                }
            }
            this.ae = z;
            this.j = i;
            return objA;
        } catch (Throwable th2) {
            this.ae = z;
            this.j = i;
            throw th2;
        }
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
    */
    public final void ag() {
        o00 o00Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        vf vfVar;
        l80 l80Var;
        long j3;
        int iE;
        int i8;
        o00 o00Var2;
        int i9;
        int iHashCode;
        Object objB;
        vf vfVar2 = this;
        bw bwVar = bw.au;
        boolean z = vfVar2.ae;
        vfVar2.ae = true;
        rq0 rq0Var = vfVar2.af;
        int i10 = rq0Var.i;
        int i11 = (i10 * 5) + 3;
        int i12 = rq0Var.b[i11] + i10;
        int i13 = vfVar2.j;
        long j4 = vfVar2.ar;
        int i14 = vfVar2.k;
        int i15 = vfVar2.l;
        int i16 = rq0Var.g;
        ArrayList arrayList = vfVar2.r;
        int iE2 = xf.e(i16, arrayList);
        if (iE2 < 0) {
            iE2 = -(iE2 + 1);
        }
        if (iE2 < arrayList.size()) {
            o00Var = (o00) arrayList.get(iE2);
            if (o00Var.b >= i12) {
                o00Var = null;
            }
        }
        int i17 = 1;
        int i18 = i10;
        int i19 = 0;
        while (o00Var != null) {
            hi0 hi0Var = o00Var.a;
            int i20 = o00Var.b;
            bw bwVar2 = bwVar;
            int iE3 = xf.e(i20, arrayList);
            if (iE3 >= 0) {
            }
            Object obj = o00Var.c;
            if (obj == null) {
                hi0Var.getClass();
                i3 = i12;
                i = i11;
                i2 = i13;
            } else {
                int i21 = 8;
                q80 q80Var = hi0Var.g;
                if (q80Var == null) {
                    i3 = i12;
                    i = i11;
                    i2 = i13;
                } else {
                    i = i11;
                    if (obj instanceof km) {
                        km kmVar = (km) obj;
                        bw bwVar3 = kmVar.f;
                        if (bwVar3 == null) {
                            bwVar3 = bwVar2;
                        }
                        i2 = i13;
                        i6 = !bwVar3.h(kmVar.h().f, q80Var.g(kmVar)) ? 1 : 0;
                        i3 = i12;
                        i4 = i14;
                        i5 = i15;
                    } else {
                        i2 = i13;
                        if (obj instanceof r80) {
                            r80 r80Var = (r80) obj;
                            if (r80Var.h()) {
                                Object[] objArr = r80Var.b;
                                long[] jArr = r80Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i14;
                                    i5 = i15;
                                    int i22 = 0;
                                    while (true) {
                                        long j5 = jArr[i22];
                                        i3 = i12;
                                        Object[] objArr2 = objArr;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i23 = 8 - ((~(i22 - length)) >>> 31);
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                if ((j5 & 255) < 128) {
                                                    i7 = i24;
                                                    Object obj2 = objArr2[(i22 << 3) + i24];
                                                    j = j5;
                                                    if (!(obj2 instanceof km)) {
                                                        break;
                                                    }
                                                    km kmVar2 = (km) obj2;
                                                    bw bwVar4 = kmVar2.f;
                                                    if (bwVar4 == null) {
                                                        bwVar4 = bwVar2;
                                                    }
                                                    if (!bwVar4.h(kmVar2.h().f, q80Var.g(kmVar2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i24;
                                                    j = j5;
                                                }
                                                j5 = j >> i21;
                                                i24 = i7 + 1;
                                            }
                                            if (i23 != i21) {
                                                break;
                                            }
                                            if (i22 == length) {
                                                break;
                                            }
                                            i22++;
                                            i12 = i3;
                                            objArr = objArr2;
                                            i21 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i12;
                                    i4 = i14;
                                    i5 = i15;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i12;
                        }
                    }
                    if (i6 == 0) {
                        vfVar2.af.r(i20);
                        int i25 = vfVar2.af.g;
                        vfVar2.aj(i18, i25, i10);
                        int iQ = vfVar2.af.q(i25);
                        while (iQ != i10 && !vfVar2.af.l(iQ)) {
                            iQ = vfVar2.af.q(iQ);
                        }
                        int iBg = vfVar2.af.l(iQ) ? 0 : i2;
                        if (iQ != i25) {
                            int iBg2 = (vfVar2.bg(iQ) - vfVar2.af.o(i25)) + iBg;
                            while (iBg < iBg2 && iQ != i20) {
                                iQ++;
                                while (iQ < i20) {
                                    rq0 rq0Var2 = vfVar2.af;
                                    int i26 = rq0Var2.b[(iQ * 5) + 3] + iQ;
                                    if (i20 >= i26) {
                                        iBg += rq0Var2.l(iQ) ? i17 : vfVar2.bg(iQ);
                                        iQ = i26;
                                    }
                                }
                                break;
                            }
                        }
                        vfVar2.j = iBg;
                        vfVar2.l = vfVar2.ae(i25);
                        int iQ2 = vfVar2.af.q(i25);
                        long jRotateLeft = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (true) {
                            if (iQ2 < 0) {
                                break;
                            }
                            if (iQ2 == i10) {
                                jRotateLeft ^= Long.rotateLeft(j4, i28);
                                break;
                            }
                            rq0 rq0Var3 = vfVar2.af;
                            boolean zK = rq0Var3.k(iQ2);
                            int[] iArr = rq0Var3.b;
                            if (zK) {
                                Object objP = rq0Var3.p(iArr, iQ2);
                                if (objP != null) {
                                    iHashCode = objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode();
                                    i9 = i25;
                                } else {
                                    i9 = i25;
                                    iHashCode = 0;
                                }
                            } else {
                                int i29 = rq0Var3.i(iQ2);
                                i9 = i25;
                                iHashCode = (i29 != 207 || (objB = rq0Var3.b(iArr, iQ2)) == null || objB.equals(nf.a)) ? i29 : objB.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i28);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i27)) ^ Long.rotateLeft(vfVar2.af.k(iQ2) ? 0 : vfVar2.ae(iQ2), i28);
                            i27 = (i27 + 6) % 64;
                            i28 = (i28 + 6) % 64;
                            iQ2 = vfVar2.af.q(iQ2);
                            i25 = i9;
                        }
                        vfVar2.ar = jRotateLeft;
                        vfVar2.aj = null;
                        gv gvVar = hi0Var.d;
                        if (gvVar == null) {
                            wc.q("Invalid restart scope");
                            return;
                        }
                        gvVar.f(vfVar2, Integer.valueOf(i17));
                        vfVar2.aj = null;
                        rq0 rq0Var4 = vfVar2.af;
                        int i30 = rq0Var4.b[i] + i10;
                        int i31 = rq0Var4.g;
                        if (((i31 < i10 || i31 > i30) ? 0 : i17) == 0) {
                            xf.c("Index " + i10 + " is not a parent of " + i31);
                        }
                        rq0Var4.i = i10;
                        rq0Var4.h = i30;
                        rq0Var4.l = 0;
                        rq0Var4.m = 0;
                        vfVar = vfVar2;
                        j2 = j4;
                        i18 = i9;
                        i19 = i17;
                    } else {
                        ArrayList arrayList2 = vfVar2.ad;
                        arrayList2.add(hi0Var);
                        jg jgVar = hi0Var.a;
                        if (jgVar == null || (l80Var = hi0Var.f) == null) {
                            j2 = j4;
                        } else {
                            hi0Var.d(i17);
                            try {
                                Object[] objArr3 = l80Var.b;
                                int[] iArr2 = l80Var.c;
                                long[] jArr2 = l80Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j6 = jArr2[i32];
                                        j2 = j4;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j6 & 255) < 128) {
                                                    int i35 = (i32 << 3) + i34;
                                                    j3 = j6;
                                                    Object obj3 = objArr4[i35];
                                                    int i36 = iArr2[i35];
                                                    jgVar.u(obj3);
                                                } else {
                                                    j3 = j6;
                                                }
                                                i34++;
                                                j6 = j3 >> 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 == length2) {
                                            break;
                                        }
                                        i32++;
                                        objArr3 = objArr4;
                                        j4 = j2;
                                    }
                                } else {
                                    j2 = j4;
                                }
                                hi0Var.d(false);
                            } catch (Throwable th) {
                                hi0Var.d(false);
                                throw th;
                            }
                        }
                        i17 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                        vfVar = this;
                    }
                    iE = xf.e(vfVar.af.g, arrayList);
                    if (iE < 0) {
                        iE = -(iE + 1);
                    }
                    if (iE >= arrayList.size()) {
                        o00Var2 = (o00) arrayList.get(iE);
                        i8 = i3;
                        if (o00Var2.b < i8) {
                        }
                        vfVar2 = vfVar;
                        i12 = i8;
                        i11 = i;
                        i13 = i2;
                        i14 = i4;
                        i15 = i5;
                        j4 = j2;
                        o00Var = o00Var2;
                        bwVar = bwVar2;
                    } else {
                        i8 = i3;
                    }
                    o00Var2 = null;
                    vfVar2 = vfVar;
                    i12 = i8;
                    i11 = i;
                    i13 = i2;
                    i14 = i4;
                    i15 = i5;
                    j4 = j2;
                    o00Var = o00Var2;
                    bwVar = bwVar2;
                }
            }
            i4 = i14;
            i5 = i15;
            i6 = i17;
            if (i6 == 0) {
            }
            iE = xf.e(vfVar.af.g, arrayList);
            if (iE < 0) {
            }
            if (iE >= arrayList.size()) {
            }
            o00Var2 = null;
            vfVar2 = vfVar;
            i12 = i8;
            i11 = i;
            i13 = i2;
            i14 = i4;
            i15 = i5;
            j4 = j2;
            o00Var = o00Var2;
            bwVar = bwVar2;
        }
        vf vfVar3 = vfVar2;
        int i37 = i13;
        long j7 = j4;
        int i38 = i14;
        int i39 = i15;
        if (i19 != 0) {
            vfVar3.aj(i18, i10, i10);
            vfVar3.af.t();
            int iBg3 = vfVar3.bg(i10);
            vfVar3.j = i37 + iBg3;
            vfVar3.k = i38 + iBg3;
            vfVar3.l = i39;
        } else {
            vfVar3.ap();
        }
        vfVar3.ar = j7;
        vfVar3.ae = z;
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
    */
    public final void aj(int i, int i2, int i3) {
        rq0 rq0Var = this.af;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (rq0Var.q(i) == i2) {
                    i3 = i2;
                } else if (rq0Var.q(i2) == i) {
                    i3 = i;
                } else if (rq0Var.q(i) == rq0Var.q(i2)) {
                    i3 = rq0Var.q(i);
                } else {
                    int iQ = i;
                    int i4 = 0;
                    while (iQ > 0 && iQ != i3) {
                        iQ = rq0Var.q(iQ);
                        i4++;
                    }
                    int iQ2 = i2;
                    int i5 = 0;
                    while (iQ2 > 0 && iQ2 != i3) {
                        iQ2 = rq0Var.q(iQ2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iQ3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iQ3 = rq0Var.q(iQ3);
                    }
                    int i8 = i5 - i4;
                    int iQ4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iQ4 = rq0Var.q(iQ4);
                    }
                    i3 = iQ3;
                    for (int iQ5 = iQ4; i3 != iQ5; iQ5 = rq0Var.q(iQ5)) {
                        i3 = rq0Var.q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (rq0Var.l(i)) {
                this.al.a();
            }
            i = rq0Var.q(i);
        }
        p(i2, i3);
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
    */
    public final void ao() {
        int i;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.r.isEmpty()) {
            this.k = this.af.s() + this.k;
            return;
        }
        rq0 rq0Var = this.af;
        int iG = rq0Var.g();
        int[] iArr = rq0Var.b;
        int i2 = rq0Var.g;
        Object objP = i2 < rq0Var.h ? rq0Var.p(iArr, i2) : null;
        Object objF = rq0Var.f();
        int i3 = this.l;
        n31 n31Var = nf.a;
        if (objP != null) {
            if (objP instanceof Enum) {
                jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.ar, 3), 3);
                i = 0;
            } else {
                i = 0;
                jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.ar, 3), 3);
            }
            jRotateLeft2 = jRotateLeft ^ ((long) i);
        } else {
            if (objF != null && iG == 207 && !objF.equals(n31Var)) {
                this.ar = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.ar, 3), 3) ^ ((long) i3);
                au(null, (iArr[(rq0Var.g * 5) + 1] & 1073741824) != 0);
                ag();
                rq0Var.e();
                if (objP == null) {
                    if (objP instanceof Enum) {
                        this.ar = Long.rotateRight(Long.rotateRight(this.ar ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                        return;
                    } else {
                        this.ar = Long.rotateRight(Long.rotateRight(this.ar ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                        return;
                    }
                }
                if (objF == null || iG != 207 || objF.equals(n31Var)) {
                    this.ar = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.ar ^ ((long) i3), 3), 3);
                    return;
                } else {
                    this.ar = Long.rotateRight(Long.rotateRight(this.ar ^ ((long) i3), 3) ^ ((long) objF.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.ar, 3) ^ ((long) iG), 3) ^ ((long) i3);
        }
        this.ar = jRotateLeft2;
        au(null, (iArr[(rq0Var.g * 5) + 1] & 1073741824) != 0);
        ag();
        rq0Var.e();
        if (objP == null) {
        }
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
    */
    public final void ar(int i, ob0 ob0Var, int i2, a aVar) {
        long jRotateLeft;
        long j;
        boolean z;
        se0 se0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        ob0 ob0Var2 = ob0Var;
        if (this.q) {
            xf.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.l;
        Object obj = nf.a;
        if (ob0Var2 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.ar, 3) ^ ((long) ob0Var2.a.hashCode()), 3);
            j = 0;
        } else {
            if (aVar != null && i == 207 && !aVar.equals(obj)) {
                this.ar = Long.rotateLeft(Long.rotateLeft(this.ar, 3) ^ ((long) aVar.hashCode()), 3) ^ ((long) i9);
                if (ob0Var2 == null) {
                    this.l++;
                }
                boolean z3 = i2 == 0;
                if (!this.aq) {
                    this.af.k++;
                    vq0 vq0Var = this.ah;
                    int i10 = vq0Var.t;
                    Object obj2 = ob0Var2;
                    Object obj3 = ob0Var2;
                    if (z3) {
                        vq0Var.ao(i, obj, true, obj);
                    } else if (aVar != null) {
                        if (ob0Var2 == null) {
                            obj2 = obj;
                        }
                        vq0Var.ao(i, obj2, false, aVar);
                    } else {
                        if (ob0Var2 == null) {
                            obj3 = obj;
                        }
                        vq0Var.ao(i, obj3, false, obj);
                    }
                    se0 se0Var2 = this.i;
                    if (se0Var2 != null) {
                        int i11 = (-2) - i10;
                        n10 n10Var = new n10(-1, i, i11, -1);
                        se0Var2.e.g(i11, new sw(-1, this.j - se0Var2.b, 0));
                        se0Var2.d.add(n10Var);
                    }
                    u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.x;
                if (this.i == null) {
                    int iG = this.af.g();
                    if (!z4 && iG == i) {
                        rq0 rq0Var = this.af;
                        int i12 = rq0Var.g;
                        if (f00.h(ob0Var2, i12 < rq0Var.h ? rq0Var.p(rq0Var.b, i12) : null)) {
                            au(aVar, z3);
                            z = z4;
                        }
                    }
                    rq0 rq0Var2 = this.af;
                    int[] iArr = rq0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (rq0Var2.k <= 0) {
                        int i13 = rq0Var2.g;
                        while (i13 < rq0Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objP = rq0Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new n10(objP, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.i = new se0(this.j, arrayList);
                } else {
                    z = z4;
                }
                se0 se0Var3 = this.i;
                if (se0Var3 != null) {
                    ArrayList arrayList2 = se0Var3.d;
                    e80 e80Var = se0Var3.e;
                    int i17 = se0Var3.b;
                    Object b10Var = ob0Var2 != null ? new b10(Integer.valueOf(i), ob0Var2) : Integer.valueOf(i);
                    q80 q80Var = ((a80) se0Var3.f.getValue()).a;
                    Object objG = q80Var.g(b10Var);
                    if (objG == null) {
                        objG = null;
                    } else if (objG instanceof m80) {
                        m80 m80Var = (m80) objG;
                        Object objJ = m80Var.j(0);
                        if (m80Var.g()) {
                            q80Var.j(b10Var);
                        }
                        if (m80Var.b == 1) {
                            q80Var.l(b10Var, m80Var.d());
                        }
                        objG = objJ;
                    } else {
                        q80Var.j(b10Var);
                    }
                    n10 n10Var2 = (n10) objG;
                    if (z || n10Var2 == null) {
                        this.af.k++;
                        this.aq = true;
                        this.aj = null;
                        if (this.ah.w) {
                            vq0 vq0VarD = this.ag.d();
                            this.ah = vq0VarD;
                            vq0VarD.ak();
                            this.ai = false;
                            this.aj = null;
                        }
                        this.ah.d();
                        vq0 vq0Var2 = this.ah;
                        int i18 = vq0Var2.t;
                        if (z3) {
                            vq0Var2.ao(i, obj, true, obj);
                            i3 = 0;
                        } else if (aVar != null) {
                            if (ob0Var != null) {
                                obj = ob0Var;
                            }
                            i3 = 0;
                            vq0Var2.ao(i, obj, false, aVar);
                        } else {
                            i3 = 0;
                            vq0Var2.ao(i, ob0Var == null ? obj : ob0Var, false, obj);
                        }
                        this.am = this.ah.b(i18);
                        int i19 = (-2) - i18;
                        n10 n10Var3 = new n10(-1, i, i19, -1);
                        e80Var.g(i19, new sw(-1, this.j - i17, i3));
                        arrayList2.add(n10Var3);
                        se0Var = new se0(z3 ? i3 : this.j, new ArrayList());
                    } else {
                        int i20 = n10Var2.c;
                        arrayList2.add(n10Var2);
                        sw swVar = (sw) e80Var.b(i20);
                        this.j = (swVar != null ? swVar.b : -1) + i17;
                        sw swVar2 = (sw) e80Var.b(i20);
                        int i21 = swVar2 != null ? swVar2.a : -1;
                        int i22 = se0Var3.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = e80Var.c;
                            long[] jArr = e80Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j2 = jArr[i25];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j2 & 255) < 128) {
                                                i7 = i24;
                                                sw swVar3 = (sw) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = swVar3.a;
                                                if (i28 == i21) {
                                                    swVar3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    swVar3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j2 >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = e80Var.c;
                                long[] jArr2 = e80Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j3 = jArr2[i29];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j3 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    sw swVar4 = (sw) objArr4[(i29 << 3) + i31];
                                                    int i32 = swVar4.a;
                                                    if (i32 == i21) {
                                                        swVar4.a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            swVar4.a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j3 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        of ofVar = this.al;
                        int i33 = ofVar.f;
                        vf vfVar = ofVar.a;
                        ofVar.f = (i20 - vfVar.af.g) + i33;
                        this.af.r(i20);
                        if (i4 > 0) {
                            ofVar.d(false);
                            xz xzVar = ofVar.d;
                            rq0 rq0Var3 = vfVar.af;
                            if (rq0Var3.c > 0 && xzVar.a(-2) != (i5 = rq0Var3.i)) {
                                if (!ofVar.c && ofVar.e) {
                                    ofVar.d(false);
                                    ofVar.b.k.ar(bc0.c);
                                    ofVar.c = true;
                                }
                                if (i5 > 0) {
                                    Il ilA = rq0Var3.a(i5);
                                    xzVar.c(i5);
                                    ofVar.d(false);
                                    vc0 vc0Var = ofVar.b.k;
                                    vc0Var.ar(ac0.c);
                                    e00.aj(vc0Var, 0, ilA);
                                    ofVar.c = true;
                                }
                            }
                            vc0 vc0Var2 = ofVar.b.k;
                            vc0Var2.ar(fc0.c);
                            vc0Var2.m[vc0Var2.n - vc0Var2.k[vc0Var2.l - 1].a] = i4;
                        }
                        au(aVar, z3);
                        se0Var = null;
                    }
                } else {
                    se0Var = null;
                }
                u(z3, se0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.ar, 3) ^ ((long) i), 3);
            j = i9;
        }
        this.ar = jRotateLeft ^ j;
        if (ob0Var2 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.aq) {
        }
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
    */
    public final vf aw(int i) {
        hi0 hi0Var;
        boolean z;
        av(i);
        boolean z2 = this.aq;
        ArrayList arrayList = this.ad;
        jg jgVar = this.g;
        if (z2) {
            hi0 hi0Var2 = new hi0(jgVar);
            arrayList.add(hi0Var2);
            bf(hi0Var2);
            hi0Var2.e = this.aa;
            hi0Var2.b &= -17;
            return this;
        }
        int i2 = this.af.i;
        ArrayList arrayList2 = this.r;
        int iE = xf.e(i2, arrayList2);
        o00 o00Var = iE >= 0 ? (o00) arrayList2.remove(iE) : null;
        Object objM = this.af.m();
        if (f00.h(objM, nf.a)) {
            hi0Var = new hi0(jgVar);
            bf(hi0Var);
        } else {
            objM.getClass();
            hi0Var = (hi0) objM;
        }
        if (o00Var == null) {
            int i3 = hi0Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                hi0Var.b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = hi0Var.b;
        hi0Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(hi0Var);
        hi0Var.e = this.aa;
        int i5 = hi0Var.b;
        hi0Var.b = i5 & (-17);
        if ((i5 & 256) != 0) {
            hi0Var.b = (i5 & (-273)) | 512;
            vc0 vc0Var = this.al.b.k;
            vc0Var.ar(nc0.c);
            e00.aj(vc0Var, 0, hi0Var);
            if (!this.x) {
                int i6 = hi0Var.b;
                if ((i6 & 128) != 0) {
                    this.x = true;
                    hi0Var.b = i6 | 1024;
                }
            }
        }
        return this;
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
    */
    public final void ba(q80 q80Var) {
        ArrayList arrayList = this.r;
        for (int iV = f00.v(arrayList); -1 < iV; iV--) {
            o00 o00Var = (o00) arrayList.get(iV);
            Il il = o00Var.a.c;
            if (il == null || !il.a()) {
                arrayList.remove(iV);
            } else {
                int i = o00Var.b;
                int i2 = il.a;
                if (i != i2) {
                    o00Var.b = i2;
                }
            }
        }
        Object[] objArr = q80Var.b;
        Object[] objArr2 = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            hi0 hi0Var = (hi0) obj;
                            Il il2 = hi0Var.c;
                            if (il2 != null) {
                                int i7 = il2.a;
                                if (obj2 == bw.an) {
                                    obj2 = null;
                                }
                                arrayList.add(new o00(hi0Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        oc.ao(arrayList, xf.f);
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
    */
    public final void q(boolean z) {
        long jRotateRight;
        xz xzVar;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        xz xzVar2;
        int i7;
        int i8;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        se0 se0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        xz xzVar3 = this.m;
        int i16 = xzVar3.a[xzVar3.b - 2] - 1;
        boolean z2 = this.aq;
        n31 n31Var = nf.a;
        if (z2) {
            vq0 vq0Var = this.ah;
            int i17 = vq0Var.v;
            int i18 = vq0Var.b[vq0Var.q(i17) * 5];
            Object objR = this.ah.r(i17);
            Object objP = this.ah.p(i17);
            if (objR != null) {
                jRotateRight2 = Long.rotateRight(this.ar ^ ((long) 0), 3) ^ ((long) (objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()));
            } else if (objP == null || i18 != 207 || objP.equals(n31Var)) {
                jRotateRight2 = Long.rotateRight(this.ar ^ ((long) i16), 3) ^ ((long) i18);
            } else {
                this.ar = Long.rotateRight(Long.rotateRight(this.ar ^ ((long) i16), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.ar = Long.rotateRight(jRotateRight2, 3);
        } else {
            rq0 rq0Var = this.af;
            int i19 = rq0Var.i;
            int i20 = rq0Var.i(i19);
            rq0 rq0Var2 = this.af;
            Object objP2 = rq0Var2.p(rq0Var2.b, i19);
            rq0 rq0Var3 = this.af;
            Object objB = rq0Var3.b(rq0Var3.b, i19);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.ar ^ ((long) 0), 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i20 != 207 || objB.equals(n31Var)) {
                jRotateRight = Long.rotateRight(this.ar ^ ((long) i16), 3) ^ ((long) i20);
            } else {
                this.ar = Long.rotateRight(Long.rotateRight(this.ar ^ ((long) i16), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.ar = Long.rotateRight(jRotateRight, 3);
        }
        int i21 = this.k;
        se0 se0Var2 = this.i;
        ArrayList arrayList5 = this.r;
        of ofVar = this.al;
        if (se0Var2 != null) {
            e80 e80Var = se0Var2.e;
            int i22 = se0Var2.b;
            ArrayList arrayList6 = se0Var2.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = se0Var2.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i23 = 0; i23 < size; i23++) {
                    hashSet2.add(arrayList7.get(i23));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i24 < size3) {
                    n10 n10Var = (n10) arrayList6.get(i24);
                    if (hashSet2.contains(n10Var)) {
                        xzVar2 = xzVar3;
                        i7 = i24;
                        if (!linkedHashSet2.contains(n10Var)) {
                            int i27 = i25;
                            if (i27 < size2) {
                                n10 n10Var2 = (n10) arrayList7.get(i27);
                                if (n10Var2 != n10Var) {
                                    sw swVar = (sw) e80Var.b(n10Var2.c);
                                    int i28 = swVar != null ? swVar.b : -1;
                                    linkedHashSet2.add(n10Var2);
                                    i8 = i27;
                                    i11 = i26;
                                    se0Var = se0Var2;
                                    if (i28 != i11) {
                                        sw swVar2 = (sw) e80Var.b(n10Var2.c);
                                        int i29 = swVar2 != null ? swVar2.c : n10Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i30 = i28 + i22;
                                        i9 = size2;
                                        int i31 = i11 + i22;
                                        if (i29 > 0) {
                                            i10 = i22;
                                            int i32 = ofVar.l;
                                            if (i32 > 0) {
                                                arrayList3 = arrayList6;
                                                if (ofVar.j == i30 - i32 && ofVar.k == i31 - i32) {
                                                    ofVar.l = i32 + i29;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            ofVar.c();
                                            ofVar.j = i30;
                                            ofVar.k = i31;
                                            ofVar.l = i29;
                                        } else {
                                            i10 = i22;
                                            arrayList3 = arrayList6;
                                            ofVar.getClass();
                                        }
                                        if (i28 > i11) {
                                            Object[] objArr5 = e80Var.c;
                                            long[] jArr5 = e80Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j = jArr5[i33];
                                                    int i34 = i29;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i36;
                                                                sw swVar3 = (sw) objArr5[(i33 << 3) + i36];
                                                                objArr4 = objArr5;
                                                                int i37 = swVar3.b;
                                                                jArr4 = jArr5;
                                                                if (i28 <= i37 && i37 < i28 + i34) {
                                                                    swVar3.b = (i37 - i28) + i11;
                                                                } else if (i11 <= i37 && i37 < i28) {
                                                                    swVar3.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i15 = i36;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i36 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i33 == length) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList5 = arrayList2;
                                                    i29 = i34;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i38 = i29;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i28) {
                                                Object[] objArr6 = e80Var.c;
                                                long[] jArr6 = e80Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i39 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i39];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i40 = 8 - ((~(i39 - length2)) >>> 31);
                                                            int i41 = 0;
                                                            while (i41 < i40) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    sw swVar4 = (sw) objArr6[(i39 << 3) + i41];
                                                                    jArr2 = jArr6;
                                                                    int i42 = swVar4.b;
                                                                    i14 = i28;
                                                                    if (i28 <= i42 && i42 < i14 + i38) {
                                                                        swVar4.b = (i42 - i14) + i11;
                                                                    } else if (i14 + 1 <= i42 && i42 < i11) {
                                                                        swVar4.b = i42 - i38;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i28;
                                                                }
                                                                j2 >>= 8;
                                                                i41++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i28 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i28;
                                                            if (i40 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i28;
                                                        }
                                                        if (i39 == length2) {
                                                            break;
                                                        }
                                                        i39++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i28 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i9 = size2;
                                        i10 = i22;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i27;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i9 = size2;
                                    i10 = i22;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i26;
                                    se0Var = se0Var2;
                                    i12 = i7 + 1;
                                }
                                i25 = i8 + 1;
                                sw swVar5 = (sw) e80Var.b(n10Var2.c);
                                int i43 = i11 + (swVar5 != null ? swVar5.c : n10Var2.d);
                                i24 = i12;
                                se0Var2 = se0Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i9;
                                i22 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i26 = i43;
                                xzVar3 = xzVar2;
                            } else {
                                i25 = i27;
                                xzVar3 = xzVar2;
                                i24 = i7;
                            }
                        }
                    } else {
                        xzVar2 = xzVar3;
                        sw swVar6 = (sw) e80Var.b(n10Var.c);
                        int i44 = swVar6 != null ? swVar6.b : -1;
                        int i45 = n10Var.c;
                        i7 = i24;
                        ofVar.e(i44 + i22, n10Var.d);
                        se0Var2.a(i45, 0);
                        ofVar.f = (i45 - ofVar.a.af.g) + ofVar.f;
                        this.af.r(i45);
                        ah();
                        this.af.s();
                        xf.a(arrayList5, i45, this.af.b[(i45 * 5) + 3] + i45);
                    }
                    i24 = i7 + 1;
                    xzVar3 = xzVar2;
                }
                xzVar = xzVar3;
                arrayList = arrayList5;
                ofVar.c();
                if (arrayList6.size() > 0) {
                    rq0 rq0Var4 = this.af;
                    ofVar.f = (rq0Var4.h - ofVar.a.af.g) + ofVar.f;
                    rq0Var4.t();
                }
            } else {
                xzVar = xzVar3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.aq;
        if (!z3) {
            rq0 rq0Var5 = this.af;
            int i46 = rq0Var5.m - rq0Var5.l;
            if (i46 > 0) {
                if (i46 > 0) {
                    ofVar.d(false);
                    xz xzVar4 = ofVar.d;
                    rq0 rq0Var6 = ofVar.a.af;
                    if (rq0Var6.c > 0 && xzVar4.a(-2) != (i6 = rq0Var6.i)) {
                        if (!ofVar.c && ofVar.e) {
                            ofVar.d(false);
                            ofVar.b.k.ar(bc0.c);
                            ofVar.c = true;
                        }
                        if (i6 > 0) {
                            Il ilA = rq0Var6.a(i6);
                            xzVar4.c(i6);
                            ofVar.d(false);
                            vc0 vc0Var = ofVar.b.k;
                            vc0Var.ar(ac0.c);
                            e00.aj(vc0Var, 0, ilA);
                            ofVar.c = true;
                        }
                    }
                    vc0 vc0Var2 = ofVar.b.k;
                    vc0Var2.ar(oc0.c);
                    vc0Var2.m[vc0Var2.n - vc0Var2.k[vc0Var2.l - 1].a] = i46;
                } else {
                    ofVar.getClass();
                }
            }
        }
        int i47 = this.j;
        while (true) {
            rq0 rq0Var7 = this.af;
            if (rq0Var7.k > 0 || (i5 = rq0Var7.g) == rq0Var7.h) {
                break;
            }
            ah();
            ofVar.e(i47, this.af.s());
            xf.a(arrayList, i5, this.af.g);
        }
        if (z3) {
            if (z) {
                pr prVar = this.an;
                vc0 vc0Var3 = prVar.l;
                if (!vc0Var3.aq()) {
                    xf.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                vc0 vc0Var4 = prVar.k;
                tc0[] tc0VarArr = vc0Var3.k;
                int i48 = vc0Var3.l - 1;
                vc0Var3.l = i48;
                tc0 tc0Var = tc0VarArr[i48];
                tc0VarArr[i48] = null;
                vc0Var4.ar(tc0Var);
                Object[] objArr7 = vc0Var3.o;
                Object[] objArr8 = vc0Var4.o;
                int i49 = vc0Var4.p;
                int i50 = tc0Var.b;
                int i51 = vc0Var3.p;
                int i52 = i51 - i50;
                System.arraycopy(objArr7, i52, objArr8, i49 - i50, i51 - i52);
                Object[] objArr9 = vc0Var3.o;
                int i53 = vc0Var3.p;
                Arrays.fill(objArr9, i53 - i50, i53, (Object) null);
                int[] iArr = vc0Var3.m;
                int[] iArr2 = vc0Var4.m;
                int i54 = vc0Var4.n;
                int i55 = tc0Var.a;
                int i56 = vc0Var3.n;
                h7.as(iArr, iArr2, i54 - i55, i56 - i55, i56);
                vc0Var3.p -= i50;
                vc0Var3.n -= i55;
                i21 = 1;
            }
            if (this.af.k <= 0) {
                dh0.a("Unbalanced begin/end empty");
            }
            r4.k--;
            vq0 vq0Var2 = this.ah;
            int i57 = vq0Var2.v;
            vq0Var2.j();
            if (this.af.k <= 0) {
                int i58 = (-2) - i57;
                this.ah.k();
                this.ah.e(true);
                Il il = this.am;
                boolean zAp = this.an.k.ap();
                sq0 sq0Var = this.ag;
                if (zAp) {
                    ofVar.b();
                    ofVar.d(false);
                    xz xzVar5 = ofVar.d;
                    rq0 rq0Var8 = ofVar.a.af;
                    if (rq0Var8.c <= 0 || xzVar5.a(-2) == (i4 = rq0Var8.i)) {
                        i3 = 1;
                        ofVar.c();
                        vc0 vc0Var5 = ofVar.b.k;
                        vc0Var5.ar(dc0.c);
                        e00.ak(vc0Var5, 0, il, i3, sq0Var);
                        r3 = 0;
                    } else {
                        if (!ofVar.c && ofVar.e) {
                            ofVar.d(false);
                            ofVar.b.k.ar(bc0.c);
                            ofVar.c = true;
                        }
                        if (i4 > 0) {
                            Il ilA2 = rq0Var8.a(i4);
                            xzVar5.c(i4);
                            ofVar.d(false);
                            vc0 vc0Var6 = ofVar.b.k;
                            vc0Var6.ar(ac0.c);
                            e00.aj(vc0Var6, 0, ilA2);
                            i3 = 1;
                            ofVar.c = true;
                        }
                        ofVar.c();
                        vc0 vc0Var52 = ofVar.b.k;
                        vc0Var52.ar(dc0.c);
                        e00.ak(vc0Var52, 0, il, i3, sq0Var);
                        r3 = 0;
                    }
                } else {
                    pr prVar2 = this.an;
                    ofVar.b();
                    ofVar.d(false);
                    xz xzVar6 = ofVar.d;
                    rq0 rq0Var9 = ofVar.a.af;
                    if (rq0Var9.c > 0 && xzVar6.a(-2) != (i2 = rq0Var9.i)) {
                        if (!ofVar.c && ofVar.e) {
                            ofVar.d(false);
                            ofVar.b.k.ar(bc0.c);
                            ofVar.c = true;
                        }
                        if (i2 > 0) {
                            Il ilA3 = rq0Var9.a(i2);
                            xzVar6.c(i2);
                            ofVar.d(false);
                            vc0 vc0Var7 = ofVar.b.k;
                            vc0Var7.ar(ac0.c);
                            e00.aj(vc0Var7, 0, ilA3);
                            ofVar.c = true;
                        }
                    }
                    ofVar.c();
                    vc0 vc0Var8 = ofVar.b.k;
                    vc0Var8.ar(ec0.c);
                    int i59 = vc0Var8.p - vc0Var8.k[vc0Var8.l - 1].b;
                    Object[] objArr10 = vc0Var8.o;
                    objArr10[i59] = il;
                    objArr10[i59 + 1] = sq0Var;
                    objArr10[i59 + 2] = prVar2;
                    this.an = new pr();
                    r3 = 0;
                }
                this.aq = r3;
                if (this.c.e != 0) {
                    bb(i58, r3);
                    bc(i58, i21);
                }
            }
        } else {
            if (z) {
                ofVar.a();
            }
            int i60 = ofVar.a.af.i;
            xz xzVar7 = ofVar.d;
            int i61 = i;
            if (xzVar7.a(i61) > i60) {
                xf.c("Missed recording an endGroup");
            }
            if (xzVar7.a(i61) == i60) {
                ofVar.d(false);
                xzVar7.b();
                ofVar.b.k.ar(xb0.c);
            }
            int i62 = this.af.i;
            if (i21 != bg(i62)) {
                bc(i62, i21);
            }
            if (z) {
                i21 = 1;
            }
            this.af.e();
            ofVar.c();
        }
        se0 se0Var3 = (se0) this.h.remove(r3.size() - 1);
        if (se0Var3 != null && !z3) {
            se0Var3.c++;
        }
        this.i = se0Var3;
        this.j = xzVar.b() + i21;
        this.l = xzVar.b();
        this.k = xzVar.b() + i21;
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
    */
    public final hi0 s() {
        hi0 hi0Var;
        Il ilA;
        cv cvVar;
        int i;
        ArrayList arrayList = this.ad;
        final hi0 hi0Var2 = !arrayList.isEmpty() ? (hi0) arrayList.remove(arrayList.size() - 1) : null;
        if (hi0Var2 != null) {
            int i2 = hi0Var2.b;
            hi0Var2.b = i2 & (-9);
            final int i3 = this.aa;
            final l80 l80Var = hi0Var2.f;
            if (l80Var == null || (i2 & 16) != 0) {
                cvVar = null;
                of ofVar = this.al;
                if (cvVar != null) {
                    vc0 vc0Var = ofVar.b.k;
                    vc0Var.ar(wb0.c);
                    e00.ak(vc0Var, 0, cvVar, 1, this.g);
                }
                i = hi0Var2.b;
                if ((i & 512) != 0) {
                    hi0Var2.b = i & (-513);
                    vc0 vc0Var2 = ofVar.b.k;
                    vc0Var2.ar(zb0.c);
                    e00.aj(vc0Var2, 0, hi0Var2);
                    int i4 = hi0Var2.b;
                    hi0Var2.b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        hi0Var2.b = i4 & (-1153);
                        this.x = false;
                    }
                }
            } else {
                Object[] objArr = l80Var.b;
                int[] iArr = l80Var.c;
                long[] jArr = l80Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        cvVar = new cv() { // from class: gi0
                                            @Override // defpackage.cv
                                            public final Object g(Object obj2) {
                                                zf zfVar;
                                                zf zfVar2;
                                                int i9;
                                                zf zfVar3 = (zf) obj2;
                                                hi0 hi0Var3 = hi0Var2;
                                                int i10 = hi0Var3.e;
                                                int i11 = i3;
                                                if (i10 == i11) {
                                                    l80 l80Var2 = hi0Var3.f;
                                                    l80 l80Var3 = l80Var;
                                                    if (f00.h(l80Var3, l80Var2) && (zfVar3 instanceof jg)) {
                                                        long[] jArr2 = l80Var3.a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                long j2 = jArr2[i12];
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i13 = 8;
                                                                    int i14 = 8 - ((~(i12 - length2)) >>> 31);
                                                                    int i15 = 0;
                                                                    while (i15 < i14) {
                                                                        if ((255 & j2) < 128) {
                                                                            int i16 = (i12 << 3) + i15;
                                                                            Object obj3 = l80Var3.b[i16];
                                                                            boolean z = l80Var3.c[i16] != i11;
                                                                            if (z) {
                                                                                i9 = i13;
                                                                                jg jgVar = (jg) zfVar3;
                                                                                q80 q80Var = jgVar.j;
                                                                                i60.av(q80Var, obj3, hi0Var3);
                                                                                zfVar2 = zfVar3;
                                                                                if (obj3 instanceof km) {
                                                                                    km kmVar = (km) obj3;
                                                                                    if (!q80Var.c(kmVar)) {
                                                                                        i60.aw(jgVar.m, kmVar);
                                                                                    }
                                                                                    q80 q80Var2 = hi0Var3.g;
                                                                                    if (q80Var2 != null) {
                                                                                        q80Var2.j(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                zfVar2 = zfVar3;
                                                                                i9 = i13;
                                                                            }
                                                                            if (z) {
                                                                                l80Var3.g(i16);
                                                                            }
                                                                        } else {
                                                                            zfVar2 = zfVar3;
                                                                            i9 = i13;
                                                                        }
                                                                        j2 >>= i9;
                                                                        i15++;
                                                                        i13 = i9;
                                                                        zfVar3 = zfVar2;
                                                                    }
                                                                    zfVar = zfVar3;
                                                                    if (i14 != i13) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    zfVar = zfVar3;
                                                                }
                                                                if (i12 == length2) {
                                                                    break;
                                                                }
                                                                i12++;
                                                                zfVar3 = zfVar;
                                                            }
                                                        }
                                                    }
                                                }
                                                return wz0.a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    cvVar = null;
                    of ofVar2 = this.al;
                    if (cvVar != null) {
                    }
                    i = hi0Var2.b;
                    if ((i & 512) != 0) {
                    }
                }
            }
        }
        if (hi0Var2 != null) {
            int i9 = hi0Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.p)) {
                if (hi0Var2.c == null) {
                    if (this.aq) {
                        vq0 vq0Var = this.ah;
                        ilA = vq0Var.b(vq0Var.v);
                    } else {
                        rq0 rq0Var = this.af;
                        ilA = rq0Var.a(rq0Var.i);
                    }
                    hi0Var2.c = ilA;
                }
                hi0Var2.b &= -5;
                hi0Var = hi0Var2;
            } else {
                hi0Var = null;
            }
        }
        q(false);
        return hi0Var;
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
