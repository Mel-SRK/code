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
    */
    public final void bu(jh0 jh0Var, long j, float f) {
        q80 q80Var = this.ab;
        Object[] objArr = q80Var.b;
        Object[] objArr2 = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            gk0 gk0Var = (gk0) objArr2[i4];
                            gk0Var.k.setValue(Boolean.TRUE);
                            gk0Var.i.as(wz0.a);
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        boolean z = this.s;
        gk0 gk0Var2 = new gk0(z ? new xa0(jh0Var.a) : null, f, z);
        q80Var.l(jh0Var, gk0Var2);
        i60.an(bi(), null, new w8(gk0Var2, this, jh0Var, null, 2), 3);
        t1.ae(this);
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
