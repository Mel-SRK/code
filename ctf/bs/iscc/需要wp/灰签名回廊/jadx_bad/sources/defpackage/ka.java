package defpackage;

import androidx.compose.foundation.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements hv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ka(i90 i90Var, h90 h90Var) {
        this.d = 2;
        this.e = i90Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case 0:
                ((h) this.e).g((Throwable) obj);
                break;
            case 1:
                w80 w80Var = (w80) this.e;
                vf vfVar = (vf) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ld) obj).getClass();
                if (vfVar.an(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ww0.b((String) w80Var.getValue(), a.c(g70.a, 16), 0L, bo0.j(16), 0L, 0L, 0, false, 0, 0, null, vfVar, 3120, 131060);
                } else {
                    vfVar.aq();
                }
                return wz0.a;
            case 2:
                i90 i90Var = (i90) this.e;
                i90.g.set(i90Var, null);
                i90Var.d(null);
                break;
            default:
                ((ip0) this.e).b();
                break;
        }
        return wz0.a;
    }

    public /* synthetic */ ka(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
