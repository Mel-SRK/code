package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wh0 extends ea implements i10 {
    public final boolean j;

    public wh0(int i, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wh0) {
            wh0 wh0Var = (wh0) obj;
            return e().equals(wh0Var.e()) && this.g.equals(wh0Var.g) && this.h.equals(wh0Var.h) && f00.h(this.e, wh0Var.e);
        }
        if (obj instanceof i10) {
            return obj.equals(h());
        }
        return false;
    }

    public final c10 h() {
        if (this.j) {
            return this;
        }
        c10 c10Var = this.d;
        if (c10Var != null) {
            return c10Var;
        }
        c10 c10VarD = d();
        this.d = c10VarD;
        return c10VarD;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        c10 c10VarH = h();
        if (c10VarH != this) {
            return c10VarH.toString();
        }
        return "property " + this.g + " (Kotlin reflection is not available)";
    }
}
