package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public int i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(long j, yt0 yt0Var, ji jiVar) {
        super(2, jiVar);
        this.j = j;
        this.k = yt0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((lo0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new lo0((j5) this.k, this.j, jiVar);
            default:
                return new lo0(this.j, (yt0) this.k, jiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        la laVar;
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    j5 j5Var = (j5) this.k;
                    xa0 xa0Var = new xa0(this.j);
                    es0 es0Var = mo0.d;
                    this.i = 1;
                    Object objB = j5.b(j5Var, xa0Var, es0Var, this);
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
                int i2 = this.i;
                long j = this.j;
                yj yjVar2 = yj.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i60.az(obj);
                    } else if (i2 != 2) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i60.az(obj);
                        laVar = ((yt0) this.k).f;
                        if (laVar != null) {
                            laVar.h(new sj0(new kg0(j)));
                        }
                    }
                    break;
                } else {
                    i60.az(obj);
                    this.i = 1;
                    if (t1.l(j - 8, this) == yjVar2) {
                    }
                }
                this.i = 2;
                if (t1.l(8L, this) == yjVar2) {
                }
                laVar = ((yt0) this.k).f;
                if (laVar != null) {
                }
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(j5 j5Var, long j, ji jiVar) {
        super(2, jiVar);
        this.k = j5Var;
        this.j = j;
    }
}
