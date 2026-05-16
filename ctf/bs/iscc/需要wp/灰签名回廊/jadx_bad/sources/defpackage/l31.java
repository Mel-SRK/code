package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l31 implements k31 {
    public final String b;
    public final zy c;
    public final zy d;

    public l31(String str) {
        this.b = str;
        this.c = new zy(str);
        this.d = new zy(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
