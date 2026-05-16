package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.d) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new sh0((Context) this.e, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.e).run();
                break;
        }
    }
}
