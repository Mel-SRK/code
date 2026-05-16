package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vg extends o9 {
    public final m9 n;

    public vg(int i, m9 m9Var) {
        super(i);
        this.n = m9Var;
        if (m9Var == m9.d) {
            wc.j("This implementation does not support suspension for senders, use ", yi0.a(o9.class).a(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        wc.i("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object af(Object obj, boolean z) {
        m9 m9Var = this.n;
        m9 m9Var2 = m9.f;
        wz0 wz0Var = wz0.a;
        if (m9Var == m9Var2) {
            Object objU = super.u(obj);
            return (!(objU instanceof jb) || (objU instanceof ib)) ? objU : wz0Var;
        }
        hq hqVar = q9.d;
        kb kbVar = (kb) o9.i.get(this);
        while (true) {
            long andIncrement = o9.e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zT = t(andIncrement, false);
            int i = q9.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (kbVar.c != j3) {
                kb kbVarB = o9.b(this, j3, kbVar);
                if (kbVarB != null) {
                    kbVar = kbVarB;
                } else if (zT) {
                    return new ib(p());
                }
            }
            int iE = o9.e(this, kbVar, i2, obj, j, hqVar, zT);
            if (iE == 0) {
                kbVar.a();
                return wz0Var;
            }
            if (iE == 1) {
                break;
            }
            if (iE != 2) {
                if (iE == 3) {
                    wc.q("unexpected");
                    return null;
                }
                if (iE == 4) {
                    if (j < o9.f.get(this)) {
                        kbVar.a();
                    }
                    return new ib(p());
                }
                if (iE == 5) {
                    kbVar.a();
                }
            } else {
                if (zT) {
                    kbVar.h();
                    return new ib(p());
                }
                w11 w11Var = hqVar instanceof w11 ? (w11) hqVar : null;
                if (w11Var != null) {
                    w11Var.a(kbVar, i2 + i);
                }
                j((kbVar.c * j2) + ((long) i2));
            }
        }
    }

    @Override // defpackage.o9, defpackage.lp0
    public final Object c(ji jiVar, Object obj) throws Throwable {
        if (af(obj, true) instanceof ib) {
            throw p();
        }
        return wz0.a;
    }

    @Override // defpackage.o9, defpackage.lp0
    public final Object u(Object obj) {
        return af(obj, false);
    }

    @Override // defpackage.o9
    public final boolean v() {
        return this.n == m9.e;
    }
}
