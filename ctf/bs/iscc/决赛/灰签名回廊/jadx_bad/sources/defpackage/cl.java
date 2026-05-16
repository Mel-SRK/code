package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class cl implements ix {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ cl(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.ix
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.performHapticFeedback(9);
                break;
            default:
                ((b1) this.b).performHapticFeedback(9);
                break;
        }
    }
}
