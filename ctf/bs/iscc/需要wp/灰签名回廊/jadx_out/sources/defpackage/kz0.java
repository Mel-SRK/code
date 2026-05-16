package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final a0 b;
    public volatile int c = 0;

    public kz0(a0 a0Var, int i) {
        this.b = a0Var;
        this.a = i;
    }

    public final int a(int i) {
        z60 z60VarB = b();
        int iA = z60VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) z60VarB.g;
        int i2 = iA + z60VarB.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final z60 b() {
        ThreadLocal threadLocal = d;
        z60 z60Var = (z60) threadLocal.get();
        if (z60Var == null) {
            z60Var = new z60();
            threadLocal.set(z60Var);
        }
        a70 a70Var = (a70) this.b.a;
        int iA = a70Var.a(6);
        if (iA != 0) {
            int i = iA + a70Var.d;
            int i2 = (this.a * 4) + ((ByteBuffer) a70Var.g).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) a70Var.g).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) a70Var.g;
            z60Var.g = byteBuffer;
            if (byteBuffer != null) {
                z60Var.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                z60Var.e = i4;
                z60Var.f = ((ByteBuffer) z60Var.g).getShort(i4);
                return z60Var;
            }
            z60Var.d = 0;
            z60Var.e = 0;
            z60Var.f = 0;
        }
        return z60Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        z60 z60VarB = b();
        int iA = z60VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) z60VarB.g).getInt(iA + z60VarB.d) : 0));
        sb.append(", codepoints:");
        z60 z60VarB2 = b();
        int iA2 = z60VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + z60VarB2.d;
            i = ((ByteBuffer) z60VarB2.g).getInt(((ByteBuffer) z60VarB2.g).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
