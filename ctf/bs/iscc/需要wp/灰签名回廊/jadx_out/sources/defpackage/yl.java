package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl implements op {
    public final int a;
    public final int b;

    public yl(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ty.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = ppVar.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(ppVar.b((i5 - i4) + (-1))) && Character.isLowSurrogate(ppVar.b(ppVar.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iB = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iB + 1;
            int i7 = ppVar.c;
            oe0 oe0Var = ppVar.a;
            if (i7 + i6 >= oe0Var.b()) {
                iB = oe0Var.b() - ppVar.c;
                break;
            } else {
                iB = (Character.isHighSurrogate(ppVar.b((ppVar.c + i6) + (-1))) && Character.isLowSurrogate(ppVar.b(ppVar.c + i6))) ? iB + 2 : i6;
                i++;
            }
        }
        int i8 = ppVar.c;
        ppVar.a(i8, iB + i8);
        int i9 = ppVar.b;
        ppVar.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj;
        return this.a == ylVar.a && this.b == ylVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return n5.h(sb, this.b, ')');
    }
}
