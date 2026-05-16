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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L69
            int r0 = r15.q
            if (r0 != 0) goto L69
            b3 r0 = r15.r
            java.lang.Object r1 = r0.b
            jw r1 = (defpackage.jw) r1
            if (r1 == 0) goto L16
            r1.e()
            r1 = 0
            r0.b = r1
        L16:
            java.lang.Object r0 = r0.d
            r80 r0 = (defpackage.r80) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            jw r11 = (defpackage.jw) r11
            r11.e()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.b()
        L64:
            kw r0 = r15.a
            r0.p()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [cv, x10] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.xo r15) {
        /*
            r14 = this;
            b3 r0 = r14.r
            java.lang.Object r1 = r0.b
            jw r1 = (defpackage.jw) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            r80 r1 = (defpackage.r80) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            r80 r2 = (defpackage.r80) r2
            if (r2 != 0) goto L23
            int r2 = defpackage.nm0.a
            r80 r2 = new r80
            r2.<init>()
            r0.e = r2
        L23:
            r2.i(r1)
            r1.b()
        L29:
            r1 = 1
            r0.a = r1
            x10 r1 = r14.d
            r1.g(r15)
            r15 = 0
            r0.a = r15
            java.lang.Object r1 = r0.c
            jw r1 = (defpackage.jw) r1
            if (r1 == 0) goto L3d
            r1.e()
        L3d:
            java.lang.Object r0 = r0.e
            r80 r0 = (defpackage.r80) r0
            if (r0 == 0) goto L90
            boolean r1 = r0.h()
            if (r1 == 0) goto L90
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8d
            r4 = r15
        L53:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L88
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6d:
            if (r9 >= r7) goto L86
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L82
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            jw r10 = (defpackage.jw) r10
            r10.e()
        L82:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6d
        L86:
            if (r7 != r8) goto L8d
        L88:
            if (r4 == r3) goto L8d
            int r4 = r4 + 1
            goto L53
        L8d:
            r0.b()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.c(xo):void");
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
