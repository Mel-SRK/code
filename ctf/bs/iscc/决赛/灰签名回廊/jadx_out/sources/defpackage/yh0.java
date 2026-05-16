package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yh0 {
    public final ArrayList a = new ArrayList();
    public final du0 b;
    public iz c;
    public iz d;
    public int e;
    public boolean f;

    public yh0(du0 du0Var, ArrayList arrayList) {
        iz izVar = iz.e;
        this.c = izVar;
        this.d = izVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = du0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            iz izVar2 = du0Var.c;
            iz izVar3 = du0Var.d;
            this.c = izVar2;
            this.d = izVar3;
            c();
            b(du0Var.e);
        }
        this.b = du0Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xc xcVar = (xc) list.get(i);
            xcVar.getClass();
            if (true == z) {
                yh0 yh0Var = xcVar.e;
                if (yh0Var != null) {
                    throw new IllegalStateException(xcVar + " is already controlled by " + yh0Var);
                }
                xcVar.e = this;
                this.a.add(xcVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xc xcVar = (xc) arrayList.get(size);
            if (!xcVar.g) {
                ColorDrawable colorDrawable = xcVar.f;
                if (xcVar.h != i) {
                    xcVar.h = i;
                    colorDrawable.setColor(i);
                    xh0 xh0Var = xcVar.b;
                    xh0Var.e = colorDrawable;
                    f1 f1Var = xh0Var.i;
                    if (f1Var != null) {
                        ((View) f1Var.f).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        iz izVarC;
        ArrayList arrayList = this.a;
        iz izVar = iz.e;
        iz izVarA = izVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xc xcVar = (xc) arrayList.get(size);
            iz izVar2 = this.c;
            iz izVar3 = this.d;
            xcVar.c = izVar2;
            xh0 xh0Var = xcVar.b;
            xcVar.d = izVar3;
            if (!xh0Var.c.equals(izVarA)) {
                xh0Var.c = izVarA;
                f1 f1Var = xh0Var.i;
                if (f1Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f1Var.e;
                    layoutParams.leftMargin = izVarA.a;
                    layoutParams.topMargin = izVarA.b;
                    layoutParams.rightMargin = izVarA.c;
                    layoutParams.bottomMargin = izVarA.d;
                    ((View) f1Var.f).setLayoutParams(layoutParams);
                }
            }
            int i2 = xcVar.a;
            if (i2 == 1) {
                i = xcVar.c.a;
                int i3 = xcVar.d.a;
                if (xh0Var.a != i3) {
                    xh0Var.a = i3;
                    f1 f1Var2 = xh0Var.i;
                    if (f1Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f1Var2.e;
                        layoutParams2.width = i3;
                        ((View) f1Var2.f).setLayoutParams(layoutParams2);
                    }
                }
                izVarC = iz.c(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = xcVar.c.b;
                int i4 = xcVar.d.b;
                if (xh0Var.b != i4) {
                    xh0Var.b = i4;
                    f1 f1Var3 = xh0Var.i;
                    if (f1Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f1Var3.e;
                        layoutParams3.height = i4;
                        ((View) f1Var3.f).setLayoutParams(layoutParams3);
                    }
                }
                izVarC = iz.c(0, i, 0, 0);
            } else if (i2 == 4) {
                i = xcVar.c.c;
                int i5 = xcVar.d.c;
                if (xh0Var.a != i5) {
                    xh0Var.a = i5;
                    f1 f1Var4 = xh0Var.i;
                    if (f1Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) f1Var4.e;
                        layoutParams4.width = i5;
                        ((View) f1Var4.f).setLayoutParams(layoutParams4);
                    }
                }
                izVarC = iz.c(0, 0, i, 0);
            } else if (i2 != 8) {
                izVarC = izVar;
                i = 0;
            } else {
                i = xcVar.c.d;
                int i6 = xcVar.d.d;
                if (xh0Var.b != i6) {
                    xh0Var.b = i6;
                    f1 f1Var5 = xh0Var.i;
                    if (f1Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) f1Var5.e;
                        layoutParams5.height = i6;
                        ((View) f1Var5.f).setLayoutParams(layoutParams5);
                    }
                }
                izVarC = iz.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (xh0Var.d != z) {
                xh0Var.d = z;
                f1 f1Var6 = xh0Var.i;
                if (f1Var6 != null) {
                    ((View) f1Var6.f).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            xcVar.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            xcVar.b(f);
            izVarA = iz.a(izVarA, izVarC);
        }
    }
}
