package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ef extends tt0 implements gv {
    public int h;
    public /* synthetic */ float i;
    public final /* synthetic */ ff j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(ff ffVar, ji jiVar) {
        super(2, jiVar);
        this.j = ffVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((ef) k((ji) obj2, Float.valueOf(((Number) obj).floatValue()))).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        ef efVar = new ef(this.j, jiVar);
        efVar.i = ((Number) obj).floatValue();
        return efVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.h;
        if (i == 0) {
            i60.az(obj);
            float f = this.i;
            ff ffVar = this.j;
            po0 po0Var = ffVar.a.d;
            Object objG = po0Var.d.g(oo0.e);
            if (objG == null) {
                objG = null;
            }
            gv gvVar = (gv) objG;
            if (gvVar == null) {
                throw n5.f("Required value was null.");
            }
            xa0 xa0Var = new xa0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.h = 1;
            obj = gvVar.f(xa0Var, this);
            yj yjVar = yj.d;
            if (obj == yjVar) {
                return yjVar;
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((xa0) obj).a & 4294967295L)));
    }
}
