package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ve implements gv {
    public static final ve e = new ve(0);
    public static final ve f = new ve(1);
    public static final ve g = new ve(2);
    public final /* synthetic */ int d;

    public /* synthetic */ ve(int i) {
        this.d = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                vf vfVar = (vf) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vfVar.aq();
                }
                return wz0.a;
            case 1:
                vf vfVar2 = (vf) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!vfVar2.an(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vfVar2.aq();
                }
                return wz0.a;
            default:
                long j = ((qc) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(m10.av(j));
        }
    }
}
