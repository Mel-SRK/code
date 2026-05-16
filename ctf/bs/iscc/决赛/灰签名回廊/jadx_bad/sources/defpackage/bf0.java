package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends ae {
    public final /* synthetic */ int d;
    public final ve0 e;

    public /* synthetic */ bf0(ve0 ve0Var, int i) {
        this.d = i;
        this.e = ve0Var;
    }

    @Override // defpackage.i
    public final int a() {
        switch (this.d) {
            case 0:
                ve0 ve0Var = this.e;
                ve0Var.getClass();
                return ve0Var.e;
            default:
                ve0 ve0Var2 = this.e;
                ve0Var2.getClass();
                return ve0Var2.e;
        }
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ve0 ve0Var = this.e;
                Object obj2 = ve0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && ve0Var.containsKey(entry.getKey());
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                uy0 uy0Var = this.e.d;
                vy0[] vy0VarArr = new vy0[8];
                for (int i = 0; i < 8; i++) {
                    vy0VarArr[i] = new wy0(0);
                }
                return new cf0(uy0Var, vy0VarArr);
            default:
                uy0 uy0Var2 = this.e.d;
                vy0[] vy0VarArr2 = new vy0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    vy0VarArr2[i2] = new wy0(1);
                }
                return new cf0(uy0Var2, vy0VarArr2);
        }
    }
}
