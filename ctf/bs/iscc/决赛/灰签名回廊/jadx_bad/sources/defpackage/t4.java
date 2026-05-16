package defpackage;

import android.view.ViewParent;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 implements pu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(i9 i9Var, long j) {
        this.d = 0;
        this.e = i9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    @Override // defpackage.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ja jaVarV;
        Object[] objArr;
        int i;
        switch (this.d) {
            case 0:
                throw null;
            case 1:
                return new hb0((ib0) this.e);
            case 2:
                mi0 mi0Var = (mi0) this.e;
                synchronized (mi0Var.b) {
                    jaVarV = mi0Var.v();
                    if (((ii0) mi0Var.t.getValue()).compareTo(ii0.e) <= 0) {
                        Throwable th = mi0Var.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (jaVarV != null) {
                    ((la) jaVarV).h(wz0.a);
                }
                return wz0.a;
            case 3:
                ql0 ql0Var = (ql0) this.e;
                hm0 hm0Var = ql0Var.d;
                Object obj = ql0Var.g;
                if (obj != null) {
                    return hm0Var.l(ql0Var, obj);
                }
                wc.n("Value should be initialized");
                return null;
            case 4:
                return (ViewParent) this.e;
            case 5:
                me0 me0Var = ((xp0) this.e).e;
                if (((pq0) me0Var.getValue()).a == 9205357640488583168L || pq0.e(((pq0) me0Var.getValue()).a)) {
                    return null;
                }
                long j = ((pq0) me0Var.getValue()).a;
                throw null;
            default:
                rr0 rr0Var = (rr0) this.e;
                do {
                    synchronized (rr0Var.g) {
                        try {
                            if (!rr0Var.c) {
                                rr0Var.c = true;
                                try {
                                    a90 a90Var = rr0Var.f;
                                    Object[] objArr2 = a90Var.d;
                                    int i2 = a90Var.f;
                                    int i3 = 0;
                                    while (i3 < i2) {
                                        qr0 qr0Var = (qr0) objArr2[i3];
                                        r80 r80Var = qr0Var.g;
                                        cv cvVar = qr0Var.a;
                                        Object[] objArr3 = r80Var.b;
                                        long[] jArr = r80Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j2 = jArr[i4];
                                                objArr = objArr2;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = 0;
                                                    while (i7 < i6) {
                                                        if ((j2 & 255) < 128) {
                                                            i = i5;
                                                            cvVar.g(objArr3[(i4 << 3) + i7]);
                                                        } else {
                                                            i = i5;
                                                        }
                                                        j2 >>= i;
                                                        i7++;
                                                        i5 = i;
                                                    }
                                                    if (i6 == i5) {
                                                        if (i4 != length) {
                                                            i4++;
                                                            objArr2 = objArr;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        r80Var.b();
                                        i3++;
                                        objArr2 = objArr;
                                    }
                                    rr0Var.c = false;
                                } catch (Throwable th2) {
                                    rr0Var.c = false;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } while (rr0Var.b());
                return wz0.a;
        }
    }

    public /* synthetic */ t4(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
