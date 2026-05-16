package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cn
    public final void a() {
        switch (this.a) {
            case 0:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((b2) this.c);
                break;
            case 1:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((c2) this.c);
                break;
            case 2:
                w80 w80Var = (w80) this.b;
                jh0 jh0Var = (jh0) w80Var.getValue();
                if (jh0Var != null) {
                    ih0 ih0Var = new ih0(jh0Var);
                    g80 g80Var = (g80) this.c;
                    if (g80Var != null) {
                        g80Var.b(ih0Var);
                    }
                    w80Var.setValue(null);
                }
                break;
            default:
                ny0 ny0Var = (ny0) this.b;
                ny0Var.g.remove((my0) this.c);
                break;
        }
    }
}
