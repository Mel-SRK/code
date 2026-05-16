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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(defpackage.in0 r4, defpackage.wn r5, defpackage.ki r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.mo
            if (r0 == 0) goto L13
            r0 = r6
            mo r0 = (defpackage.mo) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            mo r0 = new mo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            wn r5 = r0.h
            in0 r4 = r0.g
            defpackage.i60.az(r6)
            goto L4f
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r4)
            r4 = 0
            return r4
        L30:
            defpackage.i60.az(r6)
            qo r6 = r4.y
            if (r6 == 0) goto L52
            g80 r1 = r4.w
            if (r1 == 0) goto L4f
            ro r3 = new ro
            r3.<init>(r6)
            r0.g = r4
            r0.h = r5
            r0.k = r2
            java.lang.Object r6 = r1.a(r3, r0)
            yj r0 = defpackage.yj.d
            if (r6 != r0) goto L4f
            return r0
        L4f:
            r6 = 0
            r4.y = r6
        L52:
            long r5 = r5.a
            r4.l1(r5)
            wz0 r4 = defpackage.wz0.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in0.O0(in0, wn, ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bx(defpackage.in0 r4, defpackage.ki r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.ko
            if (r0 == 0) goto L13
            r0 = r5
            ko r0 = (defpackage.ko) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ko r0 = new ko
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            in0 r4 = r0.g
            defpackage.i60.az(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.i60.az(r5)
            qo r5 = r4.y
            if (r5 == 0) goto L4e
            g80 r1 = r4.w
            if (r1 == 0) goto L4b
            po r3 = new po
            r3.<init>(r5)
            r0.g = r4
            r0.j = r2
            java.lang.Object r5 = r1.a(r3, r0)
            yj r0 = defpackage.yj.d
            if (r5 != r0) goto L4b
            return r0
        L4b:
            r5 = 0
            r4.y = r5
        L4e:
            r0 = 0
            r4.l1(r0)
            wz0 r4 = defpackage.wz0.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in0.bx(in0, ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bz(defpackage.in0 r6, defpackage.vn r7, defpackage.ki r8) {
        /*
            boolean r0 = r8 instanceof defpackage.lo
            if (r0 == 0) goto L13
            r0 = r8
            lo r0 = (defpackage.lo) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            lo r0 = new lo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.l
            r2 = 2
            r3 = 1
            yj r4 = defpackage.yj.d
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            qo r6 = r0.i
            vn r7 = r0.h
            in0 r0 = r0.g
            defpackage.i60.az(r8)
            goto L76
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r6)
            r6 = 0
            return r6
        L37:
            vn r7 = r0.h
            in0 r6 = r0.g
            defpackage.i60.az(r8)
            goto L5c
        L3f:
            defpackage.i60.az(r8)
            qo r8 = r6.y
            if (r8 == 0) goto L5c
            g80 r1 = r6.w
            if (r1 == 0) goto L5c
            po r5 = new po
            r5.<init>(r8)
            r0.g = r6
            r0.h = r7
            r0.l = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L5c
            goto L73
        L5c:
            qo r8 = new qo
            r8.<init>()
            g80 r1 = r6.w
            if (r1 == 0) goto L78
            r0.g = r6
            r0.h = r7
            r0.i = r8
            r0.l = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L74
        L73:
            return r4
        L74:
            r0 = r6
            r6 = r8
        L76:
            r8 = r6
            r6 = r0
        L78:
            r6.y = r8
            long r6 = r7.a
            wz0 r6 = defpackage.wz0.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in0.bz(in0, vn, ki):java.lang.Object");
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
