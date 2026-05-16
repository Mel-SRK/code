package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wi extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ h30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(h30 h30Var, po0 po0Var) {
        super(1);
        this.e = 3;
        this.f = h30Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        sr0 sr0Var;
        int i = this.e;
        boolean z = false;
        wz0 wz0Var = null;
        wz0 wz0Var2 = wz0.a;
        h30 h30Var = this.f;
        switch (i) {
            case 0:
                d20 d20Var = (d20) obj;
                ax0 ax0VarD = h30Var.d();
                if (ax0VarD != null) {
                    ax0VarD.c = d20Var;
                }
                return wz0Var2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                h30Var.q.setValue(bool);
                return wz0Var2;
            case 2:
                List list = (List) obj;
                if (h30Var.d() != null) {
                    ax0 ax0VarD2 = h30Var.d();
                    ax0VarD2.getClass();
                    list.add(ax0VarD2.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                b6 b6Var = (b6) obj;
                uw0 uw0Var = h30Var.e;
                wi wiVar = h30Var.t;
                if (uw0Var != null) {
                    lw0 lw0VarN = h30Var.d.n(f00.z(new wl(), new pd(b6Var, 1)));
                    uw0Var.a(null, lw0VarN);
                    wiVar.g(lw0VarN);
                    wz0Var = wz0Var2;
                }
                if (wz0Var == null) {
                    String str = b6Var.e;
                    int length = str.length();
                    wiVar.g(new lw0(str, wo0.b(length, length), 4));
                }
                return Boolean.TRUE;
            case 4:
                int i2 = ((dy) obj).a;
                o6 o6Var = h30Var.r;
                o6Var.getClass();
                if (i2 == 7 || i2 == 2 || i2 == 6 || i2 == 5 || i2 == 3 || i2 == 4) {
                    o6Var.q();
                } else if (i2 != 1 && i2 != 0) {
                    wc.q("invalid ImeAction");
                    return null;
                }
                if (i2 == 6) {
                    ss ssVar = (ss) o6Var.c;
                    if (ssVar == null) {
                        f00.ag("focusManager");
                        throw null;
                    }
                    ((us) ssVar).f(1);
                } else if (i2 == 5) {
                    ss ssVar2 = (ss) o6Var.c;
                    if (ssVar2 == null) {
                        f00.ag("focusManager");
                        throw null;
                    }
                    ((us) ssVar2).f(2);
                } else if (i2 == 7 && (sr0Var = (sr0) o6Var.a) != null) {
                    ((sl) sr0Var).a();
                }
                return wz0Var2;
            default:
                lw0 lw0Var = (lw0) obj;
                String str2 = lw0Var.a.e;
                b6 b6Var2 = h30Var.j;
                if (!f00.h(str2, b6Var2 != null ? b6Var2.e : null)) {
                    h30Var.k.setValue(xw.d);
                }
                long j = hx0.b;
                h30Var.f(j);
                h30Var.e(j);
                h30Var.s.g(lw0Var);
                hi0 hi0Var = h30Var.b;
                jg jgVar = hi0Var.a;
                if (jgVar != null) {
                    jgVar.n(hi0Var, null);
                }
                return wz0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi(h30 h30Var, int i) {
        super(1);
        this.e = i;
        this.f = h30Var;
    }
}
