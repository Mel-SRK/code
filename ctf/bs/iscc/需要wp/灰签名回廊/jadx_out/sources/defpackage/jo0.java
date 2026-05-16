package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.View;
import androidx.compose.runtime.internal.a;
import com.example.gnd.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class jo0 {
    public static long a;
    public static Method b;

    public static final void a(j70 j70Var, te teVar, vf vfVar, int i) {
        vfVar.aw(-2105228848);
        if ((((vfVar.f(j70Var) ? 4 : 2) | i) & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else {
            f4 f4Var = f4.e;
            int iHashCode = Long.hashCode(vfVar.ar);
            a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, j70Var);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            h(vfVar, jf.e, f4Var);
            h(vfVar, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var);
            }
            h(vfVar, jf.c, j70VarAn);
            teVar.f(vfVar, 6);
            vfVar.q(true);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new y1(i, 8, j70Var, teVar);
        }
    }

    public static final ri0 b(em emVar, int i, jy0 jy0Var, zw0 zw0Var, boolean z, int i2) {
        ri0 ri0VarC = zw0Var != null ? zw0Var.c(jy0Var.b.d(i)) : ri0.e;
        float f = ri0VarC.a;
        int iAi = emVar.ai(iv0.a);
        return new ri0(z ? (i2 - f) - iAi : f, ri0VarC.b, z ? i2 - f : iAi + f, ri0VarC.d);
    }

    public static void c(StringBuilder sb, Object obj, cv cvVar) {
        if (cvVar != null) {
            sb.append((CharSequence) cvVar.g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final u30 e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u30 u30Var = tag instanceof u30 ? (u30) tag : null;
            if (u30Var != null) {
                return u30Var;
            }
            Object objH = go0.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final oj0 f(zw0 zw0Var, int i) {
        yw0 yw0Var = zw0Var.a;
        if (yw0Var.a.e.length() != 0) {
            int iE = zw0Var.e(i);
            if ((i != 0 && iE == zw0Var.e(i - 1)) || (i != yw0Var.a.e.length() && iE == zw0Var.e(i + 1))) {
                return zw0Var.a(i);
            }
        }
        return zw0Var.i(i);
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 29) {
            return fy0.a();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void h(vf vfVar, gv gvVar, Object obj) {
        if (vfVar.aq || !f00.h(vfVar.ak(), obj)) {
            vfVar.be(obj);
            vfVar.b(gvVar, obj);
        }
    }
}
