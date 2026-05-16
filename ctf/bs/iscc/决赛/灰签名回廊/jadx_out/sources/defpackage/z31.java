package defpackage;

import android.view.View;
import com.example.gnd.R;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z31 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ a41 f;
    public final /* synthetic */ gv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z31(a41 a41Var, gv gvVar, int i) {
        super(2);
        this.e = i;
        this.f = a41Var;
        this.g = gvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        int i = this.e;
        wz0 wz0Var = wz0.a;
        gv gvVar = this.g;
        a41 a41Var = this.f;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                vf vfVar = (vf) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vfVar.aq();
                } else {
                    d2.a(a41Var.d, gvVar, vfVar, 0);
                }
                break;
            default:
                vf vfVar2 = (vf) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!vfVar2.an(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vfVar2.aq();
                } else {
                    b1 b1Var = a41Var.d;
                    Object tag = b1Var.getTag(R.id.inspection_slot_table_set);
                    ji jiVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof d10) && !(tag instanceof g10))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = b1Var.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof d10) && !(tag2 instanceof g10))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        eg egVar = vfVar2.as;
                        if (egVar == null) {
                            egVar = new eg(vfVar2.g);
                            vfVar2.as = egVar;
                        }
                        set.add(egVar);
                        vfVar2.p = true;
                        vfVar2.ab = true;
                        vfVar2.c.b();
                        vfVar2.ag.b();
                        vq0 vq0Var = vfVar2.ah;
                        sq0 sq0Var = vq0Var.a;
                        vq0Var.e = sq0Var.m;
                        vq0Var.f = sq0Var.n;
                    }
                    boolean zH = vfVar2.h(a41Var);
                    Object objAk = vfVar2.ak();
                    n31 n31Var = nf.a;
                    if (zH || objAk == n31Var) {
                        objAk = new y31(a41Var, jiVar, i3);
                        vfVar2.be(objAk);
                    }
                    pk.d(vfVar2, (gv) objAk, b1Var);
                    boolean zH2 = vfVar2.h(a41Var);
                    Object objAk2 = vfVar2.ak();
                    if (zH2 || objAk2 == n31Var) {
                        objAk2 = new y31(a41Var, jiVar, i2);
                        vfVar2.be(objAk2);
                    }
                    pk.d(vfVar2, (gv) objAk2, b1Var);
                    az0.a(kz.a.a(set), t1.aq(-280240369, new z31(a41Var, gvVar, i3), vfVar2), vfVar2, 56);
                }
                break;
        }
        return wz0Var;
    }
}
