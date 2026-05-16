package kotlinx.coroutines;

import defpackage.bw;
import defpackage.c6;
import defpackage.i60;
import defpackage.m;
import defpackage.nj;
import defpackage.oj;
import defpackage.pj;
import defpackage.pk;
import defpackage.qj;
import defpackage.tz0;
import defpackage.y30;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends m implements nj {
    public static final qj e = new qj(bw.u, new c6(1));

    public a() {
        super(bw.u);
    }

    public abstract void d(pj pjVar, Runnable runnable);

    public boolean e(pj pjVar) {
        return !(this instanceof tz0);
    }

    public a f(int i) {
        i60.p(i);
        return new y30(this, i);
    }

    @Override // defpackage.m, defpackage.pj
    public final nj k(oj ojVar) {
        nj njVar;
        ojVar.getClass();
        if (ojVar instanceof qj) {
            qj qjVar = (qj) ojVar;
            oj ojVar2 = this.d;
            if ((ojVar2 == qjVar || qjVar.e == ojVar2) && (njVar = (nj) qjVar.d.g(this)) != null) {
                return njVar;
            }
        } else if (bw.u == ojVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + pk.ae(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (((defpackage.nj) r3.d.g(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (defpackage.bw.u == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        return defpackage.pq.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return r2;
     */
    @Override // defpackage.m, defpackage.pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pj v(oj ojVar) {
        ojVar.getClass();
        if (ojVar instanceof qj) {
            qj qjVar = (qj) ojVar;
            oj ojVar2 = this.d;
            if (ojVar2 != qjVar) {
                if (qjVar.e != ojVar2) {
                    return this;
                }
            }
        }
    }
}
