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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r11, long r13, defpackage.ki r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.u90
            if (r0 == 0) goto L14
            r0 = r15
            u90 r0 = (defpackage.u90) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            u90 r0 = new u90
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.g
            int r0 = r6.i
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2b
            defpackage.i60.az(r15)
            goto L8a
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r11)
            r11 = 0
            return r11
        L32:
            defpackage.i60.az(r15)
            goto L64
        L36:
            defpackage.i60.az(r15)
            java.lang.Object r15 = r10.a
            y90 r15 = (defpackage.y90) r15
            r0 = 0
            if (r15 == 0) goto L4b
            boolean r3 = r15.q
            if (r3 == 0) goto L4b
            sy0 r15 = defpackage.lI.g(r15)
            y90 r15 = (defpackage.y90) r15
            goto L4c
        L4b:
            r15 = r0
        L4c:
            r3 = 0
            yj r7 = defpackage.yj.d
            if (r15 != 0) goto L69
            java.lang.Object r15 = r10.b
            r1 = r15
            y90 r1 = (defpackage.y90) r1
            if (r1 == 0) goto L90
            r6.i = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.bv(r2, r4, r6)
            if (r15 != r7) goto L64
            goto L89
        L64:
            o01 r15 = (defpackage.o01) r15
            long r3 = r15.a
            goto L90
        L69:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            java.lang.Object r13 = r10.a
            y90 r13 = (defpackage.y90) r13
            if (r13 == 0) goto L7e
            boolean r14 = r13.q
            if (r14 == 0) goto L7e
            sy0 r13 = defpackage.lI.g(r13)
            r0 = r13
            y90 r0 = (defpackage.y90) r0
        L7e:
            if (r0 == 0) goto L8f
            r6.i = r1
            r1 = r0
            java.lang.Object r15 = r1.bv(r2, r4, r6)
            if (r15 != r7) goto L8a
        L89:
            return r7
        L8a:
            o01 r15 = (defpackage.o01) r15
            long r3 = r15.a
            goto L90
        L8f:
            r3 = r11
        L90:
            o01 r11 = new o01
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0.b(long, long, ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r5, defpackage.ki r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.v90
            if (r0 == 0) goto L13
            r0 = r7
            v90 r0 = (defpackage.v90) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            v90 r0 = new v90
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.i60.az(r7)
            goto L4e
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.i60.az(r7)
            java.lang.Object r7 = r4.a
            y90 r7 = (defpackage.y90) r7
            r1 = 0
            if (r7 == 0) goto L41
            boolean r3 = r7.q
            if (r3 == 0) goto L41
            sy0 r7 = defpackage.lI.g(r7)
            r1 = r7
            y90 r1 = (defpackage.y90) r1
        L41:
            if (r1 == 0) goto L53
            r0.i = r2
            java.lang.Object r7 = r1.bx(r5, r0)
            yj r5 = defpackage.yj.d
            if (r7 != r5) goto L4e
            return r5
        L4e:
            o01 r7 = (defpackage.o01) r7
            long r5 = r7.a
            goto L55
        L53:
            r5 = 0
        L55:
            o01 r7 = new o01
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0.c(long, ki):java.lang.Object");
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
