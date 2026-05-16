package defpackage;

import android.graphics.Paint;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(kk kkVar, ab0 ab0Var, lw0 lw0Var, h30 h30Var, vr0 vr0Var) {
        super(1);
        this.e = 2;
        this.g = kkVar;
        this.h = ab0Var;
        this.f = lw0Var;
        this.i = h30Var;
        this.j = vr0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        int i = this.e;
        wz0 wz0Var = wz0.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                i30 i30Var = (i30) obj;
                c30 c30Var = ((k3) obj6).a;
                i30Var.h = (lw0) obj4;
                i30Var.i = (ey) obj5;
                i30Var.c = (g5) obj3;
                i30Var.d = (cv) obj2;
                i30Var.e = c30Var != null ? c30Var.s : null;
                i30Var.f = c30Var != null ? c30Var.t : null;
                i30Var.g = c30Var != null ? (i11) i60.ab(c30Var, og.s) : null;
                return wz0Var;
            case 1:
                zg0 zg0Var = (zg0) obj4;
                zg0Var.q.addView(zg0Var, zg0Var.r);
                zg0Var.i((pu) obj6, (ch0) obj5, (String) obj3, (e20) obj2);
                return new w1(1, zg0Var);
            default:
                u20 u20Var = (u20) obj;
                u20Var.a();
                ra raVar = u20Var.d;
                float fG = ((kk) obj6).b.g();
                if (fG != 0.0f) {
                    long j = ((lw0) obj4).b;
                    int i2 = hx0.c;
                    int iD = ((ab0) obj5).d((int) (j >> 32));
                    ax0 ax0VarD = ((h30) obj3).d();
                    ri0 ri0VarC = ax0VarD != null ? ax0VarD.a.c(iD) : new ri0(0.0f, 0.0f, 0.0f, 0.0f);
                    float fX = u20Var.x(iv0.a);
                    float f = fX / 2;
                    float f2 = ri0VarC.a + f;
                    float fD = pq0.d(raVar.c()) - f;
                    if (f2 > fD) {
                        f2 = fD;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    long jH = d41.h(f, ri0VarC.b);
                    long jH2 = d41.h(f, ri0VarC.d);
                    vr0 vr0Var = (vr0) obj2;
                    oa oaVar = raVar.d.c;
                    l3 l3VarC = raVar.g;
                    if (l3VarC == null) {
                        l3VarC = t1.c();
                        l3VarC.i(1);
                        raVar.g = l3VarC;
                    }
                    Paint paint = l3VarC.a;
                    vr0Var.a(fG, raVar.c(), l3VarC);
                    if (!f00.h(l3VarC.d, null)) {
                        l3VarC.f(null);
                    }
                    if (l3VarC.b != 3) {
                        l3VarC.d(3);
                    }
                    if (paint.getStrokeWidth() != fX) {
                        paint.setStrokeWidth(fX);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (l3VarC.a() != 0) {
                        l3VarC.g();
                    }
                    if (l3VarC.b() != 0) {
                        l3VarC.h();
                    }
                    if (!paint.isFilterBitmap()) {
                        paint.setFilterBitmap(true);
                    }
                    oaVar.m(jH, jH2, l3VarC);
                }
                return wz0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = serializable;
        this.j = obj4;
    }
}
