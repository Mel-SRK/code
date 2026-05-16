package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th implements bh0 {
    public final long a;

    public th(long j) {
        this.a = j;
    }

    @Override // defpackage.bh0
    public final long a(tz tzVar, long j, e20 e20Var, long j2) {
        int i = tzVar.a;
        long j3 = this.a;
        return t1.b(m10.j(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), e20Var == e20.d), m10.j(tzVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true));
    }
}
