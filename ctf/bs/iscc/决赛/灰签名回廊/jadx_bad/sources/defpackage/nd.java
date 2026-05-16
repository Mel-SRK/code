package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class nd implements pj, Serializable {
    public final pj d;
    public final nj e;

    public nd(nj njVar, pj pjVar) {
        pjVar.getClass();
        njVar.getClass();
        this.d = pjVar;
        this.e = njVar;
    }

    public final boolean equals(Object obj) {
        boolean zH;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nd) {
            nd ndVar = (nd) obj;
            int i = 2;
            nd ndVar2 = ndVar;
            int i2 = 2;
            while (true) {
                pj pjVar = ndVar2.d;
                ndVar2 = pjVar instanceof nd ? (nd) pjVar : null;
                if (ndVar2 == null) {
                    break;
                }
                i2++;
            }
            nd ndVar3 = this;
            while (true) {
                pj pjVar2 = ndVar3.d;
                ndVar3 = pjVar2 instanceof nd ? (nd) pjVar2 : null;
                if (ndVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                nd ndVar4 = this;
                while (true) {
                    nj njVar = ndVar4.e;
                    if (!f00.h(ndVar.k(njVar.getKey()), njVar)) {
                        zH = false;
                        break;
                    }
                    pj pjVar3 = ndVar4.d;
                    if (!(pjVar3 instanceof nd)) {
                        pjVar3.getClass();
                        nj njVar2 = (nj) pjVar3;
                        zH = f00.h(ndVar.k(njVar2.getKey()), njVar2);
                        break;
                    }
                    ndVar4 = (nd) pjVar3;
                }
                if (zH) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        pjVar.getClass();
        return pjVar == pq.d ? this : (pj) pjVar.r(new md(5, (byte) 0), this);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        ojVar.getClass();
        nd ndVar = this;
        while (true) {
            nj njVarK = ndVar.e.k(ojVar);
            if (njVarK != null) {
                return njVarK;
            }
            pj pjVar = ndVar.d;
            if (!(pjVar instanceof nd)) {
                return pjVar.k(ojVar);
            }
            ndVar = (nd) pjVar;
        }
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(this.d.r(gvVar, obj), this.e);
    }

    public final String toString() {
        return "[" + ((String) r(new md(0, (byte) 0), "")) + ']';
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        ojVar.getClass();
        nj njVar = this.e;
        nj njVarK = njVar.k(ojVar);
        pj pjVar = this.d;
        if (njVarK != null) {
            return pjVar;
        }
        pj pjVarV = pjVar.v(ojVar);
        return pjVarV == pjVar ? this : pjVarV == pq.d ? njVar : new nd(njVar, pjVarV);
    }
}
