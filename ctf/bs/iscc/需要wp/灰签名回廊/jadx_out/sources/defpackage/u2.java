package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends rj0 implements gv {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, ji jiVar, int i) {
        super(jiVar);
        this.f = i;
        this.i = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        yt0 yt0Var = (yt0) obj;
        ji jiVar = (ji) obj2;
        switch (this.f) {
            case 0:
                return ((u2) k(jiVar, yt0Var)).o(wz0.a);
            case 1:
                return ((u2) k(jiVar, yt0Var)).o(wz0.a);
            default:
                ((u2) k(jiVar, yt0Var)).o(wz0.a);
                return yj.d;
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.f) {
            case 0:
                u2 u2Var = new u2((v2) this.i, jiVar, 0);
                u2Var.h = obj;
                return u2Var;
            case 1:
                u2 u2Var2 = new u2((l1) this.i, jiVar, 1);
                u2Var2.h = obj;
                return u2Var2;
            default:
                u2 u2Var3 = new u2((cv) this.i, jiVar, 2);
                u2Var3.h = obj;
                return u2Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:14:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0103 -> B:47:0x0107). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2.o(java.lang.Object):java.lang.Object");
    }
}
