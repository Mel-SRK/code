package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es implements zr {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final Object f;
    public final tt0 g;

    public es(zr zrVar, pj pjVar) {
        this.e = pjVar;
        this.f = t1.av(pjVar);
        this.g = new c(zrVar, null, 21);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.zr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, ji jiVar) {
        ds dsVar;
        es esVar;
        switch (this.d) {
            case 0:
                if (jiVar instanceof ds) {
                    dsVar = (ds) jiVar;
                    int i = dsVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dsVar.k = i - Integer.MIN_VALUE;
                    } else {
                        dsVar = new ds(this, jiVar);
                    }
                }
                Object objF = dsVar.i;
                int i2 = dsVar.k;
                wz0 wz0Var = wz0.a;
                yj yjVar = yj.d;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            obj = dsVar.h;
                            esVar = dsVar.g;
                            i60.az(objF);
                        } else if (i2 != 3) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    i60.az(objF);
                    return wz0Var;
                }
                i60.az(objF);
                if (((ti0) this.e).d) {
                    zr zrVar = (zr) this.f;
                    dsVar.k = 1;
                    if (zrVar.i(obj, dsVar) != yjVar) {
                        return wz0Var;
                    }
                } else {
                    ji0 ji0Var = (ji0) this.g;
                    dsVar.g = this;
                    dsVar.h = obj;
                    dsVar.k = 2;
                    objF = ji0Var.f(obj, dsVar);
                    if (objF != yjVar) {
                        esVar = this;
                    }
                }
                return yjVar;
                if (((Boolean) objF).booleanValue()) {
                    return wz0Var;
                }
                ((ti0) esVar.e).d = true;
                zr zrVar2 = (zr) esVar.f;
                dsVar.g = null;
                dsVar.h = null;
                dsVar.k = 3;
                if (zrVar2.i(obj, dsVar) != yjVar) {
                    return wz0Var;
                }
                return yjVar;
            default:
                Object objAx = m10.ax((pj) this.e, obj, this.f, (c) this.g, jiVar);
                return objAx == yj.d ? objAx : wz0.a;
        }
    }

    public es(ti0 ti0Var, zr zrVar, ji0 ji0Var) {
        this.e = ti0Var;
        this.f = zrVar;
        this.g = ji0Var;
    }
}
