package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends IllegalStateException {
    public final String d;

    public cf(String str) {
        this.d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }
}
