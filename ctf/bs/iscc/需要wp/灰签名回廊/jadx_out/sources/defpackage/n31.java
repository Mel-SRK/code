package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.example.gnd.MainActivity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class n31 implements pt, s6, oj, ab0 {
    public static final m31 e = new m31();
    public final /* synthetic */ int d;

    public n31() {
        this.d = 7;
        new r50(16);
        long[] jArr = mm0.a;
        new q80();
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    @Override // defpackage.s6
    public void c(r60 r60Var, int i, int[] iArr, e20 e20Var, int[] iArr2) {
        switch (this.d) {
            case 4:
                x6.b(iArr, iArr2, false);
                break;
            case 5:
                x6.c(i, iArr, iArr2, false);
                break;
            default:
                if (e20Var != e20.d) {
                    x6.c(i, iArr, iArr2, true);
                } else {
                    x6.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public int f() {
        switch (this.d) {
            case 26:
                return 16;
            default:
                return 8;
        }
    }

    public Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a7, code lost:
    
        if (defpackage.k10.a(defpackage.e00.g(r10.getKeyCode()), defpackage.g60.g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027e, code lost:
    
        if (defpackage.k10.a(r0, defpackage.g60.q) != false) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(android.view.KeyEvent r10) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n31.h(android.view.KeyEvent):int");
    }

    public String toString() {
        switch (this.d) {
            case 4:
                return "AbsoluteArrangement#Left";
            case 5:
                return "AbsoluteArrangement#Right";
            case 6:
                return "Arrangement#Start";
            case 7:
            case MainActivity.$stable /* 8 */:
            case 9:
            default:
                return super.toString();
            case 10:
                return "Empty";
            case 11:
                return "CompositionErrorContext";
        }
    }

    public /* synthetic */ n31(int i) {
        this.d = i;
    }

    public n31(cg cgVar) {
        this.d = 12;
    }

    @Override // defpackage.ab0
    public int b(int i) {
        return i;
    }

    @Override // defpackage.ab0
    public int d(int i) {
        return i;
    }
}
