package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends ka0 {
    public final i70 c;
    public final o5 d;
    public final e50 e;
    public fa0 f;
    public ig0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public aa0(i70 i70Var) {
        this.c = i70Var;
        o5 o5Var = new o5(2);
        o5Var.c = new long[2];
        this.d = o5Var;
        this.e = new e50(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031a  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.ka0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.e50 r54, defpackage.d20 r55, defpackage.f1 r56, boolean r57) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa0.a(e50, d20, f1, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.ka0
    public final void b(f1 f1Var) {
        super.b(f1Var);
        ig0 ig0Var = this.g;
        if (ig0Var == null) {
            return;
        }
        this.h = this.i;
        ?? r1 = ig0Var.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            pg0 pg0Var = (pg0) r1.get(i);
            boolean z = pg0Var.d;
            long j = pg0Var.a;
            boolean zM = f1Var.m(j);
            boolean z2 = this.i;
            if ((!z && !zM) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = ig0Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        a90 a90Var = this.a;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa0) objArr[i2]).c();
        }
        ?? M = this.c;
        ?? a90Var2 = 0;
        while (M != 0) {
            if (M instanceof sg0) {
                ((sg0) M).aw();
            } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                i70 i70Var = ((rl) M).s;
                int i3 = 0;
                M = M;
                a90Var2 = a90Var2;
                while (i70Var != null) {
                    if ((i70Var.f & 16) != 0) {
                        i3++;
                        a90Var2 = a90Var2;
                        if (i3 == 1) {
                            M = i70Var;
                        } else {
                            if (a90Var2 == 0) {
                                a90Var2 = new a90(new i70[16]);
                            }
                            if (M != 0) {
                                a90Var2.b(M);
                                M = 0;
                            }
                            a90Var2.b(i70Var);
                        }
                    }
                    i70Var = i70Var.i;
                    M = M;
                    a90Var2 = a90Var2;
                }
                if (i3 == 1) {
                }
            }
            M = pk.m(a90Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.f1 r15) {
        /*
            r14 = this;
            e50 r0 = r14.e
            int r1 = r0.c()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            i70 r1 = r14.c
            boolean r4 = r1.q
            if (r4 != 0) goto L14
            goto La
        L14:
            ig0 r4 = r14.g
            r4.getClass()
            fa0 r5 = r14.f
            r5.getClass()
            long r5 = r5.f
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof defpackage.sg0
            if (r10 == 0) goto L31
            sg0 r7 = (defpackage.sg0) r7
            jg0 r9 = defpackage.jg0.f
            r7.ad(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.f
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof defpackage.rl
            if (r10 == 0) goto L67
            r10 = r7
            rl r10 = (defpackage.rl) r10
            i70 r10 = r10.s
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.f
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            a90 r8 = new a90
            i70[] r13 = new defpackage.i70[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.b(r7)
            r7 = r2
        L5e:
            r8.b(r10)
        L61:
            i70 r10 = r10.i
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            i70 r7 = defpackage.pk.m(r8)
            goto L22
        L6c:
            boolean r1 = r1.q
            if (r1 == 0) goto L83
            a90 r1 = r14.a
            java.lang.Object[] r4 = r1.d
            int r1 = r1.f
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            aa0 r6 = (defpackage.aa0) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.b(r15)
            int r15 = r0.g
            java.lang.Object[] r1 = r0.f
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.g = r3
            r0.d = r3
            r14.f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa0.d(f1):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [a90] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(f1 f1Var, boolean z) {
        if (this.e.c() == 0) {
            return false;
        }
        ?? M = this.c;
        if (!M.q) {
            return false;
        }
        ig0 ig0Var = this.g;
        ig0Var.getClass();
        fa0 fa0Var = this.f;
        fa0Var.getClass();
        long j = fa0Var.f;
        ?? M2 = M;
        ?? a90Var = 0;
        while (M2 != 0) {
            if (M2 instanceof sg0) {
                ((sg0) M2).ad(ig0Var, jg0.d, j);
            } else if ((M2.f & 16) != 0 && (M2 instanceof rl)) {
                i70 i70Var = ((rl) M2).s;
                int i = 0;
                M2 = M2;
                a90Var = a90Var;
                while (i70Var != null) {
                    if ((i70Var.f & 16) != 0) {
                        i++;
                        a90Var = a90Var;
                        if (i == 1) {
                            M2 = i70Var;
                        } else {
                            if (a90Var == 0) {
                                a90Var = new a90(new i70[16]);
                            }
                            if (M2 != 0) {
                                a90Var.b(M2);
                                M2 = 0;
                            }
                            a90Var.b(i70Var);
                        }
                    }
                    i70Var = i70Var.i;
                    M2 = M2;
                    a90Var = a90Var;
                }
                if (i == 1) {
                }
            }
            M2 = pk.m(a90Var);
        }
        if (M.q) {
            a90 a90Var2 = this.a;
            Object[] objArr = a90Var2.d;
            int i2 = a90Var2.f;
            for (int i3 = 0; i3 < i2; i3++) {
                aa0 aa0Var = (aa0) objArr[i3];
                this.f.getClass();
                aa0Var.e(f1Var, z);
            }
        }
        if (M.q) {
            ?? a90Var3 = 0;
            while (M != 0) {
                if (M instanceof sg0) {
                    ((sg0) M).ad(ig0Var, jg0.e, j);
                } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                    i70 i70Var2 = ((rl) M).s;
                    int i4 = 0;
                    M = M;
                    a90Var3 = a90Var3;
                    while (i70Var2 != null) {
                        if ((i70Var2.f & 16) != 0) {
                            i4++;
                            a90Var3 = a90Var3;
                            if (i4 == 1) {
                                M = i70Var2;
                            } else {
                                if (a90Var3 == 0) {
                                    a90Var3 = new a90(new i70[16]);
                                }
                                if (M != 0) {
                                    a90Var3.b(M);
                                    M = 0;
                                }
                                a90Var3.b(i70Var2);
                            }
                        }
                        i70Var2 = i70Var2.i;
                        M = M;
                        a90Var3 = a90Var3;
                    }
                    if (i4 == 1) {
                    }
                }
                M = pk.m(a90Var3);
            }
        }
        return true;
    }

    public final void f(long j, m80 m80Var) {
        o5 o5Var = this.d;
        if (o5Var.b(j) && m80Var.f(this) < 0) {
            o5Var.c(j);
            e50 e50Var = this.e;
            int iN = e00.n(e50Var.e, e50Var.g, j);
            if (iN >= 0) {
                Object[] objArr = e50Var.f;
                Object obj = objArr[iN];
                Object obj2 = pk.d;
                if (obj != obj2) {
                    objArr[iN] = obj2;
                    e50Var.d = true;
                }
            }
        }
        a90 a90Var = this.a;
        Object[] objArr2 = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa0) objArr2[i2]).f(j, m80Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
