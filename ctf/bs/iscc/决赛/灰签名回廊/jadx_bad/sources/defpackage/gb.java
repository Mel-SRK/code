package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements zr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    @Override // defpackage.zr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, ji jiVar) {
        fb fbVar;
        gb gbVar;
        switch (this.d) {
            case 0:
                if (jiVar instanceof fb) {
                    fbVar = (fb) jiVar;
                    int i = fbVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        fbVar.k = i - Integer.MIN_VALUE;
                    } else {
                        fbVar = new fb(this, jiVar);
                    }
                }
                Object obj2 = fbVar.i;
                int i2 = fbVar.k;
                if (i2 == 0) {
                    i60.az(obj2);
                    t00 t00Var = (t00) ((xi0) this.e).d;
                    if (t00Var != null) {
                        t00Var.a(new nb("Child of the scoped flow was cancelled", 0));
                        fbVar.g = this;
                        fbVar.h = obj;
                        fbVar.k = 1;
                        Object objX = t00Var.x(fbVar);
                        yj yjVar = yj.d;
                        if (objX == yjVar) {
                        }
                    }
                    gbVar = this;
                } else if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = fbVar.h;
                    gbVar = fbVar.g;
                    i60.az(obj2);
                }
                ((xi0) gbVar.e).d = i60.an((xj) gbVar.f, null, new eb((hb) gbVar.g, (zr) gbVar.h, obj, null), 1);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cw0 cw0Var = (cw0) this.g;
                h30 h30Var = (h30) this.e;
                if (zBooleanValue && h30Var.b()) {
                    az0.k((qw0) this.f, h30Var, cw0Var.j(), (ey) this.h, cw0Var.b);
                } else {
                    az0.j(h30Var);
                }
                break;
            default:
                yz yzVar = (yz) obj;
                vi0 vi0Var = (vi0) this.g;
                vi0 vi0Var2 = (vi0) this.f;
                vi0 vi0Var3 = (vi0) this.e;
                boolean z = true;
                if (yzVar instanceof jh0) {
                    vi0Var3.d++;
                } else if ((yzVar instanceof kh0) || (yzVar instanceof ih0)) {
                    vi0Var3.d--;
                } else if (yzVar instanceof wx) {
                    vi0Var2.d++;
                } else if (yzVar instanceof xx) {
                    vi0Var2.d--;
                } else if (yzVar instanceof ps) {
                    vi0Var.d++;
                } else if (yzVar instanceof qs) {
                    vi0Var.d--;
                }
                int i3 = vi0Var3.d;
                boolean z2 = false;
                boolean z3 = i3 > 0;
                boolean z4 = vi0Var2.d > 0;
                boolean z5 = vi0Var.d > 0;
                tk tkVar = (tk) this.h;
                if (tkVar.s != z3) {
                    tkVar.s = z3;
                    z2 = true;
                }
                if (tkVar.t != z4) {
                    tkVar.t = z4;
                    z2 = true;
                }
                if (tkVar.u != z5) {
                    tkVar.u = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    t1.ae(tkVar);
                }
                break;
        }
        return wz0.a;
    }
}
