package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i70 implements ql {
    public ii e;
    public int f;
    public i70 h;
    public i70 i;
    public wa0 j;
    public fa0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public s0 p;
    public boolean q;
    public i70 d = this;
    public int g = -1;

    public final xj bi() {
        ii iiVar = this.e;
        if (iiVar != null) {
            return iiVar;
        }
        ii iiVarC = i60.c(pk.az(this).getCoroutineContext().j(new v00((t00) pk.az(this).getCoroutineContext().k(bw.ae))));
        this.e = iiVarC;
        return iiVarC;
    }

    public boolean bj() {
        return !(this instanceof jt);
    }

    public void bk() {
        if (this.q) {
            sy.b("node attached multiple times");
        }
        if (this.k == null) {
            sy.b("attach invoked on a node without a coordinator");
        }
        this.q = true;
        this.n = true;
    }

    public void bl() {
        if (!this.q) {
            sy.b("Cannot detach a node that is not attached");
        }
        if (this.n) {
            sy.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.o) {
            sy.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.q = false;
        ii iiVar = this.e;
        if (iiVar != null) {
            i60.o(iiVar, new m70("The Modifier.Node was detached", 0));
            this.e = null;
        }
    }

    public void bp() {
        if (!this.q) {
            sy.b("reset() called on an unattached node");
        }
        bo();
    }

    public void bq() {
        if (!this.q) {
            sy.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.n) {
            sy.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.n = false;
        bm();
        this.o = true;
    }

    public void br() {
        if (!this.q) {
            sy.b("node detached multiple times");
        }
        if (this.k == null) {
            sy.b("detach invoked on a node without a coordinator");
        }
        if (!this.o) {
            sy.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.o = false;
        s0 s0Var = this.p;
        if (s0Var != null) {
            s0Var.a();
        }
        bn();
    }

    public void bs(i70 i70Var) {
        this.d = i70Var;
    }

    public void bt(fa0 fa0Var) {
        this.k = fa0Var;
    }

    public void bm() {
    }

    public void bn() {
    }

    public void bo() {
    }
}
