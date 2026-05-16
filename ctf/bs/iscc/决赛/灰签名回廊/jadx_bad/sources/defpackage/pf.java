package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pf implements pu {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pf(Il il, vq0 vq0Var, uc0 uc0Var) {
        this.e = il;
        this.f = vq0Var;
        this.g = uc0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        List listY;
        switch (this.d) {
            case 0:
                vf vfVar = (vf) this.e;
                wa waVar = (wa) this.f;
                rq0 rq0Var = (rq0) this.g;
                of ofVar = vfVar.al;
                wa waVar2 = ofVar.b;
                try {
                    ofVar.b = waVar;
                    rq0 rq0Var2 = vfVar.af;
                    int[] iArr = vfVar.n;
                    e80 e80Var = vfVar.u;
                    vfVar.n = null;
                    vfVar.u = null;
                    try {
                        vfVar.af = rq0Var;
                        boolean z = ofVar.e;
                        try {
                            ofVar.e = false;
                            throw null;
                        } catch (Throwable th) {
                            ofVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        vfVar.af = rq0Var2;
                        vfVar.n = iArr;
                        vfVar.u = e80Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ofVar.b = waVar2;
                    throw th3;
                }
            default:
                Il il = (Il) this.e;
                vq0 vq0Var = (vq0) this.f;
                uc0 uc0Var = (uc0) this.g;
                if (il != null) {
                    vq0Var.a(vq0Var.c(il) - vq0Var.t);
                }
                List listO = e00.o(vq0Var, null, vq0Var.t, null);
                hf hfVar = (hf) kc.ax(listO);
                Integer num = hfVar != null ? hfVar.a : null;
                List listE = uc0Var.e(num);
                if (num != null && !listE.isEmpty()) {
                    hf hfVar2 = (hf) kc.ar(listE);
                    int size = listE.size() - 1;
                    if (size <= 0) {
                        listY = rq.d;
                    } else if (size == 1) {
                        listY = f00.y(kc.aw(listE));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listE instanceof RandomAccess) {
                            int size2 = listE.size();
                            for (int i = 1; i < size2; i++) {
                                arrayList.add(listE.get(i));
                            }
                        } else {
                            ListIterator listIterator = listE.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        listY = arrayList;
                    }
                    hfVar2.getClass();
                    listE = kc.az(f00.y(new hf(null, num)), listY);
                }
                return kc.az(listO, listE);
        }
    }

    public /* synthetic */ pf(vf vfVar, wa waVar, rq0 rq0Var, v70 v70Var) {
        this.e = vfVar;
        this.f = waVar;
        this.g = rq0Var;
    }
}
