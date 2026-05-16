package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class eo extends rj0 implements gv {
    public Object f;
    public Serializable g;
    public yt0 h;
    public wi0 i;
    public ey0 j;
    public pg0 k;
    public boolean l;
    public float m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ x10 p;
    public final /* synthetic */ wc0 q;
    public final /* synthetic */ x10 r;
    public final /* synthetic */ x10 s;
    public final /* synthetic */ x10 t;
    public final /* synthetic */ x10 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eo(pu puVar, wc0 wc0Var, gv gvVar, gv gvVar2, pu puVar2, cv cvVar, ji jiVar) {
        super(jiVar);
        this.p = (x10) puVar;
        this.q = wc0Var;
        this.r = (x10) gvVar;
        this.s = (x10) gvVar2;
        this.t = (x10) puVar2;
        this.u = (x10) cvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((eo) k((ji) obj2, (yt0) obj)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        eo eoVar = new eo(this.p, this.q, this.r, this.s, this.t, this.u, jiVar);
        eoVar.o = obj;
        return eoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e8, code lost:
    
        if (defpackage.go.d(r5.i.w, r2) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        if (r8 != r13) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x038d, code lost:
    
        if ((r2 != null ? r2 == defpackage.wc0.d ? defpackage.xa0.e(r8) : defpackage.xa0.d(r8) : defpackage.xa0.c(r8)) == 0.0f) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r6 == r13) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:137:0x034c, B:148:0x0371], limit reached: 170 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[PHI: r1 r2 r3 r4 r5 r6 r8 r9 r10 r12 r15
      0x013e: PHI (r1v20 float) = (r1v21 float), (r1v38 float) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r2v7 jg0) = (r2v34 jg0), (r2v0 jg0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r3v5 wc0) = (r3v37 wc0), (r3v0 wc0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r4v20 wi0) = (r4v30 wi0), (r4v50 wi0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r5v8 yt0) = (r5v11 yt0), (r5v31 yt0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r6v10 yt0) = (r6v13 yt0), (r6v22 yt0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r8v10 pg0) = (r8v13 pg0), (r8v29 pg0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r9v4 wi0) = (r9v5 wi0), (r9v15 wi0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r10v4 int) = (r10v22 int), (r10v0 int) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r12v2 ey0) = (r12v3 ey0), (r12v12 ey0) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r15v0 java.lang.Object) = (r15v3 java.lang.Object), (r15v6 java.lang.Object) binds: [B:39:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Type inference failed for: r1v12, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28, types: [cv, x10] */
    /* JADX WARN: Type inference failed for: r1v29, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gv, x10] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [gv] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0299 -> B:107:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0312 -> B:125:0x0315). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f6 -> B:31:0x00fa). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.o(java.lang.Object):java.lang.Object");
    }
}
