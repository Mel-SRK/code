package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.layout.b;
import com.example.gnd.MainActivity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(int i, Object obj, Object obj2) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0519, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    @Override // defpackage.cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        oi0 oi0Var;
        boolean z;
        boolean z2;
        h30 h30Var;
        boolean z3;
        gc gcVar;
        boolean z4;
        switch (this.e) {
            case 0:
                Context context = (Context) this.f;
                Context applicationContext = context.getApplicationContext();
                b2 b2Var = (b2) this.g;
                applicationContext.registerComponentCallbacks(b2Var);
                return new z1(0, context, b2Var);
            case 1:
                Context context2 = (Context) this.f;
                Context applicationContext2 = context2.getApplicationContext();
                c2 c2Var = (c2) this.g;
                applicationContext2.registerComponentCallbacks(c2Var);
                return new z1(1, context2, c2Var);
            case 2:
                return new dz((i30) this.f, new b(1, (w3) this.g));
            case 3:
                dz dzVar = (dz) this.f;
                synchronized (dzVar.c) {
                    try {
                        dzVar.e = true;
                        a90 a90Var = dzVar.d;
                        Object[] objArr = a90Var.d;
                        int i = a90Var.f;
                        for (int i2 = 0; i2 < i; i2++) {
                            pa0 pa0Var = (pa0) ((y11) objArr[i2]).get();
                            if (pa0Var != null && (oi0Var = pa0Var.b) != null) {
                                oi0Var.closeConnection();
                                pa0Var.b = null;
                            }
                        }
                        dzVar.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                qw0 qw0Var = ((w3) this.g).e;
                qw0Var.b.set(null);
                qw0Var.a.g();
                return wz0.a;
            case 4:
                zg0 zg0Var = (zg0) this.f;
                zg0Var.setPositionProvider((bh0) this.g);
                zg0Var.l();
                return new z3(0);
            case 5:
                z4 z4Var = (z4) this.f;
                a5 a5Var = (a5) this.g;
                synchronized (z4Var.h) {
                    z4Var.j.remove(a5Var);
                }
                return wz0.a;
            case 6:
                ((Choreographer) ((b5) this.f).e).removeFrameCallback((a5) this.g);
                return wz0.a;
            case 7:
                kf0.n((kf0) obj, (lf0) this.f, ((d8) this.g).r);
                return wz0.a;
            case MainActivity.$stable /* 8 */:
                u20 u20Var = (u20) obj;
                u20Var.a();
                xo.ar(u20Var, ((yc0) this.f).a, (i9) this.g, null, 60);
                return wz0.a;
            case 9:
                u20 u20Var2 = (u20) obj;
                u20Var2.a();
                xo.ar(u20Var2, (t3) this.f, (i9) this.g, null, 60);
                return wz0.a;
            case 10:
                ((a90) ((bu) this.f).e).i((kh) this.g);
                return wz0.a;
            case 11:
                KeyEvent keyEvent = ((l10) obj).a;
                if (((h30) this.f).a() == xw.e && keyEvent.getKeyCode() == 4) {
                    z = true;
                    if (m10.ad(keyEvent) == 1) {
                        ((cw0) this.g).e(null);
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                r01 r01Var = (r01) this.f;
                q01 q01Var = r01Var.b;
                q01 q01Var2 = r01Var.a;
                wo0.c(r01Var, (pg0) obj);
                in0 in0Var = (in0) this.g;
                float fA = ((i11) i60.ab(in0Var, og.s)).a();
                long jA = q6.a(fA, fA);
                if (o01.b(jA) <= 0.0f || o01.c(jA) <= 0.0f) {
                    sy.b("maximumVelocity should be a positive value. You specified=" + ((Object) o01.f(jA)));
                }
                long jA2 = q6.a(q01Var2.b(o01.b(jA)), q01Var.b(o01.c(jA)));
                mk[] mkVarArr = q01Var2.c;
                Arrays.fill(mkVarArr, 0, mkVarArr.length, (Object) null);
                q01Var2.d = 0;
                mk[] mkVarArr2 = q01Var.c;
                Arrays.fill(mkVarArr2, 0, mkVarArr2.length, (Object) null);
                q01Var.d = 0;
                r01Var.c = 0L;
                o9 o9Var = in0Var.x;
                if (o9Var != null) {
                    o9Var.u(new wn(q6.a(Float.isNaN(o01.b(jA2)) ? 0.0f : o01.b(jA2), Float.isNaN(o01.c(jA2)) ? 0.0f : o01.c(jA2))));
                }
                return wz0.a;
            case 13:
                View view = (View) obj;
                View view2 = (View) this.f;
                x0 x0Var = new x0(view.getNextFocusForwardId(), 1);
                View view3 = null;
                View view4 = null;
                while (true) {
                    View viewU = m10.u(view, x0Var, view4);
                    if (viewU != null || view == view2) {
                        break;
                    } else {
                        Object parent = view.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view;
                            view = view5;
                        }
                    }
                }
                return Boolean.valueOf(view3 == ((View) this.g));
            case 14:
                ((g80) this.f).b((yz) this.g);
                return wz0.a;
            case 15:
                u20 u20Var3 = (u20) obj;
                long j = ((pq0) ((mv0) this.f).get()).a;
                float fD = pq0.d(j);
                if (fD > 0.0f) {
                    float fX = u20Var3.x(ld0.a);
                    ra raVar = u20Var3.d;
                    float fX2 = u20Var3.x(((wd0) this.g).a(u20Var3.getLayoutDirection())) - fX;
                    float f = 2;
                    float fD2 = (fX * f) + fD + fX2;
                    e20 layoutDirection = u20Var3.getLayoutDirection();
                    int[] iArr = kd0.a;
                    float fD3 = iArr[layoutDirection.ordinal()] == 1 ? pq0.d(raVar.c()) - fD2 : fX2 < 0.0f ? 0.0f : fX2;
                    if (iArr[u20Var3.getLayoutDirection().ordinal()] == 1) {
                        fD2 = pq0.d(raVar.c()) - (fX2 >= 0.0f ? fX2 : 0.0f);
                    }
                    float f2 = fD2;
                    float fB = pq0.b(j);
                    float f3 = (-fB) / f;
                    float f4 = fB / f;
                    o6 o6Var = raVar.e;
                    long jR = o6Var.r();
                    o6Var.o().l();
                    try {
                        ((o6) ((bu) o6Var.a).e).o().e(fD3, f3, f2, f4, 0);
                        u20Var3.a();
                    } finally {
                        o6Var.o().i();
                        o6Var.ab(jR);
                    }
                } else {
                    u20Var3.a();
                }
                return wz0.a;
            case 16:
                g50 g50Var = (g50) obj;
                gl0 gl0Var = (gl0) this.f;
                if (gl0Var.r.j.g() > 0) {
                    g50Var.d = true;
                    j50 j50Var = g50Var.g;
                    d20 d20VarBo = j50Var.bo();
                    if (pz.a(g50Var.e, 9223372034707292159L)) {
                        g50Var.e = t1.au(d20VarBo.d(0L));
                        g50Var.f = d20VarBo.al();
                    }
                    j50Var.bq().ah.b();
                    long jAl = d20VarBo.al();
                    q80 q80Var = ((jz) this.g).i;
                    int i3 = (int) (jAl >> 32);
                    int i4 = (int) (jAl & 4294967295L);
                    for (k31 k31Var : b.b) {
                        Object objG = q80Var.g(k31Var);
                        objG.getClass();
                        u31 u31Var = (u31) objG;
                        l31 l31Var = (l31) k31Var;
                        b.a(g50Var, l31Var.c, u31Var.h, i3, i4);
                        if (((Boolean) u31Var.b.getValue()).booleanValue()) {
                            b.a(g50Var, u31Var.f, u31Var.j, i3, i4);
                            b.a(g50Var, u31Var.g, u31Var.k, i3, i4);
                        }
                        b.a(g50Var, l31Var.d, u31Var.i, i3, i4);
                    }
                    if (gl0Var.r.k.h()) {
                        m80 m80Var = gl0Var.r.k;
                        Object[] objArr2 = m80Var.a;
                        int i5 = m80Var.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            w80 w80Var = (w80) objArr2[i6];
                            zy zyVar = (zy) gl0Var.r.l.get(i6);
                            Rect rect = (Rect) w80Var.getValue();
                            g50Var.a(zyVar.b(), rect.left);
                            g50Var.a(zyVar.d(), rect.top);
                            g50Var.a(zyVar.c(), rect.right);
                            g50Var.a(zyVar.a(), rect.bottom);
                        }
                    }
                }
                return wz0.a;
            case 17:
                pn0 pn0Var = (pn0) this.f;
                rn0 rn0Var = (rn0) this.g;
                long j2 = ((un) obj).a;
                long jA3 = rn0Var.d == wc0.e ? xa0.a(j2, 0.0f, 1) : xa0.a(j2, 0.0f, 2);
                rn0 rn0Var2 = pn0Var.a;
                rn0Var2.g = 1;
                qd0 qd0Var = rn0Var2.b;
                if (qd0Var == null || !(rn0Var2.a.c() || rn0Var2.a.a())) {
                    rn0.a(rn0Var2, rn0Var2.h, jA3, 1);
                } else {
                    qd0Var.e(jA3, rn0Var2.g, rn0Var2.j);
                }
                return wz0.a;
            case 18:
                pg0 pg0Var = (pg0) obj;
                bu buVar = (bu) this.f;
                long j3 = pg0Var.c;
                wc wcVar = (wc) this.g;
                cw0 cw0Var = (cw0) buVar.e;
                if (!cw0Var.h() || cw0Var.j().a.e.length() == 0 || (h30Var = cw0Var.d) == null || h30Var.d() == null) {
                    z2 = false;
                } else {
                    buVar.r(cw0Var.j(), j3, false, wcVar);
                    z2 = true;
                }
                if (z2) {
                    pg0Var.a();
                }
                return wz0.a;
            case 19:
                kf0.n((kf0) obj, (lf0) this.f, ((mq0) this.g).ac);
                return wz0.a;
            case 20:
                KeyEvent keyEvent2 = ((l10) obj).a;
                ss ssVar = (ss) this.f;
                InputDevice device = keyEvent2.getDevice();
                boolean zF = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && m10.ad(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (go0.b(keyEvent2, 19)) {
                        zF = ((us) ssVar).f(5);
                    } else if (go0.b(keyEvent2, 20)) {
                        zF = ((us) ssVar).f(6);
                    } else if (go0.b(keyEvent2, 21)) {
                        zF = ((us) ssVar).f(3);
                    } else if (go0.b(keyEvent2, 22)) {
                        zF = ((us) ssVar).f(4);
                    } else if (go0.b(keyEvent2, 23)) {
                        sr0 sr0Var = ((h30) this.g).c;
                        if (sr0Var != null) {
                            ((sl) sr0Var).b();
                        }
                        zF = true;
                    }
                }
                return Boolean.valueOf(zF);
            case 21:
                m10.s((xo) obj, (bd0) this.f, ((jv0) this.g).a());
                return wz0.a;
            case 22:
                y9 y9Var = (y9) obj;
                return y9Var.a(new l1(6, new a2(21, ((aq0) this.f).a(y9Var.d.c(), y9Var.d.getLayoutDirection(), y9Var), (jv0) this.g)));
            case 23:
                return new z1(2, (w80) this.f, (g80) this.g);
            case 24:
                uh uhVar = (uh) obj;
                cw0 cw0Var2 = (cw0) this.f;
                me0 me0Var = cw0Var2.j;
                boolean zB = hx0.b(cw0Var2.j().b);
                zh zhVar = (zh) this.g;
                uh.b(uhVar, new hi(1), !zB && ((Boolean) me0Var.getValue()).booleanValue(), new fw0(zhVar, cw0Var2, 0));
                uh.b(uhVar, new hi(2), !zB, new fw0(zhVar, cw0Var2, 1));
                if (!((Boolean) me0Var.getValue()).booleanValue() || (gcVar = cw0Var2.f) == null) {
                    z3 = false;
                } else {
                    ClipDescription primaryClipDescription = ((h0) gcVar).a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z3 = true;
                    }
                }
                uh.b(uhVar, new hi(3), z3, new fw0(zhVar, cw0Var2, 2));
                uh.b(uhVar, new hi(4), hx0.c(cw0Var2.j().b) != cw0Var2.j().a.e.length(), new fw0(zhVar, cw0Var2, 3));
                return wz0.a;
            case 25:
                i60.an((xj) this.f, null, new rs0((ny0) this.g, null), 1);
                return new z3(2);
            case 26:
                ny0 ny0Var = (ny0) this.f;
                my0 my0Var = (my0) this.g;
                ny0Var.g.add(my0Var);
                return new z1(3, ny0Var, my0Var);
            case 27:
                ((Number) obj).longValue();
                f01 f01Var = (f01) this.f;
                float f5 = f01Var.e;
                f01Var.e = 0.0f;
                ((cv) this.g).g(Float.valueOf(f5));
                return wz0.a;
            default:
                p0 p0Var = (p0) obj;
                gv gvVar = (gv) this.g;
                a41 a41Var = (a41) this.f;
                if (!a41Var.f) {
                    p30 lifecycle = p0Var.a.getLifecycle();
                    a41Var.h = gvVar;
                    if (a41Var.g == null) {
                        a41Var.g = lifecycle;
                        lifecycle.a(a41Var);
                    } else if (((w30) lifecycle).c.compareTo(o30.f) >= 0) {
                        jg jgVar = a41Var.e;
                        te teVar = new te(1330788943, true, new z31(a41Var, gvVar, 1));
                        synchronized (jgVar.g) {
                            z4 = jgVar.x == 1;
                            if (z4) {
                                jgVar.x = 0;
                            }
                            break;
                        }
                        int i7 = jgVar.x;
                        if (i7 != 0) {
                            dh0.b(i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
                        }
                        if (z4) {
                            vf vfVar = jgVar.w;
                            vfVar.y = 100;
                            vfVar.x = true;
                            jgVar.d.a(jgVar, teVar);
                            if (vfVar.ae || vfVar.y != 100) {
                                dh0.a("Cannot disable reuse from root if it was caused by other groups");
                            }
                            vfVar.y = -1;
                            vfVar.x = false;
                        } else {
                            jgVar.d.a(jgVar, teVar);
                        }
                    }
                }
                return wz0.a;
        }
    }
}
