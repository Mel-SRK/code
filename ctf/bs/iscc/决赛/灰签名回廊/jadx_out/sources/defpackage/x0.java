package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i, int i2) {
        super(1);
        this.e = i2;
        this.f = i;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(((gt) obj).O0(this.f));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f);
            default:
                return Boolean.valueOf(((gt) obj).O0(this.f));
        }
    }
}
