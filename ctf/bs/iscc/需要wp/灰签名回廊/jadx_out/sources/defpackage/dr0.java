package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dr0 implements cv {
    public final /* synthetic */ int d;

    public /* synthetic */ dr0(int i) {
        this.d = i;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.d) {
            case 0:
                dr0 dr0Var = fr0.a;
                return wz0.a;
            default:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
        }
    }
}
