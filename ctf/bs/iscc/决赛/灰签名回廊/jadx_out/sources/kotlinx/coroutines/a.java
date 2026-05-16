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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pj v(defpackage.oj r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.qj
            if (r0 == 0) goto L1e
            qj r3 = (defpackage.qj) r3
            oj r0 = r2.d
            if (r0 == r3) goto L13
            oj r1 = r3.e
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            cv r3 = r3.d
            java.lang.Object r3 = r3.g(r2)
            nj r3 = (defpackage.nj) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            bw r0 = defpackage.bw.u
            if (r0 != r3) goto L25
        L22:
            pq r3 = defpackage.pq.d
            return r3
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.v(oj):pj");
    }
}
