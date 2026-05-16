package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km extends us0 implements ms0 {
    public final pu e;
    public final bw f;
    public jm g = new jm(fr0.k().g());

    public km(pu puVar, bw bwVar) {
        this.e = puVar;
        this.f = bwVar;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.g;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.g = (jm) vs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jm g(jm jmVar, xq0 xq0Var, boolean z, pu puVar) {
        a90 a90VarE;
        bw bwVar;
        int i;
        jm jmVar2 = jmVar;
        if (jmVar2.c(this, xq0Var)) {
            if (z) {
                a90VarE = bo0.e();
                Object[] objArr = a90VarE.d;
                int i2 = a90VarE.f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((tf) objArr[i3]).b();
                }
                try {
                    l80 l80Var = jmVar2.e;
                    o6 o6Var = lr0.a;
                    uz uzVar = (uz) o6Var.n();
                    if (uzVar == null) {
                        uzVar = new uz();
                        o6Var.x(uzVar);
                    }
                    int i4 = uzVar.a;
                    Object[] objArr2 = l80Var.b;
                    int[] iArr = l80Var.c;
                    long[] jArr = l80Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        ts0 ts0Var = (ts0) objArr2[i9];
                                        uzVar.a = i4 + iArr[i9];
                                        cv cvVarE = xq0Var.e();
                                        if (cvVarE != null) {
                                            cvVarE.g(ts0Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    uzVar.a = i4;
                    Object[] objArr3 = a90VarE.d;
                    int i10 = a90VarE.f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((tf) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jmVar2;
        }
        final l80 l80Var2 = new l80();
        o6 o6Var2 = lr0.a;
        final uz uzVar2 = (uz) o6Var2.n();
        if (uzVar2 == null) {
            uzVar2 = new uz();
            o6Var2.x(uzVar2);
        }
        final int i12 = uzVar2.a;
        a90VarE = bo0.e();
        Object[] objArr4 = a90VarE.d;
        int i13 = a90VarE.f;
        for (int i14 = 0; i14 < i13; i14++) {
            ((tf) objArr4[i14]).b();
        }
        try {
            uzVar2.a = i12 + 1;
            Object objO = q6.o(new cv() { // from class: im
                @Override // defpackage.cv
                public final Object g(Object obj) {
                    if (obj == this.d) {
                        wc.q("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof ts0) {
                        int i15 = uzVar2.a - i12;
                        l80 l80Var3 = l80Var2;
                        int iD = l80Var3.d(obj);
                        l80Var3.h(Math.min(i15, iD >= 0 ? l80Var3.c[iD] : Integer.MAX_VALUE), obj);
                    }
                    return wz0.a;
                }
            }, puVar);
            uzVar2.a = i12;
            Object[] objArr5 = a90VarE.d;
            int i15 = a90VarE.f;
            for (int i16 = 0; i16 < i15; i16++) {
                ((tf) objArr5[i16]).a();
            }
            Object obj = fr0.c;
            synchronized (obj) {
                try {
                    xq0 xq0VarK = fr0.k();
                    Object obj2 = jmVar2.f;
                    if (obj2 == jm.h || (bwVar = this.f) == null || !bwVar.h(objO, obj2)) {
                        jm jmVar3 = this.g;
                        synchronized (obj) {
                            vs0 vs0VarM = fr0.m(jmVar3, this);
                            vs0VarM.a(jmVar3);
                            vs0VarM.a = xq0VarK.g();
                            jmVar2 = (jm) vs0VarM;
                            jmVar2.e = l80Var2;
                            jmVar2.g = jmVar2.d(this, xq0VarK);
                            jmVar2.f = objO;
                        }
                        return jmVar2;
                    }
                    jmVar2.e = l80Var2;
                    jmVar2.g = jmVar2.d(this, xq0VarK);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            uz uzVar3 = (uz) lr0.a.n();
            if (uzVar3 == null || uzVar3.a != 0) {
                return jmVar2;
            }
            fr0.k().m();
            synchronized (obj) {
                xq0 xq0VarK2 = fr0.k();
                jmVar2.c = xq0VarK2.g();
                jmVar2.d = xq0VarK2.h();
                return jmVar2;
            }
        } finally {
            Object[] objArr6 = a90VarE.d;
            int i17 = a90VarE.f;
            for (int i18 = 0; i18 < i17; i18++) {
                ((tf) objArr6[i18]).a();
            }
        }
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        cv cvVarE = fr0.k().e();
        if (cvVarE != null) {
            cvVarE.g(this);
        }
        xq0 xq0VarK = fr0.k();
        return g((jm) fr0.j(this.g, xq0VarK), xq0VarK, true, this.e).f;
    }

    public final jm h() {
        xq0 xq0VarK = fr0.k();
        return g((jm) fr0.j(this.g, xq0VarK), xq0VarK, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        jm jmVar = (jm) fr0.i(this.g);
        sb.append(jmVar.c(this, fr0.k()) ? String.valueOf(jmVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
