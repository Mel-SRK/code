package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ((hs0) this.b).a(null);
                break;
            default:
                cw0 cw0Var = (cw0) this.b;
                if (cw0Var != null) {
                    h30 h30Var = cw0Var.d;
                    if (h30Var != null) {
                        h30Var.e(hx0.b);
                    }
                    h30 h30Var2 = cw0Var.d;
                    if (h30Var2 != null) {
                        h30Var2.f(hx0.b);
                        break;
                    }
                }
                break;
        }
    }
}
