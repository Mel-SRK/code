package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class af {
    public ag[] d;
    public int e;
    public int f;
    public kt0 g;

    public final ag a() {
        ag agVarD;
        kt0 kt0Var;
        synchronized (this) {
            try {
                ag[] agVarArrE = this.d;
                if (agVarArrE == null) {
                    agVarArrE = e();
                    this.d = agVarArrE;
                } else if (this.e >= agVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(agVarArrE, agVarArrE.length * 2);
                    this.d = (ag[]) objArrCopyOf;
                    agVarArrE = (ag[]) objArrCopyOf;
                }
                int i = this.f;
                do {
                    agVarD = agVarArrE[i];
                    if (agVarD == null) {
                        agVarD = d();
                        agVarArrE[i] = agVarD;
                    }
                    i++;
                    if (i >= agVarArrE.length) {
                        i = 0;
                    }
                } while (!agVarD.a(this));
                this.f = i;
                this.e++;
                kt0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kt0Var != null) {
            kt0Var.w(1);
        }
        return agVarD;
    }

    public abstract ag d();

    public abstract ag[] e();

    public final void f(ag agVar) {
        kt0 kt0Var;
        int i;
        ji[] jiVarArrB;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                kt0Var = this.g;
                if (i2 == 0) {
                    this.f = 0;
                }
                agVar.getClass();
                jiVarArrB = agVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ji jiVar : jiVarArrB) {
            if (jiVar != null) {
                jiVar.h(wz0.a);
            }
        }
        if (kt0Var != null) {
            kt0Var.w(-1);
        }
    }

    public final kt0 g() {
        kt0 kt0Var;
        synchronized (this) {
            kt0Var = this.g;
            if (kt0Var == null) {
                int i = this.e;
                kt0Var = new kt0(1, Integer.MAX_VALUE, m9.e);
                kt0Var.q(Integer.valueOf(i));
                this.g = kt0Var;
            }
        }
        return kt0Var;
    }
}
