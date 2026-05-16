package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class eq implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = gy0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (yp.d()) {
                yp.a().e();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = gy0.a;
            Trace.endSection();
            throw th;
        }
    }
}
