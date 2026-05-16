package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 extends bd0 {
    public final ri0 a;

    public zc0(ri0 ri0Var) {
        this.a = ri0Var;
    }

    @Override // defpackage.bd0
    public final ri0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zc0) {
            return this.a.equals(((zc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
