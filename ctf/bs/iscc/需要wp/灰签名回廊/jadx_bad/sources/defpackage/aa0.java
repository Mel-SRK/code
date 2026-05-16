package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends ka0 {
    public final i70 c;
    public final o5 d;
    public final e50 e;
    public fa0 f;
    public ig0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public aa0(i70 i70Var) {
        this.c = i70Var;
        o5 o5Var = new o5(2);
        o5Var.c = new long[2];
        this.d = o5Var;
        this.e = new e50(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031a  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.ka0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(e50 e50Var, d20 d20Var, f1 f1Var, boolean z) {
        o5 o5Var;
        e50 e50Var2;
        Object obj;
        boolean z2;
        boolean z3;
        ig0 ig0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        pg0 pg0Var;
        boolean zA = super.a(e50Var, d20Var, f1Var, z);
        ?? M = this.c;
        boolean z6 = true;
        if (M.q) {
            ?? a90Var = 0;
            while (M != 0) {
                if (M instanceof sg0) {
                    this.f = pk.aw((sg0) M, 16);
                } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                    i70 i70Var = ((rl) M).s;
                    int i6 = 0;
                    M = M;
                    a90Var = a90Var;
                    while (i70Var != null) {
                        if ((i70Var.f & 16) != 0) {
                            i6++;
                            a90Var = a90Var;
                            if (i6 == 1) {
                                M = i70Var;
                            } else {
                                if (a90Var == 0) {
                                    a90Var = new a90(new i70[16]);
                                }
                                if (M != 0) {
                                    a90Var.b(M);
                                    M = 0;
                                }
                                a90Var.b(i70Var);
                            }
                        }
                        i70Var = i70Var.i;
                        M = M;
                        a90Var = a90Var;
                    }
                    if (i6 == 1) {
                    }
                }
                M = pk.m(a90Var);
            }
            if (this.f != null) {
                int iC = e50Var.c();
                int i7 = 0;
                while (true) {
                    o5Var = this.d;
                    e50Var2 = this.e;
                    if (i7 >= iC) {
                        break;
                    }
                    long jA = e50Var.a(i7);
                    pg0 pg0Var2 = (pg0) e50Var.d(i7);
                    if (o5Var.b(jA)) {
                        boolean z7 = z6;
                        long j = pg0Var2.g;
                        ArrayList arrayList = pg0Var2.k;
                        long j2 = pg0Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            rq rqVar = rq.d;
                            z4 = zA;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? rqVar : arrayList).size());
                            List list = arrayList == null ? rqVar : arrayList;
                            i3 = iC;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                lx lxVar = (lx) list.get(i8);
                                e50 e50Var3 = e50Var2;
                                long j3 = jA;
                                long j4 = lxVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    pg0Var = pg0Var2;
                                    long j5 = lxVar.a;
                                    i5 = size;
                                    fa0 fa0Var = this.f;
                                    fa0Var.getClass();
                                    arrayList2.add(new lx(j5, fa0Var.M(d20Var, j4), lxVar.c));
                                } else {
                                    i5 = size;
                                    pg0Var = pg0Var2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                e50Var2 = e50Var3;
                                jA = j3;
                                pg0Var2 = pg0Var;
                            }
                            e50 e50Var4 = e50Var2;
                            long j6 = jA;
                            fa0 fa0Var2 = this.f;
                            fa0Var2.getClass();
                            long jM = fa0Var2.M(d20Var, j);
                            fa0 fa0Var3 = this.f;
                            fa0Var3.getClass();
                            pg0 pg0Var3 = new pg0(pg0Var2.a, pg0Var2.b, fa0Var3.M(d20Var, j2), pg0Var2.d, pg0Var2.e, pg0Var2.f, jM, pg0Var2.h, pg0Var2.i, arrayList2, pg0Var2.j, pg0Var2.l);
                            pg0 pg0Var4 = pg0Var2.o;
                            if (pg0Var4 == null) {
                                pg0Var4 = pg0Var2;
                            }
                            pg0Var3.o = pg0Var4;
                            pg0 pg0Var5 = pg0Var2.o;
                            if (pg0Var5 != null) {
                                pg0Var2 = pg0Var5;
                            }
                            pg0Var3.o = pg0Var2;
                            e50Var4.b(j6, pg0Var3);
                        } else {
                            z4 = zA;
                            i3 = iC;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zA;
                        i3 = iC;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    iC = i3;
                    z6 = z5;
                    zA = z4;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (e50Var2.c() == 0) {
                    o5Var.b = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = o5Var.b;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) o5Var.c)[i9];
                    if (e50Var.d) {
                        int i10 = e50Var.g;
                        long[] jArr = e50Var.e;
                        Object[] objArr = e50Var.f;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != pk.d) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        e50Var.d = false;
                        e50Var.g = i11;
                    }
                    if (e00.n(e50Var.e, e50Var.g, j7) < 0 && i9 < (i2 = o5Var.b)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) o5Var.c;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        o5Var.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(e50Var2.c());
                int iC2 = e50Var2.c();
                for (int i16 = 0; i16 < iC2; i16++) {
                    arrayList3.add(e50Var2.d(i16));
                }
                ig0 ig0Var2 = new ig0(arrayList3, f1Var);
                int size2 = arrayList3.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i17);
                    if (f1Var.m(((pg0) obj).a)) {
                        break;
                    }
                    i17++;
                }
                pg0 pg0Var6 = (pg0) obj;
                if (pg0Var6 != null) {
                    boolean z10 = pg0Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || pg0Var6.h)) {
                            fa0 fa0Var4 = this.f;
                            fa0Var4.getClass();
                            long j8 = fa0Var4.f;
                            long j9 = pg0Var6.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i18) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = ig0Var2.c) == 3 || i == 4 || i == 5)) {
                        int i19 = ig0Var2.c;
                        if (i19 == 4 && z12 && !this.j) {
                            ig0Var2.c = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            ig0Var2.c = 3;
                        }
                    } else {
                        ig0Var2.c = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || ig0Var2.c != 3 || (ig0Var = this.g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = ig0Var.a;
                int size3 = r1.size();
                ?? r4 = ig0Var2.a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!xa0.b(((pg0) r1.get(r5)).c, ((pg0) r4.get(r5)).c)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.g = ig0Var2;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.ka0
    public final void b(f1 f1Var) {
        super.b(f1Var);
        ig0 ig0Var = this.g;
        if (ig0Var == null) {
            return;
        }
        this.h = this.i;
        ?? r1 = ig0Var.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            pg0 pg0Var = (pg0) r1.get(i);
            boolean z = pg0Var.d;
            long j = pg0Var.a;
            boolean zM = f1Var.m(j);
            boolean z2 = this.i;
            if ((!z && !zM) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = ig0Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        a90 a90Var = this.a;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa0) objArr[i2]).c();
        }
        ?? M = this.c;
        ?? a90Var2 = 0;
        while (M != 0) {
            if (M instanceof sg0) {
                ((sg0) M).aw();
            } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                i70 i70Var = ((rl) M).s;
                int i3 = 0;
                M = M;
                a90Var2 = a90Var2;
                while (i70Var != null) {
                    if ((i70Var.f & 16) != 0) {
                        i3++;
                        a90Var2 = a90Var2;
                        if (i3 == 1) {
                            M = i70Var;
                        } else {
                            if (a90Var2 == 0) {
                                a90Var2 = new a90(new i70[16]);
                            }
                            if (M != 0) {
                                a90Var2.b(M);
                                M = 0;
                            }
                            a90Var2.b(i70Var);
                        }
                    }
                    i70Var = i70Var.i;
                    M = M;
                    a90Var2 = a90Var2;
                }
                if (i3 == 1) {
                }
            }
            M = pk.m(a90Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(f1 f1Var) {
        boolean z;
        e50 e50Var = this.e;
        if (e50Var.c() == 0) {
            z = false;
        } else {
            i70 i70Var = this.c;
            if (i70Var.q) {
                ig0 ig0Var = this.g;
                ig0Var.getClass();
                fa0 fa0Var = this.f;
                fa0Var.getClass();
                long j = fa0Var.f;
                ?? M = i70Var;
                ?? a90Var = 0;
                while (true) {
                    z = true;
                    if (M == 0) {
                        break;
                    }
                    if (M instanceof sg0) {
                        ((sg0) M).ad(ig0Var, jg0.f, j);
                    } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                        i70 i70Var2 = ((rl) M).s;
                        int i = 0;
                        M = M;
                        a90Var = a90Var;
                        while (i70Var2 != null) {
                            if ((i70Var2.f & 16) != 0) {
                                i++;
                                a90Var = a90Var;
                                if (i == 1) {
                                    M = i70Var2;
                                } else {
                                    if (a90Var == 0) {
                                        a90Var = new a90(new i70[16]);
                                    }
                                    if (M != 0) {
                                        a90Var.b(M);
                                        M = 0;
                                    }
                                    a90Var.b(i70Var2);
                                }
                            }
                            i70Var2 = i70Var2.i;
                            M = M;
                            a90Var = a90Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M = pk.m(a90Var);
                }
                if (i70Var.q) {
                    a90 a90Var2 = this.a;
                    Object[] objArr = a90Var2.d;
                    int i2 = a90Var2.f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((aa0) objArr[i3]).d(f1Var);
                    }
                }
            }
        }
        b(f1Var);
        int i4 = e50Var.g;
        Object[] objArr2 = e50Var.f;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        e50Var.g = 0;
        e50Var.d = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [a90] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(f1 f1Var, boolean z) {
        if (this.e.c() == 0) {
            return false;
        }
        ?? M = this.c;
        if (!M.q) {
            return false;
        }
        ig0 ig0Var = this.g;
        ig0Var.getClass();
        fa0 fa0Var = this.f;
        fa0Var.getClass();
        long j = fa0Var.f;
        ?? M2 = M;
        ?? a90Var = 0;
        while (M2 != 0) {
            if (M2 instanceof sg0) {
                ((sg0) M2).ad(ig0Var, jg0.d, j);
            } else if ((M2.f & 16) != 0 && (M2 instanceof rl)) {
                i70 i70Var = ((rl) M2).s;
                int i = 0;
                M2 = M2;
                a90Var = a90Var;
                while (i70Var != null) {
                    if ((i70Var.f & 16) != 0) {
                        i++;
                        a90Var = a90Var;
                        if (i == 1) {
                            M2 = i70Var;
                        } else {
                            if (a90Var == 0) {
                                a90Var = new a90(new i70[16]);
                            }
                            if (M2 != 0) {
                                a90Var.b(M2);
                                M2 = 0;
                            }
                            a90Var.b(i70Var);
                        }
                    }
                    i70Var = i70Var.i;
                    M2 = M2;
                    a90Var = a90Var;
                }
                if (i == 1) {
                }
            }
            M2 = pk.m(a90Var);
        }
        if (M.q) {
            a90 a90Var2 = this.a;
            Object[] objArr = a90Var2.d;
            int i2 = a90Var2.f;
            for (int i3 = 0; i3 < i2; i3++) {
                aa0 aa0Var = (aa0) objArr[i3];
                this.f.getClass();
                aa0Var.e(f1Var, z);
            }
        }
        if (M.q) {
            ?? a90Var3 = 0;
            while (M != 0) {
                if (M instanceof sg0) {
                    ((sg0) M).ad(ig0Var, jg0.e, j);
                } else if ((M.f & 16) != 0 && (M instanceof rl)) {
                    i70 i70Var2 = ((rl) M).s;
                    int i4 = 0;
                    M = M;
                    a90Var3 = a90Var3;
                    while (i70Var2 != null) {
                        if ((i70Var2.f & 16) != 0) {
                            i4++;
                            a90Var3 = a90Var3;
                            if (i4 == 1) {
                                M = i70Var2;
                            } else {
                                if (a90Var3 == 0) {
                                    a90Var3 = new a90(new i70[16]);
                                }
                                if (M != 0) {
                                    a90Var3.b(M);
                                    M = 0;
                                }
                                a90Var3.b(i70Var2);
                            }
                        }
                        i70Var2 = i70Var2.i;
                        M = M;
                        a90Var3 = a90Var3;
                    }
                    if (i4 == 1) {
                    }
                }
                M = pk.m(a90Var3);
            }
        }
        return true;
    }

    public final void f(long j, m80 m80Var) {
        o5 o5Var = this.d;
        if (o5Var.b(j) && m80Var.f(this) < 0) {
            o5Var.c(j);
            e50 e50Var = this.e;
            int iN = e00.n(e50Var.e, e50Var.g, j);
            if (iN >= 0) {
                Object[] objArr = e50Var.f;
                Object obj = objArr[iN];
                Object obj2 = pk.d;
                if (obj != obj2) {
                    objArr[iN] = obj2;
                    e50Var.d = true;
                }
            }
        }
        a90 a90Var = this.a;
        Object[] objArr2 = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa0) objArr2[i2]).f(j, m80Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
