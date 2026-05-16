package androidx.compose.runtime.internal;

import defpackage.ai0;
import defpackage.i01;
import defpackage.mg;
import defpackage.o5;
import defpackage.uy0;
import defpackage.ve0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ve0 implements mg {
    public static final a g = new a(uy0.e, 0);

    public final a b(ai0 ai0Var, i01 i01Var) {
        o5 o5VarU = this.d.u(ai0Var.hashCode(), 0, ai0Var, i01Var);
        return o5VarU == null ? this : new a((uy0) o5VarU.c, this.e + o5VarU.b);
    }

    @Override // defpackage.ve0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ai0) {
            return super.containsKey((ai0) obj);
        }
        return false;
    }

    @Override // defpackage.ve0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i01) {
            return super.containsValue((i01) obj);
        }
        return false;
    }

    @Override // defpackage.ve0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ai0) {
            return (i01) super.get((ai0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ai0) ? obj2 : (i01) super.getOrDefault((ai0) obj, (i01) obj2);
    }
}
