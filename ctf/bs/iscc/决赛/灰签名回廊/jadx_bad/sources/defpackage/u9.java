package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u9 extends tt0 implements gv {
    public int h;
    public final /* synthetic */ j5 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ v9 l;
    public final /* synthetic */ yz m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(j5 j5Var, float f, boolean z, v9 v9Var, yz yzVar, ji jiVar) {
        super(2, jiVar);
        this.i = j5Var;
        this.j = f;
        this.k = z;
        this.l = v9Var;
        this.m = yzVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((u9) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        return new u9(this.i, this.j, this.k, this.l, this.m, jiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[RETURN] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objD;
        int i = this.h;
        wz0 wz0Var = wz0.a;
        if (i == 0) {
            i60.az(obj);
            j5 j5Var = this.i;
            float f = ((mn) j5Var.e.getValue()).d;
            float f2 = this.j;
            if (!mn.a(f, f2)) {
                boolean z = this.k;
                yj yjVar = yj.d;
                if (z) {
                    float f3 = ((mn) j5Var.e.getValue()).d;
                    v9 v9Var = this.l;
                    yy0 yy0Var = null;
                    yz jh0Var = mn.a(f3, v9Var.b) ? new jh0(0L) : mn.a(f3, v9Var.d) ? new wx() : mn.a(f3, v9Var.c) ? new ps() : null;
                    this.h = 2;
                    yy0 yy0Var2 = sp.b;
                    yy0 yy0Var3 = sp.a;
                    yz yzVar = this.m;
                    if (yzVar != null) {
                        if ((yzVar instanceof jh0) || (yzVar instanceof qo) || (yzVar instanceof wx) || (yzVar instanceof ps)) {
                            yy0Var = yy0Var3;
                        }
                    } else if (jh0Var != null) {
                        if (!(jh0Var instanceof jh0) && !(jh0Var instanceof qo)) {
                            if (jh0Var instanceof wx) {
                                yy0Var = sp.c;
                            } else if (jh0Var instanceof ps) {
                            }
                        }
                        yy0Var = yy0Var2;
                    }
                    if (yy0Var == null ? (objD = j5Var.d(this, new mn(f2))) != yjVar : (objD = j5.b(j5Var, new mn(f2), yy0Var, this)) != yjVar) {
                        objD = wz0Var;
                    }
                    if (objD == yjVar) {
                    }
                } else {
                    mn mnVar = new mn(f2);
                    this.h = 1;
                    if (j5Var.d(this, mnVar) == yjVar) {
                        return yjVar;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(obj);
        }
        return wz0Var;
    }
}
