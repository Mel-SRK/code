package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class f50 extends x10 implements cv {
    public static final f50 aa;
    public static final f50 ab;
    public static final f50 ac;
    public static final f50 ad;
    public static final f50 ae;
    public static final f50 af;
    public static final f50 ag;
    public static final f50 ah;
    public static final f50 ai;
    public static final f50 f;
    public static final f50 g;
    public static final f50 h;
    public static final f50 i;
    public static final f50 j;
    public static final f50 k;
    public static final f50 l;
    public static final f50 m;
    public static final f50 n;
    public static final f50 o;
    public static final f50 p;
    public static final f50 q;
    public static final f50 r;
    public static final f50 s;
    public static final f50 t;
    public static final f50 u;
    public static final f50 v;
    public static final f50 w;
    public static final f50 x;
    public static final f50 y;
    public static final f50 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new f50(i2, 0);
        g = new f50(i2, 1);
        h = new f50(i2, 2);
        i = new f50(i2, 3);
        j = new f50(i2, 4);
        k = new f50(i2, 5);
        l = new f50(i2, 6);
        m = new f50(i2, 7);
        n = new f50(i2, 8);
        o = new f50(i2, 9);
        p = new f50(i2, 10);
        q = new f50(i2, 11);
        r = new f50(i2, 12);
        s = new f50(i2, 13);
        t = new f50(i2, 14);
        u = new f50(i2, 15);
        v = new f50(i2, 16);
        w = new f50(i2, 17);
        x = new f50(i2, 18);
        y = new f50(i2, 19);
        z = new f50(i2, 20);
        aa = new f50(i2, 21);
        ab = new f50(i2, 22);
        ac = new f50(i2, 23);
        ad = new f50(i2, 24);
        ae = new f50(i2, 25);
        af = new f50(i2, 26);
        ag = new f50(i2, 27);
        ah = new f50(i2, 28);
        ai = new f50(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02ba  */
    @Override // defpackage.cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i2 = this.e;
        wz0 wz0Var = wz0.a;
        switch (i2) {
            case 0:
                nf0 nf0Var = (nf0) obj;
                if (nf0Var.y()) {
                    j50 j50Var = nf0Var.e;
                    if (!j50Var.n) {
                        cv cvVarD = nf0Var.d.d();
                        q80 q80Var = j50Var.q;
                        if (cvVarD != null) {
                            j50Var.bk(nf0Var, 9223372034707292159L, 0L);
                            j50Var.j = cvVarD;
                        } else if (q80Var != null) {
                            Object[] objArr = q80Var.c;
                            long[] jArr = q80Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j2 = jArr[i3];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j2) < 128) {
                                                j50Var.bx((r80) objArr[(i3 << 3) + i5]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 != length) {
                                                i3++;
                                            }
                                        }
                                    }
                                }
                            }
                            q80Var.a();
                        }
                    }
                }
                return wz0Var;
            case 1:
                ((Number) obj).longValue();
                return wz0Var;
            case 2:
                rd0 rd0Var = ((fa0) obj).al;
                if (rd0Var != null) {
                    ((lw) rd0Var).c();
                }
                return wz0Var;
            case 3:
                fa0 fa0Var = (fa0) obj;
                if (fa0Var.y() && fa0Var.d0(true)) {
                    s20 s20Var = fa0Var.r;
                    v20 v20Var = s20Var.ah;
                    if (v20Var.k > 0) {
                        if (v20Var.j || v20Var.i) {
                            s20Var.ao(false);
                        }
                        v20Var.o.bk();
                    }
                    s20Var.ai();
                    b1 b1VarAs = t1.as(s20Var);
                    si0 rectManager = b1VarAs.getRectManager();
                    if (fa0Var == ((fa0) s20Var.ag.h)) {
                        rectManager.g(s20Var, false);
                        rectManager.e(s20Var);
                    } else {
                        rectManager.f(s20Var);
                    }
                    if (s20Var.an > 0) {
                        f1 f1Var = b1VarAs.aq.e;
                        f1Var.getClass();
                        if (s20Var.an > 0) {
                            ((a90) f1Var.e).b(s20Var);
                            s20Var.am = true;
                        }
                        b1VarAs.ac(null);
                    }
                }
                return wz0Var;
            case 4:
                wa0 wa0Var = (wa0) obj;
                if (wa0Var.y()) {
                    wa0Var.d.af();
                }
                return wz0Var;
            case 5:
                return wz0Var;
            case 6:
                s20 s20Var2 = (s20) obj;
                if (s20Var2.ae()) {
                    s20Var2.ao(false);
                }
                return wz0Var;
            case 7:
                s20 s20Var3 = (s20) obj;
                if (s20Var3.ae()) {
                    s20Var3.ao(false);
                }
                return wz0Var;
            case MainActivity.$stable /* 8 */:
                s20 s20Var4 = (s20) obj;
                if (s20Var4.ae()) {
                    s20Var4.am(false);
                }
                return wz0Var;
            case 9:
                s20 s20Var5 = (s20) obj;
                if (s20Var5.ae()) {
                    s20Var5.am(false);
                }
                return wz0Var;
            case 10:
                s20 s20Var6 = (s20) obj;
                if (s20Var6.ae()) {
                    s20.an(s20Var6, false, 7);
                }
                return wz0Var;
            case 11:
                s20 s20Var7 = (s20) obj;
                if (s20Var7.ae()) {
                    s20.ap(s20Var7, false, 7);
                }
                return wz0Var;
            case 12:
                s20 s20Var8 = (s20) obj;
                if (s20Var8.ae()) {
                    s20Var8.ac();
                }
                return wz0Var;
            case 13:
                return wz0Var;
            case 14:
                zg0 zg0Var = (zg0) obj;
                if (zg0Var.isAttachedToWindow()) {
                    zg0Var.l();
                }
                return wz0Var;
            case 15:
                return wz0Var;
            case 16:
                return Integer.valueOf(((sm0) obj).b);
            case 17:
                tz tzVar = ((sm0) obj).c;
                return Integer.valueOf(tzVar.d - tzVar.b);
            case 18:
                return new ym0(((Number) obj).intValue());
            case 19:
                return Boolean.valueOf(!(((pg0) obj).i == 2));
            case 20:
                long j3 = ((xa0) obj).a;
                return d41.ad(j3) ? new t5(xa0.d(j3), xa0.e(j3)) : mo0.a;
            case 21:
                t5 t5Var = (t5) obj;
                return new xa0(d41.h(t5Var.a, t5Var.b));
            case 22:
                return wz0Var;
            case 23:
                i10[] i10VarArr = bp0.a;
                cp0 cp0Var = zo0.l;
                i10 i10Var = bp0.a[5];
                ((po0) obj).d(cp0Var, Boolean.TRUE);
                return wz0Var;
            case 24:
                tv0 tv0Var = (tv0) obj;
                long j4 = tv0Var.f;
                int i6 = hx0.c;
                return new xl(((int) (j4 & 4294967295L)) - go0.g(tv0Var.g.e, (int) (j4 & 4294967295L)), 0);
            case 25:
                tv0 tv0Var2 = (tv0) obj;
                String str = tv0Var2.g.e;
                long j5 = tv0Var2.f;
                int i7 = hx0.c;
                int iF = go0.f(str, (int) (j5 & 4294967295L));
                if (iF != -1) {
                    return new xl(0, iF - ((int) (tv0Var2.f & 4294967295L)));
                }
                return null;
            case 26:
                tv0 tv0Var3 = (tv0) obj;
                Integer numD = tv0Var3.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j6 = tv0Var3.f;
                int i8 = hx0.c;
                return new xl(((int) (j6 & 4294967295L)) - iIntValue, 0);
            case 27:
                tv0 tv0Var4 = (tv0) obj;
                Integer numC = tv0Var4.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j7 = tv0Var4.f;
                int i9 = hx0.c;
                return new xl(0, iIntValue2 - ((int) (j7 & 4294967295L)));
            case 28:
                tv0 tv0Var5 = (tv0) obj;
                ab0 ab0Var = tv0Var5.d;
                zw0 zw0Var = tv0Var5.c;
                Integer numValueOf = zw0Var != null ? Integer.valueOf(ab0Var.b(zw0Var.h(zw0Var.e(ab0Var.d(hx0.e(tv0Var5.f)))))) : null;
                if (numValueOf == null) {
                    return null;
                }
                int iIntValue3 = numValueOf.intValue();
                long j8 = tv0Var5.f;
                int i10 = hx0.c;
                return new xl(((int) (j8 & 4294967295L)) - iIntValue3, 0);
            default:
                tv0 tv0Var6 = (tv0) obj;
                Integer numB = tv0Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j9 = tv0Var6.f;
                int i11 = hx0.c;
                return new xl(0, iIntValue4 - ((int) (j9 & 4294967295L)));
        }
    }
}
