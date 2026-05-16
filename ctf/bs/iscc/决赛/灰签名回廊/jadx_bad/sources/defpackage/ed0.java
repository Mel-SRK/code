package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 {
    public static final ed0 a = new ed0();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, g80 g80Var, j70 j70Var, gv0 gv0Var, aq0 aq0Var, float f, float f2, vf vfVar, int i, int i2) {
        j70 j70Var2;
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        j70 j70Var3;
        float f6;
        float f7;
        ms0 ms0VarP;
        int i5;
        ep epVar;
        int i6;
        ms0 ms0VarP2;
        float f8;
        float f9;
        hi0 hi0VarS;
        vfVar.aw(1035477640);
        int i7 = (vfVar.g(z) ? 4 : 2) | i | (vfVar.g(false) ? 32 : 16) | (vfVar.f(g80Var) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                j70Var2 = j70Var;
                i7 |= vfVar.f(j70Var2) ? 2048 : 1024;
            }
            i3 = i7 | (!vfVar.f(gv0Var) ? 16384 : 8192) | (!vfVar.f(aq0Var) ? 131072 : 65536);
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = vfVar.c(f3) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    f3 = f;
                }
                i3 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i10 = vfVar.c(f4) ? 8388608 : 4194304;
                    i3 |= i10;
                } else {
                    f4 = f2;
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            if ((38347923 & i3) == 38347922 || !vfVar.z()) {
                vfVar.as();
                if ((i & 1) != 0 || vfVar.x()) {
                    j70 j70Var4 = i8 == 0 ? g70.a : j70Var2;
                    if ((i2 & 64) == 0) {
                        i3 &= -3670017;
                        f5 = e;
                    } else {
                        f5 = f3;
                    }
                    if ((i2 & 128) == 0) {
                        j70 j70Var5 = j70Var4;
                        i4 = i3 & (-29360129);
                        j70Var3 = j70Var5;
                        f6 = f5;
                        f7 = d;
                        vfVar.r();
                        boolean zBooleanValue = ((Boolean) i60.v(g80Var, vfVar, (i4 >> 6) & 14).getValue()).booleanValue();
                        float f10 = qv0.b;
                        long j = z ? gv0Var.n : zBooleanValue ? gv0Var.l : gv0Var.m;
                        if (z) {
                            vfVar.av(1023165505);
                            ms0VarP = bo0.p(new qc(j), vfVar);
                            vfVar.q(false);
                        } else {
                            vfVar.av(1023053998);
                            ms0VarP = oq0.a(j, f00.ak(150, 6, null), vfVar);
                            vfVar.q(false);
                        }
                        ms0 ms0Var = ms0VarP;
                        if (z) {
                            i5 = 6;
                            epVar = null;
                            i6 = 150;
                            vfVar.av(1023478388);
                            ms0VarP2 = bo0.p(new mn(f7), vfVar);
                            vfVar.q(false);
                        } else {
                            vfVar.av(1023269417);
                            float f11 = zBooleanValue ? f6 : f7;
                            yy0 yy0VarAk = f00.ak(150, 6, null);
                            int i11 = l5.a;
                            epVar = null;
                            i6 = 150;
                            i5 = 6;
                            ms0VarP2 = l5.a(new mn(f11), k01.c, yy0VarAk, "DpAnimation", vfVar, 384);
                            vfVar.q(false);
                        }
                        w80 w80VarP = bo0.p(new l8(((mn) ms0VarP2.getValue()).d, new vr0(((qc) ms0Var.getValue()).a)), vfVar);
                        ms0 ms0VarA = oq0.a(z ? gv0Var.g : zBooleanValue ? gv0Var.e : gv0Var.f, f00.ak(i6, i5, epVar), vfVar);
                        l8 l8Var = (l8) w80VarP.getValue();
                        m8.a(a.b(j70Var3.c(new BorderModifierNodeElement(l8Var.a, l8Var.b, aq0Var)), new a2(22, aq0Var, new jv0(new w40(ms0VarA, ms0.class, "value", "getValue()Ljava/lang/Object;", 0, 1)))), vfVar, 0);
                        f8 = f6;
                        f9 = f7;
                    } else {
                        j70 j70Var6 = j70Var4;
                        i4 = i3;
                        j70Var3 = j70Var6;
                        f6 = f5;
                    }
                } else {
                    vfVar.aq();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    i4 = i3;
                    j70Var3 = j70Var2;
                    f6 = f3;
                }
                f7 = f4;
                vfVar.r();
                boolean zBooleanValue2 = ((Boolean) i60.v(g80Var, vfVar, (i4 >> 6) & 14).getValue()).booleanValue();
                float f102 = qv0.b;
                if (z) {
                }
                if (z) {
                }
                ms0 ms0Var2 = ms0VarP;
                if (z) {
                }
                w80 w80VarP2 = bo0.p(new l8(((mn) ms0VarP2.getValue()).d, new vr0(((qc) ms0Var2.getValue()).a)), vfVar);
                ms0 ms0VarA2 = oq0.a(z ? gv0Var.g : zBooleanValue2 ? gv0Var.e : gv0Var.f, f00.ak(i6, i5, epVar), vfVar);
                l8 l8Var2 = (l8) w80VarP2.getValue();
                m8.a(a.b(j70Var3.c(new BorderModifierNodeElement(l8Var2.a, l8Var2.b, aq0Var)), new a2(22, aq0Var, new jv0(new w40(ms0VarA2, ms0.class, "value", "getValue()Ljava/lang/Object;", 0, 1)))), vfVar, 0);
                f8 = f6;
                f9 = f7;
            } else {
                vfVar.aq();
                j70Var3 = j70Var2;
                f8 = f3;
                f9 = f4;
            }
            hi0VarS = vfVar.s();
            if (hi0VarS == null) {
                hi0VarS.d = new cd0(this, z, g80Var, j70Var3, gv0Var, aq0Var, f8, f9, i, i2);
                return;
            }
            return;
        }
        i7 |= 3072;
        j70Var2 = j70Var;
        i3 = i7 | (!vfVar.f(gv0Var) ? 16384 : 8192) | (!vfVar.f(aq0Var) ? 131072 : 65536);
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
            vfVar.as();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
            }
        }
        hi0VarS = vfVar.s();
        if (hi0VarS == null) {
        }
    }

    public final void b(String str, gv gvVar, boolean z, boolean z2, g11 g11Var, g80 g80Var, gv gvVar2, gv0 gv0Var, wd0 wd0Var, te teVar, vf vfVar, int i) {
        String str2;
        int i2;
        gv gvVar3;
        boolean z3;
        boolean z4;
        g11 g11Var2;
        int i3;
        gv gvVar4;
        wd0 wd0Var2;
        int i4;
        wd0 wd0Var3;
        vfVar.aw(-350442135);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (vfVar.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gvVar3 = gvVar;
            i2 |= vfVar.h(gvVar3) ? 32 : 16;
        } else {
            gvVar3 = gvVar;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= vfVar.g(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= vfVar.g(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            g11Var2 = g11Var;
            i2 |= vfVar.f(g11Var2) ? 16384 : 8192;
        } else {
            g11Var2 = g11Var;
        }
        if ((i & 196608) == 0) {
            i2 |= vfVar.f(g80Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= vfVar.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 = 12582912;
            gvVar4 = gvVar2;
            i2 |= vfVar.h(gvVar4) ? 8388608 : 4194304;
        } else {
            i3 = 12582912;
            gvVar4 = gvVar2;
        }
        if ((i & 100663296) == 0) {
            i2 |= vfVar.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= vfVar.h(null) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (vfVar.h(null) ? 4 : 2) | (vfVar.h(null) ? 32 : 16) | (vfVar.h(null) ? 256 : 128) | (vfVar.h(null) ? 2048 : 1024) | (vfVar.f(gv0Var) ? 16384 : 8192) | 65536;
        if ((306783379 & i2) == 306783378 && (4793491 & i5) == 4793490 && vfVar.z()) {
            vfVar.aq();
            wd0Var3 = wd0Var;
        } else {
            vfVar.as();
            if ((i & 1) == 0 || vfVar.x()) {
                float f = qv0.b;
                wd0Var2 = new wd0(f, f, f, f);
                i4 = i5 & (-458753);
            } else {
                vfVar.aq();
                i4 = i5 & (-458753);
                wd0Var2 = wd0Var;
            }
            vfVar.r();
            int i6 = i2 << 3;
            int i7 = i2 >> 3;
            int i8 = i2 >> 9;
            int i9 = i4 << 21;
            int i10 = ((i4 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i8 & 7168) | (i7 & 57344) | ((i4 << 6) & 3670016) | i3;
            boolean z5 = z3;
            wd0 wd0Var4 = wd0Var2;
            qv0.a(str2, gvVar3, g11Var2, gvVar4, z4, z5, g80Var, wd0Var4, gv0Var, teVar, vfVar, (i6 & 896) | (i6 & 112) | 6 | (i7 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), i10);
            wd0Var3 = wd0Var4;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new dd0(this, str, gvVar, z, z2, g11Var, g80Var, gvVar2, gv0Var, wd0Var3, teVar, i);
        }
    }
}
