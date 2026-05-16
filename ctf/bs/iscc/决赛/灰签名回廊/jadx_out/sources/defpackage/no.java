package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class no extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public xi0 i;
    public xi0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ in0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(xi0 xi0Var, in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.j = xi0Var;
        this.m = in0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((no) k((ji) obj2, (cv) obj)).o(wz0.a);
            default:
                return ((no) k((ji) obj2, (xj) obj)).o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                no noVar = new no(this.j, this.m, jiVar);
                noVar.l = obj;
                return noVar;
            default:
                no noVar2 = new no(this.m, jiVar);
                noVar2.l = obj;
                return noVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if (defpackage.in0.bx(r3, r10) != r5) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:48:0x00d7, B:44:0x00c5], limit reached: 89 */
    /* JADX WARN: Path cross not found for [B:50:0x00db, B:20:0x005e], limit reached: 89 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0 r6
      0x003a: PHI (r0v13 xi0) = (r0v5 xi0), (r0v17 xi0) binds: [B:14:0x0037, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v6 xj) = (r6v4 xj), (r6v7 xj) binds: [B:14:0x0037, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v8 xj) = (r7v0 xj), (r7v3 xj), (r7v3 xj), (r7v3 xj), (r7v6 xj), (r7v9 xj) binds: [B:19:0x0056, B:49:0x00d9, B:51:0x00e6, B:45:0x00d2, B:31:0x008a, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:42:0x00bf, B:44:0x00c5, B:48:0x00d7, B:50:0x00db), top: B:89:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:42:0x00bf, B:44:0x00c5, B:48:0x00d7, B:50:0x00db), top: B:89:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d2 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f4 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0148 -> B:79:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014d -> B:81:0x014e). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.m = in0Var;
    }
}
