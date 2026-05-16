package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yf implements s30 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ yf(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        switch (this.d) {
            case 0:
                new HashMap();
                uv[] uvVarArr = (uv[]) this.e;
                if (uvVarArr.length > 0) {
                    uv uvVar = uvVarArr[0];
                    throw null;
                }
                if (uvVarArr.length <= 0) {
                    return;
                }
                uv uvVar2 = uvVarArr[0];
                throw null;
            default:
                if (n30Var != n30.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + n30Var).toString());
                }
                u30Var.getLifecycle().b(this);
                xl0 xl0Var = (xl0) this.e;
                if (xl0Var.b) {
                    return;
                }
                Bundle bundleA = xl0Var.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundleQ = az0.q((ae0[]) Arrays.copyOf(new ae0[0], 0));
                Bundle bundle = xl0Var.c;
                if (bundle != null) {
                    bundleQ.putAll(bundle);
                }
                if (bundleA != null) {
                    bundleQ.putAll(bundleA);
                }
                xl0Var.c = bundleQ;
                xl0Var.b = true;
                return;
        }
    }
}
