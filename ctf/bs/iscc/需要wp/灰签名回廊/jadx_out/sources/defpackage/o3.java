package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    public final s3 a;
    public final int b;
    public final long c;
    public final xw0 d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o3(defpackage.s3 r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3.<init>(s3, int, int, long):void");
    }

    public final xw0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        xf0 xf0Var;
        float fD = d();
        s3 s3Var = this.a;
        u4 u4Var = s3Var.g;
        int i8 = s3Var.l;
        i20 i20Var = s3Var.i;
        nx0 nx0Var = s3Var.b;
        p3 p3Var = q3.a;
        hg0 hg0Var = nx0Var.c;
        return new xw0(charSequence, fD, u4Var, i, truncateAt, i8, (hg0Var == null || (xf0Var = hg0Var.b) == null) ? false : xf0Var.a, i3, i5, i6, i7, i4, i2, i20Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Type inference failed for: r13v26, types: [e3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.ri0 r12, int r13, defpackage.wc r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3.c(ri0, int, wc):long");
    }

    public final float d() {
        return dh.h(this.c);
    }

    public final void e(oa oaVar) {
        Canvas canvasA = f0.a(oaVar);
        xw0 xw0Var = this.d;
        if (xw0Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = xw0Var.h;
        if (canvasA.getClipBounds(xw0Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            av0 av0Var = cx0.a;
            av0Var.a = canvasA;
            xw0Var.f.draw(av0Var);
            if (i != 0) {
                canvasA.translate(0.0f, (-1) * i);
            }
        }
        if (xw0Var.d) {
            canvasA.restore();
        }
    }

    public final void f(oa oaVar, long j, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        u4 u4Var = this.a.g;
        int i = u4Var.c;
        u4Var.d(j);
        u4Var.f(yp0Var);
        u4Var.g(bv0Var);
        u4Var.e(yoVar);
        u4Var.b(3);
        e(oaVar);
        u4Var.b(i);
    }

    public final void g(oa oaVar, i9 i9Var, float f, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        u4 u4Var = this.a.g;
        int i = u4Var.c;
        float fD = d();
        u4Var.c(i9Var, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        u4Var.f(yp0Var);
        u4Var.g(bv0Var);
        u4Var.e(yoVar);
        u4Var.b(3);
        e(oaVar);
        u4Var.b(i);
    }
}
