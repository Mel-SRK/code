package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tw0 implements Executor {
    public final /* synthetic */ Choreographer d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.postFrameCallback(new rh0(runnable));
    }
}
