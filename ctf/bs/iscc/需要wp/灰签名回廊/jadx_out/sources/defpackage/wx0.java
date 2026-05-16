package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class wx0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wx0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public er[] a;

    public final void a(er erVar) {
        erVar.d((fr) this);
        er[] erVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (erVarArr == null) {
            erVarArr = new er[4];
            this.a = erVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= erVarArr.length) {
            erVarArr = (er[]) Arrays.copyOf(erVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = erVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        erVarArr[i] = erVar;
        erVar.e = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.er b(int r9) {
        /*
            r8 = this;
            er[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.wx0.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            er[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.e = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx0.b(int):er");
    }

    public final void c(int i) {
        while (i > 0) {
            er[] erVarArr = this.a;
            erVarArr.getClass();
            int i2 = (i - 1) / 2;
            er erVar = erVarArr[i2];
            erVar.getClass();
            er erVar2 = erVarArr[i];
            erVar2.getClass();
            if (erVar.compareTo(erVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        er[] erVarArr = this.a;
        erVarArr.getClass();
        er erVar = erVarArr[i2];
        erVar.getClass();
        er erVar2 = erVarArr[i];
        erVar2.getClass();
        erVarArr[i] = erVar;
        erVarArr[i2] = erVar2;
        erVar.e = i;
        erVar2.e = i2;
    }
}
