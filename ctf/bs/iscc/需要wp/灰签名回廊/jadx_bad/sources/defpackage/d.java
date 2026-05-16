package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class d extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ long j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.l = obj;
        this.j = j;
        this.m = obj2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((d) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 1:
                return ((d) k((ji) obj2, (pn0) obj)).o(wz0.a);
            default:
                return ((d) k((ji) obj2, (xj) obj)).o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new d((yb) this.l, this.j, (g80) this.m, jiVar, 0);
            case 1:
                d dVar = new d((rn0) this.l, this.j, (ui0) this.m, jiVar, 1);
                dVar.k = obj;
                return dVar;
            default:
                return new d((w80) this.l, this.j, (g80) this.m, jiVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0208, code lost:
    
        if (((defpackage.g80) r9).a(r0, r19) == r7) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r9.a(r4, r19) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r9.a(r0, r19) == r7) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [i70] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10, types: [a90] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        boolean z;
        boolean z2;
        da0 da0Var;
        ?? r16;
        ?? M;
        int i;
        boolean z3;
        jh0 jh0Var;
        w80 w80Var;
        jh0 jh0Var2;
        int i2 = this.h;
        wz0 wz0Var = wz0.a;
        long j = this.j;
        yj yjVar = yj.d;
        Object obj2 = this.l;
        Object obj3 = this.m;
        int i3 = 1;
        Object obj4 = null;
        switch (i2) {
            case 0:
                yb ybVar = (yb) obj2;
                int i4 = this.i;
                if (i4 == 0) {
                    i60.az(obj);
                    if (!ybVar.d.q) {
                        sy.b("visitAncestors called on an unattached node");
                    }
                    i70 i70Var = ybVar.d.h;
                    s20 s20VarAy = pk.ay(ybVar);
                    boolean z4 = false;
                    while (s20VarAy != null) {
                        int i5 = 262144;
                        if ((((i70) s20VarAy.ag.j).g & 262144) != 0) {
                            while (i70Var != null) {
                                if ((i70Var.f & i5) != 0) {
                                    ?? r14 = i70Var;
                                    ?? r162 = obj4;
                                    while (r14 != 0) {
                                        if (r14 instanceof sy0) {
                                            sy0 sy0Var = (sy0) r14;
                                            if (zm0.s.equals(sy0Var.p())) {
                                                boolean z5 = z4 || ((zm0) sy0Var).r;
                                                z3 = !z5;
                                                z4 = z5;
                                            } else {
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                if (!z4) {
                                                    int i6 = zb.b;
                                                    ViewParent parent = e00.ag(ybVar).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (viewGroup.shouldDelayChildPressedState()) {
                                                            z2 = true;
                                                            if (z2) {
                                                                z = false;
                                                            }
                                                            if (z) {
                                                                long j2 = zb.a;
                                                                this.i = 1;
                                                                if (t1.l(j2, this) != yjVar) {
                                                                }
                                                                return yjVar;
                                                            }
                                                        } else {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                    if (z) {
                                                    }
                                                }
                                                z = true;
                                                if (z) {
                                                }
                                            }
                                        } else {
                                            if ((r14.f & i5) != 0 && (r14 instanceof rl)) {
                                                i70 i70Var2 = ((rl) r14).s;
                                                int i7 = 0;
                                                M = r14;
                                                r16 = r162;
                                                while (i70Var2 != null) {
                                                    int i8 = i5;
                                                    if ((i70Var2.f & i8) != 0) {
                                                        i7++;
                                                        if (i7 == 1) {
                                                            M = i70Var2;
                                                        } else {
                                                            ?? a90Var = r16 == 0 ? new a90(new i70[16]) : r16;
                                                            if (M != 0) {
                                                                a90Var.b(M);
                                                                M = 0;
                                                            }
                                                            a90Var.b(i70Var2);
                                                            r16 = a90Var;
                                                        }
                                                    }
                                                    i70Var2 = i70Var2.i;
                                                    i5 = i8;
                                                    M = M;
                                                    r16 = r16;
                                                }
                                                i = i5;
                                                r16 = r16;
                                                if (i7 == 1) {
                                                }
                                                i5 = i;
                                                r14 = M;
                                                r162 = r16;
                                            }
                                            M = pk.m(r16);
                                            i5 = i;
                                            r14 = M;
                                            r162 = r16;
                                        }
                                        i = i5;
                                        r16 = r162;
                                        M = pk.m(r16);
                                        i5 = i;
                                        r14 = M;
                                        r162 = r16;
                                    }
                                }
                                i70Var = i70Var.h;
                                i5 = i5;
                                obj4 = null;
                            }
                        }
                        s20VarAy = s20VarAy.q();
                        i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                        obj4 = null;
                    }
                    if (!z4) {
                    }
                    z = true;
                    if (z) {
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jh0Var = (jh0) this.k;
                        i60.az(obj);
                        ybVar.ac = jh0Var;
                        return wz0Var;
                    }
                    i60.az(obj);
                }
                jh0Var = new jh0(j);
                this.k = jh0Var;
                this.i = 2;
                break;
            case 1:
                rn0 rn0Var = (rn0) obj2;
                int i9 = this.i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i60.az(obj);
                        return wz0Var;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                pn0 pn0Var = (pn0) this.k;
                float f = rn0Var.f(j);
                hj hjVar = new hj((ui0) obj3, rn0Var, pn0Var, i3);
                this.i = 1;
                es0 es0VarAd = f00.ad(7, null);
                zy0 zy0Var = k01.a;
                Float f2 = new Float(0.0f);
                Float f3 = new Float(f);
                s5 s5Var = new s5(new Float(0.0f).floatValue());
                Object objC = lI.c(new r5(zy0Var, f2, s5Var, 56), new tu0(es0VarAd, zy0Var, f2, f3, s5Var), Long.MIN_VALUE, new l1(hjVar), this);
                if (objC != yjVar) {
                    objC = wz0Var;
                }
                if (objC != yjVar) {
                    objC = wz0Var;
                }
                return objC == yjVar ? yjVar : wz0Var;
            default:
                g80 g80Var = (g80) obj3;
                w80 w80Var2 = (w80) obj2;
                int i10 = this.i;
                if (i10 == 0) {
                    i60.az(obj);
                    jh0 jh0Var3 = (jh0) w80Var2.getValue();
                    if (jh0Var3 == null) {
                        jh0Var2 = new jh0(j);
                        if (g80Var != null) {
                            this.k = jh0Var2;
                            this.i = 2;
                            break;
                        }
                        w80Var2.setValue(jh0Var2);
                        return wz0Var;
                    }
                    ih0 ih0Var = new ih0(jh0Var3);
                    if (g80Var != null) {
                        this.k = w80Var2;
                        this.i = 1;
                    }
                    w80Var = w80Var2;
                    break;
                    return yjVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jh0Var2 = (jh0) this.k;
                    i60.az(obj);
                    w80Var2.setValue(jh0Var2);
                    return wz0Var;
                }
                w80Var = (w80) this.k;
                i60.az(obj);
                w80Var.setValue(null);
                jh0Var2 = new jh0(j);
                if (g80Var != null) {
                }
                w80Var2.setValue(jh0Var2);
                return wz0Var;
        }
    }
}
