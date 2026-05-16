package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i6 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                pu puVar = (pu) this.b;
                if (puVar != null) {
                    puVar.a();
                }
                break;
            default:
                ((eb0) this.b).a();
                break;
        }
    }
}
