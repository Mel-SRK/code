package androidx.compose.foundation;

import defpackage.g80;
import defpackage.hv;
import defpackage.j70;
import defpackage.my;
import defpackage.nf;
import defpackage.pu;
import defpackage.vf;
import defpackage.x10;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x10 implements hv {
    public final /* synthetic */ my e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ pu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(my myVar, boolean z, String str, pu puVar) {
        super(3);
        this.e = myVar;
        this.f = z;
        this.g = str;
        this.h = puVar;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        vfVar.av(-1525724089);
        Object objAk = vfVar.ak();
        if (objAk == nf.a) {
            objAk = new g80();
            vfVar.be(objAk);
        }
        g80 g80Var = (g80) objAk;
        j70 j70VarC = c.a(g80Var, this.e).c(new ClickableElement(g80Var, null, this.f, this.g, this.h));
        vfVar.q(false);
        return j70VarC;
    }
}
