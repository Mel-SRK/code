package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 {
    public final b a;
    public ri0 b = ri0.e;
    public cj c = null;
    public cj d = null;
    public cj e = null;
    public cj f = null;

    public xu0(b bVar) {
        this.a = bVar;
    }

    public static void a(Menu menu, x60 x60Var) {
        int i;
        int i2 = x60Var.d;
        int i3 = x60Var.e;
        int iOrdinal = x60Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.copy;
        } else if (iOrdinal == 1) {
            i = R.string.paste;
        } else if (iOrdinal == 2) {
            i = R.string.cut;
        } else if (iOrdinal == 3) {
            i = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                wc.l();
                return;
            }
            i = Build.VERSION.SDK_INT <= 26 ? com.example.gnd.R.string.autofill : R.string.autofill;
        }
        menu.add(0, i2, i3, i).setShowAsAction(1);
    }

    public static void b(Menu menu, x60 x60Var, pu puVar) {
        int i = x60Var.d;
        if (puVar != null && menu.findItem(i) == null) {
            a(menu, x60Var);
        } else {
            if (puVar != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }
}
