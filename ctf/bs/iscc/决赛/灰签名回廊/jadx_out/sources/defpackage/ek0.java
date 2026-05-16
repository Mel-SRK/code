package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ gk0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek0(gk0 gk0Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = gk0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((ek0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new ek0(this.j, jiVar, 0);
            case 1:
                return new ek0(this.j, jiVar, 1);
            case 2:
                return new ek0(this.j, jiVar, 2);
            default:
                return new ek0(this.j, jiVar, 3);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    j5 j5Var = this.j.f;
                    Float f = new Float(1.0f);
                    yy0 yy0VarAk = f00.ak(75, 2, fp.b);
                    this.i = 1;
                    Object objB = j5.b(j5Var, f, yy0VarAk, this);
                    yj yjVar = yj.d;
                    if (objB == yjVar) {
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
                    j5 j5Var2 = this.j.g;
                    Float f2 = new Float(1.0f);
                    yy0 yy0VarAk2 = f00.ak(225, 2, fp.a);
                    this.i = 1;
                    Object objB2 = j5.b(j5Var2, f2, yy0VarAk2, this);
                    yj yjVar2 = yj.d;
                    if (objB2 == yjVar2) {
                    }
                } else if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            case 2:
                int i3 = this.i;
                if (i3 == 0) {
                    i60.az(obj);
                    j5 j5Var3 = this.j.h;
                    Float f3 = new Float(1.0f);
                    yy0 yy0VarAk3 = f00.ak(225, 2, fp.b);
                    this.i = 1;
                    Object objB3 = j5.b(j5Var3, f3, yy0VarAk3, this);
                    yj yjVar3 = yj.d;
                    if (objB3 == yjVar3) {
                    }
                } else if (i3 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            default:
                int i4 = this.i;
                if (i4 == 0) {
                    i60.az(obj);
                    j5 j5Var4 = this.j.f;
                    Float f4 = new Float(0.0f);
                    yy0 yy0VarAk4 = f00.ak(150, 2, fp.b);
                    this.i = 1;
                    Object objB4 = j5.b(j5Var4, f4, yy0VarAk4, this);
                    yj yjVar4 = yj.d;
                    if (objB4 == yjVar4) {
                    }
                } else if (i4 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
        }
        return wz0.a;
    }
}
