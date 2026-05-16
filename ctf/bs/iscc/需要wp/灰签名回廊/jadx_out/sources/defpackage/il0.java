package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class il0 extends ki implements zr {
    public final zr g;
    public final pj h;
    public final int i;
    public pj j;
    public ji k;

    public il0(zr zrVar, pj pjVar) {
        super(vd.f, pq.d);
        this.g = zrVar;
        this.h = pjVar;
        this.i = ((Number) pjVar.r(new md(11, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.s7, defpackage.zj
    public final zj d() {
        ji jiVar = this.k;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.ki, defpackage.ji
    public final pj e() {
        pj pjVar = this.j;
        return pjVar == null ? pq.d : pjVar;
    }

    @Override // defpackage.zr
    public final Object i(Object obj, ji jiVar) {
        try {
            Object objQ = q(jiVar, obj);
            return objQ == yj.d ? objQ : wz0.a;
        } catch (Throwable th) {
            this.j = new ln(jiVar.e(), th);
            throw th;
        }
    }

    @Override // defpackage.s7
    public final StackTraceElement m() {
        return null;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        Throwable thA = tj0.a(obj);
        if (thA != null) {
            this.j = new ln(e(), thA);
        }
        ji jiVar = this.k;
        if (jiVar != null) {
            jiVar.h(obj);
        }
        return yj.d;
    }

    public final Object q(ji jiVar, Object obj) {
        pj pjVarE = jiVar.e();
        i60.ac(pjVarE);
        pj pjVar = this.j;
        if (pjVar != pjVarE) {
            if (pjVar instanceof ln) {
                throw new IllegalStateException(at0.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ln) pjVar).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) pjVarE.r(new n3(3, this), 0)).intValue() != this.i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.h + ",\n\t\tbut emission happened in " + pjVarE + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.j = pjVarE;
        }
        this.k = jiVar;
        hv hvVar = kl0.a;
        zr zrVar = this.g;
        zrVar.getClass();
        Object objC = hvVar.c(zrVar, obj, this);
        if (!f00.h(objC, yj.d)) {
            this.k = null;
        }
        return objC;
    }
}
