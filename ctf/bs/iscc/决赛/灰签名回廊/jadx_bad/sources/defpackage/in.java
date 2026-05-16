package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class in implements zr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public in(jn jnVar, xi0 xi0Var, zr zrVar) {
        this.d = 0;
        this.e = xi0Var;
        this.f = zrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    @Override // defpackage.zr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, ji jiVar) {
        hn hnVar;
        hs hsVar;
        in inVar;
        switch (this.d) {
            case 0:
                xi0 xi0Var = (xi0) this.e;
                if (jiVar instanceof hn) {
                    hnVar = (hn) jiVar;
                    int i = hnVar.i;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hnVar.i = i - Integer.MIN_VALUE;
                    } else {
                        hnVar = new hn(this, jiVar);
                    }
                }
                Object obj2 = hnVar.g;
                int i2 = hnVar.i;
                wz0 wz0Var = wz0.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i60.az(obj2);
                        return wz0Var;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj2);
                Object obj3 = xi0Var.d;
                if (obj3 != m10.d && f00.h(obj3, obj)) {
                    return wz0Var;
                }
                xi0Var.d = obj;
                zr zrVar = (zr) this.f;
                hnVar.i = 1;
                Object objI = zrVar.i(obj, hnVar);
                yj yjVar = yj.d;
                return objI == yjVar ? yjVar : wz0Var;
            case 1:
                if (jiVar instanceof hs) {
                    hsVar = (hs) jiVar;
                    int i3 = hsVar.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hsVar.i = i3 - Integer.MIN_VALUE;
                    } else {
                        hsVar = new hs(this, jiVar);
                    }
                }
                Object objF = hsVar.h;
                int i4 = hsVar.i;
                if (i4 == 0) {
                    i60.az(objF);
                    gv gvVar = (gv) this.f;
                    hsVar.g = this;
                    hsVar.k = obj;
                    hsVar.i = 1;
                    objF = gvVar.f(obj, hsVar);
                    yj yjVar2 = yj.d;
                    if (objF == yjVar2) {
                        return yjVar2;
                    }
                    inVar = this;
                } else {
                    if (i4 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = hsVar.k;
                    inVar = hsVar.g;
                    i60.az(objF);
                }
                if (!((Boolean) objF).booleanValue()) {
                    return wz0.a;
                }
                ((xi0) inVar.e).d = obj;
                throw new a(inVar);
            case 2:
                yz yzVar = (yz) obj;
                ArrayList arrayList = (ArrayList) this.e;
                if (yzVar instanceof ps) {
                    arrayList.add(yzVar);
                } else if (yzVar instanceof qs) {
                    arrayList.remove(((qs) yzVar).a);
                }
                ((w80) this.f).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return wz0.a;
            case 3:
                yz yzVar2 = (yz) obj;
                h4 h4Var = (h4) this.e;
                if (yzVar2 instanceof jh0) {
                    jh0 jh0Var = (jh0) yzVar2;
                    jk0 jk0VarA = h4Var.j;
                    if (jk0VarA == null) {
                        jk0VarA = rk0.a(h4Var.i);
                        h4Var.j = jk0VarA;
                    }
                    lk0 lk0VarA = jk0VarA.a(h4Var);
                    lk0VarA.b(jh0Var, h4Var.e, h4Var.m, h4Var.n, ((qc) h4Var.g.getValue()).a, ((ck0) h4Var.h.getValue()).d, h4Var.o);
                    h4Var.k.setValue(lk0VarA);
                } else if (yzVar2 instanceof kh0) {
                    lk0 lk0Var = (lk0) h4Var.k.getValue();
                    if (lk0Var != null) {
                        lk0Var.d();
                    }
                } else if (yzVar2 instanceof ih0) {
                    lk0 lk0Var2 = (lk0) h4Var.k.getValue();
                    if (lk0Var2 != null) {
                        lk0Var2.d();
                    }
                } else {
                    h4Var.d.d(yzVar2, (xj) this.f);
                }
                return wz0.a;
            case 4:
                yz yzVar3 = (yz) obj;
                boolean z = yzVar3 instanceof lh0;
                ok0 ok0Var = (ok0) this.e;
                if (!z) {
                    xj xjVar = (xj) this.f;
                    b3 b3Var = ok0Var.w;
                    if (b3Var == null) {
                        b3Var = new b3(ok0Var.v, ok0Var.s);
                        t1.ae(ok0Var);
                        ok0Var.w = b3Var;
                    }
                    b3Var.d(yzVar3, xjVar);
                } else if (ok0Var.z) {
                    ok0Var.bw((lh0) yzVar3);
                } else {
                    ok0Var.aa.a(yzVar3);
                }
                return wz0.a;
            default:
                long j = ((xa0) obj).a;
                j5 j5Var = (j5) this.e;
                boolean zAd = d41.ad(((xa0) j5Var.c()).a);
                wz0 wz0Var2 = wz0.a;
                if (zAd && d41.ad(j) && xa0.e(((xa0) j5Var.c()).a) != xa0.e(j)) {
                    i60.an((xj) this.f, null, new lo0(j5Var, j, (ji) null), 3);
                    return wz0Var2;
                }
                Object objD = j5Var.d(jiVar, new xa0(j));
                return objD == yj.d ? objD : wz0Var2;
        }
    }

    public /* synthetic */ in(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    public in(gv gvVar, xi0 xi0Var) {
        this.d = 1;
        this.f = gvVar;
        this.e = xi0Var;
    }
}
