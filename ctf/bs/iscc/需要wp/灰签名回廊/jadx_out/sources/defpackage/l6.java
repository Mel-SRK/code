package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class l6 extends SegmentFinder {
    public final /* synthetic */ f1 a;

    public l6(f1 f1Var) {
        this.a = f1Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.g(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.j(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.k(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.f(i);
    }
}
