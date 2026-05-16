package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s40 {
    public final Locale a;

    public s40(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s40)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return f00.h(this.a.toLanguageTag(), ((s40) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
