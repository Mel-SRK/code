package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements j7, m01 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public a0(Typeface typeface, a70 a70Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = a70Var;
        this.c = new b70(1024);
        int iA = a70Var.a(6);
        if (iA != 0) {
            int i5 = iA + a70Var.d;
            i = ((ByteBuffer) a70Var.g).getInt(((ByteBuffer) a70Var.g).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = a70Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + a70Var.d;
            i2 = ((ByteBuffer) a70Var.g).getInt(((ByteBuffer) a70Var.g).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            kz0 kz0Var = new kz0(this, i7);
            z60 z60VarB = kz0Var.b();
            int iA3 = z60VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) z60VarB.g).getInt(iA3 + z60VarB.d) : 0, (char[]) this.b, i7 * 2);
            z60 z60VarB2 = kz0Var.b();
            int iA4 = z60VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + z60VarB2.d;
                i3 = ((ByteBuffer) z60VarB2.g).getInt(((ByteBuffer) z60VarB2.g).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                wc.n("invalid metadata codepoint length");
                throw null;
            }
            b70 b70Var = (b70) this.c;
            z60 z60VarB3 = kz0Var.b();
            int iA5 = z60VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + z60VarB3.d;
                i4 = ((ByteBuffer) z60VarB3.g).getInt(((ByteBuffer) z60VarB3.g).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            b70Var.a(kz0Var, 0, i4 - 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(long j, long j2, ki kiVar) {
        u90 u90Var;
        long j3;
        if (kiVar instanceof u90) {
            u90Var = (u90) kiVar;
            int i = u90Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                u90Var.i = i - Integer.MIN_VALUE;
            } else {
                u90Var = new u90(this, kiVar);
            }
        }
        u90 u90Var2 = u90Var;
        Object objBv = u90Var2.g;
        int i2 = u90Var2.i;
        if (i2 == 0) {
            i60.az(objBv);
            y90 y90Var = (y90) this.a;
            y90 y90Var2 = null;
            y90 y90Var3 = (y90Var == null || !y90Var.q) ? null : (y90) lI.g(y90Var);
            j3 = 0;
            yj yjVar = yj.d;
            if (y90Var3 == null) {
                y90 y90Var4 = (y90) this.b;
                if (y90Var4 != null) {
                    u90Var2.i = 1;
                    objBv = y90Var4.bv(j, j2, u90Var2);
                }
            } else {
                y90 y90Var5 = (y90) this.a;
                if (y90Var5 != null && y90Var5.q) {
                    y90Var2 = (y90) lI.g(y90Var5);
                }
                if (y90Var2 != null) {
                    u90Var2.i = 2;
                    objBv = y90Var2.bv(j, j2, u90Var2);
                } else {
                    j3 = 0;
                }
            }
        } else if (i2 == 1) {
            i60.az(objBv);
            j3 = ((o01) objBv).a;
        } else {
            if (i2 != 2) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(objBv);
            j3 = ((o01) objBv).a;
        }
        return new o01(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(long j, ki kiVar) {
        v90 v90Var;
        long j2;
        if (kiVar instanceof v90) {
            v90Var = (v90) kiVar;
            int i = v90Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                v90Var.i = i - Integer.MIN_VALUE;
            } else {
                v90Var = new v90(this, kiVar);
            }
        }
        Object objBx = v90Var.g;
        int i2 = v90Var.i;
        if (i2 == 0) {
            i60.az(objBx);
            y90 y90Var = (y90) this.a;
            y90 y90Var2 = null;
            if (y90Var != null && y90Var.q) {
                y90Var2 = (y90) lI.g(y90Var);
            }
            if (y90Var2 == null) {
                j2 = 0;
                return new o01(j2);
            }
            v90Var.i = 1;
            objBx = y90Var2.bx(j, v90Var);
            yj yjVar = yj.d;
            if (objBx == yjVar) {
                return yjVar;
            }
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(objBx);
        }
        j2 = ((o01) objBx).a;
        return new o01(j2);
    }

    public w5 d(long j, w5 w5Var, w5 w5Var2) {
        if (((w5) this.c) == null) {
            this.c = w5Var.c();
        }
        w5 w5Var3 = (w5) this.c;
        if (w5Var3 == null) {
            f00.ag("velocityVector");
            throw null;
        }
        int iB = w5Var3.b();
        int i = 0;
        while (true) {
            w5 w5Var4 = (w5) this.c;
            if (i >= iB) {
                if (w5Var4 != null) {
                    return w5Var4;
                }
                f00.ag("velocityVector");
                throw null;
            }
            if (w5Var4 == null) {
                f00.ag("velocityVector");
                throw null;
            }
            bu buVar = (bu) this.a;
            w5Var.getClass();
            long j2 = j / 1000000;
            qr qrVarA = ((rr) buVar.e).a(w5Var2.a(i));
            long j3 = qrVarA.c;
            w5Var4.e((((Math.signum(qrVarA.a) * y2.a(j3 > 0 ? j2 / j3 : 1.0f).b) * qrVarA.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    @Override // defpackage.l01
    public w5 i(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        if (((w5) this.c) == null) {
            this.c = w5Var3.c();
        }
        w5 w5Var4 = (w5) this.c;
        if (w5Var4 == null) {
            f00.ag("velocityVector");
            throw null;
        }
        int iB = w5Var4.b();
        int i = 0;
        while (true) {
            w5 w5Var5 = (w5) this.c;
            if (i >= iB) {
                if (w5Var5 != null) {
                    return w5Var5;
                }
                f00.ag("velocityVector");
                throw null;
            }
            if (w5Var5 == null) {
                f00.ag("velocityVector");
                throw null;
            }
            w5Var5.e(((bu) this.a).g(i).c(j, w5Var.a(i), w5Var2.a(i), w5Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.l01
    public w5 k(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        if (((w5) this.b) == null) {
            this.b = w5Var.c();
        }
        w5 w5Var4 = (w5) this.b;
        if (w5Var4 == null) {
            f00.ag("valueVector");
            throw null;
        }
        int iB = w5Var4.b();
        int i = 0;
        while (true) {
            w5 w5Var5 = (w5) this.b;
            if (i >= iB) {
                if (w5Var5 != null) {
                    return w5Var5;
                }
                f00.ag("valueVector");
                throw null;
            }
            if (w5Var5 == null) {
                f00.ag("valueVector");
                throw null;
            }
            w5Var5.e(((bu) this.a).g(i).b(j, w5Var.a(i), w5Var2.a(i), w5Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.l01
    public w5 l(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        if (((w5) this.d) == null) {
            this.d = w5Var3.c();
        }
        w5 w5Var4 = (w5) this.d;
        if (w5Var4 == null) {
            f00.ag("endVelocityVector");
            throw null;
        }
        int iB = w5Var4.b();
        int i = 0;
        while (true) {
            w5 w5Var5 = (w5) this.d;
            if (i >= iB) {
                if (w5Var5 != null) {
                    return w5Var5;
                }
                f00.ag("endVelocityVector");
                throw null;
            }
            if (w5Var5 == null) {
                f00.ag("endVelocityVector");
                throw null;
            }
            w5Var5.e(((bu) this.a).g(i).e(w5Var.a(i), w5Var2.a(i), w5Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.l01
    public long n(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        Iterator it = i60.bb(0, w5Var.b()).iterator();
        long jMax = 0;
        while (true) {
            rz rzVar = (rz) it;
            if (!rzVar.f) {
                return jMax;
            }
            int iNextInt = rzVar.nextInt();
            jMax = Math.max(jMax, ((bu) this.a).g(iNextInt).d(w5Var.a(iNextInt), w5Var2.a(iNextInt), w5Var3.a(iNextInt)));
        }
    }

    public /* synthetic */ a0(Object obj) {
        this.a = obj;
    }

    public a0(ur urVar) {
        this(new bu(29, urVar));
    }
}
