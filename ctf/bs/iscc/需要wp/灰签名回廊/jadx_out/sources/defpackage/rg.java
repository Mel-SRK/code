package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class rg implements i01 {
    public final x10 a;

    /* JADX WARN: Multi-variable type inference failed */
    public rg(cv cvVar) {
        this.a = (x10) cvVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cv, x10] */
    @Override // defpackage.i01
    public final Object a(a aVar) {
        return this.a.g(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg) && this.a.equals(((rg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
