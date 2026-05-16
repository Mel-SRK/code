package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dc implements aq0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dc(int i) {
        this.a = i;
    }

    @Override // defpackage.aq0
    public final bd0 a(long j, e20 e20Var, em emVar) {
        switch (this.a) {
            case 0:
                float fAi = emVar.ai(ec.a);
                return new zc0(new ri0(0.0f, -fAi, pq0.d(j), pq0.b(j) + fAi));
            case 1:
                float fAi2 = emVar.ai(ec.a);
                return new zc0(new ri0(-fAi2, 0.0f, pq0.d(j) + fAi2, pq0.b(j)));
            default:
                return new zc0(e00.h(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
