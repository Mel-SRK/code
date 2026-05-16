package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends m10 {
    @Override // defpackage.m10
    public final void ao(ac acVar, ac acVar2) {
        acVar.b = acVar2;
    }

    @Override // defpackage.m10
    public final void ap(ac acVar, Thread thread) {
        acVar.a = thread;
    }

    @Override // defpackage.m10
    public final boolean l(ad adVar, z zVar) {
        z zVar2 = z.b;
        synchronized (adVar) {
            try {
                if (adVar.e != zVar) {
                    return false;
                }
                adVar.e = zVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m10
    public final boolean m(ad adVar, Object obj, Object obj2) {
        synchronized (adVar) {
            try {
                if (adVar.d != obj) {
                    return false;
                }
                adVar.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m10
    public final boolean n(ad adVar, ac acVar, ac acVar2) {
        synchronized (adVar) {
            try {
                if (adVar.f != acVar) {
                    return false;
                }
                adVar.f = acVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
