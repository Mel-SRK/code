package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class d30 {
    public final h3 a;
    public final cz b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public lw0 j;
    public zw0 k;
    public ab0 l;
    public ri0 m;
    public ri0 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = j60.a();
    public final Matrix q = new Matrix();

    public d30(h3 h3Var, cz czVar) {
        this.a = h3Var;
        this.b = czVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        cz czVar = this.b;
        InputMethodManager inputMethodManagerA = czVar.a();
        View view = czVar.b;
        if (inputMethodManagerA.isActive(view)) {
            float[] fArr = this.p;
            j60.d(fArr);
            d20 d20Var = (d20) this.a.l.u.getValue();
            if (d20Var != null) {
                if (!d20Var.af()) {
                    d20Var = null;
                }
                if (d20Var != null) {
                    d20Var.ag(fArr);
                }
            }
            ri0 ri0Var = this.n;
            ri0Var.getClass();
            float f = -ri0Var.a;
            ri0 ri0Var2 = this.n;
            ri0Var2.getClass();
            j60.f(fArr, f, -ri0Var2.b);
            Matrix matrix = this.q;
            az0.ae(matrix, fArr);
            lw0 lw0Var = this.j;
            lw0Var.getClass();
            long j = lw0Var.b;
            ab0 ab0Var = this.l;
            ab0Var.getClass();
            zw0 zw0Var = this.k;
            zw0Var.getClass();
            ri0 ri0Var3 = this.m;
            ri0Var3.getClass();
            ri0 ri0Var4 = this.n;
            ri0Var4.getClass();
            boolean z4 = this.f;
            boolean z5 = this.g;
            boolean z6 = this.h;
            boolean z7 = this.i;
            CursorAnchorInfo.Builder builder = this.o;
            builder.reset();
            builder.setMatrix(matrix);
            hx0 hx0Var = lw0Var.c;
            int iE = hx0.e(j);
            builder.setSelectionRange(iE, hx0.d(j));
            oj0 oj0Var = oj0.e;
            if (!z4 || iE < 0) {
                z = z5;
                z2 = z6;
            } else {
                int iD = ab0Var.d(iE);
                ri0 ri0VarC = zw0Var.c(iD);
                z = z5;
                z2 = z6;
                float fS = i60.s(ri0VarC.a, 0.0f, (int) (zw0Var.c >> 32));
                boolean zO = f00.o(ri0Var3, fS, ri0VarC.b);
                boolean zO2 = f00.o(ri0Var3, fS, ri0VarC.d);
                boolean z8 = zw0Var.a(iD) == oj0Var;
                int i = (zO || zO2) ? 1 : 0;
                if (!zO || !zO2) {
                    i |= 2;
                }
                if (z8) {
                    i |= 4;
                }
                float f2 = ri0VarC.b;
                float f3 = ri0VarC.d;
                builder.setInsertionMarkerLocation(fS, f2, f3, f3, i);
            }
            if (z) {
                int iE2 = hx0Var != null ? hx0.e(hx0Var.a) : -1;
                int iD2 = hx0Var != null ? hx0.d(hx0Var.a) : -1;
                if (iE2 < 0 || iE2 >= iD2) {
                    z3 = z7;
                } else {
                    builder.setComposingText(iE2, lw0Var.a.e.subSequence(iE2, iD2));
                    int iD3 = ab0Var.d(iE2);
                    int iD4 = ab0Var.d(iD2);
                    float[] fArr2 = new float[(iD4 - iD3) * 4];
                    z3 = z7;
                    zw0Var.b.a(wo0.b(iD3, iD4), fArr2);
                    while (iE2 < iD2) {
                        int iD5 = ab0Var.d(iE2);
                        int i2 = (iD5 - iD3) * 4;
                        float f4 = fArr2[i2];
                        float f5 = fArr2[i2 + 1];
                        int i3 = iD2;
                        float f6 = fArr2[i2 + 2];
                        float f7 = fArr2[i2 + 3];
                        int i4 = iD3;
                        int i5 = (ri0Var3.a < f6 ? 1 : 0) & (f4 < ri0Var3.c ? 1 : 0) & (ri0Var3.b < f7 ? 1 : 0) & (f5 < ri0Var3.d ? 1 : 0);
                        if (!f00.o(ri0Var3, f4, f5) || !f00.o(ri0Var3, f6, f7)) {
                            i5 |= 2;
                        }
                        if (zw0Var.a(iD5) == oj0Var) {
                            i5 |= 4;
                        }
                        int i6 = iE2;
                        builder.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                        iE2 = i6 + 1;
                        iD2 = i3;
                        iD3 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z2) {
                hk.a(builder, ri0Var4);
            }
            if (i7 >= 34 && z3) {
                ik.a(builder, zw0Var, ri0Var3);
            }
            czVar.a().updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
