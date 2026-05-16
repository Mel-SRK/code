package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr0 extends i9 {
    public final long a;

    public vr0(long j) {
        this.a = j;
    }

    @Override // defpackage.i9
    public final void a(float f, long j, l3 l3Var) {
        l3Var.c(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = qc.b(jB, qc.d(jB) * f);
        }
        l3Var.e(jB);
        if (l3Var.c != null) {
            l3Var.c = null;
            l3Var.a.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vr0) {
            return qc.c(this.a, ((vr0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) qc.i(this.a)) + ')';
    }
}
