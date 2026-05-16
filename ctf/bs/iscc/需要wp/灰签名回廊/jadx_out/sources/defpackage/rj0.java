package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj0 extends qj0 implements qv {
    public final int e;

    public rj0(ji jiVar) {
        super(jiVar);
        this.e = 2;
    }

    @Override // defpackage.qv
    public final int b() {
        return this.e;
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
