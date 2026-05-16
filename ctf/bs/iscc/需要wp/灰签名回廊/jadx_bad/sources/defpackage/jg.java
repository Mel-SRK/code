package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jg implements zf {
    public final cg d;
    public final o6 e;
    public final AtomicReference f = new AtomicReference(null);
    public final Object g = new Object();
    public final t80 h;
    public final sq0 i;
    public final q80 j;
    public final r80 k;
    public final r80 l;
    public final q80 m;
    public final wa n;
    public final wa o;
    public final q80 p;
    public q80 q;
    public boolean r;
    public jg s;
    public int t;
    public final n31 u;
    public final da0 v;
    public final vf w;
    public int x;

    public jg(cg cgVar, o6 o6Var) {
        this.d = cgVar;
        this.e = o6Var;
        t80 t80Var = new t80(new r80());
        this.h = t80Var;
        sq0 sq0Var = new sq0();
        if (cgVar.c()) {
            sq0Var.n = new e80();
        }
        if (cgVar.e()) {
            sq0Var.b();
        }
        this.i = sq0Var;
        this.j = i60.x();
        this.k = new r80();
        this.l = new r80();
        this.m = i60.x();
        wa waVar = new wa();
        this.n = waVar;
        wa waVar2 = new wa();
        this.o = waVar2;
        this.p = i60.x();
        this.q = i60.x();
        n31 n31Var = new n31(cgVar);
        this.u = n31Var;
        this.v = new da0();
        vf vfVar = new vf(o6Var, cgVar, sq0Var, t80Var, waVar, waVar2, n31Var, this);
        cgVar.m(vfVar);
        this.w = vfVar;
        te teVar = we.a;
    }

    public final void a() {
        this.f.set(null);
        this.n.k.an();
        this.o.k.an();
        t80 t80Var = this.h;
        if (t80Var.d.g()) {
            return;
        }
        da0 da0Var = this.v;
        try {
            da0Var.i(t80Var, this.w.y());
            da0Var.e();
        } finally {
            da0Var.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, boolean z) {
        int i;
        Object objG = this.j.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof r80;
        p00 p00Var = p00.d;
        r80 r80Var = this.k;
        r80 r80Var2 = this.l;
        q80 q80Var = this.p;
        if (!z2) {
            hi0 hi0Var = (hi0) objG;
            if (i60.av(q80Var, obj, hi0Var) || hi0Var.b(obj) == p00Var) {
                return;
            }
            if (hi0Var.g == null || z) {
                r80Var.a(hi0Var);
                return;
            } else {
                r80Var2.a(hi0Var);
                return;
            }
        }
        r80 r80Var3 = (r80) objG;
        Object[] objArr = r80Var3.b;
        long[] jArr = r80Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        hi0 hi0Var2 = (hi0) objArr[(i2 << 3) + i5];
                        if (i60.av(q80Var, obj, hi0Var2)) {
                            i = i3;
                        } else {
                            i = i3;
                            if (hi0Var2.b(obj) != p00Var) {
                                if (hi0Var2.g == null || z) {
                                    r80Var.a(hi0Var2);
                                } else {
                                    r80Var2.a(hi0Var2);
                                }
                            }
                        }
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j6;
        boolean zG;
        int i3;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i4;
        int i5;
        long[] jArr8;
        boolean z2 = set instanceof om0;
        q80 q80Var = this.m;
        Object obj = null;
        int i6 = 8;
        if (z2) {
            r80 r80Var = ((om0) set).d;
            Object[] objArr = r80Var.b;
            long[] jArr9 = r80Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i7];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c2 = c3;
                                if (obj2 instanceof hi0) {
                                    ((hi0) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = q80Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof r80) {
                                            r80 r80Var2 = (r80) objG;
                                            Object[] objArr2 = r80Var2.b;
                                            long[] jArr10 = r80Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i11];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((km) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i4 = length;
                                            b((km) objG, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr9 = jArr6;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof hi0) {
                    ((hi0) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = q80Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof r80) {
                            r80 r80Var3 = (r80) objG2;
                            Object[] objArr3 = r80Var3.b;
                            long[] jArr12 = r80Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr12[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((km) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((km) objG2, z);
                        }
                    }
                }
            }
        }
        q80 q80Var2 = this.j;
        r80 r80Var4 = this.k;
        if (z) {
            r80 r80Var5 = this.l;
            if (r80Var5.h()) {
                long[] jArr13 = q80Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = q80Var2.b[i20];
                                    Object obj5 = q80Var2.c[i20];
                                    if (obj5 instanceof r80) {
                                        r80 r80Var6 = (r80) obj5;
                                        Object[] objArr4 = r80Var6.b;
                                        long[] jArr14 = r80Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            hi0 hi0Var = (hi0) objArr4[i24];
                                                            if (r80Var5.c(hi0Var) || r80Var4.c(hi0Var)) {
                                                                r80Var6.l(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 == length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i2;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        zG = r80Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        hi0 hi0Var2 = (hi0) obj5;
                                        zG = r80Var5.c(hi0Var2) || r80Var4.c(hi0Var2);
                                    }
                                    if (zG) {
                                        q80Var2.k(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                r80Var5.b();
                h();
                return;
            }
        }
        if (r80Var4.h()) {
            long[] jArr15 = q80Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = q80Var2.b[i29];
                                Object obj7 = q80Var2.c[i29];
                                if (obj7 instanceof r80) {
                                    r80 r80Var7 = (r80) obj7;
                                    Object[] objArr5 = r80Var7.b;
                                    long[] jArr16 = r80Var7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (r80Var4.c((hi0) objArr6[i33])) {
                                                            r80Var7.l(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    zC = r80Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = r80Var4.c((hi0) obj7);
                                }
                                if (zC) {
                                    q80Var2.k(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            h();
            r80Var4.b();
        }
    }

    public final void d() {
        synchronized (this.g) {
            try {
                e(this.n);
                k();
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th2) {
                            da0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #4 {all -> 0x01d5, blocks: (B:115:0x01c9, B:117:0x01d1), top: B:133:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(wa waVar) throws Throwable {
        da0 da0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        da0 da0Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        wa waVar2 = this.o;
        vf vfVar = this.w;
        gg ggVarY = vfVar.y();
        da0 da0Var3 = this.v;
        da0Var3.i(this.h, ggVarY);
        try {
            if (waVar.k.ap()) {
                try {
                    if (waVar2.k.ap()) {
                        da0Var3.e();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    o6 o6Var = this.e;
                    vq0 vq0VarD = this.i.d();
                    int i3 = 0;
                    try {
                        waVar.an(o6Var, vq0VarD, da0Var3, vfVar.y());
                        vq0VarD.e(true);
                        o6Var.v();
                        Trace.endSection();
                        da0Var3.f();
                        a90 a90Var = (a90) da0Var3.h;
                        if (a90Var.f != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = a90Var.d;
                                int i4 = a90Var.f;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((pu) objArr[i5]).a();
                                }
                                a90Var.g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.r = false;
                                q80 q80Var = this.j;
                                long[] jArr3 = q80Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j3 = jArr3[i6];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8;
                                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                                            int i9 = i3;
                                            while (i9 < i8) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i10 = (i6 << 3) + i9;
                                                    j2 = j4;
                                                    Object obj = q80Var.b[i10];
                                                    Object obj2 = q80Var.c[i10];
                                                    if (obj2 instanceof r80) {
                                                        r80 r80Var = (r80) obj2;
                                                        Object[] objArr2 = r80Var.b;
                                                        long[] jArr4 = r80Var.a;
                                                        int i11 = i7;
                                                        int length2 = jArr4.length - 2;
                                                        i = i9;
                                                        jArr2 = jArr3;
                                                        da0Var2 = da0Var3;
                                                        if (length2 >= 0) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i12];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                                            if ((j5 & 255) < 128) {
                                                                                int i15 = (i12 << 3) + i14;
                                                                                if (!((hi0) objArr2[i15]).a()) {
                                                                                    r80Var.l(i15);
                                                                                }
                                                                            }
                                                                            j5 >>= i11;
                                                                        }
                                                                        if (i13 != i11) {
                                                                            break;
                                                                        }
                                                                        if (i12 == length2) {
                                                                            break;
                                                                        }
                                                                        i12++;
                                                                        i11 = 8;
                                                                        j3 = j;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j3;
                                                        }
                                                        zG = r80Var.g();
                                                    } else {
                                                        i = i9;
                                                        jArr2 = jArr3;
                                                        da0Var2 = da0Var3;
                                                        j = j3;
                                                        obj2.getClass();
                                                        zG = !((hi0) obj2).a();
                                                    }
                                                    if (zG) {
                                                        q80Var.k(i10);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i9;
                                                    jArr2 = jArr3;
                                                    da0Var2 = da0Var3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i7;
                                                }
                                                j3 = j >> i2;
                                                i9 = i + 1;
                                                i7 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                da0Var3 = da0Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            da0Var = da0Var3;
                                            if (i8 != i7) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            da0Var = da0Var3;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        da0Var3 = da0Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    da0Var = da0Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            da0Var = da0Var3;
                        }
                        try {
                            if (waVar2.k.ap()) {
                                da0Var.e();
                            }
                        } finally {
                            da0Var.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            vq0VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (waVar2.k.ap()) {
                        da0Var3.e();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (waVar2.k.ap()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.g) {
            try {
                if (this.o.k.aq()) {
                    e(this.o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th2) {
                            da0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        da0 da0Var;
        synchronized (this.g) {
            try {
                this.w.u = null;
                if (!this.h.d.g()) {
                    da0Var = this.v;
                    try {
                        da0Var.i(this.h, this.w.y());
                        da0Var.e();
                        da0Var.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zG;
        int i3;
        long j7;
        q80 q80Var = this.m;
        long[] jArr3 = q80Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = q80Var.b[i8];
                            Object obj2 = q80Var.c[i8];
                            boolean z = obj2 instanceof r80;
                            q80 q80Var2 = this.j;
                            if (z) {
                                r80 r80Var = (r80) obj2;
                                Object[] objArr = r80Var.b;
                                long[] jArr4 = r80Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!q80Var2.c((km) objArr[i13])) {
                                                        r80Var.l(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zG = r80Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                zG = !q80Var2.c((km) obj2);
                            }
                            if (zG) {
                                q80Var.k(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        r80 r80Var2 = this.l;
        if (!r80Var2.h()) {
            return;
        }
        Object[] objArr2 = r80Var2.b;
        long[] jArr5 = r80Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((hi0) objArr2[i18]).g != null)) {
                            r80Var2.l(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void i(te teVar) {
        try {
            synchronized (this.g) {
                j();
                q80 q80Var = this.q;
                this.q = i60.x();
                try {
                    vf vfVar = this.w;
                    if (!vfVar.e.k.ap()) {
                        xf.c("Expected applyChanges() to have been called");
                    }
                    vfVar.o(q80Var, teVar);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.h.d.g()) {
                    da0 da0Var = this.v;
                    try {
                        da0Var.i(this.h, this.w.y());
                        da0Var.e();
                        da0Var.b();
                    } catch (Throwable th2) {
                        da0Var.b();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final void j() {
        Object obj = t1.c;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                xf.d("pending composition has not been applied");
                throw new xd();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                xf.d("corrupt pendingModifications drain: " + atomicReference);
                throw new xd();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(null);
        if (f00.h(andSet, t1.c)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            xf.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new xd();
        }
        xf.d("corrupt pendingModifications drain: " + atomicReference);
        throw new xd();
    }

    public final void l() {
        vq vqVar = vq.d;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(vqVar);
        if (f00.h(andSet, t1.c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            xf.d("corrupt pendingModifications drain: " + atomicReference);
            throw new xd();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void m(ArrayList arrayList) {
        t80 t80Var = this.h;
        vf vfVar = this.w;
        if (arrayList.size() > 0) {
            ((v70) ((ae0) arrayList.get(0)).d).getClass();
            throw null;
        }
        try {
            vfVar.getClass();
            try {
                vfVar.aa(arrayList);
                vfVar.i();
            } catch (Throwable th) {
                vfVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!t80Var.d.g()) {
                    da0 da0Var = this.v;
                    try {
                        da0Var.i(t80Var, vfVar.y());
                        da0Var.e();
                        da0Var.b();
                    } catch (Throwable th3) {
                        da0Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final p00 n(hi0 hi0Var, Object obj) {
        jg jgVar;
        int i = hi0Var.b;
        if ((i & 2) != 0) {
            hi0Var.b = i | 4;
        }
        Il il = hi0Var.c;
        if (il == null || !il.a()) {
            return p00.d;
        }
        if (this.i.e(il)) {
            if (hi0Var.d == null) {
                return p00.d;
            }
            p00 p00VarP = p(hi0Var, il, obj);
            if (p00VarP != p00.d) {
                this.u.getClass();
            }
            return p00VarP;
        }
        synchronized (this.g) {
            jgVar = this.s;
        }
        if (jgVar != null) {
            vf vfVar = jgVar.w;
            if (vfVar.ae && vfVar.az(hi0Var, obj)) {
                return p00.g;
            }
        }
        return p00.d;
    }

    public final void o() {
        jg jgVar;
        synchronized (this.g) {
            try {
                for (Object obj : this.i.f) {
                    hi0 hi0Var = obj instanceof hi0 ? (hi0) obj : null;
                    if (hi0Var != null && (jgVar = hi0Var.a) != null) {
                        jgVar.n(hi0Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], EDGE_INSN: B:82:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p00 p(hi0 hi0Var, Il il, Object obj) {
        int i;
        synchronized (this.g) {
            try {
                jg jgVar = this.s;
                jg jgVar2 = null;
                if (jgVar != null) {
                    sq0 sq0Var = this.i;
                    int i2 = this.t;
                    if (sq0Var.j) {
                        xf.c("Writer is active");
                    }
                    if (i2 < 0 || i2 >= sq0Var.e) {
                        xf.c("Invalid group index");
                    }
                    if (sq0Var.e(il)) {
                        int i3 = sq0Var.d[(i2 * 5) + 3] + i2;
                        int i4 = il.a;
                        if (i2 > i4 || i4 >= i3) {
                            jgVar = null;
                        }
                        jgVar2 = jgVar;
                    }
                }
                if (jgVar2 == null) {
                    vf vfVar = this.w;
                    if (vfVar.ae && vfVar.az(hi0Var, obj)) {
                        return p00.g;
                    }
                    if (obj == null) {
                        this.q.l(hi0Var, bw.an);
                    } else {
                        boolean z = obj instanceof km;
                        q80 q80Var = this.q;
                        if (z) {
                            Object objG = q80Var.g(hi0Var);
                            if (objG == null) {
                                i60.l(this.q, hi0Var, obj);
                            } else if (objG instanceof r80) {
                                r80 r80Var = (r80) objG;
                                Object[] objArr = r80Var.b;
                                long[] jArr = r80Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j & 255) < 128) {
                                                    i = i6;
                                                    if (objArr[(i5 << 3) + i8] == bw.an) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i6;
                                                }
                                                j >>= i;
                                                i8++;
                                                i6 = i;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    i60.l(this.q, hi0Var, obj);
                                }
                            } else if (objG == bw.an) {
                            }
                        } else {
                            q80Var.l(hi0Var, bw.an);
                        }
                    }
                }
                if (jgVar2 != null) {
                    return jgVar2.p(hi0Var, il, obj);
                }
                this.d.j(this);
                return this.w.ae ? p00.f : p00.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Object obj) {
        Object objG = this.j.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof r80;
        q80 q80Var = this.p;
        if (!z) {
            hi0 hi0Var = (hi0) objG;
            if (hi0Var.b(obj) == p00.g) {
                i60.l(q80Var, obj, hi0Var);
                return;
            }
            return;
        }
        r80 r80Var = (r80) objG;
        Object[] objArr = r80Var.b;
        long[] jArr = r80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        hi0 hi0Var2 = (hi0) objArr[(i << 3) + i3];
                        if (hi0Var2.b(obj) == p00.g) {
                            i60.l(q80Var, obj, hi0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Set set) {
        boolean z = set instanceof om0;
        q80 q80Var = this.m;
        q80 q80Var2 = this.j;
        if (z) {
            r80 r80Var = ((om0) set).d;
            Object[] objArr = r80Var.b;
            long[] jArr = r80Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (q80Var2.c(obj) || q80Var.c(obj)) {
                                    break loop0;
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
        } else {
            for (Object obj2 : set) {
                if (q80Var2.c(obj2) || q80Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        boolean zAq;
        synchronized (this.g) {
            j();
            try {
                q80 q80Var = this.q;
                this.q = i60.x();
                try {
                    vf vfVar = this.w;
                    wa waVar = vfVar.e;
                    if (!waVar.k.ap()) {
                        xf.c("Expected applyChanges() to have been called");
                    }
                    if (q80Var.e > 0 || !vfVar.r.isEmpty()) {
                        vfVar.o(q80Var, null);
                        zAq = waVar.k.aq();
                    } else {
                        zAq = false;
                    }
                    if (!zAq) {
                        k();
                    }
                } catch (Throwable th) {
                    this.q = q80Var;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.h.d.g()) {
                        da0 da0Var = this.v;
                        try {
                            da0Var.i(this.h, this.w.y());
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th3) {
                            da0Var.b();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
        return zAq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(om0 om0Var) {
        Object obj;
        while (true) {
            Object obj2 = this.f.get();
            if (obj2 == null || obj2.equals(t1.c)) {
                obj = om0Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, om0Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = om0Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.g) {
                    k();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object obj) {
        hi0 hi0VarW;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        vf vfVar = this.w;
        if (vfVar.z <= 0 && (hi0VarW = vfVar.w()) != null) {
            boolean z4 = true;
            int i3 = hi0VarW.b | 1;
            hi0VarW.b = i3;
            if ((i3 & 32) == 0) {
                l80 l80Var = hi0VarW.f;
                if (l80Var == null) {
                    l80Var = new l80();
                    hi0VarW.f = l80Var;
                }
                int i4 = hi0VarW.e;
                int iC = l80Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = l80Var.c[iC];
                }
                l80Var.b[iC] = obj;
                l80Var.c[iC] = i4;
                z = i == hi0VarW.e;
            }
            this.u.getClass();
            if (z) {
                return;
            }
            if (obj instanceof us0) {
                ((us0) obj).f(1);
            }
            i60.l(this.j, obj, hi0VarW);
            if (obj instanceof km) {
                km kmVar = (km) obj;
                jm jmVarH = kmVar.h();
                q80 q80Var = this.m;
                i60.aw(q80Var, obj);
                l80 l80Var2 = jmVarH.e;
                Object[] objArr = l80Var2.b;
                long[] jArr = l80Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    i2 = i6;
                                    ts0 ts0Var = (ts0) objArr[(i5 << 3) + i8];
                                    if (ts0Var instanceof us0) {
                                        z3 = true;
                                        ((us0) ts0Var).f(1);
                                    } else {
                                        z3 = true;
                                    }
                                    i60.l(q80Var, ts0Var, obj);
                                } else {
                                    z3 = z4;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                z4 = z3;
                                i6 = i2;
                            }
                            z2 = z4;
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z4 = z2;
                    }
                }
                Object obj2 = jmVarH.f;
                q80 q80Var2 = hi0VarW.g;
                if (q80Var2 == null) {
                    q80Var2 = new q80();
                    hi0VarW.g = q80Var2;
                }
                q80Var2.l(kmVar, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Object obj) {
        synchronized (this.g) {
            try {
                q(obj);
                Object objG = this.m.g(obj);
                if (objG != null) {
                    if (objG instanceof r80) {
                        r80 r80Var = (r80) objG;
                        Object[] objArr = r80Var.b;
                        long[] jArr = r80Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            q((km) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        q((km) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
