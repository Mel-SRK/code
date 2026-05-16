package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class a5 implements Choreographer.FrameCallback {
    public final /* synthetic */ la d;
    public final /* synthetic */ cv e;

    public a5(la laVar, b5 b5Var, cv cvVar) {
        this.d = laVar;
        this.e = cvVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object sj0Var;
        try {
            sj0Var = this.e.g(Long.valueOf(j));
        } catch (Throwable th) {
            sj0Var = new sj0(th);
        }
        this.d.h(sj0Var);
    }
}
