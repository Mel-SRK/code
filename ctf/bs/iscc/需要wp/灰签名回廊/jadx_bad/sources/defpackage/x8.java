package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends tt0 implements gv {
    public /* synthetic */ Object h;
    public final /* synthetic */ y8 i;
    public final /* synthetic */ fa0 j;
    public final /* synthetic */ x10 k;
    public final /* synthetic */ p7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x8(y8 y8Var, fa0 fa0Var, pu puVar, p7 p7Var, ji jiVar) {
        super(2, jiVar);
        this.i = y8Var;
        this.j = fa0Var;
        this.k = (x10) puVar;
        this.l = p7Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((x8) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [pu, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        x8 x8Var = new x8(this.i, this.j, this.k, this.l, jiVar);
        x8Var.h = obj;
        return x8Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [pu, x10] */
    @Override // defpackage.s7
    public final Object o(Object obj) {
        i60.az(obj);
        xj xjVar = (xj) this.h;
        fa0 fa0Var = this.j;
        ?? r2 = this.k;
        y8 y8Var = this.i;
        i60.an(xjVar, null, new w8(y8Var, fa0Var, (pu) r2, (ji) null), 3);
        return i60.an(xjVar, null, new c(y8Var, this.l, null, 7), 3);
    }
}
