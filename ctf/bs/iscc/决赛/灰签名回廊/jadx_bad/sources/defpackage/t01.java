package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class t01 {
    public final f7 a;
    public final f7 b;
    public final f7 c;

    public t01(f7 f7Var, f7 f7Var2, f7 f7Var3) {
        this.a = f7Var;
        this.b = f7Var2;
        this.c = f7Var3;
    }

    public abstract u01 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        f7 f7Var = this.c;
        Class cls2 = (Class) f7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        f7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        f7 f7Var = this.a;
        Method method = (Method) f7Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, t01.class.getClassLoader()).getDeclaredMethod("read", t01.class);
        f7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        f7 f7Var = this.b;
        Method method = (Method) f7Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, t01.class);
        f7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((u01) this).e.readParcelable(u01.class.getClassLoader());
    }

    public final v01 g() {
        String string = ((u01) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (v01) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(v01 v01Var) {
        if (v01Var == null) {
            ((u01) this).e.writeString(null);
            return;
        }
        try {
            ((u01) this).e.writeString(b(v01Var.getClass()).getName());
            u01 u01VarA = a();
            try {
                d(v01Var.getClass()).invoke(null, v01Var, u01VarA);
                Parcel parcel = u01VarA.e;
                int i = u01VarA.i;
                if (i >= 0) {
                    int i2 = u01VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(v01Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
