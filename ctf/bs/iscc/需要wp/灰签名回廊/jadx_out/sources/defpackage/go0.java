package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.example.gnd.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class go0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.yt0 r6, defpackage.s7 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.co0
            if (r0 == 0) goto L13
            r0 = r7
            co0 r0 = (defpackage.co0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            co0 r0 = new co0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yt0 r6 = r0.g
            defpackage.i60.az(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.i60.az(r7)
        L31:
            r0.g = r6
            r0.i = r2
            jg0 r7 = defpackage.jg0.e
            java.lang.Object r7 = r6.a(r7, r0)
            yj r1 = defpackage.yj.d
            if (r7 != r1) goto L40
            return r1
        L40:
            ig0 r7 = (defpackage.ig0) r7
            java.lang.Object r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            pg0 r5 = (defpackage.pg0) r5
            boolean r5 = defpackage.d41.k(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go0.a(yt0, s7):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.yt0 r11, defpackage.bu r12, defpackage.cc r13, defpackage.ig0 r14, defpackage.s7 r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go0.c(yt0, bu, cc, ig0, s7):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r15 == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.yt0 r12, defpackage.fv0 r13, defpackage.ig0 r14, defpackage.s7 r15) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go0.d(yt0, fv0, ig0, s7):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int f(java.lang.String r12, int r13) {
        /*
            boolean r0 = defpackage.yp.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            yp r0 = defpackage.yp.a()
            int r3 = r0.c()
            if (r3 != r1) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L88
            int r3 = r0.c()
            r4 = 0
            if (r3 != r1) goto L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 == 0) goto L81
            java.lang.String r1 = "charSequence cannot be null"
            defpackage.e00.q(r12, r1)
            vp r0 = r0.e
            o6 r5 = r0.b
            r5.getClass()
            r0 = -1
            if (r13 < 0) goto L36
            int r1 = r12.length()
            if (r13 < r1) goto L38
        L36:
            r6 = r12
            goto L77
        L38:
            boolean r1 = r12 instanceof android.text.Spanned
            if (r1 == 0) goto L54
            r1 = r12
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r3 = r13 + 1
            java.lang.Class<lz0> r6 = defpackage.lz0.class
            java.lang.Object[] r3 = r1.getSpans(r13, r3, r6)
            lz0[] r3 = (defpackage.lz0[]) r3
            int r6 = r3.length
            if (r6 <= 0) goto L54
            r3 = r3[r4]
            int r1 = r1.getSpanEnd(r3)
            r6 = r12
            goto L78
        L54:
            int r1 = r13 + (-16)
            int r7 = java.lang.Math.max(r4, r1)
            int r1 = r12.length()
            int r3 = r13 + 16
            int r8 = java.lang.Math.min(r1, r3)
            iq r11 = new iq
            r11.<init>(r13)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            r6 = r12
            java.lang.Object r12 = r5.w(r6, r7, r8, r9, r10, r11)
            iq r12 = (defpackage.iq) r12
            int r1 = r12.f
            goto L78
        L77:
            r1 = r0
        L78:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            if (r1 != r0) goto L7f
            goto L89
        L7f:
            r2 = r12
            goto L89
        L81:
            java.lang.String r12 = "Not initialized yet"
            defpackage.wc.q(r12)
            r12 = 0
            return r12
        L88:
            r6 = r12
        L89:
            if (r2 == 0) goto L90
            int r12 = r2.intValue()
            return r12
        L90:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r6)
            int r12 = r12.following(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go0.f(java.lang.String, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(java.lang.String r4, int r5) {
        /*
            boolean r0 = defpackage.yp.d()
            r1 = 0
            if (r0 == 0) goto L13
            yp r0 = defpackage.yp.a()
            int r2 = r0.c()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2a
            int r2 = r5 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.b(r4, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            int r4 = r1.intValue()
            return r4
        L31:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r4)
            int r4 = r0.preceding(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go0.g(java.lang.String, int):int");
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
