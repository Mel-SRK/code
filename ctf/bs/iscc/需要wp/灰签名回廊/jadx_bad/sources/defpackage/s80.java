package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s80 extends rj0 implements gv {
    public vv f;
    public t80 g;
    public long[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ t80 p;
    public final /* synthetic */ vv q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(t80 t80Var, vv vvVar, ji jiVar) {
        super(jiVar);
        this.p = t80Var;
        this.q = vvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((s80) k((ji) obj2, (op0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        s80 s80Var = new s80(this.p, this.q, jiVar);
        s80Var.o = obj;
        return s80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        op0 op0Var;
        t80 t80Var;
        long[] jArr;
        int length;
        vv vvVar;
        int i;
        long j;
        int i2 = this.n;
        if (i2 == 0) {
            i60.az(obj);
            op0Var = (op0) this.o;
            t80Var = this.p;
            jArr = t80Var.e.a;
            length = jArr.length - 2;
            if (length >= 0) {
                vvVar = this.q;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return wz0.a;
        }
        if (i2 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.l;
        int i4 = this.k;
        long j2 = this.m;
        int i5 = this.j;
        int i6 = this.i;
        long[] jArr2 = this.h;
        t80 t80Var2 = this.g;
        vv vvVar2 = this.f;
        op0 op0Var2 = (op0) this.o;
        i60.az(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                t80Var = t80Var2;
                op0Var = op0Var2;
                i = i5;
                vvVar = vvVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        op0Var2 = op0Var;
                        i3 = 0;
                        t80Var2 = t80Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        vvVar2 = vvVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                vvVar2.e = i7;
                                Object obj2 = t80Var2.e.b[i7];
                                this.o = op0Var2;
                                this.f = vvVar2;
                                this.g = t80Var2;
                                this.h = jArr2;
                                this.i = i6;
                                this.j = i5;
                                this.m = j2;
                                this.k = i4;
                                this.l = i3;
                                this.n = 1;
                                op0Var2.b(obj2, this);
                                return yj.d;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return wz0.a;
        }
    }
}
