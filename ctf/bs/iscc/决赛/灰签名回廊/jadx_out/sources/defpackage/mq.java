package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq implements iy {
    public final boolean d;

    public mq(boolean z) {
        this.d = z;
    }

    @Override // defpackage.iy
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.iy
    public final ha0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
