package defpackage;

import android.util.Log;
import com.example.gnd.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements cv {
    public final /* synthetic */ int d;

    public /* synthetic */ c6(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.cv
    public final Object g(Object obj) {
        a6 a6Var;
        int i;
        int i2;
        int i3;
        int i4;
        fx0 fx0Var;
        long j;
        int i5 = 0;
        switch (this.d) {
            case 0:
                return Boolean.valueOf(!(((x5) obj) instanceof ge0));
            case 1:
                nj njVar = (nj) obj;
                if (njVar instanceof a) {
                    return (a) njVar;
                }
                return null;
            case 2:
                synchronized (fr0.c) {
                    ?? r3 = fr0.i;
                    int size = r3.size();
                    while (i5 < size) {
                        ((cv) r3.get(i5)).g(obj);
                        i5++;
                    }
                }
                return wz0.a;
            case 3:
                ce0 ce0Var = (ce0) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(ce0Var.b);
                sb.append(", ");
                return n5.h(sb, ce0Var.c, ')');
            case 4:
                return obj;
            case 5:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                cv cvVar = (cv) lm0.h.f;
                Boolean bool = Boolean.FALSE;
                yr0 yr0Var = (f00.h(obj2, bool) || obj2 == null) ? null : (yr0) cvVar.g(obj2);
                Object obj3 = list.get(1);
                yr0 yr0Var2 = (f00.h(obj3, bool) || obj3 == null) ? null : (yr0) cvVar.g(obj3);
                Object obj4 = list.get(2);
                yr0 yr0Var3 = (f00.h(obj4, bool) || obj4 == null) ? null : (yr0) cvVar.g(obj4);
                Object obj5 = list.get(3);
                return new dx0(yr0Var, yr0Var2, yr0Var3, (f00.h(obj5, bool) || obj5 == null) ? null : (yr0) cvVar.g(obj5));
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (f00.h(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((cv) lm0.a.f).g(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new b6(list3, str);
            case 7:
                obj.getClass();
                return new bv0(((Integer) obj).intValue());
            case MainActivity.$stable /* 8 */:
                obj.getClass();
                List list4 = (List) obj;
                return new ow0(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                rx0[] rx0VarArr = qx0.b;
                cv cvVar2 = lm0.q.e;
                Boolean bool2 = Boolean.FALSE;
                f00.h(obj8, bool2);
                qx0 qx0Var = obj8 != null ? (qx0) cvVar2.g(obj8) : null;
                qx0Var.getClass();
                long j2 = qx0Var.a;
                Object obj9 = list5.get(1);
                f00.h(obj9, bool2);
                qx0 qx0Var2 = obj9 != null ? (qx0) cvVar2.g(obj9) : null;
                qx0Var2.getClass();
                return new pw0(j2, qx0Var2.a);
            case 10:
                obj.getClass();
                return new iu(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                return new t7(((Float) obj).floatValue());
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new hx0(wo0.b(iIntValue, num2.intValue()));
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i6 = qc.h;
                Boolean bool3 = Boolean.FALSE;
                f00.h(obj12, bool3);
                qc qcVar = obj12 != null ? f00.h(obj12, Boolean.FALSE) ? new qc(qc.g) : new qc(m10.b(((Integer) obj12).intValue())) : null;
                qcVar.getClass();
                long j3 = qcVar.a;
                Object obj13 = list7.get(1);
                km0 km0Var = lm0.r;
                f00.h(obj13, bool3);
                xa0 xa0Var = obj13 != null ? (xa0) km0Var.e.g(obj13) : null;
                xa0Var.getClass();
                long j4 = xa0Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new yp0(f.floatValue(), j3, j4);
            case 14:
                if (f00.h(obj, Boolean.FALSE)) {
                    return new qx0(qx0.c);
                }
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f2 = obj15 != null ? (Float) obj15 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj16 = list8.get(1);
                rx0 rx0Var = obj16 != null ? (rx0) obj16 : null;
                rx0Var.getClass();
                return new qx0(bo0.o(rx0Var.a, fFloatValue));
            case 15:
                obj.getClass();
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                str2.getClass();
                Object obj18 = list9.get(1);
                return new j40(str2, (f00.h(obj18, Boolean.FALSE) || obj18 == null) ? null : (dx0) ((cv) lm0.i.f).g(obj18));
            case 16:
                if (f00.h(obj, Boolean.FALSE)) {
                    return new xa0(9205357640488583168L);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f3 = obj19 != null ? (Float) obj19 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj20 = list10.get(1);
                Float f4 = obj20 != null ? (Float) obj20 : null;
                f4.getClass();
                return new xa0((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 17:
                obj.getClass();
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size2 = list11.size();
                while (i5 < size2) {
                    Object obj21 = list11.get(i5);
                    s40 s40Var = (f00.h(obj21, Boolean.FALSE) || obj21 == null) ? null : (s40) ((cv) lm0.t.f).g(obj21);
                    s40Var.getClass();
                    arrayList.add(s40Var);
                    i5++;
                }
                return new t40(arrayList);
            case 18:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size3 = list12.size();
                while (i5 < size3) {
                    Object obj22 = list12.get(i5);
                    a6 a6Var2 = (f00.h(obj22, Boolean.FALSE) || obj22 == null) ? null : (a6) ((cv) lm0.b.f).g(obj22);
                    a6Var2.getClass();
                    arrayList2.add(a6Var2);
                    i5++;
                }
                return arrayList2;
            case 19:
                obj.getClass();
                String str3 = (String) obj;
                qf0.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (f00.h(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new s40(localeForLanguageTag);
            case 20:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                b40 b40Var = obj23 != null ? (b40) obj23 : null;
                b40Var.getClass();
                float f5 = b40Var.a;
                Object obj24 = list13.get(1);
                d40 d40Var = obj24 != null ? (d40) obj24 : null;
                d40Var.getClass();
                int i7 = d40Var.a;
                Object obj25 = list13.get(2);
                (obj25 != null ? (c40) obj25 : null).getClass();
                return new e40(f5, i7);
            case 21:
                obj.getClass();
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                e6 e6Var = obj26 != null ? (e6) obj26 : null;
                e6Var.getClass();
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                str4.getClass();
                switch (e6Var.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        ge0 ge0Var = (f00.h(obj30, Boolean.FALSE) || obj30 == null) ? null : (ge0) ((cv) lm0.g.f).g(obj30);
                        ge0Var.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, ge0Var, str4);
                        break;
                    case 1:
                        Object obj31 = list14.get(1);
                        yr0 yr0Var4 = (f00.h(obj31, Boolean.FALSE) || obj31 == null) ? null : (yr0) ((cv) lm0.h.f).g(obj31);
                        yr0Var4.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, yr0Var4, str4);
                        break;
                    case 2:
                        Object obj32 = list14.get(1);
                        s01 s01Var = (f00.h(obj32, Boolean.FALSE) || obj32 == null) ? null : (s01) ((cv) lm0.c.f).g(obj32);
                        s01Var.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, s01Var, str4);
                        break;
                    case 3:
                        Object obj33 = list14.get(1);
                        g01 g01Var = (f00.h(obj33, Boolean.FALSE) || obj33 == null) ? null : (g01) ((cv) lm0.d.f).g(obj33);
                        g01Var.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, g01Var, str4);
                        break;
                    case 4:
                        Object obj34 = list14.get(1);
                        j40 j40Var = (f00.h(obj34, Boolean.FALSE) || obj34 == null) ? null : (j40) ((cv) lm0.e.f).g(obj34);
                        j40Var.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, j40Var, str4);
                        break;
                    case 5:
                        Object obj35 = list14.get(1);
                        i40 i40Var = (f00.h(obj35, Boolean.FALSE) || obj35 == null) ? null : (i40) ((cv) lm0.f.f).g(obj35);
                        i40Var.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, i40Var, str4);
                        break;
                    case 6:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        str5.getClass();
                        a6Var = new a6(iIntValue2, iIntValue3, new zs0(str5), str4);
                        break;
                    default:
                        wc.l();
                        return null;
                }
                return a6Var;
            case 22:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new s01(str6);
            case 23:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new g01(str7);
            case 24:
                obj.getClass();
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                str8.getClass();
                Object obj38 = list15.get(1);
                return new i40(str8, (f00.h(obj38, Boolean.FALSE) || obj38 == null) ? null : (dx0) ((cv) lm0.i.f).g(obj38));
            case 25:
                obj.getClass();
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                yu0 yu0Var = obj39 != null ? (yu0) obj39 : null;
                yu0Var.getClass();
                int i8 = yu0Var.a;
                Object obj40 = list16.get(1);
                ev0 ev0Var = obj40 != null ? (ev0) obj40 : null;
                ev0Var.getClass();
                int i9 = ev0Var.a;
                Object obj41 = list16.get(2);
                rx0[] rx0VarArr2 = qx0.b;
                km0 km0Var2 = lm0.q;
                Boolean bool4 = Boolean.FALSE;
                f00.h(obj41, bool4);
                qx0 qx0Var3 = obj41 != null ? (qx0) km0Var2.e.g(obj41) : null;
                qx0Var3.getClass();
                long j5 = qx0Var3.a;
                Object obj42 = list16.get(3);
                pw0 pw0Var = pw0.c;
                pw0 pw0Var2 = (f00.h(obj42, bool4) || obj42 == null) ? null : (pw0) ((cv) lm0.l.f).g(obj42);
                Object obj43 = list16.get(4);
                xf0 xf0Var = (f00.h(obj43, bool4) || obj43 == null) ? null : (xf0) ((cv) d41.i.f).g(obj43);
                Object obj44 = list16.get(5);
                e40 e40Var = e40.c;
                e40 e40Var2 = (f00.h(obj44, bool4) || obj44 == null) ? null : (e40) ((cv) lm0.u.f).g(obj44);
                Object obj45 = list16.get(6);
                z30 z30Var = (f00.h(obj45, bool4) || obj45 == null) ? null : (z30) ((cv) d41.j.f).g(obj45);
                z30Var.getClass();
                int i10 = z30Var.a;
                Object obj46 = list16.get(7);
                yx yxVar = obj46 != null ? (yx) obj46 : null;
                yxVar.getClass();
                int i11 = yxVar.a;
                Object obj47 = list16.get(8);
                f1 f1Var = d41.k;
                if (f00.h(obj47, bool4) || obj47 == null) {
                    i = i8;
                    i2 = i11;
                    i3 = i10;
                    i4 = i9;
                    j = j5;
                    fx0Var = null;
                } else {
                    i = i8;
                    i2 = i11;
                    i3 = i10;
                    i4 = i9;
                    fx0Var = (fx0) ((cv) f1Var.f).g(obj47);
                    j = j5;
                }
                return new ge0(i, i4, j, pw0Var2, xf0Var, e40Var2, i3, i2, fx0Var);
            case 26:
                obj.getClass();
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i12 = qc.h;
                Boolean bool5 = Boolean.FALSE;
                f00.h(obj48, bool5);
                qc qcVar2 = obj48 != null ? obj48.equals(bool5) ? new qc(qc.g) : new qc(m10.b(((Integer) obj48).intValue())) : null;
                qcVar2.getClass();
                long j6 = qcVar2.a;
                Object obj49 = list17.get(1);
                rx0[] rx0VarArr3 = qx0.b;
                cv cvVar3 = lm0.q.e;
                f00.h(obj49, bool5);
                qx0 qx0Var4 = obj49 != null ? (qx0) cvVar3.g(obj49) : null;
                qx0Var4.getClass();
                long j7 = qx0Var4.a;
                Object obj50 = list17.get(2);
                iu iuVar = iu.e;
                iu iuVar2 = (f00.h(obj50, bool5) || obj50 == null) ? null : (iu) ((cv) lm0.m.f).g(obj50);
                Object obj51 = list17.get(3);
                gu guVar = obj51 != null ? (gu) obj51 : null;
                Object obj52 = list17.get(4);
                hu huVar = obj52 != null ? (hu) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                f00.h(obj54, bool5);
                qx0 qx0Var5 = obj54 != null ? (qx0) cvVar3.g(obj54) : null;
                qx0Var5.getClass();
                long j8 = qx0Var5.a;
                Object obj55 = list17.get(8);
                t7 t7Var = (f00.h(obj55, bool5) || obj55 == null) ? null : (t7) ((cv) lm0.n.f).g(obj55);
                Object obj56 = list17.get(9);
                ow0 ow0Var = (f00.h(obj56, bool5) || obj56 == null) ? null : (ow0) ((cv) lm0.k.f).g(obj56);
                Object obj57 = list17.get(10);
                t40 t40Var = t40.f;
                t40 t40Var2 = (f00.h(obj57, bool5) || obj57 == null) ? null : (t40) ((cv) lm0.s.f).g(obj57);
                Object obj58 = list17.get(11);
                f00.h(obj58, bool5);
                qc qcVar3 = obj58 != null ? obj58.equals(bool5) ? new qc(qc.g) : new qc(m10.b(((Integer) obj58).intValue())) : null;
                qcVar3.getClass();
                long j9 = qcVar3.a;
                Object obj59 = list17.get(12);
                bv0 bv0Var = (f00.h(obj59, bool5) || obj59 == null) ? null : (bv0) ((cv) lm0.j.f).g(obj59);
                Object obj60 = list17.get(13);
                yp0 yp0Var = yp0.d;
                return new yr0(j6, j7, iuVar2, guVar, huVar, (fu0) null, str9, j8, t7Var, ow0Var, t40Var2, j9, bv0Var, (f00.h(obj60, bool5) || obj60 == null) ? null : (yp0) ((cv) lm0.o.f).g(obj60), 49184);
            case 27:
                obj.getClass();
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                bool6.getClass();
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                (obj62 != null ? (lq) obj62 : null).getClass();
                return new xf0(zBooleanValue);
            case 28:
                obj.getClass();
                return new z30(((Integer) obj).intValue());
            default:
                obj.getClass();
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                ex0 ex0Var = obj63 != null ? (ex0) obj63 : null;
                ex0Var.getClass();
                int i13 = ex0Var.a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                bool7.getClass();
                return new fx0(i13, bool7.booleanValue());
        }
    }
}
