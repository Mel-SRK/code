package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends vy0 {
    public final ze0 g;

    public xy0(ze0 ze0Var) {
        this.g = ze0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        this.f = i + 2;
        Object[] objArr = this.d;
        return new k80(this.g, objArr[i], objArr[i + 1]);
    }
}
