package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iu implements Comparable {
    public static final iu e;
    public static final iu f;
    public static final iu g;
    public final int d;

    static {
        iu iuVar = new iu(100);
        iu iuVar2 = new iu(200);
        iu iuVar3 = new iu(300);
        iu iuVar4 = new iu(400);
        iu iuVar5 = new iu(500);
        iu iuVar6 = new iu(600);
        e = iuVar6;
        iu iuVar7 = new iu(700);
        iu iuVar8 = new iu(800);
        iu iuVar9 = new iu(900);
        f = iuVar4;
        g = iuVar5;
        f00.z(iuVar, iuVar2, iuVar3, iuVar4, iuVar5, iuVar6, iuVar7, iuVar8, iuVar9);
    }

    public iu(int i) {
        this.d = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        ty.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f00.m(this.d, ((iu) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iu) {
            return this.d == ((iu) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return n5.h(new StringBuilder("FontWeight(weight="), this.d, ')');
    }
}
