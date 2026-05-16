package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb0 implements db0 {
    public final /* synthetic */ Object d;

    public /* synthetic */ gb0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.db0
    public e31 a(View view, e31 e31Var) {
        du0 du0Var = (du0) this.d;
        ArrayList arrayList = du0Var.b;
        b31 b31Var = e31Var.a;
        iz izVarB = iz.b(b31Var.f(519), b31Var.f(64));
        iz izVarB2 = iz.b(b31Var.g(519), b31Var.g(64));
        if (!izVarB.equals(du0Var.c) || !izVarB2.equals(du0Var.d)) {
            du0Var.c = izVarB;
            du0Var.d = izVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yh0 yh0Var = (yh0) arrayList.get(size);
                yh0Var.c = izVarB;
                yh0Var.d = izVarB2;
                yh0Var.c();
            }
        }
        return e31Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void b() {
        gv gvVar = (gv) this.d;
        synchronized (fr0.c) {
            ?? r2 = fr0.h;
            r2.getClass();
            ArrayList arrayList = new ArrayList(lc.an(r2));
            boolean z = false;
            for (Object obj : r2) {
                boolean z2 = true;
                if (!z && f00.h(obj, gvVar)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            fr0.h = arrayList;
        }
    }
}
