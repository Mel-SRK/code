package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a80 {
    public final q80 a;

    public static final Object a(q80 q80Var) {
        Object objG = q80Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof m80)) {
            q80Var.j(null);
            return objG;
        }
        m80 m80Var = (m80) objG;
        if (m80Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = m80Var.b - 1;
        Object objE = m80Var.e(i);
        m80Var.j(i);
        objE.getClass();
        if (m80Var.g()) {
            q80Var.j(null);
        }
        if (m80Var.b == 1) {
            q80Var.l(null, m80Var.d());
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m80 b(q80 q80Var) {
        if (q80Var.i()) {
            m80 m80Var = ta0.b;
            m80Var.getClass();
            return m80Var;
        }
        m80 m80Var2 = new m80();
        Object[] objArr = q80Var.c;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof m80) {
                                m80 m80Var3 = (m80) obj;
                                if (!m80Var3.g()) {
                                    int i4 = m80Var2.b + m80Var3.b;
                                    Object[] objArr2 = m80Var2.a;
                                    if (objArr2.length < i4) {
                                        m80Var2.l(i4, objArr2);
                                    }
                                    h7.au(m80Var3.a, m80Var2.a, m80Var2.b, 0, m80Var3.b);
                                    m80Var2.b += m80Var3.b;
                                }
                            } else {
                                obj.getClass();
                                m80Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return m80Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a80) {
            return this.a.equals(((a80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
