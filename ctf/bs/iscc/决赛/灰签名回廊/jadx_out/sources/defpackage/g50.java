package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g50 implements em {
    public boolean d;
    public long e = 9223372034707292159L;
    public long f = 0;
    public final /* synthetic */ j50 g;

    public g50(j50 j50Var) {
        this.g = j50Var;
    }

    public final void a(tx txVar, float f) {
        j50 j50Var = this.g;
        hl0 hl0Var = j50Var.p;
        if (hl0Var == null) {
            hl0Var = new hl0();
            j50Var.p = hl0Var;
        }
        int iBb = h7.bb(hl0Var.b, txVar);
        if (iBb >= 0) {
            float[] fArr = hl0Var.c;
            if (fArr[iBb] != f) {
                fArr[iBb] = f;
                hl0Var.d[iBb] = 1;
                return;
            } else {
                byte[] bArr = hl0Var.d;
                if (bArr[iBb] == 2) {
                    bArr[iBb] = 0;
                    return;
                }
                return;
            }
        }
        int i = hl0Var.a;
        tx[] txVarArr = hl0Var.b;
        if (i == txVarArr.length) {
            int i2 = i * 2;
            hl0Var.b = (tx[]) Arrays.copyOf(txVarArr, i2);
            hl0Var.c = Arrays.copyOf(hl0Var.c, i2);
            hl0Var.d = Arrays.copyOf(hl0Var.d, i2);
        }
        hl0Var.b[i] = txVar;
        hl0Var.d[i] = 3;
        hl0Var.c[i] = f;
        hl0Var.a++;
    }

    @Override // defpackage.em
    public final float b() {
        return this.g.b();
    }

    @Override // defpackage.em
    public final float k() {
        return this.g.k();
    }
}
