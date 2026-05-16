package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy0 {
    public static final /* synthetic */ int a = 0;

    static {
        e00.ac(ng.ab);
    }

    public static final my0 a(ny0 ny0Var, Object obj, Object obj2, nr nrVar, zy0 zy0Var, vf vfVar) {
        boolean zF = vfVar.f(ny0Var);
        Object objAk = vfVar.ak();
        Object obj3 = nf.a;
        if (zF || objAk == obj3) {
            w5 w5Var = (w5) zy0Var.a.g(obj2);
            w5Var.d();
            objAk = new my0(ny0Var, obj, w5Var, zy0Var);
            vfVar.be(objAk);
        }
        my0 my0Var = (my0) objAk;
        if (((Boolean) ny0Var.i.getValue()).booleanValue()) {
            my0Var.e.setValue(obj2);
            my0Var.f.setValue(nrVar);
            if (!f00.h(my0Var.a().d, obj) || !f00.h(my0Var.a().c, obj2)) {
                my0Var.b(obj, false);
            }
        } else {
            ie0 ie0Var = my0Var.i;
            me0 me0Var = my0Var.h;
            me0 me0Var2 = my0Var.e;
            me0 me0Var3 = my0Var.k;
            if ((!my0Var.j || !obj2.equals(null)) && (!f00.h(me0Var2.getValue(), obj2) || ie0Var.g() != -1.0f)) {
                me0Var2.setValue(obj2);
                my0Var.f.setValue(nrVar);
                my0Var.b(ie0Var.g() == -3.0f ? obj2 : me0Var3.getValue(), !((Boolean) me0Var.getValue()).booleanValue());
                me0Var.setValue(Boolean.valueOf(ie0Var.g() == -3.0f));
                if (ie0Var.g() >= 0.0f) {
                    me0Var3.setValue(my0Var.a().b((long) (ie0Var.g() * my0Var.a().c())));
                } else if (ie0Var.g() == -3.0f) {
                    me0Var3.setValue(obj2);
                }
                my0Var.j = false;
                my0Var.i.h(-1.0f);
            }
        }
        boolean zF2 = vfVar.f(ny0Var) | vfVar.f(my0Var);
        Object objAk2 = vfVar.ak();
        if (zF2 || objAk2 == obj3) {
            objAk2 = new a2(26, ny0Var, my0Var);
            vfVar.be(objAk2);
        }
        pk.b(my0Var, (cv) objAk2, vfVar);
        return my0Var;
    }
}
