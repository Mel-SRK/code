package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class s7 implements ji, zj, Serializable {
    public final ji d;

    public s7(ji jiVar) {
        this.d = jiVar;
    }

    public zj d() {
        ji jiVar = this.d;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        ji jiVar = this;
        while (true) {
            s7 s7Var = (s7) jiVar;
            ji jiVar2 = s7Var.d;
            jiVar2.getClass();
            try {
                obj = s7Var.o(obj);
                if (obj == yj.d) {
                    return;
                }
            } catch (Throwable th) {
                obj = new sj0(th);
            }
            s7Var.p();
            if (!(jiVar2 instanceof s7)) {
                jiVar2.h(obj);
                return;
            }
            jiVar = jiVar2;
        }
    }

    public ji k(ji jiVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement m() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        ok okVar = (ok) getClass().getAnnotation(ok.class);
        String str = null;
        if (okVar == null) {
            return null;
        }
        int iV = okVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? okVar.l()[iIntValue] : -1;
        o6 o6Var = e00.m;
        o6 o6Var2 = e00.n;
        if (o6Var2 == null) {
            try {
                o6 o6Var3 = new o6(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                e00.n = o6Var3;
                o6Var2 = o6Var3;
            } catch (Exception unused2) {
                e00.n = o6Var;
                o6Var2 = o6Var;
            }
        }
        if (o6Var2 != o6Var && (method = (Method) o6Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) o6Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) o6Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = okVar.c();
        } else {
            strC = str + '/' + okVar.c();
        }
        return new StackTraceElement(strC, okVar.m(), okVar.f(), i);
    }

    public abstract Object o(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objM = m();
        if (objM == null) {
            objM = getClass().getName();
        }
        sb.append(objM);
        return sb.toString();
    }

    public void p() {
    }
}
