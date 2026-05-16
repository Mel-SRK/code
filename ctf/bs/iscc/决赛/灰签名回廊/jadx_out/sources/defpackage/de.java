package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de implements s30 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ de(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        switch (this.d) {
            case 0:
                au0 au0Var = ((ib0) this.e).b;
                oe oeVar = (oe) this.f;
                if (n30Var == n30.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = oeVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    ((hb0) au0Var.getValue()).c.a(new eb0(onBackInvokedDispatcher, 0), 1);
                    ((hb0) au0Var.getValue()).c.a(new eb0(onBackInvokedDispatcher, 1000000), 0);
                }
                break;
            default:
                w60 w60Var = (w60) this.e;
                o30 o30Var = (o30) this.f;
                w60Var.getClass();
                ce ceVar = w60Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = w60Var.b;
                n30.Companion.getClass();
                int iOrdinal = o30Var.ordinal();
                if (n30Var != (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : n30.ON_RESUME : n30.ON_START : n30.ON_CREATE)) {
                    n30 n30Var2 = n30.ON_DESTROY;
                    if (n30Var != n30Var2) {
                        int iOrdinal2 = o30Var.ordinal();
                        if (iOrdinal2 != 2) {
                            n30Var2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : n30.ON_PAUSE : n30.ON_STOP;
                        }
                        if (n30Var == n30Var2) {
                            copyOnWriteArrayList.remove((Object) null);
                            ceVar.run();
                        }
                    } else {
                        w60Var.a();
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    ceVar.run();
                }
                break;
        }
    }
}
