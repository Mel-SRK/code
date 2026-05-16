package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.view.KeyEvent;
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
    */
    public int h(KeyEvent keyEvent) {
        int i;
        int i2 = 20;
        switch (this.d) {
            case 20:
                int i3 = q10.k;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long jAa = m10.aa(keyEvent);
                        if (!(k10.a(jAa, g60.b) ? true : k10.a(jAa, g60.q))) {
                            if (!k10.a(jAa, g60.d)) {
                                if (!k10.a(jAa, g60.f)) {
                                    if (k10.a(jAa, g60.a)) {
                                        return 26;
                                    }
                                    if (!k10.a(jAa, g60.e)) {
                                        if (k10.a(jAa, g60.g)) {
                                            return 46;
                                        }
                                        return 0;
                                    }
                                    return 47;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (!keyEvent.isShiftPressed()) {
                            long jG = e00.g(keyEvent.getKeyCode());
                            if (k10.a(jG, g60.i)) {
                                return 1;
                            }
                            if (k10.a(jG, g60.j)) {
                                return 2;
                            }
                            if (k10.a(jG, g60.k)) {
                                return 11;
                            }
                            if (k10.a(jG, g60.l)) {
                                return 12;
                            }
                            if (k10.a(jG, g60.m)) {
                                return 13;
                            }
                            if (k10.a(jG, g60.n)) {
                                return 14;
                            }
                            if (k10.a(jG, g60.o)) {
                                return 7;
                            }
                            if (k10.a(jG, g60.p)) {
                                return 8;
                            }
                            if (k10.a(jG, g60.r)) {
                                return 44;
                            }
                            if (k10.a(jG, g60.s)) {
                                return 20;
                            }
                            if (k10.a(jG, g60.t)) {
                                return 21;
                            }
                            if (!k10.a(jG, g60.u)) {
                                if (!k10.a(jG, g60.v)) {
                                    if (!k10.a(jG, g60.w)) {
                                        if (k10.a(jG, g60.x)) {
                                            return 45;
                                        }
                                    }
                                    return 17;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        long jG2 = e00.g(keyEvent.getKeyCode());
                        if (k10.a(jG2, g60.i)) {
                            return 27;
                        }
                        if (k10.a(jG2, g60.j)) {
                            return 28;
                        }
                        if (k10.a(jG2, g60.k)) {
                            return 29;
                        }
                        if (k10.a(jG2, g60.l)) {
                            return 30;
                        }
                        if (k10.a(jG2, g60.m)) {
                            return 31;
                        }
                        if (k10.a(jG2, g60.n)) {
                            return 32;
                        }
                        if (k10.a(jG2, g60.o)) {
                            return 39;
                        }
                        if (k10.a(jG2, g60.p)) {
                            return 40;
                        }
                        break;
                    }
                    return 0;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jG3 = e00.g(keyEvent.getKeyCode());
                    if (k10.a(jG3, g60.i)) {
                        i = 41;
                    } else if (k10.a(jG3, g60.j)) {
                        i = 42;
                    } else if (k10.a(jG3, g60.k)) {
                        i = 33;
                    } else if (k10.a(jG3, g60.l)) {
                        i = 34;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jG4 = e00.g(keyEvent.getKeyCode());
                    i = k10.a(jG4, g60.i) ? 9 : k10.a(jG4, g60.j) ? 10 : k10.a(jG4, g60.k) ? 15 : k10.a(jG4, g60.l) ? 16 : 0;
                }
                if (i != 0) {
                    return i;
                }
                bu buVar = r10.a;
                buVar.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jG5 = e00.g(keyEvent.getKeyCode());
                    if (k10.a(jG5, g60.i)) {
                        i2 = 35;
                    } else if (k10.a(jG5, g60.j)) {
                        i2 = 36;
                    } else if (k10.a(jG5, g60.k)) {
                        i2 = 38;
                    } else if (k10.a(jG5, g60.l)) {
                        i2 = 37;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jG6 = e00.g(keyEvent.getKeyCode());
                    if (k10.a(jG6, g60.i)) {
                        i2 = 4;
                    } else if (k10.a(jG6, g60.j)) {
                        i2 = 3;
                    } else if (k10.a(jG6, g60.k)) {
                        i2 = 6;
                    } else if (k10.a(jG6, g60.l)) {
                        i2 = 5;
                    } else if (!k10.a(jG6, g60.c)) {
                        i2 = k10.a(jG6, g60.t) ? 23 : k10.a(jG6, g60.s) ? 22 : k10.a(jG6, g60.h) ? 43 : 0;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long jG7 = e00.g(keyEvent.getKeyCode());
                    if (k10.a(jG7, g60.o)) {
                        i2 = 41;
                    } else if (k10.a(jG7, g60.p)) {
                        i2 = 42;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jG8 = e00.g(keyEvent.getKeyCode());
                    if (k10.a(jG8, g60.s)) {
                        i2 = 24;
                    } else if (k10.a(jG8, g60.t)) {
                        i2 = 25;
                    }
                }
                return i2 == 0 ? ((n31) buVar.e).h(keyEvent) : i2;
        }
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
