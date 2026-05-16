package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends i70 implements l20 {
    public ym0 r;
    public boolean s;

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        return this.s ? k60Var.ap(Integer.MAX_VALUE) : k60Var.ap(i);
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        boolean z = this.s;
        wc0 wc0Var = wc0.d;
        if ((z ? wc0Var : wc0.e) == wc0Var) {
            if (dh.g(j) == Integer.MAX_VALUE) {
                wc.q("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
                return null;
            }
        } else if (dh.h(j) == Integer.MAX_VALUE) {
            wc.q("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            return null;
        }
        lf0 lf0VarE = k60Var.e(dh.a(j, 0, this.s ? dh.h(j) : Integer.MAX_VALUE, 0, this.s ? Integer.MAX_VALUE : dh.g(j), 5));
        int i = lf0VarE.d;
        int iH = dh.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = lf0VarE.e;
        int iG = dh.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = lf0VarE.e - i2;
        int i4 = lf0VarE.d - i;
        if (!this.s) {
            i3 = i4;
        }
        ym0 ym0Var = this.r;
        je0 je0Var = ym0Var.d;
        je0 je0Var2 = ym0Var.a;
        je0Var.h(i3);
        xq0 xq0Var = (xq0) fr0.b.n();
        cv cvVarE = xq0Var != null ? xq0Var.e() : null;
        xq0 xq0VarN = q6.n(xq0Var);
        try {
            if (je0Var2.g() > i3) {
                je0Var2.h(i3);
            }
            q6.q(xq0Var, xq0VarN, cvVarE);
            this.r.b.h(this.s ? i2 : i);
            return r60Var.av(i, i2, sq.d, new kn0(this, i3, lf0VarE));
        } catch (Throwable th) {
            q6.q(xq0Var, xq0VarN, cvVarE);
            throw th;
        }
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        return this.s ? k60Var.aw(Integer.MAX_VALUE) : k60Var.aw(i);
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        return this.s ? k60Var.f(i) : k60Var.f(Integer.MAX_VALUE);
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        return this.s ? k60Var.ax(i) : k60Var.ax(Integer.MAX_VALUE);
    }
}
