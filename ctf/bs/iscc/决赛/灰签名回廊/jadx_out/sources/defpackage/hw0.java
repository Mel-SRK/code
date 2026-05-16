package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ em f;
    public final /* synthetic */ w80 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw0(em emVar, w80 w80Var, int i) {
        super(1);
        this.e = i;
        this.f = emVar;
        this.g = w80Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                long j = ((pn) obj).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                em emVar = this.f;
                this.g.setValue(new wz(e00.f(emVar.ai(fIntBitsToFloat), emVar.ai(Float.intBitsToFloat((int) (j & 4294967295L))))));
                return wz0.a;
            default:
                gw0 gw0Var = new gw0(0, (pu) obj);
                hw0 hw0Var = new hw0(this.f, this.g, 0);
                if (u50.a()) {
                    return u50.a() ? new MagnifierElement(gw0Var, hw0Var, Build.VERSION.SDK_INT == 28 ? uf0.b : uf0.c) : g70.a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
