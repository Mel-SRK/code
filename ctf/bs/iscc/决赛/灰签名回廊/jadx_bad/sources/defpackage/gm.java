package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm implements em {
    public final float d;
    public final float e;
    public final du f;

    public gm(float f, float f2, du duVar) {
        this.d = f;
        this.e = f2;
        this.f = duVar;
    }

    @Override // defpackage.em
    public final float ae(long j) {
        if (rx0.a(qx0.b(j), 4294967296L)) {
            return this.f.b(qx0.c(j));
        }
        wc.q("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.em
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        return Float.compare(this.d, gmVar.d) == 0 && Float.compare(this.e, gmVar.e) == 0 && this.f.equals(gmVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + n5.b(this.e, Float.hashCode(this.d) * 31, 31);
    }

    @Override // defpackage.em
    public final float k() {
        return this.e;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.f + ')';
    }

    @Override // defpackage.em
    public final long v(float f) {
        return bo0.o(4294967296L, this.f.a(f));
    }
}
