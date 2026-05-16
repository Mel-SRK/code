package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg implements pu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fg(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        r4 = new defpackage.ua0(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r2.c();
        r7 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // defpackage.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ua0 ua0Var;
        int i;
        switch (this.d) {
            case 0:
                vf vfVar = ((gg) this.e).d;
                sq0 sq0Var = vfVar.c;
                boolean z = vfVar.ab;
                Collection collectionAo = rq.d;
                if (!z) {
                    return collectionAo;
                }
                rq0 rq0VarC = sq0Var.c();
                int i2 = 0;
                while (true) {
                    try {
                        ua0Var = null;
                        if (i2 < sq0Var.e) {
                            boolean zL = rq0VarC.l(i2);
                            Object obj = this.f;
                            if (zL) {
                                Object objN = rq0VarC.n(i2);
                                if (objN != obj) {
                                    cj0 cj0Var = objN instanceof cj0 ? (cj0) objN : null;
                                    if ((cj0Var != null ? cj0Var.a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = rq0VarC.b;
                            int i3 = i2 + 1;
                            int iB = (i3 < rq0VarC.c ? iArr[(i3 * 5) + 4] : rq0VarC.e) - uq0.b(iArr, i2);
                            i = 0;
                            while (i < iB) {
                                Object objH = rq0VarC.h(i2, i);
                                if (objH != obj) {
                                    cj0 cj0Var2 = objH instanceof cj0 ? (cj0) objH : null;
                                    if ((cj0Var2 != null ? cj0Var2.a : null) != obj) {
                                        i++;
                                    }
                                }
                            }
                            i2 = i3;
                            break;
                        }
                    } finally {
                    }
                }
                ua0Var = new ua0(i2, Integer.valueOf(i));
                if (ua0Var == null) {
                    return collectionAo;
                }
                int i4 = ua0Var.a;
                Integer num = ua0Var.b;
                if (vfVar.ab) {
                    try {
                        collectionAo = e00.ao(sq0Var.c(), i4, num);
                    } finally {
                    }
                }
                return kc.az(collectionAo, vfVar.ad());
            default:
                r80 r80Var = (r80) this.e;
                jg jgVar = (jg) this.f;
                Object[] objArr = r80Var.b;
                long[] jArr = r80Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    jgVar.v(objArr[(i5 << 3) + i7]);
                                }
                                j >>= 8;
                            }
                            if (i6 == 8) {
                                if (i5 != length) {
                                    i5++;
                                }
                            }
                        }
                    }
                }
                return wz0.a;
        }
    }
}
