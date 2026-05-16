package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cw0 {
    public final vz0 a;
    public h30 d;
    public gc f;
    public ox0 g;
    public ix h;
    public ys i;
    public final me0 j;
    public final me0 k;
    public long l;
    public Integer m;
    public long n;
    public final me0 o;
    public final me0 p;
    public int q;
    public lw0 r;
    public nq0 s;
    public final aw0 t;
    public final bu u;
    public ab0 b = pk.h;
    public cv c = yv0.g;
    public final me0 e = bo0.m(new lw0((String) null, 0, 7));

    public cw0(vz0 vz0Var) {
        this.a = vz0Var;
        Boolean bool = Boolean.TRUE;
        this.j = bo0.m(bool);
        this.k = bo0.m(bool);
        this.l = 0L;
        this.n = 0L;
        this.o = bo0.m(null);
        this.p = bo0.m(null);
        this.q = -1;
        this.r = new lw0((String) null, 0L, 7);
        this.t = new aw0(this, 1);
        this.u = new bu(25, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(cw0 cw0Var, lw0 lw0Var, long j, boolean z, boolean z2, wc wcVar, boolean z3) {
        ax0 ax0VarD;
        long j2;
        yn0 yn0Var;
        long j3;
        b6 b6Var;
        yn0 yn0Var2;
        boolean z4;
        ix ixVar;
        xn0 xn0VarB;
        xn0 xn0VarB2;
        h30 h30Var = cw0Var.d;
        if (h30Var == null || (ax0VarD = h30Var.d()) == null) {
            return hx0.b;
        }
        ab0 ab0Var = cw0Var.b;
        long j4 = lw0Var.b;
        b6 b6Var2 = lw0Var.a;
        int i = hx0.c;
        long jB = wo0.b(ab0Var.d((int) (j4 >> 32)), cw0Var.b.d((int) (j4 & 4294967295L)));
        int iB = ax0VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jB >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jB & 4294967295L);
        nq0 nq0Var = cw0Var.s;
        int i4 = -1;
        if (z || nq0Var == null) {
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i5 = cw0Var.q;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        zw0 zw0Var = ax0VarD.a;
        if (z) {
            b6Var = b6Var2;
            j3 = j4;
            yn0Var = null;
        } else {
            int i6 = (int) (jB >> 32);
            j3 = j4;
            int i7 = (int) (jB & j2);
            b6Var = b6Var2;
            yn0Var = new yn0(new xn0(jo0.f(zw0Var, i6), i6, 1L), new xn0(jo0.f(zw0Var, i7), i7, 1L), hx0.f(jB));
        }
        nq0 nq0Var2 = new nq0(z2, yn0Var, new tv(i2, i3, i4, zw0Var));
        if (yn0Var != null && nq0Var != null && z2 == nq0Var.a) {
            tv tvVar = nq0Var.c;
            if (i2 == tvVar.b && i3 == tvVar.c) {
                return j3;
            }
        }
        cw0Var.s = nq0Var2;
        cw0Var.q = iB;
        int i8 = wcVar.a;
        tv tvVar2 = nq0Var2.c;
        switch (i8) {
            case 21:
                yn0Var2 = new yn0(tvVar2.a(tvVar2.b), tvVar2.a(tvVar2.c), nq0Var2.a() == 1);
                break;
            case 22:
                yn0Var2 = bo0.a(nq0Var2, bw.ap);
                break;
            case 23:
                yn0Var2 = bo0.a(nq0Var2, bw.ao);
                break;
            default:
                yn0Var2 = nq0Var2.b;
                if (yn0Var2 == null) {
                    yn0Var2 = bo0.a(nq0Var2, bw.ap);
                    break;
                } else {
                    xn0 xn0Var = yn0Var2.b;
                    xn0 xn0Var2 = yn0Var2.a;
                    boolean z5 = nq0Var2.a;
                    if (z5) {
                        xn0VarB2 = bo0.b(nq0Var2, tvVar2, xn0Var2);
                        xn0VarB = xn0Var;
                        xn0Var = xn0Var2;
                        xn0Var2 = xn0VarB2;
                    } else {
                        xn0VarB = bo0.b(nq0Var2, tvVar2, xn0Var);
                        xn0VarB2 = xn0VarB;
                    }
                    if (!f00.h(xn0VarB2, xn0Var)) {
                        yn0 yn0Var3 = new yn0(xn0Var2, xn0VarB, nq0Var2.a() == 1 || (nq0Var2.a() == 3 && xn0Var2.b > xn0VarB.b));
                        xn0 xn0Var3 = yn0Var3.a;
                        long j5 = xn0Var3.c;
                        xn0 xn0Var4 = yn0Var3.b;
                        if (j5 != xn0Var4.c) {
                            boolean z6 = yn0Var3.c;
                            if ((z6 ? xn0Var3 : xn0Var4).b == 0) {
                                if (((zw0) tvVar2.e).a.a.e.length() != (z6 ? xn0Var4 : xn0Var3).b) {
                                }
                            }
                            yn0Var2 = yn0Var3;
                            break;
                        } else if (xn0Var3.b == xn0Var4.b) {
                            String str = ((zw0) tvVar2.e).a.a.e;
                            if (yn0Var2 == null || str.length() == 0) {
                                yn0Var2 = yn0Var3;
                            } else {
                                String str2 = ((zw0) tvVar2.e).a.a.e;
                                int i9 = tvVar2.b;
                                int length = str2.length();
                                if (i9 == 0) {
                                    int iF = go0.f(str2, 0);
                                    yn0Var2 = !z5 ? yn0.a(yn0Var3, null, bo0.d(xn0Var4, tvVar2, iF), false, 1) : yn0.a(yn0Var3, bo0.d(xn0Var3, tvVar2, iF), null, true, 2);
                                } else if (i9 != length) {
                                    boolean z7 = yn0Var2.c;
                                    int iG = z5 ^ z7 ? go0.g(str2, i9) : go0.f(str2, i9);
                                    yn0Var2 = !z5 ? yn0.a(yn0Var3, null, bo0.d(xn0Var4, tvVar2, iG), z7, 1) : yn0.a(yn0Var3, bo0.d(xn0Var3, tvVar2, iG), null, z7, 2);
                                } else {
                                    int iG2 = go0.g(str2, length);
                                    yn0Var2 = !z5 ? yn0.a(yn0Var3, null, bo0.d(xn0Var4, tvVar2, iG2), true, 1) : yn0.a(yn0Var3, bo0.d(xn0Var3, tvVar2, iG2), null, false, 2);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        long jB2 = wo0.b(cw0Var.b.b(yn0Var2.a.b), cw0Var.b.b(yn0Var2.b.b));
        long j6 = j3;
        if (hx0.a(jB2, j6)) {
            return j6;
        }
        boolean z8 = hx0.f(jB2) != hx0.f(j6) && hx0.a(wo0.b((int) (jB2 & j2), (int) (jB2 >> 32)), j6);
        boolean z9 = hx0.b(jB2) && hx0.b(j6);
        if (z3 && b6Var.e.length() > 0 && !z8 && !z9 && (ixVar = cw0Var.h) != null) {
            ixVar.a();
        }
        cw0Var.c.g(c(b6Var, jB2));
        if (!z3) {
            cw0Var.p(!hx0.b(jB2));
        }
        h30 h30Var2 = cw0Var.d;
        if (h30Var2 != null) {
            h30Var2.q.setValue(Boolean.valueOf(z3));
        }
        h30 h30Var3 = cw0Var.d;
        if (h30Var3 != null) {
            h30Var3.m.setValue(Boolean.valueOf(!hx0.b(jB2) && lI.l(cw0Var, true)));
        }
        h30 h30Var4 = cw0Var.d;
        if (h30Var4 == null) {
            z4 = false;
        } else {
            z4 = false;
            h30Var4.n.setValue(Boolean.valueOf(!hx0.b(jB2) && lI.l(cw0Var, false)));
        }
        h30 h30Var5 = cw0Var.d;
        if (h30Var5 == null) {
            return jB2;
        }
        if (hx0.b(jB2) && lI.l(cw0Var, true)) {
            z4 = true;
        }
        h30Var5.o.setValue(Boolean.valueOf(z4));
        return jB2;
    }

    public static lw0 c(b6 b6Var, long j) {
        return new lw0(b6Var, j, (hx0) null);
    }

    public final void b(boolean z) {
        if (hx0.b(j().b)) {
            return;
        }
        gc gcVar = this.f;
        if (gcVar != null) {
            ((h0) gcVar).a(qo0.h(j()));
        }
        if (z) {
            int iD = hx0.d(j().b);
            this.c.g(c(j().a, wo0.b(iD, iD)));
            n(xw.d);
        }
    }

    public final void d() {
        if (hx0.b(j().b)) {
            return;
        }
        gc gcVar = this.f;
        if (gcVar != null) {
            ((h0) gcVar).a(qo0.h(j()));
        }
        b6 b6VarJ = qo0.j(j(), j().a.e.length());
        b6 b6VarI = qo0.i(j(), j().a.e.length());
        z5 z5Var = new z5(b6VarJ);
        z5Var.a(b6VarI);
        b6 b6VarB = z5Var.b();
        int iE = hx0.e(j().b);
        this.c.g(c(b6VarB, wo0.b(iE, iE)));
        n(xw.d);
        this.a.e = true;
    }

    public final void e(xa0 xa0Var) {
        if (!hx0.b(j().b)) {
            h30 h30Var = this.d;
            ax0 ax0VarD = h30Var != null ? h30Var.d() : null;
            int iD = (xa0Var == null || ax0VarD == null) ? hx0.d(j().b) : this.b.b(ax0VarD.b(xa0Var.a, true));
            this.c.g(lw0.a(j(), null, wo0.b(iD, iD), 5));
        }
        n((xa0Var == null || j().a.e.length() <= 0) ? xw.d : xw.f);
        p(false);
    }

    public final void f(boolean z) {
        ys ysVar;
        h30 h30Var = this.d;
        if (h30Var != null && !h30Var.b() && (ysVar = this.i) != null) {
            ysVar.a(new yv0(1, 25));
        }
        this.r = j();
        p(z);
        n(xw.e);
    }

    public final xa0 g() {
        return (xa0) this.p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final long i(boolean z) {
        ax0 ax0VarD;
        long j;
        h30 h30Var = this.d;
        if (h30Var == null || (ax0VarD = h30Var.d()) == null) {
            return 9205357640488583168L;
        }
        zw0 zw0Var = ax0VarD.a;
        h30 h30Var2 = this.d;
        b6 b6Var = h30Var2 != null ? h30Var2.a.a : null;
        if (b6Var == null) {
            return 9205357640488583168L;
        }
        if (!f00.h(b6Var.e, zw0Var.a.a.e)) {
            return 9205357640488583168L;
        }
        lw0 lw0VarJ = j();
        if (z) {
            long j2 = lw0VarJ.b;
            int i = hx0.c;
            j = j2 >> 32;
        } else {
            long j3 = lw0VarJ.b;
            int i2 = hx0.c;
            j = j3 & 4294967295L;
        }
        int iD = this.b.d((int) j);
        boolean zF = hx0.f(j().b);
        int iE = zw0Var.e(iD);
        long j4 = zw0Var.c;
        y70 y70Var = zw0Var.b;
        if (iE >= y70Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = zw0Var.a(((!z || zF) && (z || !zF)) ? Math.max(iD + (-1), 0) : iD) == zw0Var.i(iD);
        y70Var.i(iD);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(iD == length ? f00.v(arrayList) : e00.t(iD, arrayList));
        o3 o3Var = ce0Var.a;
        int iD2 = ce0Var.d(iD);
        xw0 xw0Var = o3Var.d;
        return d41.h(i60.s(z2 ? xw0Var.h(iD2, false) : xw0Var.i(iD2, false), 0.0f, (int) (j4 >> 32)), i60.s(y70Var.b(iE), 0.0f, (int) (4294967295L & j4)));
    }

    public final lw0 j() {
        return (lw0) this.e.getValue();
    }

    public final void k() {
        ox0 ox0Var = this.g;
        if ((ox0Var != null ? ((v4) ox0Var).d : null) != px0.d || ox0Var == null) {
            return;
        }
        v4 v4Var = (v4) ox0Var;
        v4Var.d = px0.e;
        ActionMode actionMode = v4Var.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        v4Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        b6 b6Var;
        CharSequence charSequence;
        byte b;
        gc gcVar = this.f;
        if (gcVar != null) {
            ClipData primaryClip = ((h0) gcVar).a.getPrimaryClip();
            byte b2 = 1;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                b6Var = null;
            } else {
                byte b3 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length = annotationArr.length - 1;
                        byte b4 = 4;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i];
                                if (f00.h(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    rk rkVar = new rk();
                                    Parcel parcelObtain = Parcel.obtain();
                                    rkVar.a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, 0);
                                    b = b3;
                                    parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                                    parcelObtain.setDataPosition(0);
                                    Parcel parcel = rkVar.a;
                                    long jA = qc.g;
                                    long jA2 = jA;
                                    long jB = qx0.c;
                                    long jB2 = jB;
                                    iu iuVar = null;
                                    gu guVar = null;
                                    hu huVar = null;
                                    String string = null;
                                    t7 t7Var = null;
                                    ow0 ow0Var = null;
                                    bv0 bv0Var = null;
                                    yp0 yp0Var = null;
                                    while (parcel.dataAvail() > b2) {
                                        byte b5 = parcel.readByte();
                                        if (b5 == b2) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                jA = rkVar.a();
                                            }
                                        } else if (b5 == 2) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            } else {
                                                jB = rkVar.b();
                                            }
                                        } else if (b5 == 3) {
                                            if (parcel.dataAvail() < b4) {
                                                break;
                                            } else {
                                                iuVar = new iu(parcel.readInt());
                                            }
                                        } else if (b5 == b4) {
                                            if (parcel.dataAvail() < b2) {
                                                break;
                                            }
                                            byte b6 = parcel.readByte();
                                            guVar = new gu((b6 != 0 && b6 == b2) ? b2 : b);
                                        } else if (b5 == 5) {
                                            if (parcel.dataAvail() < b2) {
                                                break;
                                            }
                                            byte b7 = parcel.readByte();
                                            if (b7 != 0) {
                                                byte b8 = b7 == b2 ? (byte) 65535 : b7 == 3 ? (byte) 2 : b7 == 2 ? b2 : b;
                                                huVar = new hu(b8);
                                            }
                                        } else if (b5 == 6) {
                                            string = parcel.readString();
                                        } else if (b5 == 7) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            } else {
                                                jB2 = rkVar.b();
                                            }
                                        } else if (b5 == 8) {
                                            if (parcel.dataAvail() < b4) {
                                                break;
                                            } else {
                                                t7Var = new t7(parcel.readFloat());
                                            }
                                        } else if (b5 == 9) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                ow0Var = new ow0(parcel.readFloat(), parcel.readFloat());
                                            }
                                        } else if (b5 == 10) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                jA2 = rkVar.a();
                                            }
                                        } else if (b5 != 11) {
                                            if (b5 == 12) {
                                                if (parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                text = text;
                                                yp0Var = new yp0(parcel.readFloat(), rkVar.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L));
                                            }
                                            b2 = 1;
                                            b4 = 4;
                                        } else {
                                            if (parcel.dataAvail() < b4) {
                                                break;
                                            }
                                            int i2 = parcel.readInt();
                                            byte b9 = (i2 & 2) != 0 ? b2 : b;
                                            byte b10 = (i2 & 1) != 0 ? b2 : b;
                                            bv0 bv0Var2 = bv0.d;
                                            bv0 bv0Var3 = bv0.c;
                                            if (b9 != 0 && b10 != 0) {
                                                List listZ = f00.z(bv0Var2, bv0Var3);
                                                Integer numValueOf = Integer.valueOf(b);
                                                int size = listZ.size();
                                                for (int i3 = b; i3 < size; i3++) {
                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((bv0) listZ.get(i3)).a);
                                                }
                                                bv0Var = new bv0(numValueOf.intValue());
                                            } else if (b9 != 0) {
                                                bv0Var = bv0Var2;
                                            } else {
                                                if (b10 == 0) {
                                                    bv0Var3 = bv0.b;
                                                }
                                                bv0Var = bv0Var3;
                                            }
                                            b2 = 1;
                                            b4 = 4;
                                        }
                                    }
                                    charSequence = text;
                                    arrayList.add(new a6(spanStart, spanEnd, new yr0(jA, jB, iuVar, guVar, huVar, (fu0) null, string, jB2, t7Var, ow0Var, (t40) null, jA2, bv0Var, yp0Var, 49152)));
                                } else {
                                    charSequence = text;
                                    b = b3;
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                                text = charSequence;
                                b3 = b;
                                b2 = 1;
                                b4 = 4;
                            }
                        } else {
                            charSequence = text;
                        }
                        b6Var = new b6(charSequence.toString(), arrayList, 4);
                    } else {
                        b6Var = new b6(text.toString());
                    }
                }
            }
            if (b6Var == null) {
                return;
            }
            z5 z5Var = new z5(qo0.j(j(), j().a.e.length()));
            z5Var.a(b6Var);
            b6 b6VarB = z5Var.b();
            b6 b6VarI = qo0.i(j(), j().a.e.length());
            z5 z5Var2 = new z5(b6VarB);
            z5Var2.a(b6VarI);
            b6 b6VarB2 = z5Var2.b();
            int length2 = b6Var.e.length() + hx0.e(j().b);
            this.c.g(c(b6VarB2, wo0.b(length2, length2)));
            n(xw.d);
            this.a.e = true;
        }
    }

    public final void m() {
        lw0 lw0VarC = c(j().a, wo0.b(0, j().a.e.length()));
        this.c.g(lw0VarC);
        this.r = lw0.a(this.r, null, lw0VarC.b, 5);
        f(true);
    }

    public final void n(xw xwVar) {
        h30 h30Var = this.d;
        if (h30Var != null) {
            if (h30Var.a() == xwVar) {
                h30Var = null;
            }
            if (h30Var != null) {
                h30Var.k.setValue(xwVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        cj cjVar;
        ox0 ox0Var;
        ri0 ri0Var;
        float fE;
        d20 d20VarC;
        d20 d20VarC2;
        d20 d20VarC3;
        d20 d20VarC4;
        gc gcVar;
        if (h()) {
            h30 h30Var = this.d;
            if (h30Var == null || ((Boolean) h30Var.q.getValue()).booleanValue()) {
                cj cjVar2 = !hx0.b(j().b) ? new cj(this, 4) : null;
                boolean zB = hx0.b(j().b);
                me0 me0Var = this.j;
                cj cjVar3 = (zB || !((Boolean) me0Var.getValue()).booleanValue()) ? null : new cj(this, 5);
                if (!((Boolean) me0Var.getValue()).booleanValue() || (gcVar = this.f) == null) {
                    cjVar = null;
                } else {
                    ClipDescription primaryClipDescription = ((h0) gcVar).a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        cjVar = new cj(this, 6);
                    }
                }
                cj cjVar4 = hx0.c(j().b) != j().a.e.length() ? new cj(this, 7) : null;
                ox0 ox0Var2 = this.g;
                if (ox0Var2 != null) {
                    h30 h30Var2 = this.d;
                    if (h30Var2 == null) {
                        ox0Var = ox0Var2;
                        ri0Var = ri0.e;
                    } else {
                        h30 h30Var3 = h30Var2.p ? null : h30Var2;
                        if (h30Var3 != null) {
                            int iD = this.b.d((int) (j().b >> 32));
                            int iD2 = this.b.d((int) (j().b & 4294967295L));
                            h30 h30Var4 = this.d;
                            long jAm = 0;
                            long jAm2 = (h30Var4 == null || (d20VarC4 = h30Var4.c()) == null) ? 0L : d20VarC4.am(i(true));
                            h30 h30Var5 = this.d;
                            if (h30Var5 != null && (d20VarC3 = h30Var5.c()) != null) {
                                jAm = d20VarC3.am(i(false));
                            }
                            h30 h30Var6 = this.d;
                            float fE2 = 0.0f;
                            if (h30Var6 == null || (d20VarC2 = h30Var6.c()) == null) {
                                ox0Var = ox0Var2;
                                fE = 0.0f;
                            } else {
                                ax0 ax0VarD = h30Var3.d();
                                ox0Var = ox0Var2;
                                fE = xa0.e(d20VarC2.am(d41.h(0.0f, ax0VarD != null ? ax0VarD.a.c(iD).b : 0.0f)));
                            }
                            h30 h30Var7 = this.d;
                            if (h30Var7 != null && (d20VarC = h30Var7.c()) != null) {
                                ax0 ax0VarD2 = h30Var3.d();
                                fE2 = xa0.e(d20VarC.am(d41.h(0.0f, ax0VarD2 != null ? ax0VarD2.a.c(iD2).b : 0.0f)));
                            }
                            ri0Var = new ri0(Math.min(xa0.d(jAm2), xa0.d(jAm)), Math.min(fE, fE2), Math.max(xa0.d(jAm2), xa0.d(jAm)), (h30Var3.a.g.b() * 25) + Math.max(xa0.e(jAm2), xa0.e(jAm)));
                        }
                    }
                    v4 v4Var = (v4) ox0Var;
                    xu0 xu0Var = v4Var.c;
                    xu0Var.b = ri0Var;
                    xu0Var.c = cjVar2;
                    xu0Var.e = cjVar3;
                    xu0Var.d = cjVar;
                    xu0Var.f = cjVar4;
                    ActionMode actionMode = v4Var.b;
                    if (actionMode != null) {
                        actionMode.invalidate();
                    } else {
                        v4Var.d = px0.d;
                        v4Var.b = v4Var.a.startActionMode(new xr(xu0Var), 1);
                    }
                }
            }
        }
    }

    public final void p(boolean z) {
        h30 h30Var = this.d;
        if (h30Var != null) {
            h30Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            o();
        } else {
            k();
        }
    }
}
