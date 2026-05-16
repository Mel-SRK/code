package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yi0 {
    public static final zi0 a;

    static {
        zi0 zi0Var = null;
        try {
            zi0Var = (zi0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zi0Var == null) {
            zi0Var = new zi0();
        }
        a = zi0Var;
    }

    public static sb a(Class cls) {
        a.getClass();
        return new sb(cls);
    }
}
