package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft extends rv implements cv {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    @Override // defpackage.cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        pd pdVar;
        int iH;
        Integer numValueOf;
        switch (this.l) {
            case 0:
                ((m00) this.e).getClass();
                Object obj2 = ((gt) obj).d;
                so0 so0Var = obj2 instanceof so0 ? (so0) obj2 : null;
                if (so0Var != null) {
                    q6.j(so0Var);
                }
                return wz0.a;
            case 1:
                ((w00) this.e).l((Throwable) obj);
                return wz0.a;
            default:
                KeyEvent keyEvent = ((l10) obj).a;
                rv0 rv0Var = (rv0) this.e;
                gx0 gx0Var = rv0Var.f;
                boolean z = rv0Var.d;
                boolean z2 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    pdVar = null;
                } else {
                    nk nkVar = rv0Var.i;
                    nkVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        nkVar.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = nkVar.a;
                        if (num != null) {
                            nkVar.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            numValueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        pdVar = new pd(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (pdVar != null) {
                    if (z) {
                        rv0Var.a(f00.y(pdVar));
                        gx0Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (m10.ad(keyEvent) == 2 && (iH = rv0Var.j.h(keyEvent)) != 0) {
                    boolean z3 = true;
                    switch (iH) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case MainActivity.$stable /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                            z3 = false;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                            if (!z3 || z) {
                                ti0 ti0Var = new ti0();
                                ti0Var.d = true;
                                kn0 kn0Var = new kn0(iH, rv0Var, ti0Var);
                                lw0 lw0Var = rv0Var.c;
                                tv0 tv0Var = new tv0(lw0Var, rv0Var.g, rv0Var.a.d(), gx0Var);
                                kn0Var.g(tv0Var);
                                if (!hx0.a(tv0Var.f, lw0Var.b) || !f00.h(tv0Var.g, lw0Var.a)) {
                                    rv0Var.k.g(lw0.a(lw0Var, tv0Var.g, tv0Var.f, 4));
                                }
                                vz0 vz0Var = rv0Var.h;
                                if (vz0Var != null) {
                                    vz0Var.e = true;
                                }
                                z2 = ti0Var.d;
                                break;
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }
}
