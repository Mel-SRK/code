package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements gc {
    public final ClipboardManager a;

    public h0(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b6 b6Var) {
        int i;
        List list = b6Var.f;
        rq rqVar = rq.d;
        List list2 = list == null ? rqVar : list;
        CharSequence charSequence = b6Var.e;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            rk rkVar = new rk();
            rkVar.a = Parcel.obtain();
            if (list == null) {
                list = rqVar;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                a6 a6Var = (a6) list.get(i2);
                yr0 yr0Var = (yr0) a6Var.a;
                int i3 = a6Var.b;
                int i4 = a6Var.c;
                rkVar.a.recycle();
                rkVar.a = Parcel.obtain();
                nw0 nw0Var = yr0Var.a;
                long j = yr0Var.l;
                long j2 = yr0Var.h;
                long j3 = yr0Var.b;
                int i5 = i2;
                long jB = nw0Var.b();
                List list3 = list;
                int i6 = size;
                long j4 = qc.g;
                if (qc.c(jB, j4)) {
                    i = i4;
                } else {
                    rkVar.c((byte) 1);
                    i = i4;
                    rkVar.f(yr0Var.a.b());
                }
                long j5 = qx0.c;
                byte b = 2;
                if (!qx0.a(j3, j5)) {
                    rkVar.c((byte) 2);
                    rkVar.e(j3);
                }
                iu iuVar = yr0Var.c;
                if (iuVar != null) {
                    rkVar.c((byte) 3);
                    rkVar.a.writeInt(iuVar.d);
                }
                gu guVar = yr0Var.d;
                if (guVar != null) {
                    int i7 = guVar.a;
                    rkVar.c((byte) 4);
                    rkVar.c((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
                }
                hu huVar = yr0Var.e;
                if (huVar != null) {
                    int i8 = huVar.a;
                    rkVar.c((byte) 5);
                    if (i8 != 0) {
                        if (i8 == 65535) {
                            b = 1;
                        } else if (i8 != 1) {
                            b = i8 == 2 ? (byte) 3 : (byte) 0;
                        }
                        rkVar.c(b);
                    }
                }
                String str = yr0Var.g;
                if (str != null) {
                    rkVar.c((byte) 6);
                    rkVar.a.writeString(str);
                }
                if (!qx0.a(j2, j5)) {
                    rkVar.c((byte) 7);
                    rkVar.e(j2);
                }
                t7 t7Var = yr0Var.i;
                if (t7Var != null) {
                    float f = t7Var.a;
                    rkVar.c((byte) 8);
                    rkVar.d(f);
                }
                ow0 ow0Var = yr0Var.j;
                if (ow0Var != null) {
                    rkVar.c((byte) 9);
                    rkVar.d(ow0Var.a);
                    rkVar.d(ow0Var.b);
                }
                if (!qc.c(j, j4)) {
                    rkVar.c((byte) 10);
                    rkVar.f(j);
                }
                bv0 bv0Var = yr0Var.m;
                if (bv0Var != null) {
                    rkVar.c((byte) 11);
                    rkVar.a.writeInt(bv0Var.a);
                }
                yp0 yp0Var = yr0Var.n;
                if (yp0Var != null) {
                    rkVar.c((byte) 12);
                    rkVar.f(yp0Var.a);
                    long j6 = yp0Var.b;
                    rkVar.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    rkVar.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    rkVar.d(yp0Var.c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(rkVar.a.marshall(), 0)), i3, i, 33);
                i2 = i5 + 1;
                list = list3;
                size = i6;
            }
            charSequence = spannableString;
        }
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
