package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.graphics.a;
import com.example.gnd.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public static final y7 a = new y7(-1.0f);
    public static final y7 b = new y7(1.0f);
    public static final Object c = new Object();
    public static final fm d = new fm(1.0f, 1.0f);
    public static final fm e = new fm(1.0f, 1.0f);
    public static final yf0 f = new yf0(4);
    public static final ri0 g = new ri0(0.0f, 0.0f, 10.0f, 10.0f);
    public static final jq h = new jq("NO_THREAD_ELEMENTS", 1);
    public static final im0 i = new im0(8);
    public static final im0 j = new im0(9);
    public static final im0 k = new im0(10);

    public static long a(float f2) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final vg0 aa(View view) {
        vg0 vg0Var = (vg0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (vg0Var != null) {
            return vg0Var;
        }
        vg0 vg0Var2 = new vg0();
        view.setTag(R.id.pooling_container_listener_holder_tag, vg0Var2);
        return vg0Var2;
    }

    public static final long ab(h30 h30Var, ri0 ri0Var, int i2) {
        ax0 ax0VarD = h30Var.d();
        y70 y70Var = ax0VarD != null ? ax0VarD.a.b : null;
        d20 d20VarC = h30Var.c();
        return (y70Var == null || d20VarC == null) ? hx0.b : y70Var.f(ri0Var.g(d20VarC.ad(0L)), i2, bw.aw);
    }

    public static final cl0 ac(k60 k60Var) {
        Object objJ = k60Var.j();
        if (objJ instanceof cl0) {
            return (cl0) objJ;
        }
        return null;
    }

    public static final float ad(cl0 cl0Var) {
        if (cl0Var != null) {
            return cl0Var.a;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ae(wo woVar) {
        if (((i70) woVar).d.q) {
            pk.aw(woVar, 1).K();
        }
    }

    public static final boolean af(gt gtVar) {
        s20 s20Var;
        fa0 fa0Var;
        s20 s20Var2;
        fa0 fa0Var2 = gtVar.k;
        return (fa0Var2 == null || (s20Var = fa0Var2.r) == null || !s20Var.af() || (fa0Var = gtVar.k) == null || (s20Var2 = fa0Var.r) == null || !s20Var2.ae()) ? false : true;
    }

    public static final boolean ag(uo0 uo0Var) {
        fa0 fa0VarD = uo0Var.d();
        q80 q80Var = uo0Var.d.d;
        return (fa0VarD != null ? fa0VarD.L() : false) || q80Var.c(zo0.p) || q80Var.c(zo0.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean ah(uo0 uo0Var) {
        if (!ag(uo0Var)) {
            po0 po0Var = uo0Var.d;
            if (po0Var.f) {
                return true;
            }
            q80 q80Var = po0Var.d;
            Object[] objArr = q80Var.b;
            Object[] objArr2 = q80Var.c;
            long[] jArr = q80Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((cp0) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean ai(s20 s20Var) {
        if (s20Var.j == null) {
            return false;
        }
        s20 s20VarQ = s20Var.q();
        if ((s20VarQ != null ? s20VarQ.j : null) == null) {
            return true;
        }
        s20Var.ah.getClass();
        return false;
    }

    public static final boolean aj(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean ak(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean al(int i2) {
        int type;
        return (!ak(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static void am(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final boolean an(gt gtVar, g5 g5Var) {
        Object[] objArr = new gt[16];
        if (!gtVar.d.q) {
            sy.b("visitChildren called on an unattached node");
        }
        a90 a90Var = new a90(new i70[16]);
        i70 i70Var = gtVar.d;
        i70 i70Var2 = i70Var.i;
        if (i70Var2 == null) {
            pk.j(a90Var, i70Var);
        } else {
            a90Var.b(i70Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = a90Var.f;
            if (i3 == 0) {
                break;
            }
            i70 i70VarM = (i70) a90Var.j(i3 - 1);
            if ((i70VarM.g & 1024) == 0) {
                pk.j(a90Var, i70VarM);
            } else {
                while (true) {
                    if (i70VarM == null) {
                        break;
                    }
                    if ((i70VarM.f & 1024) != 0) {
                        a90 a90Var2 = null;
                        while (i70VarM != null) {
                            if (i70VarM instanceof gt) {
                                gt gtVar2 = (gt) i70VarM;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = gtVar2;
                                i2 = i4;
                            } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                int i5 = 0;
                                for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                    if ((i70Var3.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i70VarM = i70Var3;
                                        } else {
                                            if (a90Var2 == null) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (i70VarM != null) {
                                                a90Var2.b(i70VarM);
                                                i70VarM = null;
                                            }
                                            a90Var2.b(i70Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i70VarM = pk.m(a90Var2);
                        }
                    } else {
                        i70VarM = i70VarM.i;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ht.b);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                gt gtVar3 = (gt) objArr[i6];
                if (af(gtVar3) && h(gtVar3, g5Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final boolean ao(gt gtVar, g5 g5Var) {
        Object[] objArr = new gt[16];
        if (!gtVar.d.q) {
            sy.b("visitChildren called on an unattached node");
        }
        a90 a90Var = new a90(new i70[16]);
        i70 i70Var = gtVar.d;
        i70 i70Var2 = i70Var.i;
        if (i70Var2 == null) {
            pk.j(a90Var, i70Var);
        } else {
            a90Var.b(i70Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = a90Var.f;
            if (i3 == 0) {
                break;
            }
            i70 i70VarM = (i70) a90Var.j(i3 - 1);
            if ((i70VarM.g & 1024) == 0) {
                pk.j(a90Var, i70VarM);
            } else {
                while (true) {
                    if (i70VarM == null) {
                        break;
                    }
                    if ((i70VarM.f & 1024) != 0) {
                        a90 a90Var2 = null;
                        while (i70VarM != null) {
                            if (i70VarM instanceof gt) {
                                gt gtVar2 = (gt) i70VarM;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = gtVar2;
                                i2 = i4;
                            } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                int i5 = 0;
                                for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                    if ((i70Var3.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i70VarM = i70Var3;
                                        } else {
                                            if (a90Var2 == null) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (i70VarM != null) {
                                                a90Var2.b(i70VarM);
                                                i70VarM = null;
                                            }
                                            a90Var2.b(i70Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i70VarM = pk.m(a90Var2);
                        }
                    } else {
                        i70VarM = i70VarM.i;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ht.b);
        for (int i6 = 0; i6 < i2; i6++) {
            gt gtVar3 = (gt) objArr[i6];
            if (af(gtVar3) && s(gtVar3, g5Var)) {
                return true;
            }
        }
        return false;
    }

    public static final void ap(float[] fArr, float[] fArr2) {
        float fN = n(fArr2, 0, fArr, 0);
        float fN2 = n(fArr2, 0, fArr, 1);
        float fN3 = n(fArr2, 0, fArr, 2);
        float fN4 = n(fArr2, 0, fArr, 3);
        float fN5 = n(fArr2, 1, fArr, 0);
        float fN6 = n(fArr2, 1, fArr, 1);
        float fN7 = n(fArr2, 1, fArr, 2);
        float fN8 = n(fArr2, 1, fArr, 3);
        float fN9 = n(fArr2, 2, fArr, 0);
        float fN10 = n(fArr2, 2, fArr, 1);
        float fN11 = n(fArr2, 2, fArr, 2);
        float fN12 = n(fArr2, 2, fArr, 3);
        float fN13 = n(fArr2, 3, fArr, 0);
        float fN14 = n(fArr2, 3, fArr, 1);
        float fN15 = n(fArr2, 3, fArr, 2);
        float fN16 = n(fArr2, 3, fArr, 3);
        fArr[0] = fN;
        fArr[1] = fN2;
        fArr[2] = fN3;
        fArr[3] = fN4;
        fArr[4] = fN5;
        fArr[5] = fN6;
        fArr[6] = fN7;
        fArr[7] = fN8;
        fArr[8] = fN9;
        fArr[9] = fN10;
        fArr[10] = fN11;
        fArr[11] = fN12;
        fArr[12] = fN13;
        fArr[13] = fN14;
        fArr[14] = fN15;
        fArr[15] = fN16;
    }

    public static final te aq(int i2, ov ovVar, vf vfVar) {
        Object objAk = vfVar.ak();
        if (objAk == nf.a) {
            objAk = new te(i2, true, ovVar);
            vfVar.be(objAk);
        }
        te teVar = (te) objAk;
        if (!teVar.f.equals(ovVar)) {
            teVar.f = ovVar;
            if (teVar.e) {
                hi0 hi0Var = teVar.g;
                if (hi0Var != null) {
                    jg jgVar = hi0Var.a;
                    if (jgVar != null) {
                        jgVar.n(hi0Var, null);
                    }
                    teVar.g = null;
                }
                ArrayList arrayList = teVar.h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hi0 hi0Var2 = (hi0) arrayList.get(i3);
                        jg jgVar2 = hi0Var2.a;
                        if (jgVar2 != null) {
                            jgVar2.n(hi0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return teVar;
    }

    public static final boolean ar(hi0 hi0Var, hi0 hi0Var2) {
        return hi0Var == null || !hi0Var.a() || hi0Var.equals(hi0Var2) || f00.h(hi0Var.c, hi0Var2.c);
    }

    public static final b1 as(s20 s20Var) {
        b1 b1Var = s20Var.p;
        if (b1Var != null) {
            return b1Var;
        }
        throw n5.f("LayoutNode should be attached to an owner");
    }

    public static final void at(pj pjVar, Object obj) {
        if (obj == h) {
            return;
        }
        if (!(obj instanceof xx0)) {
            pjVar.r(j, null).getClass();
            wc.c();
            return;
        }
        mi[] miVarArr = ((xx0) obj).b;
        int length = miVarArr.length - 1;
        if (length < 0) {
            return;
        }
        mi miVar = miVarArr[length];
        throw null;
    }

    public static final long au(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final Object av(pj pjVar) {
        Object objR = pjVar.r(i, 0);
        objR.getClass();
        return objR;
    }

    public static final Object aw(pj pjVar, Object obj) {
        if (obj == null) {
            obj = av(pjVar);
        }
        if (obj == 0) {
            return h;
        }
        if (obj instanceof Integer) {
            return pjVar.r(k, new xx0(((Number) obj).intValue(), pjVar));
        }
        wc.c();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ax(Context context, Executor executor, qh0 qh0Var, boolean z) {
        boolean z2;
        ?? A;
        nm[] nmVarArrAu;
        nm[] nmVarArr;
        nm[] nmVarArr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r73;
        mm mmVar;
        ?? r74;
        String str;
        FileInputStream fileInputStreamA;
        ?? r75;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                qh0Var.d(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        context.getPackageName();
                        uh0.c(context, false);
                        return;
                    }
                }
            }
            context.getPackageName();
            byte[] bArr2 = pk.e;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            mm mmVar2 = new mm(assets, executor, qh0Var, name, file2);
            byte[] bArr3 = mmVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        mmVar2.b(4, null);
                    }
                    mmVar2.f = true;
                    try {
                        A = mmVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        qh0Var.d(6, e2);
                        A = 0;
                    } catch (IOException e3) {
                        qh0Var.d(7, e3);
                        A = 0;
                    }
                    try {
                        if (A != 0) {
                            try {
                            } catch (IOException e4) {
                                qh0Var.d(7, e4);
                                try {
                                    A.close();
                                } catch (IOException e5) {
                                    qh0Var.d(7, e5);
                                }
                                nmVarArrAu = null;
                            } catch (IllegalStateException e6) {
                                qh0Var.d(8, e6);
                                A.close();
                                nmVarArrAu = null;
                            }
                            if (!Arrays.equals(bArr2, d41.ak(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            nmVarArrAu = pk.au(A, d41.ak(A, 4), mmVar2.e);
                            try {
                                A.close();
                            } catch (IOException e7) {
                                qh0Var.d(7, e7);
                            }
                            mmVar2.g = nmVarArrAu;
                        }
                        nmVarArr = mmVar2.g;
                        if (nmVarArr != null && ((A = Build.VERSION.SDK_INT) >= 31 || A == 24 || A == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamA = mmVar2.a(assets, "dexopt/baseline.profm");
                                r74 = str;
                            } catch (FileNotFoundException e8) {
                                qh0Var.d(9, e8);
                                r74 = A;
                            } catch (IOException e9) {
                                qh0Var.d(7, e9);
                                r74 = A;
                            } catch (IllegalStateException e10) {
                                mmVar2.g = null;
                                qh0Var.d(8, e10);
                                r74 = A;
                            }
                            if (fileInputStreamA == null) {
                                try {
                                    if (!Arrays.equals(pk.f, d41.ak(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrAk = d41.ak(fileInputStreamA, 4);
                                    mmVar2.g = pk.ar(fileInputStreamA, bArrAk, bArr3, nmVarArr);
                                    fileInputStreamA.close();
                                    mmVar = mmVar2;
                                    A = bArrAk;
                                    if (mmVar != null) {
                                        mmVar2 = mmVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    r74 = str;
                                }
                                mmVar = null;
                                A = r74;
                                if (mmVar != null) {
                                }
                            }
                        }
                        qh0 qh0Var2 = mmVar2.b;
                        nmVarArr2 = mmVar2.g;
                        byte[] bArr4 = mmVar2.c;
                        ?? r76 = A;
                        r76 = A;
                        if (nmVarArr2 != null && bArr4 != null) {
                            byteArrayOutputStream = mmVar2.f;
                            if (byteArrayOutputStream != 0) {
                                wc.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e11) {
                                qh0Var2.d(7, e11);
                                r73 = byteArrayOutputStream;
                            } catch (IllegalStateException e12) {
                                qh0Var2.d(8, e12);
                                r73 = byteArrayOutputStream;
                            }
                            if (pk.bj(byteArrayOutputStream, bArr4, nmVarArr2)) {
                                mmVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                mmVar2.g = null;
                                r76 = r73;
                            } else {
                                qh0Var2.d(5, null);
                                mmVar2.g = null;
                                byteArrayOutputStream.close();
                                r76 = byteArrayOutputStream;
                            }
                        }
                        bArr = mmVar2.h;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!mmVar2.f) {
                                    wc.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(mmVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i2 = byteArrayInputStream.read(bArr5);
                                                                                    if (i2 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i2);
                                                                                    }
                                                                                }
                                                                                r72 = 1;
                                                                                mmVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                mmVar2.h = null;
                                                                                mmVar2.g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        mmVar2.b(6, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        uh0.c(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e14) {
                                        e = e14;
                                        mmVar2.b(7, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        uh0.c(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r76 = 1;
                                    mmVar2.b(6, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    uh0.c(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e16) {
                                    e = e16;
                                    r76 = 1;
                                    mmVar2.b(7, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    uh0.c(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                mmVar2.h = null;
                                mmVar2.g = null;
                            }
                        }
                        if (z3) {
                            am(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            mmVar2.b(4, null);
                        }
                        mmVar2.f = true;
                        A = mmVar2.a(assets, "dexopt/baseline.prof");
                        if (A != 0) {
                        }
                        nmVarArr = mmVar2.g;
                        if (nmVarArr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamA = mmVar2.a(assets, "dexopt/baseline.profm");
                            r74 = str;
                            if (fileInputStreamA == null) {
                            }
                        }
                        qh0 qh0Var22 = mmVar2.b;
                        nmVarArr2 = mmVar2.g;
                        byte[] bArr42 = mmVar2.c;
                        ?? r762 = A;
                        r762 = A;
                        if (nmVarArr2 != null) {
                            byteArrayOutputStream = mmVar2.f;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr = mmVar2.h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        mmVar2.b(4, null);
                    }
                }
                uh0.c(context, (z4 || !z) ? 0 : r75);
            }
            mmVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            uh0.c(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e17) {
            qh0Var.d(7, e17);
            uh0.c(context, false);
        }
    }

    public static final long b(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final l3 c() {
        return new l3(new Paint(7));
    }

    public static final long d(h30 h30Var, ri0 ri0Var, ri0 ri0Var2, int i2) {
        long jAb = ab(h30Var, ri0Var, i2);
        if (hx0.b(jAb)) {
            return hx0.b;
        }
        long jAb2 = ab(h30Var, ri0Var2, i2);
        if (hx0.b(jAb2)) {
            return hx0.b;
        }
        int i3 = (int) (jAb >> 32);
        int i4 = (int) (jAb2 & 4294967295L);
        return wo0.b(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean e(zw0 zw0Var, int i2) {
        int iE = zw0Var.e(i2);
        return i2 == zw0Var.h(iE) || i2 == zw0Var.d(iE, false) ? zw0Var.i(i2) != zw0Var.a(i2) : zw0Var.a(i2) != zw0Var.a(i2 - 1);
    }

    public static final ExtractedText f(lw0 lw0Var) {
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

    public static void g(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = s00.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = pf0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(gt gtVar, g5 g5Var) {
        int iOrdinal = gtVar.bx().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                gt gtVarU = u(gtVar);
                if (gtVarU == null) {
                    wc.q("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = gtVarU.bx().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                wc.l();
                                return false;
                            }
                            wc.q("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (h(gtVarU, g5Var) || t(gtVar, gtVarU, 2, g5Var) || (gtVarU.bv().a && ((Boolean) g5Var.g(gtVarU)).booleanValue())) {
                        return true;
                    }
                }
                return t(gtVar, gtVarU, 2, g5Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wc.l();
                    return false;
                }
                if (!an(gtVar, g5Var)) {
                    if (!(gtVar.bv().a ? ((Boolean) g5Var.g(gtVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return an(gtVar, g5Var);
    }

    public static final int i(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final j70 j(j70 j70Var, aq0 aq0Var) {
        return a.b(j70Var, 0.0f, aq0Var, 518143);
    }

    public static o11 k(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (o11) objNewInstance;
            } catch (IllegalAccessException e2) {
                wc.k("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                wc.k("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            wc.k("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final Object l(long j2, ki kiVar) {
        if (j2 > 0) {
            la laVar = new la(1, f00.x(kiVar));
            laVar.t();
            if (j2 < Long.MAX_VALUE) {
                nj njVarK = laVar.h.k(bw.u);
                pl plVar = njVarK instanceof pl ? (pl) njVarK : null;
                if (plVar == null) {
                    plVar = wk.a;
                }
                plVar.c(j2, laVar);
            }
            Object objS = laVar.s();
            if (objS == yj.d) {
                return objS;
            }
        }
        return wz0.a;
    }

    public static boolean m(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m(file2) && z;
        }
        return z;
    }

    public static final float n(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final gt o(gt gtVar) {
        gt gtVar2 = ((us) pk.az(gtVar).getFocusOwner()).h;
        if (gtVar2 == null || !gtVar2.q) {
            return null;
        }
        return gtVar2;
    }

    public static long p(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    eh.l(i7);
                    throw new xd();
                }
                i6 = 8190;
            }
        }
        return eh.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long q(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    eh.l(i7);
                    throw new xd();
                }
                i6 = 8190;
            }
        }
        return eh.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final ri0 r(gt gtVar) {
        fa0 fa0Var = gtVar.k;
        return fa0Var != null ? i60.ad(fa0Var).ak(fa0Var, false) : ri0.e;
    }

    public static final boolean s(gt gtVar, g5 g5Var) {
        int iOrdinal = gtVar.bx().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                gt gtVarU = u(gtVar);
                if (gtVarU != null) {
                    return s(gtVarU, g5Var) || t(gtVar, gtVarU, 1, g5Var);
                }
                wc.q("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return gtVar.bv().a ? ((Boolean) g5Var.g(gtVar)).booleanValue() : ao(gtVar, g5Var);
                }
                wc.l();
                return false;
            }
        }
        return ao(gtVar, g5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x019d A[EDGE_INSN: B:159:0x019d->B:127:0x019d BREAK  A[LOOP:5: B:89:0x012e->B:164:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean t(gt gtVar, gt gtVar2, int i2, g5 g5Var) {
        boolean zBooleanValue;
        i70 i70Var;
        s20 s20VarAy;
        da0 da0Var;
        if (gtVar.bx() == et.e) {
            Object[] objArr = new gt[16];
            if (!gtVar.d.q) {
                sy.b("visitChildren called on an unattached node");
            }
            a90 a90Var = new a90(new i70[16]);
            i70 i70Var2 = gtVar.d;
            i70 i70Var3 = i70Var2.i;
            zBooleanValue = false;
            if (i70Var3 == null) {
                pk.j(a90Var, i70Var2);
            } else {
                a90Var.b(i70Var3);
            }
            int i3 = 0;
            while (true) {
                int i4 = a90Var.f;
                i70Var = null;
                if (i4 == 0) {
                    break;
                }
                i70 i70VarM = (i70) a90Var.j(i4 - 1);
                if ((i70VarM.g & 1024) == 0) {
                    pk.j(a90Var, i70VarM);
                } else {
                    while (true) {
                        if (i70VarM == null) {
                            break;
                        }
                        if ((i70VarM.f & 1024) != 0) {
                            a90 a90Var2 = null;
                            while (i70VarM != null) {
                                if (i70VarM instanceof gt) {
                                    gt gtVar3 = (gt) i70VarM;
                                    int i5 = i3 + 1;
                                    if (objArr.length < i5) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(objArr, 0, objArr2, 0, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i3] = gtVar3;
                                    i3 = i5;
                                } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                    int i6 = 0;
                                    for (i70 i70Var4 = ((rl) i70VarM).s; i70Var4 != null; i70Var4 = i70Var4.i) {
                                        if ((i70Var4.f & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                i70VarM = i70Var4;
                                            } else {
                                                if (a90Var2 == null) {
                                                    a90Var2 = new a90(new i70[16]);
                                                }
                                                if (i70VarM != null) {
                                                    a90Var2.b(i70VarM);
                                                    i70VarM = null;
                                                }
                                                a90Var2.b(i70Var4);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                i70VarM = pk.m(a90Var2);
                            }
                        } else {
                            i70VarM = i70VarM.i;
                        }
                    }
                }
            }
            Arrays.sort(objArr, 0, i3, ht.b);
            if (i2 == 1) {
                sz szVarBb = i60.bb(0, i3);
                int i7 = szVarBb.d;
                int i8 = szVarBb.e;
                if (i7 <= i8) {
                    boolean z = false;
                    while (true) {
                        if (z) {
                            gt gtVar4 = (gt) objArr[i7];
                            if (af(gtVar4) && s(gtVar4, g5Var)) {
                                break;
                            }
                        }
                        if (f00.h(objArr[i7], gtVar2)) {
                            z = true;
                        }
                        if (i7 == i8) {
                            break;
                        }
                        i7++;
                    }
                }
                if (i2 != 1 && gtVar.bv().a) {
                    if (!gtVar.d.q) {
                        sy.b("visitAncestors called on an unattached node");
                    }
                    i70 i70Var5 = gtVar.d.h;
                    s20VarAy = pk.ay(gtVar);
                    loop5: while (true) {
                        if (s20VarAy == null) {
                            break;
                        }
                        if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                            while (i70Var5 != null) {
                                if ((i70Var5.f & 1024) != 0) {
                                    i70 i70VarM2 = i70Var5;
                                    a90 a90Var3 = null;
                                    while (i70VarM2 != null) {
                                        if (i70VarM2 instanceof gt) {
                                            i70Var = i70VarM2;
                                            break loop5;
                                        }
                                        if ((i70VarM2.f & 1024) != 0 && (i70VarM2 instanceof rl)) {
                                            int i9 = 0;
                                            for (i70 i70Var6 = ((rl) i70VarM2).s; i70Var6 != null; i70Var6 = i70Var6.i) {
                                                if ((i70Var6.f & 1024) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        i70VarM2 = i70Var6;
                                                    } else {
                                                        if (a90Var3 == null) {
                                                            a90Var3 = new a90(new i70[16]);
                                                        }
                                                        if (i70VarM2 != null) {
                                                            a90Var3.b(i70VarM2);
                                                            i70VarM2 = null;
                                                        }
                                                        a90Var3.b(i70Var6);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        i70VarM2 = pk.m(a90Var3);
                                    }
                                }
                                i70Var5 = i70Var5.h;
                            }
                        }
                        s20VarAy = s20VarAy.q();
                        i70Var5 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                    }
                    if (i70Var != null) {
                        zBooleanValue = ((Boolean) g5Var.g(gtVar)).booleanValue();
                    }
                }
            } else if (i2 == 2) {
                sz szVarBb2 = i60.bb(0, i3);
                int i10 = szVarBb2.d;
                int i11 = szVarBb2.e;
                if (i10 <= i11) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            gt gtVar5 = (gt) objArr[i11];
                            if (af(gtVar5) && h(gtVar5, g5Var)) {
                                break;
                            }
                        }
                        if (f00.h(objArr[i11], gtVar2)) {
                            z2 = true;
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11--;
                    }
                }
                if (i2 != 1) {
                    if (!gtVar.d.q) {
                    }
                    i70 i70Var52 = gtVar.d.h;
                    s20VarAy = pk.ay(gtVar);
                    loop5: while (true) {
                        if (s20VarAy == null) {
                        }
                    }
                    if (i70Var != null) {
                    }
                }
            } else {
                wc.q("This function should only be used for 1-D focus search");
            }
            if (!zBooleanValue) {
                return true;
            }
            gt gtVar6 = ((us) pk.az(gtVar).getFocusOwner()).h;
            pk.bb(gtVar);
            return false;
        }
        wc.q("This function should only be used within a parent that has focus.");
        zBooleanValue = false;
        if (!zBooleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gt u(gt gtVar) {
        boolean z = gtVar.d.q;
        if (z) {
            if (!z) {
                sy.b("visitChildren called on an unattached node");
            }
            a90 a90Var = new a90(new i70[16]);
            i70 i70Var = gtVar.d;
            i70 i70Var2 = i70Var.i;
            if (i70Var2 == null) {
                pk.j(a90Var, i70Var);
            } else {
                a90Var.b(i70Var2);
            }
            while (true) {
                int i2 = a90Var.f;
                if (i2 == 0) {
                    break;
                }
                i70 i70VarM = (i70) a90Var.j(i2 - 1);
                if ((i70VarM.g & 1024) == 0) {
                    pk.j(a90Var, i70VarM);
                } else {
                    while (true) {
                        if (i70VarM == null) {
                            break;
                        }
                        if ((i70VarM.f & 1024) != 0) {
                            a90 a90Var2 = null;
                            while (i70VarM != null) {
                                if (i70VarM instanceof gt) {
                                    gt gtVar2 = (gt) i70VarM;
                                    if (gtVar2.d.q) {
                                        int iOrdinal = gtVar2.bx().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return gtVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            wc.l();
                                            return null;
                                        }
                                    }
                                } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                    int i3 = 0;
                                    for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                        if ((i70Var3.f & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                i70VarM = i70Var3;
                                            } else {
                                                if (a90Var2 == null) {
                                                    a90Var2 = new a90(new i70[16]);
                                                }
                                                if (i70VarM != null) {
                                                    a90Var2.b(i70VarM);
                                                    i70VarM = null;
                                                }
                                                a90Var2.b(i70Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                i70VarM = pk.m(a90Var2);
                            }
                        } else {
                            i70VarM = i70VarM.i;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final e80 v(yo0 yo0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            uo0 uo0VarA = yo0Var.a();
            s20 s20Var = uo0VarA.c;
            if (s20Var.af() && s20Var.ae()) {
                e80 e80Var = new e80(48);
                bu buVar = new bu(20);
                tz tzVarBa = pk.ba(uo0VarA.g());
                ((Region) buVar.e).set(tzVarBa.a, tzVarBa.b, tzVarBa.c, tzVarBa.d);
                w(buVar, uo0VarA, e80Var, uo0VarA, new bu(20));
                return e80Var;
            }
            e80 e80Var2 = oz.a;
            e80Var2.getClass();
            return e80Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void w(bu buVar, uo0 uo0Var, e80 e80Var, uo0 uo0Var2, bu buVar2) {
        ri0 ri0VarZ;
        s20 s20Var;
        int i2 = uo0Var.g;
        Region region = (Region) buVar2.e;
        s20 s20Var2 = uo0Var2.c;
        int i3 = uo0Var2.g;
        boolean z = (s20Var2.af() && s20Var2.ae()) ? false : true;
        Region region2 = (Region) buVar.e;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || uo0Var2.e) {
                Object objF = uo0Var2.f();
                if (objF == null) {
                    ri0VarZ = ((yy) s20Var2.ag.g).Z();
                } else {
                    i70 i70Var = ((i70) objF).d;
                    Object objG = uo0Var2.d.d.g(oo0.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z2 = objG != null;
                    if (!i70Var.d.q) {
                        ri0VarZ = ri0.e;
                    } else if (z2) {
                        ri0VarZ = pk.aw(i70Var, 8).Z();
                    } else {
                        fa0 fa0VarAw = pk.aw(i70Var, 8);
                        ri0VarZ = i60.ad(fa0VarAw).ak(fa0VarAw, true);
                    }
                }
                tz tzVarBa = pk.ba(ri0VarZ);
                region.set(tzVarBa.a, tzVarBa.b, tzVarBa.c, tzVarBa.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (uo0Var2.e) {
                        uo0 uo0VarL = uo0Var2.l();
                        e80Var.g(i3, new xo0(uo0Var2, pk.ba((uo0VarL == null || (s20Var = uo0VarL.c) == null || !s20Var.af()) ? g : uo0VarL.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            e80Var.g(i3, new xo0(uo0Var2, new tz(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                e80Var.g(i3, new xo0(uo0Var2, new tz(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = uo0.j(4, uo0Var2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((uo0) listJ.get(size)).k().d.c(zo0.y)) {
                        w(buVar, uo0Var, e80Var, (uo0) listJ.get(size), buVar2);
                    }
                }
                if (ah(uo0Var2)) {
                    region2.op(tzVarBa.a, tzVarBa.b, tzVarBa.c, tzVarBa.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static t40 x() {
        o6 o6Var = qf0.a;
        o6Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((yf0) o6Var.c)) {
            try {
                t40 t40Var = (t40) o6Var.b;
                if (t40Var != null && localeList == ((LocaleList) o6Var.a)) {
                    return t40Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new s40(localeList.get(i2)));
                }
                t40 t40Var2 = new t40(arrayList);
                o6Var.a = localeList;
                o6Var.b = t40Var2;
                return t40Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final int y(y70 y70Var, long j2, i11 i11Var) {
        float f2 = i11Var != null ? i11Var.f() : 0.0f;
        int iC = y70Var.c(xa0.e(j2));
        if (xa0.e(j2) < y70Var.d(iC) - f2 || xa0.e(j2) > y70Var.b(iC) + f2 || xa0.d(j2) < (-f2) || xa0.d(j2) > y70Var.d + f2) {
            return -1;
        }
        return iC;
    }

    public static final la z(ji jiVar) {
        la laVar;
        la laVar2;
        if (!(jiVar instanceof sm)) {
            return new la(1, jiVar);
        }
        sm smVar = (sm) jiVar;
        jq jqVar = az0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sm.k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(smVar);
            laVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(smVar, jqVar);
                laVar2 = null;
                break;
            }
            if (obj instanceof la) {
                while (!atomicReferenceFieldUpdater.compareAndSet(smVar, obj, jqVar)) {
                    if (atomicReferenceFieldUpdater.get(smVar) != obj) {
                        break;
                    }
                }
                laVar2 = (la) obj;
                break loop0;
            }
            if (obj != jqVar && !(obj instanceof Throwable)) {
                wc.f(obj, "Inconsistent state ");
                return null;
            }
        }
        if (laVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = la.j;
            Object obj2 = atomicReferenceFieldUpdater2.get(laVar2);
            if (!(obj2 instanceof ud) || ((ud) obj2).d == null) {
                la.i.set(laVar2, 536870911);
                atomicReferenceFieldUpdater2.set(laVar2, bk.a);
                laVar = laVar2;
            } else {
                laVar2.p();
            }
            if (laVar != null) {
                return laVar;
            }
        }
        return new la(2, jiVar);
    }
}
