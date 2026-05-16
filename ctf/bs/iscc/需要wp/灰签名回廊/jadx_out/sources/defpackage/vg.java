package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vg extends o9 {
    public final m9 n;

    public vg(int i, m9 m9Var) {
        super(i);
        this.n = m9Var;
        if (m9Var == m9.d) {
            wc.j("This implementation does not support suspension for senders, use ", yi0.a(o9.class).a(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        wc.i("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object af(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            m9 r1 = r15.n
            m9 r2 = defpackage.m9.f
            wz0 r8 = defpackage.wz0.a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.u(r16)
            boolean r2 = r1 instanceof defpackage.jb
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof defpackage.ib
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            jq r6 = defpackage.q9.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.o9.i
            java.lang.Object r1 = r1.get(r15)
            kb r1 = (defpackage.kb) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.o9.e
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.t(r2, r7)
            int r9 = defpackage.q9.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            kb r2 = defpackage.o9.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.o9.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb6
            r3 = 1
            if (r12 == r3) goto Lb5
            r3 = 2
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.o9.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        L88:
            java.lang.String r1 = "unexpected"
            defpackage.wc.q(r1)
            r1 = 0
            return r1
        L8f:
            if (r7 == 0) goto L9e
            r1.h()
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        L9e:
            boolean r3 = r6 instanceof defpackage.w11
            if (r3 == 0) goto La5
            w11 r6 = (defpackage.w11) r6
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lad
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lad:
            long r3 = r1.c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.j(r3)
        Lb5:
            return r8
        Lb6:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.af(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.o9, defpackage.lp0
    public final Object c(ji jiVar, Object obj) throws Throwable {
        if (af(obj, true) instanceof ib) {
            throw p();
        }
        return wz0.a;
    }

    @Override // defpackage.o9, defpackage.lp0
    public final Object u(Object obj) {
        return af(obj, false);
    }

    @Override // defpackage.o9
    public final boolean v() {
        return this.n == m9.e;
    }
}
