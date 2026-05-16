package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class up extends i60 {
    public final /* synthetic */ vp q;

    public up(vp vpVar) {
        this.q = vpVar;
    }

    @Override // defpackage.i60
    public final void ar(Throwable th) {
        this.q.a.f(th);
    }

    @Override // defpackage.i60
    public final void as(a0 a0Var) {
        vp vpVar = this.q;
        vpVar.c = a0Var;
        a0 a0Var2 = vpVar.c;
        yp ypVar = vpVar.a;
        n31 n31Var = ypVar.g;
        zk zkVar = ypVar.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? gq.a() : az0.v();
        o6 o6Var = new o6();
        o6Var.a = n31Var;
        o6Var.b = a0Var2;
        o6Var.c = zkVar;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                o6Var.w(str, 0, str.length(), 1, true, new jq(str, 0));
            }
        }
        vpVar.b = o6Var;
        yp ypVar2 = vpVar.a;
        ArrayList arrayList = new ArrayList();
        ypVar2.a.writeLock().lock();
        try {
            ypVar2.c = 1;
            arrayList.addAll(ypVar2.b);
            ypVar2.b.clear();
            ypVar2.a.writeLock().unlock();
            ypVar2.d.post(new wp(arrayList, ypVar2.c, null));
        } catch (Throwable th) {
            ypVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
