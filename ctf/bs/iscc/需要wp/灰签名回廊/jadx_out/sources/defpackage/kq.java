package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kq {
    public int a = 1;
    public final b70 b;
    public b70 c;
    public b70 d;
    public int e;
    public int f;

    public kq(b70 b70Var) {
        this.b = b70Var;
        this.c = b70Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        z60 z60VarB = this.c.b.b();
        int iA = z60VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) z60VarB.g).get(iA + z60VarB.d) == 0) || this.e == 65039;
    }
}
