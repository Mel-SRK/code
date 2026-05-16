package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements r60, a00 {
    public final /* synthetic */ a00 d;
    public final e20 e;

    public l00(a00 a00Var, e20 e20Var) {
        this.d = a00Var;
        this.e = e20Var;
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

    @Override // defpackage.a00
    public final e20 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.em
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.r60
    public final q60 m(int i, int i2, Map map, a2 a2Var, cv cvVar) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            sy.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new k00(i, i2, map, a2Var);
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
