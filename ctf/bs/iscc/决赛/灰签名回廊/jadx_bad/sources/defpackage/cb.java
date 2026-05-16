package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb implements sv {
    public final pj d;
    public final int e;
    public final m9 f;
    public final yr g;

    public cb(yr yrVar, pj pjVar, int i, m9 m9Var) {
        this.d = pjVar;
        this.e = i;
        this.f = m9Var;
        this.g = yrVar;
    }

    public abstract cb a(pj pjVar, int i, m9 m9Var);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // defpackage.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zr zrVar, ji jiVar) {
        int i = this.e;
        yj yjVar = yj.d;
        ji jiVar2 = null;
        wz0 wz0Var = wz0.a;
        if (i == -3) {
            pj pjVarE = jiVar.e();
            Boolean bool = Boolean.FALSE;
            md mdVar = new md(8, (byte) 0);
            pj pjVar = this.d;
            pj pjVarJ = !((Boolean) pjVar.r(mdVar, bool)).booleanValue() ? pjVarE.j(pjVar) : e00.z(pjVarE, pjVar, false);
            if (f00.h(pjVarJ, pjVarE)) {
                Object objE = e(zrVar, (ki) jiVar);
                if (objE == yjVar) {
                    return objE;
                }
            } else {
                bw bwVar = bw.u;
                if (f00.h(pjVarJ.k(bwVar), pjVarE.k(bwVar))) {
                    pj pjVarE2 = jiVar.e();
                    if (!(zrVar instanceof mp0) && !(zrVar instanceof na0)) {
                        zrVar = new es(zrVar, pjVarE2);
                    }
                    Object objAx = m10.ax(pjVarJ, zrVar, t1.av(pjVarJ), new za(this, jiVar2, 1), jiVar);
                    if (objAx == yjVar) {
                        return objAx;
                    }
                } else {
                    Object objY = i60.y(new w8(zrVar, this, jiVar2, 1), jiVar);
                    if (objY != yjVar) {
                        objY = wz0Var;
                    }
                    if (objY == yjVar) {
                        return objY;
                    }
                }
            }
        }
        return wz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.sv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yr c(pj pjVar, int i, m9 m9Var) {
        pj pjVar2 = this.d;
        pj pjVarJ = pjVar.j(pjVar2);
        m9 m9Var2 = m9.d;
        m9 m9Var3 = this.f;
        int i2 = this.e;
        if (m9Var == m9Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            m9Var = m9Var3;
        }
        return (f00.h(pjVarJ, pjVar2) && i == i2 && m9Var == m9Var3) ? this : a(pjVarJ, i, m9Var);
    }

    public yr d() {
        return null;
    }

    public abstract Object e(zr zrVar, ki kiVar);

    public final String f() {
        ArrayList arrayList = new ArrayList(4);
        pq pqVar = pq.d;
        pj pjVar = this.d;
        if (pjVar != pqVar) {
            arrayList.add("context=" + pjVar);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        m9 m9Var = m9.d;
        m9 m9Var2 = this.f;
        if (m9Var2 != m9Var) {
            arrayList.add("onBufferOverflow=" + m9Var2);
        }
        return getClass().getSimpleName() + '[' + kc.av(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.g + " -> " + f();
    }
}
