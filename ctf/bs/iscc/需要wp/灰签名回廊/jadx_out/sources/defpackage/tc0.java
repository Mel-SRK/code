package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc0 {
    public final int a;
    public final int b;

    public /* synthetic */ tc0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var);

    public Il b(tv tvVar) {
        return null;
    }

    public final String toString() {
        String strA = yi0.a(getClass()).a();
        return strA == null ? "" : strA;
    }

    public tc0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
