package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class jk {
    public final b1 a;
    public final o6 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public lw0 j;
    public zw0 k;
    public ab0 l;
    public ri0 n;
    public ri0 o;
    public final Object c = new Object();
    public x10 m = q0.z;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = j60.a();
    public final Matrix r = new Matrix();

    public jk(b1 b1Var, o6 o6Var) {
        this.a = b1Var;
        this.b = o6Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, x20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [cv, x10] */
    public final void a() {
        View view;
        int iC;
        int iC2;
        o6 o6Var = this.b;
        ?? r2 = o6Var.b;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view2 = (View) o6Var.a;
        if (inputMethodManager.isActive(view2)) {
            ?? r3 = this.m;
            float[] fArr = this.q;
            r3.g(new j60(fArr));
            this.a.r(fArr);
            Matrix matrix = this.r;
            az0.ae(matrix, fArr);
            lw0 lw0Var = this.j;
            lw0Var.getClass();
            long j = lw0Var.b;
            ab0 ab0Var = this.l;
            ab0Var.getClass();
            zw0 zw0Var = this.k;
            zw0Var.getClass();
            y70 y70Var = zw0Var.b;
            ri0 ri0Var = this.n;
            ri0Var.getClass();
            float f = ri0Var.d;
            float f2 = ri0Var.b;
            ri0 ri0Var2 = this.o;
            ri0Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            hx0 hx0Var = lw0Var.c;
            int iE = hx0.e(j);
            builder.setSelectionRange(iE, hx0.d(j));
            oj0 oj0Var = oj0.e;
            if (!z || iE < 0) {
                view = view2;
            } else {
                int iD = ab0Var.d(iE);
                ri0 ri0VarC = zw0Var.c(iD);
                view = view2;
                float fS = i60.s(ri0VarC.a, 0.0f, (int) (zw0Var.c >> 32));
                boolean zU = az0.u(ri0Var, fS, ri0VarC.b);
                boolean zU2 = az0.u(ri0Var, fS, ri0VarC.d);
                boolean z5 = zw0Var.a(iD) == oj0Var;
                int i = (zU || zU2) ? 1 : 0;
                if (!zU || !zU2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = ri0VarC.b;
                float f4 = ri0VarC.d;
                builder.setInsertionMarkerLocation(fS, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iE2 = hx0Var != null ? hx0.e(hx0Var.a) : -1;
                int iD2 = hx0Var != null ? hx0.d(hx0Var.a) : -1;
                if (iE2 >= 0 && iE2 < iD2) {
                    builder2.setComposingText(iE2, lw0Var.a.e.subSequence(iE2, iD2));
                    int iD3 = ab0Var.d(iE2);
                    int iD4 = ab0Var.d(iD2);
                    float[] fArr2 = new float[(iD4 - iD3) * 4];
                    y70Var.a(wo0.b(iD3, iD4), fArr2);
                    while (iE2 < iD2) {
                        int iD5 = ab0Var.d(iE2);
                        int i2 = (iD5 - iD3) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iD2;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iE2;
                        int i5 = (ri0Var.a < f7 ? 1 : 0) & (f5 < ri0Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!az0.u(ri0Var, f5, f6) || !az0.u(ri0Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (zw0Var.a(iD5) == oj0Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iE2 = i4 + 1;
                        iD2 = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(av.h().setEditorBounds(pk.bf(ri0Var2)).setHandwritingBounds(pk.bf(ri0Var2)).build());
            }
            if (i6 >= 34 && z4 && !ri0Var.d() && (iC = y70Var.c(f2)) <= (iC2 = y70Var.c(f))) {
                while (true) {
                    builder2.addVisibleLineBounds(zw0Var.f(iC), y70Var.d(iC), zw0Var.g(iC), y70Var.b(iC));
                    if (iC == iC2) {
                        break;
                    } else {
                        iC++;
                    }
                }
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
