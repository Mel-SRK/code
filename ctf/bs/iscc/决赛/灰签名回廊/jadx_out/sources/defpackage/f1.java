package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.compose.foundation.gestures.a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements z9, hq, yr, uc0, hm0, vn0 {
    public final /* synthetic */ int d;
    public Object e;
    public Object f;

    public f1(int i) {
        this.d = i;
        switch (i) {
            case 3:
                break;
            case 9:
                this.e = bo0.m(Boolean.FALSE);
                break;
            case 11:
                this.e = new q80();
                this.f = new q80();
                break;
            case 12:
                this.e = new a90(new s20[16]);
                break;
            case 16:
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                break;
            case 19:
                this.e = new yf0(18);
                this.f = new r50(16);
                break;
            case 21:
                this.e = new a90(new Reference[16]);
                this.f = new ReferenceQueue();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.e = new bb(this);
                } else {
                    this.e = new bc(this);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void p(s20 s20Var) {
        if (s20Var.an > 0) {
            if (s20Var.ah.c == p20.h && !s20Var.l() && !s20Var.m() && !s20Var.ao && s20Var.af()) {
                i70 i70Var = (i70) s20Var.ag.j;
                if ((i70Var.g & 256) != 0) {
                    while (i70Var != null) {
                        if ((i70Var.f & 256) != 0) {
                            ?? M = i70Var;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof xv) {
                                    xv xvVar = (xv) M;
                                    xvVar.t(pk.aw(xvVar, 256));
                                } else if ((M.f & 256) != 0 && (M instanceof rl)) {
                                    i70 i70Var2 = ((rl) M).s;
                                    int i = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var2 != null) {
                                        if ((i70Var2.f & 256) != 0) {
                                            i++;
                                            a90Var = a90Var;
                                            if (i == 1) {
                                                M = i70Var2;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var2);
                                            }
                                        }
                                        i70Var2 = i70Var2.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                        if ((i70Var.g & 256) == 0) {
                            break;
                        } else {
                            i70Var = i70Var.i;
                        }
                    }
                }
            }
            s20Var.am = false;
            a90 a90VarU = s20Var.u();
            Object[] objArr = a90VarU.d;
            int i2 = a90VarU.f;
            for (int i3 = 0; i3 < i2; i3++) {
                p((s20) objArr[i3]);
            }
        }
    }

    @Override // defpackage.hq
    public Object a() {
        return (zz0) this.e;
    }

    @Override // defpackage.yr
    public Object b(zr zrVar, ji jiVar) {
        Object objB = ((hb) this.e).b(new es(new ti0(), zrVar, (ji0) this.f), jiVar);
        return objB == yj.d ? objB : wz0.a;
    }

    @Override // defpackage.z9
    public void d(View view, float[] fArr) {
        j60.d(fArr);
        s(view, fArr);
    }

    @Override // defpackage.uc0
    public List e(Integer num) {
        List listE = ((uc0) this.e).e(null);
        vq0 vq0Var = (vq0) this.f;
        int i = vq0Var.v;
        return i < 0 ? listE : kc.az(e00.o(vq0Var, num, i, Integer.valueOf(vq0Var.ac(vq0Var.b, i))), listE);
    }

    @Override // defpackage.vn0
    public int f(int i) {
        do {
            i = ((oe0) this.f).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i)));
        return i;
    }

    @Override // defpackage.vn0
    public int g(int i) {
        do {
            i = ((oe0) this.f).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.hm0
    public Object h(Object obj) {
        return ((cv) this.f).g(obj);
    }

    @Override // defpackage.hq
    public boolean i(CharSequence charSequence, int i, int i2, kz0 kz0Var) {
        if ((kz0Var.c & 4) > 0) {
            return true;
        }
        if (((zz0) this.e) == null) {
            this.e = new zz0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((n31) this.f).getClass();
        ((zz0) this.e).setSpan(new lz0(kz0Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.vn0
    public int j(int i) {
        CharSequence charSequence = (CharSequence) this.e;
        do {
            i = ((oe0) this.f).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.vn0
    public int k(int i) {
        do {
            i = ((oe0) this.f).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.hm0
    public Object l(ql0 ql0Var, Object obj) {
        return ((gv) this.e).f(ql0Var, obj);
    }

    public boolean m(long j) {
        Object obj;
        List list = (List) ((f1) this.f).e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (og0.a(((rg0) obj).a, j)) {
                break;
            }
            i++;
        }
        rg0 rg0Var = (rg0) obj;
        if (rg0Var != null) {
            return rg0Var.h;
        }
        return false;
    }

    public lw0 n(List list) {
        op opVar;
        Exception e;
        op opVar2;
        try {
            int size = list.size();
            int i = 0;
            opVar = null;
            while (i < size) {
                try {
                    opVar2 = (op) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    opVar2.a((pp) this.f);
                    i++;
                    opVar = opVar2;
                } catch (Exception e3) {
                    e = e3;
                    opVar = opVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((pp) this.f).a.b());
                    sb2.append(", composition=");
                    sb2.append(((pp) this.f).c());
                    sb2.append(", selection=");
                    pp ppVar = (pp) this.f;
                    sb2.append((Object) hx0.g(wo0.b(ppVar.b, ppVar.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    kc.au(list, sb, new h(2, opVar, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            pp ppVar2 = (pp) this.f;
            ppVar2.getClass();
            b6 b6Var = new b6(ppVar2.a.toString());
            pp ppVar3 = (pp) this.f;
            long jB = wo0.b(ppVar3.b, ppVar3.c);
            hx0 hx0Var = hx0.f(((lw0) this.e).b) ? null : new hx0(jB);
            lw0 lw0Var = new lw0(b6Var, hx0Var != null ? hx0Var.a : wo0.b(hx0.d(jB), hx0.e(jB)), ((pp) this.f).c());
            this.e = lw0Var;
            return lw0Var;
        } catch (Exception e4) {
            opVar = null;
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07aa A[LOOP:11: B:362:0x0789->B:374:0x07aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x07b5 A[EDGE_INSN: B:685:0x07b5->B:376:0x07b5 BREAK  A[LOOP:11: B:362:0x0789->B:374:0x07aa], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v93, types: [s20] */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95, types: [s20] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v89, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v91, types: [rq] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4, types: [k1] */
    /* JADX WARN: Type inference failed for: r9v40, types: [k1] */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ba o(int r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1.o(int):ba");
    }

    public p60 q() {
        return (p60) ((me0) this.f).getValue();
    }

    public sz r() {
        Matcher matcher = (Matcher) this.e;
        return i60.bb(matcher.start(), matcher.end());
    }

    public void s(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.e;
        Object parent = view.getParent();
        if (parent instanceof View) {
            s((View) parent, fArr);
            j60.d(fArr2);
            j60.f(fArr2, -view.getScrollX(), -view.getScrollY());
            t1.ap(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            j60.d(fArr2);
            j60.f(fArr2, left, top);
            t1.ap(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f;
            view.getLocationInWindow(iArr);
            j60.d(fArr2);
            j60.f(fArr2, -view.getScrollX(), -view.getScrollY());
            t1.ap(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            j60.d(fArr2);
            j60.f(fArr2, f, f2);
            t1.ap(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        az0.af(matrix, fArr2);
        t1.ap(fArr, fArr2);
    }

    public String toString() {
        switch (this.d) {
            case 22:
                return "Bounds{lower=" + ((iz) this.e) + " upper=" + ((iz) this.f) + "}";
            default:
                return super.toString();
        }
    }

    public f1(s20 s20Var, p60 p60Var) {
        this.d = 7;
        this.e = s20Var;
        this.f = bo0.m(p60Var);
    }

    public /* synthetic */ f1(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(hz hzVar) {
        this(9);
        this.d = 9;
        this.f = bo0.m(hzVar);
        bo0.m(hzVar);
    }

    public f1(WindowInsetsAnimation.Bounds bounds) {
        this.d = 22;
        this.e = iz.d(bounds.getLowerBound());
        this.f = iz.d(bounds.getUpperBound());
    }

    public f1(Matcher matcher, CharSequence charSequence) {
        this.d = 8;
        charSequence.getClass();
        this.e = matcher;
        this.f = charSequence;
    }

    public f1(bu buVar) {
        this.d = 2;
        this.e = buVar;
        this.f = a.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var) {
        this(0);
        this.d = 0;
        this.f = k1Var;
    }

    public f1(float[] fArr) {
        this.d = 1;
        this.e = fArr;
        this.f = new int[2];
    }
}
