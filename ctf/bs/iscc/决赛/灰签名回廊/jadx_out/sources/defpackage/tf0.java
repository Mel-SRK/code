package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class tf0 implements rf0 {
    public final Magnifier a;

    public tf0(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.rf0
    public void a(long j, long j2) {
        this.a.show(xa0.d(j), xa0.e(j));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return e00.f(this.a.getWidth(), this.a.getHeight());
    }

    public final void d() {
        this.a.update();
    }
}
