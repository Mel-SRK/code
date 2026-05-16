package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vb {
    public static final vb c = new vb();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, ub ubVar, n30 n30Var, Class cls) {
        n30 n30Var2 = (n30) map.get(ubVar);
        if (n30Var2 == null || n30Var == n30Var2) {
            if (n30Var2 == null) {
                map.put(ubVar, n30Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ubVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + n30Var2 + ", new value " + n30Var);
    }

    public final tb a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            tb tbVarA = (tb) map2.get(superclass);
            if (tbVarA == null) {
                tbVarA = a(superclass, null);
            }
            map.putAll(tbVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            tb tbVarA2 = (tb) map2.get(cls2);
            if (tbVarA2 == null) {
                tbVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : tbVarA2.b.entrySet()) {
                b(map, (ub) entry.getKey(), (n30) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            lb0 lb0Var = (lb0) method.getAnnotation(lb0.class);
            if (lb0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!u30.class.isAssignableFrom(parameterTypes[0])) {
                        wc.n("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                n30 n30VarValue = lb0Var.value();
                if (parameterTypes.length > 1) {
                    if (!n30.class.isAssignableFrom(parameterTypes[1])) {
                        wc.n("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (n30VarValue != n30.ON_ANY) {
                        wc.n("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    wc.n("cannot have more than 2 params");
                    return null;
                }
                b(map, new ub(i, method), n30VarValue, cls);
                z = true;
            }
        }
        tb tbVar = new tb(map);
        map2.put(cls, tbVar);
        this.b.put(cls, Boolean.valueOf(z));
        return tbVar;
    }
}
