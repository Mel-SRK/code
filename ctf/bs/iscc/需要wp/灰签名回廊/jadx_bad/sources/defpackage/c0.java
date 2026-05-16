package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends n7 {
    public final bu a;
    public final yo0 b;
    public final b1 c;
    public final si0 d;
    public final String e;
    public final AutofillId f;
    public final f80 g;
    public boolean h;

    public c0(bu buVar, yo0 yo0Var, b1 b1Var, si0 si0Var, String str) {
        this.a = buVar;
        this.b = yo0Var;
        this.c = b1Var;
        this.d = si0Var;
        this.e = str;
        new Rect();
        b1Var.setImportantForAutofill(1);
        m7 m7VarD = wn0.d(b1Var);
        AutofillId autofillIdE = m7VarD != null ? ar.e(m7VarD.a) : null;
        if (autofillIdE == null) {
            throw n5.f("Required value was null.");
        }
        this.f = autofillIdE;
        this.g = new f80();
    }
}
