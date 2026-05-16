package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class tx0 {
    public static final zc a = cd.c(sc.a, 0, 0, 0, 0, sc.b, 0, 0, 0, sc.c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);
    public static final zc b = cd.e(sc.d, 0, 0, 0, 0, sc.e, 0, 0, 0, sc.f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    public static final void a(boolean z, boolean z2, vf vfVar, final int i) {
        final boolean z3;
        final boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        zc zcVarC;
        int i2;
        zc zcVarE;
        vfVar.aw(-1823216999);
        int i3 = i | 50;
        boolean z8 = true;
        if (vfVar.an(i3 & 1, (i3 & 147) != 146)) {
            vfVar.as();
            if ((i & 1) == 0 || vfVar.x()) {
                z5 = (((Configuration) vfVar.j(d2.a)).uiMode & 48) == 32;
            } else {
                vfVar.aq();
                z5 = z;
                z8 = z2;
            }
            vfVar.r();
            if (!z8 || (i2 = Build.VERSION.SDK_INT) < 31) {
                z6 = z5;
                z7 = z8;
                if (z6) {
                    vfVar.av(235136040);
                    vfVar.q(false);
                    zcVarC = a;
                } else {
                    vfVar.av(235137065);
                    vfVar.q(false);
                    zcVarC = b;
                }
            } else {
                vfVar.av(-1300889586);
                Context context = (Context) vfVar.j(d2.b);
                yc ycVar = yc.a;
                if (!z5) {
                    z6 = z5;
                    z7 = z8;
                    if (i2 >= 34) {
                        zcVarE = cd.e(ycVar.a(context, R.color.system_primary_light), ycVar.a(context, R.color.system_on_primary_light), ycVar.a(context, R.color.system_primary_container_light), ycVar.a(context, R.color.system_on_primary_container_light), ycVar.a(context, R.color.system_primary_dark), ycVar.a(context, R.color.system_secondary_light), ycVar.a(context, R.color.system_on_secondary_light), ycVar.a(context, R.color.system_secondary_container_light), ycVar.a(context, R.color.system_on_secondary_container_light), ycVar.a(context, R.color.system_tertiary_light), ycVar.a(context, R.color.system_on_tertiary_light), ycVar.a(context, R.color.system_tertiary_container_light), ycVar.a(context, R.color.system_on_tertiary_container_light), ycVar.a(context, R.color.system_background_light), ycVar.a(context, R.color.system_on_background_light), ycVar.a(context, R.color.system_surface_light), ycVar.a(context, R.color.system_on_surface_light), ycVar.a(context, R.color.system_surface_variant_light), ycVar.a(context, R.color.system_on_surface_variant_light), ycVar.a(context, R.color.system_primary_light), ycVar.a(context, R.color.system_surface_dark), ycVar.a(context, R.color.system_on_surface_dark), ycVar.a(context, R.color.system_outline_light), ycVar.a(context, R.color.system_outline_variant_light), 0L, ycVar.a(context, R.color.system_surface_bright_light), ycVar.a(context, R.color.system_surface_container_light), ycVar.a(context, R.color.system_surface_container_high_light), ycVar.a(context, R.color.system_surface_container_highest_light), ycVar.a(context, R.color.system_surface_container_low_light), ycVar.a(context, R.color.system_surface_container_lowest_light), ycVar.a(context, R.color.system_surface_dim_light), 331350016, 0);
                    } else {
                        cy0 cy0VarV = pk.v(context);
                        long j = cy0VarV.y;
                        long j2 = cy0VarV.v;
                        long j3 = cy0VarV.w;
                        long j4 = cy0VarV.ab;
                        long j5 = cy0VarV.x;
                        long j6 = cy0VarV.af;
                        long j7 = cy0VarV.ac;
                        long j8 = cy0VarV.ad;
                        long j9 = cy0VarV.ai;
                        long j10 = cy0VarV.am;
                        long j11 = cy0VarV.aj;
                        long j12 = cy0VarV.ak;
                        long j13 = cy0VarV.ap;
                        long j14 = cy0VarV.b;
                        long j15 = cy0VarV.r;
                        long j16 = cy0VarV.g;
                        zcVarE = cd.e(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, cy0VarV.l, j, cy0VarV.o, cy0VarV.d, cy0VarV.k, cy0VarV.i, cy0VarV.u, j14, cy0VarV.e, cy0VarV.f, j16, cy0VarV.c, cy0VarV.a, cy0VarV.h, 62914560, 0);
                    }
                    zcVarC = zcVarE;
                } else if (i2 >= 34) {
                    zcVarC = cd.c(ycVar.a(context, R.color.system_primary_dark), ycVar.a(context, R.color.system_on_primary_dark), ycVar.a(context, R.color.system_primary_container_dark), ycVar.a(context, R.color.system_on_primary_container_dark), ycVar.a(context, R.color.system_primary_light), ycVar.a(context, R.color.system_secondary_dark), ycVar.a(context, R.color.system_on_secondary_dark), ycVar.a(context, R.color.system_secondary_container_dark), ycVar.a(context, R.color.system_on_secondary_container_dark), ycVar.a(context, R.color.system_tertiary_dark), ycVar.a(context, R.color.system_on_tertiary_dark), ycVar.a(context, R.color.system_tertiary_container_dark), ycVar.a(context, R.color.system_on_tertiary_container_dark), ycVar.a(context, R.color.system_background_dark), ycVar.a(context, R.color.system_on_background_dark), ycVar.a(context, R.color.system_surface_dark), ycVar.a(context, R.color.system_on_surface_dark), ycVar.a(context, R.color.system_surface_variant_dark), ycVar.a(context, R.color.system_on_surface_variant_dark), ycVar.a(context, R.color.system_primary_dark), ycVar.a(context, R.color.system_surface_light), ycVar.a(context, R.color.system_on_surface_light), ycVar.a(context, R.color.system_outline_dark), ycVar.a(context, R.color.system_outline_variant_dark), 0L, ycVar.a(context, R.color.system_surface_bright_dark), ycVar.a(context, R.color.system_surface_container_dark), ycVar.a(context, R.color.system_surface_container_high_dark), ycVar.a(context, R.color.system_surface_container_highest_dark), ycVar.a(context, R.color.system_surface_container_low_dark), ycVar.a(context, R.color.system_surface_container_lowest_dark), ycVar.a(context, R.color.system_surface_dim_dark), 331350016, 0);
                    z6 = z5;
                    z7 = z8;
                } else {
                    cy0 cy0VarV2 = pk.v(context);
                    long j17 = cy0VarV2.x;
                    long j18 = cy0VarV2.aa;
                    long j19 = cy0VarV2.z;
                    long j20 = cy0VarV2.w;
                    z7 = z8;
                    long j21 = cy0VarV2.y;
                    long j22 = cy0VarV2.ae;
                    long j23 = cy0VarV2.ah;
                    long j24 = cy0VarV2.ag;
                    long j25 = cy0VarV2.ad;
                    long j26 = cy0VarV2.al;
                    long j27 = cy0VarV2.ao;
                    long j28 = cy0VarV2.an;
                    long j29 = cy0VarV2.ak;
                    long j30 = cy0VarV2.s;
                    long j31 = cy0VarV2.g;
                    long j32 = cy0VarV2.l;
                    z6 = z5;
                    zcVarC = cd.c(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, cy0VarV2.i, j17, j31, cy0VarV2.o, cy0VarV2.j, j32, cy0VarV2.u, cy0VarV2.m, cy0VarV2.q, cy0VarV2.p, cy0VarV2.n, cy0VarV2.r, cy0VarV2.t, j30, 62914560, 0);
                }
                vfVar.q(false);
            }
            h60.a(zcVarC, null, bz0.a, vfVar, 3456);
            z4 = z7;
            z3 = z6;
        } else {
            vfVar.aq();
            z3 = z;
            z4 = z2;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new gv(i, z3, z4) { // from class: sx0
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;

                {
                    this.d = z3;
                    this.e = z4;
                }

                @Override // defpackage.gv
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iAr = d41.ar(385);
                    tx0.a(this.d, this.e, (vf) obj, iAr);
                    return wz0.a;
                }
            };
        }
    }
}
