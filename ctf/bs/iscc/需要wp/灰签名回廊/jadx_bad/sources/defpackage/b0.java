package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends x10 implements iv {
    public final /* synthetic */ c0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, int i) {
        super(4);
        this.e = c0Var;
        this.f = i;
    }

    @Override // defpackage.iv
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c0 c0Var = this.e;
        bu buVar = c0Var.a;
        ((AutofillManager) buVar.e).notifyViewEntered(c0Var.c, this.f, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return wz0.a;
    }
}
