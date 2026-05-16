package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public class yf0 implements ag0, qh0 {
    public static yf0 e;
    public final /* synthetic */ int d;

    public /* synthetic */ yf0(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(yf0 yf0Var) {
        ps0 ps0Var;
        ef0 ef0Var;
        Object obj;
        ps0 ps0Var2 = mi0.x;
        do {
            ps0Var = mi0.x;
            ef0 ef0Var2 = (ef0) ps0Var.getValue();
            ve0 ve0VarA = ef0Var2.f;
            l40 l40Var = (l40) ve0VarA.get(yf0Var);
            if (l40Var == null) {
                ef0Var = ef0Var2;
            } else {
                Object obj2 = l40Var.a;
                Object obj3 = l40Var.b;
                uy0 uy0Var = ve0VarA.d;
                uy0 uy0VarV = uy0Var.v(yf0Var != null ? yf0Var.hashCode() : 0, 0, yf0Var);
                if (uy0Var != uy0VarV) {
                    ve0VarA = uy0VarV == null ? ve0.f : new ve0(uy0VarV, ve0VarA.e - 1);
                }
                bw bwVar = bw.ab;
                if (obj2 != bwVar) {
                    Object obj4 = ve0VarA.get(obj2);
                    obj4.getClass();
                    ve0VarA = ve0VarA.a(obj2, new l40(((l40) obj4).a, obj3));
                }
                if (obj3 != bwVar) {
                    Object obj5 = ve0VarA.get(obj3);
                    obj5.getClass();
                    ve0VarA = ve0VarA.a(obj3, new l40(obj2, ((l40) obj5).b));
                }
                Object obj6 = obj2 != bwVar ? ef0Var2.d : obj3;
                if (obj3 != bwVar) {
                    obj2 = ef0Var2.e;
                }
                ef0Var = new ef0(obj6, obj2, ve0VarA);
            }
            if (ef0Var2 == ef0Var) {
                return;
            }
            jq jqVar = m10.d;
            obj = ef0Var2;
            if (ef0Var2 == null) {
                obj = jqVar;
            }
        } while (!ps0Var.h(obj, ef0Var));
    }

    public static final int b(long j, int i) {
        int i2 = dy0.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Typeface c(String str, iu iuVar, int i) {
        if (i == 0 && f00.h(iuVar, iu.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), iuVar.d, i == 1);
    }

    public static Typeface e(String str, iu iuVar, int i) {
        if (i == 0 && f00.h(iuVar, iu.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iW = m10.w(iuVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iW) : Typeface.create(str, iW);
    }

    @Override // defpackage.qh0
    public void d(int i, Object obj) {
        String str;
        switch (this.d) {
            case 4:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case MainActivity.$stable /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface f(wv wvVar, iu iuVar, int i) {
        String str;
        switch (this.d) {
            case 1:
                wvVar.getClass();
                return c("sans-serif", iuVar, i);
            default:
                wvVar.getClass();
                int i2 = iuVar.d / 100;
                if (i2 >= 0 && i2 < 2) {
                    str = "sans-serif-thin";
                } else if (2 <= i2 && i2 < 4) {
                    str = "sans-serif-light";
                } else if (i2 != 4) {
                    str = i2 == 5 ? "sans-serif-medium" : ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) ? "sans-serif-black" : "sans-serif";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface typefaceE = e(str, iuVar, i);
                    if (!f00.h(typefaceE, Typeface.create(Typeface.DEFAULT, m10.w(iuVar, i))) && !f00.h(typefaceE, e(null, iuVar, i))) {
                        typeface = typefaceE;
                    }
                }
                return typeface == null ? e("sans-serif", iuVar, i) : typeface;
        }
    }

    public boolean g(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 14:
                return "SharingStarted.Eagerly";
            case 15:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    private final void h(int i, Object obj) {
    }

    public void i(zg0 zg0Var, int i, int i2) {
    }
}
