package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9 implements o70 {
    public final t4 d;
    public Throwable f;
    public final Object e = new Object();
    public final i7 g = new i7(0);
    public m80 h = new m80();
    public m80 i = new m80();

    public h9(t4 t4Var) {
        this.d = t4Var;
    }

    public final void c(long j) {
        int i;
        la laVar;
        Object sj0Var;
        synchronized (this.e) {
            try {
                m80 m80Var = this.h;
                this.h = this.i;
                this.i = m80Var;
                i7 i7Var = this.g;
                do {
                    i = i7Var.get();
                } while (!i7Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = m80Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    f9 f9Var = (f9) m80Var.e(i3);
                    cv cvVar = f9Var.a;
                    if (cvVar != null && (laVar = f9Var.b) != null) {
                        try {
                            sj0Var = cvVar.g(Long.valueOf(j));
                        } catch (Throwable th) {
                            sj0Var = new sj0(th);
                        }
                        laVar.h(sj0Var);
                    }
                }
                m80Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.o70
    public final Object m(cv cvVar, ji jiVar) {
        int i;
        int i2;
        int i3;
        la laVar = new la(1, f00.x(jiVar));
        laVar.t();
        f9 f9Var = new f9();
        f9Var.a = cvVar;
        f9Var.b = laVar;
        vi0 vi0Var = new vi0();
        vi0Var.d = -1;
        synchronized (this.e) {
            Throwable th = this.f;
            if (th != null) {
                laVar.h(new sj0(th));
            } else {
                i7 i7Var = this.g;
                do {
                    i = i7Var.get();
                    i2 = i + 1;
                } while (!i7Var.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                vi0Var.d = (i2 >>> 27) & 15;
                this.h.a(f9Var);
                laVar.v(new g9(f9Var, this, vi0Var));
                if (z) {
                    try {
                        this.d.a();
                    } catch (Throwable th2) {
                        synchronized (this.e) {
                            try {
                                if (this.f == null) {
                                    this.f = th2;
                                    m80 m80Var = this.h;
                                    Object[] objArr = m80Var.a;
                                    int i4 = m80Var.b;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        la laVar2 = ((f9) objArr[i5]).b;
                                        if (laVar2 != null) {
                                            laVar2.h(new sj0(th2));
                                        }
                                    }
                                    this.h.c();
                                    i7 i7Var2 = this.g;
                                    do {
                                        i3 = i7Var2.get();
                                    } while (!i7Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return laVar.s();
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        return pk.am(this, ojVar);
    }
}
