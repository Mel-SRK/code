package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ny0 {
    public final f1 a;
    public final me0 b = bo0.m(c());
    public final me0 c = bo0.m(new ly0(c(), c()));
    public final ke0 d = new ke0(0);
    public final ke0 e = new ke0(Long.MIN_VALUE);
    public final me0 f;
    public final pr0 g;
    public final pr0 h;
    public final me0 i;

    public ny0(hz hzVar) {
        this.a = new f1(hzVar);
        Boolean bool = Boolean.FALSE;
        this.f = bo0.m(bool);
        this.g = new pr0();
        this.h = new pr0();
        this.i = bo0.m(bool);
        bo0.f(new b(21, this));
    }

    public final void a(hz hzVar, vf vfVar, int i) {
        vfVar.aw(-1493585151);
        if ((((vfVar.f(hzVar) ? 4 : 2) | i) & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else if (((Boolean) this.i.getValue()).booleanValue()) {
            vfVar.av(1823861403);
            vfVar.q(false);
        } else {
            vfVar.av(1822376658);
            me0 me0Var = this.b;
            boolean zH = f00.h(me0Var.getValue(), hzVar);
            me0 me0Var2 = this.f;
            ke0 ke0Var = this.e;
            if (!zH) {
                this.c.setValue(new ly0(me0Var.getValue(), hzVar));
                if (!f00.h(c(), me0Var.getValue())) {
                    ((me0) this.a.f).setValue(me0Var.getValue());
                }
                me0Var.setValue(hzVar);
                if (ke0Var.g() == Long.MIN_VALUE) {
                    me0Var2.setValue(Boolean.TRUE);
                }
                f();
            }
            if (hzVar.equals(c()) && ke0Var.g() == Long.MIN_VALUE && !((Boolean) me0Var2.getValue()).booleanValue()) {
                vfVar.av(1823851483);
                vfVar.q(false);
            } else {
                vfVar.av(1822607949);
                Object objAk = vfVar.ak();
                n31 n31Var = nf.a;
                if (objAk == n31Var) {
                    pg pgVar = new pg(pk.q(vfVar));
                    vfVar.be(pgVar);
                    objAk = pgVar;
                }
                xj xjVar = ((pg) objAk).d;
                boolean zH2 = vfVar.h(xjVar);
                Object objAk2 = vfVar.ak();
                if (zH2 || objAk2 == n31Var) {
                    objAk2 = new a2(25, xjVar, this);
                    vfVar.be(objAk2);
                }
                cv cvVar = (cv) objAk2;
                boolean zF = vfVar.f(xjVar) | vfVar.f(this);
                Object objAk3 = vfVar.ak();
                if (zF || objAk3 == n31Var) {
                    objAk3 = new zm(cvVar);
                    vfVar.be(objAk3);
                }
                vfVar.q(false);
            }
            vfVar.q(false);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new y1(i, 9, this, hzVar);
        }
    }

    public final long b() {
        pr0 pr0Var = this.g;
        int size = pr0Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((my0) pr0Var.get(i)).m.g());
        }
        pr0 pr0Var2 = this.h;
        int size2 = pr0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((ny0) pr0Var2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return ((me0) this.a.f).getValue();
    }

    public final void d(long j, boolean z) {
        ke0 ke0Var = this.e;
        long jG = ke0Var.g();
        f1 f1Var = this.a;
        if (jG == Long.MIN_VALUE) {
            ke0Var.h(j);
            ((me0) f1Var.e).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((me0) f1Var.e).getValue()).booleanValue()) {
            ((me0) f1Var.e).setValue(Boolean.TRUE);
        }
        this.f.setValue(Boolean.FALSE);
        pr0 pr0Var = this.g;
        int size = pr0Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            my0 my0Var = (my0) pr0Var.get(i);
            me0 me0Var = my0Var.h;
            me0 me0Var2 = my0Var.h;
            if (!((Boolean) me0Var.getValue()).booleanValue()) {
                long jC = z ? my0Var.a().c() : j;
                my0Var.k.setValue(my0Var.a().b(jC));
                my0Var.l = my0Var.a().f(jC);
                if (my0Var.a().g(jC)) {
                    me0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) me0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        pr0 pr0Var2 = this.h;
        int size2 = pr0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ny0 ny0Var = (ny0) pr0Var2.get(i2);
            if (!f00.h(ny0Var.b.getValue(), ny0Var.c())) {
                ny0Var.d(j, z);
            }
            if (!f00.h(ny0Var.b.getValue(), ny0Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            e();
        }
    }

    public final void e() {
        this.e.h(Long.MIN_VALUE);
        f1 f1Var = this.a;
        if (f1Var != null) {
            ((me0) f1Var.f).setValue(this.b.getValue());
        }
        this.d.h(0L);
        ((me0) f1Var.e).setValue(Boolean.FALSE);
        pr0 pr0Var = this.h;
        int size = pr0Var.size();
        for (int i = 0; i < size; i++) {
            ((ny0) pr0Var.get(i)).e();
        }
    }

    public final void f() {
        pr0 pr0Var = this.g;
        int size = pr0Var.size();
        for (int i = 0; i < size; i++) {
            ((my0) pr0Var.get(i)).i.h(-2.0f);
        }
        pr0 pr0Var2 = this.h;
        int size2 = pr0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ny0) pr0Var2.get(i2)).f();
        }
    }

    public final String toString() {
        pr0 pr0Var = this.g;
        int size = pr0Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((my0) pr0Var.get(i)) + ", ";
        }
        return str;
    }
}
