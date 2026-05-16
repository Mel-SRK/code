package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ht implements Comparator {
    public static final ht b = new ht(0);
    public static final ht c = new ht(1);
    public static final ht d = new ht(2);
    public static final ht e = new ht(3);
    public static final ht f = new ht(4);
    public final /* synthetic */ int a;

    public /* synthetic */ ht(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gt gtVar = (gt) obj;
                gt gtVar2 = (gt) obj2;
                int i = 0;
                if (!t1.af(gtVar) || !t1.af(gtVar2)) {
                    if (t1.af(gtVar)) {
                        return -1;
                    }
                    return t1.af(gtVar2) ? 1 : 0;
                }
                s20 s20VarAy = pk.ay(gtVar);
                s20 s20VarAy2 = pk.ay(gtVar2);
                if (f00.h(s20VarAy, s20VarAy2)) {
                    return 0;
                }
                Object[] objArr = new s20[16];
                int i2 = 0;
                while (s20VarAy != null) {
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i2 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                    }
                    objArr[0] = s20VarAy;
                    i2++;
                    s20VarAy = s20VarAy.q();
                }
                Object[] objArr3 = new s20[16];
                int i4 = 0;
                while (s20VarAy2 != null) {
                    int i5 = i4 + 1;
                    if (objArr3.length < i5) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i4 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i4 + 0);
                    }
                    objArr3[0] = s20VarAy2;
                    i4++;
                    s20VarAy2 = s20VarAy2.q();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    while (f00.h(objArr[i], objArr3[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return f00.m(((s20) objArr[i]).r(), ((s20) objArr3[i]).r());
                }
                wc.q("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                ri0 ri0VarH = ((uo0) obj).h();
                ri0 ri0VarH2 = ((uo0) obj2).h();
                int iCompare = Float.compare(ri0VarH.a, ri0VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(ri0VarH.b, ri0VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(ri0VarH.d, ri0VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(ri0VarH.c, ri0VarH2.c);
            case 2:
                s20 s20Var = (s20) obj;
                s20 s20Var2 = (s20) obj2;
                int iM = f00.m(s20Var2.q, s20Var.q);
                return iM != 0 ? iM : f00.m(s20Var.hashCode(), s20Var2.hashCode());
            case 3:
                ri0 ri0VarH3 = ((uo0) obj).h();
                ri0 ri0VarH4 = ((uo0) obj2).h();
                int iCompare4 = Float.compare(ri0VarH4.c, ri0VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(ri0VarH3.b, ri0VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(ri0VarH3.d, ri0VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(ri0VarH4.a, ri0VarH3.a);
            case 4:
                ae0 ae0Var = (ae0) obj;
                ae0 ae0Var2 = (ae0) obj2;
                int iCompare7 = Float.compare(((ri0) ae0Var.d).b, ((ri0) ae0Var2.d).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((ri0) ae0Var.d).d, ((ri0) ae0Var2.d).d);
            case 5:
                return az0.t(Integer.valueOf(((a6) obj).b), Integer.valueOf(((a6) obj2).b));
            case 6:
                return az0.t(Integer.valueOf(((a6) obj).b), Integer.valueOf(((a6) obj2).b));
            default:
                s20 s20Var3 = (s20) obj;
                s20 s20Var4 = (s20) obj2;
                int iM2 = f00.m(s20Var3.q, s20Var4.q);
                return iM2 != 0 ? iM2 : f00.m(s20Var3.hashCode(), s20Var4.hashCode());
        }
    }
}
