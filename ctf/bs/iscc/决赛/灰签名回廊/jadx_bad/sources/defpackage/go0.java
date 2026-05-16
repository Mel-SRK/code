package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.example.gnd.R;
import java.text.BreakIterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class go0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yt0 yt0Var, s7 s7Var) {
        co0 co0Var;
        yj yjVar;
        int size;
        int i;
        if (s7Var instanceof co0) {
            co0Var = (co0) s7Var;
            int i2 = co0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                co0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                co0Var = new co0(s7Var);
            }
        }
        Object objA = co0Var.h;
        int i3 = co0Var.i;
        if (i3 == 0) {
            i60.az(objA);
            co0Var.g = yt0Var;
            co0Var.i = 1;
            objA = yt0Var.a(jg0.e, co0Var);
            yjVar = yj.d;
            if (objA == yjVar) {
            }
            ig0 ig0Var = (ig0) objA;
            ?? r1 = ig0Var.a;
            size = r1.size();
            i = 0;
            while (i < size) {
            }
            return ig0Var;
        }
        if (i3 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yt0Var = co0Var.g;
        i60.az(objA);
        ig0 ig0Var2 = (ig0) objA;
        ?? r12 = ig0Var2.a;
        size = r12.size();
        i = 0;
        while (i < size) {
            if (d41.k((pg0) r12.get(i))) {
                i++;
            } else {
                co0Var.g = yt0Var;
                co0Var.i = 1;
                objA = yt0Var.a(jg0.e, co0Var);
                yjVar = yj.d;
                if (objA == yjVar) {
                    return yjVar;
                }
                ig0 ig0Var22 = (ig0) objA;
                ?? r122 = ig0Var22.a;
                size = r122.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return ig0Var22;
    }

    public static final boolean b(KeyEvent keyEvent, int i) {
        return ((int) (m10.aa(keyEvent) >> 32)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yt0 yt0Var, bu buVar, cc ccVar, ig0 ig0Var, s7 s7Var) {
        do0 do0Var;
        cw0 cw0Var;
        bu buVar2;
        bu buVar3;
        h30 h30Var;
        if (s7Var instanceof do0) {
            do0Var = (do0) s7Var;
            int i = do0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                do0Var.j = i - Integer.MIN_VALUE;
            } else {
                do0Var = new do0(s7Var);
            }
        }
        Object objC = do0Var.i;
        int i2 = do0Var.j;
        int i3 = 0;
        int i4 = 1;
        if (i2 == 0) {
            i60.az(objC);
            i11 i11Var = (i11) ccVar.b;
            pg0 pg0Var = (pg0) ccVar.c;
            pg0 pg0Var2 = (pg0) ig0Var.a.get(0);
            if (pg0Var == null || pg0Var2.b - pg0Var.b >= i11Var.b()) {
                ccVar.a = 1;
                ccVar.c = pg0Var2;
                pg0 pg0Var3 = (pg0) ig0Var.a.get(0);
                int i5 = ccVar.a;
                wc wcVar = i5 == 1 ? i5 != 2 ? bw.as : bw.ar : bw.aq;
                long j = pg0Var3.c;
                cw0Var = (cw0) buVar.e;
                if (cw0Var.h() || cw0Var.j().a.e.length() == 0 || (h30Var = cw0Var.d) == null || h30Var.d() == null) {
                    buVar2 = buVar;
                    i4 = 0;
                } else {
                    ys ysVar = cw0Var.i;
                    if (ysVar != null) {
                        ysVar.a(new yv0(i4, 25));
                    }
                    cw0Var.l = j;
                    cw0Var.q = -1;
                    cw0Var.f(true);
                    buVar2 = buVar;
                    buVar2.r(cw0Var.j(), cw0Var.l, true, wcVar);
                }
                if (i4 != 0) {
                    long j2 = pg0Var3.a;
                    a2 a2Var = new a2(18, buVar2, wcVar);
                    do0Var.g = yt0Var;
                    do0Var.h = buVar2;
                    do0Var.j = 2;
                    objC = go.c(yt0Var, j2, a2Var, do0Var);
                    yj yjVar = yj.d;
                    if (objC == yjVar) {
                        return yjVar;
                    }
                    buVar3 = buVar2;
                    if (((Boolean) objC).booleanValue()) {
                    }
                    buVar3.getClass();
                }
            } else {
                int i6 = pg0Var.i;
                float f = go.a;
                if (xa0.c(xa0.f(pg0Var.c, pg0Var2.c)) < (i6 == 2 ? i11Var.d() * go.a : i11Var.d())) {
                    ccVar.a++;
                }
                ccVar.c = pg0Var2;
                pg0 pg0Var32 = (pg0) ig0Var.a.get(0);
                int i52 = ccVar.a;
                wc wcVar2 = i52 == 1 ? i52 != 2 ? bw.as : bw.ar : bw.aq;
                long j3 = pg0Var32.c;
                cw0Var = (cw0) buVar.e;
                if (cw0Var.h()) {
                    buVar2 = buVar;
                    i4 = 0;
                    if (i4 != 0) {
                    }
                }
            }
        } else if (i2 == 1) {
            bu buVar4 = do0Var.h;
            yt0 yt0Var2 = do0Var.g;
            i60.az(objC);
            if (((Boolean) objC).booleanValue()) {
                ?? r12 = yt0Var2.i.w.a;
                int size = r12.size();
                while (i3 < size) {
                    pg0 pg0Var4 = (pg0) r12.get(i3);
                    if (d41.l(pg0Var4)) {
                        pg0Var4.a();
                    }
                    i3++;
                }
            }
            buVar4.getClass();
        } else {
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buVar3 = do0Var.h;
            yt0Var = do0Var.g;
            i60.az(objC);
            if (((Boolean) objC).booleanValue()) {
                ?? r11 = yt0Var.i.w.a;
                int size2 = r11.size();
                while (i3 < size2) {
                    pg0 pg0Var5 = (pg0) r11.get(i3);
                    if (d41.l(pg0Var5)) {
                        pg0Var5.a();
                    }
                    i3++;
                }
            }
            buVar3.getClass();
        }
        return wz0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r15 == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(yt0 yt0Var, fv0 fv0Var, ig0 ig0Var, s7 s7Var) {
        fo0 fo0Var;
        pg0 pg0Var;
        if (s7Var instanceof fo0) {
            fo0Var = (fo0) s7Var;
            int i = fo0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo0Var.k = i - Integer.MIN_VALUE;
            } else {
                fo0Var = new fo0(s7Var);
            }
        }
        Object objB = fo0Var.j;
        int i2 = fo0Var.k;
        int i3 = 1;
        yj yjVar = yj.d;
        try {
            if (i2 == 0) {
                i60.az(objB);
                pg0Var = (pg0) kc.ar(ig0Var.a);
                long j = pg0Var.a;
                fo0Var.g = yt0Var;
                fo0Var.h = fv0Var;
                fo0Var.i = pg0Var;
                fo0Var.k = 1;
                objB = go.b(yt0Var, j, fo0Var);
                if (objB == yjVar) {
                }
                return yjVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fv0Var = fo0Var.h;
                yt0Var = fo0Var.g;
                i60.az(objB);
                if (((Boolean) objB).booleanValue()) {
                    ?? r12 = yt0Var.i.w.a;
                    int size = r12.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        pg0 pg0Var2 = (pg0) r12.get(i4);
                        if (d41.l(pg0Var2)) {
                            pg0Var2.a();
                        }
                    }
                    fv0Var.a();
                } else {
                    fv0Var.onCancel();
                }
                return wz0.a;
            }
            pg0 pg0Var3 = fo0Var.i;
            fv0Var = fo0Var.h;
            yt0 yt0Var2 = fo0Var.g;
            i60.az(objB);
            pg0Var = pg0Var3;
            yt0Var = yt0Var2;
            pg0 pg0Var4 = (pg0) objB;
            if (pg0Var4 != null) {
                long j2 = pg0Var4.c;
                i11 i11VarF = yt0Var.f();
                int i5 = pg0Var.i;
                float f = go.a;
                if (xa0.c(xa0.f(pg0Var.c, j2)) < (i5 == 2 ? i11VarF.d() * go.a : i11VarF.d())) {
                    fv0Var.c(j2);
                    long j3 = pg0Var4.a;
                    b50 b50Var = new b50(fv0Var, i3);
                    fo0Var.g = yt0Var;
                    fo0Var.h = fv0Var;
                    fo0Var.i = null;
                    fo0Var.k = 2;
                    objB = go.c(yt0Var, j3, b50Var, fo0Var);
                }
            }
            return wz0.a;
        } catch (CancellationException e) {
            fv0Var.onCancel();
            throw e;
        }
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o6] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int f(String str, int i) {
        yp ypVarA;
        ?? r6;
        ?? r62;
        int spanEnd;
        Integer num = null;
        if (yp.d()) {
            ypVarA = yp.a();
            if (ypVarA.c() != 1) {
                ypVarA = null;
            }
        }
        if (ypVarA != null) {
            if (!(ypVarA.c() == 1)) {
                wc.q("Not initialized yet");
                return 0;
            }
            e00.q(str, "charSequence cannot be null");
            ?? r5 = ypVarA.e.b;
            r5.getClass();
            if (i < 0 || i >= str.length()) {
                r62 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                lz0[] lz0VarArr = (lz0[]) spanned.getSpans(i, i + 1, lz0.class);
                if (lz0VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(lz0VarArr[0]);
                    r62 = str;
                } else {
                    ?? r63 = str;
                    spanEnd = ((iq) r5.w(r63, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new iq(i))).f;
                    r62 = r63;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r6 = r62;
            if (spanEnd != -1) {
                num = numValueOf;
                r6 = r62;
            }
        } else {
            r6 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r6);
        return characterInstance.following(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int g(String str, int i) {
        yp ypVarA;
        Integer num = null;
        if (yp.d()) {
            ypVarA = yp.a();
            if (ypVarA.c() != 1) {
                ypVarA = null;
            }
        }
        if (ypVarA != null) {
            int iB = ypVarA.b(str, Math.max(0, i - 1));
            Integer numValueOf = Integer.valueOf(iB);
            if (iB != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final ViewParent h(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final boolean i(t3 t3Var, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        t3 t3VarA = u3.a();
        Path path = t3VarA.a;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            u3.b("Invalid rectangle, make sure no value is NaN");
        }
        if (t3VarA.b == null) {
            t3VarA.b = new RectF();
        }
        RectF rectF = t3VarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = t3VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        t3 t3VarA2 = u3.a();
        Path path2 = t3VarA2.a;
        t3VarA2.c(t3Var, t3VarA, 1);
        boolean zIsEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !zIsEmpty;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean j(ig0 ig0Var) {
        ?? r5 = ig0Var.a;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            if (((pg0) r5.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final double l(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final void m() {
        throw new UnsupportedOperationException();
    }
}
