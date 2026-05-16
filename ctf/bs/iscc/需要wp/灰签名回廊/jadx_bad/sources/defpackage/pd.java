package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pd implements op {
    public final b6 a;
    public final int b;

    public pd(String str, int i) {
        this(new b6(str), i);
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        int i = ppVar.d;
        b6 b6Var = this.a;
        if (i != -1) {
            ppVar.d(i, ppVar.e, b6Var.e);
        } else {
            ppVar.d(ppVar.b, ppVar.c, b6Var.e);
        }
        int i2 = ppVar.b;
        int i3 = ppVar.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iT = i60.t(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - b6Var.e.length(), 0, ppVar.a.b());
        ppVar.f(iT, iT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return f00.h(this.a.e, pdVar.a.e) && this.b == pdVar.b;
    }

    public final int hashCode() {
        return (this.a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.e);
        sb.append("', newCursorPosition=");
        return n5.h(sb, this.b, ')');
    }

    public pd(b6 b6Var, int i) {
        this.a = b6Var;
        this.b = i;
    }
}
