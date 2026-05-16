package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gk0 {
    public xa0 a;
    public final float b;
    public final boolean c;
    public Float d;
    public xa0 e;
    public final j5 f = e00.a();
    public final j5 g = e00.a();
    public final j5 h = e00.a();
    public final td i;
    public final me0 j;
    public final me0 k;

    public gk0(xa0 xa0Var, float f, boolean z) {
        this.a = xa0Var;
        this.b = f;
        this.c = z;
        td tdVar = new td(true);
        tdVar.ap(null);
        this.i = tdVar;
        Boolean bool = Boolean.FALSE;
        this.j = bo0.m(bool);
        this.k = bo0.m(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ki kiVar) throws Throwable {
        dk0 dk0Var;
        gk0 gk0Var;
        Object objAp;
        Object objY;
        if (kiVar instanceof dk0) {
            dk0Var = (dk0) kiVar;
            int i = dk0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk0Var.j = i - Integer.MIN_VALUE;
            } else {
                dk0Var = new dk0(this, kiVar);
            }
        }
        Object obj = dk0Var.h;
        int i2 = dk0Var.j;
        yj yjVar = yj.d;
        wz0 wz0Var = wz0.a;
        ji jiVar = null;
        if (i2 == 0) {
            i60.az(obj);
            dk0Var.g = this;
            dk0Var.j = 1;
            Object objY2 = i60.y(new fk0(this, jiVar, 0), dk0Var);
            if (objY2 != yjVar) {
                objY2 = wz0Var;
            }
            if (objY2 != yjVar) {
                gk0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i60.az(obj);
                    return wz0Var;
                }
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gk0Var = dk0Var.g;
            i60.az(obj);
            dk0Var.g = null;
            dk0Var.j = 3;
            gk0Var.getClass();
            objY = i60.y(new fk0(gk0Var, jiVar, 1), dk0Var);
            if (objY != yjVar) {
                objY = wz0Var;
            }
            return objY != yjVar ? yjVar : wz0Var;
        }
        gk0Var = dk0Var.g;
        i60.az(obj);
        gk0Var.j.setValue(Boolean.TRUE);
        td tdVar = gk0Var.i;
        dk0Var.g = gk0Var;
        dk0Var.j = 2;
        tdVar.getClass();
        while (true) {
            Object obj2 = a10.d.get(tdVar);
            if (obj2 instanceof iy) {
                if (tdVar.ba(obj2) >= 0) {
                    x00 x00Var = new x00(f00.x(dk0Var), tdVar);
                    x00Var.t();
                    x00Var.w(new ga(1, i60.aj(tdVar, true, new r00(1, x00Var))));
                    objAp = x00Var.s();
                    break;
                }
            } else {
                if (obj2 instanceof wd) {
                    throw ((wd) obj2).a;
                }
                objAp = az0.ap(obj2);
            }
        }
        if (objAp != yjVar) {
            dk0Var.g = null;
            dk0Var.j = 3;
            gk0Var.getClass();
            objY = i60.y(new fk0(gk0Var, jiVar, 1), dk0Var);
            if (objY != yjVar) {
            }
            if (objY != yjVar) {
            }
        }
    }
}
