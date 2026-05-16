package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class lf extends k {
    public final me0 l;
    public boolean m;

    public lf(MainActivity mainActivity) {
        super(mainActivity);
        this.l = bo0.m(null);
    }

    @Override // defpackage.k
    public final void a(int i, vf vfVar) {
        vfVar.aw(420213850);
        int i2 = (vfVar.h(this) ? 4 : 2) | i;
        if (vfVar.an(i2 & 1, (i2 & 3) != 2)) {
            gv gvVar = (gv) this.l.getValue();
            if (gvVar == null) {
                vfVar.av(-1238798753);
            } else {
                vfVar.av(98586082);
                gvVar.f(vfVar, 0);
            }
            vfVar.q(false);
        } else {
            vfVar.aq();
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j(i, 4, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return lf.class.getName();
    }

    @Override // defpackage.k
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    public final void setContent(gv gvVar) {
        this.m = true;
        this.l.setValue(gvVar);
        if (isAttachedToWindow()) {
            if (this.g != null || isAttachedToWindow()) {
                c();
            } else {
                wc.q("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
