package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements p60 {
    public final cv a;
    public final boolean b;
    public final float c;
    public final wd0 d;

    public nd0(cv cvVar, boolean z, float f, wd0 wd0Var) {
        this.a = cvVar;
        this.b = z;
        this.c = f;
        this.d = wd0Var;
    }

    public final int a(a00 a00Var, List list, int i, gv gvVar) {
        Object obj;
        int iAw;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (f00.h(qv0.c((k60) obj), "Leading")) {
                break;
            }
            i3++;
        }
        k60 k60Var = (k60) obj;
        if (k60Var != null) {
            iAw = i == Integer.MAX_VALUE ? i : i - k60Var.aw(Integer.MAX_VALUE);
            iIntValue = ((Number) gvVar.f(k60Var, Integer.valueOf(i))).intValue();
        } else {
            iAw = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (f00.h(qv0.c((k60) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        k60 k60Var2 = (k60) obj2;
        if (k60Var2 != null) {
            int iAw2 = k60Var2.aw(Integer.MAX_VALUE);
            if (iAw != Integer.MAX_VALUE) {
                iAw -= iAw2;
            }
            iIntValue2 = ((Number) gvVar.f(k60Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (f00.h(qv0.c((k60) obj3), "Label")) {
                break;
            }
            i5++;
        }
        Object obj8 = (k60) obj3;
        int iIntValue4 = obj8 != null ? ((Number) gvVar.f(obj8, Integer.valueOf(m10.aj(this.c, iAw, i)))).intValue() : 0;
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (f00.h(qv0.c((k60) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        k60 k60Var3 = (k60) obj4;
        if (k60Var3 != null) {
            iIntValue3 = ((Number) gvVar.f(k60Var3, Integer.valueOf(iAw))).intValue();
            int iAw3 = k60Var3.aw(Integer.MAX_VALUE);
            if (iAw != Integer.MAX_VALUE) {
                iAw -= iAw3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (f00.h(qv0.c((k60) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        k60 k60Var4 = (k60) obj5;
        if (k60Var4 != null) {
            int iIntValue5 = ((Number) gvVar.f(k60Var4, Integer.valueOf(iAw))).intValue();
            int iAw4 = k60Var4.aw(Integer.MAX_VALUE);
            if (iAw != Integer.MAX_VALUE) {
                iAw -= iAw4;
            }
            i2 = iIntValue5;
        } else {
            i2 = 0;
        }
        int size6 = list.size();
        for (int i8 = 0; i8 < size6; i8++) {
            Object obj9 = list.get(i8);
            if (f00.h(qv0.c((k60) obj9), "TextField")) {
                int iIntValue6 = ((Number) gvVar.f(obj9, Integer.valueOf(iAw))).intValue();
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    if (f00.h(qv0.c((k60) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                }
                Object obj10 = (k60) obj6;
                int iIntValue7 = obj10 != null ? ((Number) gvVar.f(obj10, Integer.valueOf(iAw))).intValue() : 0;
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i10);
                    if (f00.h(qv0.c((k60) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i10++;
                }
                Object obj12 = (k60) obj7;
                return ld0.c(iIntValue, iIntValue2, iIntValue3, i2, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) gvVar.f(obj12, Integer.valueOf(i))).intValue() : 0, this.c, qv0.a, a00Var.b(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.p60
    public final int b(a00 a00Var, List list, int i) {
        return a(a00Var, list, i, w6.n);
    }

    public final int c(a00 a00Var, List list, int i, gv gvVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (f00.h(qv0.c((k60) obj7), "TextField")) {
                int iIntValue = ((Number) gvVar.f(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (f00.h(qv0.c((k60) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                k60 k60Var = (k60) obj2;
                int iIntValue2 = k60Var != null ? ((Number) gvVar.f(k60Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (f00.h(qv0.c((k60) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                k60 k60Var2 = (k60) obj3;
                int iIntValue3 = k60Var2 != null ? ((Number) gvVar.f(k60Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (f00.h(qv0.c((k60) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                k60 k60Var3 = (k60) obj4;
                int iIntValue4 = k60Var3 != null ? ((Number) gvVar.f(k60Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (f00.h(qv0.c((k60) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                k60 k60Var4 = (k60) obj5;
                int iIntValue5 = k60Var4 != null ? ((Number) gvVar.f(k60Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (f00.h(qv0.c((k60) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                k60 k60Var5 = (k60) obj6;
                int iIntValue6 = k60Var5 != null ? ((Number) gvVar.f(k60Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (f00.h(qv0.c((k60) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                k60 k60Var6 = (k60) obj;
                return ld0.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, k60Var6 != null ? ((Number) gvVar.f(k60Var6, Integer.valueOf(i))).intValue() : 0, this.c, qv0.a, a00Var.b(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.p60
    public final int d(a00 a00Var, List list, int i) {
        return c(a00Var, list, i, w6.o);
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        lf0 lf0Var;
        lf0 lf0VarE;
        Object obj4;
        int i;
        lf0 lf0VarE2;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        int i3;
        nd0 nd0Var = this;
        List list2 = list;
        wd0 wd0Var = nd0Var.d;
        int iAi = r60Var.ai(wd0Var.d);
        long jA = dh.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i4);
            if (f00.h(a.a((k60) obj), "Leading")) {
                break;
            }
            i4++;
        }
        k60 k60Var = (k60) obj;
        lf0 lf0VarE3 = k60Var != null ? k60Var.e(jA) : null;
        float f = qv0.b;
        int i5 = lf0VarE3 != null ? lf0VarE3.d : 0;
        int iMax = Math.max(0, lf0VarE3 != null ? lf0VarE3.e : 0);
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i6);
            if (f00.h(a.a((k60) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        k60 k60Var2 = (k60) obj2;
        lf0 lf0VarE4 = k60Var2 != null ? k60Var2.e(eh.j(jA, -i5, 0, 2)) : null;
        int i7 = i5 + (lf0VarE4 != null ? lf0VarE4.d : 0);
        int iMax2 = Math.max(iMax, lf0VarE4 != null ? lf0VarE4.e : 0);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i8);
            if (f00.h(a.a((k60) obj3), "Prefix")) {
                break;
            }
            i8++;
        }
        k60 k60Var3 = (k60) obj3;
        if (k60Var3 != null) {
            lf0Var = lf0VarE3;
            lf0VarE = k60Var3.e(eh.j(jA, -i7, 0, 2));
        } else {
            lf0Var = lf0VarE3;
            lf0VarE = null;
        }
        int i9 = i7 + (lf0VarE != null ? lf0VarE.d : 0);
        int iMax3 = Math.max(iMax2, lf0VarE != null ? lf0VarE.e : 0);
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i10);
            if (f00.h(a.a((k60) obj4), "Suffix")) {
                break;
            }
            i10++;
        }
        k60 k60Var4 = (k60) obj4;
        if (k60Var4 != null) {
            i = i9;
            lf0VarE2 = k60Var4.e(eh.j(jA, -i9, 0, 2));
        } else {
            i = i9;
            lf0VarE2 = null;
        }
        int i11 = i + (lf0VarE2 != null ? lf0VarE2.d : 0);
        int iMax4 = Math.max(iMax3, lf0VarE2 != null ? lf0VarE2.e : 0);
        int iAi2 = r60Var.ai(wd0Var.b(r60Var.getLayoutDirection())) + r60Var.ai(wd0Var.a(r60Var.getLayoutDirection()));
        int i12 = -i11;
        int iAj = m10.aj(nd0Var.c, i12 - iAi2, -iAi2);
        int i13 = -iAi;
        long jI = eh.i(iAj, i13, jA);
        int size5 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i14);
            int i15 = i14;
            int i16 = size5;
            if (f00.h(a.a((k60) obj5), "Label")) {
                break;
            }
            i14 = i15 + 1;
            size5 = i16;
        }
        k60 k60Var5 = (k60) obj5;
        lf0 lf0VarE5 = k60Var5 != null ? k60Var5.e(jI) : null;
        nd0Var.a.g(new pq0(lf0VarE5 != null ? lI.a(lf0VarE5.d, lf0VarE5.e) : 0L));
        int size6 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i2 = i13;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i17);
            int i18 = size6;
            i2 = i13;
            if (f00.h(a.a((k60) obj6), "Supporting")) {
                break;
            }
            i17++;
            i13 = i2;
            size6 = i18;
        }
        k60 k60Var6 = (k60) obj6;
        int iAx = k60Var6 != null ? k60Var6.ax(dh.j(j)) : 0;
        int iMax5 = Math.max((lf0VarE5 != null ? lf0VarE5.e : 0) / 2, r60Var.ai(wd0Var.b));
        long j2 = jA;
        long jA2 = dh.a(eh.i(i12, (i2 - iMax5) - iAx, j), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i19 = 0;
        while (i19 < size7) {
            k60 k60Var7 = (k60) list2.get(i19);
            int i20 = size7;
            if (f00.h(a.a(k60Var7), "TextField")) {
                lf0 lf0VarE6 = k60Var7.e(jA2);
                long jA3 = dh.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i21);
                    int i22 = size8;
                    if (f00.h(a.a((k60) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i21++;
                    size8 = i22;
                }
                k60 k60Var8 = (k60) obj7;
                lf0 lf0VarE7 = k60Var8 != null ? k60Var8.e(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(lf0VarE6.e, lf0VarE7 != null ? lf0VarE7.e : 0) + iMax5 + iAi);
                lf0 lf0Var2 = lf0Var;
                int iD = ld0.d(lf0Var != null ? lf0Var2.d : 0, lf0VarE4 != null ? lf0VarE4.d : 0, lf0VarE != null ? lf0VarE.d : 0, lf0VarE2 != null ? lf0VarE2.d : 0, lf0VarE6.d, lf0VarE5 != null ? lf0VarE5.d : 0, lf0VarE7 != null ? lf0VarE7.d : 0, nd0Var.c, j, r60Var.b(), nd0Var.d);
                int i23 = 0;
                lf0 lf0VarE8 = k60Var6 != null ? k60Var6.e(dh.a(eh.j(j2, 0, -iMax6, 1), 0, iD, 0, 0, 9)) : null;
                int i24 = lf0VarE8 != null ? lf0VarE8.e : 0;
                if (lf0Var2 != null) {
                    i23 = lf0Var2.e;
                    i3 = 0;
                } else {
                    i3 = 0;
                }
                lf0 lf0Var3 = lf0VarE8;
                int iC = ld0.c(i23, lf0VarE4 != null ? lf0VarE4.e : i3, lf0VarE != null ? lf0VarE.e : i3, lf0VarE2 != null ? lf0VarE2.e : i3, lf0VarE6.e, lf0VarE5 != null ? lf0VarE5.e : 0, lf0VarE7 != null ? lf0VarE7.e : 0, lf0VarE8 != null ? lf0VarE8.e : 0, nd0Var.c, j, r60Var.b(), nd0Var.d);
                int i25 = iC - i24;
                int size9 = list.size();
                int i26 = 0;
                while (i26 < size9) {
                    k60 k60Var9 = (k60) list.get(i26);
                    int i27 = iC;
                    lf0 lf0Var4 = lf0VarE5;
                    if (f00.h(a.a(k60Var9), "Container")) {
                        return r60Var.av(iD, i27, sq.d, new md0(i27, iD, lf0Var2, lf0VarE4, lf0VarE, lf0VarE2, lf0VarE6, lf0Var4, lf0VarE7, k60Var9.e(eh.a(iD != Integer.MAX_VALUE ? iD : 0, iD, i25 != Integer.MAX_VALUE ? i25 : 0, i25)), lf0Var3, nd0Var, r60Var));
                    }
                    iC = i27;
                    i26++;
                    nd0Var = this;
                    lf0VarE6 = lf0VarE6;
                    lf0Var3 = lf0Var3;
                    lf0VarE2 = lf0VarE2;
                    lf0VarE5 = lf0Var4;
                    lf0VarE7 = lf0VarE7;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i19++;
            nd0Var = this;
            j2 = j2;
            list2 = list2;
            size7 = i20;
            jA2 = jA2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.p60
    public final int h(a00 a00Var, List list, int i) {
        return a(a00Var, list, i, w6.p);
    }

    @Override // defpackage.p60
    public final int j(a00 a00Var, List list, int i) {
        return c(a00Var, list, i, w6.q);
    }
}
