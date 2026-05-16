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
    */
    public final void h() {
        t20 t20VarA;
        t20 t20VarA2;
        boolean zD = d();
        ?? r1 = this.a;
        ?? r12 = r1;
        if (!zD) {
            I1 i1R = r1.r();
            if (i1R == null) {
                return;
            }
            I1 i1 = i1R.a().f;
            if (i1 != null) {
                boolean zD2 = i1.a().d();
                r12 = i1;
                if (!zD2) {
                    I1 i12 = this.f;
                    if (i12 == null || i12.a().d()) {
                        return;
                    }
                    I1 i1R2 = i12.r();
                    if (i1R2 != null && (t20VarA2 = i1R2.a()) != null) {
                        t20VarA2.h();
                    }
                    I1 i1R3 = i12.r();
                    r12 = (i1R3 == null || (t20VarA = i1R3.a()) == null) ? 0 : t20VarA.f;
                }
            }
        }
        this.f = r12;
    }
}
