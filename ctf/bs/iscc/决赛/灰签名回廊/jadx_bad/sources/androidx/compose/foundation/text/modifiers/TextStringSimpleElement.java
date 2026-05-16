package androidx.compose.foundation.text.modifiers;

import defpackage.d41;
import defpackage.f00;
import defpackage.fe0;
import defpackage.i70;
import defpackage.mx0;
import defpackage.n5;
import defpackage.n70;
import defpackage.nx0;
import defpackage.q6;
import defpackage.qt;
import defpackage.t1;

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
    */
    public final void g(i70 i70Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        qt qtVar;
        qt qtVar2;
        int i5;
        int i6;
        mx0 mx0Var = (mx0) i70Var;
        mx0Var.getClass();
        nx0 nx0Var = mx0Var.s;
        boolean z4 = false;
        boolean z5 = true;
        nx0 nx0Var2 = this.b;
        if (nx0Var2 != nx0Var) {
            if (!nx0Var2.a.b(nx0Var.a)) {
                z = true;
            }
            str = mx0Var.r;
            str2 = this.a;
            if (!f00.h(str, str2)) {
                mx0Var.r = str2;
                mx0Var.ab = null;
                z4 = true;
            }
            boolean z6 = !mx0Var.s.c(nx0Var2);
            mx0Var.s = nx0Var2;
            i = mx0Var.x;
            i2 = this.g;
            if (i != i2) {
                mx0Var.x = i2;
                z6 = true;
            }
            i3 = mx0Var.w;
            i4 = this.f;
            if (i3 != i4) {
                mx0Var.w = i4;
                z6 = true;
            }
            z2 = mx0Var.v;
            z3 = this.e;
            if (z2 != z3) {
                mx0Var.v = z3;
                z6 = true;
            }
            qtVar = mx0Var.t;
            qtVar2 = this.c;
            if (!f00.h(qtVar, qtVar2)) {
                mx0Var.t = qtVar2;
                z6 = true;
            }
            i5 = mx0Var.u;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                mx0Var.u = i6;
            }
            if (!z4 || z5) {
                fe0 fe0VarBu = mx0Var.bu();
                String str3 = mx0Var.r;
                nx0 nx0Var3 = mx0Var.s;
                qt qtVar3 = mx0Var.t;
                int i7 = mx0Var.u;
                boolean z7 = mx0Var.v;
                int i8 = mx0Var.w;
                int i9 = mx0Var.x;
                fe0VarBu.a = str3;
                fe0VarBu.b = nx0Var3;
                fe0VarBu.c = qtVar3;
                fe0VarBu.d = i7;
                fe0VarBu.e = z7;
                fe0VarBu.f = i8;
                fe0VarBu.g = i9;
                fe0VarBu.c();
            }
            if (mx0Var.q) {
                return;
            }
            if (z4 || (z && mx0Var.aa != null)) {
                q6.j(mx0Var);
            }
            if (z4 || z5) {
                d41.aa(mx0Var);
                t1.ae(mx0Var);
            }
            if (z) {
                t1.ae(mx0Var);
                return;
            }
            return;
        }
        nx0Var2.getClass();
        z = false;
        str = mx0Var.r;
        str2 = this.a;
        if (!f00.h(str, str2)) {
        }
        boolean z62 = !mx0Var.s.c(nx0Var2);
        mx0Var.s = nx0Var2;
        i = mx0Var.x;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = mx0Var.w;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = mx0Var.v;
        z3 = this.e;
        if (z2 != z3) {
        }
        qtVar = mx0Var.t;
        qtVar2 = this.c;
        if (!f00.h(qtVar, qtVar2)) {
        }
        i5 = mx0Var.u;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
            fe0 fe0VarBu2 = mx0Var.bu();
            String str32 = mx0Var.r;
            nx0 nx0Var32 = mx0Var.s;
            qt qtVar32 = mx0Var.t;
            int i72 = mx0Var.u;
            boolean z72 = mx0Var.v;
            int i82 = mx0Var.w;
            int i92 = mx0Var.x;
            fe0VarBu2.a = str32;
            fe0VarBu2.b = nx0Var32;
            fe0VarBu2.c = qtVar32;
            fe0VarBu2.d = i72;
            fe0VarBu2.e = z72;
            fe0VarBu2.f = i82;
            fe0VarBu2.g = i92;
            fe0VarBu2.c();
        }
        if (mx0Var.q) {
        }
    }

    public final int hashCode() {
        return (((n5.e(n5.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
