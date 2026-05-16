package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xg extends yg {
    public final bk0 e;
    public final bk0 f;
    public final float[] g;

    public xg(bk0 bk0Var, bk0 bk0Var2) {
        float[] fArrAo;
        super(bk0Var2, bk0Var, bk0Var2, null);
        this.e = bk0Var;
        this.f = bk0Var2;
        float[] fArr = (float[]) bu.f.e;
        a21 a21Var = bk0Var.d;
        float[] fArr2 = bk0Var.i;
        a21 a21Var2 = bk0Var2.d;
        float[] fArr3 = bk0Var2.j;
        if (i60.w(a21Var, a21Var2)) {
            fArrAo = i60.ao(fArr3, fArr2);
        } else {
            float[] fArrA = a21Var.a();
            float[] fArrA2 = a21Var2.a();
            a21 a21Var3 = i60.g;
            fArrAo = i60.ao(i60.w(a21Var2, a21Var3) ? fArr3 : i60.ai(i60.ao(i60.q(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), bk0Var2.i)), i60.w(a21Var, a21Var3) ? fArr2 : i60.ao(i60.q(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrAo;
    }

    @Override // defpackage.yg
    public final long a(long j) {
        float fH = qc.h(j);
        float fG = qc.g(j);
        float fE = qc.e(j);
        float fD = qc.d(j);
        xj0 xj0Var = this.e.p;
        float fB = (float) xj0Var.b(fH);
        float fB2 = (float) xj0Var.b(fG);
        float fB3 = (float) xj0Var.b(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f2 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f3 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        bk0 bk0Var = this.f;
        float fB4 = (float) bk0Var.m.b(f);
        xj0 xj0Var2 = bk0Var.m;
        return m10.a(fB4, (float) xj0Var2.b(f2), (float) xj0Var2.b(f3), fD, bk0Var);
    }
}
