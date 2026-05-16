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
    */
    public final er b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                er erVar = objArr[i];
                erVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (erVar.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.a;
                        objArr2.getClass();
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i5];
                            comparable.getClass();
                            Object obj2 = objArr2[i4];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i5 = i4;
                            }
                            Comparable comparable2 = objArr2[i];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i5];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        er erVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        erVar2.getClass();
        erVar2.d(null);
        erVar2.e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return erVar2;
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
