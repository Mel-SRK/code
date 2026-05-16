package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fg0 {
    public static final xs0 a = new xs0(ng.s);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c30 c30Var, j3 j3Var, ki kiVar) {
        dg0 dg0Var;
        if (kiVar instanceof dg0) {
            dg0Var = (dg0) kiVar;
            int i = dg0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg0Var.h = i - Integer.MIN_VALUE;
            } else {
                dg0Var = new dg0(kiVar);
            }
        }
        Object obj = dg0Var.g;
        int i2 = dg0Var.h;
        if (i2 != 0) {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                i60.az(obj);
                throw new xd();
            }
        }
        i60.az(obj);
        if (!c30Var.d.q) {
            wc.n("establishTextInputSession called from an unattached node");
            return;
        }
        b1 b1VarAz = pk.az(c30Var);
        a aVar = (a) pk.ay(c30Var).ac;
        aVar.getClass();
        if (d41.aj(aVar, a) != null) {
            wc.c();
        } else {
            dg0Var.h = 1;
            b(b1VarAz, j3Var, dg0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b1 b1Var, gv gvVar, ki kiVar) {
        eg0 eg0Var;
        if (kiVar instanceof eg0) {
            eg0Var = (eg0) kiVar;
            int i = eg0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                eg0Var.h = i - Integer.MIN_VALUE;
            } else {
                eg0Var = new eg0(kiVar);
            }
        }
        Object obj = eg0Var.g;
        int i2 = eg0Var.h;
        if (i2 == 0) {
            i60.az(obj);
            eg0Var.h = 1;
            b1Var.ag(gvVar, eg0Var);
        } else {
            if (i2 == 1) {
                i60.az(obj);
                throw new xd();
            }
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
            } else {
                i60.az(obj);
                throw new xd();
            }
        }
    }
}
