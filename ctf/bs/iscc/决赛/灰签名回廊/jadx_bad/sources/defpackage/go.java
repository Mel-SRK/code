package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class go {
    public static final float a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (defpackage.xa0.b(defpackage.d41.ai(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yt0 yt0Var, long j, ki kiVar) {
        yn ynVar;
        wi0 wi0Var;
        Object objA;
        yj yjVar;
        Object obj;
        Object obj2;
        if (kiVar instanceof yn) {
            ynVar = (yn) kiVar;
            int i = ynVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ynVar.j = i - Integer.MIN_VALUE;
            } else {
                ynVar = new yn(kiVar);
            }
        }
        Object obj3 = ynVar.i;
        int i2 = ynVar.j;
        if (i2 == 0) {
            i60.az(obj3);
            if (!d(yt0Var.i.w, j)) {
                wi0Var = new wi0();
                wi0Var.d = j;
                ynVar.g = yt0Var;
                ynVar.h = wi0Var;
                ynVar.j = 1;
                objA = yt0Var.a(jg0.e, ynVar);
                yjVar = yj.d;
                if (objA != yjVar) {
                }
            }
            return null;
        }
        if (i2 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wi0 wi0Var2 = ynVar.h;
        yt0 yt0Var2 = ynVar.g;
        i60.az(obj3);
        wi0 wi0Var3 = wi0Var2;
        yt0Var = yt0Var2;
        ig0 ig0Var = (ig0) obj3;
        ?? r14 = ig0Var.a;
        int size = r14.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                obj = null;
                break;
            }
            obj = r14.get(i4);
            if (og0.a(((pg0) obj).a, wi0Var3.d)) {
                break;
            }
            i4++;
        }
        pg0 pg0Var = (pg0) obj;
        if (pg0Var == null) {
            if (d41.m(pg0Var)) {
                ?? r142 = ig0Var.a;
                int size2 = r142.size();
                while (true) {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r142.get(i3);
                    if (((pg0) obj2).d) {
                        break;
                    }
                    i3++;
                }
                pg0 pg0Var2 = (pg0) obj2;
                if (pg0Var2 != null) {
                    wi0Var3.d = pg0Var2.a;
                    wi0Var = wi0Var3;
                    ynVar.g = yt0Var;
                    ynVar.h = wi0Var;
                    ynVar.j = 1;
                    objA = yt0Var.a(jg0.e, ynVar);
                    yjVar = yj.d;
                    if (objA != yjVar) {
                        return yjVar;
                    }
                    wi0 wi0Var4 = wi0Var;
                    obj3 = objA;
                    wi0Var3 = wi0Var4;
                }
            }
            ig0 ig0Var2 = (ig0) obj3;
            ?? r143 = ig0Var2.a;
            int size3 = r143.size();
            int i32 = 0;
            int i42 = 0;
            while (true) {
                if (i42 < size3) {
                }
                i42++;
            }
            pg0 pg0Var3 = (pg0) obj;
            if (pg0Var3 == null) {
                pg0Var3 = null;
            }
        }
        if (pg0Var3 == null || pg0Var3.b()) {
            return null;
        }
        return pg0Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(yt0 yt0Var, long j, ki kiVar) {
        zn znVar;
        Object obj;
        pg0 pg0Var;
        xi0 xi0Var;
        if (kiVar instanceof zn) {
            znVar = (zn) kiVar;
            int i = znVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                znVar.j = i - Integer.MIN_VALUE;
            } else {
                znVar = new zn(kiVar);
            }
        }
        Object obj2 = znVar.i;
        int i2 = znVar.j;
        if (i2 == 0) {
            i60.az(obj2);
            if (!d(yt0Var.i.w, j)) {
                ?? r11 = yt0Var.i.w.a;
                int size = r11.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = r11.get(i3);
                    if (og0.a(((pg0) obj).a, j)) {
                        break;
                    }
                    i3++;
                }
                pg0Var = (pg0) obj;
                if (pg0Var != null) {
                    xi0 xi0Var2 = new xi0();
                    xi0 xi0Var3 = new xi0();
                    xi0Var3.d = pg0Var;
                    long jC = yt0Var.f().c();
                    try {
                        gv coVar = new co(xi0Var3, xi0Var2, null);
                        znVar.g = pg0Var;
                        znVar.h = xi0Var2;
                        znVar.j = 1;
                        Object objI = yt0Var.i(jC, coVar, znVar);
                        Object obj3 = yj.d;
                        if (objI == obj3) {
                            return obj3;
                        }
                    } catch (kg0 unused) {
                        xi0Var = xi0Var2;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xi0Var = znVar.h;
        pg0Var = znVar.g;
        try {
            i60.az(obj2);
            return null;
        } catch (kg0 unused2) {
        }
        pg0 pg0Var2 = (pg0) xi0Var.d;
        return pg0Var2 == null ? pg0Var : pg0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yt0 yt0Var, long j, cv cvVar, ki kiVar) {
        fo foVar;
        yj yjVar;
        pg0 pg0Var;
        if (kiVar instanceof fo) {
            foVar = (fo) kiVar;
            int i = foVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                foVar.j = i - Integer.MIN_VALUE;
            } else {
                foVar = new fo(kiVar);
            }
        }
        Object objA = foVar.i;
        int i2 = foVar.j;
        if (i2 == 0) {
            i60.az(objA);
            foVar.g = yt0Var;
            foVar.h = cvVar;
            foVar.j = 1;
            objA = a(yt0Var, j, foVar);
            yjVar = yj.d;
            if (objA == yjVar) {
            }
            pg0Var = (pg0) objA;
            if (pg0Var == null) {
            }
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cv cvVar2 = foVar.h;
            yt0 yt0Var2 = foVar.g;
            i60.az(objA);
            cvVar = cvVar2;
            yt0Var = yt0Var2;
            pg0Var = (pg0) objA;
            if (pg0Var == null) {
                if (d41.m(pg0Var)) {
                    return Boolean.TRUE;
                }
                cvVar.g(pg0Var);
                j = pg0Var.a;
                foVar.g = yt0Var;
                foVar.h = cvVar;
                foVar.j = 1;
                objA = a(yt0Var, j, foVar);
                yjVar = yj.d;
                if (objA == yjVar) {
                    return yjVar;
                }
                pg0Var = (pg0) objA;
                if (pg0Var == null) {
                    return Boolean.FALSE;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(ig0 ig0Var, long j) {
        Object obj;
        ?? r6 = ig0Var.a;
        int size = r6.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (og0.a(((pg0) obj).a, j)) {
                break;
            }
            i++;
        }
        pg0 pg0Var = (pg0) obj;
        if (pg0Var != null && pg0Var.d) {
            z = true;
        }
        return true ^ z;
    }
}
