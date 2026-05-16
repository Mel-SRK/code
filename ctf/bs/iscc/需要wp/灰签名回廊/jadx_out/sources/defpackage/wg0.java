package defpackage;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends x10 implements iv {
    public final /* synthetic */ ViewStructure e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ViewStructure viewStructure) {
        super(4);
        this.e = viewStructure;
    }

    @Override // defpackage.iv
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.e.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return wz0.a;
    }
}
