package defpackage;

import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class xz0 extends a {
    public static final xz0 f = new xz0();

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        kl.g.f.b(runnable, true, false);
    }

    @Override // kotlinx.coroutines.a
    public final a f(int i) {
        i60.p(i);
        return i >= wu0.d ? this : super.f(i);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.IO";
    }
}
