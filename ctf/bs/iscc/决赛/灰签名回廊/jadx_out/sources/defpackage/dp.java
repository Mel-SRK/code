package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class dp implements i01 {
    public final me0 a;

    public dp(me0 me0Var) {
        this.a = me0Var;
    }

    @Override // defpackage.i01
    public final Object a(a aVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp) && this.a.equals(((dp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
