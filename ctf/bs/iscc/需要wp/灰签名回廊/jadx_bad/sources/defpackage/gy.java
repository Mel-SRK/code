package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gy extends r {
    public final w d;
    public final int e;
    public final int f;

    public gy(w wVar, int i, int i2) {
        this.d = wVar;
        this.e = i;
        d41.p(i, i2, wVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d41.n(i, this.f);
        return this.d.get(this.e + i);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        d41.p(i, i2, this.f);
        int i3 = this.e;
        return new gy(this.d, i + i3, i3 + i2);
    }
}
