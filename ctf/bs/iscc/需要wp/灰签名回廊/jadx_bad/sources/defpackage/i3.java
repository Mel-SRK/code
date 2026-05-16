package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i3(tg0 tg0Var, hv hvVar, cv cvVar, hh0 hh0Var, ji jiVar) {
        super(2, jiVar);
        this.h = 5;
        this.k = tg0Var;
        this.l = (tt0) hvVar;
        this.m = (x10) cvVar;
        this.n = hh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) throws Throwable {
        switch (this.h) {
            case 0:
                ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
                return yj.d;
            case 1:
                return ((i3) k((ji) obj2, (pn0) obj)).o(wz0.a);
            case 2:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 3:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 4:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 5:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                return ((i3) k((ji) obj2, (tg0) obj)).o(wz0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [hv, tt0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                i3 i3Var = new i3((w3) this.k, (cv) this.l, (k3) this.m, (c30) this.n, jiVar, 0);
                i3Var.j = obj;
                return i3Var;
            case 1:
                i3 i3Var2 = new i3((f01) this.k, (lh) this.l, (c9) this.m, (t00) this.n, jiVar, 1);
                i3Var2.j = obj;
                return i3Var2;
            case 2:
                return new i3((h30) this.j, (w80) this.k, (qw0) this.l, (cw0) this.m, (ey) this.n, jiVar, 2);
            case 3:
                return new i3((t8) this.j, (lw0) this.k, (h30) this.l, (ax0) this.m, (ab0) this.n, jiVar, 3);
            case 4:
                i3 i3Var3 = new i3((mi0) this.l, (li0) this.m, (o70) this.n, jiVar);
                i3Var3.j = obj;
                return i3Var3;
            case 5:
                i3 i3Var4 = new i3((tg0) this.k, (tt0) this.l, (x10) this.m, (hh0) this.n, jiVar);
                i3Var4.j = obj;
                return i3Var4;
            default:
                i3 i3Var5 = new i3((xj) this.k, (w80) this.l, (g80) this.m, (w80) this.n, jiVar, 6);
                i3Var5.j = obj;
                return i3Var5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v20, types: [hv, tt0] */
    /* JADX WARN: Type inference failed for: r7v23, types: [cv, x10] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        ps0 ps0Var;
        ef0 ef0Var;
        gb0 gb0Var;
        t00 t00Var;
        mi0 mi0Var;
        List listY;
        Object obj2;
        mi0 mi0Var2;
        mi0 mi0Var3;
        int i = 2;
        ji jiVar = null;
        switch (this.h) {
            case 0:
                k3 k3Var = (k3) this.m;
                w3 w3Var = (w3) this.k;
                yj yjVar = yj.d;
                int i2 = this.i;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i60.az(obj);
                        throw new xd();
                    }
                    i60.az(obj);
                    xj xjVar = (xj) this.j;
                    e30 e30Var = f30.a;
                    View view = w3Var.d;
                    e30Var.getClass();
                    cz czVar = new cz(view);
                    i30 i30Var = new i30(w3Var.d, new h3((c30) this.n), czVar);
                    if (it0.a) {
                        i60.an(xjVar, null, new c(k3Var, czVar, jiVar, 4), 3);
                    }
                    cv cvVar = (cv) this.l;
                    if (cvVar != null) {
                        cvVar.g(i30Var);
                    }
                    k3Var.c = i30Var;
                    this.i = 1;
                    w3Var.a(i30Var, this);
                    return yjVar;
                } catch (Throwable th) {
                    k3Var.c = null;
                    throw th;
                }
            case 1:
                c9 c9Var = (c9) this.m;
                lh lhVar = (lh) this.l;
                f01 f01Var = (f01) this.k;
                yj yjVar2 = yj.d;
                int i3 = this.i;
                if (i3 == 0) {
                    i60.az(obj);
                    pn0 pn0Var = (pn0) this.j;
                    f01Var.e = lh.bu(lhVar, c9Var);
                    g5 g5Var = new g5(lhVar, (t00) this.n, pn0Var, 2);
                    p7 p7Var = new p7(lhVar, f01Var, c9Var, 2);
                    this.i = 1;
                    if (f01Var.a(g5Var, p7Var, this) == yjVar2) {
                        return yjVar2;
                    }
                } else {
                    if (i3 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0.a;
            case 2:
                h30 h30Var = (h30) this.j;
                yj yjVar3 = yj.d;
                int i4 = this.i;
                try {
                    if (i4 == 0) {
                        i60.az(obj);
                        bu buVar = new bu(new mr0(new oi((w80) this.k, 0), null));
                        gb gbVar = new gb(h30Var, (qw0) this.l, (cw0) this.m, (ey) this.n, 1);
                        this.i = 1;
                        if (buVar.b(gbVar, this) == yjVar3) {
                            return yjVar3;
                        }
                    } else {
                        if (i4 != 1) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i60.az(obj);
                    }
                    az0.j(h30Var);
                    return wz0.a;
                } catch (Throwable th2) {
                    az0.j(h30Var);
                    throw th2;
                }
            case 3:
                wz0 wz0Var = wz0.a;
                yj yjVar4 = yj.d;
                int i5 = this.i;
                if (i5 == 0) {
                    i60.az(obj);
                    t8 t8Var = (t8) this.j;
                    lw0 lw0Var = (lw0) this.k;
                    dv0 dv0Var = ((h30) this.l).a;
                    zw0 zw0Var = ((ax0) this.m).a;
                    ab0 ab0Var = (ab0) this.n;
                    this.i = 1;
                    int iD = ab0Var.d(hx0.d(lw0Var.b));
                    Object objA = t8Var.a(iD < zw0Var.a.a.e.length() ? zw0Var.b(iD) : iD != 0 ? zw0Var.b(iD - 1) : new ri0(0.0f, 0.0f, 1.0f, (int) (kv0.a(dv0Var.b, dv0Var.g, dv0Var.h, kv0.a, 1) & 4294967295L)), this);
                    if (objA != yjVar4) {
                        objA = wz0Var;
                    }
                    if (objA == yjVar4) {
                        return yjVar4;
                    }
                } else {
                    if (i5 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0Var;
            case 4:
                yj yjVar5 = yj.d;
                int i6 = this.i;
                if (i6 == 0) {
                    i60.az(obj);
                    t00 t00VarAf = i60.af(((xj) this.j).f());
                    mi0 mi0Var4 = (mi0) this.l;
                    synchronized (mi0Var4.b) {
                        Throwable th3 = mi0Var4.d;
                        if (th3 != null) {
                            throw th3;
                        }
                        if (((ii0) mi0Var4.t.getValue()).compareTo(ii0.e) <= 0) {
                            throw new IllegalStateException("Recomposer shut down");
                        }
                        if (mi0Var4.c != null) {
                            throw new IllegalStateException("Recomposer already running");
                        }
                        mi0Var4.c = t00VarAf;
                        mi0Var4.v();
                    }
                    n3 n3Var = new n3(i, (mi0) this.l);
                    fr0.f(fr0.a);
                    synchronized (fr0.c) {
                        fr0.h = kc.ay(fr0.h, n3Var);
                    }
                    gb0 gb0Var2 = new gb0(n3Var);
                    ps0 ps0Var2 = mi0.x;
                    yf0 yf0Var = ((mi0) this.l).w;
                    try {
                        do {
                            ps0Var = mi0.x;
                            ef0 ef0Var2 = (ef0) ps0Var.getValue();
                            bw bwVar = bw.ab;
                            ve0 ve0Var = ef0Var2.f;
                            if (ve0Var.containsKey(yf0Var)) {
                                ef0Var = ef0Var2;
                            } else if (ef0Var2.isEmpty()) {
                                ef0Var = new ef0(yf0Var, yf0Var, ve0Var.a(yf0Var, new l40(bwVar, bwVar)));
                            } else {
                                Object obj3 = ef0Var2.e;
                                Object obj4 = ve0Var.get(obj3);
                                obj4.getClass();
                                ef0Var = new ef0(ef0Var2.d, yf0Var, ve0Var.a(obj3, new l40(((l40) obj4).a, yf0Var)).a(yf0Var, new l40(obj3, bwVar)));
                            }
                            if (ef0Var2 != ef0Var) {
                                jq jqVar = m10.d;
                                obj2 = ef0Var2;
                                if (ef0Var2 == null) {
                                    obj2 = jqVar;
                                }
                            }
                            mi0Var = (mi0) this.l;
                            synchronized (mi0Var.b) {
                                listY = mi0Var.y();
                            }
                            int size = listY.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((jg) listY.get(i7)).o();
                            }
                            w8 w8Var = new w8((li0) this.m, (o70) this.n, (ji) null, 7);
                            this.j = t00VarAf;
                            this.k = gb0Var2;
                            this.i = 1;
                            if (i60.y(w8Var, this) == yjVar5) {
                                return yjVar5;
                            }
                            gb0Var = gb0Var2;
                            t00Var = t00VarAf;
                            gb0Var.b();
                            mi0Var3 = (mi0) this.l;
                            synchronized (mi0Var3.b) {
                            }
                        } while (!ps0Var.h(obj2, ef0Var));
                        mi0Var = (mi0) this.l;
                        synchronized (mi0Var.b) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        gb0Var = gb0Var2;
                        t00Var = t00VarAf;
                        Throwable th5 = th;
                        gb0Var.b();
                        mi0Var2 = (mi0) this.l;
                        synchronized (mi0Var2.b) {
                            try {
                                if (mi0Var2.c == t00Var) {
                                    mi0Var2.c = null;
                                }
                                mi0Var2.v();
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        ps0 ps0Var3 = mi0.x;
                        yf0.a(((mi0) this.l).w);
                        throw th5;
                    }
                } else {
                    if (i6 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gb0Var = (gb0) this.k;
                    t00Var = (t00) this.j;
                    try {
                        i60.az(obj);
                        gb0Var.b();
                        mi0Var3 = (mi0) this.l;
                        synchronized (mi0Var3.b) {
                            try {
                                if (mi0Var3.c == t00Var) {
                                    mi0Var3.c = null;
                                }
                                mi0Var3.v();
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                        ps0 ps0Var4 = mi0.x;
                        yf0.a(((mi0) this.l).w);
                        return wz0.a;
                    } catch (Throwable th8) {
                        th = th8;
                        Throwable th52 = th;
                        gb0Var.b();
                        mi0Var2 = (mi0) this.l;
                        synchronized (mi0Var2.b) {
                        }
                    }
                }
                break;
            case 5:
                yj yjVar6 = yj.d;
                int i8 = this.i;
                if (i8 == 0) {
                    i60.az(obj);
                    xj xjVar2 = (xj) this.j;
                    tg0 tg0Var = (tg0) this.k;
                    nu0 nu0Var = new nu0(xjVar2, (hv) this.l, (cv) this.m, (hh0) this.n, (ji) null);
                    this.i = 1;
                    if (f00.k(tg0Var, nu0Var, this) == yjVar6) {
                        return yjVar6;
                    }
                } else {
                    if (i8 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0.a;
            default:
                wz0 wz0Var2 = wz0.a;
                yj yjVar7 = yj.d;
                int i9 = this.i;
                if (i9 == 0) {
                    i60.az(obj);
                    tg0 tg0Var2 = (tg0) this.j;
                    vv0 vv0Var = new vv0((xj) this.k, (w80) this.l, (g80) this.m, null);
                    v1 v1Var = new v1((w80) this.n, 2);
                    this.i = 1;
                    iu0 iu0Var = su0.a;
                    Object objY = i60.y(new i3(tg0Var2, vv0Var, v1Var, new hh0(tg0Var2), null), this);
                    if (objY != yjVar7) {
                        objY = wz0Var2;
                    }
                    if (objY == yjVar7) {
                        return yjVar7;
                    }
                } else {
                    if (i9 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(mi0 mi0Var, li0 li0Var, o70 o70Var, ji jiVar) {
        super(2, jiVar);
        this.h = 4;
        this.l = mi0Var;
        this.m = li0Var;
        this.n = o70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, Object obj4, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }
}
