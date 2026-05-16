package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sw0 implements gg0 {
    public final View a;
    public final o6 b;
    public final tw0 c;
    public boolean d;
    public x10 e;
    public cv f;
    public lw0 g;
    public ey h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final jk l;
    public final a90 m;
    public m0 n;

    public sw0(View view, b1 b1Var) {
        o6 o6Var = new o6();
        o6Var.a = view;
        o6Var.b = e00.ac(new b(10, o6Var));
        o6Var.c = new bu(view);
        tw0 tw0Var = new tw0(Choreographer.getInstance());
        this.a = view;
        this.b = o6Var;
        this.c = tw0Var;
        this.e = yv0.h;
        this.f = yv0.i;
        this.g = new lw0("", hx0.b, 4);
        this.h = ey.g;
        this.i = new ArrayList();
        this.j = e00.ac(new b(19, this));
        this.l = new jk(b1Var, o6Var);
        this.m = new a90(new rw0[16]);
    }

    @Override // defpackage.gg0
    public final void a(lw0 lw0Var, ey eyVar, g5 g5Var, wi wiVar) {
        this.d = true;
        this.g = lw0Var;
        this.h = eyVar;
        this.e = g5Var;
        this.f = wiVar;
        i(rw0.d);
    }

    @Override // defpackage.gg0
    public final void b() {
        i(rw0.d);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, x20] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, x20] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, x20] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, x20] */
    @Override // defpackage.gg0
    public final void c(lw0 lw0Var, lw0 lw0Var2) {
        boolean z = (hx0.a(this.g.b, lw0Var2.b) && f00.h(this.g.c, lw0Var2.c)) ? false : true;
        this.g = lw0Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            ni0 ni0Var = (ni0) ((WeakReference) this.i.get(i)).get();
            if (ni0Var != null) {
                ni0Var.d = lw0Var2;
            }
        }
        jk jkVar = this.l;
        synchronized (jkVar.c) {
            jkVar.j = null;
            jkVar.l = null;
            jkVar.k = null;
            jkVar.m = q0.y;
            jkVar.n = null;
            jkVar.o = null;
        }
        if (f00.h(lw0Var, lw0Var2)) {
            if (z) {
                o6 o6Var = this.b;
                int iE = hx0.e(lw0Var2.b);
                int iD = hx0.d(lw0Var2.b);
                hx0 hx0Var = this.g.c;
                int iE2 = hx0Var != null ? hx0.e(hx0Var.a) : -1;
                hx0 hx0Var2 = this.g.c;
                ((InputMethodManager) o6Var.b.getValue()).updateSelection((View) o6Var.a, iE, iD, iE2, hx0Var2 != null ? hx0.d(hx0Var2.a) : -1);
                return;
            }
            return;
        }
        if (lw0Var != null && (!f00.h(lw0Var.a.e, lw0Var2.a.e) || (hx0.a(lw0Var.b, lw0Var2.b) && !f00.h(lw0Var.c, lw0Var2.c)))) {
            o6 o6Var2 = this.b;
            ((InputMethodManager) o6Var2.b.getValue()).restartInput((View) o6Var2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ni0 ni0Var2 = (ni0) ((WeakReference) this.i.get(i2)).get();
            if (ni0Var2 != null) {
                lw0 lw0Var3 = this.g;
                o6 o6Var3 = this.b;
                if (ni0Var2.h) {
                    ni0Var2.d = lw0Var3;
                    if (ni0Var2.f) {
                        ((InputMethodManager) o6Var3.b.getValue()).updateExtractedText((View) o6Var3.a, ni0Var2.e, az0.am(lw0Var3));
                    }
                    hx0 hx0Var3 = lw0Var3.c;
                    long j = lw0Var3.b;
                    int iE3 = hx0Var3 != null ? hx0.e(hx0Var3.a) : -1;
                    hx0 hx0Var4 = lw0Var3.c;
                    ((InputMethodManager) o6Var3.b.getValue()).updateSelection((View) o6Var3.a, hx0.e(j), hx0.d(j), iE3, hx0Var4 != null ? hx0.d(hx0Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.gg0
    public final void d() {
        i(rw0.f);
    }

    @Override // defpackage.gg0
    public final void e() {
        i(rw0.g);
    }

    @Override // defpackage.gg0
    public final void f(lw0 lw0Var, ab0 ab0Var, zw0 zw0Var, l1 l1Var, ri0 ri0Var, ri0 ri0Var2) {
        jk jkVar = this.l;
        synchronized (jkVar.c) {
            try {
                jkVar.j = lw0Var;
                jkVar.l = ab0Var;
                jkVar.k = zw0Var;
                jkVar.m = l1Var;
                jkVar.n = ri0Var;
                jkVar.o = ri0Var2;
                if (jkVar.e || jkVar.d) {
                    jkVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gg0
    public final void g() {
        this.d = false;
        this.e = yv0.j;
        this.f = yv0.k;
        this.k = null;
        i(rw0.e);
    }

    @Override // defpackage.gg0
    public final void h(ri0 ri0Var) {
        Rect rect;
        this.k = new Rect(i60.ax(ri0Var.a), i60.ax(ri0Var.b), i60.ax(ri0Var.c), i60.ax(ri0Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(rw0 rw0Var) {
        this.m.b(rw0Var);
        if (this.n == null) {
            m0 m0Var = new m0(9, this);
            this.c.execute(m0Var);
            this.n = m0Var;
        }
    }
}
