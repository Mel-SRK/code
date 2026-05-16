package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sb implements rb {
    public static final Map b;
    public final Class a;

    static {
        Map mapSingletonMap;
        List listZ = f00.z(pu.class, cv.class, gv.class, hv.class, iv.class, jv.class, kv.class, lv.class, mv.class, nv.class, qu.class, ru.class, su.class, tu.class, uu.class, vu.class, wu.class, xu.class, yu.class, zu.class, dv.class, ev.class, fv.class);
        ArrayList arrayList = new ArrayList(lc.an(listZ));
        int i = 0;
        int i2 = 0;
        for (Object obj : listZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f00.af();
                throw null;
            }
            arrayList.add(new ae0((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = sq.d;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(f00.aa(arrayList.size()));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ae0 ae0Var = (ae0) obj2;
                mapSingletonMap.put(ae0Var.d, ae0Var.e);
            }
        } else {
            ae0 ae0Var2 = (ae0) arrayList.get(0);
            ae0Var2.getClass();
            mapSingletonMap = Collections.singletonMap(ae0Var2.d, ae0Var2.e);
            mapSingletonMap.getClass();
        }
        b = mapSingletonMap;
    }

    public sb(Class cls) {
        this.a = cls;
    }

    public final String a() {
        String strAp;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strAp2 = d41.ap(cls.getName());
                return strAp2 == null ? cls.getSimpleName() : strAp2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strAp = d41.ap(componentType.getName())) != null) {
                strConcat = strAp.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ft0.t(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM = ft0.m(simpleName, '$', 0, 6);
            return iM == -1 ? simpleName : simpleName.substring(iM + 1, simpleName.length());
        }
        return ft0.t(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sb) && d41.y(this).equals(d41.y((sb) obj));
    }

    public final int hashCode() {
        return d41.y(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
