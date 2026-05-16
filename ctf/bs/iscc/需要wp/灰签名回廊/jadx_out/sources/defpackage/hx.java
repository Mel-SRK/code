package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx implements op {
    public final /* synthetic */ op[] a;

    public hx(op[] opVarArr) {
        this.a = opVarArr;
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        for (op opVar : this.a) {
            opVar.a(ppVar);
        }
    }
}
