package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements ee0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public g20(b6 b6Var, nx0 nx0Var, List list, em emVar, qt qtVar) {
        int i;
        int i2;
        nx0 nx0Var2;
        b6 b6Var2 = b6Var;
        nx0 nx0Var3 = nx0Var;
        this.b = b6Var2;
        this.c = list;
        final int i3 = 0;
        this.d = e00.ac(new pu(this) { // from class: z70
            public final /* synthetic */ g20 e;

            {
                this.e = this;
            }

            @Override // defpackage.pu
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.e.a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((de0) obj3).a.a();
                            int i4 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i4);
                                    float fA2 = ((de0) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        de0 de0Var = (de0) obj;
                        return Float.valueOf(de0Var != null ? de0Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((de0) obj5).a.i.c();
                            int i5 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float fC2 = ((de0) obj6).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        de0 de0Var2 = (de0) obj2;
                        return Float.valueOf(de0Var2 != null ? de0Var2.a.i.c() : 0.0f);
                }
            }
        });
        final int i4 = 1;
        this.e = e00.ac(new pu(this) { // from class: z70
            public final /* synthetic */ g20 e;

            {
                this.e = this;
            }

            @Override // defpackage.pu
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.e.a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((de0) obj3).a.a();
                            int i42 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i42);
                                    float fA2 = ((de0) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i42 != size) {
                                        i42++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        de0 de0Var = (de0) obj;
                        return Float.valueOf(de0Var != null ? de0Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((de0) obj5).a.i.c();
                            int i5 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float fC2 = ((de0) obj6).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        de0 de0Var2 = (de0) obj2;
                        return Float.valueOf(de0Var2 != null ? de0Var2.a.i.c() : 0.0f);
                }
            }
        });
        ge0 ge0Var = nx0Var3.b;
        b6 b6Var3 = d6.a;
        ArrayList arrayList = b6Var2.g;
        String str = b6Var2.e;
        rq rqVar = rq.d;
        List listBa = arrayList != null ? kc.ba(arrayList, new ht(6)) : rqVar;
        ArrayList arrayList2 = new ArrayList();
        z6 z6Var = new z6();
        int size = listBa.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            a6 a6Var = (a6) listBa.get(i5);
            ge0 ge0VarA = ge0Var.a((ge0) a6Var.a);
            int i7 = i4;
            int i8 = a6Var.b;
            int i9 = a6Var.c;
            if (i8 > i9) {
                ty.a("Reversed range is not supported");
            }
            while (i6 < i8 && !z6Var.isEmpty()) {
                a6 a6Var2 = (a6) z6Var.last();
                List list2 = listBa;
                int i10 = a6Var2.c;
                rq rqVar2 = rqVar;
                Object obj = a6Var2.a;
                if (i8 < i10) {
                    arrayList2.add(new a6(i6, i8, obj));
                    i6 = i8;
                    listBa = list2;
                    rqVar = rqVar2;
                } else {
                    int i11 = size;
                    arrayList2.add(new a6(i6, i10, obj));
                    i6 = a6Var2.c;
                    while (!z6Var.isEmpty() && i6 == ((a6) z6Var.last()).c) {
                        z6Var.removeLast();
                    }
                    listBa = list2;
                    rqVar = rqVar2;
                    size = i11;
                }
            }
            List list3 = listBa;
            rq rqVar3 = rqVar;
            int i12 = size;
            if (i6 < i8) {
                arrayList2.add(new a6(i6, i8, ge0Var));
                i6 = i8;
            }
            a6 a6Var3 = (a6) (z6Var.isEmpty() ? null : z6Var.e[z6Var.h((z6Var.a() - 1) + z6Var.d)]);
            if (a6Var3 != null) {
                int i13 = a6Var3.c;
                Object obj2 = a6Var3.a;
                int i14 = a6Var3.b;
                if (i14 == i8 && i13 == i9) {
                    z6Var.removeLast();
                    z6Var.addLast(new a6(i8, i9, ((ge0) obj2).a(ge0VarA)));
                } else if (i14 == i13) {
                    arrayList2.add(new a6(i14, i13, obj2));
                    z6Var.removeLast();
                    z6Var.addLast(new a6(i8, i9, ge0VarA));
                } else {
                    if (i13 < i9) {
                        throw new IllegalArgumentException();
                    }
                    z6Var.addLast(new a6(i8, i9, ((ge0) obj2).a(ge0VarA)));
                }
            } else {
                z6Var.addLast(new a6(i8, i9, ge0VarA));
            }
            i5++;
            i4 = i7;
            listBa = list3;
            rqVar = rqVar3;
            size = i12;
        }
        rq rqVar4 = rqVar;
        while (i6 <= str.length() && !z6Var.isEmpty()) {
            a6 a6Var4 = (a6) z6Var.last();
            Object obj3 = a6Var4.a;
            int i15 = a6Var4.c;
            arrayList2.add(new a6(i6, i15, obj3));
            while (!z6Var.isEmpty() && i15 == ((a6) z6Var.last()).c) {
                z6Var.removeLast();
            }
            i6 = i15;
        }
        if (i6 < str.length()) {
            arrayList2.add(new a6(i6, str.length(), ge0Var));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new a6(0, 0, ge0Var));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            a6 a6Var5 = (a6) arrayList2.get(i16);
            int i17 = a6Var5.b;
            int i18 = a6Var5.c;
            String strSubstring = i17 != i18 ? str.substring(i17, i18) : "";
            List listA = d6.a(b6Var2, i17, i18, new c6(0));
            b6 b6Var4 = new b6(strSubstring, listA == null ? rqVar4 : listA);
            ge0 ge0Var2 = (ge0) a6Var5.a;
            if (ge0Var2.b == Integer.MIN_VALUE) {
                i = size2;
                i2 = i16;
                ge0Var2 = new ge0(ge0Var2.a, ge0Var.b, ge0Var2.c, ge0Var2.d, ge0Var2.e, ge0Var2.f, ge0Var2.g, ge0Var2.h, ge0Var2.i);
            } else {
                i = size2;
                i2 = i16;
            }
            nx0 nx0Var4 = new nx0(nx0Var3.a, ge0Var.a(ge0Var2));
            List list4 = b6Var4.d;
            List list5 = list4 == null ? rqVar4 : list4;
            List list6 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i19 = 0;
            while (i19 < size3) {
                a6 a6Var6 = (a6) list6.get(i19);
                int i20 = a6Var6.b;
                ge0 ge0Var3 = ge0Var;
                int i21 = a6Var6.c;
                if (d6.b(i17, i18, i20, i21)) {
                    if (i17 > i20 || i21 > i18) {
                        ty.a("placeholder can not overlap with paragraph.");
                    }
                    nx0Var2 = nx0Var4;
                    arrayList4.add(new a6(i20 - i17, i21 - i17, a6Var6.a));
                } else {
                    nx0Var2 = nx0Var4;
                }
                i19++;
                nx0Var4 = nx0Var2;
                ge0Var = ge0Var3;
            }
            arrayList3.add(new de0(new s3(strSubstring, nx0Var4, list5, arrayList4, qtVar, emVar), i17, i18));
            i16 = i2 + 1;
            b6Var2 = b6Var;
            nx0Var3 = nx0Var;
            size2 = i;
        }
        this.a = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x20] */
    @Override // defpackage.ee0
    public float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.ee0
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((de0) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x20] */
    @Override // defpackage.ee0
    public float c() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi d(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.b;
        ArrayList arrayList = (ArrayList) this.a;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(h(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public float e(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float f(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4 = i;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return e(i, z);
        }
        int iAb = m10.ab(layout, i4, z2);
        int lineStart = layout.getLineStart(iAb);
        int lineEnd = layout.getLineEnd(iAb);
        if (i4 != lineStart && i4 != lineEnd) {
            return e(i, z);
        }
        if (i4 == 0 || i4 == layout.getText().length()) {
            return e(i, z);
        }
        int iG = g(i4, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(h(iG))) == -1;
        int i5 = i(lineEnd, lineStart);
        int iH = h(iG);
        int i6 = lineStart - iH;
        int i7 = i5 - iH;
        Bidi bidiD = d(iG);
        Bidi bidiCreateLineBidi = bidiD != null ? bidiD.createLineBidi(i6, i7) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i4 == lineStart ? z3 : !z3 ? layout.getLineLeft(iAb) : layout.getLineRight(iAb);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        f20[] f20VarArr = new f20[runCount];
        for (int i8 = 0; i8 < runCount; i8++) {
            f20VarArr[i8] = new f20(bidiCreateLineBidi.getRunStart(i8) + lineStart, bidiCreateLineBidi.getRunLimit(i8) + lineStart, bidiCreateLineBidi.getRunLevel(i8) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i9 = 0; i9 < runCount2; i9++) {
            bArr[i9] = (byte) bidiCreateLineBidi.getRunLevel(i9);
        }
        Bidi.reorderVisually(bArr, 0, f20VarArr, 0, runCount);
        if (i4 == lineStart) {
            int i10 = 0;
            while (true) {
                if (i10 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (f20VarArr[i10].a == i4) {
                    i3 = i10;
                    break;
                }
                i10++;
            }
            boolean z4 = (z || z3 == f20VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iAb) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(f20VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(f20VarArr[i3 + 1].a) : layout.getLineRight(iAb);
        }
        if (i4 > i5) {
            i4 = i(i4, lineStart);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= runCount) {
                i2 = -1;
                break;
            }
            if (f20VarArr[i11].b == i4) {
                i2 = i11;
                break;
            }
            i11++;
        }
        boolean z5 = (z || z3 == f20VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iAb) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(f20VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(f20VarArr[i2 + 1].b) : layout.getLineRight(iAb);
    }

    public int g(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.a;
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            wc.d(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iT = az0.t((Comparable) arrayList.get(i2), numValueOf);
            if (iT >= 0) {
                if (iT <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i5 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public int h(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.a).get(i - 1)).intValue();
    }

    public int i(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((f00.m(cCharAt, 8192) < 0 || f00.m(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void j(Object obj, String str) {
        jq jqVar = m10.d;
        str.getClass();
        ((LinkedHashMap) this.b).put(str, obj);
        ps0 ps0Var = (ps0) ((LinkedHashMap) this.c).get(str);
        if (ps0Var != null) {
            ps0Var.h(null, obj == null ? jqVar : obj);
        }
        ps0 ps0Var2 = (ps0) ((LinkedHashMap) this.d).get(str);
        if (ps0Var2 != null) {
            if (obj == null) {
                obj = jqVar;
            }
            ps0Var2.h(null, obj);
        }
    }

    public g20(Layout layout) {
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM = ft0.m(((Layout) this.b).getText(), '\n', length, 4);
            length = iM < 0 ? ((Layout) this.b).getText().length() : iM + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.b).getText().length());
        this.a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.a).size()];
        ((ArrayList) this.a).size();
    }

    public g20(Map map) {
        map.getClass();
        this.b = new LinkedHashMap(map);
        this.a = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new fe(2, this);
    }
}
