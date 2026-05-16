package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 implements Iterable, d10 {
    public final /* synthetic */ cm d;

    public sp0(cm cmVar) {
        this.d = cmVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zl(this.d);
    }
}
