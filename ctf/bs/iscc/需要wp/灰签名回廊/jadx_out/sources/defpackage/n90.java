package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n90 {
    public int e;
    public m90 f;
    public final ps0 a = i60.e(o90.k);
    public final fi0 b = new fi0(i60.e(new l90()));
    public final z6 c = new z6();
    public final z6 d = new z6();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();

    public final void a(k90 k90Var, m90 m90Var, int i) {
        k90Var.getClass();
        if (m90Var.a == null) {
            (i != 0 ? i != 1 ? this.g : this.h : this.i).add(m90Var);
            m90Var.a = k90Var;
            ((l90) this.b.d.getValue()).getClass();
            m90Var.b();
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(m90Var);
        k90 k90Var2 = m90Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(k90Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        Iterator it = this.c.iterator();
        if (!it.hasNext()) {
            it = this.d.iterator();
            if (!it.hasNext()) {
                return;
            }
        }
        it.next().getClass();
        wc.c();
    }
}
