package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ks0 extends tt0 implements hv {
    public int h;
    public /* synthetic */ zr i;
    public /* synthetic */ int j;
    public final /* synthetic */ ls0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(ls0 ls0Var, ji jiVar) {
        super(3, jiVar);
        this.k = ls0Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ks0 ks0Var = new ks0(this.k, (ji) obj3);
        ks0Var.i = (zr) obj;
        ks0Var.j = iIntValue;
        return ks0Var.o(wz0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.i(defpackage.jq0.d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.i(defpackage.jq0.f, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r0
      0x0061: PHI (r0v3 zr) = (r0v2 zr), (r0v6 zr) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[PHI: r0
      0x0071: PHI (r0v4 zr) = (r0v3 zr), (r0v7 zr) binds: [B:28:0x006e, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        zr zrVar;
        int i = this.h;
        yj yjVar = yj.d;
        if (i == 0) {
            i60.az(obj);
            zrVar = this.i;
            if (this.j > 0) {
                this.h = 1;
            } else {
                this.i = zrVar;
                this.h = 2;
                if (t1.l(0L, this) != yjVar) {
                    this.i = zrVar;
                    this.h = 3;
                    if (zrVar.i(jq0.e, this) != yjVar) {
                    }
                }
            }
            return yjVar;
        }
        if (i != 1) {
            if (i == 2) {
                zrVar = this.i;
                i60.az(obj);
                this.i = zrVar;
                this.h = 3;
                if (zrVar.i(jq0.e, this) != yjVar) {
                    this.i = zrVar;
                    this.h = 4;
                    if (t1.l(Long.MAX_VALUE, this) != yjVar) {
                    }
                }
                return yjVar;
            }
            if (i == 3) {
                zrVar = this.i;
                i60.az(obj);
                this.i = zrVar;
                this.h = 4;
                if (t1.l(Long.MAX_VALUE, this) != yjVar) {
                    this.i = null;
                    this.h = 5;
                }
                return yjVar;
            }
            if (i == 4) {
                zrVar = this.i;
                i60.az(obj);
                this.i = null;
                this.h = 5;
            } else if (i != 5) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        i60.az(obj);
        return wz0.a;
    }
}
