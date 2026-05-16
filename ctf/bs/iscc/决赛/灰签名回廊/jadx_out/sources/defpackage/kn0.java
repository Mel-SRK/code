package defpackage;

import com.example.gnd.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kn0 extends x10 implements cv {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(int i, rv0 rv0Var, ti0 ti0Var) {
        super(1);
        this.f = i;
        this.g = rv0Var;
        this.h = ti0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cv
    public final Object g(Object obj) {
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        zw0 zw0Var;
        zw0 zw0Var2;
        ax0 ax0Var;
        ax0 ax0Var2;
        zw0 zw0Var3;
        zw0 zw0Var4;
        ax0 ax0Var3;
        ax0 ax0Var4;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        f1 f1Var;
        int i = this.e;
        wz0 wz0Var = wz0.a;
        Object obj2 = this.h;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                kf0 kf0Var = (kf0) obj;
                ln0 ln0Var = (ln0) obj3;
                int i3 = -i60.t(ln0Var.r.a.g(), 0, i2);
                boolean z = ln0Var.s;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                kf0Var.d = true;
                kf0.l(kf0Var, (lf0) obj2, i4, i3);
                kf0Var.d = false;
                break;
            default:
                tv0 tv0Var = (tv0) obj;
                rv0 rv0Var = (rv0) obj3;
                int iN = n5.n(i2);
                int i5 = 20;
                lw0 lw0Var = null;
                switch (iN) {
                    case 0:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (!hx0.b(tv0Var.f)) {
                                boolean zE = tv0Var.e();
                                long j = tv0Var.f;
                                if (!zE) {
                                    int iD = hx0.d(j);
                                    tv0Var.o(iD, iD);
                                } else {
                                    int iE = hx0.e(j);
                                    tv0Var.o(iE, iE);
                                }
                            } else {
                                tv0Var.h();
                            }
                        }
                        break;
                    case 1:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (!hx0.b(tv0Var.f)) {
                                boolean zE2 = tv0Var.e();
                                long j2 = tv0Var.f;
                                if (!zE2) {
                                    int iE2 = hx0.e(j2);
                                    tv0Var.o(iE2, iE2);
                                } else {
                                    int iD2 = hx0.d(j2);
                                    tv0Var.o(iD2, iD2);
                                }
                            } else {
                                tv0Var.k();
                            }
                        }
                        break;
                    case 2:
                        gx0 gx0Var = tv0Var.e;
                        gx0Var.a = null;
                        b6 b6Var = tv0Var.g;
                        String str = b6Var.e;
                        String str2 = b6Var.e;
                        if (str.length() > 0) {
                            if (!tv0Var.e()) {
                                gx0Var.a = null;
                                if (str2.length() > 0 && (numD = tv0Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    tv0Var.o(iIntValue, iIntValue);
                                }
                            } else {
                                gx0Var.a = null;
                                if (str2.length() > 0 && (numC = tv0Var.c()) != null) {
                                    int iIntValue2 = numC.intValue();
                                    tv0Var.o(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        gx0 gx0Var2 = tv0Var.e;
                        gx0Var2.a = null;
                        b6 b6Var2 = tv0Var.g;
                        String str3 = b6Var2.e;
                        String str4 = b6Var2.e;
                        if (str3.length() > 0) {
                            if (!tv0Var.e()) {
                                gx0Var2.a = null;
                                if (str4.length() > 0 && (numC2 = tv0Var.c()) != null) {
                                    int iIntValue3 = numC2.intValue();
                                    tv0Var.o(iIntValue3, iIntValue3);
                                }
                            } else {
                                gx0Var2.a = null;
                                if (str4.length() > 0 && (numD2 = tv0Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    tv0Var.o(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        tv0Var.i();
                        break;
                    case 5:
                        tv0Var.j();
                        break;
                    case 6:
                        tv0Var.m();
                        break;
                    case 7:
                        tv0Var.l();
                        break;
                    case MainActivity.$stable /* 8 */:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (!tv0Var.e()) {
                                tv0Var.l();
                            } else {
                                tv0Var.m();
                            }
                        }
                        break;
                    case 9:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (!tv0Var.e()) {
                                tv0Var.m();
                            } else {
                                tv0Var.l();
                            }
                        }
                        break;
                    case 10:
                        if (tv0Var.g.e.length() > 0 && (zw0Var = tv0Var.c) != null) {
                            int iF = tv0Var.f(zw0Var, -1);
                            tv0Var.o(iF, iF);
                        }
                        break;
                    case 11:
                        if (tv0Var.g.e.length() > 0 && (zw0Var2 = tv0Var.c) != null) {
                            int iF2 = tv0Var.f(zw0Var2, 1);
                            tv0Var.o(iF2, iF2);
                        }
                        break;
                    case 12:
                        if (tv0Var.g.e.length() > 0 && (ax0Var = tv0Var.i) != null) {
                            int iG = tv0Var.g(ax0Var, -1);
                            tv0Var.o(iG, iG);
                        }
                        break;
                    case 13:
                        if (tv0Var.g.e.length() > 0 && (ax0Var2 = tv0Var.i) != null) {
                            int iG2 = tv0Var.g(ax0Var2, 1);
                            tv0Var.o(iG2, iG2);
                        }
                        break;
                    case 14:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            tv0Var.o(0, 0);
                        }
                        break;
                    case 15:
                        tv0Var.e.a = null;
                        b6 b6Var3 = tv0Var.g;
                        if (b6Var3.e.length() > 0) {
                            int length = b6Var3.e.length();
                            tv0Var.o(length, length);
                        }
                        break;
                    case 16:
                        rv0Var.b.b(false);
                        break;
                    case 17:
                        rv0Var.b.l();
                        break;
                    case 18:
                        rv0Var.b.d();
                        break;
                    case 19:
                        List listA = tv0Var.a(f50.ad);
                        if (listA != null) {
                            rv0Var.a(listA);
                        }
                        break;
                    case 20:
                        List listA2 = tv0Var.a(f50.ae);
                        if (listA2 != null) {
                            rv0Var.a(listA2);
                        }
                        break;
                    case 21:
                        List listA3 = tv0Var.a(f50.af);
                        if (listA3 != null) {
                            rv0Var.a(listA3);
                        }
                        break;
                    case 22:
                        List listA4 = tv0Var.a(f50.ag);
                        if (listA4 != null) {
                            rv0Var.a(listA4);
                        }
                        break;
                    case 23:
                        List listA5 = tv0Var.a(f50.ah);
                        if (listA5 != null) {
                            rv0Var.a(listA5);
                        }
                        break;
                    case 24:
                        List listA6 = tv0Var.a(f50.ai);
                        if (listA6 != null) {
                            rv0Var.a(listA6);
                        }
                        break;
                    case 25:
                        tv0Var.e.a = null;
                        b6 b6Var4 = tv0Var.g;
                        if (b6Var4.e.length() > 0) {
                            tv0Var.o(0, b6Var4.e.length());
                        }
                        break;
                    case 26:
                        tv0Var.h();
                        tv0Var.n();
                        break;
                    case 27:
                        tv0Var.k();
                        tv0Var.n();
                        break;
                    case 28:
                        if (tv0Var.g.e.length() > 0 && (zw0Var3 = tv0Var.c) != null) {
                            int iF3 = tv0Var.f(zw0Var3, -1);
                            tv0Var.o(iF3, iF3);
                        }
                        tv0Var.n();
                        break;
                    case 29:
                        if (tv0Var.g.e.length() > 0 && (zw0Var4 = tv0Var.c) != null) {
                            int iF4 = tv0Var.f(zw0Var4, 1);
                            tv0Var.o(iF4, iF4);
                        }
                        tv0Var.n();
                        break;
                    case 30:
                        if (tv0Var.g.e.length() > 0 && (ax0Var3 = tv0Var.i) != null) {
                            int iG3 = tv0Var.g(ax0Var3, -1);
                            tv0Var.o(iG3, iG3);
                        }
                        tv0Var.n();
                        break;
                    case 31:
                        if (tv0Var.g.e.length() > 0 && (ax0Var4 = tv0Var.i) != null) {
                            int iG4 = tv0Var.g(ax0Var4, 1);
                            tv0Var.o(iG4, iG4);
                        }
                        tv0Var.n();
                        break;
                    case 32:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            tv0Var.o(0, 0);
                        }
                        tv0Var.n();
                        break;
                    case 33:
                        tv0Var.e.a = null;
                        b6 b6Var5 = tv0Var.g;
                        if (b6Var5.e.length() > 0) {
                            int length2 = b6Var5.e.length();
                            tv0Var.o(length2, length2);
                        }
                        tv0Var.n();
                        break;
                    case 34:
                        gx0 gx0Var3 = tv0Var.e;
                        gx0Var3.a = null;
                        b6 b6Var6 = tv0Var.g;
                        String str5 = b6Var6.e;
                        String str6 = b6Var6.e;
                        if (str5.length() > 0) {
                            if (tv0Var.e()) {
                                gx0Var3.a = null;
                                if (str6.length() > 0 && (numD3 = tv0Var.d()) != null) {
                                    int iIntValue5 = numD3.intValue();
                                    tv0Var.o(iIntValue5, iIntValue5);
                                }
                            } else {
                                gx0Var3.a = null;
                                if (str6.length() > 0 && (numC3 = tv0Var.c()) != null) {
                                    int iIntValue6 = numC3.intValue();
                                    tv0Var.o(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        tv0Var.n();
                        break;
                    case 35:
                        gx0 gx0Var4 = tv0Var.e;
                        gx0Var4.a = null;
                        b6 b6Var7 = tv0Var.g;
                        String str7 = b6Var7.e;
                        String str8 = b6Var7.e;
                        if (str7.length() > 0) {
                            if (tv0Var.e()) {
                                gx0Var4.a = null;
                                if (str8.length() > 0 && (numC4 = tv0Var.c()) != null) {
                                    int iIntValue7 = numC4.intValue();
                                    tv0Var.o(iIntValue7, iIntValue7);
                                }
                            } else {
                                gx0Var4.a = null;
                                if (str8.length() > 0 && (numD4 = tv0Var.d()) != null) {
                                    int iIntValue8 = numD4.intValue();
                                    tv0Var.o(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        tv0Var.n();
                        break;
                    case 36:
                        tv0Var.i();
                        tv0Var.n();
                        break;
                    case 37:
                        tv0Var.j();
                        tv0Var.n();
                        break;
                    case 38:
                        tv0Var.m();
                        tv0Var.n();
                        break;
                    case 39:
                        tv0Var.l();
                        tv0Var.n();
                        break;
                    case 40:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (tv0Var.e()) {
                                tv0Var.m();
                            } else {
                                tv0Var.l();
                            }
                        }
                        tv0Var.n();
                        break;
                    case 41:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            if (tv0Var.e()) {
                                tv0Var.l();
                            } else {
                                tv0Var.m();
                            }
                        }
                        tv0Var.n();
                        break;
                    case 42:
                        tv0Var.e.a = null;
                        if (tv0Var.g.e.length() > 0) {
                            long j3 = tv0Var.f;
                            int i6 = hx0.c;
                            int i7 = (int) (j3 & 4294967295L);
                            tv0Var.o(i7, i7);
                        }
                        break;
                    case 43:
                        if (!rv0Var.e) {
                            rv0Var.a(f00.y(new pd("\n", 1)));
                        } else {
                            rv0Var.a.u.g(new dy(rv0Var.l));
                        }
                        break;
                    case 44:
                        if (!rv0Var.e) {
                            rv0Var.a(f00.y(new pd("\t", 1)));
                        } else {
                            ((ti0) obj2).d = false;
                        }
                        break;
                    case 45:
                        vz0 vz0Var = rv0Var.h;
                        if (vz0Var != null) {
                            vz0Var.a(lw0.a(tv0Var.h, tv0Var.g, tv0Var.f, 4));
                        }
                        vz0 vz0Var2 = rv0Var.h;
                        if (vz0Var2 != null) {
                            f1 f1Var2 = vz0Var2.a;
                            if (f1Var2 != null && (f1Var = (f1) f1Var2.e) != null) {
                                vz0Var2.a = f1Var;
                                vz0Var2.c -= ((lw0) f1Var2.f).a.e.length();
                                vz0Var2.b = new f1(i5, vz0Var2.b, (lw0) f1Var2.f);
                                lw0Var = (lw0) f1Var.f;
                            }
                            if (lw0Var != null) {
                                rv0Var.k.g(lw0Var);
                            }
                        }
                        break;
                    case 46:
                        vz0 vz0Var3 = rv0Var.h;
                        if (vz0Var3 != null) {
                            f1 f1Var3 = vz0Var3.b;
                            if (f1Var3 != null) {
                                vz0Var3.b = (f1) f1Var3.e;
                                lw0 lw0Var2 = (lw0) f1Var3.f;
                                vz0Var3.a = new f1(i5, vz0Var3.a, lw0Var2);
                                vz0Var3.c = lw0Var2.a.e.length() + vz0Var3.c;
                                lw0Var = (lw0) f1Var3.f;
                            }
                            if (lw0Var != null) {
                                rv0Var.k.g(lw0Var);
                            }
                        }
                        break;
                }
                break;
        }
        return wz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(ln0 ln0Var, int i, lf0 lf0Var) {
        super(1);
        this.g = ln0Var;
        this.f = i;
        this.h = lf0Var;
    }
}
