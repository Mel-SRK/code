package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class el implements k60 {
    public final /* synthetic */ int d;
    public final k60 e;
    public final Enum f;
    public final Enum g;

    public /* synthetic */ el(k60 k60Var, Enum r2, Enum r3, int i) {
        this.d = i;
        this.e = k60Var;
        this.f = r2;
        this.g = r3;
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        switch (this.d) {
        }
        return this.e.ap(i);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        switch (this.d) {
        }
        return this.e.aw(i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        switch (this.d) {
        }
        return this.e.ax(i);
    }

    @Override // defpackage.k60
    public final lf0 e(long j) {
        switch (this.d) {
            case 0:
                c00 c00Var = (c00) this.g;
                b00 b00Var = (b00) this.f;
                b00 b00Var2 = b00.e;
                k60 k60Var = this.e;
                if (c00Var == c00.d) {
                    return new or(b00Var == b00Var2 ? k60Var.aw(dh.g(j)) : k60Var.ap(dh.g(j)), dh.c(j) ? dh.g(j) : 32767, 0);
                }
                return new or(dh.d(j) ? dh.h(j) : 32767, b00Var == b00Var2 ? k60Var.f(dh.h(j)) : k60Var.ax(dh.h(j)), 0);
            case 1:
                t60 t60Var = (t60) this.g;
                s60 s60Var = (s60) this.f;
                s60 s60Var2 = s60.e;
                k60 k60Var2 = this.e;
                if (t60Var == t60.d) {
                    return new or(s60Var == s60Var2 ? k60Var2.aw(dh.g(j)) : k60Var2.ap(dh.g(j)), dh.c(j) ? dh.g(j) : 32767, 1);
                }
                return new or(dh.d(j) ? dh.h(j) : 32767, s60Var == s60Var2 ? k60Var2.f(dh.h(j)) : k60Var2.ax(dh.h(j)), 1);
            default:
                ja0 ja0Var = (ja0) this.g;
                ia0 ia0Var = (ia0) this.f;
                ia0 ia0Var2 = ia0.e;
                k60 k60Var3 = this.e;
                if (ja0Var == ja0.d) {
                    return new or(ia0Var == ia0Var2 ? k60Var3.aw(dh.g(j)) : k60Var3.ap(dh.g(j)), dh.c(j) ? dh.g(j) : 32767, 2);
                }
                return new or(dh.d(j) ? dh.h(j) : 32767, ia0Var == ia0Var2 ? k60Var3.f(dh.h(j)) : k60Var3.ax(dh.h(j)), 2);
        }
    }

    @Override // defpackage.k60
    public final int f(int i) {
        switch (this.d) {
        }
        return this.e.f(i);
    }

    @Override // defpackage.k60
    public final Object j() {
        switch (this.d) {
        }
        return this.e.j();
    }
}
