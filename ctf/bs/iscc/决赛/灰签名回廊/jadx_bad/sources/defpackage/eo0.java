package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends rj0 implements gv {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(bu buVar, cc ccVar, fv0 fv0Var, ji jiVar) {
        super(jiVar);
        this.i = buVar;
        this.j = ccVar;
        this.k = fv0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        yt0 yt0Var = (yt0) obj;
        ji jiVar = (ji) obj2;
        switch (this.f) {
        }
        return ((eo0) k(jiVar, yt0Var)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.f) {
            case 0:
                eo0 eo0Var = new eo0((bu) this.i, (cc) this.j, (fv0) this.k, jiVar);
                eo0Var.h = obj;
                return eo0Var;
            default:
                eo0 eo0Var2 = new eo0((ht0) this.k, jiVar);
                eo0Var2.h = obj;
                return eo0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r10 == r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r11 != r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (r5 != r8) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ca -> B:41:0x00cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0156 -> B:69:0x015a). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        yt0 yt0Var;
        Object objA;
        yt0 yt0Var2;
        Object objB;
        yt0 yt0Var3;
        jg0 jg0Var;
        pg0 pg0Var;
        yj yjVar;
        Object objA2;
        yj yjVar2;
        Object obj2;
        pg0 pg0Var2;
        yt0 yt0Var4;
        Object obj3;
        Object objA3;
        Object obj4;
        switch (this.f) {
            case 0:
                int i = this.g;
                yj yjVar3 = yj.d;
                if (i != 0) {
                    if (i == 1) {
                        yt0Var = (yt0) this.h;
                        i60.az(obj);
                        objA = obj;
                    } else if (i == 2 || i == 3) {
                        i60.az(obj);
                    } else {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    i60.az(obj);
                    yt0Var = (yt0) this.h;
                    this.h = yt0Var;
                    this.g = 1;
                    objA = go0.a(yt0Var, this);
                    if (objA == yjVar3) {
                    }
                }
                ig0 ig0Var = (ig0) objA;
                if (go0.j(ig0Var) && (ig0Var.b & 33) != 0) {
                    ?? r6 = ig0Var.a;
                    int size = r6.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((pg0) r6.get(i2)).b()) {
                            if (!go0.j(ig0Var)) {
                            }
                        }
                    }
                    bu buVar = (bu) this.i;
                    cc ccVar = (cc) this.j;
                    this.h = null;
                    this.g = 2;
                    if (go0.c(yt0Var, buVar, ccVar, ig0Var, this) == yjVar3) {
                    }
                } else if (!go0.j(ig0Var)) {
                    fv0 fv0Var = (fv0) this.k;
                    this.h = null;
                    this.g = 3;
                    if (go0.d(yt0Var, fv0Var, ig0Var, this) == yjVar3) {
                    }
                }
                break;
            default:
                ht0 ht0Var = (ht0) this.k;
                int i3 = this.g;
                jg0 jg0Var2 = jg0.d;
                int i4 = 2;
                yj yjVar4 = yj.d;
                if (i3 == 0) {
                    i60.az(obj);
                    yt0Var2 = (yt0) this.h;
                    this.h = yt0Var2;
                    this.g = 1;
                    objB = su0.b(yt0Var2, true, jg0Var2, this);
                } else if (i3 == 1) {
                    yt0Var2 = (yt0) this.h;
                    i60.az(obj);
                    objB = obj;
                } else if (i3 == 2) {
                    jg0Var = (jg0) this.j;
                    pg0Var = (pg0) this.i;
                    yt0Var3 = (yt0) this.h;
                    i60.az(obj);
                    objA2 = obj;
                    ?? r11 = ((ig0) objA2).a;
                    int size2 = r11.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size2) {
                            obj2 = r11.get(i5);
                            pg0 pg0Var3 = (pg0) obj2;
                            if (pg0Var3.b()) {
                                yjVar2 = yjVar4;
                            } else {
                                yjVar2 = yjVar4;
                                if (!og0.a(pg0Var3.a, pg0Var.a) || !pg0Var3.d) {
                                }
                            }
                            i5++;
                            yjVar4 = yjVar2;
                        } else {
                            yjVar2 = yjVar4;
                            obj2 = null;
                        }
                    }
                    pg0 pg0Var4 = (pg0) obj2;
                    if (pg0Var4 == null || pg0Var4.b - pg0Var.b >= yt0Var3.f().c()) {
                        pg0Var4 = null;
                    } else if (xa0.c(xa0.f(pg0Var4.c, pg0Var.c)) <= yt0Var3.f().e()) {
                        yjVar4 = yjVar2;
                        i4 = 2;
                        this.h = yt0Var3;
                        this.i = pg0Var;
                        this.j = jg0Var;
                        this.g = i4;
                        objA2 = yt0Var3.a(jg0Var, this);
                    }
                    if (pg0Var4 != null && ((Boolean) ht0Var.t.a()).booleanValue()) {
                        pg0Var4.a();
                        pg0Var2 = pg0Var;
                        yt0Var4 = yt0Var3;
                        this.h = yt0Var4;
                        this.i = pg0Var2;
                        obj3 = null;
                        this.j = null;
                        this.g = 3;
                        objA3 = yt0Var4.a(jg0Var2, this);
                        yjVar = yjVar2;
                    }
                } else if (i3 == 3) {
                    pg0Var2 = (pg0) this.i;
                    yt0Var4 = (yt0) this.h;
                    i60.az(obj);
                    objA3 = obj;
                    yjVar = yjVar4;
                    obj3 = null;
                    ?? r5 = ((ig0) objA3).a;
                    int size3 = r5.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size3) {
                            obj4 = r5.get(i6);
                            pg0 pg0Var5 = (pg0) obj4;
                            if (pg0Var5.b() || !og0.a(pg0Var5.a, pg0Var2.a) || !pg0Var5.d) {
                                i6++;
                            }
                        } else {
                            obj4 = obj3;
                        }
                    }
                    pg0 pg0Var6 = (pg0) obj4;
                    if (pg0Var6 != null) {
                        pg0Var6.a();
                        yjVar2 = yjVar;
                        this.h = yt0Var4;
                        this.i = pg0Var2;
                        obj3 = null;
                        this.j = null;
                        this.g = 3;
                        objA3 = yt0Var4.a(jg0Var2, this);
                        yjVar = yjVar2;
                    }
                } else {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                }
                pg0 pg0Var7 = (pg0) objB;
                int i7 = pg0Var7.i;
                long j = pg0Var7.c;
                if (i7 == 3 || i7 == 4) {
                    yt0Var3 = yt0Var2;
                    jg0Var = (ht0Var.u || (xa0.d(j) >= 0.0f && xa0.d(j) < ((float) ((int) (yt0Var2.i.ab >> 32))) && xa0.e(j) >= 0.0f && xa0.e(j) < ((float) ((int) (yt0Var2.i.ab & 4294967295L))))) ? jg0Var2 : jg0.e;
                    pg0Var = pg0Var7;
                    this.h = yt0Var3;
                    this.i = pg0Var;
                    this.j = jg0Var;
                    this.g = i4;
                    objA2 = yt0Var3.a(jg0Var, this);
                }
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(ht0 ht0Var, ji jiVar) {
        super(jiVar);
        this.k = ht0Var;
    }
}
