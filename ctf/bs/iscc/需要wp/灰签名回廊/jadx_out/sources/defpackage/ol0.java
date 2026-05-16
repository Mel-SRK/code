package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ol0 extends pl0 implements Iterator {
    public nl0 d;
    public boolean e = true;
    public final /* synthetic */ hr f;

    public ol0(hr hrVar) {
        this.f = hrVar;
    }

    @Override // defpackage.pl0
    public final void a(nl0 nl0Var) {
        nl0 nl0Var2 = this.d;
        if (nl0Var == nl0Var2) {
            nl0 nl0Var3 = nl0Var2.g;
            this.d = nl0Var3;
            this.e = nl0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.f.d != null;
        }
        nl0 nl0Var = this.d;
        return (nl0Var == null || nl0Var.f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.d = this.f.d;
        } else {
            nl0 nl0Var = this.d;
            this.d = nl0Var != null ? nl0Var.f : null;
        }
        return this.d;
    }
}
