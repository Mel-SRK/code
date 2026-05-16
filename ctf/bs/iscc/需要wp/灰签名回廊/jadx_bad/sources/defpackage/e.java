package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e extends tt0 implements gv {
    public boolean h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hh0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ g80 m;
    public final /* synthetic */ yb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hh0 hh0Var, long j, g80 g80Var, yb ybVar, ji jiVar) {
        super(2, jiVar);
        this.k = hh0Var;
        this.l = j;
        this.m = g80Var;
        this.n = ybVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((e) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        e eVar = new e(this.k, this.l, this.m, this.n, jiVar);
        eVar.j = obj;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r15.a(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        if (r15.a(r3, r18) == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [jh0] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [t00] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        yj yjVar;
        ?? r10;
        Object objD;
        ?? r1;
        boolean z;
        kh0 kh0Var;
        int i = this.i;
        wz0 wz0Var = wz0.a;
        yb ybVar = this.n;
        g80 g80Var = this.m;
        yj yjVar2 = yj.d;
        if (i == 0) {
            i60.az(obj);
            yjVar = yjVar2;
            r10 = 0;
            hs0 hs0VarAn = i60.an((xj) this.j, null, new d(ybVar, this.l, this.m, null, 0), 3);
            this.j = hs0VarAn;
            this.i = 1;
            objD = this.k.d(this);
            r1 = hs0VarAn;
            if (objD != yjVar) {
            }
            return yjVar;
        }
        if (i == 1) {
            t00 t00Var = (t00) this.j;
            i60.az(obj);
            r10 = 0;
            yjVar = yjVar2;
            objD = obj;
            r1 = t00Var;
        } else {
            if (i == 2) {
                z = this.h;
                i60.az(obj);
                r10 = 0;
                yjVar = yjVar2;
                if (z) {
                    jh0 jh0Var = new jh0(this.l);
                    kh0 kh0Var2 = new kh0(jh0Var);
                    this.j = kh0Var2;
                    this.i = 3;
                    if (g80Var.a(jh0Var, this) != yjVar) {
                        kh0Var = kh0Var2;
                        r10 = r10;
                        this.j = r10;
                        this.i = 4;
                    }
                    return yjVar;
                }
                ybVar.ac = r10;
                return wz0Var;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                r10 = 0;
                ybVar.ac = r10;
                return wz0Var;
            }
            kh0Var = (kh0) this.j;
            i60.az(obj);
            r10 = 0;
            yjVar = yjVar2;
            this.j = r10;
            this.i = 4;
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        if (!r1.b()) {
            jh0 jh0Var2 = ybVar.ac;
            if (jh0Var2 != null) {
                yz kh0Var3 = zBooleanValue ? new kh0(jh0Var2) : new ih0(jh0Var2);
                this.j = r10;
                this.i = 5;
            }
            ybVar.ac = r10;
            return wz0Var;
        }
        this.j = r10;
        this.h = zBooleanValue;
        this.i = 2;
        r1.a(r10);
        Object objX = r1.x(this);
        if (objX != yjVar) {
            objX = wz0Var;
        }
        if (objX != yjVar) {
            z = zBooleanValue;
            r10 = r10;
            if (z) {
            }
            ybVar.ac = r10;
            return wz0Var;
        }
        return yjVar;
    }
}
