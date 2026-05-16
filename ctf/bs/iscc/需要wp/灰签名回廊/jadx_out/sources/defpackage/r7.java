package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends i70 implements l20, wo, so0, sg0, l70, ne0, b20, xv, ms, xs, zs, sd0, r9 {
    public h70 r;

    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        int i;
        h70 h70Var = this.r;
        h70Var.getClass();
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) h70Var;
        po0 po0Var2 = new po0();
        po0Var2.f = appendedSemanticsElement.a;
        appendedSemanticsElement.b.g(po0Var2);
        po0Var.getClass();
        q80 q80Var = po0Var.d;
        if (po0Var2.f) {
            po0Var.f = true;
        }
        if (po0Var2.g) {
            po0Var.g = true;
        }
        q80 q80Var2 = po0Var2.d;
        Object[] objArr = q80Var2.b;
        Object[] objArr2 = q80Var2.c;
        long[] jArr = q80Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        cp0 cp0Var = (cp0) obj;
                        if (!q80Var.b(cp0Var)) {
                            q80Var.l(cp0Var, obj2);
                        } else if (obj2 instanceof ah) {
                            Object objG = q80Var.g(cp0Var);
                            objG.getClass();
                            ah ahVar = (ah) objG;
                            i = i3;
                            String str = ahVar.a;
                            if (str == null) {
                                str = ((ah) obj2).a;
                            }
                            ov ovVar = ahVar.b;
                            if (ovVar == null) {
                                ovVar = ((ah) obj2).b;
                            }
                            q80Var.l(cp0Var, new ah(str, ovVar));
                        }
                        i = i3;
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        h70 h70Var = this.r;
        h70Var.getClass();
        return ((j20) h70Var).e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, s60.d, t60.d, 1), eh.b(0, i, 7)).e();
    }

    @Override // defpackage.xs
    public final void ak(vs vsVar) {
        h70 h70Var = this.r;
        sy.b("applyFocusProperties called on wrong node");
        h70Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ms
    public final void am(et etVar) {
        h70 h70Var = this.r;
        sy.b("onFocusEvent called on wrong node");
        h70Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.sg0
    public final boolean ap() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.sg0
    public final void aw() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.r9
    public final em b() {
        return pk.ay(this).z;
    }

    @Override // defpackage.ne0
    public final Object bb(Object obj) {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.wo
    public final void bc() {
        t1.ae(this);
    }

    @Override // defpackage.sg0
    public final boolean bd() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.i70
    public final void bm() {
        bu(true);
    }

    @Override // defpackage.i70
    public final void bn() {
        if (!this.q) {
            sy.b("unInitializeModifier called on unattached node");
        }
        if ((this.f & 8) != 0) {
            pk.az(this).y();
        }
    }

    public final void bu(boolean z) {
        if (!this.q) {
            sy.b("initializeModifier called on unattached node");
        }
        if ((this.f & 4) != 0 && !z) {
            pk.aw(this, 2).K();
        }
        if ((this.f & 2) != 0) {
            hu0 hu0Var = (hu0) pk.ay(this).ag.i;
            hu0Var.getClass();
            if (hu0Var.r) {
                fa0 fa0Var = this.k;
                fa0Var.getClass();
                ((n20) fa0Var).f0(this);
                rd0 rd0Var = fa0Var.al;
                if (rd0Var != null) {
                    ((lw) rd0Var).c();
                }
            }
            if (!z) {
                pk.aw(this, 2).K();
                pk.ay(this).aa();
            }
        }
        if ((this.f & 8) != 0) {
            pk.az(this).y();
        }
    }

    @Override // defpackage.r9
    public final long c() {
        return e00.an(pk.aw(this, 128).f);
    }

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        h70 h70Var = this.r;
        h70Var.getClass();
        ((vo) h70Var).d(u20Var);
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        h70 h70Var = this.r;
        h70Var.getClass();
        return ((j20) h70Var).e(r60Var, k60Var, j);
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        h70 h70Var = this.r;
        h70Var.getClass();
        return ((j20) h70Var).e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, s60.e, t60.d, 1), eh.b(0, i, 7)).e();
    }

    @Override // defpackage.r9
    public final e20 getLayoutDirection() {
        return pk.ay(this).aa;
    }

    @Override // defpackage.l70
    public final bw i() {
        return bw.aa;
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        h70 h70Var = this.r;
        h70Var.getClass();
        return ((j20) h70Var).e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, s60.e, t60.e, 1), eh.b(i, 0, 13)).c();
    }

    @Override // defpackage.xv
    public final void t(fa0 fa0Var) {
        this.r.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.r.toString();
    }

    @Override // defpackage.sd0
    public final boolean y() {
        return this.q;
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        h70 h70Var = this.r;
        h70Var.getClass();
        return ((j20) h70Var).e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, s60.d, t60.e, 1), eh.b(i, 0, 13)).c();
    }

    @Override // defpackage.ql, defpackage.sg0
    public final void a() {
    }

    @Override // defpackage.b20
    public final void o(d20 d20Var) {
    }

    @Override // defpackage.b20
    public final void s(long j) {
    }
}
