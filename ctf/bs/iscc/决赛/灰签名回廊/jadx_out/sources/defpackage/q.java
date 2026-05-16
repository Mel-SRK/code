package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r implements RandomAccess {
    public final r d;
    public final int e;
    public final int f;

    public q(r rVar, int i, int i2) {
        this.d = rVar;
        this.e = i;
        f00.l(i, i2, rVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return null;
        }
        return this.d.get(this.e + i);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        f00.l(i, i2, this.f);
        int i3 = this.e;
        return new q(this.d, i + i3, i3 + i2);
    }
}
