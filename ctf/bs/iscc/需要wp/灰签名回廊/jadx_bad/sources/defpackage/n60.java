package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n60 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ o60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n60(o60 o60Var, int i) {
        super(0);
        this.e = i;
        this.f = o60Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        kf0 placementScope;
        switch (this.e) {
            case 0:
                o60 o60Var = this.f;
                v20 v20Var = o60Var.i;
                v20Var.h = 0;
                a90 a90VarU = v20Var.a.u();
                Object[] objArr = a90VarU.d;
                int i = a90VarU.f;
                for (int i2 = 0; i2 < i; i2++) {
                    o60 o60Var2 = ((s20) objArr[i2]).ah.o;
                    o60Var2.k = o60Var2.l;
                    o60Var2.l = Integer.MAX_VALUE;
                    o60Var2.v = false;
                    if (o60Var2.o == q20.e) {
                        o60Var2.o = q20.f;
                    }
                }
                s20 s20Var = v20Var.a;
                s20 s20Var2 = v20Var.a;
                a90 a90VarU2 = s20Var.u();
                Object[] objArr2 = a90VarU2.d;
                int i3 = a90VarU2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((s20) objArr2[i4]).ah.o.z.getClass();
                }
                o60Var.p().br().b();
                a90 a90VarU3 = s20Var2.u();
                Object[] objArr3 = a90VarU3.d;
                int i5 = a90VarU3.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    s20 s20Var3 = (s20) objArr3[i6];
                    v20 v20Var2 = s20Var3.ah;
                    if (v20Var2.o.k != s20Var3.r()) {
                        s20Var2.ak();
                        s20Var2.x();
                        if (s20Var3.r() == Integer.MAX_VALUE) {
                            if (v20Var2.b) {
                                q50 q50Var = v20Var2.p;
                                q50Var.getClass();
                                q50Var.bi(false);
                            }
                            v20Var2.o.bj();
                        }
                    }
                }
                a90 a90VarU4 = s20Var2.u();
                Object[] objArr4 = a90VarU4.d;
                int i7 = a90VarU4.f;
                for (int i8 = 0; i8 < i7; i8++) {
                    t20 t20Var = ((s20) objArr4[i8]).ah.o.z;
                    t20Var.getClass();
                    t20Var.c = false;
                }
                break;
            case 1:
                o60 o60Var3 = this.f;
                o60Var3.i.a().e(o60Var3.ad);
                break;
            default:
                o60 o60Var4 = this.f;
                v20 v20Var3 = o60Var4.i;
                fa0 fa0Var = v20Var3.a().t;
                if (fa0Var == null || (placementScope = fa0Var.o) == null) {
                    placementScope = t1.as(v20Var3.a).getPlacementScope();
                }
                cv cvVar = o60Var4.ai;
                if (cvVar == null) {
                    fa0 fa0VarA = v20Var3.a();
                    long j = o60Var4.aj;
                    float f = o60Var4.ak;
                    placementScope.getClass();
                    kf0.a(placementScope, fa0VarA);
                    fa0VarA.bc(pz.c(j, fa0VarA.h), f, null);
                } else {
                    fa0 fa0VarA2 = v20Var3.a();
                    long j2 = o60Var4.aj;
                    float f2 = o60Var4.ak;
                    placementScope.getClass();
                    kf0.a(placementScope, fa0VarA2);
                    fa0VarA2.bc(pz.c(j2, fa0VarA2.h), f2, cvVar);
                }
                break;
        }
        return wz0.a;
    }
}
