package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww implements bh0 {
    public final bx a;
    public final bb0 b;
    public long c = 0;

    public ww(bx bxVar, bb0 bb0Var) {
        this.a = bxVar;
        this.b = bb0Var;
    }

    @Override // defpackage.bh0
    public final long a(tz tzVar, long j, e20 e20Var, long j2) {
        long jA = this.b.a();
        if (!d41.ad(jA)) {
            jA = this.c;
        }
        this.c = jA;
        return pz.c(pz.c((((long) tzVar.a) << 32) | (((long) tzVar.b) & 4294967295L), t1.au(jA)), this.a.a(j2, 0L, e20Var));
    }
}
