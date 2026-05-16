package defpackage;

import android.os.Build;
import android.os.Bundle;
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
    */
    public final Object e(ki kiVar) {
        g2 g2Var;
        n9 n9Var;
        if (kiVar instanceof g2) {
            g2Var = (g2) kiVar;
            int i = g2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2Var.j = i - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(this, kiVar);
            }
        }
        Object objB = g2Var.h;
        int i2 = g2Var.j;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(objB);
            o9 o9Var = this.k;
            o9Var.getClass();
            n9Var = new n9(o9Var);
        } else {
            if (i2 == 1) {
                n9Var = g2Var.g;
                i60.az(objB);
                if (((Boolean) objB).booleanValue()) {
                    return wz0.a;
                }
                n9Var.c();
                if (h()) {
                    i();
                }
                if (!this.q) {
                    this.q = true;
                    this.l.post(this.r);
                }
                g2Var.g = n9Var;
                g2Var.j = 2;
                if (t1.l(this.h, g2Var) != yjVar) {
                }
                return yjVar;
            }
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n9Var = g2Var.g;
            i60.az(objB);
        }
        g2Var.g = n9Var;
        g2Var.j = 1;
        objB = n9Var.b(g2Var);
        if (objB != yjVar) {
            if (((Boolean) objB).booleanValue()) {
            }
        }
        return yjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nz nzVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        nz nzVar2 = nzVar;
        int[] iArr3 = nzVar2.b;
        long[] jArr = nzVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        vo0 vo0Var = (vo0) this.o.b(i7);
                        xo0 xo0Var = (xo0) nzVar2.b(i7);
                        uo0 uo0Var = xo0Var != null ? xo0Var.a : null;
                        if (uo0Var == null) {
                            throw n5.f("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = uo0Var.g;
                        q80 q80Var = uo0Var.d.d;
                        if (vo0Var == null) {
                            Object[] objArr = q80Var.b;
                            long[] jArr2 = q80Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                cp0 cp0Var = (cp0) objArr[(i10 << 3) + i12];
                                                cp0 cp0Var2 = zo0.z;
                                                if (f00.h(cp0Var, cp0Var2)) {
                                                    Object objG = q80Var.g(cp0Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    k(String.valueOf(list != null ? (b6) kc.as(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = q80Var.b;
                            long[] jArr3 = q80Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                cp0 cp0Var3 = (cp0) objArr2[(i13 << 3) + i15];
                                                cp0 cp0Var4 = zo0.z;
                                                if (f00.h(cp0Var3, cp0Var4)) {
                                                    Object objG2 = vo0Var.a.d.g(cp0Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    b6 b6Var = list2 != null ? (b6) kc.as(list2) : null;
                                                    Object objG3 = q80Var.g(cp0Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    b6 b6Var2 = list3 != null ? (b6) kc.as(list3) : null;
                                                    if (!f00.h(b6Var, b6Var2)) {
                                                        k(String.valueOf(b6Var2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 == length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    nzVar2 = nzVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            nzVar2 = nzVar;
            iArr3 = iArr;
        }
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
    */
    public final void l(int i, uo0 uo0Var) {
        cv cvVar;
        int i2;
        m7 m7VarD;
        AutofillId autofillIdE;
        ri0 ri0VarA;
        n01 n01Var;
        cv cvVar2;
        if (h()) {
            q80 q80Var = uo0Var.d.d;
            Object objG = q80Var.g(zo0.ab);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.i == e2.d && f00.h(bool, Boolean.TRUE)) {
                Object objG2 = q80Var.g(oo0.k);
                if (objG2 == null) {
                    objG2 = null;
                }
                ah ahVar = (ah) objG2;
                if (ahVar != null && (cvVar2 = (cv) ahVar.b) != null) {
                }
            } else if (this.i == e2.e && f00.h(bool, Boolean.FALSE)) {
                Object objG3 = q80Var.g(oo0.k);
                if (objG3 == null) {
                    objG3 = null;
                }
                ah ahVar2 = (ah) objG3;
                if (ahVar2 != null && (cvVar = (cv) ahVar2.b) != null) {
                }
            }
            int i3 = uo0Var.g;
            cz czVar = this.f;
            if (czVar != null && (i2 = Build.VERSION.SDK_INT) >= 29 && (m7VarD = wn0.d(this.d)) != null) {
                uo0 uo0VarL = uo0Var.l();
                int i4 = uo0Var.g;
                if (uo0VarL != null) {
                    autofillIdE = czVar.b(uo0VarL.g);
                    if (autofillIdE == null) {
                        n01Var = null;
                    }
                } else {
                    autofillIdE = ar.e(m7VarD.a);
                }
                n01 n01Var2 = i2 >= 29 ? new n01(ih.c(d0.g(czVar.a), autofillIdE, i4)) : null;
                if (n01Var2 != null) {
                    ViewStructure viewStructure = (ViewStructure) n01Var2.a;
                    po0 po0Var = uo0Var.d;
                    cp0 cp0Var = zo0.ai;
                    q80 q80Var2 = po0Var.d;
                    if (!q80Var2.c(cp0Var)) {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.n);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = q80Var2.g(zo0.x);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i4, null, null, str);
                        }
                        Object objG5 = q80Var2.g(zo0.m);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = q80Var2.g(zo0.z);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(p40.a(list, "\n", null, 62));
                        }
                        Object objG7 = q80Var2.g(zo0.ad);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        b6 b6Var = (b6) objG7;
                        if (b6Var != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(b6Var);
                        }
                        Object objG8 = q80Var2.g(zo0.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(p40.a(list2, "\n", null, 62));
                        }
                        Object objG9 = q80Var2.g(zo0.w);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        if (((sk0) objG9) != null) {
                            viewStructure.setClassName("android.widget.Button");
                        }
                        zw0 zw0VarG = wn0.g(po0Var);
                        if (zw0VarG != null) {
                            yw0 yw0Var = zw0VarG.a;
                            nx0 nx0Var = yw0Var.b;
                            em emVar = yw0Var.g;
                            viewStructure.setTextStyle(emVar.k() * emVar.b() * qx0.c(nx0Var.a.b), 0, 0, 0);
                        }
                        fa0 fa0VarD = uo0Var.d();
                        if (fa0VarD == null) {
                            ri0VarA = ri0.e;
                            float f = ri0VarA.a;
                            float f2 = ri0VarA.b;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (ri0VarA.c - f), (int) (ri0VarA.d - f2));
                            n01Var = n01Var2;
                        } else {
                            fa0 fa0Var = fa0VarD.D().q ? fa0VarD : null;
                            if (fa0Var != null) {
                                ri0VarA = uo0Var.a(fa0Var);
                            }
                            float f3 = ri0VarA.a;
                            float f22 = ri0VarA.b;
                            viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (ri0VarA.c - f3), (int) (ri0VarA.d - f22));
                            n01Var = n01Var2;
                        }
                    }
                }
            }
            if (n01Var != null) {
                this.g.add(new gh(i3, this.n, hh.d, n01Var));
            }
            List listJ = uo0.j(4, uo0Var);
            int size = listJ.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listJ.get(i6);
                if (g().a(((uo0) obj).g)) {
                    l(i5, (uo0) obj);
                    i5++;
                }
            }
        }
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
    */
    public final void n() {
        e80 e80Var = this.o;
        e80Var.c();
        nz nzVarG = g();
        int[] iArr = nzVarG.b;
        Object[] objArr = nzVarG.c;
        long[] jArr = nzVarG.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            e80Var.g(iArr[i4], new vo0(((xo0) objArr[i4]).a, g()));
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
        this.p = new vo0(this.d.getSemanticsOwner().a(), g());
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
