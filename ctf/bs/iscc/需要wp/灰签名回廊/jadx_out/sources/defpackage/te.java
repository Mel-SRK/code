package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class te implements gv, hv, iv, jv, kv, lv, mv, nv, qu, ru, tu, uu, vu, wu, xu, yu, zu, dv, ev {
    public final int d;
    public final boolean e;
    public ov f;
    public hi0 g;
    public ArrayList h;

    public te(int i, boolean z, ov ovVar) {
        this.d = i;
        this.e = z;
        this.f = ovVar;
    }

    @Override // defpackage.hv
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return e(obj, (vf) obj2, ((Number) obj3).intValue());
    }

    public final Object d(int i, vf vfVar) {
        vfVar.aw(this.d);
        i(vfVar);
        int i2 = i | (vfVar.f(this) ? t1.i(2, 0) : t1.i(1, 0));
        ov ovVar = this.f;
        az0.p(2, ovVar);
        Object objF = ((gv) ovVar).f(vfVar, Integer.valueOf(i2));
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new se(2, te.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return objF;
    }

    public final Object e(Object obj, vf vfVar, int i) {
        vfVar.aw(this.d);
        i(vfVar);
        int i2 = vfVar.f(this) ? t1.i(2, 1) : t1.i(1, 1);
        ov ovVar = this.f;
        az0.p(3, ovVar);
        Object objC = ((hv) ovVar).c(obj, vfVar, Integer.valueOf(i2 | i));
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new re(i, 0, this, obj);
        }
        return objC;
    }

    @Override // defpackage.gv
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (vf) obj);
    }

    public final Object h(final Object obj, final Object obj2, vf vfVar, final int i) {
        vfVar.aw(this.d);
        i(vfVar);
        int i2 = vfVar.f(this) ? t1.i(2, 2) : t1.i(1, 2);
        ov ovVar = this.f;
        az0.p(4, ovVar);
        Object objJ = ((iv) ovVar).j(obj, obj2, vfVar, Integer.valueOf(i2 | i));
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new gv() { // from class: qe
                @Override // defpackage.gv
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iAr = d41.ar(i) | 1;
                    this.d.h(obj, obj2, (vf) obj3, iAr);
                    return wz0.a;
                }
            };
        }
        return objJ;
    }

    public final void i(vf vfVar) {
        hi0 hi0VarW;
        if (!this.e || (hi0VarW = vfVar.w()) == null) {
            return;
        }
        vfVar.getClass();
        hi0VarW.b |= 1;
        if (t1.ar(this.g, hi0VarW)) {
            this.g = hi0VarW;
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            arrayList2.add(hi0VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (t1.ar((hi0) arrayList.get(i), hi0VarW)) {
                arrayList.set(i, hi0VarW);
                return;
            }
        }
        arrayList.add(hi0VarW);
    }

    @Override // defpackage.iv
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (vf) obj3, ((Number) obj4).intValue());
    }
}
