package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r00 extends w00 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ r00(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.w00
    public final boolean k() {
        switch (this.h) {
        }
        return false;
    }

    @Override // defpackage.w00
    public final void l(Throwable th) {
        switch (this.h) {
            case 0:
                ((cv) this.i).g(th);
                break;
            default:
                Object obj = a10.d.get(j());
                boolean z = obj instanceof wd;
                x00 x00Var = (x00) this.i;
                if (!z) {
                    x00Var.h(az0.ap(obj));
                } else {
                    x00Var.h(i60.aa(((wd) obj).a));
                }
                break;
        }
    }
}
