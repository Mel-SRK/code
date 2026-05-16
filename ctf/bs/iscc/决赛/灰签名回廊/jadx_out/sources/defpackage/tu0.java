package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 implements m5 {
    public final l01 a;
    public final zy0 b;
    public final Object c;
    public final Object d;
    public final w5 e;
    public final w5 f;
    public final w5 g;
    public long h;
    public w5 i;

    public tu0(q5 q5Var, zy0 zy0Var, Object obj, Object obj2, w5 w5Var) {
        this.a = q5Var.a(zy0Var);
        this.b = zy0Var;
        this.c = obj2;
        this.d = obj;
        this.e = (w5) zy0Var.a.g(obj);
        cv cvVar = zy0Var.a;
        this.f = (w5) cvVar.g(obj2);
        this.g = w5Var != null ? m10.r(w5Var) : ((w5) cvVar.g(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.m5
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.m5
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        w5 w5VarK = this.a.k(j, this.e, this.f, this.g);
        int iB = w5VarK.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(w5VarK.a(i))) {
                eh0.b("AnimationVector cannot contain a NaN. " + w5VarK + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.g(w5VarK);
    }

    @Override // defpackage.m5
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.n(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.m5
    public final zy0 d() {
        return this.b;
    }

    @Override // defpackage.m5
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.m5
    public final w5 f(long j) {
        if (!g(j)) {
            return this.a.i(j, this.e, this.f, this.g);
        }
        w5 w5Var = this.i;
        if (w5Var != null) {
            return w5Var;
        }
        w5 w5VarL = this.a.l(this.e, this.f, this.g);
        this.i = w5VarL;
        return w5VarL;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
