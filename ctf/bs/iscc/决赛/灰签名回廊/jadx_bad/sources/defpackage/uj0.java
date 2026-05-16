package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj0 implements em {
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public long l;
    public aq0 m;
    public boolean n;
    public long o;
    public em p;
    public e20 q;
    public int r;
    public bd0 s;

    public final void a(float f) {
        if (this.g == f) {
            return;
        }
        this.d |= 4;
        this.g = f;
    }

    @Override // defpackage.em
    public final float b() {
        return this.p.b();
    }

    public final void d(long j) {
        if (qc.c(this.i, j)) {
            return;
        }
        this.d |= 64;
        this.i = j;
    }

    public final void e(float f) {
        if (this.h == f) {
            return;
        }
        this.d |= 32;
        this.h = f;
    }

    public final void f(aq0 aq0Var) {
        if (f00.h(this.m, aq0Var)) {
            return;
        }
        this.d |= 8192;
        this.m = aq0Var;
    }

    public final void h(long j) {
        if (qc.c(this.j, j)) {
            return;
        }
        this.d |= 128;
        this.j = j;
    }

    @Override // defpackage.em
    public final float k() {
        return this.p.k();
    }
}
