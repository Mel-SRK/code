package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends wo0 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // defpackage.wo0
    public final Typeface f(Context context, ku[] kuVarArr) {
        Object objNewInstance;
        Typeface typeface;
        boolean zBooleanValue;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            lq0 lq0Var = new lq0(0);
            int length = kuVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ku kuVar = kuVarArr[i];
                    Uri uri = kuVar.a;
                    Object objI = (ByteBuffer) lq0Var.get(uri);
                    if (objI == null) {
                        objI = wn0.i(context, uri);
                        lq0Var.put(uri, objI);
                    }
                    if (objI == null) {
                        break;
                    }
                    try {
                        zBooleanValue = ((Boolean) c.invoke(objNewInstance, objI, Integer.valueOf(kuVar.b), null, Integer.valueOf(kuVar.c), Boolean.valueOf(kuVar.d))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        zBooleanValue = false;
                    }
                    if (!zBooleanValue) {
                        break;
                    }
                    i++;
                } else {
                    try {
                        Object objNewInstance2 = Array.newInstance((Class<?>) a, 1);
                        Array.set(objNewInstance2, 0, objNewInstance);
                        typeface = (Typeface) d.invoke(null, objNewInstance2);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
