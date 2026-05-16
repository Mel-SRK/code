package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class oh0 extends l implements ya, lp0 {
    public final o9 g;

    public oh0(pj pjVar, o9 o9Var) {
        super(pjVar, true);
        this.g = o9Var;
    }

    @Override // defpackage.a10, defpackage.t00
    public final void a(CancellationException cancellationException) {
        Object obj = a10.d.get(this);
        if (obj instanceof wd) {
            return;
        }
        if ((obj instanceof z00) && ((z00) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new u00(ae(), null, this);
        }
        ac(cancellationException);
    }

    @Override // defpackage.a10
    public final void ac(CancellationException cancellationException) {
        this.g.g(cancellationException, true);
        ab(cancellationException);
    }

    @Override // defpackage.l
    public final void be(Throwable th, boolean z) {
        if (this.g.g(th, false) || z) {
            return;
        }
        m10.ae(this.f, th);
    }

    @Override // defpackage.l
    public final void bf(Object obj) {
        this.g.g(null, false);
    }

    @Override // defpackage.lp0
    public final Object c(ji jiVar, Object obj) {
        return this.g.c(jiVar, obj);
    }

    @Override // defpackage.ya
    public final n9 iterator() {
        o9 o9Var = this.g;
        o9Var.getClass();
        return new n9(o9Var);
    }

    @Override // defpackage.ya
    public final Object o(tt0 tt0Var) {
        return this.g.o(tt0Var);
    }

    @Override // defpackage.ya
    public final Object s() {
        return this.g.s();
    }

    @Override // defpackage.lp0
    public final Object u(Object obj) {
        return this.g.u(obj);
    }
}
