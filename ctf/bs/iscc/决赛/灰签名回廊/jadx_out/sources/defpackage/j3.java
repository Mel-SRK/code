package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3.o(java.lang.Object):java.lang.Object");
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
