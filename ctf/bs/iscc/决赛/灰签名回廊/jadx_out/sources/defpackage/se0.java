package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class se0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final e80 e;
    public final au0 f;

    public se0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            dh0.a("Invalid start index");
        }
        this.d = new ArrayList();
        e80 e80Var = new e80();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            n10 n10Var = (n10) this.a.get(i3);
            int i4 = n10Var.c;
            int i5 = n10Var.d;
            e80Var.g(i4, new sw(i3, i2, i5));
            i2 += i5;
        }
        this.e = e80Var;
        this.f = new au0(new re0(this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        e80 e80Var = this.e;
        sw swVar = (sw) e80Var.b(i);
        if (swVar == null) {
            return false;
        }
        int i4 = swVar.b;
        int i5 = i2 - swVar.c;
        swVar.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = e80Var.c;
        long[] jArr = e80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        sw swVar2 = (sw) objArr[(i6 << 3) + i8];
                        if (swVar2.b >= i4 && !swVar2.equals(swVar) && (i3 = swVar2.b + i5) >= 0) {
                            swVar2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
