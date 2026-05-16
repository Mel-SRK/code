package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mx {
    public final d20 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final m80 f = new m80();
    public final ka0 g = new ka0();
    public final i80 h;

    public mx(d20 d20Var) {
        this.a = d20Var;
        i80 i80Var = new i80();
        i80Var.a = mm0.a;
        i80Var.b = d50.a;
        i80Var.c = e00.k;
        i80Var.c(mm0.d(10));
        this.h = i80Var;
    }

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
    public final void a(long j, List list, boolean z) {
        long j2;
        int i;
        char c;
        long j3;
        aa0 aa0Var;
        Object obj;
        i80 i80Var = this.h;
        i80Var.e = 0;
        long[] jArr = i80Var.a;
        char c2 = 7;
        if (jArr != mm0.a) {
            h7.az(jArr);
            long[] jArr2 = i80Var.a;
            int i2 = i80Var.d;
            int i3 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            j2 = 255;
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        } else {
            j2 = 255;
        }
        h7.ay(i80Var.c, 0, i80Var.d);
        i80Var.f = mm0.a(i80Var.d) - i80Var.e;
        int size = list.size();
        ka0 ka0Var = this.g;
        int i4 = 0;
        boolean z2 = true;
        ka0 ka0Var2 = ka0Var;
        while (i4 < size) {
            i70 i70Var = (i70) list.get(i4);
            if (i70Var.q) {
                i70Var.p = new s0(9, this, i70Var);
                if (z2) {
                    a90 a90Var = ka0Var2.a;
                    Object[] objArr = a90Var.d;
                    int i5 = a90Var.f;
                    c = c2;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            j3 = j2;
                            obj = null;
                            break;
                        }
                        obj = objArr[i6];
                        j3 = j2;
                        if (f00.h(((aa0) obj).c, i70Var)) {
                            break;
                        }
                        i6++;
                        j2 = j3;
                    }
                    aa0Var = (aa0) obj;
                    if (aa0Var != null) {
                        aa0Var.i = true;
                        aa0Var.d.a(j);
                        Object objB = i80Var.b(j);
                        m80 m80Var = objB;
                        if (objB == null) {
                            m80 m80Var2 = new m80();
                            i80Var.d(j, m80Var2);
                            m80Var = m80Var2;
                        }
                        m80Var.a(aa0Var);
                        ka0Var2 = aa0Var;
                    } else {
                        z2 = false;
                    }
                } else {
                    c = c2;
                    j3 = j2;
                }
                aa0Var = new aa0(i70Var);
                aa0Var.d.a(j);
                Object objB2 = i80Var.b(j);
                m80 m80Var3 = objB2;
                if (objB2 == null) {
                    m80 m80Var4 = new m80();
                    i80Var.d(j, m80Var4);
                    m80Var3 = m80Var4;
                }
                m80Var3.a(aa0Var);
                ka0Var2.a.b(aa0Var);
                ka0Var2 = aa0Var;
            } else {
                c = c2;
                j3 = j2;
            }
            i4++;
            c2 = c;
            j2 = j3;
        }
        char c3 = c2;
        long j5 = j2;
        if (!z) {
            return;
        }
        long[] jArr3 = i80Var.b;
        Object[] objArr2 = i80Var.c;
        long[] jArr4 = i80Var.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j6 = jArr4[i7];
            if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j6 & j5) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j7 = jArr3[i11];
                        m80 m80Var5 = (m80) objArr2[i11];
                        a90 a90Var2 = ka0Var.a;
                        i = i8;
                        Object[] objArr3 = a90Var2.d;
                        int i12 = a90Var2.f;
                        for (int i13 = 0; i13 < i12; i13++) {
                            ((aa0) objArr3[i13]).f(j7, m80Var5);
                        }
                    } else {
                        i = i8;
                    }
                    j6 >>= i;
                    i10++;
                    i8 = i;
                }
                if (i9 != i8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final boolean b(f1 f1Var, boolean z) {
        e50 e50Var = (e50) f1Var.e;
        d20 d20Var = this.a;
        ka0 ka0Var = this.g;
        boolean zA = ka0Var.a(e50Var, d20Var, f1Var, z);
        a90 a90Var = ka0Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((aa0) objArr[i2]).e(f1Var, z) || z3;
        }
        Object[] objArr2 = a90Var.d;
        int i3 = a90Var.f;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((aa0) objArr2[i4]).d(f1Var) || z4;
        }
        ka0Var.b(f1Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            m80 m80Var = this.f;
            int i5 = m80Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((i70) m80Var.e(i6));
            }
            m80Var.c();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ka0Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        ka0 ka0Var = this.g;
        a90 a90Var = ka0Var.a;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa0) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ka0Var.a.g();
        }
    }

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
    public final void d(i70 i70Var) {
        if (this.b) {
            this.e = true;
            this.f.a(i70Var);
            return;
        }
        ka0 ka0Var = this.g;
        m80 m80Var = ka0Var.b;
        m80Var.c();
        m80Var.a(ka0Var);
        while (m80Var.h()) {
            ka0 ka0Var2 = (ka0) m80Var.j(m80Var.b - 1);
            int i = 0;
            while (true) {
                a90 a90Var = ka0Var2.a;
                if (i < a90Var.f) {
                    aa0 aa0Var = (aa0) a90Var.d[i];
                    if (f00.h(aa0Var.c, i70Var)) {
                        ka0Var2.a.i(aa0Var);
                        aa0Var.c();
                    } else {
                        m80Var.a(aa0Var);
                        i++;
                    }
                }
            }
        }
    }
}
