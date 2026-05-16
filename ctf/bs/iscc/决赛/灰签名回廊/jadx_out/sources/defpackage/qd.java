package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd extends ok0 {
    public final q80 ab;

    public qd(g80 g80Var, boolean z, float f, tl tlVar, ul ulVar) {
        super(g80Var, z, f, tlVar, ulVar);
        this.ab = new q80();
    }

    @Override // defpackage.i70
    public final void bn() {
        this.ab.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // defpackage.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bu(defpackage.jh0 r19, long r20, float r22) {
        /*
            r18 = this;
            r2 = r18
            r3 = r19
            q80 r0 = r2.ab
            java.lang.Object[] r1 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r5 = r0.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5b
            r8 = 0
        L12:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L56
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2c:
            if (r13 >= r11) goto L54
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L50
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r1[r14]
            r14 = r4[r14]
            gk0 r14 = (defpackage.gk0) r14
            jh0 r15 = (defpackage.jh0) r15
            me0 r15 = r14.k
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r15.setValue(r7)
            td r7 = r14.i
            wz0 r14 = defpackage.wz0.a
            r7.as(r14)
        L50:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2c
        L54:
            if (r11 != r12) goto L5b
        L56:
            if (r8 == r6) goto L5b
            int r8 = r8 + 1
            goto L12
        L5b:
            r4 = 0
            boolean r1 = r2.s
            if (r1 == 0) goto L68
            long r5 = r3.a
            xa0 r7 = new xa0
            r7.<init>(r5)
            goto L69
        L68:
            r7 = r4
        L69:
            gk0 r5 = new gk0
            r6 = r22
            r5.<init>(r7, r6, r1)
            r0.l(r3, r5)
            xj r6 = r2.bi()
            w8 r0 = new w8
            r1 = r5
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 3
            defpackage.i60.an(r6, r4, r0, r1)
            defpackage.t1.ae(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.bu(jh0, long, float):void");
    }

    @Override // defpackage.ok0
    public final void bv(u20 u20Var) {
        ra raVar;
        Object[] objArr;
        int i;
        int i2;
        ra raVar2;
        Object[] objArr2;
        int i3;
        qd qdVar = this;
        ra raVar3 = u20Var.d;
        qdVar.v.a();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        q80 q80Var = qdVar.ab;
        Object[] objArr3 = q80Var.b;
        Object[] objArr4 = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr3[i8];
                        gk0 gk0Var = (gk0) objArr4[i8];
                        long jB = qc.b(qdVar.u.a(), f);
                        j5 j5Var = gk0Var.h;
                        if (gk0Var.d == null) {
                            long jC = raVar3.c();
                            float f2 = hk0.a;
                            gk0Var.d = Float.valueOf(Math.max(pq0.d(jC), pq0.b(jC)) * 0.3f);
                        }
                        if (gk0Var.a == null) {
                            gk0Var.a = new xa0(raVar3.an());
                        }
                        if (gk0Var.e == null) {
                            gk0Var.e = new xa0(d41.h(pq0.d(raVar3.c()) / 2.0f, pq0.b(raVar3.c()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) gk0Var.k.getValue()).booleanValue() || ((Boolean) gk0Var.j.getValue()).booleanValue()) ? ((Number) gk0Var.f.c()).floatValue() : 1.0f;
                        Float f3 = gk0Var.d;
                        f3.getClass();
                        float fAi = m10.ai(f3.floatValue(), gk0Var.b, ((Number) gk0Var.g.c()).floatValue());
                        xa0 xa0Var = gk0Var.a;
                        xa0Var.getClass();
                        float f4 = fFloatValue;
                        float fD = xa0.d(xa0Var.a);
                        xa0 xa0Var2 = gk0Var.e;
                        xa0Var2.getClass();
                        int i9 = i7;
                        float fAi2 = m10.ai(fD, xa0.d(xa0Var2.a), ((Number) j5Var.c()).floatValue());
                        xa0 xa0Var3 = gk0Var.a;
                        xa0Var3.getClass();
                        float fE = xa0.e(xa0Var3.a);
                        xa0 xa0Var4 = gk0Var.e;
                        xa0Var4.getClass();
                        int i10 = i6;
                        long jH = d41.h(fAi2, m10.ai(fE, xa0.e(xa0Var4.a), ((Number) j5Var.c()).floatValue()));
                        long jB2 = qc.b(jB, qc.d(jB) * f4);
                        if (gk0Var.c) {
                            float fD2 = pq0.d(raVar3.c());
                            float fB = pq0.b(raVar3.c());
                            o6 o6Var = raVar3.e;
                            long jR = o6Var.r();
                            o6Var.o().l();
                            ((o6) ((bu) o6Var.a).e).o().e(0.0f, 0.0f, fD2, fB, 1);
                            raVar2 = raVar3;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            i = i9;
                            xo.at(u20Var, jB2, fAi, jH, 120);
                            o6Var.o().i();
                            o6Var.ab(jR);
                        } else {
                            raVar2 = raVar3;
                            i = i9;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            xo.at(u20Var, jB2, fAi, jH, 120);
                        }
                    } else {
                        i = i7;
                        i2 = i6;
                        raVar2 = raVar3;
                        objArr2 = objArr3;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    i6 = i2;
                    i5 = i3;
                    raVar3 = raVar2;
                    objArr3 = objArr2;
                    f = 0.1f;
                    qdVar = this;
                }
                raVar = raVar3;
                objArr = objArr3;
                if (i6 != i5) {
                    return;
                }
            } else {
                raVar = raVar3;
                objArr = objArr3;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            qdVar = this;
            raVar3 = raVar;
            objArr3 = objArr;
            f = 0.1f;
        }
    }

    @Override // defpackage.ok0
    public final void bx(jh0 jh0Var) {
        gk0 gk0Var = (gk0) this.ab.g(jh0Var);
        if (gk0Var != null) {
            gk0Var.k.setValue(Boolean.TRUE);
            gk0Var.i.as(wz0.a);
        }
    }
}
