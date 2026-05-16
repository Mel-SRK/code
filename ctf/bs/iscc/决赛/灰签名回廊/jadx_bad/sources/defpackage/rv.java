package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rv extends ea implements qv, c10, ov {
    public final int j;
    public final int k;

    public rv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.j = i;
        this.k = 0;
    }

    @Override // defpackage.qv
    public final int b() {
        return this.j;
    }

    @Override // defpackage.ea
    public final c10 d() {
        yi0.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rv) {
            rv rvVar = (rv) obj;
            return this.g.equals(rvVar.g) && this.h.equals(rvVar.h) && this.k == rvVar.k && this.j == rvVar.j && f00.h(this.e, rvVar.e) && e().equals(rvVar.e());
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        c10 c10Var = this.d;
        if (c10Var == null) {
            d();
            this.d = this;
            c10Var = this;
        }
        return obj.equals(c10Var);
    }

    public final int hashCode() {
        e();
        return this.h.hashCode() + ((this.g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        c10 c10Var = this.d;
        if (c10Var == null) {
            d();
            this.d = this;
            c10Var = this;
        }
        if (c10Var != this) {
            return c10Var.toString();
        }
        String str = this.g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public rv(int i, Class cls, String str, String str2, int i2) {
        this(i, da.d, cls, str, str2, i2, 0);
    }
}
