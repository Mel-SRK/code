package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf0 extends CancellationException {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf0(String str, int i) {
        super(str);
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.d) {
            case 0:
                setStackTrace(i60.k);
                break;
            default:
                setStackTrace(az0.k);
                break;
        }
        return this;
    }
}
