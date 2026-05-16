package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p7(y8 y8Var, fa0 fa0Var, pu puVar) {
        super(0);
        this.e = 1;
        this.f = y8Var;
        this.g = fa0Var;
        this.h = (x10) puVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [pu, x10] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pu
    public final Object a() {
        wz0 wz0Var;
        switch (this.e) {
            case 0:
                xi0 xi0Var = (xi0) this.f;
                aq0 aq0Var = ((q7) this.g).s;
                u20 u20Var = (u20) this.h;
                xi0Var.d = aq0Var.a(u20Var.d.c(), u20Var.getLayoutDirection(), u20Var);
                return wz0.a;
            case 1:
                y8 y8Var = (y8) this.f;
                ri0 ri0VarBu = y8.bu(y8Var, (fa0) this.g, (x10) this.h);
                if (ri0VarBu != null) {
                    lh lhVar = y8Var.r;
                    if (!wz.a(lhVar.y, 0L)) {
                        return ri0VarBu.g(lhVar.bz(ri0VarBu, lhVar.y) ^ (-9223372034707292160L));
                    }
                    wc.q("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return null;
            case 2:
                lh lhVar2 = (lh) this.f;
                bu buVar = lhVar2.u;
                while (true) {
                    a90 a90Var = (a90) buVar.e;
                    int i = a90Var.f;
                    wz0Var = wz0.a;
                    if (i != 0) {
                        if (i == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        ri0 ri0Var = (ri0) ((kh) a90Var.d[i - 1]).a.a();
                        if (ri0Var == null ? true : lhVar2.bw(ri0Var, lhVar2.y)) {
                            a90 a90Var2 = (a90) buVar.e;
                            ((kh) a90Var2.j(a90Var2.f - 1)).b.h(wz0Var);
                        }
                    }
                }
                if (lhVar2.x) {
                    ri0 ri0VarBv = lhVar2.bv();
                    if (ri0VarBv != null && lhVar2.bw(ri0VarBv, lhVar2.y)) {
                        lhVar2.x = false;
                    }
                }
                ((f01) this.g).e = lh.bu(lhVar2, (c9) this.h);
                return wz0Var;
            default:
                k kVar = (k) this.f;
                kVar.removeOnAttachStateChangeListener((e1) this.g);
                t1.aa(kVar).a.remove((g11) this.h);
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
