package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz extends qz {
    public static final sz g = new sz(1, 0, 1);

    @Override // defpackage.qz
    public final boolean equals(Object obj) {
        if (!(obj instanceof sz)) {
            return false;
        }
        if (isEmpty() && ((sz) obj).isEmpty()) {
            return true;
        }
        sz szVar = (sz) obj;
        return this.d == szVar.d && this.e == szVar.e;
    }

    @Override // defpackage.qz
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // defpackage.qz
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // defpackage.qz
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
