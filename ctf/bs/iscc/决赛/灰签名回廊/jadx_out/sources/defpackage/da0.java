package defpackage;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class da0 {
    public final /* synthetic */ int a = 1;
    public a90 b;
    public a90 c;
    public final a90 d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public da0() {
        a90 a90Var = new a90(new cj0[16]);
        this.b = a90Var;
        int i = nm0.a;
        this.g = new r80();
        this.c = a90Var;
        this.d = new a90(new Object[16]);
        this.h = new a90(new pu[16]);
    }

    public static final void a(da0 da0Var, i70 i70Var, fa0 fa0Var) {
        for (i70 i70Var2 = i70Var.h; i70Var2 != null; i70Var2 = i70Var2.h) {
            if (i70Var2 == ((ca0) da0Var.f)) {
                s20 s20VarQ = ((s20) da0Var.e).q();
                fa0Var.t = s20VarQ != null ? (yy) s20VarQ.ag.g : null;
                da0Var.h = fa0Var;
                return;
            } else {
                if ((i70Var2.f & 2) != 0) {
                    return;
                }
                i70Var2.bt(fa0Var);
            }
        }
    }

    public static i70 c(h70 h70Var, i70 i70Var) {
        i70 i70VarF;
        if (h70Var instanceof n70) {
            i70VarF = ((n70) h70Var).f();
            i70VarF.f = ga0.f(i70VarF);
        } else {
            r7 r7Var = new r7();
            r7Var.f = ga0.d(h70Var);
            r7Var.r = h70Var;
            new HashSet();
            i70VarF = r7Var;
        }
        if (i70VarF.q) {
            sy.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        i70VarF.l = true;
        i70 i70Var2 = i70Var.i;
        if (i70Var2 != null) {
            i70Var2.h = i70VarF;
            i70VarF.i = i70Var2;
        }
        i70Var.i = i70VarF;
        i70VarF.h = i70Var;
        return i70VarF;
    }

    public static i70 d(i70 i70Var) {
        boolean z = i70Var.q;
        if (z) {
            l80 l80Var = ga0.a;
            if (!z) {
                sy.b("autoInvalidateRemovedNode called on unattached node");
            }
            ga0.a(i70Var, -1, 2);
            i70Var.br();
            i70Var.bl();
        }
        i70 i70Var2 = i70Var.i;
        i70 i70Var3 = i70Var.h;
        if (i70Var2 != null) {
            i70Var2.h = i70Var3;
            i70Var.i = null;
        }
        if (i70Var3 != null) {
            i70Var3.i = i70Var2;
            i70Var.h = null;
        }
        i70Var3.getClass();
        return i70Var3;
    }

    public static void m(h70 h70Var, h70 h70Var2, i70 i70Var) {
        if ((h70Var instanceof n70) && (h70Var2 instanceof n70)) {
            i70Var.getClass();
            ((n70) h70Var2).g(i70Var);
            if (i70Var.q) {
                ga0.c(i70Var);
                return;
            } else {
                i70Var.m = true;
                return;
            }
        }
        if (!(i70Var instanceof r7)) {
            sy.b("Unknown Modifier.Node type");
            return;
        }
        r7 r7Var = (r7) i70Var;
        boolean z = r7Var.q;
        if (z) {
            if (!z) {
                sy.b("unInitializeModifier called on unattached node");
            }
            if ((r7Var.f & 8) != 0) {
                pk.az(r7Var).y();
            }
        }
        r7Var.r = h70Var2;
        r7Var.f = ga0.d(h70Var2);
        if (r7Var.q) {
            r7Var.bu(false);
        }
        if (i70Var.q) {
            ga0.c(i70Var);
        } else {
            i70Var.m = true;
        }
    }

    public void b() {
        this.e = null;
        this.f = null;
        a90 a90Var = this.b;
        a90Var.g();
        ((r80) this.g).b();
        this.c = a90Var;
        this.d.g();
        ((a90) this.h).g();
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public void e() {
        Set set = (Set) this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bj0 bj0Var = (bj0) it.next();
                it.remove();
                bj0Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public void f() {
        a90 a90Var = this.b;
        Set set = (Set) this.e;
        if (set == null) {
            return;
        }
        a90 a90Var2 = this.d;
        if (a90Var2.f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                r80 r80Var = (r80) this.i;
                int i = a90Var2.f;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = a90Var2.d[i];
                    try {
                        if (obj instanceof cj0) {
                            bj0 bj0Var = ((cj0) obj).a;
                            set.remove(bj0Var);
                            bj0Var.e();
                        }
                        if (obj instanceof s20) {
                            if (r80Var == null || !r80Var.c(obj)) {
                                ((s20) obj).aj();
                            } else {
                                da0 da0Var = ((s20) obj).ag;
                                fa0 fa0Var = ((yy) da0Var.g).s;
                                for (fa0 fa0Var2 = (fa0) da0Var.h; !f00.h(fa0Var2, fa0Var) && fa0Var2 != null; fa0Var2 = fa0Var2.s) {
                                    fa0Var2.Q();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        gg ggVar = (gg) this.f;
                        if (ggVar != null) {
                            f00.aj(th, new fg(0, ggVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (a90Var.f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.e;
                if (set2 != null) {
                    Object[] objArr = a90Var.d;
                    int i2 = a90Var.f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        cj0 cj0Var = (cj0) objArr[i3];
                        bj0 bj0Var2 = cj0Var.a;
                        set2.remove(bj0Var2);
                        try {
                            bj0Var2.c();
                        } catch (Throwable th2) {
                            gg ggVar2 = (gg) this.f;
                            if (ggVar2 != null) {
                                f00.aj(th2, new fg(0, ggVar2, cj0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void g(cj0 cj0Var) {
        a90 a90Var = this.b;
        r80 r80Var = (r80) this.g;
        if (r80Var.c(cj0Var)) {
            r80Var.k(cj0Var);
            if (!this.c.i(cj0Var) && !a90Var.i(cj0Var)) {
                Object[] objArr = a90Var.d;
                int i = a90Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((cj0) objArr[i2]).a instanceof qe0) {
                        throw null;
                    }
                }
            }
            Set set = (Set) this.e;
            if (set == null) {
                return;
            } else {
                set.add(cj0Var.a);
            }
        }
        this.d.b(cj0Var);
    }

    public boolean h(int i) {
        return (i & ((i70) this.j).g) != 0;
    }

    public void i(Set set, gg ggVar) {
        b();
        this.e = set;
        this.f = ggVar;
    }

    public void j() {
        for (i70 i70Var = (i70) this.j; i70Var != null; i70Var = i70Var.i) {
            i70Var.bq();
            if (i70Var.l) {
                l80 l80Var = ga0.a;
                if (!i70Var.q) {
                    sy.b("autoInvalidateInsertedNode called on unattached node");
                }
                ga0.a(i70Var, -1, 1);
            }
            if (i70Var.m) {
                ga0.c(i70Var);
            }
            i70Var.l = false;
            i70Var.m = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r32, defpackage.a90 r33, defpackage.a90 r34, defpackage.i70 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da0.k(int, a90, a90, i70, boolean):void");
    }

    public void l() {
        n20 n20Var;
        rd0 rd0Var;
        s20 s20Var = (s20) this.e;
        fa0 fa0Var = (yy) this.g;
        for (i70 i70Var = ((hu0) this.i).h; i70Var != null; i70Var = i70Var.h) {
            l20 l20VarO = pk.o(i70Var);
            if (l20VarO != null) {
                fa0 fa0Var2 = i70Var.k;
                if (fa0Var2 != null) {
                    n20Var = (n20) fa0Var2;
                    l20 l20Var = n20Var.ar;
                    n20Var.f0(l20VarO);
                    if (l20Var != i70Var && (rd0Var = n20Var.al) != null) {
                        ((lw) rd0Var).c();
                    }
                } else {
                    n20Var = new n20(s20Var, l20VarO);
                    i70Var.bt(n20Var);
                }
                fa0Var.t = n20Var;
                n20Var.s = fa0Var;
                fa0Var = n20Var;
            } else {
                i70Var.bt(fa0Var);
            }
        }
        s20 s20VarQ = s20Var.q();
        fa0Var.t = s20VarQ != null ? (yy) s20VarQ.ag.g : null;
        this.h = fa0Var;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                i70 i70Var = (i70) this.j;
                hu0 hu0Var = (hu0) this.i;
                if (i70Var == hu0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (i70Var != null && i70Var != hu0Var) {
                            sb.append(String.valueOf(i70Var));
                            if (i70Var.i == hu0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                i70Var = i70Var.i;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public da0(s20 s20Var) {
        this.e = s20Var;
        ca0 ca0Var = new ca0();
        ca0Var.g = -1;
        this.f = ca0Var;
        yy yyVar = new yy(s20Var);
        this.g = yyVar;
        this.h = yyVar;
        hu0 hu0Var = yyVar.ar;
        this.i = hu0Var;
        this.j = hu0Var;
        this.d = new a90(new j70[16]);
    }
}
