package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class v80 extends xq0 {
    public static final int[] n = new int[0];
    public final cv e;
    public final cv f;
    public int g;
    public r80 h;
    public ArrayList i;
    public cr0 j;
    public int[] k;
    public int l;
    public boolean m;

    public v80(long j, cr0 cr0Var, cv cvVar, cv cvVar2) {
        super(j, cr0Var);
        this.e = cvVar;
        this.f = cvVar2;
        this.j = cr0.h;
        this.k = n;
        this.l = 1;
    }

    public final void aa(long j) {
        synchronized (fr0.c) {
            this.j = this.j.e(j);
        }
    }

    public void ab(r80 r80Var) {
        this.h = r80Var;
    }

    public v80 ac(cv cvVar, cv cvVar2) throws Throwable {
        if (this.c) {
            dh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        aa(g());
        Object obj = fr0.c;
        synchronized (obj) {
            try {
                long j = fr0.e;
                long j2 = 1;
                fr0.e = j + j2;
                fr0.d = fr0.d.e(j);
                cr0 cr0VarD = d();
                r(cr0VarD.e(j));
                try {
                    s90 s90Var = new s90(j, fr0.e(cr0VarD, g() + j2, j), fr0.l(cvVar, e(), true), fr0.b(cvVar2, i()), this);
                    if (this.m || this.c) {
                        return s90Var;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j3 = fr0.e;
                        fr0.e = j3 + j2;
                        s(j3);
                        fr0.d = fr0.d.e(g());
                    }
                    r(fr0.e(d(), jG + j2, g()));
                    return s90Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.xq0
    public final void b() {
        fr0.d = fr0.d.b(g()).a(this.j);
    }

    @Override // defpackage.xq0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (fr0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.xq0
    public boolean f() {
        return false;
    }

    @Override // defpackage.xq0
    public int h() {
        return this.g;
    }

    @Override // defpackage.xq0
    public cv i() {
        return this.f;
    }

    @Override // defpackage.xq0
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.xq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        if (this.l <= 0) {
            dh0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        r80 r80VarX = x();
        if (r80VarX != null) {
            if (this.m) {
                dh0.b("Unsupported operation on a snapshot that has been applied");
            }
            ab(null);
            long jG = g();
            Object[] objArr = r80VarX.b;
            long[] jArr = r80VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (vs0 vs0VarA = ((ts0) objArr[(i2 << 3) + i4]).a(); vs0VarA != null; vs0VarA = vs0VarA.b) {
                                    long j2 = vs0VarA.a;
                                    if (j2 == jG || kc.aq(this.j, Long.valueOf(j2))) {
                                        dr0 dr0Var = fr0.a;
                                        vs0VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.xq0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.xq0
    public void n(ts0 ts0Var) {
        r80 r80VarX = x();
        if (r80VarX == null) {
            int i = nm0.a;
            r80VarX = new r80();
            ab(r80VarX);
        }
        r80VarX.a(ts0Var);
    }

    @Override // defpackage.xq0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            fr0.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.xq0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.xq0
    public xq0 u(cv cvVar) throws Throwable {
        if (this.c) {
            dh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        aa(g());
        Object obj = fr0.c;
        synchronized (obj) {
            try {
                long j = fr0.e;
                long j2 = 1;
                fr0.e = j + j2;
                fr0.d = fr0.d.e(j);
                try {
                    t90 t90Var = new t90(j, fr0.e(d(), jG + j2, j), fr0.l(cvVar, e(), true), this);
                    if (this.m || this.c) {
                        return t90Var;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j3 = fr0.e;
                        fr0.e = j3 + j2;
                        s(j3);
                        fr0.d = fr0.d.e(g());
                    }
                    r(fr0.e(d(), jG2 + j2, g()));
                    return t90Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        aa(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (fr0.c) {
            long j2 = fr0.e;
            j = 1;
            fr0.e = j2 + j;
            s(j2);
            fr0.d = fr0.d.e(g());
        }
        r(fr0.e(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wo0 w() {
        HashMap mapC;
        ?? r3;
        r80 r80Var;
        long j;
        long j2;
        r80 r80VarX = x();
        if (r80VarX != null) {
            long j3 = fr0.j.b;
            mapC = fr0.c(j3, this, fr0.d.b(j3));
        } else {
            mapC = null;
        }
        rq rqVar = rq.d;
        synchronized (fr0.c) {
            try {
                fr0.d(this);
                if (r80VarX == null || r80VarX.d == 0) {
                    b();
                    dw dwVar = fr0.j;
                    r80 r80Var2 = dwVar.h;
                    fr0.v(dwVar, fr0.a);
                    if (r80Var2 == null || !r80Var2.h()) {
                        r3 = rqVar;
                        r80Var = null;
                    } else {
                        r3 = fr0.h;
                        r80Var = r80Var2;
                    }
                } else {
                    dw dwVar2 = fr0.j;
                    wo0 wo0VarZ = z(fr0.e, r80VarX, mapC, fr0.d.b(dwVar2.b));
                    if (!wo0VarZ.equals(zq0.a)) {
                        return wo0VarZ;
                    }
                    b();
                    r80Var = dwVar2.h;
                    fr0.v(dwVar2, fr0.a);
                    ab(null);
                    dwVar2.h = null;
                    r3 = fr0.h;
                }
                this.m = true;
                if (r80Var != null) {
                    om0 om0Var = new om0(r80Var);
                    if (!r80Var.g()) {
                        int size = r3.size();
                        for (int i = 0; i < size; i++) {
                            ((gv) r3.get(i)).f(om0Var, this);
                        }
                    }
                }
                if (r80VarX != null && r80VarX.h()) {
                    om0 om0Var2 = new om0(r80VarX);
                    int size2 = r3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((gv) r3.get(i2)).f(om0Var2, this);
                    }
                }
                synchronized (fr0.c) {
                    try {
                        p();
                        fr0.g();
                        if (r80Var != null) {
                            Object[] objArr = r80Var.b;
                            long[] jArr = r80Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                fr0.q((ts0) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (r80VarX != null) {
                            Object[] objArr2 = r80VarX.b;
                            long[] jArr2 = r80VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                fr0.q((ts0) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                fr0.q((ts0) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zq0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public r80 x() {
        return this.h;
    }

    @Override // defpackage.xq0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public cv e() {
        return this.e;
    }

    public final wo0 z(long j, r80 r80Var, HashMap map, cr0 cr0Var) {
        ArrayList arrayList;
        ArrayList arrayListAz;
        ArrayList arrayList2;
        cr0 cr0Var2;
        Object[] objArr;
        long[] jArr;
        cr0 cr0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        vs0 vs0VarB;
        cr0 cr0VarD = d().e(g()).d(this.j);
        Object[] objArr3 = r80Var.b;
        long[] jArr3 = r80Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListAz = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ts0 ts0Var = (ts0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            vs0 vs0VarA = ts0Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            vs0 vs0VarS = fr0.s(vs0VarA, j, cr0Var);
                            if (vs0VarS == null) {
                                cr0Var3 = cr0VarD;
                                arrayList3 = arrayListAz;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListAz;
                                j2 = j3;
                                vs0 vs0VarS2 = fr0.s(vs0VarA, g(), cr0VarD);
                                if (vs0VarS2 == null) {
                                    cr0Var3 = cr0VarD;
                                } else {
                                    cr0Var3 = cr0VarD;
                                    if (vs0VarS2.a != 1 && !vs0VarS.equals(vs0VarS2)) {
                                        vs0 vs0VarS3 = fr0.s(vs0VarA, g(), d());
                                        if (vs0VarS3 == null) {
                                            fr0.r();
                                            throw null;
                                        }
                                        if (map == null || (vs0VarB = (vs0) map.get(vs0VarS)) == null) {
                                            vs0VarB = ts0Var.b(vs0VarS2, vs0VarS, vs0VarS3);
                                        }
                                        if (vs0VarB == null) {
                                            return new yq0();
                                        }
                                        if (!vs0VarB.equals(vs0VarS3)) {
                                            if (vs0VarB.equals(vs0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new ae0(ts0Var, vs0VarS.b(g())));
                                                arrayListAz = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListAz.add(ts0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!vs0VarB.equals(vs0VarS2) ? new ae0(ts0Var, vs0VarB) : new ae0(ts0Var, vs0VarS2.b(g())));
                                            }
                                        }
                                        arrayListAz = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListAz = arrayList3;
                        } else {
                            cr0Var3 = cr0VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        cr0VarD = cr0Var3;
                    }
                    cr0Var2 = cr0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    cr0Var2 = cr0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                cr0VarD = cr0Var2;
            }
        } else {
            arrayList = null;
            arrayListAz = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ae0 ae0Var = (ae0) arrayList2.get(i5);
                ts0 ts0Var2 = (ts0) ae0Var.d;
                vs0 vs0Var = (vs0) ae0Var.e;
                vs0Var.a = j;
                synchronized (fr0.c) {
                    vs0Var.b = ts0Var2.a();
                    ts0Var2.c(vs0Var);
                }
            }
        }
        if (arrayListAz != null) {
            int size2 = arrayListAz.size();
            for (int i6 = 0; i6 < size2; i6++) {
                r80Var.k((ts0) arrayListAz.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListAz = kc.az(arrayList6, arrayListAz);
            }
            this.i = arrayListAz;
        }
        return zq0.a;
    }
}
