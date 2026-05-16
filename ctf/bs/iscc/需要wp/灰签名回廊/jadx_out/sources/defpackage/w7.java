package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w7 {
    static {
        float f = 40;
        i60.d(f, f);
    }

    public static final void a(String str, cv cvVar, j70 j70Var, boolean z, nx0 nx0Var, t10 t10Var, s10 s10Var, boolean z2, int i, int i2, g11 g11Var, cv cvVar2, g80 g80Var, vr0 vr0Var, te teVar, vf vfVar, int i3) {
        cv cvVar3;
        cv cvVar4;
        vfVar.aw(945255183);
        int i4 = i3 | (vfVar.f(str) ? 4 : 2) | (vfVar.h(cvVar) ? 32 : 16) | (vfVar.f(j70Var) ? 256 : 128) | (vfVar.g(z) ? 2048 : 1024) | (vfVar.g(false) ? 16384 : 8192) | (vfVar.f(nx0Var) ? 131072 : 65536) | (vfVar.f(t10Var) ? 1048576 : 524288) | (vfVar.f(s10Var) ? 8388608 : 4194304) | (vfVar.g(z2) ? 67108864 : 33554432) | (vfVar.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (vfVar.d(i2) ? 4 : 2) | (vfVar.f(g11Var) ? 32 : 16) | 384 | (vfVar.f(g80Var) ? 2048 : 1024) | (vfVar.f(vr0Var) ? 16384 : 8192);
        if ((306783379 & i4) == 306783378 && (i5 & 74899) == 74898 && vfVar.z()) {
            vfVar.aq();
            cvVar4 = cvVar2;
        } else {
            vfVar.as();
            if ((i3 & 1) == 0 || vfVar.x()) {
                cvVar3 = q0.o;
            } else {
                vfVar.aq();
                cvVar3 = cvVar2;
            }
            vfVar.r();
            Object objAk = vfVar.ak();
            Object obj = nf.a;
            if (objAk == obj) {
                objAk = bo0.m(new lw0(str, 0L, 6));
                vfVar.be(objAk);
            }
            w80 w80Var = (w80) objAk;
            lw0 lw0Var = (lw0) w80Var.getValue();
            lw0 lw0Var2 = new lw0(new b6(str), lw0Var.b, lw0Var.c);
            boolean zF = vfVar.f(lw0Var2);
            Object objAk2 = vfVar.ak();
            if (zF || objAk2 == obj) {
                objAk2 = new s0(3, lw0Var2, w80Var);
                vfVar.be(objAk2);
            }
            pk.i((pu) objAk2, vfVar);
            boolean z3 = (i4 & 14) == 4;
            Object objAk3 = vfVar.ak();
            if (z3 || objAk3 == obj) {
                objAk3 = bo0.m(str);
                vfVar.be(objAk3);
            }
            Object obj2 = (w80) objAk3;
            int i6 = t10Var.a;
            u10 u10Var = new u10(i6);
            if (i6 == 0) {
                u10Var = null;
            }
            ey eyVar = new ey(z2, 0, true, u10Var != null ? u10Var.a : 1, 1, t40.f);
            boolean z4 = !z2;
            cvVar4 = cvVar3;
            int i7 = z2 ? 1 : i2;
            int i8 = z2 ? 1 : i;
            boolean zF2 = ((i4 & 112) == 32) | vfVar.f(obj2);
            Object objAk4 = vfVar.ak();
            if (zF2 || objAk4 == obj) {
                objAk4 = new g5(cvVar, w80Var, obj2, 1);
                vfVar.be(objAk4);
            }
            int i9 = i5 << 9;
            az0.c(lw0Var2, (cv) objAk4, j70Var, nx0Var, g11Var, cvVar4, g80Var, vr0Var, z4, i8, i7, eyVar, s10Var, z, teVar, vfVar, (i4 & 896) | ((i4 >> 6) & 7168) | (i9 & 57344) | 196608 | (3670016 & i9) | (i9 & 29360128), ((i4 >> 15) & 896) | (i4 & 7168) | (i4 & 57344) | 196608);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new v7(str, cvVar, j70Var, z, nx0Var, t10Var, s10Var, z2, i, i2, g11Var, cvVar4, g80Var, vr0Var, teVar, i3);
        }
    }
}
