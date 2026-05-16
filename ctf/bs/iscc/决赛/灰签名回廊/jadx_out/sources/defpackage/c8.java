package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c8 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public c8(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            d0.h();
            porterDuffColorFilter = d0.d(m10.av(j), az0.ai(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m10.av(j), az0.ao(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return qc.c(this.b, c8Var.b) && this.c == c8Var.c;
    }

    public final int hashCode() {
        int i = qc.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        n5.k(this.b, sb, ", blendMode=");
        sb.append((Object) f00.ah(this.c));
        sb.append(')');
        return sb.toString();
    }
}
