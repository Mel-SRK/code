package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.layout.b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jz extends d21 implements Runnable, db0, View.OnAttachStateChangeListener {
    public boolean f;
    public int g;
    public e31 h;
    public final q80 i;
    public final je0 j;
    public final m80 k;
    public final pr0 l;

    public jz() {
        super(1);
        q80 q80Var = new q80(9);
        k31.a.getClass();
        q80Var.l(j31.b, new u31("caption bar"));
        q80Var.l(j31.c, new u31("display cutout"));
        q80Var.l(j31.d, new u31("ime"));
        q80Var.l(j31.e, new u31("mandatory system gestures"));
        q80Var.l(j31.f, new u31("navigation bars"));
        q80Var.l(j31.g, new u31("status bars"));
        q80Var.l(j31.h, new u31("system gestures"));
        q80Var.l(j31.i, new u31("tappable element"));
        q80Var.l(j31.j, new u31("waterfall"));
        this.i = q80Var;
        this.j = new je0(0);
        this.k = new m80(4);
        this.l = new pr0();
    }

    @Override // defpackage.db0
    public final e31 a(View view, e31 e31Var) {
        if (this.f) {
            this.h = e31Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return e31Var;
            }
        } else if (this.g == 0) {
            f(e31Var);
        }
        return e31Var;
    }

    @Override // defpackage.d21
    public final void b(m21 m21Var) {
        boolean z = false;
        this.f = false;
        int iD = m21Var.a.d();
        this.g &= ~iD;
        this.h = null;
        k31 k31Var = (k31) b.c.b(iD);
        if (k31Var != null) {
            Object objG = this.i.g(k31Var);
            objG.getClass();
            u31 u31Var = (u31) objG;
            u31Var.c.h(0.0f);
            u31Var.e.h(1.0f);
            u31Var.d.h(0L);
            u31Var.c.h(0.0f);
            u31Var.b.setValue(Boolean.FALSE);
            u31Var.j = -1L;
            u31Var.k = -1L;
            je0 je0Var = this.j;
            je0Var.h(je0Var.g() + 1);
            synchronized (fr0.c) {
                r80 r80Var = fr0.j.h;
                if (r80Var != null) {
                    if (r80Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                fr0.a();
            }
        }
    }

    @Override // defpackage.d21
    public final void c(m21 m21Var) {
        this.f = true;
    }

    @Override // defpackage.d21
    public final e31 d(e31 e31Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m21 m21Var = (m21) list.get(i);
            k31 k31Var = (k31) b.c.b(m21Var.a.d());
            if (k31Var != null) {
                Object objG = this.i.g(k31Var);
                objG.getClass();
                u31 u31Var = (u31) objG;
                if (((Boolean) u31Var.b.getValue()).booleanValue()) {
                    l21 l21Var = m21Var.a;
                    u31Var.c.h(l21Var.c());
                    u31Var.e.h(l21Var.a());
                    u31Var.d.h(l21Var.b());
                }
            }
        }
        f(e31Var);
        return e31Var;
    }

    @Override // defpackage.d21
    public final f1 e(m21 m21Var, f1 f1Var) {
        e31 e31Var = this.h;
        boolean z = false;
        this.f = false;
        this.h = null;
        if (m21Var.a.b() > 0 && e31Var != null) {
            int iD = m21Var.a.d();
            this.g |= iD;
            k31 k31Var = (k31) b.c.b(iD);
            if (k31Var != null) {
                Object objG = this.i.g(k31Var);
                objG.getClass();
                u31 u31Var = (u31) objG;
                iz izVarF = e31Var.a.f(iD);
                long j = (((long) izVarF.a) << 48) | (((long) izVarF.b) << 32) | (((long) izVarF.c) << 16) | ((long) izVarF.d);
                long j2 = u31Var.h;
                if (!qo0.e(j, j2)) {
                    u31Var.j = j2;
                    u31Var.k = j;
                    u31Var.b.setValue(Boolean.TRUE);
                    l21 l21Var = m21Var.a;
                    u31Var.c.h(l21Var.c());
                    u31Var.e.h(l21Var.a());
                    u31Var.d.h(l21Var.b());
                    je0 je0Var = this.j;
                    je0Var.h(je0Var.g() + 1);
                    synchronized (fr0.c) {
                        r80 r80Var = fr0.j.h;
                        if (r80Var != null) {
                            if (r80Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        fr0.a();
                        return f1Var;
                    }
                }
            }
        }
        return f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e31 e31Var) {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long jD;
        boolean z4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i;
        e80 e80Var = b.a;
        int[] iArr5 = e80Var.b;
        Object[] objArr = e80Var.c;
        long[] jArr5 = e80Var.a;
        int length = jArr5.length - 2;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            z2 = false;
            z3 = false;
            c = 7;
            c2 = 16;
            c3 = ' ';
            while (true) {
                long j3 = jArr5[i3];
                c4 = '0';
                j = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr5[i6];
                            k31 k31Var = (k31) objArr[i6];
                            i = i2;
                            iz izVarF = e31Var.a.f(i7);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j4 = (((long) izVarF.b) << 32) | (((long) izVarF.a) << 48) | (((long) izVarF.c) << 16) | ((long) izVarF.d);
                            Object objG = this.i.g(k31Var);
                            objG.getClass();
                            u31 u31Var = (u31) objG;
                            if (!qo0.e(j4, u31Var.h)) {
                                u31Var.h = j4;
                                z2 = true;
                                if (!qo0.e(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i = i2;
                        }
                        j3 >>= i;
                        i5++;
                        i2 = i;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i2 = 8;
            }
        } else {
            c = 7;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            j = -9187201950435737472L;
            z = true;
            z2 = false;
            z3 = false;
        }
        e80 e80Var2 = b.c;
        int[] iArr6 = e80Var2.b;
        Object[] objArr2 = e80Var2.c;
        long[] jArr6 = e80Var2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr6[i8];
                if ((((~j5) << c) & j5 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr6[i11];
                            Object objG2 = this.i.g((k31) objArr2[i11]);
                            objG2.getClass();
                            u31 u31Var2 = (u31) objG2;
                            if (i12 != 8) {
                                iz izVarG = e31Var.a.g(i12);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j6 = (((long) izVarG.b) << c3) | (((long) izVarG.a) << c4) | (((long) izVarG.c) << c2) | ((long) izVarG.d);
                                if (!qo0.e(u31Var2.i, j6)) {
                                    u31Var2.i = j6;
                                    z2 = z;
                                    if (!qo0.e(j6, 0L)) {
                                        z3 = z2;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            u31Var2.a.setValue(Boolean.valueOf(e31Var.a.o(i12)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j5 >>= 8;
                        i10++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        ym ymVarE = e31Var.a.e();
        if (ymVarE == null) {
            j2 = 0;
        } else {
            iz izVarD = Build.VERSION.SDK_INT >= 30 ? iz.d(ax.b(ymVarE.a)) : iz.e;
            j2 = (((long) izVarD.a) << c4) | (((long) izVarD.b) << c3) | (((long) izVarD.c) << c2) | ((long) izVarD.d);
        }
        q80 q80Var = this.i;
        k31.a.getClass();
        Object objG3 = q80Var.g(j31.j);
        objG3.getClass();
        u31 u31Var3 = (u31) objG3;
        if (!qo0.e(u31Var3.h, j2)) {
            u31Var3.h = j2;
            u31Var3.i = j2;
            z2 = z;
            if (!qo0.e(j2, 0L)) {
                z3 = z2;
            }
        }
        if (ymVarE == null) {
            jD = 0;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            jD = ((long) (i13 >= 28 ? xm.d(ymVarE.a) : 0)) | (((long) (i13 >= 28 ? xm.g(ymVarE.a) : 0)) << c3) | (((long) (i13 >= 28 ? xm.e(ymVarE.a) : 0)) << c4) | (((long) (i13 >= 28 ? xm.f(ymVarE.a) : 0)) << c2);
        }
        Object objG4 = this.i.g(j31.c);
        objG4.getClass();
        u31 u31Var4 = (u31) objG4;
        if (!qo0.e(jD, u31Var4.h)) {
            u31Var4.h = jD;
            u31Var4.i = jD;
            z2 = z;
            if (!qo0.e(jD, 0L)) {
                z3 = z2;
            }
        }
        if (ymVarE == null) {
            m80 m80Var = this.k;
            if (m80Var.b > 0) {
                m80Var.c();
                this.l.clear();
                z2 = z;
            }
        } else {
            List listB = Build.VERSION.SDK_INT >= 28 ? xm.b(ymVarE.a) : Collections.EMPTY_LIST;
            int size = listB.size();
            m80 m80Var2 = this.k;
            if (size < m80Var2.b) {
                m80Var2.k(listB.size(), this.k.b);
                this.l.d(listB.size(), this.l.size());
                z2 = z;
            } else {
                int size2 = listB.size() - this.k.b;
                int i14 = 0;
                while (i14 < size2) {
                    m80 m80Var3 = this.k;
                    m80Var3.a(bo0.m(listB.get(m80Var3.b)));
                    this.l.add(new zy("display cutout rect " + this.k.b));
                    i14++;
                    z2 = z;
                }
            }
            int size3 = listB.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Rect rect = (Rect) listB.get(i15);
                w80 w80Var = (w80) this.k.e(i15);
                if (!f00.h(w80Var.getValue(), rect)) {
                    w80Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listB.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.j.g() != 0) && z2) {
            je0 je0Var = this.j;
            je0Var.h(je0Var.g() + 1);
            synchronized (fr0.c) {
                r80 r80Var = fr0.j.h;
                if (r80Var != null) {
                    boolean z5 = z;
                    z4 = r80Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                fr0.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = f11.a;
        a11.b(view, this);
        f11.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = f11.a;
        a11.b(view, null);
        f11.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.g = 0;
            this.f = false;
            e31 e31Var = this.h;
            if (e31Var != null) {
                f(e31Var);
                this.h = null;
            }
        }
    }
}
