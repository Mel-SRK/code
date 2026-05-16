package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ in0 j;
    public /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn0(in0 in0Var, long j, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = in0Var;
        this.k = j;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 1:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 2:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                long j = ((xa0) obj).a;
                fn0 fn0Var = new fn0(this.j, (ji) obj2);
                fn0Var.k = j;
                return fn0Var.o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new fn0(this.j, this.k, jiVar, 0);
            case 1:
                return new fn0(this.j, this.k, jiVar, 1);
            case 2:
                return new fn0(this.j, this.k, jiVar, 2);
            default:
                fn0 fn0Var = new fn0(this.j, jiVar);
                fn0Var.k = ((xa0) obj).a;
                return fn0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.h = 3;
        this.j = in0Var;
    }
}
