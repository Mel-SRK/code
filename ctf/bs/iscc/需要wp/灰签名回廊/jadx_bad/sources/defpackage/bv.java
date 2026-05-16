package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bv implements qv, Serializable {
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final int i;
    public final boolean h = false;
    public final int j = 4;

    public bv(int i, Class cls, Object obj, String str, String str2) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.i = i;
    }

    @Override // defpackage.qv
    public final int b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return this.h == bvVar.h && this.i == bvVar.i && this.j == bvVar.j && this.d.equals(bvVar.d) && this.e.equals(bvVar.e) && this.f.equals(bvVar.f) && this.g.equals(bvVar.g);
    }

    public final int hashCode() {
        return ((((((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + this.i) * 31) + this.j;
    }

    public final String toString() {
        yi0.a.getClass();
        return zi0.a(this);
    }
}
