package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class su0 {
    public static final iu0 a = new iu0(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yt0 yt0Var, s7 s7Var) {
        ku0 ku0Var;
        yj yjVar;
        int size;
        int i;
        int i2;
        int size2;
        if (s7Var instanceof ku0) {
            ku0Var = (ku0) s7Var;
            int i3 = ku0Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ku0Var.i = i3 - Integer.MIN_VALUE;
            } else {
                ku0Var = new ku0(s7Var);
            }
        }
        Object objA = ku0Var.h;
        int i4 = ku0Var.i;
        if (i4 == 0) {
            i60.az(objA);
            ku0Var.g = yt0Var;
            ku0Var.i = 1;
            objA = yt0Var.a(jg0.e, ku0Var);
            yjVar = yj.d;
            if (objA == yjVar) {
            }
            ig0 ig0Var = (ig0) objA;
            ?? r1 = ig0Var.a;
            size = r1.size();
            i = 0;
            while (i2 < size) {
            }
            ?? r8 = ig0Var.a;
            size2 = r8.size();
            while (i < size2) {
            }
            return wz0.a;
        }
        if (i4 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yt0Var = ku0Var.g;
        i60.az(objA);
        ig0 ig0Var2 = (ig0) objA;
        ?? r12 = ig0Var2.a;
        size = r12.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((pg0) r12.get(i2)).a();
        }
        ?? r82 = ig0Var2.a;
        size2 = r82.size();
        while (i < size2) {
            if (((pg0) r82.get(i)).d) {
                ku0Var.g = yt0Var;
                ku0Var.i = 1;
                objA = yt0Var.a(jg0.e, ku0Var);
                yjVar = yj.d;
                if (objA == yjVar) {
                    return yjVar;
                }
                ig0 ig0Var22 = (ig0) objA;
                ?? r122 = ig0Var22.a;
                size = r122.size();
                i = 0;
                while (i2 < size) {
                }
                ?? r822 = ig0Var22.a;
                size2 = r822.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return wz0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(defpackage.yt0 r9, boolean r10, defpackage.jg0 r11, defpackage.s7 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ju0
            if (r0 == 0) goto L13
            r0 = r12
            ju0 r0 = (defpackage.ju0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ju0 r0 = new ju0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r9 = r0.i
            jg0 r10 = r0.h
            yt0 r11 = r0.g
            defpackage.i60.az(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4a
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r9)
            r9 = 0
            return r9
        L36:
            defpackage.i60.az(r12)
        L39:
            r0.g = r9
            r0.h = r11
            r0.i = r10
            r0.k = r2
            java.lang.Object r12 = r9.a(r11, r0)
            yj r1 = defpackage.yj.d
            if (r12 != r1) goto L4a
            return r1
        L4a:
            ig0 r12 = (defpackage.ig0) r12
            java.lang.Object r1 = r12.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L54:
            if (r5 >= r3) goto L7b
            java.lang.Object r6 = r1.get(r5)
            pg0 r6 = (defpackage.pg0) r6
            if (r10 == 0) goto L70
            boolean r7 = r6.b()
            if (r7 != 0) goto L6e
            boolean r7 = r6.h
            if (r7 != 0) goto L6e
            boolean r6 = r6.d
            if (r6 == 0) goto L6e
            r6 = r2
            goto L74
        L6e:
            r6 = r4
            goto L74
        L70:
            boolean r6 = defpackage.d41.k(r6)
        L74:
            if (r6 != 0) goto L78
            r1 = r4
            goto L7c
        L78:
            int r5 = r5 + 1
            goto L54
        L7b:
            r1 = r2
        L7c:
            if (r1 == 0) goto L39
            java.lang.Object r9 = r12.a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su0.b(yt0, boolean, jg0, s7):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009d -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(yt0 yt0Var, jg0 jg0Var, s7 s7Var) {
        ru0 ru0Var;
        yt0 yt0Var2;
        jg0 jg0Var2;
        int size;
        int i;
        if (s7Var instanceof ru0) {
            ru0Var = (ru0) s7Var;
            int i2 = ru0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ru0Var.j = i2 - Integer.MIN_VALUE;
            } else {
                ru0Var = new ru0(s7Var);
            }
        }
        Object objA = ru0Var.i;
        int i3 = ru0Var.j;
        yj yjVar = yj.d;
        if (i3 == 0) {
            i60.az(objA);
            ru0Var.g = yt0Var;
            ru0Var.h = jg0Var;
            ru0Var.j = 1;
            objA = yt0Var.a(jg0Var, ru0Var);
            if (objA != yjVar) {
            }
            return yjVar;
        }
        if (i3 == 1) {
            jg0Var2 = ru0Var.h;
            yt0Var2 = ru0Var.g;
            i60.az(objA);
            ?? r15 = ((ig0) objA).a;
            size = r15.size();
            while (i < size) {
            }
            return r15.get(0);
        }
        if (i3 != 2) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jg0Var2 = ru0Var.h;
        yt0Var2 = ru0Var.g;
        i60.az(objA);
        yt0 yt0Var3 = yt0Var2;
        jg0Var = jg0Var2;
        yt0Var = yt0Var3;
        ?? r152 = ((ig0) objA).a;
        int size2 = r152.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((pg0) r152.get(i4)).b()) {
                return null;
            }
        }
        ru0Var.g = yt0Var;
        ru0Var.h = jg0Var;
        ru0Var.j = 1;
        objA = yt0Var.a(jg0Var, ru0Var);
        if (objA != yjVar) {
            jg0 jg0Var3 = jg0Var;
            yt0Var2 = yt0Var;
            jg0Var2 = jg0Var3;
            ?? r153 = ((ig0) objA).a;
            size = r153.size();
            for (i = 0; i < size; i++) {
                if (!d41.l((pg0) r153.get(i))) {
                    int size3 = r153.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        pg0 pg0Var = (pg0) r153.get(i5);
                        if (pg0Var.b() || d41.ab(pg0Var, yt0Var2.i.ab, yt0Var2.d())) {
                            return null;
                        }
                    }
                    ru0Var.g = yt0Var2;
                    ru0Var.h = jg0Var2;
                    ru0Var.j = 2;
                    objA = yt0Var2.a(jg0.f, ru0Var);
                }
            }
            return r153.get(0);
        }
        return yjVar;
    }
}
