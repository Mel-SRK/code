package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Il {
    public int a;

    public Il(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
