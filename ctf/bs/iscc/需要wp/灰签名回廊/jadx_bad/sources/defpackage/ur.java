package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface ur extends q5 {
    @Override // defpackage.q5
    default l01 a(zy0 zy0Var) {
        return new a0(this);
    }

    float b(long j, float f, float f2, float f3);

    float c(long j, float f, float f2, float f3);

    long d(float f, float f2, float f3);

    default float e(float f, float f2, float f3) {
        return c(d(f, f2, f3), f, f2, f3);
    }
}
