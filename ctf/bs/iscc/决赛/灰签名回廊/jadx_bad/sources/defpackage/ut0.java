package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ut0 implements PointerInputEventHandler, pv {
    public final /* synthetic */ gv a;

    public ut0(gv gvVar) {
        this.a = gvVar;
    }

    @Override // defpackage.pv
    public final ov b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof pv)) {
            return false;
        }
        return f00.h(this.a, ((pv) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(tg0 tg0Var, ji jiVar) {
        return this.a.f(tg0Var, jiVar);
    }
}
