package androidx.compose.foundation.text.modifiers;

import defpackage.f00;
import defpackage.i70;
import defpackage.mx0;
import defpackage.n5;
import defpackage.n70;
import defpackage.nx0;
import defpackage.qt;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends n70 {
    public final String a;
    public final nx0 b;
    public final qt c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public TextStringSimpleElement(String str, nx0 nx0Var, qt qtVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = nx0Var;
        this.c = qtVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return f00.h(this.a, textStringSimpleElement.a) && f00.h(this.b, textStringSimpleElement.b) && f00.h(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    @Override // defpackage.n70
    public final i70 f() {
        mx0 mx0Var = new mx0();
        mx0Var.r = this.a;
        mx0Var.s = this.b;
        mx0Var.t = this.c;
        mx0Var.u = this.d;
        mx0Var.v = this.e;
        mx0Var.w = this.f;
        mx0Var.x = this.g;
        return mx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.n70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.i70 r12) {
        /*
            r11 = this;
            mx0 r12 = (defpackage.mx0) r12
            r12.getClass()
            nx0 r0 = r12.s
            r1 = 0
            r2 = 1
            nx0 r3 = r11.b
            if (r3 == r0) goto L1a
            yr0 r4 = r3.a
            yr0 r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r12.r
            java.lang.String r5 = r11.a
            boolean r4 = defpackage.f00.h(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r12.r = r5
            r1 = 0
            r12.ab = r1
            r1 = r2
        L2f:
            nx0 r4 = r12.s
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.s = r3
            int r3 = r12.x
            int r5 = r11.g
            if (r3 == r5) goto L41
            r12.x = r5
            r4 = r2
        L41:
            int r3 = r12.w
            int r5 = r11.f
            if (r3 == r5) goto L4a
            r12.w = r5
            r4 = r2
        L4a:
            boolean r3 = r12.v
            boolean r5 = r11.e
            if (r3 == r5) goto L53
            r12.v = r5
            r4 = r2
        L53:
            qt r3 = r12.t
            qt r5 = r11.c
            boolean r3 = defpackage.f00.h(r3, r5)
            if (r3 != 0) goto L60
            r12.t = r5
            r4 = r2
        L60:
            int r3 = r12.u
            int r5 = r11.d
            if (r3 != r5) goto L68
            r2 = r4
            goto L6a
        L68:
            r12.u = r5
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L91
        L6e:
            fe0 r3 = r12.bu()
            java.lang.String r4 = r12.r
            nx0 r5 = r12.s
            qt r6 = r12.t
            int r7 = r12.u
            boolean r8 = r12.v
            int r9 = r12.w
            int r10 = r12.x
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r10
            r3.c()
        L91:
            boolean r3 = r12.q
            if (r3 != 0) goto L96
            goto Lb0
        L96:
            if (r1 != 0) goto L9e
            if (r0 == 0) goto La1
            lx0 r3 = r12.aa
            if (r3 == 0) goto La1
        L9e:
            defpackage.q6.j(r12)
        La1:
            if (r1 != 0) goto La5
            if (r2 == 0) goto Lab
        La5:
            defpackage.d41.aa(r12)
            defpackage.t1.ae(r12)
        Lab:
            if (r0 == 0) goto Lb0
            defpackage.t1.ae(r12)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.g(i70):void");
    }

    public final int hashCode() {
        return (((n5.e(n5.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
