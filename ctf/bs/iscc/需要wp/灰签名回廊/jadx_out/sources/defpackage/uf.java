package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements gv {
    public final /* synthetic */ Object d;

    public uf(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
            throw null;
        }
        vfVar.aq();
        return wz0.a;
    }
}
