package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ hh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu0(hh0 hh0Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = hh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((lu0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new lu0(this.j, jiVar, 0);
            case 1:
                return new lu0(this.j, jiVar, 1);
            default:
                return new lu0(this.j, jiVar, 2);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    this.i = 1;
                    Object objA = this.j.a(this);
                    yj yjVar = yj.d;
                    if (objA == yjVar) {
                    }
                } else if (i != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            case 1:
                int i2 = this.i;
                if (i2 == 0) {
                    i60.az(obj);
                    this.i = 1;
                    Object objA2 = this.j.a(this);
                    yj yjVar2 = yj.d;
                    if (objA2 == yjVar2) {
                    }
                } else if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            default:
                int i3 = this.i;
                if (i3 == 0) {
                    i60.az(obj);
                    this.i = 1;
                    Object objA3 = this.j.a(this);
                    yj yjVar3 = yj.d;
                    if (objA3 == yjVar3) {
                    }
                } else if (i3 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
        }
        return wz0.a;
    }
}
