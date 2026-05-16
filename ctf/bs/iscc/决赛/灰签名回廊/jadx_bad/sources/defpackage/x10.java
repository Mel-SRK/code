package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x10 implements qv, Serializable {
    public final int d;

    public x10(int i) {
        this.d = i;
    }

    @Override // defpackage.qv
    public final int b() {
        return this.d;
    }

    public final String toString() {
        yi0.a.getClass();
        return zi0.a(this);
    }
}
