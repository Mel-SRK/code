package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j3(cv cvVar, AtomicReference atomicReference, gv gvVar, ji jiVar) {
        super(2, jiVar);
        this.h = 6;
        this.k = (x10) cvVar;
        this.l = atomicReference;
        this.m = gvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                ((j3) k((ji) obj2, (w3) obj)).o(wz0.a);
                return yj.d;
            case 1:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 2:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 3:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 4:
                return ((j3) k((ji) obj2, (jq0) obj)).o(wz0.a);
            case 5:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 6:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                return ((j3) k((ji) obj2, (xj) obj)).o(wz0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cv, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                j3 j3Var = new j3((cv) this.k, (k3) this.l, (c30) this.m, jiVar, 0);
                j3Var.j = obj;
                return j3Var;
            case 1:
                return new j3(this.j, (j5) this.k, (w80) this.l, (w80) this.m, jiVar, 1);
            case 2:
                return new j3((ff) this.j, (ScrollCaptureSession) this.k, (Rect) this.l, (Consumer) this.m, jiVar, 2);
            case 3:
                j3 j3Var2 = new j3((lh) this.k, (f01) this.l, (c9) this.m, jiVar, 3);
                j3Var2.j = obj;
                return j3Var2;
            case 4:
                j3 j3Var3 = new j3((yr) this.k, (ps0) this.l, (Float) this.m, jiVar, 4);
                j3Var3.j = obj;
                return j3Var3;
            case 5:
                return new j3((ls0) this.j, (yr) this.k, (ps0) this.l, (Float) this.m, jiVar, 5);
            case 6:
                j3 j3Var4 = new j3((x10) this.k, (AtomicReference) this.l, (gv) this.m, jiVar);
                j3Var4.j = obj;
                return j3Var4;
            default:
                j3 j3Var5 = new j3((tg0) this.k, (hv) this.l, (pi) this.m, jiVar, 7);
                j3Var5.j = obj;
                return j3Var5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Type inference failed for: r9v5, types: [cv, x10] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objA;
        tp0 tp0Var;
        Object objF;
        tp0 tp0Var2;
        int i = this.h;
        boolean z = false;
        tp0 tp0Var3 = null;
        Object[] objArr = 0;
        int i2 = 2;
        Object obj2 = wz0.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = yj.d;
        Object obj6 = this.k;
        int i3 = 1;
        CancellationException cancellationException = null;
        switch (i) {
            case 0:
                int i4 = this.i;
                if (i4 == 0) {
                    i60.az(obj);
                    i3 i3Var = new i3((w3) this.j, (cv) obj6, (k3) obj4, (c30) obj3, null, 0);
                    this.i = 1;
                    if (i60.y(i3Var, this) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i4 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                throw new xd();
            case 1:
                Object obj7 = this.j;
                j5 j5Var = (j5) obj6;
                int i5 = this.i;
                if (i5 == 0) {
                    i60.az(obj);
                    if (f00.h(obj7, j5Var.e.getValue())) {
                        return obj2;
                    }
                    int i6 = l5.a;
                    q5 q5Var = (q5) ((w80) obj4).getValue();
                    this.i = 1;
                    if (j5.b(j5Var, obj7, q5Var, this) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i5 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                int i7 = l5.a;
                cv cvVar = (cv) ((w80) obj3).getValue();
                if (cvVar == null) {
                    return obj2;
                }
                cvVar.g(j5Var.c());
                return obj2;
            case 2:
                int i8 = this.i;
                if (i8 == 0) {
                    i60.az(obj);
                    Rect rect = (Rect) obj4;
                    tz tzVar = new tz(rect.left, rect.top, rect.right, rect.bottom);
                    this.i = 1;
                    objA = ff.a((ff) this.j, (ScrollCaptureSession) obj6, tzVar, this);
                    if (objA == obj5) {
                        return obj5;
                    }
                } else {
                    if (i8 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                    objA = obj;
                }
                ((Consumer) obj3).accept(pk.bd((tz) objA));
                return obj2;
            case 3:
                lh lhVar = (lh) obj6;
                bu buVar = lhVar.u;
                int i9 = this.i;
                try {
                    try {
                        if (i9 == 0) {
                            i60.az(obj);
                            t00 t00VarAf = i60.af(((xj) this.j).f());
                            lhVar.z = true;
                            rn0 rn0Var = lhVar.s;
                            i3 i3Var2 = new i3((f01) obj4, lhVar, (c9) obj3, t00VarAf, null, 1);
                            this.i = 1;
                            if (rn0Var.e(1, i3Var2, this) == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i9 != 1) {
                                wc.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i60.az(obj);
                        }
                        buVar.n();
                        return obj2;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        throw cancellationException;
                    }
                } finally {
                    lhVar.z = false;
                    buVar.f(cancellationException);
                    lhVar.x = false;
                }
            case 4:
                ps0 ps0Var = (ps0) obj4;
                int i10 = this.i;
                if (i10 == 0) {
                    i60.az(obj);
                    int iOrdinal = ((jq0) this.j).ordinal();
                    if (iOrdinal == 0) {
                        this.i = 1;
                        return ((yr) obj6).b(ps0Var, this) == obj5 ? obj5 : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        Float f = (Float) obj3;
                        if (f != pk.g) {
                            ps0Var.h(null, f);
                            return obj2;
                        }
                        ps0Var.getClass();
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    wc.l();
                } else {
                    if (i10 == 1) {
                        i60.az(obj);
                        return obj2;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                yr yrVar = (yr) obj6;
                ps0 ps0Var2 = (ps0) obj4;
                int i11 = this.i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i60.az(obj);
                        } else if (i11 != 3 && i11 != 4) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    i60.az(obj);
                    return obj2;
                }
                i60.az(obj);
                ls0 ls0Var = (ls0) this.j;
                if (ls0Var == kq0.a) {
                    this.i = 1;
                    if (yrVar.b(ps0Var2, this) != obj5) {
                        return obj2;
                    }
                } else {
                    ji jiVar = null;
                    if (ls0Var == kq0.b) {
                        kt0 kt0VarG = ps0Var2.g();
                        js jsVar = new js(2, null);
                        this.i = 2;
                        if (e00.y(kt0VarG, jsVar, this) != obj5) {
                        }
                    } else {
                        kt0 kt0VarG2 = ps0Var2.g();
                        ks0 ks0Var = new ks0(ls0Var, null);
                        int i12 = gs.a;
                        pq pqVar = pq.d;
                        m9 m9Var = m9.d;
                        yr yrVarR = e00.r(e00.r(new f1(5, new hb(ks0Var, kt0VarG2, pqVar, -2, m9Var), new ji0(i2, jiVar, i3))));
                        j3 j3Var = new j3(yrVar, ps0Var2, (Float) obj3, jiVar, 4);
                        this.i = 4;
                        Object objB = new hb(new fs(j3Var, null), yrVarR, pqVar, -2, m9Var).c(pqVar, 0, m9Var).b(na0.d, this);
                        if (objB != obj5) {
                            objB = obj2;
                        }
                        if (objB != obj5) {
                            objB = obj2;
                        }
                        if (objB != obj5) {
                            return obj2;
                        }
                    }
                }
                return obj5;
                this.i = 3;
                if (yrVar.b(ps0Var2, this) != obj5) {
                    return obj2;
                }
                return obj5;
            case 6:
                AtomicReference atomicReference = (AtomicReference) obj4;
                int i13 = this.i;
                try {
                    if (i13 == 0) {
                        i60.az(obj);
                        xj xjVar = (xj) this.j;
                        tp0Var3 = new tp0(i60.af(xjVar.f()), ((x10) obj6).g(xjVar));
                        tp0 tp0Var4 = (tp0) atomicReference.getAndSet(tp0Var3);
                        if (tp0Var4 != null) {
                            t00 t00Var = tp0Var4.a;
                            this.j = tp0Var3;
                            this.i = 1;
                            t00Var.a(null);
                            Object objX = t00Var.x(this);
                            if (objX == obj5) {
                                obj2 = objX;
                            }
                            if (obj2 == obj5) {
                                return obj5;
                            }
                            tp0Var = tp0Var3;
                        }
                        Object obj8 = tp0Var3.b;
                        this.j = tp0Var3;
                        this.i = 2;
                        objF = ((gv) obj3).f(obj8, this);
                        if (objF == obj5) {
                            return obj5;
                        }
                        tp0Var2 = tp0Var3;
                        while (!atomicReference.compareAndSet(tp0Var2, null)) {
                        }
                        return objF;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tp0Var3 = (tp0) this.j;
                        i60.az(obj);
                        objF = obj;
                        tp0Var2 = tp0Var3;
                        while (!atomicReference.compareAndSet(tp0Var2, null) && atomicReference.get() == tp0Var2) {
                        }
                        return objF;
                    }
                    tp0Var = (tp0) this.j;
                    i60.az(obj);
                    tp0Var3 = tp0Var;
                    Object obj82 = tp0Var3.b;
                    this.j = tp0Var3;
                    this.i = 2;
                    objF = ((gv) obj3).f(obj82, this);
                    if (objF == obj5) {
                    }
                    tp0Var2 = tp0Var3;
                    while (!atomicReference.compareAndSet(tp0Var2, null)) {
                    }
                    return objF;
                } catch (Throwable th) {
                    while (!atomicReference.compareAndSet(tp0Var3, null) && atomicReference.get() == tp0Var3) {
                    }
                    throw th;
                }
            default:
                tg0 tg0Var = (tg0) obj6;
                int i14 = this.i;
                if (i14 == 0) {
                    i60.az(obj);
                    qu0 qu0Var = new qu0((xj) this.j, (hv) obj4, (pi) obj3, new hh0(tg0Var), null);
                    this.i = 1;
                    return f00.k(tg0Var, qu0Var, this) == obj5 ? obj5 : obj2;
                }
                if (i14 == 1) {
                    i60.az(obj);
                    return obj2;
                }
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, Object obj4, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }
}
