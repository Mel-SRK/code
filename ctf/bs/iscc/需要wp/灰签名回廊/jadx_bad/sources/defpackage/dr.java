package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes.dex */
public final class dr extends er {
    public final la f;
    public final /* synthetic */ c g;

    public dr(c cVar, long j, la laVar) {
        this.g = cVar;
        this.d = j;
        this.e = -1;
        this.f = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.ae(this.g);
    }

    @Override // defpackage.er
    public final String toString() {
        return super.toString() + this.f;
    }
}
