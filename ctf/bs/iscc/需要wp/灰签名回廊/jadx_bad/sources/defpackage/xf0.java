package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf0 {
    public static final xf0 b = new xf0(false);
    public final boolean a;

    public xf0() {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xf0) {
            return this.a == ((xf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public xf0(boolean z) {
        this.a = z;
    }
}
