package defpackage;

import android.R;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class hi extends x10 implements gv {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(int i) {
        super(2);
        this.e = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        int i;
        vf vfVar = (vf) obj;
        ((Number) obj2).intValue();
        vfVar.av(-1451087197);
        int i2 = this.e;
        if (i2 == 1) {
            i = R.string.cut;
        } else if (i2 == 2) {
            i = R.string.copy;
        } else if (i2 == 3) {
            i = R.string.paste;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i = R.string.selectAll;
        }
        String string = ((Resources) vfVar.j(d2.c)).getString(i);
        vfVar.q(false);
        return string;
    }
}
