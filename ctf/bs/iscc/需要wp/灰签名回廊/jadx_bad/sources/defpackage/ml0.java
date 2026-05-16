package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 extends pl0 implements Iterator {
    public nl0 d;
    public nl0 e;
    public final /* synthetic */ int f;

    public ml0(nl0 nl0Var, nl0 nl0Var2, int i) {
        this.f = i;
        this.d = nl0Var2;
        this.e = nl0Var;
    }

    @Override // defpackage.pl0
    public final void a(nl0 nl0Var) {
        nl0 nl0Var2;
        nl0 nl0VarB = null;
        if (this.d == nl0Var && nl0Var == this.e) {
            this.e = null;
            this.d = null;
        }
        nl0 nl0Var3 = this.d;
        if (nl0Var3 == nl0Var) {
            switch (this.f) {
                case 0:
                    nl0Var2 = nl0Var3.g;
                    break;
                default:
                    nl0Var2 = nl0Var3.f;
                    break;
            }
            this.d = nl0Var2;
        }
        nl0 nl0Var4 = this.e;
        if (nl0Var4 == nl0Var) {
            nl0 nl0Var5 = this.d;
            if (nl0Var4 != nl0Var5 && nl0Var5 != null) {
                nl0VarB = b(nl0Var4);
            }
            this.e = nl0VarB;
        }
    }

    public final nl0 b(nl0 nl0Var) {
        switch (this.f) {
            case 0:
                return nl0Var.f;
            default:
                return nl0Var.g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        nl0 nl0Var = this.e;
        nl0 nl0Var2 = this.d;
        this.e = (nl0Var == nl0Var2 || nl0Var2 == null) ? null : b(nl0Var);
        return nl0Var;
    }
}
