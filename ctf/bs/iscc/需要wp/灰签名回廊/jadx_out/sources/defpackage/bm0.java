package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class bm0 {
    public final dm0 a;
    public pi0 b;

    public bm0(dm0 dm0Var) {
        this.a = dm0Var;
    }

    public final Bundle a(String str) {
        dm0 dm0Var = this.a;
        if (!dm0Var.g) {
            wc.q("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = dm0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleAc = bundle.containsKey(str) ? m10.ac(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            dm0Var.f = null;
        }
        return bundleAc;
    }

    public final void b(String str, am0 am0Var) {
        am0Var.getClass();
        dm0 dm0Var = this.a;
        synchronized (dm0Var.c) {
            if (dm0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            dm0Var.d.put(str, am0Var);
        }
    }

    public final void c() {
        if (!this.a.h) {
            wc.q("Can not perform this action after onSaveInstanceState");
            return;
        }
        pi0 pi0Var = this.b;
        if (pi0Var == null) {
            pi0Var = new pi0(this);
        }
        this.b = pi0Var;
        try {
            g30.class.getDeclaredConstructor(null);
            pi0 pi0Var2 = this.b;
            if (pi0Var2 != null) {
                pi0Var2.a.add(g30.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + g30.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
