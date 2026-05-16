package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends i70 implements b20 {
    public cv r;
    public long s;

    @Override // defpackage.i70
    public final boolean bj() {
        return true;
    }

    @Override // defpackage.b20
    public final void s(long j) {
        if (wz.a(this.s, j)) {
            return;
        }
        this.r.g(new wz(j));
        this.s = j;
    }
}
