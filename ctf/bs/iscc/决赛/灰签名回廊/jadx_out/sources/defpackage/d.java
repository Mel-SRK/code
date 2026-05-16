package defpackage;

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.o(java.lang.Object):java.lang.Object");
    }
}
