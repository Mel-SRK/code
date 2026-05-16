package defpackage;

import android.graphics.Canvas;
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
    */
    public static final Object a(ff ffVar, ScrollCaptureSession scrollCaptureSession, tz tzVar, ki kiVar) {
        df dfVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionE;
        int i3;
        tz tzVar2;
        int i4;
        int iT;
        int iT2;
        if (kiVar instanceof df) {
            dfVar = (df) kiVar;
            int i5 = dfVar.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dfVar.m = i5 - Integer.MIN_VALUE;
            } else {
                dfVar = new df(ffVar, kiVar);
            }
        }
        Object obj = dfVar.k;
        int i6 = dfVar.m;
        yj yjVar = yj.d;
        if (i6 == 0) {
            i60.az(obj);
            i = tzVar.b;
            i2 = tzVar.d;
            rx rxVar = ffVar.f;
            dfVar.g = scrollCaptureSession;
            dfVar.h = tzVar;
            dfVar.i = i;
            dfVar.j = i2;
            dfVar.m = 1;
            int i7 = rxVar.a;
            if (i > i2) {
                throw new IllegalArgumentException(n5.g("Expected min=", i, " ≤ max=", i2).toString());
            }
            int i8 = i2 - i;
            if (i8 > i7) {
                throw new IllegalArgumentException(n5.g("Expected range (", i8, ") to be ≤ viewportSize=", i7).toString());
            }
            float f = i;
            float f2 = rxVar.b;
            Object obj2 = wz0.a;
            if (f < f2 || i2 > i7 + f2) {
                Object objB = rxVar.b((f < f2 ? i : i2 - i7) - f2, dfVar);
                if (objB != yjVar) {
                    objB = obj2;
                }
                if (objB == yjVar) {
                    obj2 = objB;
                }
            }
            if (obj2 != yjVar) {
            }
            return yjVar;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = dfVar.j;
            i4 = dfVar.i;
            tzVar2 = dfVar.h;
            scrollCaptureSessionE = i0.e(dfVar.g);
            i60.az(obj);
            rx rxVar2 = ffVar.f;
            iT = i60.t(i4 - i60.ax(rxVar2.b), 0, rxVar2.a);
            rx rxVar3 = ffVar.f;
            iT2 = i60.t(i3 - i60.ax(rxVar3.b), 0, rxVar3.a);
            int i9 = tzVar2.a;
            int i10 = tzVar2.c;
            if (iT != iT2) {
                return tz.e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionE.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iT);
                tz tzVar3 = ffVar.b;
                canvasLockHardwareCanvas.translate(-tzVar3.a, -tzVar3.b);
                ffVar.d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionE.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iAx = i60.ax(ffVar.f.b);
                return new tz(i9, iT + iAx, i10, iT2 + iAx);
            } catch (Throwable th) {
                scrollCaptureSessionE.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = dfVar.j;
        int i12 = dfVar.i;
        tz tzVar4 = dfVar.h;
        ScrollCaptureSession scrollCaptureSessionE2 = i0.e(dfVar.g);
        i60.az(obj);
        i = i12;
        tzVar = tzVar4;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionE2;
        q0 q0Var = q0.v;
        dfVar.g = scrollCaptureSession;
        dfVar.h = tzVar;
        dfVar.i = i;
        dfVar.j = i2;
        dfVar.m = 2;
        pj pjVar = dfVar.e;
        pjVar.getClass();
        if (pk.ai(pjVar).m(q0Var, dfVar) != yjVar) {
            scrollCaptureSessionE = scrollCaptureSession;
            i3 = i2;
            tzVar2 = tzVar;
            i4 = i;
            rx rxVar22 = ffVar.f;
            iT = i60.t(i4 - i60.ax(rxVar22.b), 0, rxVar22.a);
            rx rxVar32 = ffVar.f;
            iT2 = i60.t(i3 - i60.ax(rxVar32.b), 0, rxVar32.a);
            int i92 = tzVar2.a;
            int i102 = tzVar2.c;
            if (iT != iT2) {
            }
        }
        return yjVar;
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
