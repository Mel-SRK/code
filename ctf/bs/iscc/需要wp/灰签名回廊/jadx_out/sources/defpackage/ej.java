package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej extends x10 implements hv {
    public final /* synthetic */ ab0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lw0 g;
    public final /* synthetic */ cw0 h;
    public final /* synthetic */ h30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(ab0 ab0Var, boolean z, lw0 lw0Var, cw0 cw0Var, h30 h30Var) {
        super(3);
        this.e = ab0Var;
        this.f = z;
        this.g = lw0Var;
        this.h = cw0Var;
        this.i = h30Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        lw0 lw0Var = this.g;
        b6 b6Var = lw0Var.a;
        ab0 ab0Var = this.e;
        if (!zBooleanValue) {
            iIntValue = ab0Var.b(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = ab0Var.b(iIntValue2);
        }
        boolean z = false;
        if (this.f) {
            long j = lw0Var.b;
            int i = hx0.c;
            if (iIntValue != ((int) (j >> 32)) || iIntValue2 != ((int) (j & 4294967295L))) {
                int iMin = Math.min(iIntValue, iIntValue2);
                xw xwVar = xw.d;
                cw0 cw0Var = this.h;
                if (iMin < 0 || Math.max(iIntValue, iIntValue2) > b6Var.e.length()) {
                    cw0Var.p(false);
                    cw0Var.n(xwVar);
                } else {
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        cw0Var.p(false);
                        cw0Var.n(xwVar);
                    } else {
                        cw0Var.f(true);
                    }
                    this.i.t.g(new lw0(b6Var, wo0.b(iIntValue, iIntValue2), (hx0) null));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
