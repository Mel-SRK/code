package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i30 {
    public final View a;
    public final cz b;
    public h30 e;
    public cw0 f;
    public i11 g;
    public Rect l;
    public final d30 m;
    public x10 c = q0.ah;
    public cv d = q0.ai;
    public lw0 h = new lw0("", hx0.b, 4);
    public ey i = ey.g;
    public final ArrayList j = new ArrayList();
    public final Object k = e00.ac(new b(13, this));

    public i30(View view, h3 h3Var, cz czVar) {
        this.a = view;
        this.b = czVar;
        this.m = new d30(h3Var, czVar);
    }

    public final oi0 a(EditorInfo editorInfo) {
        int i;
        int i2;
        lw0 lw0Var = this.h;
        String str = lw0Var.a.e;
        long j = lw0Var.b;
        ey eyVar = this.i;
        int i3 = eyVar.e;
        int i4 = eyVar.d;
        boolean z = eyVar.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                wc.q("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        u40.a.a(editorInfo, eyVar.f);
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                wc.q("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (eyVar.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = eyVar.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (eyVar.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = hx0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        m10.ar(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!it0.a || i4 == 7 || i4 == 8) {
            m10.as(editorInfo, false);
        } else {
            m10.as(editorInfo, true);
            qp.a.a(editorInfo);
        }
        e30 e30Var = f30.a;
        if (yp.d()) {
            yp.a().g(editorInfo);
        }
        oi0 oi0Var = new oi0(this.h, new bu(10, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(oi0Var));
        return oi0Var;
    }
}
