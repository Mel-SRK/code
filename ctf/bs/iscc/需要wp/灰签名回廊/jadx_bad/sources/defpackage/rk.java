package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class rk {
    public Parcel a;

    public long a() {
        int i = qc.h;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public long b() {
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return rx0.a(j, 0L) ? qx0.c : bo0.o(j, parcel.readFloat());
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long jB = qx0.b(j);
        byte b = 0;
        if (!rx0.a(jB, 0L)) {
            if (rx0.a(jB, 4294967296L)) {
                b = 1;
            } else if (rx0.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (rx0.a(qx0.b(j), 0L)) {
            return;
        }
        d(qx0.c(j));
    }

    public void f(long j) {
        long j2 = 63 & j;
        if (Long.compare(Long.MIN_VALUE ^ j2, -9223372036854775792L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
