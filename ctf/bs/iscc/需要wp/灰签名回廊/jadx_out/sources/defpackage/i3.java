package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i3(tg0 tg0Var, hv hvVar, cv cvVar, hh0 hh0Var, ji jiVar) {
        super(2, jiVar);
        this.h = 5;
        this.k = tg0Var;
        this.l = (tt0) hvVar;
        this.m = (x10) cvVar;
        this.n = hh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) throws Throwable {
        switch (this.h) {
            case 0:
                ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
                return yj.d;
            case 1:
                return ((i3) k((ji) obj2, (pn0) obj)).o(wz0.a);
            case 2:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 3:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 4:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 5:
                return ((i3) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                return ((i3) k((ji) obj2, (tg0) obj)).o(wz0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [hv, tt0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                i3 i3Var = new i3((w3) this.k, (cv) this.l, (k3) this.m, (c30) this.n, jiVar, 0);
                i3Var.j = obj;
                return i3Var;
            case 1:
                i3 i3Var2 = new i3((f01) this.k, (lh) this.l, (c9) this.m, (t00) this.n, jiVar, 1);
                i3Var2.j = obj;
                return i3Var2;
            case 2:
                return new i3((h30) this.j, (w80) this.k, (qw0) this.l, (cw0) this.m, (ey) this.n, jiVar, 2);
            case 3:
                return new i3((t8) this.j, (lw0) this.k, (h30) this.l, (ax0) this.m, (ab0) this.n, jiVar, 3);
            case 4:
                i3 i3Var3 = new i3((mi0) this.l, (li0) this.m, (o70) this.n, jiVar);
                i3Var3.j = obj;
                return i3Var3;
            case 5:
                i3 i3Var4 = new i3((tg0) this.k, (tt0) this.l, (x10) this.m, (hh0) this.n, jiVar);
                i3Var4.j = obj;
                return i3Var4;
            default:
                i3 i3Var5 = new i3((xj) this.k, (w80) this.l, (g80) this.m, (w80) this.n, jiVar, 6);
                i3Var5.j = obj;
                return i3Var5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v20, types: [hv, tt0] */
    /* JADX WARN: Type inference failed for: r7v23, types: [cv, x10] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(mi0 mi0Var, li0 li0Var, o70 o70Var, ji jiVar) {
        super(2, jiVar);
        this.h = 4;
        this.l = mi0Var;
        this.m = li0Var;
        this.n = o70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, Object obj4, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }
}
