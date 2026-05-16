package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k50 extends kf0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ k50(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.em
    public final float b() {
        switch (this.e) {
            case 0:
                return ((j50) this.f).b();
            default:
                return ((b1) this.f).getDensity().b();
        }
    }

    @Override // defpackage.kf0
    public float d(tx txVar) {
        float fIntBitsToFloat;
        int iBb;
        switch (this.e) {
            case 0:
                gv gvVar = txVar.a;
                if (gvVar != null) {
                    return ((Number) gvVar.f(this, Float.valueOf(Float.NaN))).floatValue();
                }
                j50 j50Var = (j50) this.f;
                if (j50Var.n) {
                    return Float.NaN;
                }
                j50 j50Var2 = j50Var;
                while (true) {
                    hl0 hl0Var = j50Var2.p;
                    float f = (hl0Var == null || (iBb = h7.bb(hl0Var.b, txVar)) < 0) ? Float.NaN : hl0Var.c[iBb];
                    if (!Float.isNaN(f)) {
                        j50Var2.bi(j50Var.bq(), txVar);
                        d20 d20VarBo = j50Var2.bo();
                        d20 d20VarBo2 = j50Var.bo();
                        switch (txVar.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (d20VarBo2.z(d20VarBo, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (d20VarBo.al() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (d20VarBo2.z(d20VarBo, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (d20VarBo.al() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    j50 j50VarBs = j50Var2.bs();
                    if (j50VarBs == null) {
                        j50Var2.bi(j50Var.bq(), txVar);
                        return Float.NaN;
                    }
                    j50Var2 = j50VarBs;
                }
                break;
            default:
                return super.d(txVar);
        }
    }

    @Override // defpackage.kf0
    public final e20 e() {
        switch (this.e) {
            case 0:
                return ((j50) this.f).getLayoutDirection();
            default:
                return ((b1) this.f).getLayoutDirection();
        }
    }

    @Override // defpackage.kf0
    public final int f() {
        switch (this.e) {
            case 0:
                return ((j50) this.f).az();
            default:
                return ((b1) this.f).getRoot().ah.o.d;
        }
    }

    @Override // defpackage.em
    public final float k() {
        switch (this.e) {
            case 0:
                return ((j50) this.f).k();
            default:
                return ((b1) this.f).getDensity().k();
        }
    }
}
