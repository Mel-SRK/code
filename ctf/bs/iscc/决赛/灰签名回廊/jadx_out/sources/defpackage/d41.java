package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.DragEvent;
import androidx.compose.runtime.internal.a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class d41 {
    public static final te a = new te(-2076472298, false, new md(1, 0));
    public static final te b = new te(493487057, false, new md(2, 0));
    public static final te c = new te(-803217428, false, new md(3, 0));
    public static final te d = new te(-1871233701, false, new md(4, 0));
    public static final te e = new te(1092606001, false, new xe());
    public static final Class[] f = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final n31 g = new n31(21);
    public static final x3 h = new x3(1000);
    public static final f1 i;
    public static final f1 j;
    public static final f1 k;
    public static final x3 l;

    static {
        new x3(1007);
        new x3(1008);
        new x3(1002);
        int i2 = 17;
        i = new f1(i2, new im0(5), new c6(27));
        j = new f1(i2, new im0(6), new c6(28));
        k = new f1(i2, new im0(7), new c6(29));
        l = new x3(1008);
    }

    public static final void aa(l20 l20Var) {
        pk.ay(l20Var).aa();
    }

    public static final boolean ab(pg0 pg0Var, long j2, long j3) {
        int i2 = pg0Var.i == 1 ? 1 : 0;
        long j4 = pg0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean ac(yk0 yk0Var) {
        long j2 = yk0Var.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == yk0Var.f && j2 == yk0Var.g && j2 == yk0Var.h;
    }

    public static final boolean ad(long j2) {
        return (j2 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final lk ae(gt gtVar) {
        int iOrdinal = gtVar.bx().ordinal();
        lk lkVar = lk.d;
        if (iOrdinal != 0) {
            lk lkVar2 = lk.e;
            if (iOrdinal == 1) {
                gt gtVarU = t1.u(gtVar);
                if (gtVarU == null) {
                    wc.n("ActiveParent with no focused child");
                    return null;
                }
                lk lkVarAe = ae(gtVarU);
                if (lkVarAe == lkVar) {
                    lkVarAe = null;
                }
                if (lkVarAe != null) {
                    return lkVarAe;
                }
                if (gtVar.s) {
                    return lkVar;
                }
                gtVar.s = true;
                try {
                    ws wsVarBv = gtVar.bv();
                    ss focusOwner = pk.az(gtVar).getFocusOwner();
                    gt gtVar2 = ((us) focusOwner).h;
                    wsVarBv.k.getClass();
                    gt gtVar3 = ((us) focusOwner).h;
                    return (gtVar2 == gtVar3 || gtVar3 == null) ? lkVar : ys.d == ys.c ? lkVar2 : lk.f;
                } finally {
                    gtVar.s = false;
                }
            }
            if (iOrdinal == 2) {
                return lkVar2;
            }
            if (iOrdinal != 3) {
                wc.l();
                return null;
            }
        }
        return lkVar;
    }

    public static final lk af(gt gtVar) {
        if (!gtVar.t) {
            gtVar.t = true;
            try {
                ws wsVarBv = gtVar.bv();
                ss focusOwner = pk.az(gtVar).getFocusOwner();
                gt gtVar2 = ((us) focusOwner).h;
                wsVarBv.j.getClass();
                gt gtVar3 = ((us) focusOwner).h;
                if (gtVar2 != gtVar3 && gtVar3 != null) {
                    return ys.d == ys.c ? lk.e : lk.f;
                }
            } finally {
                gtVar.t = false;
            }
        }
        return lk.d;
    }

    public static final lk ag(gt gtVar) {
        i70 i70VarM;
        da0 da0Var;
        int iOrdinal = gtVar.bx().ordinal();
        lk lkVar = lk.d;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                gt gtVarU = t1.u(gtVar);
                if (gtVarU != null) {
                    return ae(gtVarU);
                }
                wc.n("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wc.l();
                    return null;
                }
                if (!gtVar.d.q) {
                    sy.b("visitAncestors called on an unattached node");
                }
                i70 i70Var = gtVar.d.h;
                s20 s20VarAy = pk.ay(gtVar);
                loop0: while (true) {
                    if (s20VarAy == null) {
                        i70VarM = null;
                        break;
                    }
                    if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                        while (i70Var != null) {
                            if ((i70Var.f & 1024) != 0) {
                                i70VarM = i70Var;
                                a90 a90Var = null;
                                while (i70VarM != null) {
                                    if (i70VarM instanceof gt) {
                                        break loop0;
                                    }
                                    if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                        int i2 = 0;
                                        for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                            if ((i70Var2.f & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    i70VarM = i70Var2;
                                                } else {
                                                    if (a90Var == null) {
                                                        a90Var = new a90(new i70[16]);
                                                    }
                                                    if (i70VarM != null) {
                                                        a90Var.b(i70VarM);
                                                        i70VarM = null;
                                                    }
                                                    a90Var.b(i70Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    i70VarM = pk.m(a90Var);
                                }
                            }
                            i70Var = i70Var.h;
                        }
                    }
                    s20VarAy = s20VarAy.q();
                    i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                }
                gt gtVar2 = (gt) i70VarM;
                if (gtVar2 == null) {
                    return lkVar;
                }
                int iOrdinal2 = gtVar2.bx().ordinal();
                if (iOrdinal2 == 0) {
                    return af(gtVar2);
                }
                if (iOrdinal2 == 1) {
                    return ag(gtVar2);
                }
                if (iOrdinal2 == 2) {
                    return lk.e;
                }
                if (iOrdinal2 != 3) {
                    wc.l();
                    return null;
                }
                lk lkVarAg = ag(gtVar2);
                lk lkVar2 = lkVarAg != lkVar ? lkVarAg : null;
                return lkVar2 == null ? af(gtVar2) : lkVar2;
            }
        }
        return lkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fd A[ADDED_TO_REGION, LOOP:9: B:144:0x01fd->B:151:0x020d, LOOP_START, PHI: r12
      0x01fd: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:143:0x01fb, B:151:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean ah(defpackage.gt r18) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d41.ah(gt):boolean");
    }

    public static final long ai(pg0 pg0Var, boolean z) {
        long jF = xa0.f(pg0Var.c, pg0Var.g);
        if (z || !pg0Var.b()) {
            return jF;
        }
        return 0L;
    }

    public static final Object aj(a aVar, ai0 ai0Var) {
        ai0Var.getClass();
        Object objB = aVar.get(ai0Var);
        if (objB == null) {
            objB = ai0Var.b();
        }
        return ((i01) objB).a(aVar);
    }

    public static byte[] ak(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] al(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long am(InputStream inputStream, int i2) {
        byte[] bArrAk = ak(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrAk[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static final Object an(Object obj) {
        return obj instanceof wd ? i60.aa(((wd) obj).a) : obj;
    }

    public static final Object ao(ql qlVar, ri0 ri0Var, ki kiVar) {
        r8 r8Var;
        Object objL;
        if (((i70) qlVar).d.q) {
            fa0 fa0VarAx = pk.ax(qlVar);
            if (((i70) qlVar).d.q) {
                r8 z8Var = (r8) lI.f(qlVar, y8.t);
                if (z8Var == null) {
                    z8Var = new z8(qlVar);
                }
                r8Var = z8Var;
            } else {
                r8Var = null;
            }
            if (r8Var != null && (objL = r8Var.l(fa0VarAx, new s0(12, ri0Var, fa0VarAx), kiVar)) == yj.d) {
                return objL;
            }
        }
        return wz0.a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String ap(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String aq(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + m10.aw(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + m10.aw(Float.intBitsToFloat(i2)) + ", " + m10.aw(Float.intBitsToFloat(i3)) + ')';
    }

    public static final int ar(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static final a as(ci0[] ci0VarArr, a aVar, a aVar2) {
        ue0 ue0Var = new ue0(a.g);
        for (ci0 ci0Var : ci0VarArr) {
            ai0 ai0Var = ci0Var.a;
            if (ci0Var.f || !aVar.containsKey(ai0Var)) {
                ue0Var.put(ai0Var, ai0Var.c(ci0Var, (i01) aVar2.get(ai0Var)));
            }
        }
        return ue0Var.a();
    }

    public static void at(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void au(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        at(byteArrayOutputStream, i2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r16, defpackage.j70 r17, defpackage.nx0 r18, int r19, boolean r20, int r21, int r22, defpackage.vf r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d41.f(java.lang.String, j70, nx0, int, boolean, int, int, vf, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    public static final void g(pu puVar, j70 j70Var, boolean z, aq0 aq0Var, s9 s9Var, v9 v9Var, wd0 wd0Var, vf vfVar, int i2) {
        s9 s9Var2;
        v9 v9Var2;
        wd0 wd0Var2;
        boolean z2;
        aq0 aq0Var2;
        s9 s9Var3;
        s9 s9Var4;
        aq0 aq0Var3;
        Object obj;
        long j2;
        Object u9Var;
        v9 v9Var3;
        ?? r1;
        j70 j70Var2;
        s9 s9Var5;
        aq0 aq0Var4;
        boolean z3;
        wd0 wd0Var3;
        v9 v9Var4;
        vfVar.aw(650121315);
        if (((i2 | (vfVar.h(puVar) ? 4 : 2) | 114894208) & 306783379) == 306783378 && vfVar.z()) {
            vfVar.aq();
            j70Var2 = j70Var;
            z3 = z;
            aq0Var4 = aq0Var;
            s9Var5 = s9Var;
            v9Var4 = v9Var;
            wd0Var3 = wd0Var;
        } else {
            vfVar.as();
            if ((i2 & 1) == 0 || vfVar.x()) {
                wd0 wd0Var4 = t9.a;
                aq0 aq0VarA = eq0.a(kr.b, vfVar);
                zc zcVar = (zc) vfVar.j(cd.a);
                s9 s9Var6 = zcVar.ak;
                if (s9Var6 == null) {
                    s9Var2 = new s9(cd.d(zcVar, 26), cd.d(zcVar, kr.h), qc.b(cd.d(zcVar, kr.c), 0.12f), qc.b(cd.d(zcVar, kr.e), 0.38f));
                    zcVar.ak = s9Var2;
                } else {
                    s9Var2 = s9Var6;
                }
                v9Var2 = new v9(kr.a, kr.i, kr.f, kr.g, kr.d);
                wd0Var2 = t9.a;
                z2 = true;
                aq0Var2 = aq0VarA;
                s9Var3 = s9Var2;
            } else {
                vfVar.aq();
                z2 = z;
                aq0Var2 = aq0Var;
                s9Var3 = s9Var;
                v9Var2 = v9Var;
                wd0Var2 = wd0Var;
            }
            vfVar.r();
            vfVar.av(-239156623);
            Object objAk = vfVar.ak();
            n31 n31Var = nf.a;
            Object obj2 = objAk;
            if (objAk == n31Var) {
                g80 g80Var = new g80();
                vfVar.be(g80Var);
                obj2 = g80Var;
            }
            g80 g80Var2 = (g80) obj2;
            vfVar.q(false);
            long j3 = z2 ? s9Var3.a : s9Var3.c;
            long j4 = z2 ? s9Var3.b : s9Var3.d;
            vfVar.av(-239150048);
            r5 r5Var = null;
            boolean z4 = false;
            boolean z5 = false;
            if (v9Var2 == null) {
                s9Var4 = s9Var3;
                v9Var3 = v9Var2;
                aq0Var3 = aq0Var2;
                r1 = 0;
                j2 = j4;
            } else {
                Object objAk2 = vfVar.ak();
                Object obj3 = objAk2;
                if (objAk2 == n31Var) {
                    pr0 pr0Var = new pr0();
                    vfVar.be(pr0Var);
                    obj3 = pr0Var;
                }
                pr0 pr0Var2 = (pr0) obj3;
                boolean zF = vfVar.f(g80Var2);
                Object objAk3 = vfVar.ak();
                Object obj4 = objAk3;
                if (zF || objAk3 == n31Var) {
                    c cVar = new c(g80Var2, pr0Var2, z4 ? 1 : 0, 8);
                    vfVar.be(cVar);
                    obj4 = cVar;
                }
                pk.d(vfVar, (gv) obj4, g80Var2);
                yz yzVar = (yz) kc.ax(pr0Var2);
                float f2 = !z2 ? v9Var2.e : yzVar instanceof jh0 ? v9Var2.b : yzVar instanceof wx ? v9Var2.d : yzVar instanceof ps ? v9Var2.c : v9Var2.a;
                Object objAk4 = vfVar.ak();
                if (objAk4 == n31Var) {
                    s9Var4 = s9Var3;
                    aq0Var3 = aq0Var2;
                    j5 j5Var = new j5(new mn(f2), k01.c, z5 ? 1 : 0, 12);
                    vfVar.be(j5Var);
                    obj = j5Var;
                } else {
                    s9Var4 = s9Var3;
                    aq0Var3 = aq0Var2;
                    obj = objAk4;
                }
                j5 j5Var2 = (j5) obj;
                mn mnVar = new mn(f2);
                boolean zH = vfVar.h(j5Var2) | vfVar.c(f2) | vfVar.f(v9Var2) | vfVar.h(yzVar);
                Object objAk5 = vfVar.ak();
                if (zH || objAk5 == n31Var) {
                    j2 = j4;
                    v9Var3 = v9Var2;
                    u9Var = new u9(j5Var2, f2, z2, v9Var3, yzVar, null);
                    vfVar.be(u9Var);
                } else {
                    u9Var = objAk5;
                    j2 = j4;
                    v9Var3 = v9Var2;
                }
                pk.d(vfVar, (gv) u9Var, mnVar);
                r5Var = j5Var2.c;
                r1 = 0;
            }
            vfVar.q(r1);
            float f3 = r5Var != null ? ((mn) r5Var.e.getValue()).d : (float) r1;
            j70Var2 = j70Var;
            j70 j70VarA = ro0.a(j70Var2, q0.t);
            te teVarAq = t1.aq(956488494, new k2(j2, wd0Var2, 1), vfVar);
            qg qgVar = ot0.a;
            float f4 = ((mn) vfVar.j(qgVar)).d + ((float) r1);
            ci0[] ci0VarArr = {jh.a.a(new qc(j2)), qgVar.a(new mn(f4))};
            wd0 wd0Var5 = wd0Var2;
            aq0 aq0Var5 = aq0Var3;
            az0.b(ci0VarArr, t1.aq(1279702876, new nt0(j70VarA, aq0Var5, j3, f4, g80Var2, z2, puVar, f3, teVarAq), vfVar), vfVar, 56);
            s9Var5 = s9Var4;
            aq0Var4 = aq0Var5;
            z3 = z2;
            wd0Var3 = wd0Var5;
            v9Var4 = v9Var3;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new w9(puVar, j70Var2, z3, aq0Var4, s9Var5, v9Var4, wd0Var3, i2);
        }
    }

    public static final long h(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final yk0 i(float f2, float f3, float f4, float f5, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new yk0(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean j(Object obj) {
        if (obj instanceof jr0) {
            jr0 jr0Var = (jr0) obj;
            if (jr0Var.d() == bw.ai || jr0Var.d() == bw.au || jr0Var.d() == bw.am) {
                Object value = jr0Var.getValue();
                if (value == null) {
                    return true;
                }
                return j(value);
            }
        } else {
            if ((obj instanceof ov) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                if (f[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean k(pg0 pg0Var) {
        return !pg0Var.h && pg0Var.d;
    }

    public static final boolean l(pg0 pg0Var) {
        return (pg0Var.b() || !pg0Var.h || pg0Var.d) ? false : true;
    }

    public static final boolean m(pg0 pg0Var) {
        return pg0Var.h && !pg0Var.d;
    }

    public static final void n(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            wc.g(n5.g("index: ", i2, ", size: ", i3));
        }
    }

    public static final void o(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            wc.g(n5.g("index: ", i2, ", size: ", i3));
        }
    }

    public static final void p(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            wc.n(n5.g("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final boolean q(gt gtVar, boolean z) {
        int iOrdinal = gtVar.bx().ordinal();
        et etVar = et.g;
        if (iOrdinal == 0) {
            ((us) pk.az(gtVar).getFocusOwner()).g(null);
            gtVar.bu(et.d, etVar);
            return true;
        }
        if (iOrdinal == 1) {
            gt gtVarU = t1.u(gtVar);
            if (!(gtVarU != null ? q(gtVarU, z) : true)) {
                return false;
            }
            gtVar.bu(et.e, etVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            wc.l();
            return false;
        }
        if (z) {
            ((us) pk.az(gtVar).getFocusOwner()).g(null);
            gtVar.bu(et.f, etVar);
        }
        return z;
    }

    public static byte[] r(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static cu s(Context context) {
        ProviderInfo providerInfo;
        yt ytVar;
        ApplicationInfo applicationInfo;
        n31 vkVar = Build.VERSION.SDK_INT >= 28 ? new vk(14) : new n31(14);
        PackageManager packageManager = context.getPackageManager();
        e00.q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            ytVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrG = vkVar.g(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrG) {
                    arrayList.add(signature.toByteArray());
                }
                ytVar = new yt(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                ytVar = null;
            }
        }
        if (ytVar == null) {
            return null;
        }
        return new cu(new zt(context, ytVar));
    }

    public static Handler t(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return xm.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void u(y70 y70Var, oa oaVar, i9 i9Var, float f2, yp0 yp0Var, bv0 bv0Var, yo yoVar) {
        ArrayList arrayList = y70Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ce0 ce0Var = (ce0) arrayList.get(i2);
            ce0Var.a.g(oaVar, i9Var, f2, yp0Var, bv0Var, yoVar);
            oaVar.f(0.0f, ce0Var.a.b());
        }
    }

    public static final boolean v(long j2, long j3) {
        return j2 == j3;
    }

    public static c70 w(c70 c70Var, e20 e20Var, nx0 nx0Var, em emVar, qt qtVar) {
        if (c70Var != null && e20Var == c70Var.a && f00.h(nx0Var, c70Var.b) && emVar.b() == c70Var.c.b() && qtVar == c70Var.d) {
            return c70Var;
        }
        c70 c70Var2 = c70.h;
        if (c70Var2 != null && e20Var == c70Var2.a && f00.h(nx0Var, c70Var2.b) && emVar.b() == c70Var2.c.b() && qtVar == c70Var2.d) {
            return c70Var2;
        }
        c70 c70Var3 = new c70(e20Var, wn0.k(nx0Var, e20Var), emVar, qtVar);
        c70.h = c70Var3;
        return c70Var3;
    }

    public static boolean x() {
        try {
            if (b1.Oo == null) {
                b1.Oo = Class.forName("android.os.SystemProperties");
            }
            if (b1.A == null) {
                Class cls = b1.Oo;
                b1.A = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = b1.A;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return f00.h(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class y(sb sbVar) {
        sbVar.getClass();
        Class cls = sbVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final long z(bu buVar) {
        DragEvent dragEvent = (DragEvent) buVar.e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }
}
