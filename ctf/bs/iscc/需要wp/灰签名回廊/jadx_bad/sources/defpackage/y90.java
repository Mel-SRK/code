package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y90 extends i70 implements sy0 {
    public final en0 r;
    public final a0 s;
    public y90 t;
    public final String u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public y90(en0 en0Var, a0 a0Var) {
        this.r = en0Var;
        this.s = a0Var;
    }

    @Override // defpackage.i70
    public final void bm() {
        a0 a0Var = this.s;
        a0Var.a = this;
        a0Var.b = null;
        this.t = null;
        a0Var.c = new b(15, this);
        a0Var.d = bi();
    }

    @Override // defpackage.i70
    public final void bn() {
        xi0 xi0Var = new xi0();
        lI.m(this, new t0(xi0Var, 2));
        y90 y90Var = (y90) ((sy0) xi0Var.d);
        this.t = y90Var;
        a0 a0Var = this.s;
        a0Var.b = y90Var;
        if (((y90) a0Var.a) == this) {
            a0Var.a = null;
        }
    }

    public final xj bu() {
        y90 y90Var = this.q ? (y90) lI.g(this) : null;
        xj xjVarBu = y90Var != null ? y90Var.bu() : null;
        if (xjVarBu != null && i60.al(xjVarBu)) {
            return xjVarBu;
        }
        xj xjVar = (xj) this.s.d;
        if (xjVar != null) {
            return xjVar;
        }
        wc.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bv(long j, long j2, ki kiVar) {
        w90 w90Var;
        long j3;
        long j4;
        long j5;
        y90 y90Var;
        long j6;
        long j7;
        if (kiVar instanceof w90) {
            w90Var = (w90) kiVar;
            int i = w90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w90Var.k = i - Integer.MIN_VALUE;
            } else {
                w90Var = new w90(this, kiVar);
            }
        }
        w90 w90Var2 = w90Var;
        Object objA = w90Var2.i;
        int i2 = w90Var2.k;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(objA);
            w90Var2.g = j;
            w90Var2.h = j2;
            w90Var2.k = 1;
            objA = this.r.a(j, j2, w90Var2);
            if (objA != yjVar) {
                j3 = j;
                j4 = j2;
            }
            return yjVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = w90Var2.g;
            i60.az(objA);
            j6 = ((o01) objA).a;
            j5 = j7;
            return new o01(o01.e(j5, j6));
        }
        j4 = w90Var2.h;
        j3 = w90Var2.g;
        i60.az(objA);
        j5 = ((o01) objA).a;
        boolean z = this.q;
        if (z) {
            y90Var = null;
            if (z && z) {
                y90Var = (y90) lI.g(this);
            }
        } else {
            y90Var = this.t;
        }
        if (y90Var == null) {
            j6 = 0;
            return new o01(o01.e(j5, j6));
        }
        long jE = o01.e(j3, j5);
        long jD = o01.d(j4, j5);
        w90Var2.g = j5;
        w90Var2.k = 2;
        objA = y90Var.bv(jE, jD, w90Var2);
        if (objA != yjVar) {
            j7 = j5;
            j6 = ((o01) objA).a;
            j5 = j7;
            return new o01(o01.e(j5, j6));
        }
        return yjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long bw(long j, long j2, int i) {
        long jG;
        en0 en0Var = this.r;
        if (en0Var.b) {
            rn0 rn0Var = en0Var.a;
            jG = rn0Var.a.b() ? 0L : rn0Var.g(rn0Var.c(rn0Var.a.d(rn0Var.c(rn0Var.f(j2)))));
        }
        boolean z = this.q;
        y90 y90Var = null;
        if (z && z) {
            y90Var = (y90) lI.g(this);
        }
        y90 y90Var2 = y90Var;
        return xa0.g(jG, y90Var2 != null ? y90Var2.bw(xa0.g(j, jG), xa0.f(j2, jG), i) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r14 != r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bx(long j, ji jiVar) {
        x90 x90Var;
        long j2;
        long j3;
        if (jiVar instanceof x90) {
            x90Var = (x90) jiVar;
            int i = x90Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                x90Var.j = i - Integer.MIN_VALUE;
            } else {
                x90Var = new x90(this, (ki) jiVar);
            }
        }
        Object objBx = x90Var.h;
        int i2 = x90Var.j;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(objBx);
            boolean z = this.q;
            y90 y90Var = null;
            if (z && z) {
                y90Var = (y90) lI.g(this);
            }
            if (y90Var != null) {
                x90Var.g = j;
                x90Var.j = 1;
                objBx = y90Var.bx(j, x90Var);
            } else {
                j2 = j;
                j3 = 0;
                o01.d(j2, j3);
                x90Var.g = j3;
                x90Var.j = 2;
                objBx = new o01(0L);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = x90Var.g;
                i60.az(objBx);
                return new o01(o01.e(j3, ((o01) objBx).a));
            }
            j = x90Var.g;
            i60.az(objBx);
        }
        j2 = j;
        j3 = ((o01) objBx).a;
        o01.d(j2, j3);
        x90Var.g = j3;
        x90Var.j = 2;
        objBx = new o01(0L);
    }

    public final long bz(long j, int i) {
        boolean z = this.q;
        y90 y90Var = null;
        if (z && z) {
            y90Var = (y90) lI.g(this);
        }
        long jBz = y90Var != null ? y90Var.bz(j, i) : 0L;
        xa0.f(j, jBz);
        return xa0.g(jBz, 0L);
    }

    @Override // defpackage.sy0
    public final Object p() {
        return this.u;
    }
}
