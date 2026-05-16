package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class in0 extends rl implements va0, xs, o10, so0, sg0, kg {
    public zt0 aa;
    public qd0 ab;
    public final a0 ac;
    public final zm0 ad;
    public final f1 ae;
    public final rn0 af;
    public final en0 ag;
    public final lh ah;
    public bw ai;
    public jo aj;
    public fn0 ak;
    public wc0 t;
    public f50 u;
    public boolean v;
    public g80 w;
    public o9 x;
    public qo y;
    public boolean z;

    public in0(g80 g80Var, wc0 wc0Var, qd0 qd0Var, jn0 jn0Var, boolean z, boolean z2) {
        f50 f50Var = f50.y;
        this.t = wc0Var;
        this.u = f50Var;
        this.v = z;
        this.w = g80Var;
        this.ab = qd0Var;
        a0 a0Var = new a0();
        a0Var.c = new b(14, a0Var);
        this.ac = a0Var;
        zm0 zm0Var = new zm0();
        zm0Var.r = z;
        bu(zm0Var);
        this.ad = zm0Var;
        f1 f1Var = new f1(new bu(3, new bu(a.c)));
        this.ae = f1Var;
        rn0 rn0Var = new rn0(jn0Var, this.ab, f1Var, wc0Var, z2, a0Var);
        this.af = rn0Var;
        en0 en0Var = new en0(rn0Var, z);
        this.ag = en0Var;
        lh lhVar = new lh(wc0Var, rn0Var, z2);
        bu(lhVar);
        this.ah = lhVar;
        bu(new y90(en0Var, a0Var));
        bu(new gt(new ft(1, m00.a, m00.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
        y8 y8Var = new y8();
        y8Var.r = lhVar;
        bu(y8Var);
        l1 l1Var = new l1(20, this);
        ot otVar = new ot();
        otVar.r = l1Var;
        bu(otVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O0(in0 in0Var, wn wnVar, ki kiVar) throws Throwable {
        mo moVar;
        if (kiVar instanceof mo) {
            moVar = (mo) kiVar;
            int i = moVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                moVar.k = i - Integer.MIN_VALUE;
            } else {
                moVar = new mo(in0Var, kiVar);
            }
        }
        Object obj = moVar.i;
        int i2 = moVar.k;
        if (i2 == 0) {
            i60.az(obj);
            qo qoVar = in0Var.y;
            if (qoVar != null) {
                g80 g80Var = in0Var.w;
                if (g80Var != null) {
                    ro roVar = new ro(qoVar);
                    moVar.g = in0Var;
                    moVar.h = wnVar;
                    moVar.k = 1;
                    Object objA = g80Var.a(roVar, moVar);
                    yj yjVar = yj.d;
                    if (objA == yjVar) {
                        return yjVar;
                    }
                }
            }
            in0Var.l1(wnVar.a);
            return wz0.a;
        }
        if (i2 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wnVar = moVar.h;
        in0Var = moVar.g;
        i60.az(obj);
        in0Var.y = null;
        in0Var.l1(wnVar.a);
        return wz0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bx(in0 in0Var, ki kiVar) throws Throwable {
        ko koVar;
        if (kiVar instanceof ko) {
            koVar = (ko) kiVar;
            int i = koVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                koVar.j = i - Integer.MIN_VALUE;
            } else {
                koVar = new ko(in0Var, kiVar);
            }
        }
        Object obj = koVar.h;
        int i2 = koVar.j;
        if (i2 == 0) {
            i60.az(obj);
            qo qoVar = in0Var.y;
            if (qoVar != null) {
                g80 g80Var = in0Var.w;
                if (g80Var != null) {
                    po poVar = new po(qoVar);
                    koVar.g = in0Var;
                    koVar.j = 1;
                    Object objA = g80Var.a(poVar, koVar);
                    yj yjVar = yj.d;
                    if (objA == yjVar) {
                        return yjVar;
                    }
                }
            }
            in0Var.l1(0L);
            return wz0.a;
        }
        if (i2 != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        in0Var = koVar.g;
        i60.az(obj);
        in0Var.y = null;
        in0Var.l1(0L);
        return wz0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bz(in0 in0Var, vn vnVar, ki kiVar) {
        lo loVar;
        g80 g80Var;
        qo qoVar;
        in0 in0Var2;
        qo qoVar2;
        if (kiVar instanceof lo) {
            loVar = (lo) kiVar;
            int i = loVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                loVar.l = i - Integer.MIN_VALUE;
            } else {
                loVar = new lo(in0Var, kiVar);
            }
        }
        Object obj = loVar.j;
        int i2 = loVar.l;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(obj);
            qo qoVar3 = in0Var.y;
            if (qoVar3 != null && (g80Var = in0Var.w) != null) {
                po poVar = new po(qoVar3);
                loVar.g = in0Var;
                loVar.h = vnVar;
                loVar.l = 1;
                if (g80Var.a(poVar, loVar) != yjVar) {
                }
                return yjVar;
            }
            in0Var.y = qoVar;
            long j = vnVar.a;
            return wz0.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qoVar2 = loVar.i;
            vnVar = loVar.h;
            in0Var2 = loVar.g;
            i60.az(obj);
            qoVar = qoVar2;
            in0Var = in0Var2;
            in0Var.y = qoVar;
            long j2 = vnVar.a;
            return wz0.a;
        }
        vnVar = loVar.h;
        in0Var = loVar.g;
        i60.az(obj);
        qoVar = new qo();
        g80 g80Var2 = in0Var.w;
        if (g80Var2 != null) {
            loVar.g = in0Var;
            loVar.h = vnVar;
            loVar.i = qoVar;
            loVar.l = 2;
            if (g80Var2.a(qoVar, loVar) != yjVar) {
                in0Var2 = in0Var;
                qoVar2 = qoVar;
                qoVar = qoVar2;
                in0Var = in0Var2;
            }
            return yjVar;
        }
        in0Var.y = qoVar;
        long j22 = vnVar.a;
        return wz0.a;
    }

    public final void O1() {
        qo qoVar = this.y;
        if (qoVar != null) {
            g80 g80Var = this.w;
            if (g80Var != null) {
                g80Var.b(new po(qoVar));
            }
            this.y = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        ji jiVar;
        long j2;
        ?? r0 = ig0Var.a;
        int size = r0.size();
        int i = 0;
        while (true) {
            jiVar = null;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.u.g((pg0) r0.get(i))).booleanValue()) {
                if (this.v && this.aa == null) {
                    c cVar = new c(this, jiVar, 13);
                    ig0 ig0Var2 = vt0.a;
                    zt0 zt0Var = new zt0(null, null, wt0.a);
                    zt0Var.t = cVar;
                    bu(zt0Var);
                    this.aa = zt0Var;
                }
                zt0 zt0Var2 = this.aa;
                if (zt0Var2 != null) {
                    zt0Var2.ad(ig0Var, jg0Var, j);
                }
            } else {
                i++;
            }
        }
        if (jg0Var == jg0.e && ig0Var.c == 6) {
            ?? r11 = ig0Var.a;
            int size2 = r11.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((pg0) r11.get(i2)).b()) {
                    return;
                }
            }
            this.ai.getClass();
            em emVar = pk.ay(this).z;
            xa0 xa0Var = new xa0(0L);
            int size3 = r11.size();
            int i3 = 0;
            while (true) {
                j2 = xa0Var.a;
                if (i3 >= size3) {
                    break;
                }
                xa0Var = new xa0(xa0.g(j2, ((pg0) r11.get(i3)).j));
                i3++;
            }
            i60.an(bi(), null, new fn0(this, xa0.h(j2, -emVar.x(64)), jiVar, 2), 3);
            int size4 = r11.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((pg0) r11.get(i4)).a();
            }
        }
    }

    @Override // defpackage.va0
    public final void af() {
        az0.z(this, new io(this, 2));
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        if (this.v && (this.aj == null || this.ak == null)) {
            this.aj = new jo(this, 1);
            this.ak = new fn0(this, null);
        }
        jo joVar = this.aj;
        if (joVar != null) {
            i10[] i10VarArr = bp0.a;
            po0Var.d(oo0.d, new ah(null, joVar));
        }
        fn0 fn0Var = this.ak;
        if (fn0Var != null) {
            i10[] i10VarArr2 = bp0.a;
            po0Var.d(oo0.e, fn0Var);
        }
    }

    @Override // defpackage.xs
    public final void ak(vs vsVar) {
        vsVar.b(false);
    }

    @Override // defpackage.o10
    public final boolean al(KeyEvent keyEvent) {
        long jH;
        if (!this.v || ((!k10.a(m10.aa(keyEvent), k10.n) && !k10.a(e00.g(keyEvent.getKeyCode()), k10.m)) || m10.ad(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.af.d == wc0.d;
        lh lhVar = this.ah;
        if (z) {
            int i = (int) (lhVar.y & 4294967295L);
            jH = d41.h(0.0f, k10.a(e00.g(keyEvent.getKeyCode()), k10.m) ? i : -i);
        } else {
            int i2 = (int) (lhVar.y >> 32);
            jH = d41.h(k10.a(e00.g(keyEvent.getKeyCode()), k10.m) ? i2 : -i2, 0.0f);
        }
        i60.an(bi(), null, new fn0(this, jH, null, 1), 3);
        return true;
    }

    @Override // defpackage.sg0
    public final void aw() {
        zt0 zt0Var = this.aa;
        if (zt0Var != null) {
            zt0Var.aw();
        }
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.i70
    public final void bm() {
        az0.z(this, new io(this, 2));
        this.ai = bw.r;
    }

    @Override // defpackage.i70
    public final void bn() {
        this.z = false;
        O1();
    }

    @Override // defpackage.o10
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [pu, x10] */
    public final void l1(long j) {
        xj xjVar = (xj) ((x10) this.ac.c).a();
        if (xjVar == null) {
            wc.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        } else {
            i60.an(xjVar, null, new fn0(this, j, null, 0), 3);
        }
    }
}
