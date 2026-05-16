package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class br0 extends rj0 implements gv {
    public long[] f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(cr0 cr0Var, ji jiVar) {
        super(jiVar);
        this.k = cr0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((br0) k((ji) obj2, (op0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        br0 br0Var = new br0(this.k, jiVar);
        br0Var.j = obj;
        return br0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:26:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        op0 op0Var;
        long[] jArr;
        int length;
        int i;
        op0 op0Var2;
        int i2;
        op0 op0Var3;
        int i3;
        cr0 cr0Var = this.k;
        long j = cr0Var.d;
        long j2 = cr0Var.f;
        long j3 = cr0Var.e;
        int i4 = this.i;
        yj yjVar = yj.d;
        if (i4 == 0) {
            i60.az(obj);
            op0Var = (op0) this.j;
            jArr = cr0Var.g;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                op0Var2 = op0Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return wz0.a;
        }
        if (i4 == 1) {
            length = this.h;
            int i5 = this.g;
            jArr = this.f;
            op0Var = (op0) this.j;
            i60.az(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.g;
                op0Var3 = (op0) this.j;
                i60.az(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + ((long) 64));
                        this.j = op0Var3;
                        this.f = null;
                        this.g = i3;
                        this.i = 3;
                        op0Var3.b(l, this);
                        return yjVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return wz0.a;
            }
            i2 = this.g;
            op0Var2 = (op0) this.j;
            i60.az(obj);
            i2++;
            if (i2 >= 64) {
                op0Var = op0Var2;
                if (j != 0) {
                    op0Var3 = op0Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return wz0.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.j = op0Var2;
                this.f = null;
                this.g = i2;
                this.i = 2;
                op0Var2.b(l2, this);
                return yjVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.j = op0Var;
            this.f = jArr;
            this.g = i;
            this.h = length;
            this.i = 1;
            op0Var.b(l3, this);
            return yjVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return wz0.a;
    }
}
