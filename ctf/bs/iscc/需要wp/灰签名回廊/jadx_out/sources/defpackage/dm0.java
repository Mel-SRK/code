package defpackage;

import android.os.Bundle;
import com.example.gnd.MainActivity;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 {
    public final MainActivity a;
    public final zd b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final yf0 c = new yf0(17);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public dm0(MainActivity mainActivity, zd zdVar) {
        this.a = mainActivity;
        this.b = zdVar;
    }

    public final void a() {
        MainActivity mainActivity = this.a;
        if (((w30) mainActivity.getLifecycle()).c != o30.e) {
            wc.q("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                wc.q("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            mainActivity.getLifecycle().a(new u60(1, this));
            this.e = true;
        }
    }
}
