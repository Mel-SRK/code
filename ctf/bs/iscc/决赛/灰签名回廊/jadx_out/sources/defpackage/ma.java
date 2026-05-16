package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ma extends wd {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ma.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public ma(la laVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + laVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
