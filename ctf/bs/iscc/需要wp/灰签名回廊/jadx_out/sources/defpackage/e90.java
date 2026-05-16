package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends tt0 implements gv {
    public i90 h;
    public Object i;
    public ml j;
    public f90 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ int n;
    public final /* synthetic */ f90 o;
    public final /* synthetic */ w8 p;
    public final /* synthetic */ ml q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(int i, f90 f90Var, w8 w8Var, ml mlVar, ji jiVar) {
        super(2, jiVar);
        this.n = i;
        this.o = f90Var;
        this.p = w8Var;
        this.q = mlVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((e90) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        e90 e90Var = new e90(this.n, this.o, this.p, this.q, jiVar);
        e90Var.m = obj;
        return e90Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.s7
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e90.o(java.lang.Object):java.lang.Object");
    }
}
