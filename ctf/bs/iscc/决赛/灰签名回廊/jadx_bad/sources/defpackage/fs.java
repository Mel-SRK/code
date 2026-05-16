package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends tt0 implements hv {
    public int h;
    public /* synthetic */ zr i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(j3 j3Var, ji jiVar) {
        super(3, jiVar);
        this.k = j3Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        fs fsVar = new fs(this.k, (ji) obj3);
        fsVar.i = (zr) obj;
        fsVar.j = obj2;
        return fsVar.o(wz0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0.i(r5, r4) == r3) goto L15;
     */
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
            Object obj2 = this.j;
            this.i = zrVar;
            this.h = 1;
            obj = this.k.f(obj2, this);
            if (obj != yjVar) {
            }
            return yjVar;
        }
        if (i != 1) {
            if (i == 2) {
                i60.az(obj);
                return wz0.a;
            }
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zrVar = this.i;
        i60.az(obj);
        this.i = null;
        this.h = 2;
    }
}
