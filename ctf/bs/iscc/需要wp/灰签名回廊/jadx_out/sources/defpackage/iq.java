package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iq implements hq {
    public final int d;
    public int e = -1;
    public int f = -1;

    public iq(int i) {
        this.d = i;
    }

    @Override // defpackage.hq
    public final boolean i(CharSequence charSequence, int i, int i2, kz0 kz0Var) {
        int i3 = this.d;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.e = i;
        this.f = i2;
        return false;
    }

    @Override // defpackage.hq
    public final Object a() {
        return this;
    }
}
