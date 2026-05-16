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
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface f(defpackage.wv r5, defpackage.iu r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.d
            switch(r0) {
                case 1: goto L66;
                default: goto L5;
            }
        L5:
            r5.getClass()
            int r5 = r6.d
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L16
            if (r5 >= r1) goto L16
            java.lang.String r5 = "sans-serif-thin"
            goto L38
        L16:
            r2 = 4
            if (r1 > r5) goto L1e
            if (r5 >= r2) goto L1e
            java.lang.String r5 = "sans-serif-light"
            goto L38
        L1e:
            if (r5 != r2) goto L22
        L20:
            r5 = r0
            goto L38
        L22:
            r1 = 5
            if (r5 != r1) goto L28
            java.lang.String r5 = "sans-serif-medium"
            goto L38
        L28:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L30
            if (r5 >= r2) goto L30
            goto L20
        L30:
            if (r2 > r5) goto L20
            r1 = 11
            if (r5 >= r1) goto L20
            java.lang.String r5 = "sans-serif-black"
        L38:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L40
            goto L5f
        L40:
            android.graphics.Typeface r5 = e(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = defpackage.m10.w(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = defpackage.f00.h(r5, r1)
            if (r1 != 0) goto L5f
            android.graphics.Typeface r1 = e(r2, r6, r7)
            boolean r1 = defpackage.f00.h(r5, r1)
            if (r1 != 0) goto L5f
            r2 = r5
        L5f:
            if (r2 != 0) goto L65
            android.graphics.Typeface r2 = e(r0, r6, r7)
        L65:
            return r2
        L66:
            r5.getClass()
            java.lang.String r5 = "sans-serif"
            android.graphics.Typeface r5 = c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf0.f(wv, iu, int):android.graphics.Typeface");
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
