package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ai0 {
    public final a30 a;

    public ai0(pu puVar) {
        this.a = new a30(puVar);
    }

    public abstract ci0 a(Object obj);

    public i01 b() {
        return this.a;
    }

    public final i01 c(ci0 ci0Var, i01 i01Var) {
        i01 i01Var2 = null;
        i01Var2 = null;
        i01Var2 = null;
        i01Var2 = null;
        i01Var2 = null;
        i01Var2 = null;
        if (i01Var instanceof dp) {
            if (ci0Var.d) {
                dp dpVar = (dp) i01Var;
                dpVar.a.setValue(ci0Var.a());
                i01Var2 = dpVar;
            }
        } else if (i01Var instanceof ys0) {
            if ((ci0Var.b || ci0Var.e != null) && !ci0Var.d) {
                ys0 ys0Var = (ys0) i01Var;
                if (f00.h(ci0Var.a(), ys0Var.a)) {
                    i01Var2 = ys0Var;
                }
            }
        } else if (i01Var instanceof rg) {
            ci0Var.getClass();
        }
        if (i01Var2 != null) {
            return i01Var2;
        }
        if (!ci0Var.d) {
            return new ys0(ci0Var.a());
        }
        Object obj = ci0Var.e;
        bw bwVar = ci0Var.c;
        if (bwVar == null) {
            bwVar = bw.au;
        }
        return new dp(new me0(obj, bwVar));
    }
}
