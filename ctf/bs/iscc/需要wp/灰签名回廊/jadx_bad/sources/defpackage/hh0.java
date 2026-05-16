package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hh0 implements em {
    public final /* synthetic */ em d;
    public boolean e;
    public boolean f;
    public final i90 g = new i90();

    public hh0(em emVar) {
        this.d = emVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ki kiVar) {
        fh0 fh0Var;
        hh0 hh0Var;
        if (kiVar instanceof fh0) {
            fh0Var = (fh0) kiVar;
            int i = fh0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                fh0Var.j = i - Integer.MIN_VALUE;
            } else {
                fh0Var = new fh0(this, kiVar);
            }
        }
        Object obj = fh0Var.h;
        int i2 = fh0Var.j;
        if (i2 == 0) {
            i60.az(obj);
            fh0Var.g = this;
            fh0Var.j = 1;
            Object objC = this.g.c(fh0Var);
            yj yjVar = yj.d;
            if (objC == yjVar) {
                return yjVar;
            }
            hh0Var = this;
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hh0Var = fh0Var.g;
            i60.az(obj);
        }
        hh0Var.e = false;
        hh0Var.f = false;
        return wz0.a;
    }

    @Override // defpackage.em
    public final float ae(long j) {
        return this.d.ae(j);
    }

    @Override // defpackage.em
    public final int ai(float f) {
        return this.d.ai(f);
    }

    @Override // defpackage.em
    public final long aq(long j) {
        return this.d.aq(j);
    }

    @Override // defpackage.em
    public final float au(long j) {
        return this.d.au(j);
    }

    @Override // defpackage.em
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.em
    public final long ba(float f) {
        return this.d.ba(f);
    }

    @Override // defpackage.em
    public final float be(int i) {
        return this.d.be(i);
    }

    @Override // defpackage.em
    public final float bg(float f) {
        return this.d.bg(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ki kiVar) {
        gh0 gh0Var;
        hh0 hh0Var;
        if (kiVar instanceof gh0) {
            gh0Var = (gh0) kiVar;
            int i = gh0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                gh0Var.j = i - Integer.MIN_VALUE;
            } else {
                gh0Var = new gh0(this, kiVar);
            }
        }
        Object obj = gh0Var.h;
        int i2 = gh0Var.j;
        if (i2 == 0) {
            i60.az(obj);
            if (this.e || this.f) {
                hh0Var = this;
                return Boolean.valueOf(hh0Var.e);
            }
            gh0Var.g = this;
            gh0Var.j = 1;
            Object objC = this.g.c(gh0Var);
            yj yjVar = yj.d;
            if (objC == yjVar) {
                return yjVar;
            }
            hh0Var = this;
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hh0Var = gh0Var.g;
            i60.az(obj);
        }
        hh0Var.g.d(null);
        return Boolean.valueOf(hh0Var.e);
    }

    @Override // defpackage.em
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.em
    public final long v(float f) {
        return this.d.v(f);
    }

    @Override // defpackage.em
    public final long w(long j) {
        return this.d.w(j);
    }

    @Override // defpackage.em
    public final float x(float f) {
        return this.d.x(f);
    }
}
