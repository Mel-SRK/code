package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class m8 {
    public static final HashMap a = b(true);
    public static final HashMap b = b(false);
    public static final f4 c = f4.c;

    public static final void a(j70 j70Var, vf vfVar, int i) {
        vfVar.aw(-211209833);
        if ((((vfVar.f(j70Var) ? 4 : 2) | i) & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            int iHashCode = Long.hashCode(vfVar.ar);
            j70 j70VarAn = m10.an(vfVar, j70Var);
            a aVarL = vfVar.l();
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, jf.e, c);
            jo0.h(vfVar, jf.d, aVarL);
            jo0.h(vfVar, jf.c, j70VarAn);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var);
            }
            vfVar.q(true);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j(i, 1, j70Var);
        }
    }

    public static final HashMap b(boolean z) {
        HashMap map = new HashMap(9);
        c(map, z, bw.e);
        c(map, z, bw.f);
        c(map, z, bw.g);
        c(map, z, bw.h);
        c(map, z, bw.i);
        c(map, z, bw.j);
        c(map, z, bw.k);
        c(map, z, bw.l);
        c(map, z, bw.m);
        return map;
    }

    public static final void c(HashMap map, boolean z, b8 b8Var) {
        map.put(b8Var, new p8(b8Var, z));
    }

    public static final p60 d(b8 b8Var, boolean z) {
        p60 p60Var = (p60) (z ? a : b).get(b8Var);
        return p60Var == null ? new p8(b8Var, z) : p60Var;
    }
}
