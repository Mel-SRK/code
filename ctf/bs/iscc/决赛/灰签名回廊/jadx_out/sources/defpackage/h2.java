package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements gl, View.OnAttachStateChangeListener {
    public final b1 d;
    public final r0 e;
    public cz f;
    public final ArrayList g = new ArrayList();
    public final long h = 100;
    public e2 i = e2.d;
    public boolean j = true;
    public final o9 k = i60.a(1, 6, null);
    public final Handler l = new Handler(Looper.getMainLooper());
    public e80 m;
    public long n;
    public final e80 o;
    public vo0 p;
    public boolean q;
    public final m0 r;

    public h2(b1 b1Var, r0 r0Var) {
        this.d = b1Var;
        this.e = r0Var;
        e80 e80Var = oz.a;
        e80Var.getClass();
        this.m = e80Var;
        this.o = new e80();
        this.p = new vo0(b1Var.getSemanticsOwner().a(), e80Var);
        this.r = new m0(2, this);
    }

    @Override // defpackage.gl
    public final void a(u30 u30Var) {
        m(this.d.getSemanticsOwner().a());
        i();
        this.f = null;
    }

    @Override // defpackage.gl
    public final void b(u30 u30Var) {
        this.f = (cz) this.e.a();
        l(-1, this.d.getSemanticsOwner().a());
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ki r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.g2
            if (r0 == 0) goto L13
            r0 = r8
            g2 r0 = (defpackage.g2) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            g2 r0 = new g2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.j
            r2 = 2
            r3 = 1
            yj r4 = defpackage.yj.d
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            n9 r1 = r0.g
            defpackage.i60.az(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r8)
            r8 = 0
            return r8
        L33:
            n9 r1 = r0.g
            defpackage.i60.az(r8)
            goto L51
        L39:
            defpackage.i60.az(r8)
            o9 r8 = r7.k
            r8.getClass()
            n9 r1 = new n9
            r1.<init>(r8)
        L46:
            r0.g = r1
            r0.j = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L7e
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r1.c()
            boolean r8 = r7.h()
            if (r8 == 0) goto L65
            r7.i()
        L65:
            boolean r8 = r7.q
            if (r8 != 0) goto L72
            r7.q = r3
            android.os.Handler r8 = r7.l
            m0 r5 = r7.r
            r8.post(r5)
        L72:
            r0.g = r1
            r0.j = r2
            long r5 = r7.h
            java.lang.Object r8 = defpackage.t1.l(r5, r0)
            if (r8 != r4) goto L46
        L7e:
            return r4
        L7f:
            wz0 r8 = defpackage.wz0.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.e(ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.nz r34) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.f(nz):void");
    }

    public final nz g() {
        if (this.j) {
            this.j = false;
            this.m = t1.v(this.d.getSemanticsOwner());
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final void i() {
        cz czVar = this.f;
        if (czVar == null) {
            return;
        }
        Object obj = czVar.a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gh ghVar = (gh) arrayList.get(i);
            int iOrdinal = ghVar.c.ordinal();
            if (iOrdinal == 0) {
                n01 n01Var = ghVar.d;
                if (n01Var != null) {
                    ViewStructure viewStructure = (ViewStructure) n01Var.a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        ih.d(d0.g(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    wc.l();
                    return;
                }
                AutofillId autofillIdB = czVar.b(ghVar.a);
                if (autofillIdB != null && Build.VERSION.SDK_INT >= 29) {
                    ih.e(d0.g(obj), autofillIdB);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionG = d0.g(obj);
            m7 m7VarD = wn0.d(czVar.b);
            Objects.requireNonNull(m7VarD);
            ih.g(contentCaptureSessionG, ar.e(m7VarD.a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(uo0 uo0Var, vo0 vo0Var) {
        y1 y1Var = new y1(1, vo0Var, this);
        uo0Var.getClass();
        List listJ = uo0.j(4, uo0Var);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (g().a(((uo0) obj).g)) {
                y1Var.f(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = uo0.j(4, uo0Var);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            uo0 uo0Var2 = (uo0) listJ2.get(i3);
            nz nzVarG = g();
            int i4 = uo0Var2.g;
            if (nzVarG.a(i4)) {
                e80 e80Var = this.o;
                if (e80Var.a(i4)) {
                    Object objB = e80Var.b(i4);
                    if (objB == null) {
                        throw n5.f("node not present in pruned tree before this change");
                    }
                    j(uo0Var2, (vo0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(String str, int i) {
        cz czVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (czVar = this.f) != null) {
            AutofillId autofillIdB = czVar.b(i);
            if (autofillIdB == null) {
                throw n5.f("Invalid content capture ID");
            }
            if (i2 >= 29) {
                ih.f(d0.g(czVar.a), autofillIdB, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r19, defpackage.uo0 r20) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.l(int, uo0):void");
    }

    public final void m(uo0 uo0Var) {
        if (h()) {
            this.g.add(new gh(uo0Var.g, this.n, hh.e, null));
            List listJ = uo0.j(4, uo0Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                m((uo0) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r17 = this;
            r0 = r17
            e80 r1 = r0.o
            r1.c()
            nz r2 = r0.g()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            xo0 r13 = (defpackage.xo0) r13
            vo0 r15 = new vo0
            uo0 r13 = r13.a
            nz r6 = r0.g()
            r15.<init>(r13, r6)
            r1.g(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            vo0 r1 = new vo0
            b1 r2 = r0.d
            yo0 r2 = r2.getSemanticsOwner()
            uo0 r2 = r2.a()
            nz r3 = r0.g()
            r1.<init>(r2, r3)
            r0.p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.n():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l.removeCallbacks(this.r);
        this.f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
