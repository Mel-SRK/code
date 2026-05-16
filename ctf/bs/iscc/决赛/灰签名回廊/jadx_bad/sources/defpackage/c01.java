package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c01 implements x20, Serializable {
    public pu d;
    public Object e;

    @Override // defpackage.x20
    public final Object getValue() {
        if (this.e == bw.ax) {
            pu puVar = this.d;
            puVar.getClass();
            this.e = puVar.a();
            this.d = null;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != bw.ax ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
