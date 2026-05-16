package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h01 implements ab0 {
    public final int d;
    public final int e;

    public h01(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ab0
    public final int b(int i) {
        if (i >= 0 && i <= this.e) {
            pk.bm(i, this.d, i);
        }
        return i;
    }

    @Override // defpackage.ab0
    public final int d(int i) {
        if (i >= 0 && i <= this.d) {
            pk.bl(i, this.e, i);
        }
        return i;
    }
}
