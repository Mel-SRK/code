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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ci0 r11, defpackage.gv r12, defpackage.vf r13, int r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.a(ci0, gv, vf, int):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.ji r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.sm
            if (r0 == 0) goto Lae
            sm r9 = (defpackage.sm) r9
            kotlinx.coroutines.a r0 = r9.g
            ki r1 = r9.h
            java.lang.Throwable r2 = defpackage.tj0.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            wd r3 = new wd
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            pj r2 = r1.e()
            boolean r2 = r0.e(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.i = r3
            r9.f = r4
            pj r10 = r1.e()
            r0.d(r10, r9)
            return
        L2f:
            cr r0 = defpackage.ux0.a()
            long r5 = r0.f
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.i = r3
            r9.f = r4
            r0.l(r9)
            goto La8
        L46:
            r0.n(r4)
            pj r2 = r1.e()     // Catch: java.lang.Throwable -> L69
            bw r3 = defpackage.bw.ae     // Catch: java.lang.Throwable -> L69
            nj r2 = r2.k(r3)     // Catch: java.lang.Throwable -> L69
            t00 r2 = (defpackage.t00) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.q()     // Catch: java.lang.Throwable -> L69
            sj0 r10 = defpackage.i60.aa(r10)     // Catch: java.lang.Throwable -> L69
            r9.h(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.j     // Catch: java.lang.Throwable -> L69
            pj r3 = r1.e()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.t1.aw(r3, r2)     // Catch: java.lang.Throwable -> L69
            jq r5 = defpackage.t1.h     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            uz0 r5 = defpackage.e00.ap(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.h(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.bh()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.t1.at(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.s()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.h(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.bh()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.t1.at(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.i(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.h(r4)
            throw r9
        Lae:
            r9.h(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.ad(ji, java.lang.Object):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ci0[] r8, defpackage.gv r9, defpackage.vf r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.aw(r0)
            xz r0 = r10.w
            androidx.compose.runtime.internal.a r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            ob0 r3 = defpackage.xf.b
            r10.at(r2, r3)
            boolean r2 = r10.aq
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.a.g
            androidx.compose.runtime.internal.a r2 = defpackage.d41.as(r8, r1, r2)
            androidx.compose.runtime.internal.a r1 = r10.bd(r1, r2)
            r10.ai = r3
        L25:
            r2 = r4
            goto L72
        L27:
            rq0 r2 = r10.af
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            r2.getClass()
            androidx.compose.runtime.internal.a r2 = (androidx.compose.runtime.internal.a) r2
            rq0 r5 = r10.af
            int r6 = r5.g
            java.lang.Object r5 = r5.h(r6, r3)
            r5.getClass()
            androidx.compose.runtime.internal.a r5 = (androidx.compose.runtime.internal.a) r5
            androidx.compose.runtime.internal.a r6 = defpackage.d41.as(r8, r1, r5)
            boolean r7 = r10.z()
            if (r7 == 0) goto L63
            boolean r7 = r10.x
            if (r7 != 0) goto L63
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r1 = r10.k
            rq0 r5 = r10.af
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.k = r5
            r1 = r2
            goto L25
        L63:
            androidx.compose.runtime.internal.a r1 = r10.bd(r1, r6)
            boolean r5 = r10.x
            if (r5 != 0) goto L71
            boolean r2 = defpackage.f00.h(r1, r2)
            if (r2 != 0) goto L25
        L71:
            r2 = r3
        L72:
            if (r2 == 0) goto L7b
            boolean r5 = r10.aq
            if (r5 != 0) goto L7b
            r10.ai(r1)
        L7b:
            boolean r5 = r10.v
            r0.c(r5)
            r10.v = r2
            r10.aj = r1
            r2 = 202(0xca, float:2.83E-43)
            ob0 r5 = defpackage.xf.c
            r10.ar(r2, r5, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.f(r10, r1)
            r10.q(r4)
            r10.q(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La3
            goto La4
        La3:
            r3 = r4
        La4:
            r10.v = r3
            r0 = 0
            r10.aj = r0
            hi0 r10 = r10.s()
            if (r10 == 0) goto Lb7
            re r0 = new re
            r1 = 2
            r0.<init>(r11, r1, r8, r9)
            r10.d = r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.b(ci0[], gv, vf, int):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.lw0 r66, defpackage.cv r67, defpackage.j70 r68, defpackage.nx0 r69, defpackage.g11 r70, defpackage.cv r71, defpackage.g80 r72, defpackage.vr0 r73, boolean r74, int r75, int r76, defpackage.ey r77, defpackage.s10 r78, boolean r79, defpackage.te r80, defpackage.vf r81, int r82, int r83) {
        /*
            Method dump skipped, instruction units count: 2529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.c(lw0, cv, j70, nx0, g11, cv, g80, vr0, boolean, int, int, ey, s10, boolean, te, vf, int, int):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.cw0 r14, defpackage.vf r15, int r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.f(cw0, vf, int):void");
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
