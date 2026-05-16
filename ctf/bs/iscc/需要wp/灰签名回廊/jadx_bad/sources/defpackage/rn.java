package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rn extends x10 implements cv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ti0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(bu buVar, sn snVar, ti0 ti0Var) {
        super(1);
        this.f = ti0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                sn snVar = (sn) obj;
                if (snVar.q) {
                    if (snVar.s != null) {
                        sy.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    snVar.s = null;
                    ti0 ti0Var = this.f;
                    ti0Var.d = ti0Var.d;
                }
                break;
            default:
                if (((lg0) obj).s) {
                    this.f.d = false;
                }
                break;
        }
        return ry0.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(ti0 ti0Var) {
        super(1);
        this.f = ti0Var;
    }
}
