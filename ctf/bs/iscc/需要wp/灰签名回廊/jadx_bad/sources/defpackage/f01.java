package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public static final s5 f = new s5(0.0f);
    public final l01 a;
    public long b = Long.MIN_VALUE;
    public s5 c = f;
    public boolean d;
    public float e;

    public f01(q5 q5Var) {
        this.a = q5Var.a(k01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (defpackage.pk.ai(r15).m(r0, r1) == r9) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x00ec, PHI: r0 r1 r13 r14 r15
      0x007c: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x0075, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r1v4 e01) = (r1v2 e01), (r1v5 e01) binds: [B:30:0x0075, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r13v8 float) = (r13v5 float), (r13v9 float) binds: [B:30:0x0075, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r14v6 cv) = (r14v3 cv), (r14v7 cv) binds: [B:30:0x0075, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r15v16 f01) = (r15v8 f01), (r15v17 f01) binds: [B:30:0x0075, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ec, blocks: (B:37:0x00ad, B:31:0x007c, B:34:0x008e), top: B:60:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[PHI: r0 r1 r14 r15
      0x0089: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x0087, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r1v3 e01) = (r1v4 e01), (r1v5 e01) binds: [B:32:0x0087, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r14v4 cv) = (r14v6 cv), (r14v7 cv) binds: [B:32:0x0087, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r15v10 f01) = (r15v16 f01), (r15v17 f01) binds: [B:32:0x0087, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:37:0x00ad, B:31:0x007c, B:34:0x008e), top: B:60:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [pu] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [pu] */
    /* JADX WARN: Type inference failed for: r13v12, types: [pu] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v7, types: [ov] */
    /* JADX WARN: Type inference failed for: r14v0, types: [p7] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [f01] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [f01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00aa -> B:60:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g5 g5Var, p7 p7Var, ki kiVar) throws Throwable {
        e01 e01Var;
        e01 e01Var2;
        ?? r0;
        cv cvVar;
        float f2;
        f01 f01Var;
        ?? r02;
        ?? r03;
        ?? r14;
        ?? r13;
        if (kiVar instanceof e01) {
            e01Var = (e01) kiVar;
            int i = e01Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                e01Var.m = i - Integer.MIN_VALUE;
            } else {
                e01Var = new e01(this, kiVar);
            }
        }
        Object obj = e01Var.k;
        int i2 = e01Var.m;
        s5 s5Var = f;
        yj yjVar = yj.d;
        try {
            if (i2 == 0) {
                i60.az(obj);
                if (this.d) {
                    wc.q("animateToZero called while previous animation is running");
                    return null;
                }
                pj pjVar = e01Var.e;
                pjVar.getClass();
                p70 p70Var = (p70) pjVar.k(bw.ag);
                float fW = p70Var != null ? p70Var.w() : 1.0f;
                this.d = true;
                e01Var2 = e01Var;
                r0 = p7Var;
                cvVar = g5Var;
                f2 = fW;
                f01Var = this;
                r02 = r0;
                if (Math.abs(f01Var.e) < 0.01f) {
                }
                return yjVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pu puVar = (pu) e01Var.h;
                f01 f01Var2 = e01Var.g;
                i60.az(obj);
                r13 = puVar;
                p7Var = f01Var2;
                r13.a();
                r14 = p7Var;
                r14.b = Long.MIN_VALUE;
                r14.c = s5Var;
                r14.d = false;
                return wz0.a;
            }
            f2 = e01Var.j;
            pu puVar2 = e01Var.i;
            cv cvVar2 = (cv) e01Var.h;
            f01 f01Var3 = e01Var.g;
            try {
                i60.az(obj);
                e01 e01Var3 = e01Var;
                r03 = puVar2;
                cvVar = cvVar2;
                e01Var2 = e01Var3;
                f01Var = f01Var3;
            } catch (Throwable th) {
                th = th;
                p7Var = f01Var3;
                p7Var.b = Long.MIN_VALUE;
                p7Var.c = s5Var;
                p7Var.d = false;
                throw th;
            }
            try {
                r03.a();
                r0 = r03;
                r02 = r03;
                if (f2 == 0.0f) {
                    r02 = r0;
                    if (Math.abs(f01Var.e) < 0.01f) {
                        n2 n2Var = new n2(f01Var, f2, cvVar);
                        e01Var2.g = f01Var;
                        e01Var2.h = cvVar;
                        e01Var2.i = r0;
                        e01Var2.j = f2;
                        e01Var2.m = 1;
                        pj pjVar2 = e01Var2.e;
                        pjVar2.getClass();
                        r03 = r0;
                        if (pk.ai(pjVar2).m(n2Var, e01Var2) == yjVar) {
                        }
                        r03.a();
                        r0 = r03;
                        r02 = r03;
                        if (f2 == 0.0f) {
                        }
                    }
                    return yjVar;
                }
                f01 f01Var4 = f01Var;
                cv cvVar3 = cvVar;
                f01 f01Var5 = f01Var4;
                ?? r132 = r02;
                if (Math.abs(f01Var5.e) == 0.0f) {
                    r14 = f01Var5;
                } else {
                    a2 a2Var = new a2(27, f01Var5, cvVar3);
                    e01Var2.g = f01Var5;
                    e01Var2.h = r132;
                    e01Var2.i = null;
                    e01Var2.m = 2;
                    pj pjVar3 = e01Var2.e;
                    pjVar3.getClass();
                    r13 = r132;
                    p7Var = f01Var5;
                }
                r14.b = Long.MIN_VALUE;
                r14.c = s5Var;
                r14.d = false;
                return wz0.a;
            } catch (Throwable th2) {
                th = th2;
                p7Var = f01Var;
                p7Var.b = Long.MIN_VALUE;
                p7Var.c = s5Var;
                p7Var.d = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
