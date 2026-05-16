package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ib extends jb {
    public final Throwable a;

    public ib(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib) {
            return f00.h(this.a, ((ib) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.jb
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
