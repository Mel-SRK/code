package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi0 {
    public jg a;
    public int b;
    public Il c;
    public gv d;
    public int e;
    public l80 f;
    public q80 g;

    public hi0(jg jgVar) {
        this.a = jgVar;
    }

    public final boolean a() {
        if (this.a != null) {
            Il il = this.c;
            if (il != null ? il.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final p00 b(Object obj) {
        p00 p00VarN;
        jg jgVar = this.a;
        return (jgVar == null || (p00VarN = jgVar.n(this, obj)) == null) ? p00.d : p00VarN;
    }

    public final void c() {
        jg jgVar = this.a;
        if (jgVar != null) {
            jgVar.r = true;
            jgVar.u.getClass();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
