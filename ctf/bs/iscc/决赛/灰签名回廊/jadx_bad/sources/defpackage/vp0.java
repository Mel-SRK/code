package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp0 implements op {
    public final b6 a;
    public final int b;

    public vp0(String str, int i) {
        this.a = new b6(str);
        this.b = i;
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        int i = ppVar.d;
        b6 b6Var = this.a;
        if (i != -1) {
            int i2 = ppVar.e;
            String str = b6Var.e;
            String str2 = b6Var.e;
            ppVar.d(i, i2, str);
            if (str2.length() > 0) {
                ppVar.e(i, str2.length() + i);
            }
        } else {
            int i3 = ppVar.b;
            int i4 = ppVar.c;
            String str3 = b6Var.e;
            String str4 = b6Var.e;
            ppVar.d(i3, i4, str3);
            if (str4.length() > 0) {
                ppVar.e(i3, str4.length() + i3);
            }
        }
        int i5 = ppVar.b;
        int i6 = ppVar.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iT = i60.t(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - b6Var.e.length(), 0, ppVar.a.b());
        ppVar.f(iT, iT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp0)) {
            return false;
        }
        vp0 vp0Var = (vp0) obj;
        return f00.h(this.a.e, vp0Var.a.e) && this.b == vp0Var.b;
    }

    public final int hashCode() {
        return (this.a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.e);
        sb.append("', newCursorPosition=");
        return n5.h(sb, this.b, ')');
    }
}
