package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends tt0 implements cv {
    public final /* synthetic */ j5 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Object obj, ji jiVar) {
        super(1, jiVar);
        this.h = j5Var;
        this.i = obj;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        i5 i5Var = new i5(this.h, this.i, (ji) obj);
        wz0 wz0Var = wz0.a;
        i5Var.o(wz0Var);
        return wz0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        i60.az(obj);
        j5 j5Var = this.h;
        r5 r5Var = j5Var.c;
        r5Var.f.d();
        r5Var.g = Long.MIN_VALUE;
        j5Var.d.setValue(Boolean.FALSE);
        Object objA = j5.a(j5Var, this.i);
        r5Var.e.setValue(objA);
        j5Var.e.setValue(objA);
        return wz0.a;
    }
}
