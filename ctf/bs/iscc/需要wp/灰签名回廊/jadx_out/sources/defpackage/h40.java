package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h40 implements Iterator, d10 {
    public final String d;
    public int e;
    public int f;
    public int g;
    public int h;

    public h40(String str) {
        this.d = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.h < 0) {
            this.e = 2;
            return false;
        }
        String str = this.d;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.e = 1;
                this.h = i;
                this.g = length;
                return true;
            }
        }
        i = -1;
        this.e = 1;
        this.h = i;
        this.g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wc.p();
            return null;
        }
        this.e = 0;
        int i = this.g;
        int i2 = this.f;
        this.f = this.h + i;
        return this.d.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
