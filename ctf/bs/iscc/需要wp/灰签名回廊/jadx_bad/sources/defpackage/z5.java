package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements Appendable {
    public final StringBuilder d = new StringBuilder(16);
    public final ArrayList e;

    public z5(b6 b6Var) {
        new ArrayList();
        this.e = new ArrayList();
        new ArrayList();
        a(b6Var);
    }

    public final void a(b6 b6Var) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append(b6Var.e);
        List list = b6Var.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a6 a6Var = (a6) list.get(i);
                this.e.add(new y5(a6Var.b + length, a6Var.c + length, a6Var.a, a6Var.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof b6;
        StringBuilder sb = this.d;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        b6 b6Var = (b6) charSequence;
        int length = sb.length();
        sb.append((CharSequence) b6Var.e, i, i2);
        List listA = d6.a(b6Var, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                a6 a6Var = (a6) listA.get(i3);
                this.e.add(new y5(a6Var.b + length, a6Var.c + length, a6Var.a, a6Var.d));
            }
        }
        return this;
    }

    public final b6 b() {
        StringBuilder sb = this.d;
        String string = sb.toString();
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y5 y5Var = (y5) arrayList.get(i);
            int length = sb.length();
            int i2 = y5Var.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                ty.b("Item.end should be set first");
            }
            arrayList2.add(new a6(y5Var.b, length, y5Var.a, y5Var.d));
        }
        return new b6(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof b6) {
            a((b6) charSequence);
            return this;
        }
        this.d.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.d.append(c);
        return this;
    }
}
