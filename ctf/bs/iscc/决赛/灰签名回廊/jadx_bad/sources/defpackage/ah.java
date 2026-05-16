package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final String a;
    public final ov b;

    public ah(String str, ov ovVar) {
        this.a = str;
        this.b = ovVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return f00.h(this.a, ahVar.a) && f00.h(this.b, ahVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ov ovVar = this.b;
        return iHashCode + (ovVar != null ? ovVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
