package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class z8 implements r8 {
    public final /* synthetic */ ql d;

    public z8(ql qlVar) {
        this.d = qlVar;
    }

    @Override // defpackage.r8
    public final Object l(fa0 fa0Var, pu puVar, ki kiVar) {
        View viewAg = e00.ag(this.d);
        long jAm = fa0Var.am(0L);
        ri0 ri0Var = (ri0) puVar.a();
        ri0 ri0VarG = ri0Var != null ? ri0Var.g(jAm) : null;
        if (ri0VarG != null) {
            viewAg.requestRectangleOnScreen(new Rect((int) ri0VarG.a, (int) ri0VarG.b, (int) ri0VarG.c, (int) ri0VarG.d), false);
        }
        return wz0.a;
    }
}
