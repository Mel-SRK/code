package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg extends ai0 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public qg(cv cvVar) {
        super(new hg(1));
        this.c = new rg(cvVar);
    }

    @Override // defpackage.ai0
    public final ci0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new ci0(this, obj, obj == null, null, true);
            default:
                return new ci0(this, obj, obj == null, (bw) this.c, true);
        }
    }

    @Override // defpackage.ai0
    public i01 b() {
        switch (this.b) {
            case 0:
                return (rg) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(pu puVar) {
        super(puVar);
        bw bwVar = bw.au;
        this.c = bwVar;
    }
}
