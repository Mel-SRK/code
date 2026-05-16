package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class mu extends rj0 implements gv {
    public final /* synthetic */ int f = 1;
    public int g;
    public /* synthetic */ Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mu(pj pjVar, gv gvVar, ji jiVar) {
        super(jiVar);
        this.i = pjVar;
        this.j = (rj0) gvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        yt0 yt0Var = (yt0) obj;
        ji jiVar = (ji) obj2;
        switch (this.f) {
        }
        return ((mu) k(jiVar, yt0Var)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gv, rj0] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.f) {
            case 0:
                mu muVar = new mu((pj) this.i, (rj0) this.j, jiVar);
                muVar.h = obj;
                return muVar;
            default:
                mu muVar2 = new mu((fv0) this.j, jiVar);
                muVar2.h = obj;
                return muVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yt0] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yt0] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [gv, rj0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0058 -> B:18:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00de -> B:37:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00f3 -> B:37:0x00ad). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objJ;
        ?? r14;
        ?? r1;
        yt0 yt0Var;
        yt0 yt0Var2;
        pg0 pg0Var;
        int size;
        int i;
        switch (this.f) {
            case 0:
                pj pjVar = (pj) this.i;
                ?? r12 = this.g;
                yj yjVar = yj.d;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (i60.ak(pjVar)) {
                        throw e;
                    }
                    this.h = r12;
                    this.g = 3;
                    Object objJ2 = f00.j(r12, this);
                    r1 = r12;
                    if (objJ2 == yjVar) {
                        return yjVar;
                    }
                }
                if (r12 == 0) {
                    i60.az(obj);
                    r14 = (yt0) this.h;
                    if (!i60.ak(pjVar)) {
                    }
                } else if (r12 != 1) {
                    if (r12 == 2) {
                        yt0 yt0Var3 = (yt0) this.h;
                        i60.az(obj);
                        r1 = yt0Var3;
                    } else {
                        if (r12 != 3) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yt0 yt0Var4 = (yt0) this.h;
                        i60.az(obj);
                        r1 = yt0Var4;
                    }
                    r14 = r1;
                    if (!i60.ak(pjVar)) {
                        try {
                        } catch (CancellationException e2) {
                            r12 = r14;
                            e = e2;
                            if (i60.ak(pjVar)) {
                            }
                        }
                        ?? r13 = (rj0) this.j;
                        this.h = r14;
                        this.g = 1;
                        if (r13.f(r14, this) == yjVar) {
                            return yjVar;
                        }
                        r12 = r14;
                        this.h = r12;
                        this.g = 2;
                        objJ = f00.j(r12, this);
                        r1 = r12;
                        if (objJ == yjVar) {
                            return yjVar;
                        }
                        r14 = r1;
                        if (!i60.ak(pjVar)) {
                            return wz0.a;
                        }
                    }
                } else {
                    yt0 yt0Var5 = (yt0) this.h;
                    i60.az(obj);
                    r12 = yt0Var5;
                    this.h = r12;
                    this.g = 2;
                    objJ = f00.j(r12, this);
                    r1 = r12;
                    if (objJ == yjVar) {
                    }
                    r14 = r1;
                    if (!i60.ak(pjVar)) {
                    }
                }
                break;
            default:
                fv0 fv0Var = (fv0) this.j;
                int i2 = this.g;
                yj yjVar2 = yj.d;
                if (i2 == 0) {
                    i60.az(obj);
                    yt0Var = (yt0) this.h;
                    this.h = yt0Var;
                    this.g = 1;
                    obj = su0.b(yt0Var, (2 & 1) != 0, jg0.e, this);
                    if (obj == yjVar2) {
                        return yjVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pg0Var = (pg0) this.i;
                        yt0Var2 = (yt0) this.h;
                        i60.az(obj);
                        ?? r142 = ((ig0) obj).a;
                        size = r142.size();
                        i = 0;
                        while (i < size) {
                            pg0 pg0Var2 = (pg0) r142.get(i);
                            if (og0.a(pg0Var2.a, pg0Var.a) && pg0Var2.d) {
                                this.h = yt0Var2;
                                this.i = pg0Var;
                                this.g = 2;
                                obj = yt0Var2.a(jg0.e, this);
                                if (obj == yjVar2) {
                                    return yjVar2;
                                }
                                ?? r1422 = ((ig0) obj).a;
                                size = r1422.size();
                                i = 0;
                                while (i < size) {
                                }
                            } else {
                                i++;
                            }
                        }
                        fv0Var.b();
                        return wz0.a;
                    }
                    yt0Var = (yt0) this.h;
                    i60.az(obj);
                }
                pg0 pg0Var3 = (pg0) obj;
                long j = pg0Var3.c;
                fv0Var.d();
                yt0Var2 = yt0Var;
                pg0Var = pg0Var3;
                this.h = yt0Var2;
                this.i = pg0Var;
                this.g = 2;
                obj = yt0Var2.a(jg0.e, this);
                if (obj == yjVar2) {
                }
                ?? r14222 = ((ig0) obj).a;
                size = r14222.size();
                i = 0;
                while (i < size) {
                }
                fv0Var.b();
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(fv0 fv0Var, ji jiVar) {
        super(jiVar);
        this.j = fv0Var;
    }
}
