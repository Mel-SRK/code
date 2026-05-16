package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class k21 extends l21 {
    public final WindowInsetsAnimation e;

    public k21(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.l21
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.l21
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.l21
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.l21
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.l21
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
