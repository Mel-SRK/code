package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zl implements Iterator, d10 {
    public int d = -1;
    public int e;
    public int f;
    public sz g;
    public final /* synthetic */ cm h;

    public zl(cm cmVar) {
        this.h = cmVar;
        int iT = i60.t(0, 0, ((CharSequence) cmVar.b).length());
        this.e = iT;
        this.f = iT;
    }

    public final void a() {
        ae0 ae0Var;
        cm cmVar = this.h;
        CharSequence charSequence = (CharSequence) cmVar.b;
        int i = this.f;
        if (i < 0) {
            this.d = 0;
            this.g = null;
            return;
        }
        if (i <= charSequence.length() && (ae0Var = (ae0) ((n3) cmVar.c).f(charSequence, Integer.valueOf(this.f))) != null) {
            int iIntValue = ((Number) ae0Var.d).intValue();
            int iIntValue2 = ((Number) ae0Var.e).intValue();
            this.g = i60.bb(this.e, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.e = i2;
            this.f = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.g = new sz(this.e, charSequence.length() - 1, 1);
            this.f = -1;
        }
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            wc.p();
            return null;
        }
        sz szVar = this.g;
        szVar.getClass();
        this.g = null;
        this.d = -1;
        return szVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
