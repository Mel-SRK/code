package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jz extends d21 implements Runnable, db0, View.OnAttachStateChangeListener {
    public boolean f;
    public int g;
    public e31 h;
    public final q80 i;
    public final je0 j;
    public final m80 k;
    public final pr0 l;

    public jz() {
        super(1);
        q80 q80Var = new q80(9);
        k31.a.getClass();
        q80Var.l(j31.b, new u31("caption bar"));
        q80Var.l(j31.c, new u31("display cutout"));
        q80Var.l(j31.d, new u31("ime"));
        q80Var.l(j31.e, new u31("mandatory system gestures"));
        q80Var.l(j31.f, new u31("navigation bars"));
        q80Var.l(j31.g, new u31("status bars"));
        q80Var.l(j31.h, new u31("system gestures"));
        q80Var.l(j31.i, new u31("tappable element"));
        q80Var.l(j31.j, new u31("waterfall"));
        this.i = q80Var;
        this.j = new je0(0);
        this.k = new m80(4);
        this.l = new pr0();
    }

    @Override // defpackage.db0
    public final e31 a(View view, e31 e31Var) {
        if (this.f) {
            this.h = e31Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return e31Var;
            }
        } else if (this.g == 0) {
            f(e31Var);
        }
        return e31Var;
    }

    @Override // defpackage.d21
    public final void b(m21 m21Var) {
        boolean z = false;
        this.f = false;
        int iD = m21Var.a.d();
        this.g &= ~iD;
        this.h = null;
        k31 k31Var = (k31) b.c.b(iD);
        if (k31Var != null) {
            Object objG = this.i.g(k31Var);
            objG.getClass();
            u31 u31Var = (u31) objG;
            u31Var.c.h(0.0f);
            u31Var.e.h(1.0f);
            u31Var.d.h(0L);
            u31Var.c.h(0.0f);
            u31Var.b.setValue(Boolean.FALSE);
            u31Var.j = -1L;
            u31Var.k = -1L;
            je0 je0Var = this.j;
            je0Var.h(je0Var.g() + 1);
            synchronized (fr0.c) {
                r80 r80Var = fr0.j.h;
                if (r80Var != null) {
                    if (r80Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                fr0.a();
            }
        }
    }

    @Override // defpackage.d21
    public final void c(m21 m21Var) {
        this.f = true;
    }

    @Override // defpackage.d21
    public final e31 d(e31 e31Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m21 m21Var = (m21) list.get(i);
            k31 k31Var = (k31) b.c.b(m21Var.a.d());
            if (k31Var != null) {
                Object objG = this.i.g(k31Var);
                objG.getClass();
                u31 u31Var = (u31) objG;
                if (((Boolean) u31Var.b.getValue()).booleanValue()) {
                    l21 l21Var = m21Var.a;
                    u31Var.c.h(l21Var.c());
                    u31Var.e.h(l21Var.a());
                    u31Var.d.h(l21Var.b());
                }
            }
        }
        f(e31Var);
        return e31Var;
    }

    @Override // defpackage.d21
    public final f1 e(m21 m21Var, f1 f1Var) {
        e31 e31Var = this.h;
        boolean z = false;
        this.f = false;
        this.h = null;
        if (m21Var.a.b() > 0 && e31Var != null) {
            int iD = m21Var.a.d();
            this.g |= iD;
            k31 k31Var = (k31) b.c.b(iD);
            if (k31Var != null) {
                Object objG = this.i.g(k31Var);
                objG.getClass();
                u31 u31Var = (u31) objG;
                iz izVarF = e31Var.a.f(iD);
                long j = (((long) izVarF.a) << 48) | (((long) izVarF.b) << 32) | (((long) izVarF.c) << 16) | ((long) izVarF.d);
                long j2 = u31Var.h;
                if (!qo0.e(j, j2)) {
                    u31Var.j = j2;
                    u31Var.k = j;
                    u31Var.b.setValue(Boolean.TRUE);
                    l21 l21Var = m21Var.a;
                    u31Var.c.h(l21Var.c());
                    u31Var.e.h(l21Var.a());
                    u31Var.d.h(l21Var.b());
                    je0 je0Var = this.j;
                    je0Var.h(je0Var.g() + 1);
                    synchronized (fr0.c) {
                        r80 r80Var = fr0.j.h;
                        if (r80Var != null) {
                            if (r80Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        fr0.a();
                        return f1Var;
                    }
                }
            }
        }
        return f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.e31 r34) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.f(e31):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = f11.a;
        a11.b(view, this);
        f11.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = f11.a;
        a11.b(view, null);
        f11.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.g = 0;
            this.f = false;
            e31 e31Var = this.h;
            if (e31Var != null) {
                f(e31Var);
                this.h = null;
            }
        }
    }
}
