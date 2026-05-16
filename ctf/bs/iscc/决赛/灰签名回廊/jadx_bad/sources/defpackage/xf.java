package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xf {
    public static final ob0 a = new ob0("provider");
    public static final ob0 b = new ob0("provider");
    public static final ob0 c = new ob0("compositionLocalMap");
    public static final ob0 d = new ob0("providers");
    public static final ob0 e = new ob0("reference");
    public static final wf f = new wf(0);

    public static final void a(ArrayList arrayList, int i, int i2) {
        int iE = e(i, arrayList);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList.size() && ((o00) arrayList.get(iE)).b < i2) {
        }
    }

    public static final void b(rq0 rq0Var, ArrayList arrayList, int i) {
        boolean zL = rq0Var.l(i);
        int[] iArr = rq0Var.b;
        if (zL) {
            arrayList.add(rq0Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(rq0Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new cf("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void d(String str) {
        throw new cf("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM = f00.m(((o00) list.get(i3)).b, i);
            if (iM < 0) {
                i2 = i3 + 1;
            } else {
                if (iM <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        defpackage.wc.g("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(vq0 vq0Var, da0 da0Var) {
        n3 n3Var;
        int i;
        int i2;
        n3 n3Var2;
        Il il;
        int i3 = vq0Var.t;
        n3 n3Var3 = new n3(1, da0Var);
        int iAc = vq0Var.ac(vq0Var.b, i3);
        int iO = vq0Var.o();
        int iS = vq0Var.s(i3) + i3;
        f80 f80Var = null;
        int i4 = i3;
        d80 d80Var = null;
        loop0: while (i4 < iS) {
            int i5 = i4 + 1;
            int iF = vq0Var.f(i5);
            for (int iF2 = vq0Var.f(i4); iF2 < iF; iF2++) {
                Object obj = vq0Var.c[vq0Var.h(iF2)];
                if ((obj instanceof cj0) && (il = ((cj0) obj).b) != null && il.a()) {
                    int iC = vq0Var.c(il);
                    if (f80Var == null) {
                        int[] iArr = vz.a;
                        f80Var = new f80();
                    }
                    if (d80Var == null) {
                        d80Var = new d80();
                    }
                    f80Var.a(iC);
                    d80Var.a(iC);
                    d80Var.a(iF2);
                } else {
                    n3Var3.f(Integer.valueOf(iF2), obj);
                }
            }
            int iAc2 = i5 < iO ? vq0Var.ac(vq0Var.b, i5) : -1;
            if (iAc2 != i4) {
                while (true) {
                    if (d80Var == null || f80Var == null || !f80Var.e(i4)) {
                        n3Var = n3Var3;
                        i = iO;
                    } else {
                        int i6 = d80Var.b;
                        int i7 = i6 / 2;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < i7) {
                            int i10 = i8 * 2;
                            int i11 = iO;
                            int iC2 = d80Var.c(i10);
                            if (iC2 == i4) {
                                int iC3 = d80Var.c(i10 + 1);
                                n3Var3.f(Integer.valueOf(iC3), vq0Var.c[vq0Var.h(iC3)]);
                                n3Var2 = n3Var3;
                            } else if (i10 != i9) {
                                n3Var2 = n3Var3;
                                int i12 = i9 + 1;
                                d80Var.e(i9, iC2);
                                i9 += 2;
                                d80Var.e(i12, d80Var.c(i10 + 1));
                            } else {
                                n3Var2 = n3Var3;
                                i9 += 2;
                            }
                            i8++;
                            iO = i11;
                            n3Var3 = n3Var2;
                        }
                        n3Var = n3Var3;
                        i = iO;
                        if (i9 != i6) {
                            if (i9 < 0 || i9 > (i2 = d80Var.b) || i6 < 0 || i6 > i2) {
                                break loop0;
                            }
                            if (i6 < i9) {
                                wc.n("The end index must be < start index");
                                return;
                            } else if (i6 != i9) {
                                if (i6 < i2) {
                                    int[] iArr2 = d80Var.a;
                                    h7.as(iArr2, iArr2, i9, i6, i2);
                                }
                                d80Var.b -= i6 - i9;
                            }
                        }
                    }
                    if (i4 == i3 || iAc == iAc2) {
                        break;
                    }
                    iO = i;
                    i4 = iAc;
                    iAc = vq0Var.ac(vq0Var.b, iAc);
                    n3Var3 = n3Var;
                }
            } else {
                n3Var = n3Var3;
                i = iO;
            }
            iO = i;
            iAc = iAc2;
            i4 = i5;
            n3Var3 = n3Var;
        }
        vq0Var.af();
    }
}
