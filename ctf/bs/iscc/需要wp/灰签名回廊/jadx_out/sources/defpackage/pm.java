package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm extends RuntimeException {
    public final transient pj d;

    public pm(pj pjVar) {
        this.d = pjVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.d.toString();
    }
}
