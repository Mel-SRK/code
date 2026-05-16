package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class po0 implements Iterable, d10 {
    public final q80 d;
    public f60 e;
    public boolean f;
    public boolean g;

    public po0() {
        long[] jArr = mm0.a;
        this.d = new q80();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final po0 a() {
        po0 po0Var = new po0();
        po0Var.f = this.f;
        po0Var.g = this.g;
        q80 q80Var = po0Var.d;
        q80Var.getClass();
        q80 q80Var2 = this.d;
        q80Var2.getClass();
        Object[] objArr = q80Var2.b;
        Object[] objArr2 = q80Var2.c;
        long[] jArr = q80Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            q80Var.l(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return po0Var;
    }

    public final Object b(cp0 cp0Var) {
        Object objG = this.d.g(cp0Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + cp0Var + " - consider getOrElse or getOrNull");
    }

    public final void c(po0 po0Var) {
        q80 q80Var = po0Var.d;
        Object[] objArr = q80Var.b;
        Object[] objArr2 = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        cp0 cp0Var = (cp0) obj;
                        q80 q80Var2 = this.d;
                        Object objG = q80Var2.g(cp0Var);
                        cp0Var.getClass();
                        Object objF = cp0Var.b.f(objG, obj2);
                        if (objF != null) {
                            q80Var2.l(cp0Var, objF);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void d(cp0 cp0Var, Object obj) {
        boolean z = obj instanceof ah;
        q80 q80Var = this.d;
        if (z && q80Var.c(cp0Var)) {
            Object objG = q80Var.g(cp0Var);
            objG.getClass();
            ah ahVar = (ah) objG;
            ah ahVar2 = (ah) obj;
            String str = ahVar2.a;
            if (str == null) {
                str = ahVar.a;
            }
            ov ovVar = ahVar2.b;
            if (ovVar == null) {
                ovVar = ahVar.b;
            }
            q80Var.l(cp0Var, new ah(str, ovVar));
        } else {
            q80Var.l(cp0Var, obj);
        }
        cp0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        return f00.h(this.d, po0Var.d) && this.f == po0Var.f && this.g == po0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + n5.e(this.d.hashCode() * 31, 31, this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f60 f60Var = this.e;
        if (f60Var == null) {
            q80 q80Var = this.d;
            q80Var.getClass();
            f60 f60Var2 = new f60(q80Var);
            this.e = f60Var2;
            f60Var = f60Var2;
        }
        return ((xq) f60Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        q80 q80Var = this.d;
        Object[] objArr = q80Var.b;
        Object[] objArr2 = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((cp0) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return az0.ag(this) + "{ " + ((Object) sb) + " }";
    }
}
