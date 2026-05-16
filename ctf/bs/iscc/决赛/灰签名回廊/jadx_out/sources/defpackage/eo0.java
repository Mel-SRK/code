package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends rj0 implements gv {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(bu buVar, cc ccVar, fv0 fv0Var, ji jiVar) {
        super(jiVar);
        this.i = buVar;
        this.j = ccVar;
        this.k = fv0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        yt0 yt0Var = (yt0) obj;
        ji jiVar = (ji) obj2;
        switch (this.f) {
        }
        return ((eo0) k(jiVar, yt0Var)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.f) {
            case 0:
                eo0 eo0Var = new eo0((bu) this.i, (cc) this.j, (fv0) this.k, jiVar);
                eo0Var.h = obj;
                return eo0Var;
            default:
                eo0 eo0Var2 = new eo0((ht0) this.k, jiVar);
                eo0Var2.h = obj;
                return eo0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r10 == r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r11 != r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (r5 != r8) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ca -> B:41:0x00cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0156 -> B:69:0x015a). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(ht0 ht0Var, ji jiVar) {
        super(jiVar);
        this.k = ht0Var;
    }
}
