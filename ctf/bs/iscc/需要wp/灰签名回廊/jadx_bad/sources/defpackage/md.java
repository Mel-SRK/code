package defpackage;

import androidx.compose.foundation.layout.b;
import com.example.gnd.MainActivity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md implements gv {
    public final /* synthetic */ int d;

    public /* synthetic */ md(int i) {
        this.d = 10;
    }

    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        nd ndVar;
        rl0 rl0Var;
        e6 e6Var;
        Object objA;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                nj njVar = (nj) obj2;
                str.getClass();
                njVar.getClass();
                if (str.length() == 0) {
                    return njVar.toString();
                }
                return str + ", " + njVar;
            case 1:
                vf vfVar = (vf) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e00.e(0, vfVar);
                } else {
                    vfVar.aq();
                }
                return wz0.a;
            case 2:
                vf vfVar2 = (vf) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (vfVar2.an(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ot0.a(b.b, null, ((zc) vfVar2.j(cd.a)).n, 0L, 0.0f, d41.a, vfVar2, 12582918, 122);
                } else {
                    vfVar2.aq();
                }
                return wz0.a;
            case 3:
                vf vfVar3 = (vf) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (vfVar3.an(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tx0.a(false, false, vfVar3, 384);
                } else {
                    vfVar3.aq();
                }
                return wz0.a;
            case 4:
                vf vfVar4 = (vf) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (vfVar4.an(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ww0.b("Enter Flag", null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, vfVar4, 6, 131070);
                } else {
                    vfVar4.aq();
                }
                return wz0.a;
            case 5:
                pj pjVar = (pj) obj;
                nj njVar2 = (nj) obj2;
                pjVar.getClass();
                njVar2.getClass();
                pj pjVarV = pjVar.v(njVar2.getKey());
                pq pqVar = pq.d;
                if (pjVarV == pqVar) {
                    return njVar2;
                }
                bw bwVar = bw.u;
                a aVar = (a) pjVarV.k(bwVar);
                if (aVar == null) {
                    ndVar = new nd(njVar2, pjVarV);
                } else {
                    pj pjVarV2 = pjVarV.v(bwVar);
                    if (pjVarV2 == pqVar) {
                        return new nd(aVar, njVar2);
                    }
                    ndVar = new nd(aVar, new nd(njVar2, pjVarV2));
                }
                return ndVar;
            case 6:
                return ((pj) obj).j((nj) obj2);
            case 7:
                return ((pj) obj).j((nj) obj2);
            case MainActivity.$stable /* 8 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 9:
                ql0 ql0Var = (ql0) obj;
                zv0 zv0Var = (zv0) obj2;
                List listZ = f00.z(Float.valueOf(zv0Var.a.g()), Boolean.valueOf(((wc0) zv0Var.e.getValue()) == wc0.d));
                int size = listZ.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = listZ.get(i);
                    if (obj3 != null && (rl0Var = ql0Var.e) != null && !rl0Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (listZ.isEmpty()) {
                    return null;
                }
                return new ArrayList(listZ);
            case 10:
                ((Integer) obj2).getClass();
                e00.e(d41.ar(1), (vf) obj);
                return wz0.a;
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                return obj2;
            case 13:
                b6 b6Var = (b6) obj2;
                return f00.i(b6Var.e, lm0.a(b6Var.d, lm0.a, (ql0) obj));
            case 14:
                return Integer.valueOf(((bv0) obj2).a);
            case 15:
                ow0 ow0Var = (ow0) obj2;
                return f00.i(Float.valueOf(ow0Var.a), Float.valueOf(ow0Var.b));
            case 16:
                ql0 ql0Var2 = (ql0) obj;
                pw0 pw0Var = (pw0) obj2;
                qx0 qx0Var = new qx0(pw0Var.a);
                km0 km0Var = lm0.q;
                return f00.i(lm0.a(qx0Var, km0Var, ql0Var2), lm0.a(new qx0(pw0Var.b), km0Var, ql0Var2));
            case 17:
                return Integer.valueOf(((iu) obj2).d);
            case 18:
                j40 j40Var = (j40) obj2;
                return f00.i(j40Var.a, lm0.a(j40Var.b, lm0.i, (ql0) obj));
            case 19:
                return Float.valueOf(((t7) obj2).a);
            case 20:
                ql0 ql0Var3 = (ql0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(lm0.a((a6) list.get(i2), lm0.b, ql0Var3));
                }
                return arrayList;
            case 21:
                hx0 hx0Var = (hx0) obj2;
                return f00.i(Integer.valueOf((int) (hx0Var.a >> 32)), Integer.valueOf((int) (hx0Var.a & 4294967295L)));
            case 22:
                ql0 ql0Var4 = (ql0) obj;
                yp0 yp0Var = (yp0) obj2;
                return f00.i(lm0.a(new qc(yp0Var.a), lm0.p, ql0Var4), lm0.a(new xa0(yp0Var.b), lm0.r, ql0Var4), Float.valueOf(yp0Var.c));
            case 23:
                qx0 qx0Var2 = (qx0) obj2;
                return qx0Var2 == null ? false : qx0.a(qx0Var2.a, qx0.c) ? Boolean.FALSE : f00.i(Float.valueOf(qx0.c(qx0Var2.a)), new rx0(qx0.b(qx0Var2.a)));
            case 24:
                xa0 xa0Var = (xa0) obj2;
                return xa0Var == null ? false : xa0.b(xa0Var.a, 9205357640488583168L) ? Boolean.FALSE : f00.i(Float.valueOf(Float.intBitsToFloat((int) (xa0Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xa0Var.a & 4294967295L))));
            case 25:
                ql0 ql0Var5 = (ql0) obj;
                ?? r2 = ((t40) obj2).d;
                ArrayList arrayList2 = new ArrayList(r2.size());
                int size3 = r2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.add(lm0.a((s40) r2.get(i3), lm0.t, ql0Var5));
                }
                return arrayList2;
            case 26:
                return ((s40) obj2).a.toLanguageTag();
            case 27:
                e40 e40Var = (e40) obj2;
                return f00.i(new b40(e40Var.a), new d40(e40Var.b), new c40());
            case 28:
                ql0 ql0Var6 = (ql0) obj;
                a6 a6Var = (a6) obj2;
                Object obj4 = a6Var.a;
                if (obj4 instanceof ge0) {
                    e6Var = e6.d;
                } else if (obj4 instanceof yr0) {
                    e6Var = e6.e;
                } else if (obj4 instanceof s01) {
                    e6Var = e6.f;
                } else if (obj4 instanceof g01) {
                    e6Var = e6.g;
                } else if (obj4 instanceof j40) {
                    e6Var = e6.h;
                } else if (obj4 instanceof i40) {
                    e6Var = e6.i;
                } else {
                    if (!(obj4 instanceof zs0)) {
                        throw new UnsupportedOperationException();
                    }
                    e6Var = e6.j;
                }
                switch (e6Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objA = lm0.a((ge0) obj4, lm0.g, ql0Var6);
                        break;
                    case 1:
                        obj4.getClass();
                        objA = lm0.a((yr0) obj4, lm0.h, ql0Var6);
                        break;
                    case 2:
                        obj4.getClass();
                        objA = lm0.a((s01) obj4, lm0.c, ql0Var6);
                        break;
                    case 3:
                        obj4.getClass();
                        objA = lm0.a((g01) obj4, lm0.d, ql0Var6);
                        break;
                    case 4:
                        obj4.getClass();
                        objA = lm0.a((j40) obj4, lm0.e, ql0Var6);
                        break;
                    case 5:
                        obj4.getClass();
                        objA = lm0.a((i40) obj4, lm0.f, ql0Var6);
                        break;
                    case 6:
                        obj4.getClass();
                        objA = ((zs0) obj4).a;
                        break;
                    default:
                        wc.l();
                        return null;
                }
                return f00.i(e6Var, objA, Integer.valueOf(a6Var.b), Integer.valueOf(a6Var.c), a6Var.d);
            default:
                i40 i40Var = (i40) obj2;
                return f00.i(i40Var.a, lm0.a(i40Var.b, lm0.i, (ql0) obj));
        }
    }

    public /* synthetic */ md(int i, byte b) {
        this.d = i;
    }
}
