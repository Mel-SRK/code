package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lk0 extends View {
    public static final int[] i = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] j = new int[0];
    public b01 d;
    public Boolean e;
    public Long f;
    public m0 g;
    public pu h;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? i : j;
            b01 b01Var = this.d;
            if (b01Var != null) {
                b01Var.setState(iArr);
            }
        } else {
            m0 m0Var = new m0(6, this);
            this.g = m0Var;
            postDelayed(m0Var, 50L);
        }
        this.f = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(lk0 lk0Var) {
        b01 b01Var = lk0Var.d;
        if (b01Var != null) {
            b01Var.setState(j);
        }
        lk0Var.g = null;
    }

    public final void b(jh0 jh0Var, boolean z, long j2, int i2, long j3, float f, pu puVar) {
        if (this.d == null || !Boolean.valueOf(z).equals(this.e)) {
            b01 b01Var = new b01(z);
            setBackground(b01Var);
            this.d = b01Var;
            this.e = Boolean.valueOf(z);
        }
        b01 b01Var2 = this.d;
        b01Var2.getClass();
        this.h = puVar;
        Integer num = b01Var2.f;
        if (num == null || num.intValue() != i2) {
            b01Var2.f = Integer.valueOf(i2);
            a01.a.a(b01Var2, i2);
        }
        e(f, j2, j3);
        if (z) {
            b01Var2.setHotspot(xa0.d(jh0Var.a), xa0.e(jh0Var.a));
        } else {
            b01Var2.setHotspot(b01Var2.getBounds().centerX(), b01Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.h = null;
        m0 m0Var = this.g;
        if (m0Var != null) {
            removeCallbacks(m0Var);
            m0 m0Var2 = this.g;
            m0Var2.getClass();
            m0Var2.run();
        } else {
            b01 b01Var = this.d;
            if (b01Var != null) {
                b01Var.setState(j);
            }
        }
        b01 b01Var2 = this.d;
        if (b01Var2 == null) {
            return;
        }
        b01Var2.setVisible(false, false);
        unscheduleDrawable(b01Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, long j2, long j3) {
        b01 b01Var = this.d;
        if (b01Var == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = qc.b(j3, f);
        qc qcVar = b01Var.e;
        if (!(qcVar == null ? false : qc.c(qcVar.a, jB))) {
            b01Var.e = new qc(jB);
            b01Var.setColor(ColorStateList.valueOf(m10.av(jB)));
        }
        Rect rect = new Rect(0, 0, i60.ax(pq0.d(j2)), i60.ax(pq0.b(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        b01Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        pu puVar = this.h;
        if (puVar != null) {
            puVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
