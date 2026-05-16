package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx {
    public int a;
    public float b;
    public final Object c;

    public rx(xw0 xw0Var) {
        this.c = xw0Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        xw0 xw0Var = (xw0) this.c;
        int i2 = 1;
        if (z) {
            int iAb = m10.ab(xw0Var.f, i, z);
            z4 = i == xw0Var.f.getLineStart(iAb) || i == xw0Var.f(iAb);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fH = z3 ? xw0Var.h(i, z) : xw0Var.i(i, z);
        if (z2) {
            this.a = i4;
            this.b = fH;
        }
        return fH;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, ki kiVar) {
        aj0 aj0Var;
        if (kiVar instanceof aj0) {
            aj0Var = (aj0) kiVar;
            int i = aj0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj0Var.i = i - Integer.MIN_VALUE;
            } else {
                aj0Var = new aj0(this, kiVar);
            }
        }
        Object objF = aj0Var.g;
        int i2 = aj0Var.i;
        if (i2 == 0) {
            i60.az(objF);
            ef efVar = (ef) this.c;
            Float f2 = new Float(f);
            aj0Var.i = 1;
            objF = efVar.f(f2, aj0Var);
            yj yjVar = yj.d;
            if (objF == yjVar) {
                return yjVar;
            }
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(objF);
        }
        this.b += ((Number) objF).floatValue();
        return wz0.a;
    }

    public rx(int i, ef efVar) {
        this.a = i;
        this.c = efVar;
    }
}
