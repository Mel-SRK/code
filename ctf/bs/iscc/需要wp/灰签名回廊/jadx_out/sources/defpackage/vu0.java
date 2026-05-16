package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 extends uu0 {
    public final Runnable f;

    public vu0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(pk.ae(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
