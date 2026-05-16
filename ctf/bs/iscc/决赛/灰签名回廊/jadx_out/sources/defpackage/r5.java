package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements ms0 {
    public final zy0 d;
    public final me0 e;
    public w5 f;
    public long g;
    public long h;
    public boolean i;

    public r5(zy0 zy0Var, Object obj, w5 w5Var, long j, long j2, boolean z) {
        w5 w5VarR;
        this.d = zy0Var;
        this.e = bo0.m(obj);
        if (w5Var != null) {
            w5VarR = m10.r(w5Var);
        } else {
            w5VarR = (w5) zy0Var.a.g(obj);
            w5VarR.d();
        }
        this.f = w5VarR;
        this.g = j;
        this.h = j2;
        this.i = z;
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return this.e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.e.getValue() + ", velocity=" + this.d.b.g(this.f) + ", isRunning=" + this.i + ", lastFrameTimeNanos=" + this.g + ", finishedTimeNanos=" + this.h + ')';
    }

    public /* synthetic */ r5(zy0 zy0Var, Object obj, w5 w5Var, int i) {
        this(zy0Var, obj, (i & 4) != 0 ? null : w5Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
