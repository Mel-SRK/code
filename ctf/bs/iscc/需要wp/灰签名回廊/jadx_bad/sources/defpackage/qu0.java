package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends rj0 implements gv {
    public Object f;
    public Object g;
    public xi0 h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xj l;
    public final /* synthetic */ hv m;
    public final /* synthetic */ pi n;
    public final /* synthetic */ hh0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(xj xjVar, hv hvVar, pi piVar, hh0 hh0Var, ji jiVar) {
        super(jiVar);
        this.l = xjVar;
        this.m = hvVar;
        this.n = piVar;
        this.o = hh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((qu0) k((ji) obj2, (yt0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        qu0 qu0Var = new qu0(this.l, this.m, this.n, this.o, jiVar);
        qu0Var.k = obj;
        return qu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r15.i(r4, r1, r18) == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (defpackage.su0.a(r3, r18) == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        if (r2 == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019a, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166 A[Catch: kg0 -> 0x0170, TryCatch #4 {kg0 -> 0x0170, blocks: (B:51:0x0160, B:53:0x0166, B:55:0x0174), top: B:77:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174 A[Catch: kg0 -> 0x0170, TRY_LEAVE, TryCatch #4 {kg0 -> 0x0170, blocks: (B:51:0x0160, B:53:0x0166, B:55:0x0174), top: B:77:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        hh0 hh0Var;
        yj yjVar;
        yt0 yt0Var;
        Object objB;
        yt0 yt0Var2;
        yj yjVar2;
        xi0 xi0Var;
        long j;
        xi0 xi0Var2;
        long j2;
        Object objI;
        yt0 yt0Var3;
        xi0 xi0Var3;
        Object obj2;
        Object obj3;
        yt0 yt0Var4;
        hh0 hh0Var2;
        xi0 xi0Var4;
        yt0 yt0Var5;
        pi piVar = this.n;
        cw0 cw0Var = piVar.f;
        int i = this.j;
        xj xjVar = this.l;
        hv hvVar = this.m;
        hh0 hh0Var3 = this.o;
        yj yjVar3 = yj.d;
        switch (i) {
            case 0:
                hh0Var = hh0Var3;
                yjVar = yjVar3;
                i60.az(obj);
                yt0Var = (yt0) this.k;
                this.k = yt0Var;
                this.j = 1;
                objB = su0.b(yt0Var, (2 & 1) != 0, jg0.e, this);
                break;
            case 1:
                hh0Var = hh0Var3;
                yjVar = yjVar3;
                yt0Var = (yt0) this.k;
                i60.az(obj);
                objB = obj;
                yt0Var2 = yt0Var;
                pg0 pg0Var = (pg0) objB;
                pg0Var.a();
                i60.an(xjVar, null, new lu0(hh0Var, null, 1), 3);
                if (hvVar != su0.a) {
                    yj yjVar4 = yjVar;
                    hh0Var3 = hh0Var;
                    yjVar2 = yjVar4;
                    i60.an(xjVar, null, new ou0(hvVar, hh0Var3, pg0Var, null, 0), 3);
                } else {
                    yj yjVar5 = yjVar;
                    hh0Var3 = hh0Var;
                    yjVar2 = yjVar5;
                }
                xi0Var = new xi0();
                j = 4611686018427387903L;
                try {
                    pu0 pu0Var = new pu0(null);
                    this.k = yt0Var2;
                    this.f = pg0Var;
                    this.g = xi0Var;
                    this.h = xi0Var;
                    this.i = 4611686018427387903L;
                    this.j = 2;
                    objI = yt0Var2.i(4611686018427387903L, pu0Var, this);
                    break;
                } catch (kg0 unused) {
                    xi0Var2 = xi0Var;
                    j2 = 4611686018427387903L;
                    this.k = yt0Var2;
                    this.f = xi0Var2;
                    this.g = null;
                    this.h = null;
                    this.i = j2;
                    this.j = 3;
                    if (su0.a(yt0Var2, this) == yjVar2) {
                        return yjVar2;
                    }
                    i60.an(xjVar, null, new mu0(hh0Var3, null, 5), 3);
                    xi0Var3 = xi0Var2;
                    obj3 = xi0Var3.d;
                    if (obj3 != null) {
                    }
                    return wz0.a;
                }
                if (objI == yjVar2) {
                    return yjVar2;
                }
                yt0Var3 = yt0Var2;
                xi0Var3 = xi0Var;
                try {
                    xi0Var.d = objI;
                    obj2 = xi0Var3.d;
                    if (obj2 != null) {
                        i60.an(xjVar, null, new mu0(hh0Var3, null, 3), 3);
                    } else {
                        ((pg0) obj2).a();
                        i60.an(xjVar, null, new mu0(hh0Var3, null, 4), 3);
                    }
                    break;
                } catch (kg0 unused2) {
                    j2 = j;
                    xi0Var2 = xi0Var3;
                    yt0Var2 = yt0Var3;
                    this.k = yt0Var2;
                    this.f = xi0Var2;
                    this.g = null;
                    this.h = null;
                    this.i = j2;
                    this.j = 3;
                    if (su0.a(yt0Var2, this) == yjVar2) {
                    }
                    i60.an(xjVar, null, new mu0(hh0Var3, null, 5), 3);
                    xi0Var3 = xi0Var2;
                }
                obj3 = xi0Var3.d;
                if (obj3 != null) {
                    cw0Var.o();
                }
                return wz0.a;
            case 2:
                j = this.i;
                xi0Var = this.h;
                xi0 xi0Var5 = (xi0) this.g;
                yt0Var2 = (yt0) this.k;
                try {
                    i60.az(obj);
                    hh0Var3 = hh0Var3;
                    yjVar2 = yjVar3;
                    yt0Var3 = yt0Var2;
                    xi0Var3 = xi0Var5;
                    objI = obj;
                    xi0Var.d = objI;
                    obj2 = xi0Var3.d;
                    if (obj2 != null) {
                    }
                    break;
                } catch (kg0 unused3) {
                    hh0Var3 = hh0Var3;
                    yjVar2 = yjVar3;
                    j2 = j;
                    xi0Var2 = xi0Var5;
                    this.k = yt0Var2;
                    this.f = xi0Var2;
                    this.g = null;
                    this.h = null;
                    this.i = j2;
                    this.j = 3;
                    if (su0.a(yt0Var2, this) == yjVar2) {
                    }
                    i60.an(xjVar, null, new mu0(hh0Var3, null, 5), 3);
                    xi0Var3 = xi0Var2;
                    obj3 = xi0Var3.d;
                    if (obj3 != null) {
                    }
                    return wz0.a;
                }
                obj3 = xi0Var3.d;
                if (obj3 != null) {
                }
                return wz0.a;
            case 3:
                xi0Var2 = (xi0) this.f;
                i60.az(obj);
                i60.an(xjVar, null, new mu0(hh0Var3, null, 5), 3);
                xi0Var3 = xi0Var2;
                obj3 = xi0Var3.d;
                if (obj3 != null) {
                }
                return wz0.a;
            case 4:
                long j3 = this.i;
                xi0 xi0Var6 = (xi0) this.f;
                yt0 yt0Var6 = (yt0) this.k;
                i60.az(obj);
                pg0 pg0Var2 = (pg0) obj;
                if (pg0Var2 != null) {
                    i60.an(xjVar, null, new lu0(hh0Var3, null, 2), 3);
                    if (hvVar != su0.a) {
                        i60.an(xjVar, null, new ou0(hvVar, hh0Var3, pg0Var2, null, 1), 3);
                    }
                    try {
                        try {
                            yt0Var4 = yt0Var6;
                            yjVar = yjVar3;
                            hh0Var2 = hh0Var3;
                        } catch (kg0 unused4) {
                            yjVar = yjVar3;
                            hh0Var2 = hh0Var3;
                            yt0Var4 = yt0Var6;
                        }
                    } catch (kg0 unused5) {
                        yt0Var4 = yt0Var6;
                        hh0Var2 = hh0Var3;
                        yjVar = yjVar3;
                    }
                    try {
                        nu0 nu0Var = new nu0(this.l, piVar, xi0Var6, hh0Var2, (ji) null);
                        this.k = yt0Var4;
                        this.f = xi0Var6;
                        this.g = pg0Var2;
                        this.j = 5;
                    } catch (kg0 unused6) {
                        xi0Var4 = xi0Var6;
                        yt0Var5 = yt0Var4;
                        long j4 = ((pg0) xi0Var4.d).c;
                        cw0Var.o();
                        this.k = null;
                        this.f = null;
                        this.g = null;
                        this.j = 6;
                    }
                    break;
                } else {
                    long j5 = ((pg0) xi0Var6.d).c;
                    cw0Var.o();
                }
                return wz0.a;
            case 5:
                xi0Var4 = (xi0) this.f;
                yt0Var5 = (yt0) this.k;
                try {
                    i60.az(obj);
                    break;
                } catch (kg0 unused7) {
                    hh0Var2 = hh0Var3;
                    yjVar = yjVar3;
                    long j42 = ((pg0) xi0Var4.d).c;
                    cw0Var.o();
                    this.k = null;
                    this.f = null;
                    this.g = null;
                    this.j = 6;
                    break;
                }
                return wz0.a;
            case 6:
                i60.az(obj);
                hh0Var2 = hh0Var3;
                i60.an(xjVar, null, new mu0(hh0Var2, null, 2), 3);
                return wz0.a;
            default:
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
