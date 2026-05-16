package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class k6 {
    public static final k6 a = new k6();

    public final void a(h30 h30Var, cw0 cw0Var, HandwritingGesture handwritingGesture, i11 i11Var, Executor executor, final IntConsumer intConsumer, cv cvVar) {
        final int i = h30Var != null ? gx.a.i(h30Var, handwritingGesture, cw0Var, i11Var, cvVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: j6
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i);
                }
            });
        } else {
            intConsumer.accept(i);
        }
    }

    public final boolean b(h30 h30Var, cw0 cw0Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (h30Var != null) {
            return gx.a.aa(h30Var, previewableHandwritingGesture, cw0Var, cancellationSignal);
        }
        return false;
    }
}
