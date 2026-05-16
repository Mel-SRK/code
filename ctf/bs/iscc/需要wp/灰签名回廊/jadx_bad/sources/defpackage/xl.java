package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl implements op {
    public final int a;
    public final int b;

    public xl(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ty.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        int i = ppVar.c;
        oe0 oe0Var = ppVar.a;
        int i2 = this.b;
        int iB = i + i2;
        if (((i ^ iB) & (i2 ^ iB)) < 0) {
            iB = oe0Var.b();
        }
        ppVar.a(ppVar.c, Math.min(iB, oe0Var.b()));
        int i3 = ppVar.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        ppVar.a(Math.max(0, i5), ppVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return this.a == xlVar.a && this.b == xlVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return n5.h(sb, this.b, ')');
    }
}
