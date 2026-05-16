package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rs0 extends tt0 implements gv {
    public final /* synthetic */ int h = 0;
    public float i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(b3 b3Var, float f, q5 q5Var, ji jiVar) {
        super(2, jiVar);
        this.k = b3Var;
        this.i = f;
        this.l = q5Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((rs0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new rs0((b3) this.k, this.i, (q5) this.l, jiVar);
            default:
                rs0 rs0Var = new rs0((ny0) this.l, jiVar);
                rs0Var.k = obj;
                return rs0Var;
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        float fJ;
        xj xjVar;
        switch (this.h) {
            case 0:
                int i = this.j;
                if (i == 0) {
                    i60.az(obj);
                    j5 j5Var = (j5) ((b3) this.k).c;
                    Float f = new Float(this.i);
                    q5 q5Var = (q5) this.l;
                    this.j = 1;
                    Object objB = j5.b(j5Var, f, q5Var, this);
                    yj yjVar = yj.d;
                    if (objB == yjVar) {
                    }
                } else if (i != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            default:
                int i2 = this.j;
                if (i2 == 0) {
                    i60.az(obj);
                    xj xjVar2 = (xj) this.k;
                    fJ = lI.j(xjVar2.f());
                    xjVar = xjVar2;
                } else if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fJ = this.i;
                    xjVar = (xj) this.k;
                    i60.az(obj);
                }
                while (i60.al(xjVar)) {
                    lv0 lv0Var = new lv0((ny0) this.l, fJ);
                    this.k = xjVar;
                    this.i = fJ;
                    this.j = 1;
                    pj pjVar = this.e;
                    pjVar.getClass();
                    Object objM = pk.ai(pjVar).m(lv0Var, this);
                    yj yjVar2 = yj.d;
                    if (objM == yjVar2) {
                        break;
                    }
                }
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(ny0 ny0Var, ji jiVar) {
        super(2, jiVar);
        this.l = ny0Var;
    }
}
