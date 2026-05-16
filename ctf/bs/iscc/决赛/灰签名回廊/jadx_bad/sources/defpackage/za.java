package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(cb cbVar, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.k = cbVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((za) k((ji) obj2, (oh0) obj)).o(wz0.a);
            default:
                return ((za) k((ji) obj2, (zr) obj)).o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                za zaVar = new za(this.k, jiVar, 0);
                zaVar.j = obj;
                return zaVar;
            default:
                za zaVar2 = new za(this.k, jiVar, 1);
                zaVar2.j = obj;
                return zaVar2;
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                int i = this.i;
                wz0 wz0Var = wz0.a;
                if (i != 0) {
                    if (i == 1) {
                        i60.az(obj);
                        return wz0Var;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                oh0 oh0Var = (oh0) this.j;
                this.i = 1;
                Object objE = this.k.e(new mp0(oh0Var), this);
                yj yjVar = yj.d;
                if (objE != yjVar) {
                    objE = wz0Var;
                }
                return objE == yjVar ? yjVar : wz0Var;
            default:
                int i2 = this.i;
                if (i2 == 0) {
                    i60.az(obj);
                    zr zrVar = (zr) this.j;
                    this.i = 1;
                    Object objE2 = this.k.e(zrVar, this);
                    yj yjVar2 = yj.d;
                    if (objE2 == yjVar2) {
                        return yjVar2;
                    }
                } else {
                    if (i2 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0.a;
        }
    }
}
