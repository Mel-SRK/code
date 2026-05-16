package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends rj0 implements gv {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xj i;
    public final /* synthetic */ hh0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Serializable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nu0(xj xjVar, hv hvVar, cv cvVar, hh0 hh0Var, ji jiVar) {
        super(jiVar);
        this.i = xjVar;
        this.k = (tt0) hvVar;
        this.l = (x10) cvVar;
        this.j = hh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        yt0 yt0Var = (yt0) obj;
        ji jiVar = (ji) obj2;
        switch (this.f) {
        }
        return ((nu0) k(jiVar, yt0Var)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [hv, tt0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.f) {
            case 0:
                nu0 nu0Var = new nu0(this.i, (hv) this.k, (cv) this.l, this.j, jiVar);
                nu0Var.h = obj;
                return nu0Var;
            default:
                nu0 nu0Var2 = new nu0(this.i, (pi) this.k, (xi0) this.l, this.j, jiVar);
                nu0Var2.h = obj;
                return nu0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Type inference failed for: r0v7, types: [cv, x10] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hv, tt0] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        yt0 yt0Var;
        pg0 pg0Var;
        switch (this.f) {
            case 0:
                int i = this.g;
                xj xjVar = this.i;
                hh0 hh0Var = this.j;
                yj yjVar = yj.d;
                if (i == 0) {
                    i60.az(obj);
                    yt0Var = (yt0) this.h;
                    i60.an(xjVar, null, new lu0(hh0Var, null, 0), 3);
                    this.h = yt0Var;
                    this.g = 1;
                    obj = su0.b(yt0Var, (2 & 1) != 0, jg0.e, this);
                    if (obj == yjVar) {
                        return yjVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i60.az(obj);
                        pg0Var = (pg0) obj;
                        if (pg0Var != null) {
                            i60.an(xjVar, null, new mu0(hh0Var, null, 0), 3);
                        } else {
                            pg0Var.a();
                            i60.an(xjVar, null, new mu0(hh0Var, null, 1), 3);
                            ((x10) this.l).g(new xa0(pg0Var.c));
                        }
                        return wz0.a;
                    }
                    yt0Var = (yt0) this.h;
                    i60.az(obj);
                }
                pg0 pg0Var2 = (pg0) obj;
                pg0Var2.a();
                ?? r4 = (tt0) this.k;
                if (r4 != su0.a) {
                    i60.an(xjVar, null, new w8((hv) r4, hh0Var, pg0Var2, (ji) null), 3);
                }
                this.h = null;
                this.g = 2;
                obj = su0.d(yt0Var, jg0.e, this);
                if (obj == yjVar) {
                    return yjVar;
                }
                pg0Var = (pg0) obj;
                if (pg0Var != null) {
                }
                return wz0.a;
            default:
                int i2 = this.g;
                if (i2 == 0) {
                    i60.az(obj);
                    yt0 yt0Var2 = (yt0) this.h;
                    this.g = 1;
                    obj = su0.d(yt0Var2, jg0.e, this);
                    yj yjVar2 = yj.d;
                    if (obj == yjVar2) {
                        return yjVar2;
                    }
                } else {
                    if (i2 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                pg0 pg0Var3 = (pg0) obj;
                xj xjVar2 = this.i;
                hh0 hh0Var2 = this.j;
                if (pg0Var3 != null) {
                    pg0Var3.a();
                    i60.an(xjVar2, null, new mu0(hh0Var2, null, 6), 3);
                    throw null;
                }
                i60.an(xjVar2, null, new mu0(hh0Var2, null, 7), 3);
                pi piVar = (pi) this.k;
                long j = ((pg0) ((xi0) this.l).d).c;
                piVar.f.o();
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(xj xjVar, pi piVar, xi0 xi0Var, hh0 hh0Var, ji jiVar) {
        super(jiVar);
        this.i = xjVar;
        this.k = piVar;
        this.l = xi0Var;
        this.j = hh0Var;
    }
}
