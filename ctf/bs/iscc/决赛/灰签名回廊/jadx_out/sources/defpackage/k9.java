package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k9 implements nw0 {
    public final float a;

    public k9(j9 j9Var, float f) {
        this.a = f;
    }

    @Override // defpackage.nw0
    public final float a() {
        return this.a;
    }

    @Override // defpackage.nw0
    public final long b() {
        int i = qc.h;
        return qc.g;
    }

    @Override // defpackage.nw0
    public final i9 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k9) {
            return f00.h(null, null) && Float.compare(this.a, ((k9) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BrushStyle(value=" + ((Object) null) + ", alpha=" + this.a + ')';
    }
}
