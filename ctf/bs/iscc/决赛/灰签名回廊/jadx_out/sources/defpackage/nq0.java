package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nq0 {
    public final boolean a;
    public final yn0 b;
    public final tv c;

    public nq0(boolean z, yn0 yn0Var, tv tvVar) {
        this.a = z;
        this.b = yn0Var;
        this.c = tvVar;
    }

    public final int a() {
        tv tvVar = this.c;
        int i = tvVar.b;
        int i2 = tvVar.c;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(this.a);
        sb.append(", crossed=");
        int iA = a();
        sb.append(iA != 1 ? iA != 2 ? iA != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
        sb.append(", info=\n\t");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
