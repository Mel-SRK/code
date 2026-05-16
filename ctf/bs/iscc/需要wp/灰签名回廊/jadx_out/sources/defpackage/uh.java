package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uh {
    public final pr0 a = new pr0();

    public static void b(uh uhVar, hi hiVar, boolean z, pu puVar) {
        uhVar.a.add(new te(262103052, true, new wb(hiVar, z, puVar)));
    }

    public final void a(rh rhVar, vf vfVar, int i) {
        vfVar.aw(1320309496);
        int i2 = (vfVar.f(rhVar) ? 4 : 2) | i | (vfVar.f(this) ? 32 : 16);
        if ((i2 & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else {
            pr0 pr0Var = this.a;
            int size = pr0Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((hv) pr0Var.get(i3)).c(rhVar, vfVar, Integer.valueOf(i2 & 14));
            }
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new y1(i, 3, this, rhVar);
        }
    }
}
