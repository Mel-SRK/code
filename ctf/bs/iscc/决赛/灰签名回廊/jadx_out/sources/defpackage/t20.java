package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class t20 {
    public final lf0 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public I1 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public t20(I1 i1, int i) {
        this.h = i;
        this.a = (lf0) i1;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [gv, rv] */
    /* JADX WARN: Type inference failed for: r3v5, types: [I1, lf0] */
    public static final void a(t20 t20Var, qx qxVar, int i, fa0 fa0Var) {
        HashMap map = t20Var.g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jY = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (t20Var.h) {
                    case 0:
                        uj0 uj0Var = fa0.am;
                        jY = fa0Var.Y(jY);
                        break;
                    default:
                        l50 l50VarB = fa0Var.B();
                        l50VarB.getClass();
                        long j = l50VarB.s;
                        jY = xa0.g((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jY);
                        break;
                }
                fa0Var = fa0Var.t;
                fa0Var.getClass();
                if (fa0Var.equals(t20Var.a.p())) {
                    int iRound = Math.round(qxVar instanceof qx ? Float.intBitsToFloat((int) (jY & 4294967295L)) : Float.intBitsToFloat((int) (jY >> 32)));
                    if (map.containsKey(qxVar)) {
                        map.getClass();
                        Object obj = map.get(qxVar);
                        if (obj == null && !map.containsKey(qxVar)) {
                            throw new NoSuchElementException("Key " + qxVar + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        qx qxVar2 = O1.a;
                        iRound = ((Number) qxVar.a.f(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(qxVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!t20Var.b(fa0Var).containsKey(qxVar));
            float fC = t20Var.c(fa0Var, qxVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(fa0 fa0Var) {
        switch (this.h) {
            case 0:
                return fa0Var.br().a();
            default:
                l50 l50VarB = fa0Var.B();
                l50VarB.getClass();
                return l50VarB.br().a();
        }
    }

    public final int c(fa0 fa0Var, qx qxVar) {
        switch (this.h) {
            case 0:
                return fa0Var.bm(qxVar);
            default:
                l50 l50VarB = fa0Var.B();
                l50VarB.getClass();
                return l50VarB.bm(qxVar);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I1, lf0] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        I1 i1R = r0.r();
        if (i1R == null) {
            return;
        }
        if (this.c) {
            i1R.requestLayout();
        }
        if (this.d) {
            r0.as();
        }
        if (this.e) {
            r0.requestLayout();
        }
        i1R.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [I1, lf0] */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        l1 l1Var = new l1(0, this);
        ?? r2 = this.a;
        r2.n(l1Var);
        map.putAll(b(r2.p()));
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [I1, lf0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [I1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            lf0 r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            I1 r0 = r1.r()
            if (r0 != 0) goto L10
            goto L53
        L10:
            t20 r0 = r0.a()
            I1 r1 = r0.f
            if (r1 == 0) goto L23
            t20 r0 = r1.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            I1 r0 = r2.f
            if (r0 == 0) goto L53
            t20 r1 = r0.a()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            I1 r1 = r0.r()
            if (r1 == 0) goto L41
            t20 r1 = r1.a()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            I1 r0 = r0.r()
            if (r0 == 0) goto L50
            t20 r0 = r0.a()
            if (r0 == 0) goto L50
            I1 r1 = r0.f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.h():void");
    }
}
