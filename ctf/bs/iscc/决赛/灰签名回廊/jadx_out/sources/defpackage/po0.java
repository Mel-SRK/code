package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class po0 implements Iterable, d10 {
    public final q80 d;
    public f60 e;
    public boolean f;
    public boolean g;

    public po0() {
        long[] jArr = mm0.a;
        this.d = new q80();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.po0 a() {
        /*
            r18 = this;
            r0 = r18
            po0 r1 = new po0
            r1.<init>()
            boolean r2 = r0.f
            r1.f = r2
            boolean r2 = r0.g
            r1.g = r2
            q80 r2 = r1.d
            r2.getClass()
            q80 r3 = r0.d
            r3.getClass()
            java.lang.Object[] r4 = r3.b
            java.lang.Object[] r5 = r3.c
            long[] r3 = r3.a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L60
            r7 = 0
            r8 = r7
        L26:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L40:
            if (r13 >= r11) goto L59
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L55
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r4[r14]
            r14 = r5[r14]
            r2.l(r15, r14)
        L55:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L40
        L59:
            if (r11 != r12) goto L60
        L5b:
            if (r8 == r6) goto L60
            int r8 = r8 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po0.a():po0");
    }

    public final Object b(cp0 cp0Var) {
        Object objG = this.d.g(cp0Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + cp0Var + " - consider getOrElse or getOrNull");
    }

    public final void c(po0 po0Var) {
        q80 q80Var = po0Var.d;
        Object[] objArr = q80Var.b;
        Object[] objArr2 = q80Var.c;
        long[] jArr = q80Var.a;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        cp0 cp0Var = (cp0) obj;
                        q80 q80Var2 = this.d;
                        Object objG = q80Var2.g(cp0Var);
                        cp0Var.getClass();
                        Object objF = cp0Var.b.f(objG, obj2);
                        if (objF != null) {
                            q80Var2.l(cp0Var, objF);
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

    public final void d(cp0 cp0Var, Object obj) {
        boolean z = obj instanceof ah;
        q80 q80Var = this.d;
        if (z && q80Var.c(cp0Var)) {
            Object objG = q80Var.g(cp0Var);
            objG.getClass();
            ah ahVar = (ah) objG;
            ah ahVar2 = (ah) obj;
            String str = ahVar2.a;
            if (str == null) {
                str = ahVar.a;
            }
            ov ovVar = ahVar2.b;
            if (ovVar == null) {
                ovVar = ahVar.b;
            }
            q80Var.l(cp0Var, new ah(str, ovVar));
        } else {
            q80Var.l(cp0Var, obj);
        }
        cp0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        return f00.h(this.d, po0Var.d) && this.f == po0Var.f && this.g == po0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + n5.e(this.d.hashCode() * 31, 31, this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f60 f60Var = this.e;
        if (f60Var == null) {
            q80 q80Var = this.d;
            q80Var.getClass();
            f60 f60Var2 = new f60(q80Var);
            this.e = f60Var2;
            f60Var = f60Var2;
        }
        return ((xq) f60Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.g
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            q80 r4 = r0.d
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            cp0 r8 = (defpackage.cp0) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.az0.ag(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po0.toString():java.lang.String");
    }
}
