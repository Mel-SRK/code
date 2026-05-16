package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v11 {
    public static final Object a;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        zy0 zy0Var = k01.b;
        Float fValueOf2 = Float.valueOf(1.0f);
        ae0 ae0Var = new ae0(zy0Var, fValueOf2);
        ae0 ae0Var2 = new ae0(k01.h, fValueOf2);
        ae0 ae0Var3 = new ae0(k01.g, fValueOf2);
        ae0 ae0Var4 = new ae0(k01.a, Float.valueOf(0.01f));
        ae0 ae0Var5 = new ae0(k01.i, fValueOf);
        ae0 ae0Var6 = new ae0(k01.e, fValueOf);
        ae0 ae0Var7 = new ae0(k01.f, fValueOf);
        zy0 zy0Var2 = k01.c;
        Float fValueOf3 = Float.valueOf(0.1f);
        ae0[] ae0VarArr = {ae0Var, ae0Var2, ae0Var3, ae0Var4, ae0Var5, ae0Var6, ae0Var7, new ae0(zy0Var2, fValueOf3), new ae0(k01.d, fValueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(f00.aa(9));
        for (int i = 0; i < 9; i++) {
            ae0 ae0Var8 = ae0VarArr[i];
            linkedHashMap.put(ae0Var8.d, ae0Var8.e);
        }
        a = linkedHashMap;
    }
}
