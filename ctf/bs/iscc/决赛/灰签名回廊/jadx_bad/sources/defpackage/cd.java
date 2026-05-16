package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd {
    public static final xs0 a = new xs0(u1.n);
    public static final xs0 b = new xs0(u1.o);

    public static final long a(zc zcVar, long j) {
        long j2 = zcVar.a;
        long j3 = zcVar.q;
        if (qc.c(j, j2)) {
            return zcVar.b;
        }
        if (qc.c(j, zcVar.f)) {
            return zcVar.g;
        }
        if (qc.c(j, zcVar.j)) {
            return zcVar.k;
        }
        if (qc.c(j, zcVar.n)) {
            return zcVar.o;
        }
        if (qc.c(j, zcVar.w)) {
            return zcVar.x;
        }
        if (qc.c(j, zcVar.c)) {
            return zcVar.d;
        }
        if (qc.c(j, zcVar.h)) {
            return zcVar.i;
        }
        if (qc.c(j, zcVar.l)) {
            return zcVar.m;
        }
        if (qc.c(j, zcVar.y)) {
            return zcVar.z;
        }
        if (qc.c(j, zcVar.u)) {
            return zcVar.v;
        }
        if (qc.c(j, zcVar.p)) {
            return j3;
        }
        if (qc.c(j, zcVar.r)) {
            return zcVar.s;
        }
        if (qc.c(j, zcVar.ad) || qc.c(j, zcVar.af) || qc.c(j, zcVar.ag) || qc.c(j, zcVar.ah) || qc.c(j, zcVar.ai) || qc.c(j, zcVar.aj)) {
            return j3;
        }
        int i = qc.h;
        return qc.g;
    }

    public static final long b(long j, vf vfVar) {
        vfVar.av(-1680936624);
        long jA = a((zc) vfVar.j(a), j);
        if (jA == 16) {
            jA = ((qc) vfVar.j(jh.a)).a;
        }
        vfVar.q(false);
        return jA;
    }

    public static zc c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i, int i2) {
        return new zc(j, (i & 2) != 0 ? rc.j : j2, (i & 4) != 0 ? rc.t : j3, (i & 8) != 0 ? rc.k : j4, (i & 16) != 0 ? rc.e : j5, j6, (i & 64) != 0 ? rc.l : j7, (i & 128) != 0 ? rc.v : j8, (i & 256) != 0 ? rc.m : j9, j10, (i & 1024) != 0 ? rc.p : j11, (i & 2048) != 0 ? rc.af : j12, (i & 4096) != 0 ? rc.q : j13, (i & 8192) != 0 ? rc.a : j14, (i & 16384) != 0 ? rc.g : j15, (32768 & i) != 0 ? rc.w : j16, (65536 & i) != 0 ? rc.n : j17, (131072 & i) != 0 ? rc.ae : j18, (262144 & i) != 0 ? rc.o : j19, (524288 & i) != 0 ? j : j20, (1048576 & i) != 0 ? rc.f : j21, (2097152 & i) != 0 ? rc.d : j22, rc.b, rc.h, rc.c, rc.i, (67108864 & i) != 0 ? rc.r : j23, (134217728 & i) != 0 ? rc.s : j24, (268435456 & i) != 0 ? rc.u : j25, (536870912 & i) != 0 ? rc.x : j26, (i2 & 8) != 0 ? rc.ad : j32, (1073741824 & i) != 0 ? rc.y : j27, (i & Integer.MIN_VALUE) != 0 ? rc.z : j28, (i2 & 1) != 0 ? rc.aa : j29, (i2 & 2) != 0 ? rc.ab : j30, (i2 & 4) != 0 ? rc.ac : j31);
    }

    public static final long d(zc zcVar, int i) {
        switch (n5.n(i)) {
            case 0:
                return zcVar.n;
            case 1:
                return zcVar.w;
            case 2:
                return zcVar.y;
            case 3:
                return zcVar.v;
            case 4:
                return zcVar.e;
            case 5:
                return zcVar.u;
            case 6:
                return zcVar.o;
            case 7:
                return zcVar.x;
            case MainActivity.$stable /* 8 */:
                return zcVar.z;
            case 9:
                return zcVar.b;
            case 10:
                return zcVar.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return qc.g;
            case 13:
                return zcVar.g;
            case 14:
                return zcVar.i;
            case 17:
                return zcVar.q;
            case 18:
                return zcVar.s;
            case 19:
                return zcVar.k;
            case 20:
                return zcVar.m;
            case 23:
                return zcVar.aa;
            case 24:
                return zcVar.ab;
            case 25:
                return zcVar.a;
            case 26:
                return zcVar.c;
            case 29:
                return zcVar.ac;
            case 30:
                return zcVar.f;
            case 31:
                return zcVar.h;
            case 34:
                return zcVar.p;
            case 35:
                return zcVar.ad;
            case 36:
                return zcVar.af;
            case 37:
                return zcVar.ag;
            case 38:
                return zcVar.ah;
            case 39:
                return zcVar.ai;
            case 40:
                return zcVar.aj;
            case 41:
                return zcVar.ae;
            case 42:
                return zcVar.t;
            case 43:
                return zcVar.r;
            case 44:
                return zcVar.j;
            case 45:
                return zcVar.l;
        }
    }

    public static zc e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i, int i2) {
        long j33 = (i & 1) != 0 ? tc.t : j;
        return new zc(j33, (i & 2) != 0 ? tc.j : j2, (i & 4) != 0 ? tc.u : j3, (i & 8) != 0 ? tc.k : j4, (i & 16) != 0 ? tc.e : j5, (i & 32) != 0 ? tc.w : j6, (i & 64) != 0 ? tc.l : j7, (i & 128) != 0 ? tc.x : j8, (i & 256) != 0 ? tc.m : j9, (i & 512) != 0 ? tc.ah : j10, (i & 1024) != 0 ? tc.p : j11, (i & 2048) != 0 ? tc.ai : j12, (i & 4096) != 0 ? tc.q : j13, (i & 8192) != 0 ? tc.a : j14, (i & 16384) != 0 ? tc.g : j15, (32768 & i) != 0 ? tc.y : j16, (65536 & i) != 0 ? tc.n : j17, (131072 & i) != 0 ? tc.ag : j18, (262144 & i) != 0 ? tc.o : j19, (524288 & i) != 0 ? j33 : j20, (1048576 & i) != 0 ? tc.f : j21, (2097152 & i) != 0 ? tc.d : j22, tc.b, tc.h, tc.c, tc.i, (67108864 & i) != 0 ? tc.r : j23, (134217728 & i) != 0 ? tc.s : j24, (268435456 & i) != 0 ? tc.v : j25, (536870912 & i) != 0 ? tc.z : j26, (i2 & 8) != 0 ? tc.af : j32, (1073741824 & i) != 0 ? tc.aa : j27, (i & Integer.MIN_VALUE) != 0 ? tc.ab : j28, (i2 & 1) != 0 ? tc.ac : j29, (i2 & 2) != 0 ? tc.ad : j30, (i2 & 4) != 0 ? tc.ae : j31);
    }
}
