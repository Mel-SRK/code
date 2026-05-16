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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r37, defpackage.gv r38, defpackage.g11 r39, defpackage.gv r40, boolean r41, boolean r42, defpackage.g80 r43, defpackage.wd0 r44, defpackage.gv0 r45, defpackage.te r46, defpackage.vf r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv0.a(java.lang.String, gv, g11, gv, boolean, boolean, g80, wd0, gv0, te, vf, int, int):void");
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
