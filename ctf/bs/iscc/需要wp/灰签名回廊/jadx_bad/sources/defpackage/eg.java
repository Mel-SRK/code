package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eg {
    public final zf a;

    public eg(zf zfVar) {
        this.a = zfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eg) {
            return this.a.equals(((eg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
