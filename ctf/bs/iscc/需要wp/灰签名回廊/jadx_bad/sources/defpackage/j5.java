package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public final zy0 a;
    public final Object b;
    public final r5 c;
    public final me0 d;
    public final me0 e;
    public final g90 f;
    public final w5 g;
    public final w5 h;
    public final w5 i;
    public final w5 j;

    public j5(Object obj, zy0 zy0Var, Object obj2) {
        this.a = zy0Var;
        this.b = obj2;
        r5 r5Var = new r5(zy0Var, obj, null, 60);
        this.c = r5Var;
        this.d = bo0.m(Boolean.FALSE);
        this.e = bo0.m(obj);
        this.f = new g90();
        new es0(obj2);
        w5 w5Var = r5Var.f;
        boolean z = w5Var instanceof s5;
        w5 w5Var2 = z ? e00.e : w5Var instanceof t5 ? e00.f : w5Var instanceof u5 ? e00.g : e00.h;
        this.g = w5Var2;
        w5 w5Var3 = z ? e00.a : w5Var instanceof t5 ? e00.b : w5Var instanceof u5 ? e00.c : e00.d;
        this.h = w5Var3;
        this.i = w5Var2;
        this.j = w5Var3;
    }

    public static final Object a(j5 j5Var, Object obj) {
        zy0 zy0Var = j5Var.a;
        w5 w5Var = j5Var.j;
        w5 w5Var2 = j5Var.i;
        if (!f00.h(w5Var2, j5Var.g) || !f00.h(w5Var, j5Var.h)) {
            w5 w5Var3 = (w5) zy0Var.a.g(obj);
            int iB = w5Var3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (w5Var3.a(i) < w5Var2.a(i) || w5Var3.a(i) > w5Var.a(i)) {
                    w5Var3.e(i60.s(w5Var3.a(i), w5Var2.a(i), w5Var.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return zy0Var.b.g(w5Var3);
            }
        }
        return obj;
    }

    public static Object b(j5 j5Var, Object obj, q5 q5Var, tt0 tt0Var) {
        Object objG = j5Var.a.b.g(j5Var.c.f);
        Object objC = j5Var.c();
        zy0 zy0Var = j5Var.a;
        tu0 tu0Var = new tu0(q5Var, zy0Var, objC, obj, (w5) zy0Var.a.g(objG));
        long j = j5Var.c.g;
        g90 g90Var = j5Var.f;
        h5 h5Var = new h5(j5Var, objG, tu0Var, j, null);
        g90Var.getClass();
        return i60.y(new k5(g90Var, h5Var, null), tt0Var);
    }

    public final Object c() {
        return this.c.e.getValue();
    }

    public final Object d(ji jiVar, Object obj) {
        i5 i5Var = new i5(this, obj, null);
        g90 g90Var = this.f;
        g90Var.getClass();
        Object objY = i60.y(new k5(g90Var, i5Var, null), jiVar);
        return objY == yj.d ? objY : wz0.a;
    }

    public /* synthetic */ j5(Object obj, zy0 zy0Var, Object obj2, int i) {
        this(obj, zy0Var, (i & 4) != 0 ? null : obj2);
    }
}
