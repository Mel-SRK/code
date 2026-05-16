package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class er implements Runnable, Comparable, en {
    private volatile Object _heap;
    public long d;
    public int e;

    @Override // defpackage.en
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                jq jqVar = f00.f;
                if (obj == jqVar) {
                    return;
                }
                fr frVar = obj instanceof fr ? (fr) obj : null;
                if (frVar != null) {
                    synchronized (frVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof wx0 ? (wx0) obj2 : null) != null) {
                            frVar.b(this.e);
                        }
                    }
                }
                this._heap = jqVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, fr frVar, c cVar) {
        synchronized (this) {
            if (this._heap == f00.f) {
                return 2;
            }
            synchronized (frVar) {
                try {
                    er[] erVarArr = frVar.a;
                    er erVar = erVarArr != null ? erVarArr[0] : null;
                    if (c.l.get(cVar) != 0) {
                        return 1;
                    }
                    if (erVar == null) {
                        frVar.c = j;
                    } else {
                        long j2 = erVar.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - frVar.c > 0) {
                            frVar.c = j;
                        }
                    }
                    long j3 = this.d;
                    long j4 = frVar.c;
                    if (j3 - j4 < 0) {
                        this.d = j4;
                    }
                    frVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((er) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(fr frVar) {
        if (this._heap != f00.f) {
            this._heap = frVar;
        } else {
            wc.n("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
