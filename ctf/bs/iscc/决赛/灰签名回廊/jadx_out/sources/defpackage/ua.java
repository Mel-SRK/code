package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ua {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ua(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return mn.a(this.a, uaVar.a) && mn.a(this.b, uaVar.b) && mn.a(this.c, uaVar.c) && mn.a(this.d, uaVar.d) && mn.a(this.e, uaVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + n5.b(this.d, n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
