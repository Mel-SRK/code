package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends a10 implements ji, xj {
    public final pj f;

    public l(pj pjVar, boolean z) {
        super(z);
        ap((t00) pjVar.k(bw.ae));
        this.f = pjVar.j(this);
    }

    @Override // defpackage.a10
    public final String ae() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.a10
    public final void ao(xd xdVar) {
        m10.ae(this.f, xdVar);
    }

    @Override // defpackage.a10
    public final void aw(Object obj) {
        if (!(obj instanceof wd)) {
            bf(obj);
        } else {
            wd wdVar = (wd) obj;
            be(wdVar.a, wd.b.get(wdVar) != 0);
        }
    }

    public final void bg(ck ckVar, l lVar, gv gvVar) {
        Object objF;
        int iOrdinal = ckVar.ordinal();
        wz0 wz0Var = wz0.a;
        if (iOrdinal == 0) {
            try {
                az0.ad(f00.x(f00.p(lVar, this, gvVar)), wz0Var);
                return;
            } finally {
                h(new sj0(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                gvVar.getClass();
                f00.x(f00.p(lVar, this, gvVar)).h(wz0Var);
                return;
            }
            if (iOrdinal != 3) {
                wc.l();
                return;
            }
            try {
                pj pjVar = this.f;
                Object objAw = t1.aw(pjVar, null);
                try {
                    if (gvVar instanceof s7) {
                        az0.p(2, gvVar);
                        objF = gvVar.f(lVar, this);
                    } else {
                        objF = f00.am(gvVar, lVar, this);
                    }
                    t1.at(pjVar, objAw);
                    if (objF != yj.d) {
                        h(objF);
                    }
                } catch (Throwable th) {
                    t1.at(pjVar, objAw);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.f;
    }

    @Override // defpackage.xj
    public final pj f() {
        return this.f;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        Throwable thA = tj0.a(obj);
        if (thA != null) {
            obj = new wd(thA, false);
        }
        Object objAt = at(obj);
        if (objAt == az0.e) {
            return;
        }
        aa(objAt);
    }

    public void bf(Object obj) {
    }

    public void be(Throwable th, boolean z) {
    }
}
