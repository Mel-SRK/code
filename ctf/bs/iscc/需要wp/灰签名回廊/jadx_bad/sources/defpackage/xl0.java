package defpackage;

import android.os.Bundle;
import com.example.gnd.MainActivity;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements am0 {
    public final bm0 a;
    public boolean b;
    public Bundle c;
    public final au0 d;

    public xl0(bm0 bm0Var, MainActivity mainActivity) {
        bm0Var.getClass();
        this.a = bm0Var;
        this.d = new au0(new zd(mainActivity, 5));
    }

    @Override // defpackage.am0
    public final Bundle a() {
        Bundle bundleQ = az0.q((ae0[]) Arrays.copyOf(new ae0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleQ.putAll(bundle);
        }
        for (Map.Entry entry : ((yl0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((fe) ((ul0) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleQ.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleQ;
    }
}
