package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jw {
    public final kw a;
    public Outline f;
    public float j;
    public bd0 k;
    public t3 l;
    public t3 m;
    public boolean n;
    public ra o;
    public l3 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public em b = t1.d;
    public e20 c = e20.d;
    public x10 d = q0.ae;
    public final l1 e = new l1(14, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final b3 r = new b3();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public jw(kw kwVar) {
        this.a = kwVar;
        kwVar.t(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            kw kwVar = this.a;
            if (z || kwVar.ag() > 0.0f) {
                t3 t3Var = this.l;
                if (t3Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = t3Var instanceof t3;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    t3Var.a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || t3Var.a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(t3Var.a);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(t3Var.a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = t3Var;
                    if (outline != null) {
                        outline.setAlpha(kwVar.a());
                        outline2 = outline;
                    }
                    kwVar.k(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        kwVar.t(false);
                        kwVar.p();
                    } else {
                        kwVar.t(this.w);
                    }
                } else {
                    kwVar.t(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jAn = e00.an(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jAn = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jAn >> 32);
                    int i5 = (int) (jAn & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(kwVar.a());
                    kwVar.k(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                kwVar.t(false);
                kwVar.k(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.s && this.q == 0) {
            b3 b3Var = this.r;
            jw jwVar = (jw) b3Var.b;
            if (jwVar != null) {
                jwVar.e();
                b3Var.b = null;
            }
            r80 r80Var = (r80) b3Var.d;
            if (r80Var != null) {
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
                                    ((jw) objArr[(i << 3) + i3]).e();
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
                r80Var.b();
            }
            this.a.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [cv, x10] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(xo xoVar) {
        b3 b3Var = this.r;
        b3Var.c = (jw) b3Var.b;
        r80 r80Var = (r80) b3Var.d;
        if (r80Var != null && r80Var.h()) {
            r80 r80Var2 = (r80) b3Var.e;
            if (r80Var2 == null) {
                int i = nm0.a;
                r80Var2 = new r80();
                b3Var.e = r80Var2;
            }
            r80Var2.i(r80Var);
            r80Var.b();
        }
        b3Var.a = true;
        this.d.g(xoVar);
        b3Var.a = false;
        jw jwVar = (jw) b3Var.c;
        if (jwVar != null) {
            jwVar.e();
        }
        r80 r80Var3 = (r80) b3Var.e;
        if (r80Var3 == null || !r80Var3.h()) {
            return;
        }
        Object[] objArr = r80Var3.b;
        long[] jArr = r80Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((jw) objArr[(i2 << 3) + i4]).e();
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
        r80Var3.b();
    }

    public final bd0 d() {
        bd0 zc0Var;
        bd0 bd0Var = this.k;
        t3 t3Var = this.l;
        if (bd0Var != null) {
            return bd0Var;
        }
        if (t3Var != null) {
            yc0 yc0Var = new yc0(t3Var);
            this.k = yc0Var;
            return yc0Var;
        }
        long jAn = e00.an(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jAn = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAn >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jAn & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            zc0Var = new ad0(d41.i(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            zc0Var = new zc0(new ri0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = zc0Var;
        return zc0Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(float f, long j, long j2) {
        if (xa0.b(this.h, j) && pq0.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
