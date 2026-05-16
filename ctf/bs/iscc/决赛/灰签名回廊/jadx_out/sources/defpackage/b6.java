package defpackage;

import java.util.ArrayList;
import java.util.List;

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
        To view partially-correct add '--show-bad-code' argument
    */
    public b6(java.util.List r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.d = r8
            r7.e = r9
            r9 = 0
            if (r8 == 0) goto L3b
            int r0 = r8.size()
            r1 = 0
            r2 = r9
            r3 = r2
        L11:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            a6 r4 = (defpackage.a6) r4
            java.lang.Object r5 = r4.a
            boolean r6 = r5 instanceof defpackage.yr0
            if (r6 == 0) goto L2a
            if (r2 != 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L26:
            r2.add(r4)
            goto L38
        L2a:
            boolean r5 = r5 instanceof defpackage.ge0
            if (r5 == 0) goto L38
            if (r3 != 0) goto L35
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L35:
            r3.add(r4)
        L38:
            int r1 = r1 + 1
            goto L11
        L3b:
            r2 = r9
            r3 = r2
        L3d:
            r7.f = r2
            r7.g = r3
            if (r3 == 0) goto L4d
            ht r8 = new ht
            r9 = 5
            r8.<init>(r9)
            java.util.List r9 = defpackage.kc.ba(r3, r8)
        L4d:
            if (r9 == 0) goto Lba
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L56
            goto Lba
        L56:
            java.lang.Object r8 = defpackage.kc.ar(r9)
            a6 r8 = (defpackage.a6) r8
            int r8 = r8.c
            int r0 = defpackage.mz.a
            d80 r0 = new d80
            r1 = 1
            r0.<init>(r1)
            r0.a(r8)
            int r8 = r9.size()
        L6d:
            if (r1 >= r8) goto Lba
            java.lang.Object r2 = r9.get(r1)
            a6 r2 = (defpackage.a6) r2
        L75:
            int r3 = r0.b
            if (r3 == 0) goto Lb2
            if (r3 == 0) goto Laa
            int[] r4 = r0.a
            int r5 = r3 + (-1)
            r4 = r4[r5]
            int r5 = r2.b
            int r6 = r2.c
            if (r5 < r4) goto L8d
            int r3 = r3 + (-1)
            r0.d(r3)
            goto L75
        L8d:
            if (r6 > r4) goto L90
            goto Lb2
        L90:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Paragraph overlap not allowed, end "
            r3.<init>(r5)
            r3.append(r6)
            java.lang.String r5 = " should be less than or equal to "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.ty.a(r3)
            goto Lb2
        Laa:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "IntList is empty."
            r8.<init>(r9)
            throw r8
        Lb2:
            int r2 = r2.c
            r0.a(r2)
            int r1 = r1 + 1
            goto L6d
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6.<init>(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b6 subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.ty.a(r1)
        L26:
            java.lang.String r1 = r10.e
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            b6 r4 = defpackage.d6.a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.ty.a(r2)
        L54:
            java.util.List r2 = r10.d
            if (r2 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L66:
            if (r0 >= r4) goto L93
            java.lang.Object r5 = r2.get(r0)
            a6 r5 = (defpackage.a6) r5
            int r6 = r5.b
            int r7 = r5.c
            boolean r6 = defpackage.d6.b(r11, r12, r6, r7)
            if (r6 == 0) goto L90
            a6 r6 = new a6
            java.lang.Object r8 = r5.a
            int r9 = r5.b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.d
            r6.<init>(r9, r7, r8, r5)
            r3.add(r6)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9a
        L99:
            r3 = 0
        L9a:
            b6 r11 = new b6
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6.subSequence(int, int):b6");
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
