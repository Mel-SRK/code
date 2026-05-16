package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj extends x10 implements cv {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ h30 f;
    public final /* synthetic */ lw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(boolean z, h30 h30Var, po0 po0Var, lw0 lw0Var) {
        super(1);
        this.e = z;
        this.f = h30Var;
        this.g = lw0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        wz0 wz0Var;
        b6 b6Var = (b6) obj;
        if (!this.e) {
            return Boolean.FALSE;
        }
        h30 h30Var = this.f;
        uw0 uw0Var = h30Var.e;
        wi wiVar = h30Var.t;
        StringBuilder sb = null;
        if (uw0Var != null) {
            lw0 lw0VarN = h30Var.d.n(f00.z(new mr(), new pd(b6Var, 1)));
            uw0Var.a(null, lw0VarN);
            wiVar.g(lw0VarN);
            wz0Var = wz0.a;
        } else {
            wz0Var = null;
        }
        if (wz0Var == null) {
            lw0 lw0Var = this.g;
            b6 b6Var2 = lw0Var.a;
            long j = lw0Var.b;
            String str = b6Var2.e;
            int i = hx0.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            str.getClass();
            b6Var.getClass();
            if (i3 >= i2) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i2);
                sb.append((CharSequence) b6Var);
                sb.append((CharSequence) str, i3, str.length());
            } else {
                wc.d(i3, i2, ") is less than start index (", "End index (");
            }
            String string = sb.toString();
            int length = b6Var.e.length() + i2;
            wiVar.g(new lw0(string, wo0.b(length, length), 4));
        }
        return Boolean.TRUE;
    }
}
