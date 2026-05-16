package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends tf0 {
    @Override // defpackage.tf0, defpackage.rf0
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        boolean zAd = d41.ad(j2);
        Magnifier magnifier = this.a;
        if (zAd) {
            magnifier.show(xa0.d(j), xa0.e(j), xa0.d(j2), xa0.e(j2));
        } else {
            magnifier.show(xa0.d(j), xa0.e(j));
        }
    }
}
