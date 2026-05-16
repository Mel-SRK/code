package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements em {
    public final float d;
    public final float e;

    public fm(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.em
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return Float.compare(this.d, fmVar.d) == 0 && Float.compare(this.e, fmVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    @Override // defpackage.em
    public final float k() {
        return this.e;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.d + ", fontScale=" + this.e + ')';
    }
}
