package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y8 extends i70 implements r8, b20, sy0 {
    public static final n31 t = new n31(8);
    public lh r;
    public boolean s;

    public static final ri0 bu(y8 y8Var, fa0 fa0Var, pu puVar) {
        ri0 ri0Var;
        if (y8Var.q && y8Var.s) {
            fa0 fa0VarAx = pk.ax(y8Var);
            if (!fa0Var.D().q) {
                fa0Var = null;
            }
            if (fa0Var != null && (ri0Var = (ri0) puVar.a()) != null) {
                ri0 ri0VarAk = fa0VarAx.ak(fa0Var, false);
                return ri0Var.g((((long) Float.floatToRawIntBits(ri0VarAk.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(ri0VarAk.a)) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.r8
    public final Object l(fa0 fa0Var, pu puVar, ki kiVar) {
        Object objY = i60.y(new x8(this, fa0Var, puVar, new p7(this, fa0Var, puVar), null), kiVar);
        return objY == yj.d ? objY : wz0.a;
    }

    @Override // defpackage.b20
    public final void o(d20 d20Var) {
        this.s = true;
    }

    @Override // defpackage.sy0
    public final Object p() {
        return t;
    }
}
