package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class ff implements ScrollCaptureCallback {
    public final uo0 a;
    public final tz b;
    public final bu c;
    public final b1 d;
    public final ii e;
    public final rx f;

    public ff(uo0 uo0Var, tz tzVar, ii iiVar, bu buVar, b1 b1Var) {
        this.a = uo0Var;
        this.b = tzVar;
        this.c = buVar;
        this.d = b1Var;
        this.e = new ii(iiVar.d.j(rm.e));
        this.f = new rx(tzVar.d - tzVar.b, new ef(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ff r11, android.view.ScrollCaptureSession r12, defpackage.tz r13, defpackage.ki r14) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.a(ff, android.view.ScrollCaptureSession, tz, ki):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        i60.an(this.e, la0.e, new c(this, runnable, null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        hs0 hs0VarAn = i60.an(this.e, null, new j3(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        hs0VarAn.t(new l1(9, cancellationSignal));
        cancellationSignal.setOnCancelListener(new gf(0, hs0VarAn));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(pk.bd(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((me0) this.c.e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
