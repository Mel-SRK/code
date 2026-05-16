package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class au0 implements x20, Serializable {
    public pu d;
    public volatile Object e;
    public final Object f;

    public au0(pu puVar) {
        puVar.getClass();
        this.d = puVar;
        this.e = bw.ax;
        this.f = this;
    }

    @Override // defpackage.x20
    public final Object getValue() {
        Object objA;
        Object obj = this.e;
        bw bwVar = bw.ax;
        if (obj != bwVar) {
            return obj;
        }
        synchronized (this.f) {
            objA = this.e;
            if (objA == bwVar) {
                pu puVar = this.d;
                puVar.getClass();
                objA = puVar.a();
                this.e = objA;
                this.d = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.e != bw.ax ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
