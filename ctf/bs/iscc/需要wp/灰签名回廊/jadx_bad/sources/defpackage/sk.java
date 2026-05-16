package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sk extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk(Object obj, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) throws Throwable {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
            case 2:
                ((sk) k(jiVar, xjVar)).o(wz0.a);
                break;
        }
        return ((sk) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new sk((tk) this.j, jiVar, 0);
            case 1:
                return new sk((lt) this.j, jiVar, 1);
            case 2:
                return new sk((t50) this.j, jiVar, 2);
            case 3:
                return new sk((zt0) this.j, jiVar, 3);
            default:
                return new sk((kk) this.j, jiVar, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Type inference failed for: r9v23, types: [gv, tt0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00a6 -> B:41:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00bf -> B:51:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk.o(java.lang.Object):java.lang.Object");
    }
}
