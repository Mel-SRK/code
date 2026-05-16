package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 {
    public final po0 a;
    public final f80 b;

    public vo0(uo0 uo0Var, nz nzVar) {
        this.a = uo0Var.d;
        this.b = new f80(uo0.j(4, uo0Var).size());
        List listJ = uo0.j(4, uo0Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            uo0 uo0Var2 = (uo0) listJ.get(i);
            if (nzVar.a(uo0Var2.g)) {
                this.b.a(uo0Var2.g);
            }
        }
    }
}
