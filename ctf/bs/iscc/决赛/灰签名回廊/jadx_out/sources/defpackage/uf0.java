package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 implements sf0 {
    public static final uf0 b = new uf0(0);
    public static final uf0 c = new uf0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ uf0(int i) {
        this.a = i;
    }

    @Override // defpackage.sf0
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.sf0
    public final rf0 b(View view, em emVar) {
        switch (this.a) {
            case 0:
                return new tf0(new Magnifier(view));
            default:
                return new vf0(new Magnifier(view));
        }
    }
}
