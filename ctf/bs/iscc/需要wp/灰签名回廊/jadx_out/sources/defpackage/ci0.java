package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci0 {
    public final ai0 a;
    public final boolean b;
    public final bw c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public ci0(ai0 ai0Var, Object obj, boolean z, bw bwVar, boolean z2) {
        this.a = ai0Var;
        this.b = z;
        this.c = bwVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        xf.d("Unexpected form of a provided value");
        throw new xd();
    }
}
