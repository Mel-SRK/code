package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.gestures.a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
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
    */
    public ba o(int i) throws Throwable {
        Throwable th;
        k1 k1Var;
        b1 b1Var;
        c80 c80Var;
        q80 q80Var;
        uo0 uo0Var;
        bs0 bs0Var;
        s20 s20Var;
        Resources resources;
        ?? r32;
        ?? r7;
        ?? r0;
        ?? r2;
        int i2;
        k1 k1Var2;
        boolean z;
        ?? r9;
        Object objG;
        float f;
        b1 b1Var2;
        ba baVar;
        s20 s20Var2;
        ah ahVar;
        boolean z2;
        boolean zH;
        char c;
        boolean z3;
        boolean zBooleanValue;
        ?? arrayList;
        ?? arrayList2;
        int i3;
        boolean zH2;
        uo0 uo0Var2;
        ?? r92;
        p30 lifecycle;
        k1 k1Var3 = (k1) this.f;
        AccessibilityManager accessibilityManager = k1Var3.g;
        b1 b1Var3 = k1Var3.d;
        p0 viewTreeOwners = b1Var3.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : ((w30) lifecycle).c) == o30.d) {
            baVar = !accessibilityManager.isEnabled() ? new ba(AccessibilityNodeInfo.obtain()) : null;
            i2 = i;
            r92 = k1Var3;
        } else {
            xo0 xo0Var = (xo0) k1Var3.l().b(i);
            if (xo0Var == null) {
                if (!accessibilityManager.isEnabled()) {
                    baVar = new ba(AccessibilityNodeInfo.obtain());
                }
                i2 = i;
                r92 = k1Var3;
            } else {
                uo0 uo0Var3 = xo0Var.a;
                po0 po0VarK = uo0Var3.k();
                s20 s20Var3 = uo0Var3.c;
                po0 po0Var = uo0Var3.d;
                Object objG2 = po0VarK.d.g(zo0.n);
                if (objG2 == null) {
                    objG2 = null;
                }
                boolean zH3 = f00.h(objG2, Boolean.TRUE);
                if (!zH3) {
                    ?? Obtain = AccessibilityNodeInfo.obtain();
                    ba baVar2 = new ba(Obtain);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34) {
                        ak.g(Obtain, zH3);
                        th = null;
                    } else {
                        th = null;
                        baVar2.f(64, zH3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = b1Var3.getParentForAccessibility();
                        ?? r8 = parentForAccessibility instanceof View ? (View) parentForAccessibility : th;
                        baVar2.b = -1;
                        Obtain.setParent(r8);
                    } else {
                        uo0 uo0VarL = uo0Var3.l();
                        ?? ValueOf = uo0VarL != null ? Integer.valueOf(uo0VarL.g) : th;
                        if (ValueOf == 0) {
                            sy.c("semanticsNode " + i + " has null parent");
                            throw new xd();
                        }
                        int iIntValue = ValueOf.intValue();
                        if (iIntValue == b1Var3.getSemanticsOwner().a().g) {
                            iIntValue = -1;
                        }
                        baVar2.b = iIntValue;
                        Obtain.setParent(b1Var3, iIntValue);
                    }
                    baVar2.c = i;
                    Obtain.setSource(b1Var3, i);
                    Obtain.setBoundsInScreen(k1Var3.c(xo0Var));
                    c80 c80Var2 = k1Var3.am;
                    bs0 bs0Var2 = k1Var3.v;
                    Resources resources2 = b1Var3.getContext().getResources();
                    baVar2.g("android.view.View");
                    q80 q80Var2 = po0Var.d;
                    if (q80Var2.c(zo0.ad)) {
                        baVar2.g("android.widget.EditText");
                    }
                    if (q80Var2.c(zo0.z)) {
                        baVar2.g("android.widget.TextView");
                    }
                    Object objG3 = q80Var2.g(zo0.w);
                    if (objG3 == null) {
                        objG3 = th;
                    }
                    if (((sk0) objG3) != null && (uo0Var3.e || uo0.j(4, uo0Var3).isEmpty())) {
                        baVar2.g("android.widget.Button");
                    }
                    Obtain.setPackageName(b1Var3.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(t1.ah(uo0Var3));
                    boolean zE = i4 >= 34 ? ak.e(accessibilityManager) : true;
                    List listJ = uo0.j(4, uo0Var3);
                    int size = listJ.size();
                    boolean z4 = zE;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < size) {
                        int i7 = i5;
                        uo0 uo0Var4 = (uo0) listJ.get(i5);
                        List list = listJ;
                        nz nzVarL = k1Var3.l();
                        int i8 = size;
                        int i9 = uo0Var4.g;
                        if (nzVarL.a(i9)) {
                            if (b1Var3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(uo0Var4.c) != null) {
                                wc.c();
                                return null;
                            }
                            if (i9 != -1) {
                                xo0 xo0Var2 = (xo0) k1Var3.l().b(i9);
                                if (xo0Var2 == null || (uo0Var2 = xo0Var2.a) == null) {
                                    zH2 = false;
                                } else {
                                    Object objG4 = uo0Var2.k().d.g(zo0.n);
                                    if (objG4 == null) {
                                        objG4 = th;
                                    }
                                    zH2 = f00.h(objG4, Boolean.TRUE);
                                }
                                if (z4 || !zH2) {
                                    Obtain.addChild(b1Var3, i9);
                                }
                                c80Var2.f(i9, i6);
                                i6++;
                            }
                        }
                        i5 = i7 + 1;
                        listJ = list;
                        size = i8;
                    }
                    int i10 = k1Var3.n;
                    AccessibilityNodeInfo accessibilityNodeInfo = baVar2.a;
                    if (i == i10) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        baVar2.a(aw.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        baVar2.a(aw.c);
                    }
                    b6 b6VarAh = pk.ah(uo0Var3);
                    if (b6VarAh != null) {
                        b1Var3.getFontFamilyResolver();
                        em density = b1Var3.getDensity();
                        o6 o6Var = k1Var3.ai;
                        b1Var = b1Var3;
                        String str = b6VarAh.e;
                        bs0Var = bs0Var2;
                        List list2 = b6VarAh.d;
                        SpannableString spannableString = new SpannableString(str);
                        ArrayList arrayList3 = b6VarAh.f;
                        if (arrayList3 != null) {
                            int size2 = arrayList3.size();
                            s20Var = s20Var3;
                            int i11 = 0;
                            Obtain = Obtain;
                            while (i11 < size2) {
                                ArrayList arrayList4 = arrayList3;
                                a6 a6Var = (a6) arrayList3.get(i11);
                                int i12 = size2;
                                yr0 yr0Var = (yr0) a6Var.a;
                                int i13 = i11;
                                int i14 = a6Var.b;
                                int i15 = a6Var.c;
                                k1 k1Var4 = k1Var3;
                                long jB = yr0Var.a.b();
                                Resources resources3 = resources2;
                                ?? r322 = Obtain;
                                long j = yr0Var.b;
                                iu iuVar = yr0Var.c;
                                gu guVar = yr0Var.d;
                                ow0 ow0Var = yr0Var.j;
                                c80 c80Var3 = c80Var2;
                                t40 t40Var = yr0Var.k;
                                q80 q80Var3 = q80Var2;
                                uo0 uo0Var5 = uo0Var3;
                                long j2 = yr0Var.l;
                                bv0 bv0Var = yr0Var.m;
                                nw0 nw0Var = yr0Var.a;
                                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
                                q6.s(spannableString, (qc.c(jB, nw0Var.b()) ? nw0Var : jB != 16 ? new hd(jB) : mw0.a).b(), i14, i15);
                                SpannableString spannableString2 = spannableString;
                                q6.u(spannableString2, j, density, i14, i15);
                                if (iuVar == null && guVar == null) {
                                    i3 = 33;
                                } else {
                                    i3 = 33;
                                    spannableString2.setSpan(new StyleSpan(m10.w(iuVar == null ? iu.f : iuVar, guVar != null ? guVar.a : 0)), i14, i15, 33);
                                }
                                if (bv0Var != null) {
                                    int i16 = bv0Var.a;
                                    if ((i16 | 1) == i16) {
                                        spannableString2.setSpan(new UnderlineSpan(), i14, i15, i3);
                                    }
                                    if ((i16 | 2) == i16) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i14, i15, i3);
                                    }
                                }
                                if (ow0Var != null) {
                                    spannableString2.setSpan(new ScaleXSpan(ow0Var.a), i14, i15, i3);
                                }
                                q6.v(spannableString2, t40Var, i14, i15);
                                if (j2 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(m10.av(j2)), i14, i15, i3);
                                }
                                i11 = i13 + 1;
                                spannableString = spannableString2;
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                arrayList3 = arrayList4;
                                size2 = i12;
                                k1Var3 = k1Var4;
                                Obtain = r322;
                                resources2 = resources3;
                                c80Var2 = c80Var3;
                                uo0Var3 = uo0Var5;
                                q80Var2 = q80Var3;
                            }
                        } else {
                            s20Var = s20Var3;
                        }
                        k1Var = k1Var3;
                        c80Var = c80Var2;
                        q80Var = q80Var2;
                        uo0Var = uo0Var3;
                        resources = resources2;
                        r32 = Obtain;
                        SpannableString spannableString3 = spannableString;
                        r7 = accessibilityNodeInfo;
                        int length = str.length();
                        ?? arrayList5 = rq.d;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object obj = list2.get(i17);
                                a6 a6Var2 = (a6) obj;
                                if ((a6Var2.a instanceof s01) && d6.b(0, length, a6Var2.b, a6Var2.c)) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = arrayList5;
                        }
                        int size4 = arrayList.size();
                        for (int i18 = 0; i18 < size4; i18++) {
                            a6 a6Var3 = (a6) arrayList.get(i18);
                            s01 s01Var = (s01) a6Var3.a;
                            int i19 = a6Var3.b;
                            int i20 = a6Var3.c;
                            if (!(s01Var instanceof s01)) {
                                wc.l();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(s01Var.a).build(), i19, i20, 33);
                        }
                        int length2 = str.length();
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj2 = list2.get(i21);
                                a6 a6Var4 = (a6) obj2;
                                if ((a6Var4.a instanceof g01) && d6.b(0, length2, a6Var4.b, a6Var4.c)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = arrayList5;
                        }
                        int size6 = arrayList2.size();
                        for (int i22 = 0; i22 < size6; i22++) {
                            a6 a6Var5 = (a6) arrayList2.get(i22);
                            g01 g01Var = (g01) a6Var5.a;
                            int i23 = a6Var5.b;
                            int i24 = a6Var5.c;
                            WeakHashMap weakHashMap = (WeakHashMap) o6Var.a;
                            Object uRLSpan = weakHashMap.get(g01Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(g01Var.a);
                                weakHashMap.put(g01Var, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i23, i24, 33);
                        }
                        int length3 = str.length();
                        if (list2 != null) {
                            arrayList5 = new ArrayList(list2.size());
                            int size7 = list2.size();
                            for (int i25 = 0; i25 < size7; i25++) {
                                Object obj3 = list2.get(i25);
                                a6 a6Var6 = (a6) obj3;
                                if ((a6Var6.a instanceof k40) && d6.b(0, length3, a6Var6.b, a6Var6.c)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        int size8 = arrayList5.size();
                        for (int i26 = 0; i26 < size8; i26++) {
                            a6 a6Var7 = (a6) arrayList5.get(i26);
                            int i27 = a6Var7.b;
                            Object obj4 = a6Var7.a;
                            int i28 = a6Var7.c;
                            if (i27 != i28) {
                                k40 k40Var = (k40) obj4;
                                if (k40Var instanceof j40) {
                                    obj4.getClass();
                                    j40 j40Var = (j40) obj4;
                                    a6 a6Var8 = new a6(i27, i28, j40Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) o6Var.b;
                                    Object uRLSpan2 = weakHashMap2.get(a6Var8);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(j40Var.a);
                                        weakHashMap2.put(a6Var8, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i27, i28, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) o6Var.c;
                                    Object zeVar = weakHashMap3.get(a6Var7);
                                    if (zeVar == null) {
                                        zeVar = new ze(k40Var);
                                        weakHashMap3.put(a6Var7, zeVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) zeVar, i27, i28, 33);
                                }
                            }
                        }
                        r0 = (SpannableString) k1.ag(spannableString3);
                    } else {
                        k1Var = k1Var3;
                        b1Var = b1Var3;
                        c80Var = c80Var2;
                        q80Var = q80Var2;
                        uo0Var = uo0Var3;
                        bs0Var = bs0Var2;
                        s20Var = s20Var3;
                        resources = resources2;
                        r32 = Obtain;
                        r7 = accessibilityNodeInfo;
                        r0 = th;
                    }
                    r7.setText(r0);
                    cp0 cp0Var = zo0.aj;
                    q80 q80Var4 = q80Var;
                    if (q80Var4.c(cp0Var)) {
                        ?? r22 = r32;
                        r22.setContentInvalid(true);
                        Object objG5 = q80Var4.g(cp0Var);
                        if (objG5 == null) {
                            objG5 = th;
                        }
                        r22.setError((CharSequence) objG5);
                        r2 = r22;
                    } else {
                        r2 = r32;
                    }
                    Resources resources4 = resources;
                    uo0 uo0Var6 = uo0Var;
                    String strAg = pk.ag(uo0Var6, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        ax.g(r7, strAg);
                    } else {
                        r7.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strAg);
                    }
                    r2.setCheckable(pk.af(uo0Var6));
                    Object objG6 = q80Var4.g(zo0.ah);
                    if (objG6 == null) {
                        objG6 = th;
                    }
                    by0 by0Var = (by0) objG6;
                    if (by0Var != null) {
                        if (by0Var == by0.d) {
                            r7.setChecked(true);
                        } else if (by0Var == by0.e) {
                            r7.setChecked(false);
                        }
                    }
                    Object objG7 = q80Var4.g(zo0.ag);
                    if (objG7 == null) {
                        objG7 = th;
                    }
                    Boolean bool = (Boolean) objG7;
                    if (bool != null) {
                        r7.setChecked(bool.booleanValue());
                    }
                    if (!po0Var.f || uo0.j(4, uo0Var6).isEmpty()) {
                        Object objG8 = q80Var4.g(zo0.a);
                        if (objG8 == null) {
                            objG8 = th;
                        }
                        List list3 = (List) objG8;
                        r2.setContentDescription(list3 != null ? (String) kc.as(list3) : th);
                    }
                    Object objG9 = q80Var4.g(zo0.x);
                    if (objG9 == null) {
                        objG9 = th;
                    }
                    String str2 = (String) objG9;
                    if (str2 != null) {
                        uo0 uo0VarL2 = uo0Var6;
                        while (true) {
                            if (uo0VarL2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            po0 po0Var2 = uo0VarL2.d;
                            cp0 cp0Var2 = ap0.a;
                            if (po0Var2.d.c(cp0Var2)) {
                                zBooleanValue = ((Boolean) po0Var2.b(cp0Var2)).booleanValue();
                                break;
                            }
                            uo0VarL2 = uo0VarL2.l();
                        }
                        if (zBooleanValue) {
                            r2.setViewIdResourceName(str2);
                        }
                    }
                    Object objG10 = q80Var4.g(zo0.h);
                    if (objG10 == null) {
                        objG10 = th;
                    }
                    char c2 = 2;
                    if (((wz0) objG10) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            r7.setHeading(true);
                        } else {
                            baVar2.f(2, true);
                        }
                    }
                    i2 = i;
                    if (i2 != -1) {
                        int iD = c80Var.d(uo0Var6.g);
                        if (iD != -1) {
                            r2.setDrawingOrder(iD);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r2.setPassword(q80Var4.c(zo0.ai));
                    r2.setEditable(q80Var4.c(zo0.ak));
                    Object objG11 = q80Var4.g(zo0.al);
                    if (objG11 == null) {
                        objG11 = th;
                    }
                    Integer num = (Integer) objG11;
                    r2.setMaxTextLength(num != null ? num.intValue() : -1);
                    r2.setEnabled(pk.k(uo0Var6));
                    cp0 cp0Var3 = zo0.k;
                    r2.setFocusable(q80Var4.c(cp0Var3));
                    if (r2.isFocusable()) {
                        r2.setFocused(((Boolean) po0Var.b(cp0Var3)).booleanValue());
                        if (r2.isFocused()) {
                            r7.addAction(2);
                            k1 k1Var5 = k1Var;
                            k1Var5.o = i2;
                            k1Var2 = k1Var5;
                        } else {
                            r9 = k1Var;
                            z = true;
                            r7.addAction(1);
                            r2.setVisibleToUser(t1.ag(uo0Var6) ^ z);
                            objG = q80Var4.g(zo0.j);
                            if (objG == null) {
                                objG = th;
                            }
                            if (objG == null) {
                                wc.c();
                                return null;
                            }
                            r7.setClickable(false);
                            Object objG12 = q80Var4.g(oo0.b);
                            if (objG12 == null) {
                                objG12 = th;
                            }
                            ah ahVar2 = (ah) objG12;
                            if (ahVar2 != null) {
                                Object objG13 = q80Var4.g(zo0.ag);
                                if (objG13 == null) {
                                    objG13 = th;
                                }
                                f00.h(objG13, Boolean.TRUE);
                                r7.setClickable(true);
                                if (pk.k(uo0Var6) && r2.isClickable()) {
                                    baVar2.a(new aw(ahVar2.a, 16));
                                }
                            }
                            r7.setLongClickable(false);
                            ah ahVar3 = (ah) qo0.g(po0Var, oo0.c);
                            if (ahVar3 != null) {
                                r7.setLongClickable(true);
                                if (pk.k(uo0Var6)) {
                                    baVar2.a(new aw(ahVar3.a, 32));
                                }
                            }
                            ah ahVar4 = (ah) qo0.g(po0Var, oo0.o);
                            if (ahVar4 != null) {
                                baVar2.a(new aw(ahVar4.a, 16384));
                            }
                            if (pk.k(uo0Var6)) {
                                ah ahVar5 = (ah) qo0.g(po0Var, oo0.i);
                                if (ahVar5 != null) {
                                    baVar2.a(new aw(ahVar5.a, 2097152));
                                }
                                ah ahVar6 = (ah) qo0.g(po0Var, oo0.n);
                                if (ahVar6 != null) {
                                    baVar2.a(new aw(ahVar6.a, R.id.accessibilityActionImeEnter));
                                }
                                ah ahVar7 = (ah) qo0.g(po0Var, oo0.p);
                                if (ahVar7 != null) {
                                    baVar2.a(new aw(ahVar7.a, 65536));
                                }
                                ah ahVar8 = (ah) qo0.g(po0Var, oo0.q);
                                if (ahVar8 != null && r2.isFocused()) {
                                    ClipDescription primaryClipDescription = b1Var.getClipboardManager().a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        baVar2.a(new aw(ahVar8.a, 32768));
                                    }
                                }
                            }
                            String strM = k1.m(uo0Var6);
                            if (!(strM == null || strM.length() == 0)) {
                                r2.setTextSelection(r9.k(uo0Var6), r9.j(uo0Var6));
                                ah ahVar9 = (ah) qo0.g(po0Var, oo0.h);
                                baVar2.a(new aw(ahVar9 != null ? ahVar9.a : th, 131072));
                                r7.addAction(256);
                                r7.addAction(512);
                                r7.setMovementGranularities(11);
                                List list4 = (List) qo0.g(po0Var, zo0.a);
                                if ((list4 == null || list4.isEmpty()) && q80Var4.c(oo0.a)) {
                                    if (!q80Var4.c(zo0.ad) || f00.h(qo0.g(po0Var, cp0Var3), Boolean.TRUE)) {
                                        ?? Q = s20Var.q();
                                        while (true) {
                                            if (Q == 0) {
                                                Q = th;
                                                break;
                                            }
                                            po0 po0VarS = Q.s();
                                            if (po0VarS != null) {
                                                c = c2;
                                                if (po0VarS.f) {
                                                    z3 = po0VarS.d.c(zo0.ad);
                                                    if (!z3) {
                                                        break;
                                                    }
                                                    c2 = c;
                                                    Q = Q.q();
                                                }
                                            } else {
                                                c = c2;
                                            }
                                            if (!z3) {
                                            }
                                        }
                                        if (Q != 0) {
                                            po0 po0VarS2 = Q.s();
                                            if (po0VarS2 != null) {
                                                Object objG14 = po0VarS2.d.g(cp0Var3);
                                                if (objG14 == null) {
                                                    objG14 = th;
                                                }
                                                zH = f00.h(objG14, Boolean.TRUE);
                                            } else {
                                                zH = false;
                                            }
                                            if (!zH) {
                                            }
                                            if (!z2) {
                                                r7.setMovementGranularities(r2.getMovementGranularities() | 20);
                                            }
                                        }
                                        z2 = false;
                                        if (!z2) {
                                        }
                                    }
                                    z2 = true;
                                    if (!z2) {
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.add("androidx.compose.ui.semantics.id");
                                    CharSequence charSequenceE = baVar2.e();
                                    if (!(charSequenceE == null || charSequenceE.length() == 0) && q80Var4.c(oo0.a)) {
                                        arrayList6.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (q80Var4.c(zo0.x)) {
                                        arrayList6.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (q80Var4.c(zo0.am)) {
                                        arrayList6.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList6.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList6.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList6.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        r2.setAvailableExtraData(arrayList6);
                                    }
                                }
                                vh0 vh0Var = (vh0) qo0.g(po0Var, zo0.c);
                                float f2 = 0.0f;
                                if (vh0Var != null) {
                                    cp0 cp0Var4 = oo0.g;
                                    if (q80Var4.c(cp0Var4)) {
                                        baVar2.g("android.widget.SeekBar");
                                    } else {
                                        baVar2.g("android.widget.ProgressBar");
                                    }
                                    if (vh0Var != vh0.b) {
                                        r2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                    }
                                    if (q80Var4.c(cp0Var4)) {
                                        pk.k(uo0Var6);
                                    }
                                }
                                if (pk.k(uo0Var6) && (ahVar = (ah) qo0.g(po0Var, oo0.g)) != null) {
                                    baVar2.a(new aw(ahVar.a, R.id.accessibilityActionSetProgress));
                                }
                                e00.ai(uo0Var6, baVar2);
                                Object objG15 = uo0Var6.k().d.g(zo0.g);
                                if (objG15 == null) {
                                    objG15 = null;
                                }
                                if (objG15 == null) {
                                    uo0 uo0VarL3 = uo0Var6.l();
                                    if (uo0VarL3 == null) {
                                        f = 0.0f;
                                    } else {
                                        Object objG16 = uo0VarL3.k().d.g(zo0.e);
                                        if (objG16 == null) {
                                            objG16 = null;
                                        }
                                        if (objG16 != null) {
                                            Object objG17 = uo0VarL3.k().d.g(zo0.f);
                                            if ((objG17 != null ? objG17 : null) != null) {
                                                f = 0.0f;
                                                wc.c();
                                            } else if (uo0Var6.k().d.c(zo0.ag)) {
                                                ArrayList arrayList7 = new ArrayList();
                                                List listJ2 = uo0.j(4, uo0VarL3);
                                                int size9 = listJ2.size();
                                                int i29 = 0;
                                                int i30 = 0;
                                                while (i29 < size9) {
                                                    float f3 = f2;
                                                    uo0 uo0Var7 = (uo0) listJ2.get(i29);
                                                    if (uo0Var7.k().d.c(zo0.ag)) {
                                                        arrayList7.add(uo0Var7);
                                                        if (uo0Var7.c.r() < uo0Var6.c.r()) {
                                                            i30++;
                                                        }
                                                    }
                                                    i29++;
                                                    f2 = f3;
                                                }
                                                f = f2;
                                                if (!arrayList7.isEmpty()) {
                                                    boolean zP = e00.p(arrayList7);
                                                    int i31 = zP ? 0 : i30;
                                                    int i32 = zP ? i30 : 0;
                                                    Object objG18 = uo0Var6.k().d.g(zo0.ag);
                                                    if (objG18 == null) {
                                                        objG18 = Boolean.FALSE;
                                                    }
                                                    baVar2.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i31, 1, i32, 1, false, ((Boolean) objG18).booleanValue()));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    f = 0.0f;
                                    wc.c();
                                }
                                qm0 qm0Var = (qm0) qo0.g(po0Var, zo0.t);
                                ah ahVar10 = (ah) qo0.g(po0Var, oo0.d);
                                if (qm0Var != null && ahVar10 != null) {
                                    Object objG19 = uo0Var6.k().d.g(zo0.f);
                                    if (objG19 == null) {
                                        objG19 = th;
                                    }
                                    if (objG19 == null) {
                                        Object objG20 = uo0Var6.k().d.g(zo0.e);
                                        if (objG20 == null) {
                                            objG20 = th;
                                        }
                                        boolean z5 = objG20 != null;
                                        if (!z5) {
                                            baVar2.g("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) qm0Var.b.a()).floatValue() > f) {
                                            r7.setScrollable(true);
                                        }
                                        if (pk.k(uo0Var6)) {
                                            boolean zR = k1.r(qm0Var);
                                            e20 e20Var = e20.e;
                                            if (zR) {
                                                baVar2.a(aw.e);
                                                s20Var2 = s20Var;
                                                baVar2.a(!(s20Var2.aa == e20Var) ? aw.j : aw.h);
                                            } else {
                                                s20Var2 = s20Var;
                                            }
                                            if (k1.q(qm0Var)) {
                                                baVar2.a(aw.f);
                                                baVar2.a(!(s20Var2.aa == e20Var) ? aw.h : aw.j);
                                            }
                                        }
                                    }
                                }
                                qm0 qm0Var2 = (qm0) qo0.g(po0Var, zo0.u);
                                if (qm0Var2 != null && ahVar10 != null) {
                                    Object objG21 = uo0Var6.k().d.g(zo0.f);
                                    if (objG21 == null) {
                                        objG21 = th;
                                    }
                                    if (objG21 == null) {
                                        Object objG22 = uo0Var6.k().d.g(zo0.e);
                                        if (objG22 == null) {
                                            objG22 = th;
                                        }
                                        boolean z6 = objG22 != null;
                                        if (!z6) {
                                            baVar2.g("android.widget.ScrollView");
                                        }
                                        if (((Number) qm0Var2.b.a()).floatValue() > f) {
                                            r7.setScrollable(true);
                                        }
                                        if (pk.k(uo0Var6)) {
                                            if (k1.r(qm0Var2)) {
                                                baVar2.a(aw.e);
                                                baVar2.a(aw.i);
                                            }
                                            if (k1.q(qm0Var2)) {
                                                baVar2.a(aw.f);
                                                baVar2.a(aw.g);
                                            }
                                        }
                                    }
                                }
                                int i33 = Build.VERSION.SDK_INT;
                                if (i33 >= 29) {
                                    po0 po0Var3 = uo0Var6.d;
                                    q80 q80Var5 = po0Var3.d;
                                    Object objG23 = po0Var3.d.g(zo0.w);
                                    if (objG23 == null) {
                                        objG23 = null;
                                    }
                                    if (pk.k(uo0Var6)) {
                                        Object objG24 = q80Var5.g(oo0.w);
                                        if (objG24 == null) {
                                            objG24 = null;
                                        }
                                        ah ahVar11 = (ah) objG24;
                                        if (ahVar11 != null) {
                                            baVar2.a(new aw(null, R.id.accessibilityActionPageUp, ahVar11.a, null));
                                        }
                                        Object objG25 = q80Var5.g(oo0.y);
                                        if (objG25 == null) {
                                            objG25 = null;
                                        }
                                        ah ahVar12 = (ah) objG25;
                                        if (ahVar12 != null) {
                                            baVar2.a(new aw(null, R.id.accessibilityActionPageDown, ahVar12.a, null));
                                        }
                                        Object objG26 = q80Var5.g(oo0.x);
                                        if (objG26 == null) {
                                            objG26 = null;
                                        }
                                        ah ahVar13 = (ah) objG26;
                                        if (ahVar13 != null) {
                                            baVar2.a(new aw(null, R.id.accessibilityActionPageLeft, ahVar13.a, null));
                                        }
                                        Object objG27 = q80Var5.g(oo0.z);
                                        if (objG27 == null) {
                                            objG27 = null;
                                        }
                                        ah ahVar14 = (ah) objG27;
                                        if (ahVar14 != null) {
                                            baVar2.a(new aw(null, R.id.accessibilityActionPageRight, ahVar14.a, null));
                                        }
                                    }
                                }
                                CharSequence charSequence = (CharSequence) qo0.g(po0Var, zo0.d);
                                if (i33 >= 28) {
                                    r7.setPaneTitle(charSequence);
                                } else {
                                    r7.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (pk.k(uo0Var6)) {
                                    ah ahVar15 = (ah) qo0.g(po0Var, oo0.r);
                                    if (ahVar15 != null) {
                                        baVar2.a(new aw(ahVar15.a, 262144));
                                    }
                                    ah ahVar16 = (ah) qo0.g(po0Var, oo0.s);
                                    if (ahVar16 != null) {
                                        baVar2.a(new aw(ahVar16.a, 524288));
                                    }
                                    ah ahVar17 = (ah) qo0.g(po0Var, oo0.t);
                                    if (ahVar17 != null) {
                                        baVar2.a(new aw(ahVar17.a, 1048576));
                                    }
                                    cp0 cp0Var5 = oo0.v;
                                    po0Var.getClass();
                                    if (po0Var.d.c(oo0.v)) {
                                        List list5 = (List) po0Var.b(cp0Var5);
                                        int size10 = list5.size();
                                        d80 d80Var = k1.aq;
                                        if (size10 >= d80Var.b) {
                                            throw new IllegalStateException("Can't have more than " + d80Var.b + " custom actions for one widget");
                                        }
                                        bs0 bs0Var3 = new bs0();
                                        l80 l80VarA = sa0.a();
                                        bs0 bs0Var4 = bs0Var;
                                        if (e00.m(bs0Var4.d, bs0Var4.f, i2) >= 0) {
                                            l80 l80Var = (l80) bs0Var4.b(i2);
                                            int[] iArr = d80Var.a;
                                            int i34 = d80Var.b;
                                            int[] iArrCopyOf = new int[16];
                                            int i35 = 0;
                                            int i36 = 0;
                                            while (i35 < i34) {
                                                int i37 = iArr[i35];
                                                int i38 = i34;
                                                int i39 = i36 + 1;
                                                l80 l80Var2 = l80Var;
                                                if (iArrCopyOf.length < i39) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i39, (iArrCopyOf.length * 3) / 2));
                                                }
                                                iArrCopyOf[i36] = i37;
                                                i35++;
                                                i36 = i39;
                                                i34 = i38;
                                                l80Var = l80Var2;
                                            }
                                            l80 l80Var3 = l80Var;
                                            ArrayList arrayList8 = new ArrayList();
                                            if (list5.size() > 0) {
                                                n5.m(list5.get(0));
                                                l80Var3.getClass();
                                                throw th;
                                            }
                                            if (arrayList8.size() > 0) {
                                                n5.m(arrayList8.get(0));
                                                if (i36 <= 0) {
                                                    wc.g("Index must be between 0 and size");
                                                    return null;
                                                }
                                                int i40 = iArrCopyOf[0];
                                                throw th;
                                            }
                                        } else if (list5.size() > 0) {
                                            n5.m(list5.get(0));
                                            d80Var.c(0);
                                            throw th;
                                        }
                                        r9.u.c(i2, bs0Var3);
                                        bs0Var4.c(i2, l80VarA);
                                    }
                                }
                                boolean zL = pk.l(uo0Var6, resources4);
                                if (Build.VERSION.SDK_INT >= 28) {
                                    r7.setScreenReaderFocusable(zL);
                                } else {
                                    baVar2.f(1, zL);
                                }
                                int iD2 = r9.ae.d(i2);
                                if (iD2 != -1) {
                                    wn0.l(b1Var.getAndroidViewsHandler$ui_release(), iD2);
                                    b1Var2 = b1Var;
                                    baVar2.a.setTraversalBefore(b1Var2, iD2);
                                    r9.b(i2, baVar2, r9.ag, th);
                                } else {
                                    b1Var2 = b1Var;
                                }
                                int iD3 = r9.af.d(i2);
                                if (iD3 != -1) {
                                    wn0.l(b1Var2.getAndroidViewsHandler$ui_release(), iD3);
                                }
                                String str3 = (String) qo0.g(po0Var, ap0.b);
                                if (str3 != null) {
                                    baVar2.g(str3);
                                }
                                baVar = baVar2;
                                r92 = r9;
                            }
                        }
                    } else {
                        k1Var2 = k1Var;
                    }
                    z = true;
                    r9 = k1Var2;
                    r2.setVisibleToUser(t1.ag(uo0Var6) ^ z);
                    objG = q80Var4.g(zo0.j);
                    if (objG == null) {
                    }
                    if (objG == null) {
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? ak.e(accessibilityManager) : true)) {
                    i2 = i;
                    r92 = k1Var3;
                    baVar = null;
                }
            }
        }
        if (r92.r) {
            if (i2 == r92.n) {
                r92.p = baVar;
            }
            if (i2 == r92.o) {
                r92.q = baVar;
            }
        }
        return baVar;
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
