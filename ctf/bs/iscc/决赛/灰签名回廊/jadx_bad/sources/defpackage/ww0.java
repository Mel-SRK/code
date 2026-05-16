package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ww0 {
    public static final qg a = new qg(ng.z);

    public static final void a(nx0 nx0Var, vf vfVar, int i) {
        te teVar = d41.b;
        vfVar.aw(-460300127);
        int i2 = (vfVar.f(nx0Var) ? 4 : 2) | i | (vfVar.h(teVar) ? 32 : 16);
        if ((i2 & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else {
            ai0 ai0Var = a;
            az0.a(ai0Var.a(((nx0) vfVar.j(ai0Var)).d(nx0Var)), teVar, vfVar, (i2 & 112) | 8);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j(i, 11, nx0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, j70 j70Var, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, nx0 nx0Var, vf vfVar, int i4, int i5) {
        int i6;
        j70 j70Var2;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        j70 j70Var3;
        long j7;
        long j8;
        long j9;
        nx0 nx0Var2;
        boolean z2;
        int i11;
        int i12;
        long j10;
        int i13;
        long jB;
        boolean z3;
        int i14;
        int i15;
        j70 j70Var4;
        long j11;
        long j12;
        long j13;
        nx0 nx0Var3;
        int i16;
        long j14;
        boolean z4;
        hi0 hi0VarS;
        vfVar.aw(-2055108902);
        if ((i4 & 6) == 0) {
            i6 = (vfVar.f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                j70Var2 = j70Var;
                i6 |= vfVar.f(j70Var2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                j5 = j;
                i8 = i6 | (vfVar.e(j5) ? 256 : 128);
            }
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    j6 = j2;
                    i8 |= vfVar.e(j6) ? 2048 : 1024;
                }
                i10 = i8 | 920346624;
                if ((306783379 & i10) == 306783378 && vfVar.z()) {
                    vfVar.aq();
                    z4 = z;
                    i14 = i2;
                    i15 = i3;
                    nx0Var3 = nx0Var;
                    j70Var4 = j70Var2;
                    j11 = j5;
                    j12 = j6;
                    j13 = j3;
                    j14 = j4;
                    i16 = i;
                } else {
                    vfVar.as();
                    if ((i4 & 1) != 0 || vfVar.x()) {
                        j70Var3 = i17 == 0 ? g70.a : j70Var2;
                        j7 = i7 == 0 ? qc.g : j5;
                        j8 = i9 == 0 ? qx0.c : j6;
                        j9 = qx0.c;
                        nx0Var2 = (nx0) vfVar.j(a);
                        z2 = true;
                        i11 = 1;
                        i12 = Integer.MAX_VALUE;
                        j10 = j9;
                        i13 = 1;
                    } else {
                        vfVar.aq();
                        i13 = i;
                        z2 = z;
                        i12 = i2;
                        i11 = i3;
                        nx0Var2 = nx0Var;
                        j70Var3 = j70Var2;
                        j7 = j5;
                        j8 = j6;
                        j9 = j3;
                        j10 = j4;
                    }
                    vfVar.r();
                    vfVar.av(-1827892941);
                    if (j7 == 16) {
                        jB = j7;
                        z3 = false;
                    } else {
                        vfVar.av(-1827892168);
                        jB = nx0Var2.b();
                        if (jB == 16) {
                            jB = ((qc) vfVar.j(jh.a)).a;
                        }
                        z3 = false;
                        vfVar.q(false);
                    }
                    vfVar.q(z3);
                    long j15 = j10;
                    nx0 nx0Var4 = nx0Var2;
                    int i18 = i13;
                    boolean z5 = z2;
                    int i19 = i12;
                    int i20 = i11;
                    d41.f(str, j70Var3, nx0.e(nx0Var4, jB, j8, j9, Integer.MIN_VALUE, j15, 16609104), i18, z5, i19, i20, vfVar, (i10 & 126) | 14380032, 256);
                    i14 = i19;
                    i15 = i20;
                    j70Var4 = j70Var3;
                    j11 = j7;
                    j12 = j8;
                    j13 = j9;
                    nx0Var3 = nx0Var4;
                    i16 = i18;
                    j14 = j15;
                    z4 = z5;
                }
                hi0VarS = vfVar.s();
                if (hi0VarS != null) {
                    hi0VarS.d = new vw0(str, j70Var4, j11, j12, j13, j14, i16, z4, i14, i15, nx0Var3, i4, i5);
                    return;
                }
                return;
            }
            i8 |= 3072;
            j6 = j2;
            i10 = i8 | 920346624;
            if ((306783379 & i10) == 306783378) {
                vfVar.as();
                if ((i4 & 1) != 0) {
                    if (i17 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    j9 = qx0.c;
                    nx0Var2 = (nx0) vfVar.j(a);
                    z2 = true;
                    i11 = 1;
                    i12 = Integer.MAX_VALUE;
                    j10 = j9;
                    i13 = 1;
                    vfVar.r();
                    vfVar.av(-1827892941);
                    if (j7 == 16) {
                    }
                    vfVar.q(z3);
                    long j152 = j10;
                    nx0 nx0Var42 = nx0Var2;
                    int i182 = i13;
                    boolean z52 = z2;
                    int i192 = i12;
                    int i202 = i11;
                    d41.f(str, j70Var3, nx0.e(nx0Var42, jB, j8, j9, Integer.MIN_VALUE, j152, 16609104), i182, z52, i192, i202, vfVar, (i10 & 126) | 14380032, 256);
                    i14 = i192;
                    i15 = i202;
                    j70Var4 = j70Var3;
                    j11 = j7;
                    j12 = j8;
                    j13 = j9;
                    nx0Var3 = nx0Var42;
                    i16 = i182;
                    j14 = j152;
                    z4 = z52;
                }
            }
            hi0VarS = vfVar.s();
            if (hi0VarS != null) {
            }
        }
        j70Var2 = j70Var;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        j6 = j2;
        i10 = i8 | 920346624;
        if ((306783379 & i10) == 306783378) {
        }
        hi0VarS = vfVar.s();
        if (hi0VarS != null) {
        }
    }
}
