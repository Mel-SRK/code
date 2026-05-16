package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs0 implements ji, zj {
    public final ji d;
    public final pj e;

    public fs0(ji jiVar, pj pjVar) {
        this.d = jiVar;
        this.e = pjVar;
    }

    @Override // defpackage.zj
    public final zj d() {
        ji jiVar = this.d;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.e;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        this.d.h(obj);
    }
}
