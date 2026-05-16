package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tt0 extends ki implements qv {
    public final int g;

    public tt0(int i, ji jiVar) {
        super(jiVar);
        this.g = i;
    }

    @Override // defpackage.qv
    public final int b() {
        return this.g;
    }

    @Override // defpackage.s7
    public final String toString() {
        if (this.d != null) {
            return super.toString();
        }
        yi0.a.getClass();
        return zi0.a(this);
    }
}
