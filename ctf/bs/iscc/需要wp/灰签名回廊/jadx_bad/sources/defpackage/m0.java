package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.example.gnd.MainActivity;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0259  */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, x20] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, x20] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b1 b1Var;
        b1 b1Var2;
        View viewFindFocus;
        Boolean bool = null;
        int i = 0;
        switch (this.d) {
            case 0:
                b1 b1Var3 = (b1) this.e;
                b1Var3.O0 = false;
                MotionEvent motionEvent = b1Var3.br;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    b1Var3.ae(motionEvent);
                    return;
                } else {
                    wc.q("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 1:
                k1 k1Var = (k1) this.e;
                Trace.beginSection("measureAndLayout");
                try {
                    k1Var.d.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        k1Var.f();
                        Trace.endSection();
                        k1Var.al = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                h2 h2Var = (h2) this.e;
                boolean zH = h2Var.h();
                b1 b1Var4 = h2Var.d;
                if (zH) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        b1Var4.t(true);
                        e80 e80Var = h2Var.o;
                        int[] iArr = e80Var.b;
                        long[] jArr = e80Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = i;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (h2Var.g().a(i5)) {
                                                b1Var2 = b1Var4;
                                            } else {
                                                b1Var2 = b1Var4;
                                                h2Var.g.add(new gh(i5, h2Var.n, hh.e, null));
                                                h2Var.k.u(wz0.a);
                                            }
                                        }
                                        j >>= 8;
                                        i4++;
                                        b1Var4 = b1Var2;
                                    }
                                    b1Var = b1Var4;
                                    if (i3 == 8) {
                                    }
                                } else {
                                    b1Var = b1Var4;
                                }
                                if (i2 != length) {
                                    i2++;
                                    b1Var4 = b1Var;
                                    i = 0;
                                }
                            }
                        } else {
                            b1Var = b1Var4;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        h2Var.j(b1Var.getSemanticsOwner().a(), h2Var.p);
                        Trace.endSection();
                        h2Var.f(h2Var.g());
                        h2Var.n();
                        h2Var.q = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 3:
                le leVar = (le) this.e;
                Runnable runnable = leVar.e;
                if (runnable != null) {
                    runnable.run();
                    leVar.e = null;
                    return;
                }
                return;
            case 4:
                zt ztVar = (zt) this.e;
                synchronized (ztVar.g) {
                    try {
                        if (ztVar.k == null) {
                            return;
                        }
                        try {
                            ku kuVarC = ztVar.c();
                            int i6 = kuVarC.f;
                            if (i6 == 2) {
                                synchronized (ztVar.g) {
                                }
                            }
                            if (i6 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                            }
                            try {
                                int i7 = gy0.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                n31 n31Var = ztVar.f;
                                Context context = ztVar.d;
                                n31Var.getClass();
                                ku[] kuVarArr = {kuVarC};
                                wo0 wo0Var = dz0.a;
                                jo0.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceF = dz0.a.f(context, kuVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferI = wn0.i(ztVar.d, kuVarC.a);
                                    if (mappedByteBufferI == null || typefaceF == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        a0 a0Var = new a0(typefaceF, az0.aa(mappedByteBufferI));
                                        Trace.endSection();
                                        synchronized (ztVar.g) {
                                            try {
                                                i60 i60Var = ztVar.k;
                                                if (i60Var != null) {
                                                    i60Var.as(a0Var);
                                                }
                                            } finally {
                                            }
                                            break;
                                        }
                                        ztVar.b();
                                        return;
                                    } finally {
                                        int i8 = gy0.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (ztVar.g) {
                                try {
                                    i60 i60Var2 = ztVar.k;
                                    if (i60Var2 != null) {
                                        i60Var2.ar(th2);
                                    }
                                    ztVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 5:
                nh0 nh0Var = (nh0) this.e;
                w30 w30Var = nh0Var.i;
                if (nh0Var.e == 0) {
                    nh0Var.f = true;
                    w30Var.e(n30.ON_PAUSE);
                }
                if (nh0Var.d == 0 && nh0Var.f) {
                    w30Var.e(n30.ON_STOP);
                    nh0Var.g = true;
                    return;
                }
                return;
            case 6:
                lk0.setRippleState$lambda$2((lk0) this.e);
                return;
            case 7:
                View view = (View) this.e;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case MainActivity.$stable /* 8 */:
                bu0 bu0Var = ((du0) this.e).a;
                ViewParent parent = bu0Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(bu0Var);
                    return;
                }
                return;
            default:
                sw0 sw0Var = (sw0) this.e;
                o6 o6Var = sw0Var.b;
                sw0Var.n = null;
                a90 a90Var = sw0Var.m;
                View view2 = sw0Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    a90Var.g();
                    return;
                }
                Object[] objArr = a90Var.d;
                int i9 = a90Var.f;
                Boolean boolValueOf = null;
                for (int i10 = 0; i10 < i9; i10++) {
                    rw0 rw0Var = (rw0) objArr[i10];
                    int iOrdinal = rw0Var.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        wc.l();
                        return;
                    } else {
                        if (!f00.h(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(rw0Var == rw0.f);
                        }
                    }
                    boolValueOf = bool;
                }
                a90Var.g();
                if (f00.h(bool, Boolean.TRUE)) {
                    ((InputMethodManager) o6Var.b.getValue()).restartInput((View) o6Var.a);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((bu) ((bu) o6Var.c).e).p();
                    } else {
                        ((bu) ((bu) o6Var.c).e).i();
                    }
                }
                if (f00.h(bool, Boolean.FALSE)) {
                    ((InputMethodManager) o6Var.b.getValue()).restartInput((View) o6Var.a);
                    return;
                }
                return;
        }
    }
}
