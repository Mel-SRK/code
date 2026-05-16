package androidx.compose.ui.layout;

import defpackage.e80;
import defpackage.g50;
import defpackage.j31;
import defpackage.j70;
import defpackage.jz;
import defpackage.k31;
import defpackage.l31;
import defpackage.qo0;
import defpackage.zy;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final e80 a;
    public static final k31[] b;
    public static final e80 c;

    static {
        e80 e80Var = new e80(8);
        k31.a.getClass();
        l31 l31Var = j31.g;
        e80Var.g(1, l31Var);
        l31 l31Var2 = j31.f;
        e80Var.g(2, l31Var2);
        l31 l31Var3 = j31.b;
        e80Var.g(4, l31Var3);
        l31 l31Var4 = j31.d;
        e80Var.g(8, l31Var4);
        l31 l31Var5 = j31.h;
        e80Var.g(16, l31Var5);
        l31 l31Var6 = j31.e;
        e80Var.g(32, l31Var6);
        l31 l31Var7 = j31.i;
        e80Var.g(64, l31Var7);
        a = e80Var;
        b = new k31[]{l31Var, l31Var2, l31Var3, l31Var7, l31Var5, l31Var6, l31Var4, j31.j, j31.c};
        e80 e80Var2 = new e80(7);
        e80Var2.g(1, l31Var);
        e80Var2.g(2, l31Var2);
        e80Var2.g(4, l31Var3);
        e80Var2.g(16, l31Var5);
        e80Var2.g(64, l31Var7);
        e80Var2.g(32, l31Var6);
        e80Var2.g(8, l31Var4);
        c = e80Var2;
    }

    public static final void a(g50 g50Var, zy zyVar, long j, int i, int i2) {
        if (qo0.e(j, -1L)) {
            return;
        }
        g50Var.a(zyVar.b(), (int) ((j >>> 48) & 65535));
        g50Var.a(zyVar.d(), (int) ((j >>> 32) & 65535));
        g50Var.a(zyVar.c(), i - ((int) ((j >>> 16) & 65535)));
        g50Var.a(zyVar.a(), i2 - ((int) (j & 65535)));
    }

    public static final j70 b(jz jzVar) {
        return new RulerProviderModifierElement(jzVar);
    }
}
