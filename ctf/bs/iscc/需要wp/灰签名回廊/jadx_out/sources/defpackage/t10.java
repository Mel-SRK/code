package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t10 {
    public final int a;

    public t10(int i) {
        this.a = (i & 4) != 0 ? 0 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t10) && this.a == ((t10) obj).a;
    }

    public final int hashCode() {
        return n5.c(-1, n5.c(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) u10.a(this.a)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
