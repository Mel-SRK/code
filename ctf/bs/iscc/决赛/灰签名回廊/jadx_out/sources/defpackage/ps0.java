package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ps0 extends af implements yr, sv, ns0, u80 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ps0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int h;

    public ps0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Path cross not found for [B:58:0x00f6, B:59:0x00f7], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.zr r18, defpackage.ji r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps0.b(zr, ji):java.lang.Object");
    }

    @Override // defpackage.sv
    public final yr c(pj pjVar, int i2, m9 m9Var) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || m9Var != m9.e) && !((i2 == 0 || i2 == -3) && m9Var == m9.d)) ? new db(this, pjVar, i2, m9Var) : this;
    }

    @Override // defpackage.af
    public final ag d() {
        return new qs0();
    }

    @Override // defpackage.af
    public final ag[] e() {
        return new qs0[2];
    }

    @Override // defpackage.ns0
    public final Object getValue() {
        jq jqVar = m10.d;
        Object obj = i.get(this);
        if (obj == jqVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        int i2;
        ag[] agVarArr;
        jq jqVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !f00.h(obj3, obj)) {
                return false;
            }
            if (f00.h(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.h;
            if ((i3 & 1) != 0) {
                this.h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.h = i4;
            ag[] agVarArr2 = this.d;
            while (true) {
                qs0[] qs0VarArr = (qs0[]) agVarArr2;
                if (qs0VarArr != null) {
                    for (qs0 qs0Var : qs0VarArr) {
                        if (qs0Var != null) {
                            AtomicReference atomicReference = qs0Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (jqVar = i60.p)) {
                                    jq jqVar2 = i60.o;
                                    if (obj4 != jqVar2) {
                                        while (!atomicReference.compareAndSet(obj4, jqVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((la) obj4).h(wz0.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, jqVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.h;
                    if (i2 == i4) {
                        this.h = i4 + 1;
                        return true;
                    }
                    agVarArr = this.d;
                }
                agVarArr2 = agVarArr;
                i4 = i2;
            }
        }
    }

    @Override // defpackage.zr
    public final Object i(Object obj, ji jiVar) {
        if (obj == null) {
            obj = m10.d;
        }
        h(null, obj);
        return wz0.a;
    }
}
