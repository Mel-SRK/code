package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class my0 implements ms0 {
    public final zy0 d;
    public final me0 e;
    public final me0 f;
    public final me0 g;
    public final me0 h;
    public final ie0 i;
    public boolean j;
    public final me0 k;
    public w5 l;
    public final ke0 m;
    public boolean n;
    public final es0 o;
    public final /* synthetic */ ny0 p;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public my0(ny0 ny0Var, Object obj, w5 w5Var, zy0 zy0Var) {
        this.p = ny0Var;
        this.d = zy0Var;
        me0 me0VarM = bo0.m(obj);
        this.e = me0VarM;
        Object objG = null;
        me0 me0VarM2 = bo0.m(f00.ad(7, null));
        this.f = me0VarM2;
        this.g = bo0.m(new tu0((nr) me0VarM2.getValue(), zy0Var, obj, me0VarM.getValue(), w5Var));
        this.h = bo0.m(Boolean.TRUE);
        this.i = new ie0(-1.0f);
        this.k = bo0.m(obj);
        this.l = w5Var;
        this.m = new ke0(a().c());
        Float f = (Float) v11.a.get(zy0Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            w5 w5Var2 = (w5) zy0Var.a.g(obj);
            int iB = w5Var2.b();
            for (int i = 0; i < iB; i++) {
                w5Var2.e(fFloatValue, i);
            }
            objG = this.d.b.g(w5Var2);
        }
        this.o = f00.ad(3, objG);
    }

    public final tu0 a() {
        return (tu0) this.g.getValue();
    }

    public final void b(Object obj, boolean z) {
        ny0 ny0Var = this.p;
        me0 me0Var = ny0Var.f;
        ke0 ke0Var = ny0Var.d;
        me0 me0Var2 = this.e;
        boolean zH = f00.h(null, me0Var2.getValue());
        ke0 ke0Var2 = this.m;
        me0 me0Var3 = this.g;
        nr nrVar = this.o;
        if (zH) {
            me0Var3.setValue(new tu0(nrVar, this.d, obj, obj, this.l.c()));
            this.j = true;
            ke0Var2.h(a().c());
            return;
        }
        me0 me0Var4 = this.f;
        if (!z || this.n || (((nr) me0Var4.getValue()) instanceof es0)) {
            nrVar = (nr) me0Var4.getValue();
        }
        me0Var3.setValue(new tu0(ke0Var.g() <= 0 ? nrVar : new is0(nrVar, ke0Var.g()), this.d, obj, me0Var2.getValue(), this.l));
        ke0Var2.h(a().c());
        this.j = false;
        me0Var.setValue(Boolean.TRUE);
        if (((Boolean) ny0Var.i.getValue()).booleanValue()) {
            pr0 pr0Var = ny0Var.g;
            int size = pr0Var.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                my0 my0Var = (my0) pr0Var.get(i);
                ke0 ke0Var3 = my0Var.m;
                me0 me0Var5 = my0Var.k;
                jMax = Math.max(jMax, ke0Var3.g());
                if (my0Var.i.g() == -1.0f) {
                    my0Var.n = true;
                    if (f00.h(my0Var.a().c, my0Var.a().d)) {
                        me0Var5.setValue(my0Var.a().c);
                    } else {
                        me0Var5.setValue(my0Var.a().b(0L));
                        my0Var.l = my0Var.a().f(0L);
                    }
                }
            }
            me0Var.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return this.k.getValue();
    }

    public final String toString() {
        return "current value: " + this.k.getValue() + ", target: " + this.e.getValue() + ", spec: " + ((nr) this.f.getValue());
    }
}
