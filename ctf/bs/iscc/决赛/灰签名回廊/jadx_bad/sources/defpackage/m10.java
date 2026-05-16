package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class m10 {
    public static final jq a = new jq("RESUME_TOKEN", 1);
    public static final hg0 b = new hg0(null, new xf0());
    public static final int[] c = new int[2];
    public static final jq d = new jq("NULL", 1);
    public static final ck0 e = new ck0(0.16f, 0.1f, 0.08f, 0.1f);
    public static final Object f = new Object();

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f2, float f3, float f4, float f5, dd ddVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int i4;
        int i5;
        int i6;
        int i7;
        float fB2;
        float fA2;
        int i8;
        int i9;
        int i10;
        float f6;
        if (ddVar.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i11 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i12 = i11 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i13 = i12 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j = ((long) (i13 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = qc.h;
            return j;
        }
        long j2 = ddVar.b;
        int i15 = uc.e;
        if (((int) (j2 >> 32)) != 3) {
            vy.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = ddVar.c;
        if (i16 == -1) {
            vy.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = ddVar.b(0);
        float fA3 = ddVar.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fA3);
        int i17 = iFloatToRawIntBits >>> 31;
        int i18 = (iFloatToRawIntBits >>> 23) & 255;
        int i19 = iFloatToRawIntBits & 8388607;
        if (i18 == 255) {
            i2 = i19 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i18 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i20 = i19 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i3;
                    fB = ddVar.b(1);
                    fA = ddVar.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
                    int i21 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i22 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i22 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i23 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i7;
                                fB2 = ddVar.b(2);
                                fA2 = ddVar.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA2);
                                int i24 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i25 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i26 = i8 - 112;
                                    if (i26 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s3 = (short) i10;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i28 = qc.h;
                                            return j3;
                                        }
                                        i9 = i27;
                                        i = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i9 = i29 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i24 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i282 = qc.h;
                                return j32;
                            }
                            i6 = i23;
                        } else if (i5 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i5);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i6 = i30 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i21 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fB2 = ddVar.b(2);
                    fA2 = ddVar.a(2);
                    if (f4 >= fB2) {
                    }
                    if (fB2 <= fA2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fA2);
                    int i242 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i242 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2822 = qc.h;
                    return j322;
                }
                i2 = i20;
            } else if (i >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i2 = i31 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i17 << 15) | (i << 10);
        short s4 = (short) i3;
        fB = ddVar.b(1);
        fA = ddVar.a(1);
        if (f3 >= fB) {
        }
        if (fB <= fA) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fA);
        int i212 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i222 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i212 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fB2 = ddVar.b(2);
        fA2 = ddVar.a(2);
        if (f4 >= fB2) {
        }
        if (fB2 <= fA2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fA2);
        int i2422 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2422 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f5 >= 0.0f) {
        }
        long j3222 = (((long) i16) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i28222 = qc.h;
        return j3222;
    }

    public static final long aa(KeyEvent keyEvent) {
        return e00.g(keyEvent.getKeyCode());
    }

    public static final int ab(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final Bundle ac(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static final int ad(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void ae(pj pjVar, Throwable th) {
        try {
            rj rjVar = (rj) pjVar.k(bw.v);
            if (rjVar != null) {
                rjVar.p(pjVar, th);
            } else {
                f00.w(pjVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                t1.g(runtimeException, th);
                th = runtimeException;
            }
            f00.w(pjVar, th);
        }
    }

    public static final boolean af(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean ag(long j) {
        return (j & 2) != 0;
    }

    public static final boolean ah(long j) {
        return (j & 1) != 0;
    }

    public static final float ai(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int aj(float f2, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f2)));
    }

    public static final long ak(float f2, long j, long j2) {
        cb0 cb0Var = gd.x;
        long jA = qc.a(j, cb0Var);
        long jA2 = qc.a(j2, cb0Var);
        float fD = qc.d(jA);
        float fH = qc.h(jA);
        float fG = qc.g(jA);
        float fE = qc.e(jA);
        float fD2 = qc.d(jA2);
        float fH2 = qc.h(jA2);
        float fG2 = qc.g(jA2);
        float fE2 = qc.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return qc.a(g(ai(fH, fH2, f2), ai(fG, fG2, f2), ai(fE, fE2, f2), ai(fD, fD2, f2), cb0Var), qc.f(j2));
    }

    public static final float al(long j) {
        dd ddVarF = qc.f(j);
        if (!uc.a(ddVarF.b, uc.a)) {
            vy.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) uc.b(ddVarF.b)));
        }
        xj0 xj0Var = ((bk0) ddVarF).p;
        double dB = xj0Var.b(qc.h(j));
        float fB = (float) ((xj0Var.b(qc.e(j)) * 0.0722d) + (xj0Var.b(qc.g(j)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final j70 am(vf vfVar, j70 j70Var) {
        if (j70Var.b(q0.w)) {
            return j70Var;
        }
        vfVar.ar(1219399079, null, 0, null);
        j70 j70Var2 = (j70) j70Var.a(new j(5, vfVar), g70.a);
        vfVar.q(false);
        return j70Var2;
    }

    public static final j70 an(vf vfVar, j70 j70Var) {
        vfVar.av(439770924);
        j70 j70VarAm = am(vfVar, j70Var);
        vfVar.q(false);
        return j70VarAm;
    }

    public static final Object aq(Object[] objArr, hm0 hm0Var, pu puVar, vf vfVar, int i, int i2) {
        Object[] objArr2;
        hm0 hm0Var2;
        final Object obj;
        Object objB;
        long j = vfVar.ar;
        az0.s(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        hm0Var.getClass();
        final rl0 rl0Var = (rl0) vfVar.j(tl0.a);
        Object objAk = vfVar.ak();
        Object obj2 = nf.a;
        if (objAk == obj2) {
            Object objH = (rl0Var == null || (objB = rl0Var.b(string)) == null) ? null : hm0Var.h(objB);
            if (objH == null) {
                objH = puVar.a();
            }
            objArr2 = objArr;
            hm0Var2 = hm0Var;
            Object ql0Var = new ql0(hm0Var2, rl0Var, string, objH, objArr2);
            vfVar.be(ql0Var);
            objAk = ql0Var;
        } else {
            objArr2 = objArr;
            hm0Var2 = hm0Var;
        }
        final ql0 ql0Var2 = (ql0) objAk;
        Object objA = Arrays.equals(objArr2, ql0Var2.h) ? ql0Var2.g : null;
        if (objA == null) {
            objA = puVar.a();
        }
        boolean zH = vfVar.h(ql0Var2) | ((((i & 112) ^ 48) > 32 && vfVar.h(hm0Var2)) || (i & 48) == 32) | vfVar.h(rl0Var) | vfVar.f(string) | vfVar.h(objA) | vfVar.h(objArr2);
        Object objAk2 = vfVar.ak();
        if (zH || objAk2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objA;
            final hm0 hm0Var3 = hm0Var2;
            Object obj3 = new pu() { // from class: dj0
                @Override // defpackage.pu
                public final Object a() {
                    boolean z;
                    ql0 ql0Var3 = ql0Var2;
                    rl0 rl0Var2 = ql0Var3.e;
                    rl0 rl0Var3 = rl0Var;
                    boolean z2 = true;
                    if (rl0Var2 != rl0Var3) {
                        ql0Var3.e = rl0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = ql0Var3.f;
                    String str2 = string;
                    if (f00.h(str, str2)) {
                        z2 = z;
                    } else {
                        ql0Var3.f = str2;
                    }
                    ql0Var3.d = hm0Var3;
                    ql0Var3.g = obj;
                    ql0Var3.h = objArr3;
                    o6 o6Var = ql0Var3.i;
                    if (o6Var != null && z2) {
                        o6Var.ac();
                        ql0Var3.i = null;
                        ql0Var3.a();
                    }
                    return wz0.a;
                }
            };
            vfVar.be(obj3);
            objAk2 = obj3;
        } else {
            obj = objA;
        }
        pk.i((pu) objAk2, vfVar);
        return obj;
    }

    public static void ar(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ax.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            ax.f(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            at(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            at(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            at(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        at(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void as(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            rp.a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void at(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final long au(long j, float f2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final int av(long j) {
        float[] fArr = gd.a;
        return (int) (qc.a(j, gd.e) >>> 32);
    }

    public static final String aw(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f3 = f2 * fPow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final Object ax(pj pjVar, Object obj, Object obj2, gv gvVar, ji jiVar) {
        Object objF;
        Object objAw = t1.aw(pjVar, obj2);
        try {
            fs0 fs0Var = new fs0(jiVar, pjVar);
            if (gvVar == null) {
                objF = f00.am(gvVar, obj, fs0Var);
            } else {
                az0.p(2, gvVar);
                objF = gvVar.f(obj, fs0Var);
            }
            t1.at(pjVar, objAw);
            if (objF == yj.d) {
                jiVar.getClass();
            }
            return objF;
        } catch (Throwable th) {
            t1.at(pjVar, objAw);
            throw th;
        }
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = qc.h;
        return j;
    }

    public static final long c(long j) {
        long j2 = j << 32;
        int i = qc.h;
        return j2;
    }

    public static long d(int i, int i2, int i3) {
        return b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final j90 e(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new j90(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void f(long j, nx0 nx0Var, gv gvVar, vf vfVar, int i) {
        int i2;
        vfVar.aw(-716124955);
        if ((i & 6) == 0) {
            i2 = (vfVar.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vfVar.f(nx0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.h(gvVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            qg qgVar = ww0.a;
            az0.b(new ci0[]{jh.a.a(new qc(j)), qgVar.a(((nx0) vfVar.j(qgVar)).d(nx0Var))}, gvVar, vfVar, ((i2 >> 3) & 112) | 8);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new bi0(j, nx0Var, gvVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long g(float f2, float f3, float f4, float f5, dd ddVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (ddVar.c()) {
            long j = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i10 = qc.h;
            return j;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = iFloatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i17 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i18 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i20 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & iFloatToRawIntBits3;
                                if (i8 != 255) {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                            } else {
                                                i14 = i22;
                                            }
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & 4096) != 0) {
                                                i23 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ddVar.c) & 63);
                                    int i24 = qc.h;
                                    return jMax;
                                }
                                i15 = i21 == 0 ? 0 : 512;
                                i14 = 31;
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long jMax2 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ddVar.c) & 63);
                                int i242 = qc.h;
                                return jMax2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i202 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & iFloatToRawIntBits32;
                    if (i8 != 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long jMax22 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ddVar.c) & 63);
                    int i2422 = qc.h;
                    return jMax22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i172 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i182 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2022 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & iFloatToRawIntBits322;
        if (i8 != 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long jMax222 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ddVar.c) & 63);
        int i24222 = qc.h;
        return jMax222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View h(View view, View view2, int i) {
        View viewU;
        int nextFocusForwardId;
        View viewU2;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                x0 x0Var = new x0(nextFocusForwardId, 1);
                View view3 = null;
                while (true) {
                    viewU2 = u(view, x0Var, view3);
                    if (viewU2 != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return viewU2;
            }
        } else if (view.getId() != -1) {
            a2 a2Var = new a2(13, view2, view);
            View view5 = null;
            while (true) {
                viewU = u(view, a2Var, view5);
                if (viewU != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return viewU;
        }
        return null;
    }

    public static final void i(View view, ArrayList arrayList, boolean z) {
        int i;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                viewArr[i2] = viewGroup.getChildAt(i2);
            }
            m80 m80Var = dt.a;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            wf wfVar = dt.f;
            m80 m80Var2 = dt.a;
            q80 q80Var = dt.d;
            if (childCount < 2) {
                i = 0;
            } else {
                int i3 = childCount - m80Var2.b;
                i = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    m80Var2.a(new Rect());
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    View view2 = viewArr[i5];
                    int i6 = dt.b;
                    dt.b = i6 + 1;
                    Rect rect = (Rect) m80Var2.e(i6);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    q80Var.l(view2, rect);
                }
                wf wfVar2 = dt.e;
                wfVar2.getClass();
                if (childCount > 1) {
                    Arrays.sort(viewArr, wfVar2);
                }
                Object objG = q80Var.g(viewArr[0]);
                objG.getClass();
                int iMax = ((Rect) objG).bottom;
                dt.c = z4 ? -1 : 1;
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    Object objG2 = q80Var.g(viewArr[i8]);
                    objG2.getClass();
                    Rect rect2 = (Rect) objG2;
                    if (rect2.top >= iMax) {
                        if (i8 - i7 > 1) {
                            h7.bc(viewArr, wfVar, i7, i8);
                        }
                        iMax = rect2.bottom;
                        i7 = i8;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                }
                if (childCount - i7 > 1) {
                    h7.bc(viewArr, wfVar, i7, childCount);
                }
                dt.b = 0;
                q80Var.a();
            }
            for (int i9 = i; i9 < childCount; i9++) {
                i(viewArr[i9], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int j(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static final void k(o11 o11Var, bm0 bm0Var, p30 p30Var) {
        AutoCloseable autoCloseable;
        bm0Var.getClass();
        p30Var.getClass();
        p11 p11Var = o11Var.a;
        if (p11Var != null) {
            synchronized (p11Var.a) {
                autoCloseable = (AutoCloseable) p11Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        vl0 vl0Var = (vl0) autoCloseable;
        if (vl0Var == null || vl0Var.f) {
            return;
        }
        vl0Var.e(p30Var, bm0Var);
        o30 o30Var = ((w30) p30Var).c;
        if (o30Var == o30.e || o30Var.compareTo(o30.g) >= 0) {
            bm0Var.c();
        } else {
            p30Var.a(new jl(p30Var, bm0Var));
        }
    }

    public static final int o(long j, long j2) {
        boolean zAh = ah(j);
        if (zAh != ah(j2)) {
            return zAh ? -1 : 1;
        }
        return (Math.min(x(j), x(j2)) >= 0.0f && ag(j) != ag(j2)) ? ag(j) ? -1 : 1 : (int) Math.signum(x(j) - x(j2));
    }

    public static final j70 p(j70 j70Var, hv hvVar) {
        return j70Var.c(new mf(hvVar));
    }

    public static final long q(long j, long j2) {
        float f2;
        float f3;
        long jA = qc.a(j, qc.f(j2));
        float fD = qc.d(j2);
        float fD2 = qc.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = qc.h(jA);
        float fH2 = qc.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = qc.g(jA);
        float fG2 = qc.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = qc.e(jA);
        float fE2 = qc.e(j2);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return g(f2, f3, f6, f5, qc.f(j2));
    }

    public static final w5 r(w5 w5Var) {
        w5 w5VarC = w5Var.c();
        int iB = w5VarC.b();
        for (int i = 0; i < iB; i++) {
            w5VarC.e(w5Var.a(i), i);
        }
        return w5VarC;
    }

    public static void s(xo xoVar, bd0 bd0Var, long j) {
        if (bd0Var instanceof zc0) {
            ri0 ri0Var = ((zc0) bd0Var).a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ri0Var.a)) << 32) | (((long) Float.floatToRawIntBits(ri0Var.b)) & 4294967295L);
            float f2 = ri0Var.c - ri0Var.a;
            xoVar.ah(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(ri0Var.d - ri0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), 3);
            return;
        }
        boolean z = bd0Var instanceof ad0;
        ir irVar = ir.a;
        if (!z) {
            if (bd0Var instanceof yc0) {
                xoVar.ao(((yc0) bd0Var).a, j, irVar);
                return;
            } else {
                wc.l();
                return;
            }
        }
        ad0 ad0Var = (ad0) bd0Var;
        t3 t3Var = ad0Var.b;
        if (t3Var != null) {
            xoVar.ao(t3Var, j, irVar);
            return;
        }
        yk0 yk0Var = ad0Var.a;
        float f3 = yk0Var.b;
        float f4 = yk0Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (yk0Var.h >> 32));
        xoVar.u(j, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(yk0Var.c - f4)) << 32) | (((long) Float.floatToRawIntBits(yk0Var.d - f3)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float t(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / ((long) 3))) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final View u(View view, cv cvVar, View view2) {
        View viewU;
        if (((Boolean) cvVar.g(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewU = u(childAt, cvVar, view2)) != null) {
                return viewU;
            }
        }
        return null;
    }

    public static final String v(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final int w(iu iuVar, int i) {
        boolean z = f00.m(iuVar.d, iu.e.d) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final float x(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float y(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        av0 av0Var = cx0.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : ly.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float z(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        av0 av0Var = cx0.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? ly.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public abstract void ao(ac acVar, ac acVar2);

    public abstract void ap(ac acVar, Thread thread);

    public abstract boolean l(ad adVar, z zVar);

    public abstract boolean m(ad adVar, Object obj, Object obj2);

    public abstract boolean n(ad adVar, ac acVar, ac acVar2);
}
