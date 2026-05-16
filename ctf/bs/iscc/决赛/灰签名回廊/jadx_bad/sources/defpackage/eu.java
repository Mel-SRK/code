package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eu {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile bs0 b = new bs0();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c((int) 115.0f, new fu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c((int) 130.0f, new fu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c((int) 150.0f, new fu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c((int) 180.0f, new fu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c((int) 200.0f, new fu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        uy.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static du a(float f) {
        float f2;
        du fuVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        du duVar = (du) b.b(i);
        if (duVar != null) {
            return duVar;
        }
        bs0 bs0Var = b;
        int iM = e00.m(bs0Var.d, bs0Var.f, i);
        if (iM >= 0) {
            return (du) b.d(iM);
        }
        int i2 = -(iM + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f) {
            fu fuVar2 = new fu(new float[]{1.0f}, new float[]{f});
            b(f, fuVar2);
            return fuVar2;
        }
        if (i3 < 0) {
            fuVar = new fu(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.d[i3] / 100.0f;
            fuVar = (du) b.d(i3);
        }
        float f3 = b.d[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        du duVar2 = (du) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = fuVar.b(f4);
            fArr2[i4] = ((duVar2.b(f4) - fB) * fMax) + fB;
        }
        fu fuVar3 = new fu(fArr, fArr2);
        b(f, fuVar3);
        return fuVar3;
    }

    public static void b(float f, fu fuVar) {
        synchronized (c) {
            bs0 bs0VarA = b.clone();
            bs0VarA.c((int) (f * 100.0f), fuVar);
            b = bs0VarA;
        }
    }
}
