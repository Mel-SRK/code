package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y70 {
    public final g20 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public y70(g20 g20Var, long j, int i, boolean z) {
        int i2;
        int iG;
        boolean z2 = true;
        int i3 = z ? 2 : 1;
        this.a = g20Var;
        this.b = i;
        if (dh.j(j) != 0 || dh.i(j) != 0) {
            ty.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) g20Var.a;
        int size = arrayList2.size();
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            de0 de0Var = (de0) arrayList2.get(i4);
            s3 s3Var = de0Var.a;
            int iH = dh.h(j);
            if (dh.c(j)) {
                iG = dh.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                iG = dh.g(j);
            }
            o3 o3Var = new o3(s3Var, this.b - i5, i3, eh.b(iH, iG, 5));
            float fB = o3Var.b() + f;
            xw0 xw0Var = o3Var.d;
            int i6 = i5 + xw0Var.g;
            int i7 = de0Var.b;
            int i8 = de0Var.c;
            int i9 = i4;
            ce0 ce0Var = new ce0(o3Var, i7, i8, i5, i6, f, fB);
            i2 = i6;
            arrayList.add(ce0Var);
            if (xw0Var.d || (i2 == this.b && i9 != f00.v((ArrayList) this.a.a))) {
                f = fB;
                break;
            } else {
                i4 = i9 + 1;
                i5 = i2;
                f = fB;
            }
        }
        z2 = false;
        i2 = i5;
        this.e = f;
        this.f = i2;
        this.c = z2;
        this.h = arrayList;
        this.d = dh.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ce0 ce0Var2 = (ce0) arrayList.get(i10);
            ?? r7 = ce0Var2.a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i11 = 0; i11 < size3; i11++) {
                ri0 ri0Var = (ri0) r7.get(i11);
                arrayList4.add(ri0Var != null ? ce0Var2.a(ri0Var) : null);
            }
            pc.ap(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = 0; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = kc.az(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void g(y70 y70Var, oa oaVar, i9 i9Var, float f, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        oaVar.l();
        ArrayList arrayList = y70Var.h;
        if (arrayList.size() <= 1 || (i9Var instanceof vr0)) {
            d41.u(y70Var, oaVar, i9Var, f, yp0Var, bv0Var, yoVar);
            oaVar.i();
            return;
        }
        if (!(i9Var instanceof j9)) {
            wc.l();
            return;
        }
        int size = arrayList.size();
        float fMax = 0.0f;
        float fB = 0.0f;
        for (int i = 0; i < size; i++) {
            ce0 ce0Var = (ce0) arrayList.get(i);
            fB += ce0Var.a.b();
            fMax = Math.max(fMax, ce0Var.a.d());
        }
        Float.floatToRawIntBits(fMax);
        Float.floatToRawIntBits(fB);
        throw null;
    }

    public final void a(final long j, final float[] fArr) {
        h(hx0.e(j));
        i(hx0.d(j));
        final vi0 vi0Var = new vi0();
        vi0Var.d = 0;
        final ui0 ui0Var = new ui0();
        e00.w(this.h, j, new cv() { // from class: w70
            @Override // defpackage.cv
            public final Object g(Object obj) {
                long j2;
                o3 o3Var;
                boolean z;
                float fA;
                float fA2;
                ce0 ce0Var = (ce0) obj;
                int i = ce0Var.b;
                o3 o3Var2 = ce0Var.a;
                int iD = ce0Var.c;
                long j3 = j;
                int iE = i > hx0.e(j3) ? ce0Var.b : hx0.e(j3);
                if (iD >= hx0.d(j3)) {
                    iD = hx0.d(j3);
                }
                long jB = wo0.b(ce0Var.d(iE), ce0Var.d(iD));
                vi0 vi0Var2 = vi0Var;
                int i2 = vi0Var2.d;
                xw0 xw0Var = o3Var2.d;
                int iE2 = hx0.e(jB);
                int iD2 = hx0.d(jB);
                Layout layout = xw0Var.f;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    ty.a("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    ty.a("startOffset must be less than text length");
                }
                if (iD2 <= iE2) {
                    ty.a("endOffset must be greater than startOffset");
                }
                if (iD2 > length) {
                    ty.a("endOffset must be smaller or equal to text length");
                }
                int i3 = (iD2 - iE2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i2 < i3) {
                    ty.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD2 - 1);
                rx rxVar = new rx(xw0Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF = xw0Var.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD2, iF);
                        float fG = xw0Var.g(lineForOffset);
                        float fE = xw0Var.e(lineForOffset);
                        j2 = jB;
                        o3Var = o3Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = rxVar.a(iMax, false, false, false);
                                    z = z3;
                                    fA = rxVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = rxVar.a(iMax, false, false, false);
                                        fA2 = rxVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = rxVar.a(iMax, false, false, true);
                                        fA = rxVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr2[i2] = fA;
                                fArr2[i2 + 1] = fG;
                                fArr2[i2 + 2] = fA2;
                                fArr2[i2 + 3] = fE;
                                i2 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = rxVar.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = rxVar.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr2[i2] = fA;
                            fArr2[i2 + 1] = fG;
                            fArr2[i2 + 2] = fA2;
                            fArr2[i2 + 3] = fE;
                            i2 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        o3Var2 = o3Var;
                        jB = j2;
                    }
                } else {
                    j2 = jB;
                    o3Var = o3Var2;
                }
                int iC = (hx0.c(j2) * 4) + vi0Var2.d;
                int i4 = vi0Var2.d;
                while (true) {
                    ui0 ui0Var2 = ui0Var;
                    if (i4 >= iC) {
                        vi0Var2.d = iC;
                        ui0Var2.d = o3Var.b() + ui0Var2.d;
                        return wz0.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = ui0Var2.d;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        j(i);
        ArrayList arrayList = this.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        return o3Var.d.e(i - ce0Var.d) + ce0Var.f;
    }

    public final int c(float f) {
        ArrayList arrayList = this.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.v(arrayList, f));
        int i = ce0Var.c - ce0Var.b;
        int i2 = ce0Var.d;
        if (i == 0) {
            return i2;
        }
        o3 o3Var = ce0Var.a;
        float f2 = f - ce0Var.f;
        xw0 xw0Var = o3Var.d;
        return xw0Var.f.getLineForVertical(((int) f2) - xw0Var.h) + i2;
    }

    public final float d(int i) {
        j(i);
        ArrayList arrayList = this.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.u(i, arrayList));
        o3 o3Var = ce0Var.a;
        return o3Var.d.g(i - ce0Var.d) + ce0Var.f;
    }

    public final int e(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ce0 ce0Var = (ce0) arrayList.get(e00.v(arrayList, fIntBitsToFloat));
        int i2 = ce0Var.c;
        int i3 = ce0Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        o3 o3Var = ce0Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - ce0Var.f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        xw0 xw0Var = o3Var.d;
        int lineForVertical = xw0Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - xw0Var.h);
        return xw0Var.f.getOffsetForHorizontal(lineForVertical, (xw0Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long f(ri0 ri0Var, int i, wc wcVar) {
        long jB;
        long j;
        float f = ri0Var.b;
        ArrayList arrayList = this.h;
        int iV = e00.v(arrayList, f);
        float f2 = ((ce0) arrayList.get(iV)).g;
        float f3 = ri0Var.d;
        if (f2 >= f3 || iV == f00.v(arrayList)) {
            ce0 ce0Var = (ce0) arrayList.get(iV);
            return ce0Var.b(ce0Var.a.c(ce0Var.c(ri0Var), i, wcVar), true);
        }
        int iV2 = e00.v(arrayList, f3);
        long jB2 = hx0.b;
        while (true) {
            jB = hx0.b;
            if (!hx0.a(jB2, jB) || iV > iV2) {
                break;
            }
            ce0 ce0Var2 = (ce0) arrayList.get(iV);
            jB2 = ce0Var2.b(ce0Var2.a.c(ce0Var2.c(ri0Var), i, wcVar), true);
            iV++;
        }
        if (hx0.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = hx0.b;
            if (!hx0.a(jB, j) || iV > iV2) {
                break;
            }
            ce0 ce0Var3 = (ce0) arrayList.get(iV2);
            jB = ce0Var3.b(ce0Var3.a.c(ce0Var3.c(ri0Var), i, wcVar), true);
            iV2--;
        }
        return hx0.a(jB, j) ? jB2 : wo0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void h(int i) {
        b6 b6Var = (b6) this.a.b;
        if (i < 0 || i >= b6Var.e.length()) {
            ty.a("offset(" + i + ") is out of bounds [0, " + b6Var.e.length() + ')');
        }
    }

    public final void i(int i) {
        b6 b6Var = (b6) this.a.b;
        if (i < 0 || i > b6Var.e.length()) {
            ty.a("offset(" + i + ") is out of bounds [0, " + b6Var.e.length() + ']');
        }
    }

    public final void j(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        ty.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
