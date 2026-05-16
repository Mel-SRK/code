package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends hq0 implements ns0 {
    @Override // defpackage.ns0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.k;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.l + ((long) ((int) ((o() + ((long) this.n)) - this.l)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.k;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.l + ((long) ((int) ((o() + ((long) this.n)) - this.l)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
