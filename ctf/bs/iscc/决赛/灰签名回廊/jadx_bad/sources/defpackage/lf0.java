package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lf0 {
    public int d;
    public int e;
    public long f;
    public long g = mf0.a;
    public long h = 0;

    public lf0() {
        long j = 0;
        this.f = (j & 4294967295L) | (j << 32);
    }

    public int ay() {
        return (int) (this.f & 4294967295L);
    }

    public int az() {
        return (int) (this.f >> 32);
    }

    public final void bb() {
        this.d = i60.t((int) (this.f >> 32), dh.j(this.g), dh.h(this.g));
        int iT = i60.t((int) (this.f & 4294967295L), dh.i(this.g), dh.g(this.g));
        this.e = iT;
        int i = this.d;
        long j = this.f;
        this.h = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iT - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void bc(long j, float f, cv cvVar);

    public final void bd(long j) {
        if (wz.a(this.f, j)) {
            return;
        }
        this.f = j;
        bb();
    }

    public final void bf(long j) {
        if (dh.b(this.g, j)) {
            return;
        }
        this.g = j;
        bb();
    }

    public Object j() {
        return null;
    }
}
