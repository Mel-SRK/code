package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public Object i;
    public int j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(xi0 xi0Var, mi0 mi0Var, u30 u30Var, r31 r31Var, View view, ji jiVar) {
        super(2, jiVar);
        this.k = xi0Var;
        this.l = mi0Var;
        this.m = u30Var;
        this.n = r31Var;
        this.o = view;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((k5) k(jiVar, xjVar)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cv, tt0] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                k5 k5Var = new k5((ya) this.l, (j5) this.m, (w80) this.n, (w80) this.o, jiVar);
                k5Var.i = obj;
                return k5Var;
            case 1:
                k5 k5Var2 = new k5((g90) this.n, (tt0) this.o, jiVar);
                k5Var2.m = obj;
                return k5Var2;
            default:
                k5 k5Var3 = new k5((xi0) this.k, (mi0) this.l, (u30) this.m, (r31) this.n, (View) this.o, jiVar);
                k5Var3.i = obj;
                return k5Var3;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01ef -> B:108:0x01f3). Please report as a decompilation issue!!! */
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
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k5(g90 g90Var, cv cvVar, ji jiVar) {
        super(2, jiVar);
        this.n = g90Var;
        this.o = (tt0) cvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(ya yaVar, j5 j5Var, w80 w80Var, w80 w80Var2, ji jiVar) {
        super(2, jiVar);
        this.l = yaVar;
        this.m = j5Var;
        this.n = w80Var;
        this.o = w80Var2;
    }
}
