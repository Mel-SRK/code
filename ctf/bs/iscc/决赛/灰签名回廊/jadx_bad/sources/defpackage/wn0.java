package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class wn0 {
    public static final int a(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static boolean b(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            ty.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            ty.a("invalid end value");
        }
        if (i3 < 0) {
            ty.a("invalid maxLines value");
        }
        if (i < 0) {
            ty.a("invalid width value");
        }
        if (i4 < 0) {
            ty.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(av.a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static m7 d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new m7(fd.b(view));
        }
        return null;
    }

    public static final un0 e(Object obj) {
        if (obj != pk.b) {
            return (un0) obj;
        }
        wc.q("Does not contain segment");
        return null;
    }

    public static File f(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final zw0 g(po0 po0Var) {
        cv cvVar;
        ArrayList arrayList = new ArrayList();
        Object objG = po0Var.d.g(oo0.a);
        if (objG == null) {
            objG = null;
        }
        ah ahVar = (ah) objG;
        if (ahVar == null || (cvVar = (cv) ahVar.b) == null || !((Boolean) cvVar.g(arrayList)).booleanValue()) {
            return null;
        }
        return (zw0) arrayList.get(0);
    }

    public static final boolean h(Object obj) {
        return obj == pk.b;
    }

    public static MappedByteBuffer i(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long j(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : qc.b(j, qc.d(j) * f);
    }

    public static final nx0 k(nx0 nx0Var, e20 e20Var) {
        yr0 yr0Var = nx0Var.a;
        nw0 nw0Var = zr0.d;
        nw0 nw0Var2 = yr0Var.a;
        if (nw0Var2.equals(mw0.a)) {
            nw0Var2 = zr0.d;
        }
        nw0 nw0Var3 = nw0Var2;
        long j = yr0Var.b;
        rx0[] rx0VarArr = qx0.b;
        if ((j & 1095216660480L) == 0) {
            j = zr0.a;
        }
        long j2 = j;
        iu iuVar = yr0Var.c;
        if (iuVar == null) {
            iuVar = iu.f;
        }
        iu iuVar2 = iuVar;
        gu guVar = yr0Var.d;
        gu guVar2 = new gu(guVar != null ? guVar.a : 0);
        hu huVar = yr0Var.e;
        hu huVar2 = new hu(huVar != null ? huVar.a : 65535);
        fu0 fu0Var = yr0Var.f;
        if (fu0Var == null) {
            fu0Var = fu0.a;
        }
        fu0 fu0Var2 = fu0Var;
        String str = yr0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = yr0Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = zr0.b;
        }
        long j4 = j3;
        t7 t7Var = yr0Var.i;
        t7 t7Var2 = new t7(t7Var != null ? t7Var.a : 0.0f);
        ow0 ow0Var = yr0Var.j;
        if (ow0Var == null) {
            ow0Var = ow0.c;
        }
        ow0 ow0Var2 = ow0Var;
        t40 t40VarX = yr0Var.k;
        if (t40VarX == null) {
            t40 t40Var = t40.f;
            t40VarX = t1.x();
        }
        t40 t40Var2 = t40VarX;
        long j5 = yr0Var.l;
        if (j5 == 16) {
            j5 = zr0.c;
        }
        long j6 = j5;
        bv0 bv0Var = yr0Var.m;
        if (bv0Var == null) {
            bv0Var = bv0.b;
        }
        bv0 bv0Var2 = bv0Var;
        yp0 yp0Var = yr0Var.n;
        if (yp0Var == null) {
            yp0Var = yp0.d;
        }
        yp0 yp0Var2 = yp0Var;
        cg0 cg0Var = yr0Var.o;
        yo yoVar = yr0Var.p;
        if (yoVar == null) {
            yoVar = ir.a;
        }
        yr0 yr0Var2 = new yr0(nw0Var3, j2, iuVar2, guVar2, huVar2, fu0Var2, str2, j4, t7Var2, ow0Var2, t40Var2, j6, bv0Var2, yp0Var2, cg0Var, yoVar);
        ge0 ge0Var = nx0Var.b;
        int i = he0.b;
        int i2 = ge0Var.a;
        int i3 = 5;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 5;
        }
        int i4 = ge0Var.b;
        if (i4 == 3) {
            int iOrdinal = e20Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 4;
            } else if (iOrdinal != 1) {
                wc.l();
                return null;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int iOrdinal2 = e20Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    wc.l();
                    return null;
                }
                i3 = 2;
            }
        } else {
            i3 = i4;
        }
        long j7 = ge0Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = he0.a;
        }
        pw0 pw0Var = ge0Var.d;
        if (pw0Var == null) {
            pw0Var = pw0.c;
        }
        xf0 xf0Var = ge0Var.e;
        e40 e40Var = ge0Var.f;
        int i5 = ge0Var.g;
        if (i5 == 0) {
            i5 = z30.b;
        }
        int i6 = ge0Var.h;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        fx0 fx0Var = ge0Var.i;
        if (fx0Var == null) {
            fx0Var = fx0.c;
        }
        return new nx0(yr0Var2, new ge0(i2, i3, j7, pw0Var, xf0Var, e40Var, i5, i6, fx0Var), nx0Var.c);
    }

    public static final void l(f5 f5Var, int i) {
        Object next;
        Iterator<T> it = f5Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((s20) ((Map.Entry) next).getKey()).e == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        wc.c();
    }

    public abstract void n(boolean z);

    public void m(boolean z) {
    }
}
