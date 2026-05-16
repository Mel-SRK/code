package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class la0 extends m implements t00 {
    public static final la0 e = new la0(bw.ae);

    @Override // defpackage.t00
    public final boolean b() {
        return true;
    }

    @Override // defpackage.t00
    public final en g(boolean z, boolean z2, ft ftVar) {
        return ma0.d;
    }

    @Override // defpackage.t00
    public final pb i(a10 a10Var) {
        return ma0.d;
    }

    @Override // defpackage.t00
    public final CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.t00
    public final boolean start() {
        return false;
    }

    @Override // defpackage.t00
    public final en t(cv cvVar) {
        return ma0.d;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.t00
    public final Object x(ki kiVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.t00
    public final void a(CancellationException cancellationException) {
    }
}
