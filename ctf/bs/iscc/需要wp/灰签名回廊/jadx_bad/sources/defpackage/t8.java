package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t8 {
    public final a90 a = new a90(new u8[16]);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 < r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:20:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ri0 ri0Var, ki kiVar) {
        s8 s8Var;
        int i;
        ri0 ri0Var2;
        int i2;
        Object[] objArr;
        if (kiVar instanceof s8) {
            s8Var = (s8) kiVar;
            int i3 = s8Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s8Var.m = i3 - Integer.MIN_VALUE;
            } else {
                s8Var = new s8(this, kiVar);
            }
        }
        Object obj = s8Var.k;
        int i4 = s8Var.m;
        if (i4 == 0) {
            i60.az(obj);
            a90 a90Var = this.a;
            i = a90Var.f;
            if (i > 0) {
                Object[] objArr2 = a90Var.d;
                ri0Var2 = ri0Var;
                i2 = 0;
                objArr = objArr2;
                u8 u8Var = (u8) objArr[i2];
                s8Var.g = ri0Var2;
                s8Var.h = objArr;
                s8Var.i = i;
                s8Var.j = i2;
                s8Var.m = 1;
                Object objAo = d41.ao(u8Var, ri0Var2, s8Var);
                yj yjVar = yj.d;
                if (objAo == yjVar) {
                    return yjVar;
                }
                i2++;
            }
            return wz0.a;
        }
        if (i4 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = s8Var.j;
        i = s8Var.i;
        objArr = s8Var.h;
        ri0 ri0Var3 = s8Var.g;
        i60.az(obj);
        ri0Var2 = ri0Var3;
        i2++;
    }
}
