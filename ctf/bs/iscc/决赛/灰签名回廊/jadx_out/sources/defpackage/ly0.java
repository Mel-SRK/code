package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly0 {
    public final Object a;
    public final Object b;

    public ly0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean a(hz hzVar, hz hzVar2) {
        return hzVar.equals(this.a) && hzVar2.equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ly0)) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        return f00.h(this.a, ly0Var.a) && f00.h(this.b, ly0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
