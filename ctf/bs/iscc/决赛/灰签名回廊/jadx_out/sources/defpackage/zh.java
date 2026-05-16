package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zh {
    public final me0 a = bo0.m(wh.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zh) {
            return f00.h((yh) ((zh) obj).a.getValue(), (yh) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((yh) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((yh) this.a.getValue()) + ')';
    }
}
