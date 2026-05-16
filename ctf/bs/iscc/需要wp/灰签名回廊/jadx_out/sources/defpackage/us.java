package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import defpackage.i70;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class us implements ss {
    public final b1 a;
    public final b1 b;
    public final rs d;
    public j80 f;
    public gt h;
    public final gt c = new gt(null, 6);
    public final FocusOwnerImpl$modifier$1 e = new n70() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.n70
        public final i70 f() {
            return this.a.c;
        }

        @Override // defpackage.n70
        public final /* bridge */ /* synthetic */ void g(i70 i70Var) {
        }

        public final int hashCode() {
            return this.a.c.hashCode();
        }
    };
    public final m80 g = new m80(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public us(b1 b1Var, b1 b1Var2) {
        this.a = b1Var;
        this.b = b1Var2;
        this.d = new rs(this, b1Var2);
    }

    public final boolean a(boolean z) {
        da0 da0Var;
        gt gtVar = this.h;
        if (gtVar != null) {
            g(null);
            et etVar = et.d;
            et etVar2 = et.g;
            gtVar.bu(etVar, etVar2);
            if (!gtVar.d.q) {
                sy.b("visitAncestors called on an unattached node");
            }
            i70 i70Var = gtVar.d.h;
            s20 s20VarAy = pk.ay(gtVar);
            while (s20VarAy != null) {
                if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                    while (i70Var != null) {
                        if ((i70Var.f & 1024) != 0) {
                            a90 a90Var = null;
                            i70 i70VarM = i70Var;
                            while (i70VarM != null) {
                                if (i70VarM instanceof gt) {
                                    ((gt) i70VarM).bu(et.e, etVar2);
                                } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                    int i = 0;
                                    for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                        if ((i70Var2.f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i70VarM = i70Var2;
                                            } else {
                                                if (a90Var == null) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (i70VarM != null) {
                                                    a90Var.b(i70VarM);
                                                    i70VarM = null;
                                                }
                                                a90Var.b(i70Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i70VarM = pk.m(a90Var);
                            }
                        }
                        i70Var = i70Var.h;
                    }
                }
                s20VarAy = s20VarAy.q();
                i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = d41.ae(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                wc.l();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        b1 b1Var = this.a;
        if (b1Var.isFocused() || b1Var.hasFocus()) {
            b1Var.clearFocus();
        } else if (b1Var.hasFocus()) {
            View viewFindFocus = b1Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            b1Var.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [a90] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [a90] */
    /* JADX WARN: Type inference failed for: r0v24, types: [i70] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [i70] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r15v5, types: [i70] */
    /* JADX WARN: Type inference failed for: r15v9, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [a90] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [a90] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r14, defpackage.pu r15) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us.d(android.view.KeyEvent, pu):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [i70] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Boolean e(int i, ri0 ri0Var, cv cvVar) {
        Boolean bool;
        boolean zH;
        Object obj;
        da0 da0Var;
        gt gtVar = this.c;
        gt gtVarO = t1.o(gtVar);
        int i2 = 4;
        b1 b1Var = this.b;
        if (gtVarO != null) {
            e20 layoutDirection = b1Var.getLayoutDirection();
            bool = null;
            ws wsVarBv = gtVarO.bv();
            ys ysVar = wsVarBv.h;
            ys ysVar2 = wsVarBv.i;
            if (i == 1) {
                ysVar = wsVarBv.b;
            } else if (i == 2) {
                ysVar = wsVarBv.c;
            } else if (i == 5) {
                ysVar = wsVarBv.d;
            } else if (i == 6) {
                ysVar = wsVarBv.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        wc.l();
                        return null;
                    }
                    ysVar = ysVar2;
                }
                if (ysVar == ys.b) {
                    ysVar = null;
                }
                if (ysVar == null) {
                    ysVar = wsVarBv.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    ysVar = ysVar2;
                } else if (iOrdinal2 != 1) {
                    wc.l();
                    return null;
                }
                if (ysVar == ys.b) {
                    ysVar = null;
                }
                if (ysVar == null) {
                    ysVar = wsVarBv.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    wc.q("invalid FocusDirection");
                    return null;
                }
                us usVar = (us) pk.az(gtVarO).getFocusOwner();
                gt gtVar2 = usVar.h;
                if (i == 7) {
                    wsVarBv.j.getClass();
                } else {
                    wsVarBv.k.getClass();
                }
                ysVar = gtVar2 != usVar.h ? ys.d : ys.b;
            }
            if (!f00.h(ysVar, ys.c)) {
                if (f00.h(ysVar, ys.d)) {
                    gt gtVarO2 = t1.o(gtVar);
                    if (gtVarO2 != null) {
                        return (Boolean) cvVar.g(gtVarO2);
                    }
                } else if (!f00.h(ysVar, ys.b)) {
                    return Boolean.valueOf(ysVar.a(cvVar));
                }
            }
            return bool;
        }
        bool = null;
        gtVarO = null;
        e20 layoutDirection2 = b1Var.getLayoutDirection();
        g5 g5Var = new g5(gtVarO, this, cvVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zH = t1.s(gtVar, g5Var);
            } else {
                if (i != 2) {
                    wc.q("This function should only be used for 1-D focus search");
                    return null;
                }
                zH = t1.h(gtVar, g5Var);
            }
            return Boolean.valueOf(zH);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return q6.w(i, g5Var, gtVar, ri0Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    wc.l();
                    return null;
                }
                i2 = 3;
            }
            gt gtVarO3 = t1.o(gtVar);
            if (gtVarO3 != null) {
                return q6.w(i2, g5Var, gtVarO3, ri0Var);
            }
            return bool;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) ls.a(i))).toString());
        }
        gt gtVarO4 = t1.o(gtVar);
        boolean zBooleanValue = false;
        if (gtVarO4 == null) {
            obj = bool;
        } else {
            if (!gtVarO4.d.q) {
                sy.b("visitAncestors called on an unattached node");
            }
            Object obj2 = gtVarO4.d.h;
            s20 s20VarAy = pk.ay(gtVarO4);
            loop0: while (s20VarAy != null) {
                if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                    for (?? r3 = obj2; r3 != 0; r3 = r3.h) {
                        if ((r3.f & 1024) != 0) {
                            ?? M = r3;
                            ?? a90Var = bool;
                            while (M != 0) {
                                if (M instanceof gt) {
                                    gt gtVar3 = (gt) M;
                                    if (gtVar3.bv().a) {
                                        obj = gtVar3;
                                        break loop0;
                                    }
                                } else if ((M.f & 1024) != 0 && (M instanceof rl)) {
                                    i70 i70Var = ((rl) M).s;
                                    int i3 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var != null) {
                                        if ((i70Var.f & 1024) != 0) {
                                            i3++;
                                            a90Var = a90Var;
                                            if (i3 == 1) {
                                                M = i70Var;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = bool;
                                                }
                                                a90Var.b(i70Var);
                                            }
                                        }
                                        i70Var = i70Var.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                    }
                }
                s20VarAy = s20VarAy.q();
                obj2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? bool : (hu0) da0Var.i;
            }
            obj = bool;
        }
        if (obj != null && !obj.equals(gtVar)) {
            zBooleanValue = ((Boolean) g5Var.g(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean f(int i) {
        boolean zAb;
        View viewA;
        xi0 xi0Var = new xi0();
        xi0Var.d = Boolean.FALSE;
        gt gtVar = this.h;
        b1 b1Var = this.a;
        Boolean boolE = e(i, b1Var.getEmbeddedViewFocusRect(), new ts(xi0Var, i));
        if (!f00.h(boolE, Boolean.TRUE) || gtVar == this.h) {
            if (boolE != null && xi0Var.d != null) {
                if (!boolE.booleanValue() || !((Boolean) xi0Var.d).booleanValue()) {
                    if (i != 1 && i != 2) {
                        if (i != 7 && i != 8) {
                            Integer numAj = az0.aj(i);
                            if (numAj == null) {
                                wc.q("Invalid focus direction");
                                return false;
                            }
                            int iIntValue = numAj.intValue();
                            ri0 embeddedViewFocusRect = b1Var.getEmbeddedViewFocusRect();
                            Rect rectBe = embeddedViewFocusRect != null ? pk.be(embeddedViewFocusRect) : null;
                            Object obj = os.f.get();
                            obj.getClass();
                            os osVar = (os) obj;
                            if (rectBe == null) {
                                viewA = osVar.b(b1Var, b1Var.findFocus(), iIntValue);
                            } else {
                                osVar.a.set(rectBe);
                                Rect rect = osVar.a;
                                ArrayList<View> arrayList = osVar.e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        m10.i(b1Var, arrayList, b1Var.isInTouchMode());
                                    } else {
                                        b1Var.addFocusables(arrayList, iIntValue, b1Var.isInTouchMode() ? 1 : 0);
                                    }
                                    viewA = arrayList.isEmpty() ? null : osVar.a(iIntValue, rect, null, b1Var, arrayList);
                                    arrayList.clear();
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (viewA != null) {
                                zAb = az0.ab(viewA, Integer.valueOf(iIntValue), rectBe);
                            }
                            if (!zAb) {
                            }
                        }
                        zAb = false;
                        if (!zAb) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new x0(i, 2));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(gt gtVar) {
        s20 s20VarAy;
        po0 po0VarS;
        s20 s20VarAy2;
        po0 po0VarS2;
        gt gtVar2 = this.h;
        this.h = gtVar;
        m80 m80Var = this.g;
        Object[] objArr = m80Var.a;
        int i = m80Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            c0 c0Var = (c0) objArr[i2];
            c0Var.getClass();
            if (gtVar2 != null && (s20VarAy2 = pk.ay(gtVar2)) != null && (po0VarS2 = s20VarAy2.s()) != null && po0VarS2.d.b(oo0.f)) {
                ((AutofillManager) c0Var.a.e).notifyViewExited(c0Var.c, s20VarAy2.e);
            }
            if (gtVar != null && (s20VarAy = pk.ay(gtVar)) != null && (po0VarS = s20VarAy.s()) != null && po0VarS.d.b(oo0.f)) {
                int i3 = s20VarAy.e;
                c0Var.d.a.b(i3, new b0(c0Var, i3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (java.lang.Long.compare((((long) r4.d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        r3 = r4.a;
        r8 = r4.c;
        r9 = r4.b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = defpackage.h7.ba(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0141, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0143, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r13 = r13 ^ (r13 << 16);
        r14 = r13 >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | (((long) (r13 & 127)) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018a, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018d, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a0, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | (((long) (r13 & 127)) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c4, code lost:
    
        r3[r5] = (((long) (r13 & 127)) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ed, code lost:
    
        r33 = r7;
        r4.e = defpackage.mm0.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fe, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0200, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
    
        r3 = defpackage.mm0.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r3);
        r3 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021f, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022e, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0230, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026e, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0274, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027d, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0281, code lost:
    
        r32 = r3;
        r4.d++;
        r3 = r4.e;
        r5 = r4.a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029b, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029d, code lost:
    
        r21 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r4.e = r3 - r21;
        r3 = r4.c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0349, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x034b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us.h(android.view.KeyEvent):boolean");
    }
}
