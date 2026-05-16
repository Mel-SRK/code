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
        To view partially-correct add '--show-bad-code' argument
    */
    public yg(defpackage.dd r9, defpackage.dd r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            long r2 = defpackage.uc.a
            boolean r0 = defpackage.uc.a(r0, r2)
            if (r0 == 0) goto Lf
            dd r0 = defpackage.i60.i(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.b
            boolean r1 = defpackage.uc.a(r4, r2)
            if (r1 == 0) goto L1d
            dd r1 = defpackage.i60.i(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            float[] r4 = defpackage.i60.j
            r5 = 3
            if (r11 != r5) goto L69
            long r6 = r9.b
            boolean r11 = defpackage.uc.a(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.uc.a(r6, r2)
            if (r11 == 0) goto L34
            if (r2 == 0) goto L34
            goto L69
        L34:
            if (r11 != 0) goto L38
            if (r2 == 0) goto L69
        L38:
            if (r11 == 0) goto L3b
            goto L3c
        L3b:
            r9 = r10
        L3c:
            bk0 r9 = (defpackage.bk0) r9
            a21 r9 = r9.d
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r4
        L48:
            if (r2 == 0) goto L4e
            float[] r4 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6a
        L69:
            r4 = 0
        L6a:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg.<init>(dd, dd, int):void");
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
