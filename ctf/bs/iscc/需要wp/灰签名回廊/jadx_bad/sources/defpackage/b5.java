package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements o70 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public b5(o70 o70Var) {
        this.d = 1;
        this.e = o70Var;
        this.f = new y10();
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        switch (this.d) {
        }
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        switch (this.d) {
        }
        return pk.ab(this, ojVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.o70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(cv cvVar, ji jiVar) {
        pe0 pe0Var;
        boolean z;
        Object objS;
        switch (this.d) {
            case 0:
                z4 z4Var = (z4) this.f;
                la laVar = new la(1, f00.x(jiVar));
                laVar.t();
                a5 a5Var = new a5(laVar, this, cvVar);
                if (f00.h(z4Var.f, (Choreographer) this.e)) {
                    synchronized (z4Var.h) {
                        z4Var.j.add(a5Var);
                        if (!z4Var.m) {
                            z4Var.m = true;
                            z4Var.f.postFrameCallback(z4Var.n);
                        }
                        break;
                    }
                    laVar.v(new a2(5, z4Var, a5Var));
                } else {
                    ((Choreographer) this.e).postFrameCallback(a5Var);
                    laVar.v(new a2(6, this, a5Var));
                }
                return laVar.s();
            default:
                if (jiVar instanceof pe0) {
                    pe0Var = (pe0) jiVar;
                    int i = pe0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pe0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        pe0Var = new pe0(this, jiVar);
                    }
                }
                Object obj = pe0Var.h;
                yj yjVar = yj.d;
                int i2 = pe0Var.j;
                if (i2 == 0) {
                    i60.az(obj);
                    y10 y10Var = (y10) this.f;
                    pe0Var.g = cvVar;
                    pe0Var.j = 1;
                    synchronized (y10Var.a) {
                        z = y10Var.d;
                    }
                    if (z) {
                        objS = wz0.a;
                    } else {
                        la laVar2 = new la(1, f00.x(pe0Var));
                        laVar2.t();
                        synchronized (y10Var.a) {
                            y10Var.b.add(laVar2);
                        }
                        laVar2.v(new zv(1, y10Var, laVar2));
                        objS = laVar2.s();
                        if (objS != yjVar) {
                            objS = wz0.a;
                        }
                    }
                    if (objS != yjVar) {
                    }
                    return yjVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        i60.az(obj);
                        return obj;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cvVar = pe0Var.g;
                i60.az(obj);
                o70 o70Var = (o70) this.e;
                pe0Var.g = null;
                pe0Var.j = 2;
                Object objM = o70Var.m(cvVar, pe0Var);
                if (objM != yjVar) {
                    return objM;
                }
                return yjVar;
        }
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        switch (this.d) {
        }
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        switch (this.d) {
        }
        return pk.am(this, ojVar);
    }

    public b5(Choreographer choreographer, z4 z4Var) {
        this.d = 0;
        this.e = choreographer;
        this.f = z4Var;
    }
}
