package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                vf vfVar = (vf) this.b;
                vfVar.z--;
                break;
            default:
                qr0 qr0Var = (qr0) this.b;
                qr0Var.j--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((vf) this.b).z++;
                break;
            default:
                ((qr0) this.b).j++;
                break;
        }
    }
}
