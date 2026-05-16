package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 {
    public final s20 a;
    public final tq b;
    public final nz c;
    public final m80 d = new m80(2);

    public yo0(s20 s20Var, tq tqVar, e80 e80Var) {
        this.a = s20Var;
        this.b = tqVar;
        this.c = e80Var;
    }

    public final uo0 a() {
        return new uo0(this.b, false, this.a, new po0());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s20 s20Var, po0 po0Var) {
        String str;
        m80 m80Var = this.d;
        Object[] objArr = m80Var.a;
        int i = m80Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            c0 c0Var = (c0) objArr[i2];
            b1 b1Var = c0Var.c;
            bu buVar = c0Var.a;
            po0 po0VarS = s20Var.s();
            int i3 = s20Var.e;
            String str2 = null;
            if (po0Var != null) {
                Object objG = po0Var.d.g(zo0.ac);
                if (objG == null) {
                    objG = null;
                }
                b6 b6Var = (b6) objG;
                str = b6Var != null ? b6Var.e : null;
            }
            if (po0VarS != null) {
                Object objG2 = po0VarS.d.g(zo0.ac);
                if (objG2 == null) {
                    objG2 = null;
                }
                b6 b6Var2 = (b6) objG2;
                if (b6Var2 != null) {
                    str2 = b6Var2.e;
                }
            }
            if (str != str2) {
                if (str == null) {
                    buVar.j(b1Var, i3, true);
                } else if (str2 == null) {
                    buVar.j(b1Var, i3, false);
                } else if (f00.h((i2) qo0.g(po0VarS, zo0.r), bw.s)) {
                    ((AutofillManager) buVar.e).notifyValueChanged(b1Var, i3, AutofillValue.forText(str2.toString()));
                }
            }
            boolean z = po0Var != null && po0Var.d.b(zo0.q);
            boolean z2 = po0VarS != null && po0VarS.d.b(zo0.q);
            if (z != z2) {
                f80 f80Var = c0Var.g;
                if (z2) {
                    f80Var.a(i3);
                } else {
                    f80Var.e(i3);
                }
            }
        }
    }
}
