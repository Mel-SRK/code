package defpackage;

import androidx.compose.runtime.internal.a;
import com.example.gnd.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w6 extends x10 implements gv {
    public static final w6 aa;
    public static final w6 ab;
    public static final w6 ac;
    public static final w6 ad;
    public static final w6 ae;
    public static final w6 af;
    public static final w6 ag;
    public static final w6 ah;
    public static final w6 f;
    public static final w6 g;
    public static final w6 h;
    public static final w6 i;
    public static final w6 j;
    public static final w6 k;
    public static final w6 l;
    public static final w6 m;
    public static final w6 n;
    public static final w6 o;
    public static final w6 p;
    public static final w6 q;
    public static final w6 r;
    public static final w6 s;
    public static final w6 t;
    public static final w6 u;
    public static final w6 v;
    public static final w6 w;
    public static final w6 x;
    public static final w6 y;
    public static final w6 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 2;
        f = new w6(i2, 0);
        g = new w6(i2, 1);
        h = new w6(i2, 2);
        i = new w6(i2, 3);
        j = new w6(i2, 4);
        k = new w6(i2, 5);
        l = new w6(i2, 6);
        m = new w6(i2, 7);
        n = new w6(i2, 8);
        o = new w6(i2, 9);
        p = new w6(i2, 10);
        q = new w6(i2, 11);
        r = new w6(i2, 12);
        s = new w6(i2, 13);
        t = new w6(i2, 14);
        u = new w6(i2, 15);
        v = new w6(i2, 16);
        w = new w6(i2, 17);
        x = new w6(i2, 18);
        y = new w6(i2, 19);
        z = new w6(i2, 20);
        aa = new w6(i2, 21);
        ab = new w6(i2, 22);
        ac = new w6(i2, 23);
        ad = new w6(i2, 24);
        ae = new w6(i2, 25);
        af = new w6(i2, 26);
        ag = new w6(i2, 27);
        ah = new w6(i2, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [a90] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        String str;
        ov ovVar;
        switch (this.e) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((e20) obj2) != e20.d ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
            case 1:
                String str2 = (String) obj;
                h70 h70Var = (h70) obj2;
                if (str2.length() == 0) {
                    return h70Var.toString();
                }
                return str2 + ", " + h70Var;
            case 2:
                vf vfVar = (vf) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vfVar.aq();
                }
                return wz0.a;
            case 3:
                vf vfVar2 = (vf) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!vfVar2.an(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vfVar2.aq();
                }
                return wz0.a;
            case 4:
                ((Number) obj2).intValue();
                ((kf) obj).getClass();
                return wz0.a;
            case 5:
                p60 p60Var = (p60) obj2;
                s20 s20Var = (s20) ((kf) obj);
                if (!f00.h(s20Var.x, p60Var)) {
                    s20Var.x = p60Var;
                    f1 f1Var = s20Var.y;
                    if (f1Var != null) {
                        ((me0) f1Var.f).setValue(p60Var);
                    }
                    s20Var.aa();
                }
                return wz0.a;
            case 6:
                ((s20) ((kf) obj)).aw((j70) obj2);
                return wz0.a;
            case 7:
                mg mgVar = (mg) obj2;
                s20 s20Var2 = (s20) ((kf) obj);
                s20Var2.ac = mgVar;
                da0 da0Var = s20Var2.ag;
                xs0 xs0Var = og.h;
                a aVar = (a) mgVar;
                aVar.getClass();
                s20Var2.at((em) d41.aj(aVar, xs0Var));
                e20 e20Var = (e20) d41.aj(aVar, og.n);
                if (s20Var2.aa != e20Var) {
                    s20Var2.aa = e20Var;
                    s20Var2.aa();
                    s20 s20VarQ = s20Var2.q();
                    if (s20VarQ != null) {
                        s20VarQ.x();
                    }
                    s20Var2.z();
                    for (i70 i70Var = (i70) da0Var.j; i70Var != null; i70Var = i70Var.i) {
                        i70Var.bf();
                    }
                }
                s20Var2.ax((i11) d41.aj(aVar, og.s));
                i70 i70Var2 = (i70) da0Var.j;
                if ((i70Var2.g & 32768) != 0) {
                    while (i70Var2 != null) {
                        if ((i70Var2.f & 32768) != 0) {
                            ?? M = i70Var2;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof kg) {
                                    i70 i70Var3 = ((i70) ((kg) M)).d;
                                    if (i70Var3.q) {
                                        ga0.c(i70Var3);
                                    } else {
                                        i70Var3.m = true;
                                    }
                                } else if ((M.f & 32768) != 0 && (M instanceof rl)) {
                                    i70 i70Var4 = ((rl) M).s;
                                    int i2 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var4 != null) {
                                        if ((i70Var4.f & 32768) != 0) {
                                            i2++;
                                            a90Var = a90Var;
                                            if (i2 == 1) {
                                                M = i70Var4;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var4);
                                            }
                                        }
                                        i70Var4 = i70Var4.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                        if ((i70Var2.g & 32768) != 0) {
                            i70Var2 = i70Var2.i;
                        }
                    }
                }
                return wz0.a;
            case MainActivity.$stable /* 8 */:
                return Integer.valueOf(((k60) obj).f(((Number) obj2).intValue()));
            case 9:
                return Integer.valueOf(((k60) obj).aw(((Number) obj2).intValue()));
            case 10:
                return Integer.valueOf(((k60) obj).ax(((Number) obj2).intValue()));
            case 11:
                return Integer.valueOf(((k60) obj).ap(((Number) obj2).intValue()));
            case 12:
                return Integer.valueOf(((ym0) obj2).a.g());
            case 13:
                return (i2) obj;
            case 14:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 15:
                return (nh) obj;
            case 16:
                return (wz0) obj;
            case 17:
                return (wz0) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 19:
                return (wz0) obj;
            case 20:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 21:
                sk0 sk0Var = (sk0) obj;
                ((sk0) obj2).getClass();
                return sk0Var;
            case 22:
                return (aq0) obj;
            case 23:
                return (String) obj;
            case 24:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 25:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 26:
                return (String) obj;
            case 27:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            default:
                ah ahVar = (ah) obj;
                ah ahVar2 = (ah) obj2;
                if (ahVar == null || (str = ahVar.a) == null) {
                    str = ahVar2.a;
                }
                if (ahVar == null || (ovVar = ahVar.b) == null) {
                    ovVar = ahVar2.b;
                }
                return new ah(str, ovVar);
        }
    }
}
