package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class co extends rj0 implements gv {
    public ig0 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xi0 j;
    public final /* synthetic */ xi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(xi0 xi0Var, xi0 xi0Var2, ji jiVar) {
        super(jiVar);
        this.j = xi0Var;
        this.k = xi0Var2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((co) k((ji) obj2, (yt0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        co coVar = new co(this.j, this.k, jiVar);
        coVar.i = obj;
        return coVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[EDGE_INSN: B:66:0x00c2->B:41:0x00c2 BREAK  A[LOOP:0: B:36:0x00af->B:40:0x00bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a3 -> B:35:0x00a6). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        yt0 yt0Var;
        int i;
        Object objA;
        int size;
        int i2;
        int size2;
        int i3;
        Object objA2;
        Object obj2;
        Object obj3;
        int i4 = this.h;
        int i5 = 2;
        ig0 ig0Var = null;
        yj yjVar = yj.d;
        if (i4 == 0) {
            i60.az(obj);
            yt0Var = (yt0) this.i;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.g;
                yt0Var = (yt0) this.i;
                i60.az(obj);
                objA = obj;
                ig0 ig0Var2 = (ig0) objA;
                ?? r9 = ig0Var2.a;
                size = r9.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                ?? r92 = ig0Var2.a;
                size2 = r92.size();
                while (i3 < size2) {
                }
                this.i = yt0Var;
                this.f = ig0Var2;
                this.g = i;
                this.h = i5;
                objA2 = yt0Var.a(jg0.f, this);
                if (objA2 != yjVar) {
                }
                return yjVar;
            }
            if (i4 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.g;
            ig0 ig0Var3 = this.f;
            yt0 yt0Var2 = (yt0) this.i;
            i60.az(obj);
            objA2 = obj;
            ?? r3 = ((ig0) objA2).a;
            int size3 = r3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                if (((pg0) r3.get(i6)).b()) {
                    i = 1;
                    break;
                }
                i6++;
            }
            xi0 xi0Var = this.j;
            boolean zD = go.d(ig0Var3, ((pg0) xi0Var.d).a);
            ?? r7 = ig0Var3.a;
            xi0 xi0Var2 = this.k;
            if (!zD) {
                int size4 = r7.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r7.get(i7);
                    if (((pg0) obj3).d) {
                        break;
                    }
                    i7++;
                }
                pg0 pg0Var = (pg0) obj3;
                if (pg0Var == null) {
                    i = 1;
                    yt0Var = yt0Var2;
                    ig0Var = null;
                    if (i != 0) {
                        return wz0.a;
                    }
                    this.i = yt0Var;
                    this.f = ig0Var;
                    this.g = i;
                    this.h = 1;
                    objA = yt0Var.a(jg0.e, this);
                    if (objA != yjVar) {
                        ig0 ig0Var22 = (ig0) objA;
                        ?? r93 = ig0Var22.a;
                        size = r93.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = 1;
                                break;
                            }
                            if (!d41.m((pg0) r93.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        ?? r922 = ig0Var22.a;
                        size2 = r922.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            pg0 pg0Var2 = (pg0) r922.get(i3);
                            if (pg0Var2.b() || d41.ab(pg0Var2, yt0Var.i.ab, yt0Var.d())) {
                                break;
                            }
                        }
                        this.i = yt0Var;
                        this.f = ig0Var22;
                        this.g = i;
                        this.h = i5;
                        objA2 = yt0Var.a(jg0.f, this);
                        if (objA2 != yjVar) {
                            yt0Var2 = yt0Var;
                            ig0Var3 = ig0Var22;
                            ?? r32 = ((ig0) objA2).a;
                            int size32 = r32.size();
                            int i62 = 0;
                            while (true) {
                                if (i62 >= size32) {
                                }
                                i62++;
                            }
                            xi0 xi0Var3 = this.j;
                            boolean zD2 = go.d(ig0Var3, ((pg0) xi0Var3.d).a);
                            ?? r72 = ig0Var3.a;
                            xi0 xi0Var22 = this.k;
                            if (!zD2) {
                                int size5 = r72.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = r72.get(i8);
                                    xi0 xi0Var4 = xi0Var3;
                                    if (og0.a(((pg0) obj2).a, ((pg0) xi0Var3.d).a)) {
                                        break;
                                    }
                                    i8++;
                                    xi0Var3 = xi0Var4;
                                }
                                xi0Var22.d = obj2;
                            }
                        }
                    }
                    return yjVar;
                }
                xi0Var3.d = pg0Var;
                xi0Var22.d = pg0Var;
            }
            yt0Var = yt0Var2;
            i5 = 2;
            ig0Var = null;
            if (i != 0) {
            }
        }
    }
}
