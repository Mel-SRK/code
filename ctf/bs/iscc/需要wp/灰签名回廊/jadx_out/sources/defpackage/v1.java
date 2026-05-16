package defpackage;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ w80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(w80 w80Var, int i) {
        super(1);
        this.e = i;
        this.f = w80Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                this.f.setValue(new Configuration((Configuration) obj));
                return wz0.a;
            case 1:
                return (Float) ((cv) this.f.getValue()).g(Float.valueOf(((Number) obj).floatValue()));
            default:
                ((cv) this.f.getValue()).g(new xa0(((xa0) obj).a));
                return wz0.a;
        }
    }
}
