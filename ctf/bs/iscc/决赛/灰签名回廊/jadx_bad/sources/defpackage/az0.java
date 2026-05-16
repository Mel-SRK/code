package defpackage;

import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class az0 {
    public static final jq b;
    public static final jq c;
    public static final jq d;
    public static final jq e;
    public static final jq f;
    public static final jq g;
    public static final jq h;
    public static c3 n;
    public static e0 o;
    public static ra p;
    public static final Object[] a = new Object[0];
    public static final mq i = new mq(false);
    public static final mq j = new mq(true);
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final f1 l = new f1(17, new md(12, 0), new c6(4));
    public static final StackTraceElement[] m = new StackTraceElement[0];

    static {
        int i2 = 1;
        b = new jq("UNDEFINED", i2);
        c = new jq("REUSABLE_CLAIMED", i2);
        d = new jq("COMPLETING_ALREADY", i2);
        e = new jq("COMPLETING_WAITING_CHILDREN", i2);
        f = new jq("COMPLETING_RETRY", i2);
        g = new jq("TOO_LATE_TO_CANCEL", i2);
        h = new jq("SEALED", i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(ci0 ci0Var, gv gvVar, vf vfVar, int i2) {
        i01 i01Var;
        boolean z;
        hi0 hi0VarS;
        vfVar.aw(-149765515);
        xz xzVar = vfVar.w;
        a aVarL = vfVar.l();
        vfVar.at(201, xf.b);
        Object objAk = vfVar.ak();
        if (f00.h(objAk, nf.a)) {
            i01Var = null;
        } else {
            objAk.getClass();
            i01Var = (i01) objAk;
        }
        ai0 ai0Var = ci0Var.a;
        i01 i01VarC = ai0Var.c(ci0Var, i01Var);
        boolean zEquals = i01VarC.equals(i01Var);
        if (!zEquals) {
            vfVar.be(i01VarC);
        }
        if (!vfVar.aq) {
            rq0 rq0Var = vfVar.af;
            Object objB = rq0Var.b(rq0Var.b, rq0Var.g);
            objB.getClass();
            a aVar = (a) objB;
            if (!(vfVar.z() && zEquals) && (ci0Var.f || !aVarL.containsKey(ai0Var))) {
                aVarL = aVarL.b(ai0Var, i01VarC);
            } else if ((zEquals && !vfVar.v) || !vfVar.v) {
                aVarL = aVar;
            }
            if (vfVar.x || aVar != aVarL) {
                z = true;
            }
            if (z && !vfVar.aq) {
                vfVar.ai(aVarL);
            }
            xzVar.c(vfVar.v ? 1 : 0);
            vfVar.v = z;
            vfVar.aj = aVarL;
            vfVar.ar(202, xf.c, 0, aVarL);
            gvVar.f(vfVar, Integer.valueOf((i2 >> 3) & 14));
            vfVar.q(false);
            vfVar.q(false);
            vfVar.v = xzVar.b() != 0;
            vfVar.aj = null;
            hi0VarS = vfVar.s();
            if (hi0VarS == null) {
                hi0VarS.d = new re(i2, 1, ci0Var, gvVar);
                return;
            }
            return;
        }
        if (ci0Var.f || !aVarL.containsKey(ai0Var)) {
            aVarL = aVarL.b(ai0Var, i01VarC);
        }
        vfVar.ai = true;
        z = false;
        if (z) {
            vfVar.ai(aVarL);
        }
        xzVar.c(vfVar.v ? 1 : 0);
        vfVar.v = z;
        vfVar.aj = aVarL;
        vfVar.ar(202, xf.c, 0, aVarL);
        gvVar.f(vfVar, Integer.valueOf((i2 >> 3) & 14));
        vfVar.q(false);
        vfVar.q(false);
        vfVar.v = xzVar.b() != 0;
        vfVar.aj = null;
        hi0VarS = vfVar.s();
        if (hi0VarS == null) {
        }
    }

    public static a70 aa(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    a70 a70Var = new a70();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    a70Var.g = byteBufferDuplicate;
                    a70Var.d = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    a70Var.e = i7;
                    a70Var.f = ((ByteBuffer) a70Var.g).getShort(i7);
                    return a70Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final boolean ab(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof b1) {
            return ((b1) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final void ac(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ad(ji jiVar, Object obj) {
        t00 t00Var;
        if (!(jiVar instanceof sm)) {
            jiVar.h(obj);
            return;
        }
        sm smVar = (sm) jiVar;
        kotlinx.coroutines.a aVar = smVar.g;
        ki kiVar = smVar.h;
        Throwable thA = tj0.a(obj);
        Object wdVar = thA == null ? obj : new wd(thA, false);
        if (aVar.e(kiVar.e())) {
            smVar.i = wdVar;
            smVar.f = 1;
            aVar.d(kiVar.e(), smVar);
            return;
        }
        cr crVarA = ux0.a();
        if (crVarA.f >= 4294967296L) {
            smVar.i = wdVar;
            smVar.f = 1;
            crVarA.l(smVar);
            return;
        }
        crVarA.n(true);
        try {
            t00Var = (t00) kiVar.e().k(bw.ae);
        } finally {
            try {
            } finally {
            }
        }
        if (t00Var == null || t00Var.b()) {
            Object obj2 = smVar.j;
            pj pjVarE = kiVar.e();
            Object objAw = t1.aw(pjVarE, obj2);
            uz0 uz0VarAp = objAw != t1.h ? e00.ap(kiVar, pjVarE, objAw) : null;
            try {
                kiVar.h(obj);
            } finally {
                if (uz0VarAp == null || uz0VarAp.bh()) {
                    t1.at(pjVarE, objAw);
                }
            }
        }
        smVar.h(i60.aa(t00Var.q()));
        while (crVarA.s()) {
        }
    }

    public static final void ae(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void af(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final String ag(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void ah(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        f00.ac(classCastException, az0.class.getName());
        throw classCastException;
    }

    public static final BlendMode ai(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 1 ? BlendMode.SRC : i2 == 2 ? BlendMode.DST : i2 == 3 ? BlendMode.SRC_OVER : i2 == 4 ? BlendMode.DST_OVER : i2 == 5 ? BlendMode.SRC_IN : i2 == 6 ? BlendMode.DST_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 8 ? BlendMode.DST_OUT : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 10 ? BlendMode.DST_ATOP : i2 == 11 ? BlendMode.XOR : i2 == 12 ? BlendMode.PLUS : i2 == 13 ? BlendMode.MODULATE : i2 == 14 ? BlendMode.SCREEN : i2 == 15 ? BlendMode.OVERLAY : i2 == 16 ? BlendMode.DARKEN : i2 == 17 ? BlendMode.LIGHTEN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 23 ? BlendMode.EXCLUSION : i2 == 24 ? BlendMode.MULTIPLY : i2 == 25 ? BlendMode.HUE : i2 == 26 ? BlendMode.SATURATION : i2 == 27 ? BlendMode.COLOR : i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Integer aj(int i2) {
        if (i2 == 5) {
            return 33;
        }
        if (i2 == 6) {
            return 130;
        }
        if (i2 == 3) {
            return 17;
        }
        if (i2 == 4) {
            return 66;
        }
        if (i2 == 1) {
            return 2;
        }
        return i2 == 2 ? 1 : null;
    }

    public static final Object[] ak(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] al(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final ExtractedText am(lw0 lw0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = lw0Var.a.e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = lw0Var.b;
        extractedText.selectionStart = hx0.e(j2);
        extractedText.selectionEnd = hx0.d(j2);
        extractedText.flags = !ft0.j(lw0Var.a.e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final ls an(int i2) {
        if (i2 == 1) {
            return new ls(2);
        }
        if (i2 == 2) {
            return new ls(1);
        }
        if (i2 == 17) {
            return new ls(3);
        }
        if (i2 == 33) {
            return new ls(5);
        }
        if (i2 == 66) {
            return new ls(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new ls(6);
    }

    public static final PorterDuff.Mode ao(int i2) {
        return i2 == 0 ? PorterDuff.Mode.CLEAR : i2 == 1 ? PorterDuff.Mode.SRC : i2 == 2 ? PorterDuff.Mode.DST : i2 == 3 ? PorterDuff.Mode.SRC_OVER : i2 == 4 ? PorterDuff.Mode.DST_OVER : i2 == 5 ? PorterDuff.Mode.SRC_IN : i2 == 6 ? PorterDuff.Mode.DST_IN : i2 == 7 ? PorterDuff.Mode.SRC_OUT : i2 == 8 ? PorterDuff.Mode.DST_OUT : i2 == 9 ? PorterDuff.Mode.SRC_ATOP : i2 == 10 ? PorterDuff.Mode.DST_ATOP : i2 == 11 ? PorterDuff.Mode.XOR : i2 == 12 ? PorterDuff.Mode.ADD : i2 == 14 ? PorterDuff.Mode.SCREEN : i2 == 15 ? PorterDuff.Mode.OVERLAY : i2 == 16 ? PorterDuff.Mode.DARKEN : i2 == 17 ? PorterDuff.Mode.LIGHTEN : i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final Object ap(Object obj) {
        iy iyVar;
        jy jyVar = obj instanceof jy ? (jy) obj : null;
        return (jyVar == null || (iyVar = jyVar.a) == null) ? obj : iyVar;
    }

    public static final void aq(uo0 uo0Var, int i2, rm0 rm0Var) {
        uo0 uo0Var2;
        a90 a90Var = new a90(new uo0[16]);
        List listI = uo0Var.i(false, false);
        while (true) {
            a90Var.d(a90Var.f, listI);
            while (true) {
                int i3 = a90Var.f;
                if (i3 == 0) {
                    return;
                }
                uo0Var2 = (uo0) a90Var.j(i3 - 1);
                boolean zAg = t1.ag(uo0Var2);
                po0 po0Var = uo0Var2.d;
                q80 q80Var = po0Var.d;
                if (!zAg && !q80Var.c(zo0.i)) {
                    fa0 fa0VarD = uo0Var2.d();
                    if (fa0VarD == null) {
                        throw n5.f("Expected semantics node to have a coordinator.");
                    }
                    tz tzVarBa = pk.ba(i60.n(fa0VarD));
                    if (tzVarBa.a < tzVarBa.c && tzVarBa.b < tzVarBa.d) {
                        Object objG = po0Var.d.g(oo0.e);
                        if (objG == null) {
                            objG = null;
                        }
                        gv gvVar = (gv) objG;
                        Object objG2 = q80Var.g(zo0.u);
                        qm0 qm0Var = (qm0) (objG2 != null ? objG2 : null);
                        if (gvVar == null || qm0Var == null || ((Number) qm0Var.b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i4 = i2 + 1;
                        rm0Var.g(new sm0(uo0Var2, i4, tzVarBa, fa0VarD));
                        aq(uo0Var2, i4, rm0Var);
                    }
                }
            }
            listI = uo0Var2.i(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(ci0[] ci0VarArr, gv gvVar, vf vfVar, int i2) {
        a aVarBd;
        boolean z;
        hi0 hi0VarS;
        vfVar.aw(415205898);
        xz xzVar = vfVar.w;
        a aVarL = vfVar.l();
        vfVar.at(201, xf.b);
        if (vfVar.aq) {
            aVarBd = vfVar.bd(aVarL, d41.as(ci0VarArr, aVarL, a.g));
            vfVar.ai = true;
        } else {
            rq0 rq0Var = vfVar.af;
            Object objH = rq0Var.h(rq0Var.g, 0);
            objH.getClass();
            a aVar = (a) objH;
            rq0 rq0Var2 = vfVar.af;
            Object objH2 = rq0Var2.h(rq0Var2.g, 1);
            objH2.getClass();
            a aVar2 = (a) objH2;
            a aVarAs = d41.as(ci0VarArr, aVarL, aVar2);
            if (!vfVar.z() || vfVar.x || !aVar2.equals(aVarAs)) {
                aVarBd = vfVar.bd(aVarL, aVarAs);
                if (vfVar.x || !f00.h(aVarBd, aVar)) {
                    z = true;
                }
                if (z && !vfVar.aq) {
                    vfVar.ai(aVarBd);
                }
                xzVar.c(vfVar.v ? 1 : 0);
                vfVar.v = z;
                vfVar.aj = aVarBd;
                vfVar.ar(202, xf.c, 0, aVarBd);
                gvVar.f(vfVar, Integer.valueOf((i2 >> 3) & 14));
                vfVar.q(false);
                vfVar.q(false);
                vfVar.v = xzVar.b() != 0;
                vfVar.aj = null;
                hi0VarS = vfVar.s();
                if (hi0VarS == null) {
                    hi0VarS.d = new re(i2, 2, ci0VarArr, gvVar);
                    return;
                }
                return;
            }
            vfVar.k = vfVar.af.s() + vfVar.k;
            aVarBd = aVar;
        }
        z = false;
        if (z) {
            vfVar.ai(aVarBd);
        }
        xzVar.c(vfVar.v ? 1 : 0);
        vfVar.v = z;
        vfVar.aj = aVarBd;
        vfVar.ar(202, xf.c, 0, aVarBd);
        gvVar.f(vfVar, Integer.valueOf((i2 >> 3) & 14));
        vfVar.q(false);
        vfVar.q(false);
        vfVar.v = xzVar.b() != 0;
        vfVar.aj = null;
        hi0VarS = vfVar.s();
        if (hi0VarS == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0561 A[PHI: r13 r30
      0x0561: PHI (r13v42 ey) = (r13v32 ey), (r13v43 ey) binds: [B:262:0x055f, B:259:0x0554] A[DONT_GENERATE, DONT_INLINE]
      0x0561: PHI (r30v6 int) = (r30v4 int), (r30v8 int) binds: [B:262:0x055f, B:259:0x0554] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0610 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x079c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x085e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(lw0 lw0Var, cv cvVar, j70 j70Var, nx0 nx0Var, g11 g11Var, cv cvVar2, g80 g80Var, vr0 vr0Var, boolean z, int i2, int i3, ey eyVar, s10 s10Var, boolean z2, te teVar, vf vfVar, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        wc0 wc0Var;
        boolean zF;
        Object objAk;
        int i9;
        int i10;
        jy0 jy0Var;
        Object obj;
        hi0 hi0VarW;
        Object h30Var;
        jy0 jy0Var2;
        int i11;
        b6 b6Var;
        boolean z3;
        ys ysVar;
        ab0 ab0Var;
        ss ssVar;
        b21 b21Var;
        nx0 nx0Var2;
        hx0 hx0Var;
        n31 n31Var;
        b6 b6Var2;
        em emVar;
        qt qtVar;
        em emVar2;
        boolean z4;
        boolean z5;
        lw0 lw0VarA;
        Object objAk2;
        n31 n31Var2;
        vz0 vz0Var;
        Object objAk3;
        vf vfVar2;
        Object objAk4;
        Object objAk5;
        int i12;
        ey eyVar2;
        int i13;
        boolean zH;
        ab0 ab0Var2;
        Object xiVar;
        vf vfVar3;
        qw0 qw0Var;
        h30 h30Var2;
        ys ysVar2;
        ey eyVar3;
        zv0 zv0Var;
        jy0 jy0Var3;
        k3 k3Var;
        ss ssVar2;
        g80 g80Var2;
        n31 n31Var3;
        lw0 lw0Var2;
        cw0 cw0Var;
        t8 t8Var;
        boolean z6;
        h30 h30Var3;
        boolean z7;
        boolean z8;
        Object i3Var;
        ab0 ab0Var3;
        j70 j70Var2;
        h30 h30Var4;
        w80 w80Var;
        qw0 qw0Var2;
        ey eyVar4;
        boolean zH2;
        Object objAk6;
        g70 g70Var;
        j70 j70VarC;
        boolean zH3;
        Object objAk7;
        j70 j70Var3;
        h30 h30Var5;
        ab0 ab0Var4;
        int i14;
        boolean zH4;
        Object objAk8;
        b21 b21Var2;
        boolean zH5;
        Object yiVar;
        int i15;
        ab0 ab0Var5;
        h30 h30Var6;
        g70 g70Var2;
        b21 b21Var3;
        jy0 jy0Var4;
        boolean zH6;
        Object fjVar;
        cw0 cw0Var2;
        int i16;
        qw0 qw0Var3;
        lw0 lw0Var3;
        boolean zH7;
        Object objAk9;
        boolean zH8;
        Object objAk10;
        ey eyVar5;
        j70 j70VarP;
        cw0 cw0Var3;
        ys ysVar3;
        k3 k3Var2;
        boolean zH9;
        Object objAk11;
        boolean z9;
        int i17;
        vf vfVar4;
        vf vfVar5 = vfVar;
        hx0 hx0Var2 = lw0Var.c;
        b6 b6Var3 = lw0Var.a;
        vfVar5.aw(-958708118);
        if ((i4 & 6) == 0) {
            i6 = i4 | (vfVar5.f(lw0Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= vfVar5.h(cvVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= vfVar5.f(j70Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= vfVar5.f(nx0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= vfVar5.f(g11Var) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= vfVar5.h(cvVar2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= vfVar5.f(g80Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= vfVar5.f(vr0Var) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= vfVar5.g(z) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= vfVar5.d(i2) ? 536870912 : 268435456;
        }
        int i18 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (vfVar5.d(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= vfVar5.f(eyVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= vfVar5.f(s10Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= vfVar5.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= vfVar5.g(false) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= vfVar5.h(teVar) ? 131072 : 65536;
        }
        int i19 = i7;
        if ((i18 & 306783379) == 306783378 && (74899 & i19) == 74898 && vfVar5.z()) {
            vfVar5.aq();
            vfVar4 = vfVar5;
        } else {
            vfVar5.as();
            if ((i4 & 1) != 0 && !vfVar5.x()) {
                vfVar5.aq();
            }
            vfVar5.r();
            Object objAk12 = vfVar5.ak();
            n31 n31Var4 = nf.a;
            if (objAk12 == n31Var4) {
                objAk12 = new ys();
                vfVar5.be(objAk12);
            }
            ys ysVar4 = (ys) objAk12;
            Object objAk13 = vfVar5.ak();
            if (objAk13 == n31Var4) {
                e30 e30Var = f30.a;
                objAk13 = new k3();
                vfVar5.be(objAk13);
            }
            k3 k3Var3 = (k3) objAk13;
            Object objAk14 = vfVar5.ak();
            if (objAk14 == n31Var4) {
                objAk14 = new qw0(k3Var3);
                vfVar5.be(objAk14);
            }
            qw0 qw0Var4 = (qw0) objAk14;
            em emVar3 = (em) vfVar5.j(og.h);
            qt qtVar2 = (qt) vfVar5.j(og.k);
            long j2 = ((ix0) vfVar5.j(jx0.a)).b;
            ss ssVar3 = (ss) vfVar5.j(og.i);
            b21 b21Var4 = (b21) vfVar5.j(og.t);
            sr0 sr0Var = (sr0) vfVar5.j(og.p);
            if (i2 != 1 || z) {
                i8 = 1;
            } else {
                i8 = 1;
                if (eyVar.a) {
                    wc0Var = wc0.e;
                }
                Object[] objArr = {wc0Var};
                f1 f1Var = zv0.f;
                zF = vfVar5.f(wc0Var);
                objAk = vfVar5.ak();
                if (!zF || objAk == n31Var4) {
                    objAk = new b(7, wc0Var);
                    vfVar5.be(objAk);
                }
                zv0 zv0Var2 = (zv0) m10.aq(objArr, f1Var, (pu) objAk, vfVar5, 0, 4);
                int i20 = i18 & 14;
                i9 = (i20 != 4 ? i8 : 0) | ((i18 & 57344) != 16384 ? i8 : 0);
                Object objAk15 = vfVar5.ak();
                if (i9 == 0 || objAk15 == n31Var4) {
                    jy0 jy0VarX = pk.x(g11Var, b6Var3);
                    if (hx0Var2 == null) {
                        long j3 = hx0Var2.a;
                        ab0 ab0Var6 = jy0VarX.b;
                        int i21 = hx0.c;
                        int iD = ab0Var6.d((int) (j3 >> 32));
                        b6Var3 = b6Var3;
                        int iD2 = ab0Var6.d((int) (j3 & 4294967295L));
                        int iMin = Math.min(iD, iD2);
                        int iMax = Math.max(iD, iD2);
                        z5 z5Var = new z5(jy0VarX.a);
                        i10 = i20;
                        z5Var.e.add(new y5(iMin, iMax, new yr0(0L, 0L, (iu) null, (gu) null, (hu) null, (fu0) null, (String) null, 0L, (t7) null, (ow0) null, (t40) null, 0L, bv0.c, (yp0) null, 61439), ""));
                        jy0Var = new jy0(z5Var.b(), ab0Var6);
                    } else {
                        b6Var3 = b6Var3;
                        i10 = i20;
                        jy0Var = jy0VarX;
                    }
                    vfVar5.be(jy0Var);
                    obj = jy0Var;
                } else {
                    i10 = i20;
                    obj = objAk15;
                }
                jy0 jy0Var5 = (jy0) obj;
                b6 b6Var4 = jy0Var5.a;
                ab0 ab0Var7 = jy0Var5.b;
                hi0VarW = vfVar5.w();
                if (hi0VarW != null) {
                    wc.q("no recompose scope found");
                    return;
                }
                hi0VarW.b |= 1;
                boolean zF2 = vfVar5.f(sr0Var);
                Object objAk16 = vfVar5.ak();
                if (zF2 || objAk16 == n31Var4) {
                    jy0Var2 = jy0Var5;
                    b6 b6Var5 = b6Var3;
                    i11 = i19;
                    b6Var = b6Var5;
                    z3 = z;
                    ysVar = ysVar4;
                    ab0Var = ab0Var7;
                    ssVar = ssVar3;
                    b21Var = b21Var4;
                    nx0Var2 = nx0Var;
                    dv0 dv0Var = new dv0(b6Var4, nx0Var2, z3, emVar3, qtVar2, 0);
                    hx0Var = hx0Var2;
                    n31Var = n31Var4;
                    b6Var2 = b6Var4;
                    emVar = emVar3;
                    qtVar = qtVar2;
                    h30Var = new h30(dv0Var, hi0VarW, sr0Var);
                    vfVar5.be(h30Var);
                } else {
                    b6 b6Var6 = b6Var3;
                    i11 = i19;
                    b6Var = b6Var6;
                    z3 = z;
                    ysVar = ysVar4;
                    ab0Var = ab0Var7;
                    h30Var = objAk16;
                    hx0Var = hx0Var2;
                    emVar = emVar3;
                    ssVar = ssVar3;
                    b21Var = b21Var4;
                    nx0Var2 = nx0Var;
                    jy0Var2 = jy0Var5;
                    n31Var = n31Var4;
                    b6Var2 = b6Var4;
                    qtVar = qtVar2;
                }
                h30 h30Var7 = (h30) h30Var;
                h30Var7.s = cvVar;
                h30Var7.w = j2;
                o6 o6Var = h30Var7.r;
                o6Var.b = s10Var;
                o6Var.c = ssVar;
                h30Var7.j = b6Var;
                dv0 dv0Var2 = h30Var7.a;
                if (f00.h(dv0Var2.a, b6Var2) && f00.h(dv0Var2.b, nx0Var2) && dv0Var2.e == z3 && dv0Var2.f == (i17 = i8) && dv0Var2.c == Integer.MAX_VALUE && dv0Var2.d == i17 && f00.h(dv0Var2.g, emVar) && f00.h(dv0Var2.i, rq.d) && dv0Var2.h == qtVar) {
                    emVar2 = emVar;
                } else {
                    emVar2 = emVar;
                    dv0Var2 = new dv0(b6Var2, nx0Var2, z3, emVar2, qtVar, 0);
                }
                if (h30Var7.a != dv0Var2) {
                    h30Var7.p = true;
                }
                h30Var7.a = dv0Var2;
                f1 f1Var2 = h30Var7.d;
                uw0 uw0Var = h30Var7.e;
                f1Var2.getClass();
                long j4 = lw0Var.b;
                hx0 hx0Var3 = hx0Var;
                boolean zH10 = f00.h(hx0Var3, ((pp) f1Var2.f).c());
                if (!f00.h(((lw0) f1Var2.e).a.e, b6Var.e)) {
                    f1Var2.f = new pp(b6Var, j4);
                    z4 = true;
                } else if (hx0.a(((lw0) f1Var2.e).b, j4)) {
                    z4 = false;
                } else {
                    ((pp) f1Var2.f).f(hx0.e(j4), hx0.d(j4));
                    z5 = true;
                    z4 = false;
                    if (hx0Var3 != null) {
                        pp ppVar = (pp) f1Var2.f;
                        ppVar.d = -1;
                        ppVar.e = -1;
                    } else {
                        long j5 = hx0Var3.a;
                        if (!hx0.b(j5)) {
                            ((pp) f1Var2.f).e(hx0.e(j5), hx0.d(j5));
                        }
                    }
                    if (z4 && (z5 || zH10)) {
                        lw0VarA = lw0Var;
                    } else {
                        pp ppVar2 = (pp) f1Var2.f;
                        ppVar2.d = -1;
                        ppVar2.e = -1;
                        lw0VarA = lw0.a(lw0Var, null, 0L, 3);
                    }
                    lw0 lw0Var4 = (lw0) f1Var2.e;
                    f1Var2.e = lw0VarA;
                    if (uw0Var != null) {
                        uw0Var.a(lw0Var4, lw0VarA);
                    }
                    objAk2 = vfVar5.ak();
                    n31Var2 = n31Var;
                    if (objAk2 == n31Var2) {
                        objAk2 = new vz0();
                        vfVar5.be(objAk2);
                    }
                    vz0Var = (vz0) objAk2;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (vz0Var.e) {
                        vz0Var.d = Long.valueOf(jCurrentTimeMillis);
                        vz0Var.a(lw0Var);
                        objAk3 = vfVar.ak();
                        if (objAk3 != n31Var2) {
                            objAk3 = new cw0(vz0Var);
                            vfVar2 = vfVar;
                            vfVar2.be(objAk3);
                        } else {
                            vfVar2 = vfVar;
                        }
                        cw0 cw0Var4 = (cw0) objAk3;
                        ab0 ab0Var8 = ab0Var;
                        cw0Var4.b = ab0Var8;
                        cw0Var4.c = h30Var7.t;
                        cw0Var4.d = h30Var7;
                        cw0Var4.e.setValue(lw0Var);
                        cw0Var4.f = (gc) vfVar2.j(og.e);
                        cw0Var4.g = (ox0) vfVar2.j(og.q);
                        cw0Var4.h = (ix) vfVar2.j(og.l);
                        ys ysVar5 = ysVar;
                        cw0Var4.i = ysVar5;
                        cw0Var4.j.setValue(true);
                        cw0Var4.k.setValue(Boolean.valueOf(z2));
                        objAk4 = vfVar2.ak();
                        if (objAk4 == n31Var2) {
                            pg pgVar = new pg(pk.q(vfVar2));
                            vfVar2.be(pgVar);
                            objAk4 = pgVar;
                        }
                        xj xjVar = ((pg) objAk4).d;
                        objAk5 = vfVar2.ak();
                        if (objAk5 == n31Var2) {
                            objAk5 = new t8();
                            vfVar2.be(objAk5);
                        }
                        t8 t8Var2 = (t8) objAk5;
                        int i22 = i11;
                        int i23 = i22 & 7168;
                        int i24 = i22 & 57344;
                        ss ssVar4 = ssVar;
                        int i25 = i10;
                        boolean zH11 = (i24 != 16384) | (i23 != 2048) | vfVar2.h(h30Var7) | vfVar2.h(qw0Var4) | (i25 != 4);
                        i12 = (i22 & 112) ^ 48;
                        if (i12 <= 32) {
                            eyVar2 = eyVar;
                            if (vfVar2.f(eyVar2)) {
                                i13 = i25;
                            }
                            zH = zH11 | z | vfVar2.h(ab0Var8) | vfVar2.h(xjVar) | vfVar2.h(t8Var2) | vfVar2.h(cw0Var4);
                            Object objAk17 = vfVar2.ak();
                            if (zH || objAk17 == n31Var2) {
                                ab0Var2 = ab0Var8;
                                vfVar3 = vfVar2;
                                qw0Var = qw0Var4;
                                h30Var2 = h30Var7;
                                ysVar2 = ysVar5;
                                eyVar3 = eyVar2;
                                zv0Var = zv0Var2;
                                jy0Var3 = jy0Var2;
                                k3Var = k3Var3;
                                ssVar2 = ssVar4;
                                g80Var2 = g80Var;
                                n31Var3 = n31Var2;
                                xiVar = new xi(h30Var2, z2, qw0Var, lw0Var, eyVar3, ab0Var2, cw0Var4, xjVar, t8Var2);
                                lw0Var2 = lw0Var;
                                cw0Var = cw0Var4;
                                t8Var = t8Var2;
                                z6 = z2;
                                vfVar3.be(xiVar);
                            } else {
                                ab0Var2 = ab0Var8;
                                xiVar = objAk17;
                                qw0Var = qw0Var4;
                                h30Var2 = h30Var7;
                                cw0Var = cw0Var4;
                                vfVar3 = vfVar2;
                                ysVar2 = ysVar5;
                                eyVar3 = eyVar2;
                                zv0Var = zv0Var2;
                                jy0Var3 = jy0Var2;
                                k3Var = k3Var3;
                                ssVar2 = ssVar4;
                                lw0Var2 = lw0Var;
                                g80Var2 = g80Var;
                                z6 = z2;
                                t8Var = t8Var2;
                                n31Var3 = n31Var2;
                            }
                            j70 j70VarC2 = androidx.compose.foundation.a.c(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(ysVar2), (cv) xiVar), z6, g80Var2);
                            w80 w80VarP = bo0.p(Boolean.valueOf(z6), vfVar3);
                            boolean zF3 = vfVar3.f(w80VarP) | vfVar3.h(h30Var2) | vfVar3.h(qw0Var) | vfVar3.h(cw0Var);
                            if (i12 > 32 || !vfVar3.f(eyVar3)) {
                                h30Var3 = h30Var2;
                                if ((i22 & 48) != 32) {
                                    z7 = false;
                                }
                                z8 = z7 | zF3;
                                Object objAk18 = vfVar3.ak();
                                if (z8 || objAk18 == n31Var3) {
                                    ab0Var3 = ab0Var2;
                                    j70Var2 = j70VarC2;
                                    h30Var4 = h30Var3;
                                    i3Var = new i3(h30Var4, w80VarP, qw0Var, cw0Var, eyVar3, null, 2);
                                    w80Var = w80VarP;
                                    qw0Var2 = qw0Var;
                                    eyVar4 = eyVar3;
                                    vfVar3.be(i3Var);
                                } else {
                                    i3Var = objAk18;
                                    qw0Var2 = qw0Var;
                                    eyVar4 = eyVar3;
                                    ab0Var3 = ab0Var2;
                                    j70Var2 = j70VarC2;
                                    h30Var4 = h30Var3;
                                    w80Var = w80VarP;
                                }
                                pk.d(vfVar3, (gv) i3Var, wz0.a);
                                zH2 = vfVar3.h(h30Var4);
                                objAk6 = vfVar3.ak();
                                if (!zH2 || objAk6 == n31Var3) {
                                    objAk6 = new wi(h30Var4, 1);
                                    vfVar3.be(objAk6);
                                }
                                c cVar = new c((cv) objAk6, null, 17);
                                g70Var = g70.a;
                                j70VarC = g70Var.c(new SuspendPointerInputElement(8675309, null, new ut0(cVar), 6));
                                zH3 = vfVar3.h(h30Var4) | (i24 != 16384) | (i23 != 2048) | vfVar3.h(ab0Var3) | vfVar3.h(cw0Var);
                                objAk7 = vfVar3.ak();
                                if (!zH3 || objAk7 == n31Var3) {
                                    ab0 ab0Var9 = ab0Var3;
                                    j70Var3 = j70VarC;
                                    zi ziVar = new zi(h30Var4, ysVar2, z2, cw0Var, ab0Var9);
                                    h30Var5 = h30Var4;
                                    ab0Var4 = ab0Var9;
                                    vfVar3.be(ziVar);
                                    objAk7 = ziVar;
                                } else {
                                    h30Var5 = h30Var4;
                                    ab0Var4 = ab0Var3;
                                    j70Var3 = j70VarC;
                                }
                                j70 j70VarP2 = !z2 ? m10.p(j70Var3, new ei(3, (cv) objAk7, g80Var2)) : j70Var3;
                                bu buVar = cw0Var.u;
                                aw0 aw0Var = cw0Var.t;
                                j70 j70VarC3 = j70VarP2.c(new SuspendPointerInputElement(buVar, aw0Var, new ut0(new w8(buVar, aw0Var, (ji) null, 11)), 4)).c(new PointerHoverIconModifierElement());
                                i14 = i13;
                                zH4 = vfVar3.h(h30Var5) | (i14 != 4) | vfVar3.h(ab0Var4);
                                objAk8 = vfVar3.ak();
                                if (!zH4 || objAk8 == n31Var3) {
                                    objAk8 = new g5(h30Var5, lw0Var2, ab0Var4, 3);
                                    vfVar3.be(objAk8);
                                }
                                j70 j70VarA = androidx.compose.ui.draw.a.a((cv) objAk8);
                                b21Var2 = b21Var;
                                zH5 = vfVar3.h(h30Var5) | (i23 != 2048) | vfVar3.f(b21Var2) | vfVar3.h(cw0Var) | (i14 != 4) | vfVar3.h(ab0Var4);
                                Object objAk19 = vfVar3.ak();
                                if (!zH5 || objAk19 == n31Var3) {
                                    lw0 lw0Var5 = lw0Var2;
                                    i15 = i14;
                                    ab0Var5 = ab0Var4;
                                    h30Var6 = h30Var5;
                                    g70Var2 = g70Var;
                                    yiVar = new yi(h30Var6, z2, b21Var2, cw0Var, lw0Var5, ab0Var5);
                                    b21Var3 = b21Var2;
                                    vfVar3.be(yiVar);
                                } else {
                                    i15 = i14;
                                    b21Var3 = b21Var2;
                                    yiVar = objAk19;
                                    g70Var2 = g70Var;
                                    ab0Var5 = ab0Var4;
                                    h30Var6 = h30Var5;
                                }
                                j70 j70VarD = androidx.compose.ui.layout.a.d(g70Var2, (cv) yiVar);
                                jy0Var4 = jy0Var3;
                                zH6 = vfVar3.h(jy0Var4) | (i15 != 4) | (i23 != 2048) | vfVar3.g(false) | (i24 != 16384) | vfVar3.h(h30Var6) | vfVar3.h(ab0Var5) | vfVar3.h(cw0Var) | ((i12 <= 32 && vfVar3.f(eyVar4)) || (i22 & 48) == 32);
                                Object objAk20 = vfVar3.ak();
                                if (zH6 || objAk20 == n31Var3) {
                                    ey eyVar6 = eyVar4;
                                    cw0Var2 = cw0Var;
                                    h30 h30Var8 = h30Var6;
                                    i16 = i15;
                                    qw0Var3 = qw0Var2;
                                    fjVar = new fj(jy0Var4, lw0Var, z2, eyVar6, h30Var8, ab0Var5, cw0Var2, ysVar2);
                                    lw0Var3 = lw0Var;
                                    h30Var6 = h30Var8;
                                    vfVar3.be(fjVar);
                                } else {
                                    fjVar = objAk20;
                                    cw0Var2 = cw0Var;
                                    i16 = i15;
                                    qw0Var3 = qw0Var2;
                                    lw0Var3 = lw0Var;
                                }
                                AtomicInteger atomicInteger = ro0.a;
                                AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((cv) fjVar, true);
                                boolean z10 = !z2 && ((Boolean) ((b30) b21Var3).a.getValue()).booleanValue() && hx0.b(((hx0) h30Var6.x.getValue()).a) && hx0.b(((hx0) h30Var6.y.getValue()).a);
                                float f2 = iv0.a;
                                j70 j70VarP3 = !z10 ? m10.p(g70Var2, new hv0(vr0Var, h30Var6, lw0Var3, ab0Var5)) : g70Var2;
                                zH7 = vfVar3.h(cw0Var2);
                                objAk9 = vfVar3.ak();
                                if (!zH7 || objAk9 == n31Var3) {
                                    objAk9 = new pi(cw0Var2, 0);
                                    vfVar3.be(objAk9);
                                }
                                pk.b(cw0Var2, (cv) objAk9, vfVar3);
                                zH8 = vfVar3.h(h30Var6) | vfVar3.h(qw0Var3) | (i16 != 4) | ((i12 <= 32 && vfVar3.f(eyVar)) || (i22 & 48) == 32);
                                objAk10 = vfVar3.ak();
                                if (zH8 || objAk10 == n31Var3) {
                                    qi qiVar = new qi(h30Var6, qw0Var3, lw0Var3, eyVar, 0);
                                    eyVar5 = eyVar;
                                    vfVar3.be(qiVar);
                                    objAk10 = qiVar;
                                } else {
                                    eyVar5 = eyVar;
                                }
                                pk.b(eyVar5, (cv) objAk10, vfVar3);
                                j70VarP = g70Var2;
                                cw0Var3 = cw0Var2;
                                ysVar3 = ysVar2;
                                j70 j70VarP4 = m10.p(j70VarP, new sv0(h30Var6, cw0Var3, lw0Var, true, i2 != 1, ab0Var5, vz0Var, h30Var6.t, eyVar5.e));
                                boolean zBooleanValue = ((Boolean) w80Var.getValue()).booleanValue();
                                k3Var2 = k3Var;
                                zH9 = vfVar3.h(h30Var6) | ((i12 <= 32 && vfVar3.f(eyVar5)) || (i22 & 48) == 32) | vfVar3.h(k3Var2);
                                objAk11 = vfVar3.ak();
                                if (zH9 || objAk11 == n31Var3) {
                                    objAk11 = new gj(h30Var6, ysVar3, eyVar5, k3Var2);
                                    vfVar3.be(objAk11);
                                }
                                j70 j70VarC4 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(j70Var, k3Var2, h30Var6, cw0Var3).c(androidx.compose.foundation.text.handwriting.a.a((pu) objAk11, zBooleanValue)).c(j70Var2), new a2(20, ssVar2, h30Var6)), new a2(11, h30Var6, cw0Var3)).c(j70VarP4);
                                ab0 ab0Var10 = ab0Var5;
                                zv0 zv0Var3 = zv0Var;
                                j70 j70VarD2 = androidx.compose.ui.layout.a.d(m10.p(j70VarC4, new wb(zv0Var3, z2, g80Var)).c(j70VarC3).c(appendedSemanticsElement), new wi(h30Var6, 0));
                                z9 = !z2 && h30Var6.b() && ((Boolean) h30Var6.q.getValue()).booleanValue() && ((Boolean) ((b30) b21Var3).a.getValue()).booleanValue();
                                if (z9 && u50.a()) {
                                    j70VarP = m10.p(j70VarP, new iw0(0, cw0Var3));
                                }
                                vf vfVar6 = vfVar;
                                d(j70VarD2, cw0Var3, t1.aq(-374338080, new ui(teVar, h30Var6, nx0Var, i3, i2, zv0Var3, lw0Var, g11Var, j70VarP3, j70VarA, j70VarD, j70VarP, t8Var, cw0Var3, z9, cvVar2, ab0Var10, emVar2), vfVar6), vfVar6, 384);
                                vfVar4 = vfVar6;
                            } else {
                                h30Var3 = h30Var2;
                            }
                            z7 = true;
                            z8 = z7 | zF3;
                            Object objAk182 = vfVar3.ak();
                            if (z8) {
                                ab0Var3 = ab0Var2;
                                j70Var2 = j70VarC2;
                                h30Var4 = h30Var3;
                                i3Var = new i3(h30Var4, w80VarP, qw0Var, cw0Var, eyVar3, null, 2);
                                w80Var = w80VarP;
                                qw0Var2 = qw0Var;
                                eyVar4 = eyVar3;
                                vfVar3.be(i3Var);
                                pk.d(vfVar3, (gv) i3Var, wz0.a);
                                zH2 = vfVar3.h(h30Var4);
                                objAk6 = vfVar3.ak();
                                if (!zH2) {
                                    objAk6 = new wi(h30Var4, 1);
                                    vfVar3.be(objAk6);
                                    c cVar2 = new c((cv) objAk6, null, 17);
                                    g70Var = g70.a;
                                    j70VarC = g70Var.c(new SuspendPointerInputElement(8675309, null, new ut0(cVar2), 6));
                                    zH3 = vfVar3.h(h30Var4) | (i24 != 16384) | (i23 != 2048) | vfVar3.h(ab0Var3) | vfVar3.h(cw0Var);
                                    objAk7 = vfVar3.ak();
                                    if (zH3) {
                                        ab0 ab0Var92 = ab0Var3;
                                        j70Var3 = j70VarC;
                                        zi ziVar2 = new zi(h30Var4, ysVar2, z2, cw0Var, ab0Var92);
                                        h30Var5 = h30Var4;
                                        ab0Var4 = ab0Var92;
                                        vfVar3.be(ziVar2);
                                        objAk7 = ziVar2;
                                        if (!z2) {
                                        }
                                        bu buVar2 = cw0Var.u;
                                        aw0 aw0Var2 = cw0Var.t;
                                        j70 j70VarC32 = j70VarP2.c(new SuspendPointerInputElement(buVar2, aw0Var2, new ut0(new w8(buVar2, aw0Var2, (ji) null, 11)), 4)).c(new PointerHoverIconModifierElement());
                                        i14 = i13;
                                        zH4 = vfVar3.h(h30Var5) | (i14 != 4) | vfVar3.h(ab0Var4);
                                        objAk8 = vfVar3.ak();
                                        if (!zH4) {
                                            objAk8 = new g5(h30Var5, lw0Var2, ab0Var4, 3);
                                            vfVar3.be(objAk8);
                                            j70 j70VarA2 = androidx.compose.ui.draw.a.a((cv) objAk8);
                                            b21Var2 = b21Var;
                                            zH5 = vfVar3.h(h30Var5) | (i23 != 2048) | vfVar3.f(b21Var2) | vfVar3.h(cw0Var) | (i14 != 4) | vfVar3.h(ab0Var4);
                                            Object objAk192 = vfVar3.ak();
                                            if (zH5) {
                                                lw0 lw0Var52 = lw0Var2;
                                                i15 = i14;
                                                ab0Var5 = ab0Var4;
                                                h30Var6 = h30Var5;
                                                g70Var2 = g70Var;
                                                yiVar = new yi(h30Var6, z2, b21Var2, cw0Var, lw0Var52, ab0Var5);
                                                b21Var3 = b21Var2;
                                                vfVar3.be(yiVar);
                                                j70 j70VarD3 = androidx.compose.ui.layout.a.d(g70Var2, (cv) yiVar);
                                                jy0Var4 = jy0Var3;
                                                if (i12 <= 32) {
                                                    zH6 = vfVar3.h(jy0Var4) | (i15 != 4) | (i23 != 2048) | vfVar3.g(false) | (i24 != 16384) | vfVar3.h(h30Var6) | vfVar3.h(ab0Var5) | vfVar3.h(cw0Var) | ((i12 <= 32 && vfVar3.f(eyVar4)) || (i22 & 48) == 32);
                                                    Object objAk202 = vfVar3.ak();
                                                    if (zH6) {
                                                        ey eyVar62 = eyVar4;
                                                        cw0Var2 = cw0Var;
                                                        h30 h30Var82 = h30Var6;
                                                        i16 = i15;
                                                        qw0Var3 = qw0Var2;
                                                        fjVar = new fj(jy0Var4, lw0Var, z2, eyVar62, h30Var82, ab0Var5, cw0Var2, ysVar2);
                                                        lw0Var3 = lw0Var;
                                                        h30Var6 = h30Var82;
                                                        vfVar3.be(fjVar);
                                                        AtomicInteger atomicInteger2 = ro0.a;
                                                        AppendedSemanticsElement appendedSemanticsElement2 = new AppendedSemanticsElement((cv) fjVar, true);
                                                        if (z2) {
                                                            float f22 = iv0.a;
                                                            if (!z10) {
                                                            }
                                                            zH7 = vfVar3.h(cw0Var2);
                                                            objAk9 = vfVar3.ak();
                                                            if (!zH7) {
                                                                objAk9 = new pi(cw0Var2, 0);
                                                                vfVar3.be(objAk9);
                                                                pk.b(cw0Var2, (cv) objAk9, vfVar3);
                                                                if (i12 <= 32) {
                                                                    zH8 = vfVar3.h(h30Var6) | vfVar3.h(qw0Var3) | (i16 != 4) | ((i12 <= 32 && vfVar3.f(eyVar)) || (i22 & 48) == 32);
                                                                    objAk10 = vfVar3.ak();
                                                                    if (zH8) {
                                                                        qi qiVar2 = new qi(h30Var6, qw0Var3, lw0Var3, eyVar, 0);
                                                                        eyVar5 = eyVar;
                                                                        vfVar3.be(qiVar2);
                                                                        objAk10 = qiVar2;
                                                                        pk.b(eyVar5, (cv) objAk10, vfVar3);
                                                                        j70VarP = g70Var2;
                                                                        cw0Var3 = cw0Var2;
                                                                        ysVar3 = ysVar2;
                                                                        j70 j70VarP42 = m10.p(j70VarP, new sv0(h30Var6, cw0Var3, lw0Var, true, i2 != 1, ab0Var5, vz0Var, h30Var6.t, eyVar5.e));
                                                                        boolean zBooleanValue2 = ((Boolean) w80Var.getValue()).booleanValue();
                                                                        if (i12 <= 32) {
                                                                            k3Var2 = k3Var;
                                                                            zH9 = vfVar3.h(h30Var6) | ((i12 <= 32 && vfVar3.f(eyVar5)) || (i22 & 48) == 32) | vfVar3.h(k3Var2);
                                                                            objAk11 = vfVar3.ak();
                                                                            if (zH9) {
                                                                                objAk11 = new gj(h30Var6, ysVar3, eyVar5, k3Var2);
                                                                                vfVar3.be(objAk11);
                                                                                j70 j70VarC42 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(j70Var, k3Var2, h30Var6, cw0Var3).c(androidx.compose.foundation.text.handwriting.a.a((pu) objAk11, zBooleanValue2)).c(j70Var2), new a2(20, ssVar2, h30Var6)), new a2(11, h30Var6, cw0Var3)).c(j70VarP42);
                                                                                ab0 ab0Var102 = ab0Var5;
                                                                                zv0 zv0Var32 = zv0Var;
                                                                                j70 j70VarD22 = androidx.compose.ui.layout.a.d(m10.p(j70VarC42, new wb(zv0Var32, z2, g80Var)).c(j70VarC32).c(appendedSemanticsElement2), new wi(h30Var6, 0));
                                                                                if (z2) {
                                                                                    if (z9) {
                                                                                        j70VarP = m10.p(j70VarP, new iw0(0, cw0Var3));
                                                                                    }
                                                                                    vf vfVar62 = vfVar;
                                                                                    d(j70VarD22, cw0Var3, t1.aq(-374338080, new ui(teVar, h30Var6, nx0Var, i3, i2, zv0Var32, lw0Var, g11Var, j70VarP3, j70VarA2, j70VarD3, j70VarP, t8Var, cw0Var3, z9, cvVar2, ab0Var102, emVar2), vfVar62), vfVar62, 384);
                                                                                    vfVar4 = vfVar62;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            k3Var2 = k3Var;
                                                                            zH9 = vfVar3.h(h30Var6) | ((i12 <= 32 && vfVar3.f(eyVar5)) || (i22 & 48) == 32) | vfVar3.h(k3Var2);
                                                                            objAk11 = vfVar3.ak();
                                                                            if (zH9) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    zH8 = vfVar3.h(h30Var6) | vfVar3.h(qw0Var3) | (i16 != 4) | ((i12 <= 32 && vfVar3.f(eyVar)) || (i22 & 48) == 32);
                                                                    objAk10 = vfVar3.ak();
                                                                    if (zH8) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zH6 = vfVar3.h(jy0Var4) | (i15 != 4) | (i23 != 2048) | vfVar3.g(false) | (i24 != 16384) | vfVar3.h(h30Var6) | vfVar3.h(ab0Var5) | vfVar3.h(cw0Var) | ((i12 <= 32 && vfVar3.f(eyVar4)) || (i22 & 48) == 32);
                                                    Object objAk2022 = vfVar3.ak();
                                                    if (zH6) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            eyVar2 = eyVar;
                        }
                        i13 = i25;
                        boolean z11 = (i22 & 48) != 32;
                        zH = zH11 | z11 | vfVar2.h(ab0Var8) | vfVar2.h(xjVar) | vfVar2.h(t8Var2) | vfVar2.h(cw0Var4);
                        Object objAk172 = vfVar2.ak();
                        if (zH) {
                            ab0Var2 = ab0Var8;
                            vfVar3 = vfVar2;
                            qw0Var = qw0Var4;
                            h30Var2 = h30Var7;
                            ysVar2 = ysVar5;
                            eyVar3 = eyVar2;
                            zv0Var = zv0Var2;
                            jy0Var3 = jy0Var2;
                            k3Var = k3Var3;
                            ssVar2 = ssVar4;
                            g80Var2 = g80Var;
                            n31Var3 = n31Var2;
                            xiVar = new xi(h30Var2, z2, qw0Var, lw0Var, eyVar3, ab0Var2, cw0Var4, xjVar, t8Var2);
                            lw0Var2 = lw0Var;
                            cw0Var = cw0Var4;
                            t8Var = t8Var2;
                            z6 = z2;
                            vfVar3.be(xiVar);
                            j70 j70VarC22 = androidx.compose.foundation.a.c(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(ysVar2), (cv) xiVar), z6, g80Var2);
                            w80 w80VarP2 = bo0.p(Boolean.valueOf(z6), vfVar3);
                            boolean zF32 = vfVar3.f(w80VarP2) | vfVar3.h(h30Var2) | vfVar3.h(qw0Var) | vfVar3.h(cw0Var);
                            if (i12 > 32) {
                                h30Var3 = h30Var2;
                                if ((i22 & 48) != 32) {
                                    z7 = true;
                                }
                                z8 = z7 | zF32;
                                Object objAk1822 = vfVar3.ak();
                                if (z8) {
                                }
                            }
                        }
                    } else {
                        Long l2 = vz0Var.d;
                        if (jCurrentTimeMillis > (l2 != null ? l2.longValue() : 0L) + ((long) 5000)) {
                        }
                        objAk3 = vfVar.ak();
                        if (objAk3 != n31Var2) {
                        }
                        cw0 cw0Var42 = (cw0) objAk3;
                        ab0 ab0Var82 = ab0Var;
                        cw0Var42.b = ab0Var82;
                        cw0Var42.c = h30Var7.t;
                        cw0Var42.d = h30Var7;
                        cw0Var42.e.setValue(lw0Var);
                        cw0Var42.f = (gc) vfVar2.j(og.e);
                        cw0Var42.g = (ox0) vfVar2.j(og.q);
                        cw0Var42.h = (ix) vfVar2.j(og.l);
                        ys ysVar52 = ysVar;
                        cw0Var42.i = ysVar52;
                        cw0Var42.j.setValue(true);
                        cw0Var42.k.setValue(Boolean.valueOf(z2));
                        objAk4 = vfVar2.ak();
                        if (objAk4 == n31Var2) {
                        }
                        xj xjVar2 = ((pg) objAk4).d;
                        objAk5 = vfVar2.ak();
                        if (objAk5 == n31Var2) {
                        }
                        t8 t8Var22 = (t8) objAk5;
                        int i222 = i11;
                        int i232 = i222 & 7168;
                        int i242 = i222 & 57344;
                        ss ssVar42 = ssVar;
                        int i252 = i10;
                        boolean zH112 = (i242 != 16384) | (i232 != 2048) | vfVar2.h(h30Var7) | vfVar2.h(qw0Var4) | (i252 != 4);
                        i12 = (i222 & 112) ^ 48;
                        if (i12 <= 32) {
                        }
                        i13 = i252;
                        if ((i222 & 48) != 32) {
                        }
                        zH = zH112 | z11 | vfVar2.h(ab0Var82) | vfVar2.h(xjVar2) | vfVar2.h(t8Var22) | vfVar2.h(cw0Var42);
                        Object objAk1722 = vfVar2.ak();
                        if (zH) {
                        }
                    }
                }
                z5 = false;
                if (hx0Var3 != null) {
                }
                if (z4) {
                    pp ppVar22 = (pp) f1Var2.f;
                    ppVar22.d = -1;
                    ppVar22.e = -1;
                    lw0VarA = lw0.a(lw0Var, null, 0L, 3);
                    lw0 lw0Var42 = (lw0) f1Var2.e;
                    f1Var2.e = lw0VarA;
                    if (uw0Var != null) {
                    }
                    objAk2 = vfVar5.ak();
                    n31Var2 = n31Var;
                    if (objAk2 == n31Var2) {
                    }
                    vz0Var = (vz0) objAk2;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (vz0Var.e) {
                    }
                }
            }
            wc0Var = wc0.d;
            Object[] objArr2 = {wc0Var};
            f1 f1Var3 = zv0.f;
            zF = vfVar5.f(wc0Var);
            objAk = vfVar5.ak();
            if (!zF) {
                objAk = new b(7, wc0Var);
                vfVar5.be(objAk);
                zv0 zv0Var22 = (zv0) m10.aq(objArr2, f1Var3, (pu) objAk, vfVar5, 0, 4);
                int i202 = i18 & 14;
                i9 = (i202 != 4 ? i8 : 0) | ((i18 & 57344) != 16384 ? i8 : 0);
                Object objAk152 = vfVar5.ak();
                if (i9 == 0) {
                    jy0 jy0VarX2 = pk.x(g11Var, b6Var3);
                    if (hx0Var2 == null) {
                    }
                    vfVar5.be(jy0Var);
                    obj = jy0Var;
                    jy0 jy0Var52 = (jy0) obj;
                    b6 b6Var42 = jy0Var52.a;
                    ab0 ab0Var72 = jy0Var52.b;
                    hi0VarW = vfVar5.w();
                    if (hi0VarW != null) {
                    }
                }
            }
        }
        hi0 hi0VarS = vfVar4.s();
        if (hi0VarS != null) {
            hi0VarS.d = new vi(lw0Var, cvVar, j70Var, nx0Var, g11Var, cvVar2, g80Var, vr0Var, z, i2, i3, eyVar, s10Var, z2, teVar, i4, i5);
        }
    }

    public static final void d(j70 j70Var, cw0 cw0Var, te teVar, vf vfVar, int i2) {
        vfVar.aw(-20551815);
        int i3 = (vfVar.f(j70Var) ? 4 : 2) | i2 | (vfVar.h(cw0Var) ? 32 : 16);
        if ((i3 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            p60 p60VarD = m8.d(bw.e, true);
            int iHashCode = Long.hashCode(vfVar.ar);
            a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, j70Var);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, jf.e, p60VarD);
            jo0.h(vfVar, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var);
            }
            jo0.h(vfVar, jf.c, j70VarAn);
            i60.b(cw0Var, teVar, vfVar, (i3 >> 3) & 126);
            vfVar.q(true);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new hj(j70Var, cw0Var, teVar, i2);
        }
    }

    public static o3 e(String str, nx0 nx0Var, long j2, em emVar, qt qtVar, int i2, int i3) {
        rq rqVar = rq.d;
        return new o3(new s3(str, nx0Var, rqVar, rqVar, qtVar, emVar), i2, 1, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(cw0 cw0Var, vf vfVar, int i2) {
        vfVar.aw(-1436003720);
        int i3 = 3;
        if ((((vfVar.h(cw0Var) ? 4 : 2) | i2) & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            h30 h30Var = cw0Var.d;
            int i4 = 0;
            if (h30Var != null) {
                int i5 = 1;
                if (((Boolean) h30Var.o.getValue()).booleanValue()) {
                    h30 h30Var2 = cw0Var.d;
                    ji jiVar = null;
                    b6 b6Var = h30Var2 != null ? h30Var2.a.a : null;
                    if (b6Var == null || b6Var.e.length() <= 0) {
                        vfVar.av(-284257090);
                        vfVar.q(false);
                    } else {
                        vfVar.av(-285446808);
                        boolean zF = vfVar.f(cw0Var);
                        Object objAk = vfVar.ak();
                        n31 n31Var = nf.a;
                        if (zF || objAk == n31Var) {
                            objAk = new aw0(cw0Var, i4);
                            vfVar.be(objAk);
                        }
                        fv0 fv0Var = (fv0) objAk;
                        em emVar = (em) vfVar.j(og.h);
                        ab0 ab0Var = cw0Var.b;
                        long j2 = cw0Var.j().b;
                        int i6 = hx0.c;
                        int iD = ab0Var.d((int) (j2 >> 32));
                        h30 h30Var3 = cw0Var.d;
                        ax0 ax0VarD = h30Var3 != null ? h30Var3.d() : null;
                        ax0VarD.getClass();
                        zw0 zw0Var = ax0VarD.a;
                        ri0 ri0VarC = zw0Var.c(i60.t(iD, 0, zw0Var.a.a.e.length()));
                        long jH = d41.h((emVar.x(iv0.a) / 2) + ri0VarC.a, ri0VarC.d);
                        boolean zE = vfVar.e(jH);
                        Object objAk2 = vfVar.ak();
                        if (zE || objAk2 == n31Var) {
                            objAk2 = new jj(jH);
                            vfVar.be(objAk2);
                        }
                        bb0 bb0Var = (bb0) objAk2;
                        boolean zH = vfVar.h(fv0Var) | vfVar.h(cw0Var);
                        Object objAk3 = vfVar.ak();
                        if (zH || objAk3 == n31Var) {
                            objAk3 = new w8(fv0Var, cw0Var, jiVar, i3);
                            vfVar.be(objAk3);
                        }
                        j70 j70VarC = g70.a.c(new SuspendPointerInputElement(fv0Var, null, new ut0((gv) objAk3), 6));
                        boolean zE2 = vfVar.e(jH);
                        Object objAk4 = vfVar.ak();
                        if (zE2 || objAk4 == n31Var) {
                            objAk4 = new o2(jH, i5);
                            vfVar.be(objAk4);
                        }
                        q2.a(bb0Var, ro0.a(j70VarC, (cv) objAk4), 0L, vfVar, 0);
                        vfVar.q(false);
                    }
                }
            }
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j(i2, 6, cw0Var);
        }
    }

    public static final void g(cw0 cw0Var, boolean z, vf vfVar, int i2) {
        int i3;
        ax0 ax0VarD;
        vfVar.aw(626339208);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.h(cw0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.g(z) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else if (z) {
            vfVar.av(-1286242594);
            h30 h30Var = cw0Var.d;
            zw0 zw0Var = null;
            if (h30Var != null && (ax0VarD = h30Var.d()) != null) {
                zw0 zw0Var2 = ax0VarD.a;
                h30 h30Var2 = cw0Var.d;
                if (!(h30Var2 != null ? h30Var2.p : true)) {
                    zw0Var = zw0Var2;
                }
            }
            if (zw0Var == null) {
                vfVar.av(-1285984396);
            } else {
                vfVar.av(-1285984395);
                if (hx0.b(cw0Var.j().b)) {
                    vfVar.av(-1679637798);
                    vfVar.q(false);
                } else {
                    vfVar.av(-1680616096);
                    int iD = cw0Var.b.d((int) (cw0Var.j().b >> 32));
                    int iD2 = cw0Var.b.d((int) (cw0Var.j().b & 4294967295L));
                    oj0 oj0VarA = zw0Var.a(iD);
                    oj0 oj0VarA2 = zw0Var.a(Math.max(iD2 - 1, 0));
                    h30 h30Var3 = cw0Var.d;
                    if (h30Var3 == null || !((Boolean) h30Var3.m.getValue()).booleanValue()) {
                        vfVar.av(-1679975078);
                        vfVar.q(false);
                    } else {
                        vfVar.av(-1680216289);
                        lI.b(true, oj0VarA, cw0Var, vfVar, ((i3 << 6) & 896) | 6);
                        vfVar.q(false);
                    }
                    h30 h30Var4 = cw0Var.d;
                    if (h30Var4 == null || !((Boolean) h30Var4.n.getValue()).booleanValue()) {
                        vfVar.av(-1679655654);
                        vfVar.q(false);
                    } else {
                        vfVar.av(-1679895904);
                        lI.b(false, oj0VarA2, cw0Var, vfVar, ((i3 << 6) & 896) | 6);
                        vfVar.q(false);
                    }
                    vfVar.q(false);
                }
                h30 h30Var5 = cw0Var.d;
                if (h30Var5 != null) {
                    me0 me0Var = h30Var5.l;
                    if (!f00.h(cw0Var.r.a.e, cw0Var.j().a.e)) {
                        me0Var.setValue(Boolean.FALSE);
                    }
                    if (h30Var5.b()) {
                        if (((Boolean) me0Var.getValue()).booleanValue()) {
                            cw0Var.o();
                        } else {
                            cw0Var.k();
                        }
                    }
                }
            }
            vfVar.q(false);
            vfVar.q(false);
        } else {
            vfVar.av(651305535);
            vfVar.q(false);
            cw0Var.k();
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new ij(cw0Var, z, i2);
        }
    }

    public static final int h(j50 j50Var, qx qxVar) {
        j50 j50VarBn = j50Var.bn();
        if (j50VarBn == null) {
            sy.b("Child of " + j50Var + " cannot be null when calculating alignment line");
        }
        if (j50Var.br().a().containsKey(qxVar)) {
            Integer num = (Integer) j50Var.br().a().get(qxVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iBm = j50VarBn.bm(qxVar);
            if (iBm != Integer.MIN_VALUE) {
                j50VarBn.m = true;
                j50Var.n = true;
                j50Var.bz();
                j50VarBn.m = false;
                j50Var.n = false;
                return iBm + ((int) (qxVar instanceof qx ? j50VarBn.bt() & 4294967295L : j50VarBn.bt() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean i(sn snVar, long j2) {
        if (!snVar.d.q) {
            return false;
        }
        yy yyVar = (yy) pk.ay(snVar).ag.g;
        if (!yyVar.ar.q) {
            return false;
        }
        long jAm = yyVar.am(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAm >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAm & 4294967295L));
        long j3 = snVar.t;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final void j(h30 h30Var) {
        uw0 uw0Var = h30Var.e;
        if (uw0Var != null) {
            h30Var.t.g(lw0.a((lw0) h30Var.d.e, null, 0L, 3));
            qw0 qw0Var = uw0Var.a;
            AtomicReference atomicReference = qw0Var.b;
            while (true) {
                if (atomicReference.compareAndSet(uw0Var, null)) {
                    qw0Var.a.g();
                    break;
                } else if (atomicReference.get() != uw0Var) {
                    break;
                }
            }
        }
        h30Var.e = null;
    }

    public static final void k(qw0 qw0Var, h30 h30Var, lw0 lw0Var, ey eyVar, ab0 ab0Var) {
        f1 f1Var = h30Var.d;
        wi wiVar = h30Var.t;
        wi wiVar2 = h30Var.u;
        xi0 xi0Var = new xi0();
        g5 g5Var = new g5(f1Var, wiVar, xi0Var, 8);
        gg0 gg0Var = qw0Var.a;
        gg0Var.a(lw0Var, eyVar, g5Var, wiVar2);
        uw0 uw0Var = new uw0(qw0Var, gg0Var);
        qw0Var.b.set(uw0Var);
        xi0Var.d = uw0Var;
        h30Var.e = uw0Var;
        y(h30Var, lw0Var, ab0Var);
    }

    public static final String l(Object[] objArr, int i2, int i3, t tVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == tVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void m(vq0 vq0Var, List list, jg jgVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iC = vq0Var.c((Il) list.get(i2));
            int iAl = vq0Var.al(vq0Var.b, vq0Var.q(iC));
            Object obj = iAl < vq0Var.g(vq0Var.b, vq0Var.q(iC + 1)) ? vq0Var.c[vq0Var.h(iAl)] : nf.a;
            hi0 hi0Var = obj instanceof hi0 ? (hi0) obj : null;
            if (hi0Var != null) {
                hi0Var.a = jgVar;
            }
        }
    }

    public static float n(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static Map o(Object obj) {
        if ((obj instanceof d10) && !(obj instanceof f10)) {
            ah(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            f00.ac(e2, az0.class.getName());
            throw e2;
        }
    }

    public static void p(int i2, Object obj) {
        if (obj == null || w(i2, obj)) {
            return;
        }
        ah(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final Bundle q(ae0... ae0VarArr) {
        Bundle bundle = new Bundle(ae0VarArr.length);
        for (ae0 ae0Var : ae0VarArr) {
            String str = (String) ae0Var.d;
            Object obj = ae0Var.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final ri0 r(View view, b1 b1Var) {
        int[] iArr = m10.c;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        b1Var.getLocationInWindow(iArr);
        float f2 = i2 - iArr[0];
        float f3 = i3 - iArr[1];
        return new ri0(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static void s(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new sz(2, 36, 1));
        }
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean u(ri0 ri0Var, float f2, float f3) {
        float f4 = ri0Var.a;
        if (f2 > ri0Var.c || f4 > f2) {
            return false;
        }
        return f3 <= ri0Var.d && ri0Var.b <= f3;
    }

    public static Set v() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static boolean w(int i2, Object obj) {
        if (obj instanceof ov) {
            if ((obj instanceof qv ? ((qv) obj).b() : obj instanceof pu ? 0 : obj instanceof cv ? 1 : obj instanceof gv ? 2 : obj instanceof hv ? 3 : obj instanceof iv ? 4 : obj instanceof jv ? 5 : obj instanceof kv ? 6 : obj instanceof lv ? 7 : obj instanceof mv ? 8 : obj instanceof nv ? 9 : obj instanceof qu ? 10 : obj instanceof ru ? 11 : obj instanceof tu ? 13 : obj instanceof uu ? 14 : obj instanceof vu ? 15 : obj instanceof wu ? 16 : obj instanceof xu ? 17 : obj instanceof yu ? 18 : obj instanceof zu ? 19 : obj instanceof dv ? 20 : obj instanceof ev ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final void y(h30 h30Var, lw0 lw0Var, ab0 ab0Var) {
        xq0 xq0Var = (xq0) fr0.b.n();
        cv cvVarE = xq0Var != null ? xq0Var.e() : null;
        xq0 xq0VarN = q6.n(xq0Var);
        try {
            ax0 ax0VarD = h30Var.d();
            if (ax0VarD == null) {
                return;
            }
            uw0 uw0Var = h30Var.e;
            if (uw0Var == null) {
                return;
            }
            d20 d20VarC = h30Var.c();
            if (d20VarC == null) {
                return;
            }
            bo0.n(lw0Var, h30Var.a, ax0VarD.a, d20VarC, uw0Var, h30Var.b(), ab0Var);
        } finally {
            q6.q(xq0Var, xq0VarN, cvVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(i70 i70Var, pu puVar) {
        wa0 wa0Var = i70Var.j;
        if (wa0Var == null) {
            wa0Var = new wa0((va0) i70Var);
            i70Var.j = wa0Var;
        }
        pk.az(i70Var).getSnapshotObserver().a(wa0Var, f50.j, puVar);
    }
}
