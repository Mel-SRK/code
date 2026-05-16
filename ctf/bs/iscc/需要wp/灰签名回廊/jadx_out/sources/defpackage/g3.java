package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g3 implements zr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g3(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.zr
    public final Object i(Object obj, ji jiVar) {
        switch (this.d) {
            case 0:
                cz czVar = (cz) this.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    m6.a.a(czVar.a(), czVar.b);
                }
                break;
            case 1:
                yz yzVar = (yz) obj;
                pr0 pr0Var = (pr0) this.e;
                if (yzVar instanceof wx) {
                    pr0Var.add(yzVar);
                } else if (yzVar instanceof xx) {
                    pr0Var.remove(((xx) yzVar).a);
                } else if (yzVar instanceof ps) {
                    pr0Var.add(yzVar);
                } else if (yzVar instanceof qs) {
                    pr0Var.remove(((qs) yzVar).a);
                } else if (yzVar instanceof jh0) {
                    pr0Var.add(yzVar);
                } else if (yzVar instanceof kh0) {
                    pr0Var.remove(((kh0) yzVar).a);
                } else if (yzVar instanceof ih0) {
                    pr0Var.remove(((ih0) yzVar).a);
                }
                break;
            default:
                ((q70) this.e).d.h(((Number) obj).floatValue());
                break;
        }
        return wz0.a;
    }
}
