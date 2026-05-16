package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w60 {
    public final ce a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public w60(ce ceVar) {
        this.a = ceVar;
    }

    public final void a() {
        this.b.remove((Object) null);
        v60 v60Var = (v60) this.c.remove(null);
        if (v60Var != null) {
            v60Var.a.b(v60Var.b);
            v60Var.b = null;
        }
        this.a.run();
    }
}
