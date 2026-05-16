package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class qv0 {
    public static final float b;
    public static final float g;
    public static final float h;
    public static final j70 i;
    public static final long a = eh.a(0, 0, 0, 0);
    public static final float c = 12;
    public static final float d = 4;
    public static final float e = 2;
    public static final float f = 24;

    static {
        float f2 = 16;
        b = f2;
        g = f2;
        h = f2;
        float f3 = 48;
        i = b.a(g70.a, f3, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x042a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, gv gvVar, g11 g11Var, gv gvVar2, boolean z, boolean z2, g80 g80Var, wd0 wd0Var, gv0 gv0Var, te teVar, vf vfVar, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        me0 me0Var;
        float f2;
        int iOrdinal;
        float f3;
        int iOrdinal2;
        float f4;
        int iOrdinal3;
        float f5;
        int iOrdinal4;
        float f6;
        int iOrdinal5;
        dd ddVarF;
        boolean zF;
        Object objAk;
        dd ddVarF2;
        boolean zF2;
        Object objAk2;
        float f7;
        te teVarAq;
        Object objAk3;
        Object objAk4;
        Object objAk5;
        w80 w80Var;
        boolean zC;
        Object objAk6;
        vf vfVar2;
        vfVar.aw(1514469103);
        if ((i2 & 6) == 0) {
            i4 = (vfVar.f(kw0.d) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vfVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= vfVar.h(gvVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj = g11Var;
            i4 |= vfVar.f(obj) ? 2048 : 1024;
        } else {
            obj = g11Var;
        }
        if ((i2 & 24576) == 0) {
            i4 |= vfVar.h(gvVar2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= vfVar.h(null) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= vfVar.h(null) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= vfVar.h(null) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= vfVar.h(null) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= vfVar.h(null) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (vfVar.h(null) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= vfVar.g(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= vfVar.g(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= vfVar.g(false) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= vfVar.f(g80Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= vfVar.f(wd0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= vfVar.f(gv0Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= vfVar.h(teVar) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if ((306783379 & i4) == 306783378 && (i6 & 4793491) == 4793490 && vfVar.z()) {
            vfVar.aq();
            vfVar2 = vfVar;
        } else {
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object objAk7 = vfVar.ak();
            n31 n31Var = nf.a;
            if (z3 || objAk7 == n31Var) {
                b6 b6Var = new b6(str, null, 6);
                obj.getClass();
                jy0 jy0Var = new jy0(b6Var, za0.a);
                vfVar.be(jy0Var);
                objAk7 = jy0Var;
            }
            String str2 = ((jy0) objAk7).a.e;
            boolean zBooleanValue = ((Boolean) i60.v(g80Var, vfVar, (i6 >> 12) & 14).getValue()).booleanValue();
            hz hzVar = zBooleanValue ? hz.d : str2.length() == 0 ? hz.e : hz.f;
            long j = !z2 ? gv0Var.z : zBooleanValue ? gv0Var.x : gv0Var.y;
            pz0 pz0Var = (pz0) vfVar.j(qz0.a);
            nx0 nx0Var = pz0Var.j;
            nx0 nx0Var2 = pz0Var.l;
            int i7 = i4;
            long jB = nx0Var.b();
            long j2 = qc.g;
            boolean z4 = (qc.c(jB, j2) && !qc.c(nx0Var2.b(), j2)) || (!qc.c(nx0Var.b(), j2) && qc.c(nx0Var2.b(), j2));
            long jB2 = nx0Var2.b();
            if (z4 && jB2 == 16) {
                jB2 = j;
            }
            long jB3 = nx0Var.b();
            long j3 = (z4 && jB3 == 16) ? j : jB3;
            boolean z5 = gvVar2 != null;
            int i8 = oy0.a;
            Object objAk8 = vfVar.ak();
            if (objAk8 == n31Var) {
                objAk8 = new ny0(hzVar);
                vfVar.be(objAk8);
            }
            ny0 ny0Var = (ny0) objAk8;
            long j4 = jB2;
            ny0Var.a(hzVar, vfVar, 48);
            me0 me0Var2 = ny0Var.c;
            me0 me0Var3 = ny0Var.b;
            Object objAk9 = vfVar.ak();
            if (objAk9 == n31Var) {
                me0Var = me0Var2;
                objAk9 = new gw0(1, ny0Var);
                vfVar.be(objAk9);
            } else {
                me0Var = me0Var2;
            }
            pk.b(ny0Var, (cv) objAk9, vfVar);
            zy0 zy0Var = k01.a;
            hz hzVar2 = (hz) ny0Var.c();
            vfVar.av(-2036730335);
            int iOrdinal6 = hzVar2.ordinal();
            float f8 = 0.0f;
            if (iOrdinal6 == 0) {
                f2 = 1.0f;
                vfVar.q(false);
                Float fValueOf = Float.valueOf(f2);
                hz hzVar3 = (hz) me0Var3.getValue();
                vfVar.av(-2036730335);
                iOrdinal = hzVar3.ordinal();
                if (iOrdinal == 0) {
                    f3 = 1.0f;
                    vfVar.q(false);
                    Float fValueOf2 = Float.valueOf(f3);
                    vfVar.av(1276209157);
                    yy0 yy0VarAk = f00.ak(150, 6, null);
                    vfVar.q(false);
                    my0 my0VarA = oy0.a(ny0Var, fValueOf, fValueOf2, yy0VarAk, zy0Var, vfVar);
                    p2 p2Var = p2.g;
                    hz hzVar4 = (hz) ny0Var.c();
                    vfVar.av(1435837472);
                    iOrdinal2 = hzVar4.ordinal();
                    if (iOrdinal2 == 0) {
                        f4 = 1.0f;
                        vfVar.q(false);
                        Float fValueOf3 = Float.valueOf(f4);
                        hz hzVar5 = (hz) me0Var3.getValue();
                        vfVar.av(1435837472);
                        iOrdinal3 = hzVar5.ordinal();
                        if (iOrdinal3 == 0) {
                            f5 = 1.0f;
                            vfVar.q(false);
                            my0 my0VarA2 = oy0.a(ny0Var, fValueOf3, Float.valueOf(f5), (nr) p2Var.c((ly0) me0Var.getValue(), vfVar, 0), zy0Var, vfVar);
                            hz hzVar6 = (hz) ny0Var.c();
                            vfVar.av(1128033978);
                            iOrdinal4 = hzVar6.ordinal();
                            if (iOrdinal4 == 0) {
                                f6 = 1.0f;
                                vfVar.q(false);
                                Float fValueOf4 = Float.valueOf(f6);
                                hz hzVar7 = (hz) me0Var3.getValue();
                                vfVar.av(1128033978);
                                iOrdinal5 = hzVar7.ordinal();
                                if (iOrdinal5 == 0) {
                                    f8 = 1.0f;
                                    vfVar.q(false);
                                    Float fValueOf5 = Float.valueOf(f8);
                                    vfVar.av(-1868044898);
                                    yy0 yy0VarAk2 = f00.ak(150, 6, null);
                                    vfVar.q(false);
                                    my0 my0VarA3 = oy0.a(ny0Var, fValueOf4, fValueOf5, yy0VarAk2, zy0Var, vfVar);
                                    hz hzVar8 = (hz) me0Var3.getValue();
                                    vfVar.av(-107432127);
                                    int[] iArr = pv0.a;
                                    long j5 = iArr[hzVar8.ordinal()] == 1 ? j4 : j3;
                                    vfVar.q(false);
                                    ddVarF = qc.f(j5);
                                    zF = vfVar.f(ddVarF);
                                    objAk = vfVar.ak();
                                    if (zF || objAk == n31Var) {
                                        zy0 zy0Var2 = new zy0(q0.u, new l1(8, ddVarF));
                                        vfVar.be(zy0Var2);
                                        objAk = zy0Var2;
                                    }
                                    zy0 zy0Var3 = (zy0) objAk;
                                    hz hzVar9 = (hz) ny0Var.c();
                                    vfVar.av(-107432127);
                                    long j6 = iArr[hzVar9.ordinal()] != 1 ? j4 : j3;
                                    vfVar.q(false);
                                    qc qcVar = new qc(j6);
                                    hz hzVar10 = (hz) me0Var3.getValue();
                                    vfVar.av(-107432127);
                                    long j7 = iArr[hzVar10.ordinal()] != 1 ? j4 : j3;
                                    vfVar.q(false);
                                    qc qcVar2 = new qc(j7);
                                    vfVar.av(1528582156);
                                    boolean z6 = z4;
                                    yy0 yy0VarAk3 = f00.ak(150, 6, null);
                                    vfVar.q(false);
                                    my0 my0VarA4 = oy0.a(ny0Var, qcVar, qcVar2, yy0VarAk3, zy0Var3, vfVar);
                                    vfVar.av(1023351670);
                                    vfVar.q(false);
                                    ddVarF2 = qc.f(j);
                                    zF2 = vfVar.f(ddVarF2);
                                    objAk2 = vfVar.ak();
                                    if (!zF2 || objAk2 == n31Var) {
                                        zy0 zy0Var4 = new zy0(q0.u, new l1(8, ddVarF2));
                                        vfVar.be(zy0Var4);
                                        objAk2 = zy0Var4;
                                    }
                                    vfVar.av(1023351670);
                                    vfVar.q(false);
                                    qc qcVar3 = new qc(j);
                                    vfVar.av(1023351670);
                                    vfVar.q(false);
                                    qc qcVar4 = new qc(j);
                                    vfVar.av(-543659263);
                                    yy0 yy0VarAk4 = f00.ak(150, 6, null);
                                    vfVar.q(false);
                                    my0 my0VarA5 = oy0.a(ny0Var, qcVar3, qcVar4, yy0VarAk4, (zy0) objAk2, vfVar);
                                    float fFloatValue = ((Number) my0VarA.k.getValue()).floatValue();
                                    vfVar.av(-156998101);
                                    if (gvVar2 != null) {
                                        f7 = fFloatValue;
                                        teVarAq = null;
                                    } else {
                                        f7 = fFloatValue;
                                        teVarAq = t1.aq(-1236585568, new nv0(nx0Var, nx0Var2, f7, my0VarA5, gvVar2, z6, my0VarA4), vfVar);
                                    }
                                    vfVar.q(false);
                                    objAk3 = vfVar.ak();
                                    if (objAk3 == n31Var) {
                                        ko0 ko0Var = new ko0(my0VarA2, 2);
                                        bw bwVar = bw.au;
                                        o6 o6Var = lr0.a;
                                        km kmVar = new km(ko0Var, bwVar);
                                        vfVar.be(kmVar);
                                        objAk3 = kmVar;
                                    }
                                    vfVar.av(-156965270);
                                    vfVar.q(false);
                                    objAk4 = vfVar.ak();
                                    if (objAk4 == n31Var) {
                                        ko0 ko0Var2 = new ko0(my0VarA3, 3);
                                        bw bwVar2 = bw.au;
                                        o6 o6Var2 = lr0.a;
                                        km kmVar2 = new km(ko0Var2, bwVar2);
                                        vfVar.be(kmVar2);
                                        objAk4 = kmVar2;
                                    }
                                    vfVar.av(-156940524);
                                    vfVar.q(false);
                                    vfVar.av(-156921964);
                                    vfVar.q(false);
                                    vfVar.av(-156902962);
                                    vfVar.q(false);
                                    vfVar.av(-156893937);
                                    vfVar.q(false);
                                    vfVar.av(-156884470);
                                    vfVar.q(false);
                                    vfVar.av(-567018607);
                                    objAk5 = vfVar.ak();
                                    if (objAk5 == n31Var) {
                                        objAk5 = bo0.m(new pq0(0L));
                                        vfVar.be(objAk5);
                                    }
                                    w80Var = (w80) objAk5;
                                    te teVarAq2 = t1.aq(157291737, new hj(w80Var, wd0Var, teVar, 2), vfVar);
                                    zC = vfVar.c(f7);
                                    objAk6 = vfVar.ak();
                                    if (!zC || objAk6 == n31Var) {
                                        objAk6 = new lv0(f7, w80Var);
                                        vfVar.be(objAk6);
                                    }
                                    ld0.b(gvVar, null, teVarAq, null, null, null, null, z, f7, (cv) objAk6, teVarAq2, null, wd0Var, vfVar, ((i7 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                                    vfVar2 = vfVar;
                                    vfVar2.q(false);
                                } else {
                                    if (iOrdinal5 == 1) {
                                        if (!z5) {
                                        }
                                        vfVar.q(false);
                                        Float fValueOf52 = Float.valueOf(f8);
                                        vfVar.av(-1868044898);
                                        yy0 yy0VarAk22 = f00.ak(150, 6, null);
                                        vfVar.q(false);
                                        my0 my0VarA32 = oy0.a(ny0Var, fValueOf4, fValueOf52, yy0VarAk22, zy0Var, vfVar);
                                        hz hzVar82 = (hz) me0Var3.getValue();
                                        vfVar.av(-107432127);
                                        int[] iArr2 = pv0.a;
                                        if (iArr2[hzVar82.ordinal()] == 1) {
                                        }
                                        vfVar.q(false);
                                        ddVarF = qc.f(j5);
                                        zF = vfVar.f(ddVarF);
                                        objAk = vfVar.ak();
                                        if (zF) {
                                            zy0 zy0Var22 = new zy0(q0.u, new l1(8, ddVarF));
                                            vfVar.be(zy0Var22);
                                            objAk = zy0Var22;
                                            zy0 zy0Var32 = (zy0) objAk;
                                            hz hzVar92 = (hz) ny0Var.c();
                                            vfVar.av(-107432127);
                                            if (iArr2[hzVar92.ordinal()] != 1) {
                                            }
                                            vfVar.q(false);
                                            qc qcVar5 = new qc(j6);
                                            hz hzVar102 = (hz) me0Var3.getValue();
                                            vfVar.av(-107432127);
                                            if (iArr2[hzVar102.ordinal()] != 1) {
                                            }
                                            vfVar.q(false);
                                            qc qcVar22 = new qc(j7);
                                            vfVar.av(1528582156);
                                            boolean z62 = z4;
                                            yy0 yy0VarAk32 = f00.ak(150, 6, null);
                                            vfVar.q(false);
                                            my0 my0VarA42 = oy0.a(ny0Var, qcVar5, qcVar22, yy0VarAk32, zy0Var32, vfVar);
                                            vfVar.av(1023351670);
                                            vfVar.q(false);
                                            ddVarF2 = qc.f(j);
                                            zF2 = vfVar.f(ddVarF2);
                                            objAk2 = vfVar.ak();
                                            if (!zF2) {
                                                zy0 zy0Var42 = new zy0(q0.u, new l1(8, ddVarF2));
                                                vfVar.be(zy0Var42);
                                                objAk2 = zy0Var42;
                                                vfVar.av(1023351670);
                                                vfVar.q(false);
                                                qc qcVar32 = new qc(j);
                                                vfVar.av(1023351670);
                                                vfVar.q(false);
                                                qc qcVar42 = new qc(j);
                                                vfVar.av(-543659263);
                                                yy0 yy0VarAk42 = f00.ak(150, 6, null);
                                                vfVar.q(false);
                                                my0 my0VarA52 = oy0.a(ny0Var, qcVar32, qcVar42, yy0VarAk42, (zy0) objAk2, vfVar);
                                                float fFloatValue2 = ((Number) my0VarA.k.getValue()).floatValue();
                                                vfVar.av(-156998101);
                                                if (gvVar2 != null) {
                                                }
                                                vfVar.q(false);
                                                objAk3 = vfVar.ak();
                                                if (objAk3 == n31Var) {
                                                }
                                                vfVar.av(-156965270);
                                                vfVar.q(false);
                                                objAk4 = vfVar.ak();
                                                if (objAk4 == n31Var) {
                                                }
                                                vfVar.av(-156940524);
                                                vfVar.q(false);
                                                vfVar.av(-156921964);
                                                vfVar.q(false);
                                                vfVar.av(-156902962);
                                                vfVar.q(false);
                                                vfVar.av(-156893937);
                                                vfVar.q(false);
                                                vfVar.av(-156884470);
                                                vfVar.q(false);
                                                vfVar.av(-567018607);
                                                objAk5 = vfVar.ak();
                                                if (objAk5 == n31Var) {
                                                }
                                                w80Var = (w80) objAk5;
                                                te teVarAq22 = t1.aq(157291737, new hj(w80Var, wd0Var, teVar, 2), vfVar);
                                                zC = vfVar.c(f7);
                                                objAk6 = vfVar.ak();
                                                if (!zC) {
                                                    objAk6 = new lv0(f7, w80Var);
                                                    vfVar.be(objAk6);
                                                    ld0.b(gvVar, null, teVarAq, null, null, null, null, z, f7, (cv) objAk6, teVarAq22, null, wd0Var, vfVar, ((i7 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                                                    vfVar2 = vfVar;
                                                    vfVar2.q(false);
                                                }
                                            }
                                        }
                                    } else if (iOrdinal5 != 2) {
                                        wc.l();
                                        return;
                                    }
                                    f8 = 1.0f;
                                    vfVar.q(false);
                                    Float fValueOf522 = Float.valueOf(f8);
                                    vfVar.av(-1868044898);
                                    yy0 yy0VarAk222 = f00.ak(150, 6, null);
                                    vfVar.q(false);
                                    my0 my0VarA322 = oy0.a(ny0Var, fValueOf4, fValueOf522, yy0VarAk222, zy0Var, vfVar);
                                    hz hzVar822 = (hz) me0Var3.getValue();
                                    vfVar.av(-107432127);
                                    int[] iArr22 = pv0.a;
                                    if (iArr22[hzVar822.ordinal()] == 1) {
                                    }
                                    vfVar.q(false);
                                    ddVarF = qc.f(j5);
                                    zF = vfVar.f(ddVarF);
                                    objAk = vfVar.ak();
                                    if (zF) {
                                    }
                                }
                            } else {
                                if (iOrdinal4 == 1) {
                                    if (z5) {
                                        f6 = 0.0f;
                                    }
                                    vfVar.q(false);
                                    Float fValueOf42 = Float.valueOf(f6);
                                    hz hzVar72 = (hz) me0Var3.getValue();
                                    vfVar.av(1128033978);
                                    iOrdinal5 = hzVar72.ordinal();
                                    if (iOrdinal5 == 0) {
                                    }
                                } else if (iOrdinal4 != 2) {
                                    wc.l();
                                    return;
                                }
                                f6 = 1.0f;
                                vfVar.q(false);
                                Float fValueOf422 = Float.valueOf(f6);
                                hz hzVar722 = (hz) me0Var3.getValue();
                                vfVar.av(1128033978);
                                iOrdinal5 = hzVar722.ordinal();
                                if (iOrdinal5 == 0) {
                                }
                            }
                        } else {
                            if (iOrdinal3 == 1) {
                                if (z5) {
                                }
                                vfVar.q(false);
                                my0 my0VarA22 = oy0.a(ny0Var, fValueOf3, Float.valueOf(f5), (nr) p2Var.c((ly0) me0Var.getValue(), vfVar, 0), zy0Var, vfVar);
                                hz hzVar62 = (hz) ny0Var.c();
                                vfVar.av(1128033978);
                                iOrdinal4 = hzVar62.ordinal();
                                if (iOrdinal4 == 0) {
                                }
                            } else if (iOrdinal3 != 2) {
                                wc.l();
                                return;
                            }
                            f5 = 0.0f;
                            vfVar.q(false);
                            my0 my0VarA222 = oy0.a(ny0Var, fValueOf3, Float.valueOf(f5), (nr) p2Var.c((ly0) me0Var.getValue(), vfVar, 0), zy0Var, vfVar);
                            hz hzVar622 = (hz) ny0Var.c();
                            vfVar.av(1128033978);
                            iOrdinal4 = hzVar622.ordinal();
                            if (iOrdinal4 == 0) {
                            }
                        }
                    } else {
                        if (iOrdinal2 == 1) {
                            if (z5) {
                            }
                            vfVar.q(false);
                            Float fValueOf32 = Float.valueOf(f4);
                            hz hzVar52 = (hz) me0Var3.getValue();
                            vfVar.av(1435837472);
                            iOrdinal3 = hzVar52.ordinal();
                            if (iOrdinal3 == 0) {
                            }
                        } else if (iOrdinal2 != 2) {
                            wc.l();
                            return;
                        }
                        f4 = 0.0f;
                        vfVar.q(false);
                        Float fValueOf322 = Float.valueOf(f4);
                        hz hzVar522 = (hz) me0Var3.getValue();
                        vfVar.av(1435837472);
                        iOrdinal3 = hzVar522.ordinal();
                        if (iOrdinal3 == 0) {
                        }
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wc.l();
                        return;
                    }
                    f3 = 1.0f;
                    vfVar.q(false);
                    Float fValueOf22 = Float.valueOf(f3);
                    vfVar.av(1276209157);
                    yy0 yy0VarAk5 = f00.ak(150, 6, null);
                    vfVar.q(false);
                    my0 my0VarA6 = oy0.a(ny0Var, fValueOf, fValueOf22, yy0VarAk5, zy0Var, vfVar);
                    p2 p2Var2 = p2.g;
                    hz hzVar42 = (hz) ny0Var.c();
                    vfVar.av(1435837472);
                    iOrdinal2 = hzVar42.ordinal();
                    if (iOrdinal2 == 0) {
                    }
                } else {
                    f3 = 0.0f;
                    vfVar.q(false);
                    Float fValueOf222 = Float.valueOf(f3);
                    vfVar.av(1276209157);
                    yy0 yy0VarAk52 = f00.ak(150, 6, null);
                    vfVar.q(false);
                    my0 my0VarA62 = oy0.a(ny0Var, fValueOf, fValueOf222, yy0VarAk52, zy0Var, vfVar);
                    p2 p2Var22 = p2.g;
                    hz hzVar422 = (hz) ny0Var.c();
                    vfVar.av(1435837472);
                    iOrdinal2 = hzVar422.ordinal();
                    if (iOrdinal2 == 0) {
                    }
                }
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    wc.l();
                    return;
                }
                f2 = 1.0f;
                vfVar.q(false);
                Float fValueOf6 = Float.valueOf(f2);
                hz hzVar32 = (hz) me0Var3.getValue();
                vfVar.av(-2036730335);
                iOrdinal = hzVar32.ordinal();
                if (iOrdinal == 0) {
                }
            } else {
                f2 = 0.0f;
                vfVar.q(false);
                Float fValueOf62 = Float.valueOf(f2);
                hz hzVar322 = (hz) me0Var3.getValue();
                vfVar.av(-2036730335);
                iOrdinal = hzVar322.ordinal();
                if (iOrdinal == 0) {
                }
            }
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new ov0(str, gvVar, g11Var, gvVar2, z, z2, g80Var, wd0Var, gv0Var, teVar, i2, i3);
        }
    }

    public static final void b(long j, nx0 nx0Var, gv gvVar, vf vfVar, int i2) {
        int i3;
        vf vfVar2;
        long j2;
        nx0 nx0Var2;
        gv gvVar2;
        vfVar.aw(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.e(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.f(nx0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vfVar.h(gvVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
            j2 = j;
            nx0Var2 = nx0Var;
            gvVar2 = gvVar;
            vfVar2 = vfVar;
        } else {
            vfVar2 = vfVar;
            m10.f(j, nx0Var, gvVar, vfVar2, i3 & 1022);
            j2 = j;
            nx0Var2 = nx0Var;
            gvVar2 = gvVar;
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new bi0(j2, nx0Var2, gvVar2, i2, 1);
        }
    }

    public static final Object c(k60 k60Var) {
        Object objJ = k60Var.j();
        h20 h20Var = objJ instanceof h20 ? (h20) objJ : null;
        if (h20Var != null) {
            return h20Var.r;
        }
        return null;
    }
}
