package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements s30 {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final Object f;

    public jl(t30 t30Var) {
        this.e = t30Var;
        vb vbVar = vb.c;
        Class<?> cls = t30Var.getClass();
        tb tbVar = (tb) vbVar.a.get(cls);
        this.f = tbVar == null ? vbVar.a(cls, null) : tbVar;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        switch (this.d) {
            case 0:
                gl glVar = (gl) this.e;
                switch (hl.a[n30Var.ordinal()]) {
                    case 1:
                        glVar.getClass();
                        break;
                    case 2:
                        glVar.b(u30Var);
                        break;
                    case 3:
                        glVar.c(u30Var);
                        break;
                    case 4:
                        glVar.getClass();
                        break;
                    case 5:
                        glVar.a(u30Var);
                        break;
                    case 6:
                        glVar.getClass();
                        break;
                    case 7:
                        wc.n("ON_ANY must not been send by anybody");
                        break;
                    default:
                        wc.l();
                        break;
                }
                s30 s30Var = (s30) this.f;
                if (s30Var != null) {
                    s30Var.d(u30Var, n30Var);
                }
                break;
            case 1:
                if (n30Var == n30.ON_START) {
                    ((p30) this.e).b(this);
                    ((bm0) this.f).c();
                }
                break;
            default:
                HashMap map = ((tb) this.f).a;
                List list = (List) map.get(n30Var);
                Object obj = this.e;
                tb.a(list, u30Var, n30Var, obj);
                tb.a((List) map.get(n30.ON_ANY), u30Var, n30Var, obj);
                break;
        }
    }

    public jl(gl glVar, s30 s30Var) {
        glVar.getClass();
        this.e = glVar;
        this.f = s30Var;
    }

    public jl(p30 p30Var, bm0 bm0Var) {
        this.e = p30Var;
        this.f = bm0Var;
    }
}
