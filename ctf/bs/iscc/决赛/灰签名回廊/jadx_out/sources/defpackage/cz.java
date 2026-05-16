package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cz {
    public final Object a;
    public final View b;

    public cz(View view) {
        this.b = view;
        this.a = e00.ac(new b(11, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x20] */
    public InputMethodManager a() {
        return (InputMethodManager) this.a.getValue();
    }

    public AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionG = d0.g(this.a);
        m7 m7VarD = wn0.d(this.b);
        Objects.requireNonNull(m7VarD);
        return ih.b(contentCaptureSessionG, ar.e(m7VarD.a), j);
    }

    public cz(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }
}
