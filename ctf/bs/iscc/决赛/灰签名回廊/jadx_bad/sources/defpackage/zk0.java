package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements aq0 {
    public final mj a;
    public final mj b;
    public final mj c;
    public final mj d;

    public zk0(mj mjVar, mj mjVar2, mj mjVar3, mj mjVar4) {
        this.a = mjVar;
        this.b = mjVar2;
        this.c = mjVar3;
        this.d = mjVar4;
    }

    public static zk0 b(zk0 zk0Var, nn nnVar, nn nnVar2, nn nnVar3, int i) {
        mj mjVar = nnVar;
        if ((i & 1) != 0) {
            mjVar = zk0Var.a;
        }
        mj mjVar2 = zk0Var.b;
        mj mjVar3 = nnVar2;
        if ((i & 4) != 0) {
            mjVar3 = zk0Var.c;
        }
        zk0Var.getClass();
        return new zk0(mjVar, mjVar2, mjVar3, nnVar3);
    }

    @Override // defpackage.aq0
    public final bd0 a(long j, e20 e20Var, em emVar) {
        float fA = this.a.a(j, emVar);
        float fA2 = this.b.a(j, emVar);
        float fA3 = this.c.a(j, emVar);
        float fA4 = this.d.a(j, emVar);
        float fC = pq0.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new zc0(e00.h(0L, j));
        }
        ri0 ri0VarH = e00.h(0L, j);
        e20 e20Var2 = e20.d;
        long jA = t1.a(e20Var == e20Var2 ? fA : fA2);
        if (e20Var == e20Var2) {
            fA = fA2;
        }
        long jA2 = t1.a(fA);
        long jA3 = t1.a(e20Var == e20Var2 ? fA3 : fA4);
        if (e20Var != e20Var2) {
            fA4 = fA3;
        }
        return new ad0(new yk0(ri0VarH.a, ri0VarH.b, ri0VarH.c, ri0VarH.d, jA, jA2, jA3, t1.a(fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk0)) {
            return false;
        }
        zk0 zk0Var = (zk0) obj;
        return f00.h(this.a, zk0Var.a) && this.b.equals(zk0Var.b) && f00.h(this.c, zk0Var.c) && this.d.equals(zk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
