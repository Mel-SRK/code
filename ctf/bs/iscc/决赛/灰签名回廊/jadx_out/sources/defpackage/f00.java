package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f00 {
    public static final jq f;
    public static final jq g;
    public static final jq h;
    public static final n31 a = new n31(4);
    public static final n31 b = new n31(5);
    public static final int[] c = {90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65};
    public static final int[] d = {122, 121, 120, 119, 118, 117, 116, 115, 114, 113, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103, 102, 101, 100, 99, 98, 97};
    public static final int[] e = {57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 43, 47};
    public static final dc i = new dc(2);
    public static final vx0 j = new vx0(0, new long[0], new Object[0]);

    static {
        int i2 = 1;
        f = new jq("REMOVED_TASK", i2);
        g = new jq("CLOSED_EMPTY", i2);
        h = new jq("NO_OWNER", i2);
    }

    public static final void a(j70 j70Var, aq0 aq0Var, ta taVar, ua uaVar, te teVar, vf vfVar, int i2) {
        aq0 aq0VarA;
        ua uaVar2;
        j70 j70Var2;
        te teVar2;
        j70 j70Var3;
        aq0 aq0Var2;
        ua uaVar3;
        vfVar.aw(1179621553);
        if (((i2 | 22 | (vfVar.f(taVar) ? 256 : 128) | 25600) & 74899) == 74898 && vfVar.z()) {
            vfVar.aq();
            j70Var3 = j70Var;
            aq0Var2 = aq0Var;
            uaVar3 = uaVar;
            teVar2 = teVar;
        } else {
            vfVar.as();
            if ((i2 & 1) == 0 || vfVar.x()) {
                aq0VarA = eq0.a(lr.b, vfVar);
                uaVar2 = new ua(lr.a, lr.i, lr.g, lr.h, lr.f, lr.d);
                j70Var2 = g70.a;
            } else {
                vfVar.aq();
                j70Var2 = j70Var;
                aq0VarA = aq0Var;
                uaVar2 = uaVar;
            }
            vfVar.r();
            long j2 = taVar.a;
            long j3 = taVar.b;
            float f2 = uaVar2.a;
            vfVar.av(-1763481333);
            vfVar.av(-734838460);
            Object objAk = vfVar.ak();
            if (objAk == nf.a) {
                objAk = bo0.m(new mn(f2));
                vfVar.be(objAk);
            }
            vfVar.q(false);
            vfVar.q(false);
            teVar2 = teVar;
            ot0.a(j70Var2, aq0VarA, j2, j3, ((mn) ((w80) objAk).getValue()).d, t1.aq(664103990, new j(3, teVar2), vfVar), vfVar, 14155782, 16);
            j70Var3 = j70Var2;
            aq0Var2 = aq0VarA;
            uaVar3 = uaVar2;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new va(j70Var3, aq0Var2, taVar, uaVar3, teVar2, i2);
        }
    }

    public static final int aa(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void ab(la laVar, ji jiVar, boolean z) {
        Object obj = la.j.get(laVar);
        Throwable thF = laVar.f(obj);
        Object sj0Var = thF != null ? new sj0(thF) : laVar.g(obj);
        if (!z) {
            jiVar.h(sj0Var);
            return;
        }
        jiVar.getClass();
        sm smVar = (sm) jiVar;
        ki kiVar = smVar.h;
        Object obj2 = smVar.j;
        pj pjVarE = kiVar.e();
        Object objAw = t1.aw(pjVarE, obj2);
        uz0 uz0VarAp = objAw != t1.h ? e00.ap(kiVar, pjVarE, objAw) : null;
        try {
            kiVar.h(sj0Var);
            if (uz0VarAp == null || uz0VarAp.bh()) {
                t1.at(pjVarE, objAw);
            }
        } catch (Throwable th) {
            if (uz0VarAp == null || uz0VarAp.bh()) {
                t1.at(pjVarE, objAw);
            }
            throw th;
        }
    }

    public static void ac(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static es0 ad(int i2, Object obj) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new es0(1.0f, 1500.0f, obj);
    }

    public static final int ae(d80 d80Var) {
        int iC;
        int i2 = d80Var.b;
        int iC2 = d80Var.c(0);
        while (d80Var.b != 0 && d80Var.c(0) == iC2) {
            int i3 = d80Var.b;
            if (i3 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            d80Var.e(0, d80Var.a[i3 - 1]);
            d80Var.d(d80Var.b - 1);
            int i4 = d80Var.b;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < i5) {
                int iC3 = d80Var.c(i6);
                int i7 = (i6 + 1) * 2;
                int i8 = i7 - 1;
                int iC4 = d80Var.c(i8);
                if (i7 >= i4 || (iC = d80Var.c(i7)) <= iC4) {
                    if (iC4 > iC3) {
                        d80Var.e(i6, iC4);
                        d80Var.e(i8, iC3);
                        i6 = i8;
                    }
                } else if (iC > iC3) {
                    d80Var.e(i6, iC);
                    d80Var.e(i7, iC3);
                    i6 = i7;
                }
            }
        }
        return iC2;
    }

    public static void af() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void ag(String str) {
        xd xdVar = new xd("lateinit property " + str + " has not been initialized");
        ac(xdVar, f00.class.getName());
        throw xdVar;
    }

    public static String ah(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static String ai(int i2) {
        return i2 == -1 ? "Unspecified" : i2 == 0 ? "None" : i2 == 1 ? "Characters" : i2 == 2 ? "Words" : i2 == 3 ? "Sentences" : "Invalid";
    }

    public static final boolean aj(Throwable th, pu puVar) {
        Collection collectionAsList;
        Object objInvoke;
        th.getClass();
        Integer num = s00.a;
        om omVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            collectionAsList = Arrays.asList(suppressed);
            collectionAsList.getClass();
        } else {
            Method method = pf0.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                collectionAsList = rq.d;
            } else {
                collectionAsList = Arrays.asList((Throwable[]) objInvoke);
                collectionAsList.getClass();
            }
        }
        boolean z = false;
        if (!collectionAsList.isEmpty()) {
            Iterator it = collectionAsList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof om) {
                    return false;
                }
            }
        }
        try {
            List list = (List) puVar.a();
            boolean zIsEmpty = list.isEmpty();
            z = !zIsEmpty;
            if (!zIsEmpty) {
                omVar = new om(list);
            }
        } catch (Throwable th2) {
            omVar = th2;
        }
        if (omVar != null) {
            t1.g(th, omVar);
        }
        return z;
    }

    public static yy0 ak(int i2, int i3, ep epVar) {
        if ((i3 & 4) != 0) {
            epVar = fp.a;
        }
        return new yy0(i2, 0, epVar);
    }

    public static final long al(long j2, long j3) {
        int iC;
        int iE = hx0.e(j2);
        int iD = hx0.d(j2);
        if ((hx0.e(j3) < hx0.d(j2)) && (hx0.e(j2) < hx0.d(j3))) {
            if ((hx0.e(j3) <= hx0.e(j2)) && (hx0.d(j2) <= hx0.d(j3))) {
                iE = hx0.e(j3);
                iD = iE;
            } else {
                if ((hx0.e(j2) <= hx0.e(j3)) && (hx0.d(j3) <= hx0.d(j2))) {
                    iC = hx0.c(j3);
                } else {
                    int iE2 = hx0.e(j3);
                    if (iE >= hx0.d(j3) || iE2 > iE) {
                        iD = hx0.e(j3);
                    } else {
                        iE = hx0.e(j3);
                        iC = hx0.c(j3);
                    }
                }
                iD -= iC;
            }
        } else if (iD > hx0.e(j3)) {
            iE -= hx0.c(j3);
            iC = hx0.c(j3);
            iD -= iC;
        }
        return wo0.b(iE, iD);
    }

    public static Object am(gv gvVar, Object obj, ji jiVar) {
        gvVar.getClass();
        pj pjVarE = jiVar.e();
        Object i00Var = pjVarE == pq.d ? new i00(jiVar) : new j00(jiVar, pjVarE);
        az0.p(2, gvVar);
        return gvVar.f(obj, i00Var);
    }

    public static final gm b(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        du duVarA = eu.a(f2);
        if (duVarA == null) {
            duVarA = new g40(f2);
        }
        return new gm(f3, f2, duVarA);
    }

    public static c3 c(int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        bk0 bk0Var = gd.e;
        Bitmap.Config configBa = i60.ba(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, i60.ba(i4), true, fd.a(bk0Var));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configBa);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new c3(bitmapCreateBitmap);
    }

    public static final int d(float[] fArr) {
        int i2 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i3 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i2 = 1;
        }
        return (i3 << 1) | i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.yt0 r7, defpackage.s7 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.sh
            if (r0 == 0) goto L13
            r0 = r8
            sh r0 = (defpackage.sh) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            sh r0 = new sh
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yt0 r7 = r0.g
            defpackage.i60.az(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.i60.az(r8)
        L31:
            r0.g = r7
            r0.i = r2
            jg0 r8 = defpackage.jg0.e
            java.lang.Object r8 = r7.a(r8, r0)
            yj r1 = defpackage.yj.d
            if (r8 != r1) goto L40
            return r1
        L40:
            ig0 r8 = (defpackage.ig0) r8
            int r1 = r8.b
            java.lang.Object r8 = r8.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L69
            java.lang.Object r5 = r8.get(r4)
            pg0 r5 = (defpackage.pg0) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L31
            boolean r6 = r5.h
            if (r6 != 0) goto L31
            boolean r5 = r5.d
            if (r5 == 0) goto L31
            int r4 = r4 + 1
            goto L50
        L69:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.e(yt0, s7):java.lang.Object");
    }

    public static final boolean f(long j2) {
        return !pz.a(j2, 9223372034707292159L);
    }

    public static final void g(d80 d80Var, int i2) {
        if (d80Var.b == 0 || !(d80Var.c(0) == i2 || d80Var.c(d80Var.b - 1) == i2)) {
            int i3 = d80Var.b;
            d80Var.a(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int iC = d80Var.c(i4);
                if (i2 <= iC) {
                    break;
                }
                d80Var.e(i3, iC);
                i3 = i4;
            }
            d80Var.e(i3, i2);
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static ArrayList i(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new y6(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:21:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.yt0 r6, defpackage.s7 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lu
            if (r0 == 0) goto L13
            r0 = r7
            lu r0 = (defpackage.lu) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            lu r0 = new lu
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            int r1 = r0.i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L28
            yt0 r6 = r0.g
            defpackage.i60.az(r7)
            goto L58
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r6)
            r6 = 0
            return r6
        L2f:
            defpackage.i60.az(r7)
            zt0 r7 = r6.i
            ig0 r7 = r7.w
            java.lang.Object r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L3d:
            if (r4 >= r1) goto L74
            java.lang.Object r5 = r7.get(r4)
            pg0 r5 = (defpackage.pg0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L71
        L49:
            r0.g = r6
            r0.i = r3
            jg0 r7 = defpackage.jg0.f
            java.lang.Object r7 = r6.a(r7, r0)
            yj r1 = defpackage.yj.d
            if (r7 != r1) goto L58
            return r1
        L58:
            ig0 r7 = (defpackage.ig0) r7
            java.lang.Object r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L61:
            if (r4 >= r1) goto L74
            java.lang.Object r5 = r7.get(r4)
            pg0 r5 = (defpackage.pg0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L6e
            goto L49
        L6e:
            int r4 = r4 + 1
            goto L61
        L71:
            int r4 = r4 + 1
            goto L3d
        L74:
            wz0 r6 = defpackage.wz0.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.j(yt0, s7):java.lang.Object");
    }

    public static final Object k(tg0 tg0Var, gv gvVar, ji jiVar) {
        Object objBu = ((zt0) tg0Var).bu(new mu(jiVar.e(), gvVar, null), jiVar);
        return objBu == yj.d ? objBu : wz0.a;
    }

    public static void l(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            wc.n(n5.g("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static int m(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int n(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final boolean o(ri0 ri0Var, float f2, float f3) {
        float f4 = ri0Var.a;
        if (f2 > ri0Var.c || f4 > f2) {
            return false;
        }
        return f3 <= ri0Var.d && ri0Var.b <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ji p(ji jiVar, ji jiVar2, gv gvVar) {
        gvVar.getClass();
        if (gvVar instanceof s7) {
            return ((s7) gvVar).k(jiVar2, jiVar);
        }
        pj pjVarE = jiVar2.e();
        return pjVarE == pq.d ? new g00(jiVar2, jiVar, gvVar) : new h00(jiVar2, pjVarE, gvVar, jiVar);
    }

    public static ul0 q(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ul0 ul0Var = new ul0();
            new LinkedHashMap();
            ul0Var.a = new g20(sq.d);
            return ul0Var;
        }
        ClassLoader classLoader = ul0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        b60 b60Var = new b60(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            b60Var.put(str, bundle.get(str));
        }
        b60Var.b();
        b60Var.p = true;
        if (b60Var.l <= 0) {
            b60Var = b60.q;
            b60Var.getClass();
        }
        ul0 ul0Var2 = new ul0();
        new LinkedHashMap();
        ul0Var2.a = new g20(b60Var);
        return ul0Var2;
    }

    public static byte[] r(String str) {
        str.getClass();
        String strU = u();
        ArrayList arrayList = new ArrayList(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            int iM = ft0.m(strU, cCharAt, 0, 6);
            if (iM >= 0) {
                cCharAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(iM);
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        byte[] bArrDecode = Base64.decode(kc.av(arrayList, "", null, null, null, 62), 2);
        bArrDecode.getClass();
        return bArrDecode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r1.i(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0051, B:28:0x0066, B:30:0x006e, B:20:0x0046, B:23:0x004d), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [oh0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ya] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ya] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ya] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.zr r7, defpackage.oh0 r8, boolean r9, defpackage.ki r10) {
        /*
            boolean r0 = r10 instanceof defpackage.cs
            if (r0 == 0) goto L13
            r0 = r10
            cs r0 = (defpackage.cs) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            cs r0 = new cs
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            yj r5 = defpackage.yj.d
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            boolean r9 = r0.j
            n9 r7 = r0.i
            ya r8 = r0.h
            zr r1 = r0.g
            defpackage.i60.az(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L51
        L35:
            r7 = move-exception
            goto L8b
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.j
            n9 r7 = r0.i
            ya r8 = r0.h
            zr r1 = r0.g
            defpackage.i60.az(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4a:
            defpackage.i60.az(r10)
            n9 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L51:
            r0.g = r7     // Catch: java.lang.Throwable -> L35
            r0.h = r8     // Catch: java.lang.Throwable -> L35
            r0.i = r10     // Catch: java.lang.Throwable -> L35
            r0.j = r9     // Catch: java.lang.Throwable -> L35
            r0.l = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L62
            goto L82
        L62:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.g = r1     // Catch: java.lang.Throwable -> L35
            r0.h = r8     // Catch: java.lang.Throwable -> L35
            r0.i = r7     // Catch: java.lang.Throwable -> L35
            r0.j = r9     // Catch: java.lang.Throwable -> L35
            r0.l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L82:
            return r5
        L83:
            if (r9 == 0) goto L88
            r8.a(r2)
        L88:
            wz0 r7 = defpackage.wz0.a
            return r7
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r10 = move-exception
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L96
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L96:
            if (r2 != 0) goto La2
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La2:
            r8.a(r2)
        La5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.s(zr, oh0, boolean, ki):java.lang.Object");
    }

    public static String t(String str) {
        byte[] bytes = str.getBytes(mb.a);
        bytes.getClass();
        String strU = u();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        strEncodeToString.getClass();
        ArrayList arrayList = new ArrayList(strEncodeToString.length());
        for (int i2 = 0; i2 < strEncodeToString.length(); i2++) {
            char cCharAt = strEncodeToString.charAt(i2);
            int iM = ft0.m("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", cCharAt, 0, 6);
            if (iM >= 0) {
                cCharAt = strU.charAt(iM);
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return kc.av(arrayList, "", null, null, null, 62);
    }

    public static String u() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 26; i2++) {
            sb.append((char) c[i2]);
        }
        for (int i3 = 0; i3 < 26; i3++) {
            sb.append((char) d[i3]);
        }
        for (int i4 = 0; i4 < 12; i4++) {
            sb.append((char) e[i4]);
        }
        return sb.toString();
    }

    public static int v(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final void w(pj pjVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = sj.a.iterator();
        while (it.hasNext()) {
            try {
                ((rj) it.next()).p(pjVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    t1.g(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            t1.g(th, new pm(pjVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static ji x(ji jiVar) {
        jiVar.getClass();
        ki kiVar = jiVar instanceof ki ? (ki) jiVar : null;
        if (kiVar == null || (jiVar = kiVar.f) != null) {
            return jiVar;
        }
        a aVar = (a) kiVar.e().k(bw.u);
        ji smVar = aVar != null ? new sm(aVar, kiVar) : kiVar;
        kiVar.f = smVar;
        return smVar;
    }

    public static List y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List z(Object... objArr) {
        if (objArr.length <= 0) {
            return rq.d;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }
}
