package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public final Object a;
    public final ga b;
    public final hv c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ ud(Object obj, ga gaVar, hv hvVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : gaVar, (i & 4) != 0 ? null : hvVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static ud a(ud udVar, ga gaVar, Throwable th, int i) {
        Object obj = udVar.a;
        if ((i & 2) != 0) {
            gaVar = udVar.b;
        }
        ga gaVar2 = gaVar;
        hv hvVar = udVar.c;
        Object obj2 = udVar.d;
        if ((i & 16) != 0) {
            th = udVar.e;
        }
        return new ud(obj, gaVar2, hvVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return f00.h(this.a, udVar.a) && f00.h(this.b, udVar.b) && f00.h(this.c, udVar.c) && f00.h(this.d, udVar.d) && f00.h(this.e, udVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ga gaVar = this.b;
        int iHashCode2 = (iHashCode + (gaVar == null ? 0 : gaVar.hashCode())) * 31;
        hv hvVar = this.c;
        int iHashCode3 = (iHashCode2 + (hvVar == null ? 0 : hvVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ud(Object obj, ga gaVar, hv hvVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = gaVar;
        this.c = hvVar;
        this.d = obj2;
        this.e = th;
    }
}
