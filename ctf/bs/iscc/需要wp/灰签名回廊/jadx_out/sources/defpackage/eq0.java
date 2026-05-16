package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq0 {
    public static final xs0 a = new xs0(ng.x);

    public static final aq0 a(int i, vf vfVar) {
        dq0 dq0Var = (dq0) vfVar.j(a);
        switch (n5.n(i)) {
            case 0:
                return dq0Var.e;
            case 1:
                return b(dq0Var.e);
            case 2:
                return dq0Var.a;
            case 3:
                return b(dq0Var.a);
            case 4:
                return al0.a;
            case 5:
                return dq0Var.d;
            case 6:
                zk0 zk0Var = dq0Var.d;
                float f = (float) 0.0d;
                return zk0.b(zk0Var, new nn(f), null, new nn(f), 6);
            case 7:
                return b(dq0Var.d);
            case MainActivity.$stable /* 8 */:
                return dq0Var.c;
            case 9:
                return f00.i;
            case 10:
                return dq0Var.b;
            default:
                wc.l();
                return null;
        }
    }

    public static final zk0 b(zk0 zk0Var) {
        float f = (float) 0.0d;
        return zk0.b(zk0Var, null, new nn(f), new nn(f), 3);
    }
}
