package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k80 extends e60 {
    public final ze0 g;
    public Object h;

    public k80(ze0 ze0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.g = ze0Var;
        this.h = obj2;
    }

    @Override // defpackage.e60, java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // defpackage.e60, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        xe0 xe0Var = this.g.d;
        ue0 ue0Var = xe0Var.g;
        Object obj3 = this.e;
        if (!ue0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = xe0Var.f;
        if (!z) {
            ue0Var.put(obj3, obj);
        } else {
            if (!z) {
                wc.p();
                return null;
            }
            vy0 vy0Var = xe0Var.d[xe0Var.e];
            Object obj4 = vy0Var.d[vy0Var.f];
            ue0Var.put(obj3, obj);
            xe0Var.c(obj4 != null ? obj4.hashCode() : 0, ue0Var.e, obj4, 0);
        }
        xe0Var.j = ue0Var.g;
        return obj2;
    }
}
