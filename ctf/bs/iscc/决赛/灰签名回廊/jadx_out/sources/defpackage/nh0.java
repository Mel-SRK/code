package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class nh0 implements u30 {
    public static final nh0 l = new nh0();
    public int d;
    public int e;
    public Handler h;
    public boolean f = true;
    public boolean g = true;
    public final w30 i = new w30(this);
    public final m0 j = new m0(5, this);
    public final bu k = new bu(15, this);

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            if (this.f) {
                this.i.e(n30.ON_RESUME);
                this.f = false;
            } else {
                Handler handler = this.h;
                handler.getClass();
                handler.removeCallbacks(this.j);
            }
        }
    }

    @Override // defpackage.u30
    public final p30 getLifecycle() {
        return this.i;
    }
}
