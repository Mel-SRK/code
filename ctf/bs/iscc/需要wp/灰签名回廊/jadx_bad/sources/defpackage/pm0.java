package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pm0 extends l implements zj {
    public final ji g;

    public pm0(ji jiVar, pj pjVar) {
        super(pjVar, true);
        this.g = jiVar;
    }

    @Override // defpackage.a10
    public void aa(Object obj) {
        this.g.h(d41.an(obj));
    }

    @Override // defpackage.a10
    public final boolean ar() {
        return true;
    }

    @Override // defpackage.zj
    public final zj d() {
        ji jiVar = this.g;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.a10
    public void z(Object obj) {
        az0.ad(f00.x(this.g), d41.an(obj));
    }
}
