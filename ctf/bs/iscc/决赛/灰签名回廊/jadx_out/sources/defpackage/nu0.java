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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.o(java.lang.Object):java.lang.Object");
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
