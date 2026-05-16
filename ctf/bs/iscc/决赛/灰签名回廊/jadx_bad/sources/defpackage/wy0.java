package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy0 extends vy0 {
    public final /* synthetic */ int g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                int i = this.f;
                this.f = i + 2;
                Object[] objArr = this.d;
                return new e60(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f;
                this.f = i2 + 2;
                return this.d[i2];
            default:
                int i3 = this.f;
                this.f = i3 + 2;
                return this.d[i3 + 1];
        }
    }
}
