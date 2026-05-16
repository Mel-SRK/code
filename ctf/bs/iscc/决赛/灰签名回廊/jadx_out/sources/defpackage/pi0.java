package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pi0 implements am0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public pi0(bm0 bm0Var) {
        bm0Var.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.am0
    public final Bundle a() {
        Bundle bundleQ = az0.q((ae0[]) Arrays.copyOf(new ae0[0], 0));
        List listBb = kc.bb(this.a);
        bundleQ.putStringArrayList("classes_to_restore", listBb instanceof ArrayList ? (ArrayList) listBb : new ArrayList<>(listBb));
        return bundleQ;
    }
}
