package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class z40 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(z40.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(z40.class, "_state$volatile");
    public static final jq g = new jq("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public z40(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            wc.q("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        wc.q("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    z40 z40VarC = this;
                    while ((atomicLongFieldUpdater.get(z40VarC) & 1152921504606846976L) != 0) {
                        z40VarC = z40VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = z40VarC.d;
                        int i4 = z40VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof y40) && ((y40) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            z40VarC = null;
                        }
                        if (z40VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final z40 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        z40 z40Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                z40Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            z40Var = this;
            if (atomicLongFieldUpdater.compareAndSet(z40Var, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            z40 z40Var2 = (z40) atomicReferenceFieldUpdater.get(this);
            if (z40Var2 != null) {
                return z40Var2;
            }
            z40 z40Var3 = new z40(z40Var.a * 2, z40Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = z40Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object y40Var = z40Var.d.get(i4);
                if (y40Var == null) {
                    y40Var = new y40(i);
                }
                z40Var3.d.set(z40Var3.c & i, y40Var);
                i++;
            }
            atomicLongFieldUpdater.set(z40Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, z40Var3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        z40 z40VarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(z40VarC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = z40VarC.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = z40VarC.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = z40VarC.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof y40) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(z40VarC, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                z40VarC = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(z40VarC);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            z40VarC = z40VarC.c();
                        } else {
                            z40 z40Var = z40VarC;
                            if (f.compareAndSet(z40Var, j3, (j3 & (-1073741824)) | j2)) {
                                z40Var.d.set(i4 & z40Var.c, null);
                                z40VarC = null;
                            } else {
                                z40VarC = z40Var;
                            }
                        }
                        if (z40VarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
