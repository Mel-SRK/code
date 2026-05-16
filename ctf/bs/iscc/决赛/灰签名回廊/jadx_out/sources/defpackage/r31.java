package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r31 implements s30 {
    public final /* synthetic */ ii d;
    public final /* synthetic */ b5 e;
    public final /* synthetic */ mi0 f;
    public final /* synthetic */ xi0 g;
    public final /* synthetic */ View h;

    public r31(ii iiVar, b5 b5Var, mi0 mi0Var, xi0 xi0Var, View view) {
        this.d = iiVar;
        this.e = b5Var;
        this.f = mi0Var;
        this.g = xi0Var;
        this.h = view;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        boolean z;
        ja jaVarV = null;
        switch (q31.a[n30Var.ordinal()]) {
            case 1:
                i60.an(this.d, null, new k5(this.g, this.f, u30Var, this, this.h, null), 1);
                return;
            case 2:
                b5 b5Var = this.e;
                if (b5Var != null) {
                    y10 y10Var = (y10) b5Var.f;
                    synchronized (y10Var.a) {
                        try {
                            synchronized (y10Var.a) {
                                z = y10Var.d;
                            }
                            if (!z) {
                                ArrayList arrayList = y10Var.b;
                                y10Var.b = y10Var.c;
                                y10Var.c = arrayList;
                                y10Var.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((ji) arrayList.get(i)).h(wz0.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                mi0 mi0Var = this.f;
                synchronized (mi0Var.b) {
                    if (mi0Var.s) {
                        mi0Var.s = false;
                        jaVarV = mi0Var.v();
                    }
                    break;
                }
                if (jaVarV != null) {
                    ((la) jaVarV).h(wz0.a);
                    return;
                }
                return;
            case 3:
                mi0 mi0Var2 = this.f;
                synchronized (mi0Var2.b) {
                    mi0Var2.s = true;
                }
                return;
            case 4:
                this.f.u();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                wc.l();
                return;
        }
    }
}
