package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements np0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final ov c;

    public /* synthetic */ cm(Object obj, ov ovVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = ovVar;
    }

    @Override // defpackage.np0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new zl(this);
            default:
                return new vv(this);
        }
    }
}
