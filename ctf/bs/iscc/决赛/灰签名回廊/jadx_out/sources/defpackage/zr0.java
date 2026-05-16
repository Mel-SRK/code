package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zr0 {
    public static final long a = bo0.j(14);
    public static final long b = bo0.j(0);
    public static final long c = qc.f;
    public static final nw0 d;

    static {
        long j = qc.b;
        d = j != 16 ? new hd(j) : mw0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yr0 a(defpackage.yr0 r24, long r25, defpackage.i9 r27, float r28, long r29, defpackage.iu r31, defpackage.gu r32, defpackage.hu r33, defpackage.fu0 r34, java.lang.String r35, long r36, defpackage.t7 r38, defpackage.ow0 r39, defpackage.t40 r40, long r41, defpackage.bv0 r43, defpackage.yp0 r44, defpackage.cg0 r45, defpackage.yo r46) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.a(yr0, long, i9, float, long, iu, gu, hu, fu0, java.lang.String, long, t7, ow0, t40, long, bv0, yp0, cg0, yo):yr0");
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(float f, long j, long j2) {
        rx0[] rx0VarArr = qx0.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    uy.a("Cannot perform operation for Unspecified type.");
                }
                if (!rx0.a(qx0.b(j), qx0.b(j2))) {
                    uy.a("Cannot perform operation for " + ((Object) rx0.b(qx0.b(j))) + " and " + ((Object) rx0.b(qx0.b(j2))));
                }
                return bo0.o(j3, m10.ai(qx0.c(j), qx0.c(j2), f));
            }
        }
        return ((qx0) b(new qx0(j), new qx0(j2), f)).a;
    }
}
