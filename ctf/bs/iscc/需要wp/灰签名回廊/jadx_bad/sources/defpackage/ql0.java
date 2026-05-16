package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ql0 implements bj0 {
    public hm0 d;
    public rl0 e;
    public String f;
    public Object g;
    public Object[] h;
    public o6 i;
    public final t4 j = new t4(3, this);

    public ql0(hm0 hm0Var, rl0 rl0Var, String str, Object obj, Object[] objArr) {
        this.d = hm0Var;
        this.e = rl0Var;
        this.f = str;
        this.g = obj;
        this.h = objArr;
    }

    public final void a() {
        String strV;
        rl0 rl0Var = this.e;
        if (this.i != null) {
            wc.j("entry(", this.i, ") is not null");
            return;
        }
        if (rl0Var != null) {
            t4 t4Var = this.j;
            Object objA = t4Var.a();
            if (objA == null || rl0Var.a(objA)) {
                this.i = rl0Var.c(this.f, t4Var);
                return;
            }
            if (objA instanceof jr0) {
                jr0 jr0Var = (jr0) objA;
                if (jr0Var.d() == bw.ai || jr0Var.d() == bw.au || jr0Var.d() == bw.am) {
                    strV = "MutableState containing " + jr0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strV = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strV = m10.v(objA);
            }
            throw new IllegalArgumentException(strV);
        }
    }

    @Override // defpackage.bj0
    public final void c() {
        a();
    }

    @Override // defpackage.bj0
    public final void d() {
        o6 o6Var = this.i;
        if (o6Var != null) {
            o6Var.ac();
        }
    }

    @Override // defpackage.bj0
    public final void e() {
        o6 o6Var = this.i;
        if (o6Var != null) {
            o6Var.ac();
        }
    }
}
