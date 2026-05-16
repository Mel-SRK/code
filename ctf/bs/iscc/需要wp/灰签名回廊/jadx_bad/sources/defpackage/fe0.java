package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 {
    public String a;
    public nx0 b;
    public qt c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public em i;
    public o3 j;
    public boolean k;
    public c70 m;
    public ee0 n;
    public e20 o;
    public long h = wy.a;
    public long l = e00.f(0, 0);
    public long p = eh.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public fe0(String str, nx0 nx0Var, qt qtVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = nx0Var;
        this.c = qtVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, e20 e20Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int iD = wo0.d(b(eh.a(0, i, 0, Integer.MAX_VALUE), e20Var).b());
        this.q = i;
        this.r = iD;
        return iD;
    }

    public final o3 b(long j, e20 e20Var) {
        ee0 ee0VarE = e(e20Var);
        long jY = pk.y(j, this.e, this.d, ee0VarE.c());
        boolean z = this.e;
        int i = this.d;
        int i2 = this.f;
        return new o3((s3) ee0VarE, ((z || i != 2) && i2 >= 1) ? i2 : 1, i == 2 ? 2 : 1, jY);
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = eh.h(0, 0, 0, 0);
        this.l = e00.f(0, 0);
        this.k = false;
    }

    public final void d(em emVar) {
        long jA;
        em emVar2 = this.i;
        if (emVar != null) {
            int i = wy.b;
            jA = wy.a(emVar.b(), emVar.k());
        } else {
            jA = wy.a;
        }
        if (emVar2 == null) {
            this.i = emVar;
            this.h = jA;
        } else if (emVar == null || this.h != jA) {
            this.i = emVar;
            this.h = jA;
            c();
        }
    }

    public final ee0 e(e20 e20Var) {
        ee0 s3Var = this.n;
        if (s3Var == null || e20Var != this.o || s3Var.b()) {
            this.o = e20Var;
            String str = this.a;
            nx0 nx0VarK = wn0.k(this.b, e20Var);
            em emVar = this.i;
            emVar.getClass();
            qt qtVar = this.c;
            rq rqVar = rq.d;
            s3Var = new s3(str, nx0VarK, rqVar, rqVar, qtVar, emVar);
        }
        this.n = s3Var;
        return s3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = wy.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
