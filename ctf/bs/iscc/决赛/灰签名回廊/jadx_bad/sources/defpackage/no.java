package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class no extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public xi0 i;
    public xi0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ in0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(xi0 xi0Var, in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.j = xi0Var;
        this.m = in0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((no) k((ji) obj2, (cv) obj)).o(wz0.a);
            default:
                return ((no) k((ji) obj2, (xj) obj)).o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                no noVar = new no(this.j, this.m, jiVar);
                noVar.l = obj;
                return noVar;
            default:
                no noVar2 = new no(this.m, jiVar);
                noVar2.l = obj;
                return noVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if (defpackage.in0.bx(r3, r10) != r5) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:48:0x00d7, B:44:0x00c5], limit reached: 89 */
    /* JADX WARN: Path cross not found for [B:50:0x00db, B:20:0x005e], limit reached: 89 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0 r6
      0x003a: PHI (r0v13 xi0) = (r0v5 xi0), (r0v17 xi0) binds: [B:14:0x0037, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v6 xj) = (r6v4 xj), (r6v7 xj) binds: [B:14:0x0037, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v8 xj) = (r7v0 xj), (r7v3 xj), (r7v3 xj), (r7v3 xj), (r7v6 xj), (r7v9 xj) binds: [B:19:0x0056, B:49:0x00d9, B:51:0x00e6, B:45:0x00d2, B:31:0x008a, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:42:0x00bf, B:44:0x00c5, B:48:0x00d7, B:50:0x00db), top: B:89:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:42:0x00bf, B:44:0x00c5, B:48:0x00d7, B:50:0x00db), top: B:89:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d2 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f4 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0148 -> B:79:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014d -> B:81:0x014e). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        cv cvVar;
        Object obj2;
        xj xjVar;
        xi0 xi0Var;
        xi0 xi0Var2;
        xi0 xi0Var3;
        xj xjVar2;
        xj xjVar3;
        Object obj3;
        Object objE;
        xn xnVar;
        Object obj4;
        switch (this.h) {
            case 0:
                xi0 xi0Var4 = this.j;
                int i = this.k;
                if (i == 0) {
                    i60.az(obj);
                    cvVar = (cv) this.l;
                    obj2 = xi0Var4.d;
                    if (obj2 instanceof wn) {
                    }
                    return wz0.a;
                }
                if (i != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xi0 xi0Var5 = this.i;
                cvVar = (cv) this.l;
                i60.az(obj);
                xn xnVar2 = (xn) obj;
                xi0Var5.d = xnVar2;
                obj2 = xi0Var4.d;
                if (!(obj2 instanceof wn) || (obj2 instanceof tn)) {
                    return wz0.a;
                }
                xnVar2 = null;
                un unVar = obj2 instanceof un ? (un) obj2 : null;
                if (unVar != null) {
                    cvVar.g(unVar);
                }
                o9 o9Var = this.m.x;
                if (o9Var == null) {
                    xi0Var5 = xi0Var4;
                    xi0Var5.d = xnVar2;
                    obj2 = xi0Var4.d;
                    if (obj2 instanceof wn) {
                    }
                    return wz0.a;
                }
                this.l = cvVar;
                this.i = xi0Var4;
                this.k = 1;
                obj = o9Var.o(this);
                yj yjVar = yj.d;
                if (obj == yjVar) {
                    return yjVar;
                }
                xi0Var5 = xi0Var4;
                xn xnVar22 = (xn) obj;
                xi0Var5.d = xnVar22;
                obj2 = xi0Var4.d;
                if (obj2 instanceof wn) {
                }
                return wz0.a;
            default:
                int i2 = this.k;
                wz0 wz0Var = wz0.a;
                in0 in0Var = this.m;
                yj yjVar2 = yj.d;
                switch (i2) {
                    case 0:
                        i60.az(obj);
                        xjVar = (xj) this.l;
                        if (!i60.al(xjVar)) {
                            xi0Var = new xi0();
                            o9 o9Var2 = in0Var.x;
                            if (o9Var2 == null) {
                                xi0Var2 = xi0Var;
                                xnVar = null;
                                xi0Var.d = xnVar;
                                obj4 = xi0Var2.d;
                                if (obj4 instanceof vn) {
                                }
                                return yjVar2;
                            }
                            this.l = xjVar;
                            this.i = xi0Var;
                            this.j = xi0Var;
                            this.k = 1;
                            obj = o9Var2.o(this);
                            if (obj != yjVar2) {
                                xi0Var2 = xi0Var;
                                xnVar = (xn) obj;
                                xi0Var.d = xnVar;
                                obj4 = xi0Var2.d;
                                if (obj4 instanceof vn) {
                                    this.l = xjVar;
                                    this.i = xi0Var2;
                                    this.j = null;
                                    this.k = 2;
                                    if (in0.bz(in0Var, (vn) obj4, this) != yjVar2) {
                                        xi0Var3 = xi0Var2;
                                        xjVar2 = xjVar;
                                        no noVar = new no(xi0Var3, in0Var, null);
                                        this.l = xjVar2;
                                        this.i = xi0Var3;
                                        this.k = 3;
                                        rn0 rn0Var = in0Var.af;
                                        objE = rn0Var.e(2, new w8(noVar, rn0Var, (ji) null, 9), this);
                                        if (objE != yjVar2) {
                                            objE = wz0Var;
                                        }
                                        if (objE != yjVar2) {
                                            xjVar = xjVar2;
                                            try {
                                            } catch (CancellationException unused) {
                                                xjVar3 = xjVar;
                                                this.l = xjVar3;
                                                this.i = null;
                                                this.k = 6;
                                                break;
                                            }
                                            obj3 = xi0Var3.d;
                                            if (obj3 instanceof wn) {
                                                this.l = xjVar;
                                                this.i = null;
                                                this.k = 4;
                                                if (in0.O0(in0Var, (wn) obj3, this) != yjVar2) {
                                                    if (!i60.al(xjVar)) {
                                                    }
                                                }
                                            } else {
                                                if (obj3 instanceof tn) {
                                                    this.l = xjVar;
                                                    this.i = null;
                                                    this.k = 5;
                                                    if (in0.bx(in0Var, this) != yjVar2) {
                                                    }
                                                }
                                                if (!i60.al(xjVar)) {
                                                    return wz0Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return yjVar2;
                        }
                        break;
                    case 1:
                        xi0Var = this.j;
                        xi0Var2 = this.i;
                        xjVar = (xj) this.l;
                        i60.az(obj);
                        xnVar = (xn) obj;
                        xi0Var.d = xnVar;
                        obj4 = xi0Var2.d;
                        if (obj4 instanceof vn) {
                        }
                        return yjVar2;
                    case 2:
                        xi0Var3 = this.i;
                        xjVar2 = (xj) this.l;
                        i60.az(obj);
                        no noVar2 = new no(xi0Var3, in0Var, null);
                        this.l = xjVar2;
                        this.i = xi0Var3;
                        this.k = 3;
                        rn0 rn0Var2 = in0Var.af;
                        objE = rn0Var2.e(2, new w8(noVar2, rn0Var2, (ji) null, 9), this);
                        if (objE != yjVar2) {
                        }
                        if (objE != yjVar2) {
                        }
                        return yjVar2;
                    case 3:
                        xi0Var3 = this.i;
                        xjVar2 = (xj) this.l;
                        try {
                            i60.az(obj);
                        } catch (CancellationException unused2) {
                            xjVar3 = xjVar2;
                            this.l = xjVar3;
                            this.i = null;
                            this.k = 6;
                        }
                        xjVar = xjVar2;
                        obj3 = xi0Var3.d;
                        if (obj3 instanceof wn) {
                        }
                        break;
                    case 4:
                        xjVar3 = (xj) this.l;
                        try {
                            i60.az(obj);
                        } catch (CancellationException unused3) {
                            this.l = xjVar3;
                            this.i = null;
                            this.k = 6;
                        }
                        xjVar = xjVar3;
                        if (!i60.al(xjVar)) {
                        }
                        break;
                    case 5:
                        xjVar3 = (xj) this.l;
                        i60.az(obj);
                        xjVar = xjVar3;
                        if (!i60.al(xjVar)) {
                        }
                        break;
                    case 6:
                        xjVar3 = (xj) this.l;
                        i60.az(obj);
                        xjVar = xjVar3;
                        if (!i60.al(xjVar)) {
                        }
                        break;
                    default:
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.m = in0Var;
    }
}
