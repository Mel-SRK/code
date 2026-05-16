package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yg {
    public final dd a;
    public final dd b;
    public final dd c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yg(dd ddVar, dd ddVar2, int i) {
        float[] fArr;
        long j = ddVar.b;
        long j2 = uc.a;
        dd ddVarI = uc.a(j, j2) ? i60.i(ddVar) : ddVar;
        dd ddVarI2 = uc.a(ddVar2.b, j2) ? i60.i(ddVar2) : ddVar2;
        float[] fArrA = i60.j;
        if (i == 3) {
            boolean zA = uc.a(ddVar.b, j2);
            boolean zA2 = uc.a(ddVar2.b, j2);
            if (!(zA && zA2) && (zA || zA2)) {
                a21 a21Var = ((bk0) (zA ? ddVar : ddVar2)).d;
                float[] fArrA2 = zA ? a21Var.a() : fArrA;
                fArrA = zA2 ? a21Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        }
        this(ddVar2, ddVarI, ddVarI2, fArr);
    }

    public long a(long j) {
        float fH = qc.h(j);
        float fG = qc.g(j);
        float fE = qc.e(j);
        float fD = qc.d(j);
        dd ddVar = this.b;
        long jD = ddVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = ddVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public yg(dd ddVar, dd ddVar2, dd ddVar3, float[] fArr) {
        this.a = ddVar;
        this.b = ddVar2;
        this.c = ddVar3;
        this.d = fArr;
    }
}
