package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b6 implements CharSequence {
    public final List d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;

    static {
        f1 f1Var = lm0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r0.a(r2.c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b6(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.d = list;
        this.e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                a6 a6Var = (a6) list.get(i);
                Object obj = a6Var.a;
                if (obj instanceof yr0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(a6Var);
                } else if (obj instanceof ge0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(a6Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f = arrayList;
        this.g = arrayList2;
        List listBa = arrayList2 != null ? kc.ba(arrayList2, new ht(5)) : null;
        if (listBa == null || listBa.isEmpty()) {
            return;
        }
        int i2 = ((a6) kc.ar(listBa)).c;
        int i3 = mz.a;
        int i4 = 1;
        d80 d80Var = new d80(1);
        d80Var.a(i2);
        int size2 = listBa.size();
        while (i4 < size2) {
            a6 a6Var2 = (a6) listBa.get(i4);
            while (true) {
                int i5 = d80Var.b;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                int i6 = d80Var.a[i5 - 1];
                int i7 = a6Var2.b;
                int i8 = a6Var2.c;
                if (i7 >= i6) {
                    d80Var.d(i5 - 1);
                } else if (i8 > i6) {
                    ty.a("Paragraph overlap not allowed, end " + i8 + " should be less than or equal to " + i6);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b6 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            ty.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.e;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        b6 b6Var = d6.a;
        if (i > i2) {
            ty.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a6 a6Var = (a6) list.get(i3);
                int i4 = a6Var.b;
                int i5 = a6Var.c;
                if (d6.b(i, i2, i4, i5)) {
                    arrayList.add(new a6(Math.max(i, a6Var.b) - i, Math.min(i2, i5) - i, a6Var.a, a6Var.d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new b6(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return f00.h(this.e, b6Var.e) && f00.h(this.d, b6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b6(String str, ArrayList arrayList, int i) {
        List list = (i & 2) != 0 ? rq.d : arrayList;
        b6 b6Var = d6.a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ b6(String str) {
        this(str, rq.d);
    }

    public b6(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
