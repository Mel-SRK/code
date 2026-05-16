package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yb extends rl implements sg0, o10, ms, so0, sy0 {
    public static final n31 aj = new n31(1);
    public zt0 aa;
    public ql ab;
    public jh0 ac;
    public wx ad;
    public g80 ag;
    public boolean ah;
    public final n31 ai;
    public g80 t;
    public qy u;
    public String v;
    public boolean w;
    public pu x;
    public final lt z;
    public final jt y = new jt();
    public final LinkedHashMap ae = new LinkedHashMap();
    public long af = 0;

    public yb(g80 g80Var, qy qyVar, boolean z, String str, pu puVar) {
        this.t = g80Var;
        this.u = qyVar;
        this.v = str;
        this.w = z;
        this.x = puVar;
        this.z = new lt(g80Var);
        g80 g80Var2 = this.t;
        this.ag = g80Var2;
        this.ah = g80Var2 == null && this.u != null;
        this.ai = aj;
    }

    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.af = d41.h((int) (j2 >> 32), (int) (j2 & 4294967295L));
        bz();
        ji jiVar = null;
        if (this.w && jg0Var == jg0.e) {
            int i = ig0Var.c;
            if (i == 4) {
                i60.an(bi(), null, new g(this, jiVar, 0), 3);
            } else if (i == 5) {
                i60.an(bi(), null, new g(this, jiVar, 1), 3);
            }
        }
        if (this.aa == null) {
            c cVar = new c(this, jiVar, 2);
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
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        String str = this.v;
        b bVar = new b(0, this);
        i10[] i10VarArr = bp0.a;
        po0Var.d(oo0.b, new ah(str, bVar));
        if (this.w) {
            this.z.ag(po0Var);
        } else {
            po0Var.d(zo0.i, wz0.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // defpackage.o10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean al(KeyEvent keyEvent) {
        int iAa;
        bz();
        boolean z = this.w;
        int i = 0;
        int i2 = 1;
        ji jiVar = null;
        LinkedHashMap linkedHashMap = this.ae;
        if (z) {
            int i3 = zb.b;
            if (m10.ad(keyEvent) == 2 && ((iAa = (int) (m10.aa(keyEvent) >> 32)) == 23 || iAa == 66 || iAa == 160)) {
                if (!linkedHashMap.containsKey(new k10(e00.g(keyEvent.getKeyCode())))) {
                    jh0 jh0Var = new jh0(this.af);
                    linkedHashMap.put(new k10(e00.g(keyEvent.getKeyCode())), jh0Var);
                    if (this.t != null) {
                        i60.an(bi(), null, new f(this, jh0Var, jiVar, i), 3);
                    }
                    return true;
                }
            } else if (this.w) {
                int i4 = zb.b;
                if (m10.ad(keyEvent) == 1) {
                    int iAa2 = (int) (m10.aa(keyEvent) >> 32);
                    if (iAa2 != 23 && iAa2 != 66 && iAa2 != 160) {
                        return false;
                    }
                    jh0 jh0Var2 = (jh0) linkedHashMap.remove(new k10(e00.g(keyEvent.getKeyCode())));
                    if (jh0Var2 != null && this.t != null) {
                        i60.an(bi(), null, new f(this, jh0Var2, jiVar, i2), 3);
                    }
                    this.x.a();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ms
    public final void am(et etVar) {
        if (etVar.a()) {
            bz();
        }
        if (this.w) {
            this.z.am(etVar);
        }
    }

    @Override // defpackage.sg0
    public final void aw() {
        wx wxVar;
        g80 g80Var = this.t;
        if (g80Var != null && (wxVar = this.ad) != null) {
            g80Var.b(new xx(wxVar));
        }
        this.ad = null;
        zt0 zt0Var = this.aa;
        if (zt0Var != null) {
            zt0Var.aw();
        }
    }

    @Override // defpackage.so0
    public final boolean az() {
        return true;
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.i70
    public final void bm() {
        if (!this.ah) {
            bz();
        }
        if (this.w) {
            bu(this.y);
            bu(this.z);
        }
    }

    @Override // defpackage.i70
    public final void bn() {
        bx();
        if (this.ag == null) {
            this.t = null;
        }
        ql qlVar = this.ab;
        if (qlVar != null) {
            bv(qlVar);
        }
        this.ab = null;
    }

    public final void bx() {
        g80 g80Var = this.t;
        LinkedHashMap linkedHashMap = this.ae;
        if (g80Var != null) {
            jh0 jh0Var = this.ac;
            if (jh0Var != null) {
                g80Var.b(new ih0(jh0Var));
            }
            wx wxVar = this.ad;
            if (wxVar != null) {
                g80Var.b(new xx(wxVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                g80Var.b(new ih0((jh0) it.next()));
            }
        }
        this.ac = null;
        this.ad = null;
        linkedHashMap.clear();
    }

    public final void bz() {
        qy qyVar;
        if (this.ab == null && (qyVar = this.u) != null) {
            if (this.t == null) {
                this.t = new g80();
            }
            this.z.bx(this.t);
            g80 g80Var = this.t;
            g80Var.getClass();
            ql qlVarB = qyVar.b(g80Var);
            bu(qlVarB);
            this.ab = qlVarB;
        }
    }

    @Override // defpackage.o10
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.sy0
    public final Object p() {
        return this.ai;
    }
}
