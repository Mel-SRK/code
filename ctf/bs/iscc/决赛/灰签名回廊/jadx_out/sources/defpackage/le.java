package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class le implements ke, ViewTreeObserver.OnDrawListener, Runnable {
    public final long d = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable e;
    public boolean f;
    public final /* synthetic */ MainActivity g;

    public le(MainActivity mainActivity) {
        this.g = mainActivity;
    }

    public final void a(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.e = runnable;
        View decorView = this.g.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f) {
            decorView.postOnAnimation(new m0(3, this));
        } else if (f00.h(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.f = false;
                this.g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        ou fullyDrawnReporter = this.g.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.f = false;
            this.g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
