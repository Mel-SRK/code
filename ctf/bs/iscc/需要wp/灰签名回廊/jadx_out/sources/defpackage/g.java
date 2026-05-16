package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g extends tt0 implements gv {
    public final /* synthetic */ int h;
    public final /* synthetic */ yb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(yb ybVar, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.i = ybVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
            case 0:
                g gVar = (g) k(jiVar, xjVar);
                wz0 wz0Var = wz0.a;
                gVar.o(wz0Var);
                return wz0Var;
            default:
                g gVar2 = (g) k(jiVar, xjVar);
                wz0 wz0Var2 = wz0.a;
                gVar2.o(wz0Var2);
                return wz0Var2;
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new g(this.i, jiVar, 0);
            default:
                return new g(this.i, jiVar, 1);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                i60.az(obj);
                yb ybVar = this.i;
                if (ybVar.ad == null) {
                    wx wxVar = new wx();
                    g80 g80Var = ybVar.t;
                    if (g80Var != null) {
                        i60.an(ybVar.bi(), null, new c(g80Var, wxVar, null, 0), 3);
                    }
                    ybVar.ad = wxVar;
                }
                break;
            default:
                i60.az(obj);
                yb ybVar2 = this.i;
                wx wxVar2 = ybVar2.ad;
                if (wxVar2 != null) {
                    xx xxVar = new xx(wxVar2);
                    g80 g80Var2 = ybVar2.t;
                    ji jiVar = null;
                    if (g80Var2 != null) {
                        i60.an(ybVar2.bi(), null, new c(g80Var2, xxVar, jiVar, 1), 3);
                    }
                    ybVar2.ad = null;
                }
                break;
        }
        return wz0.a;
    }
}
